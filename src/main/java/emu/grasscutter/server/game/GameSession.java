package emu.grasscutter.server.game;

import static emu.grasscutter.config.Configuration.*;
import static emu.grasscutter.utils.lang.Language.translate;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.Grasscutter.ServerDebugMode;
import emu.grasscutter.game.Account;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.server.event.game.SendPacketEvent;
import emu.grasscutter.utils.*;
import io.netty.buffer.*;
import java.io.File;
import java.net.InetSocketAddress;
import java.nio.file.Path;
import lombok.*;

public class GameSession implements GameSessionManager.KcpChannel {
    private final GameServer server;
    private GameSessionManager.KcpTunnel tunnel;

    @Getter @Setter private Account account;
    @Getter private Player player;

    @Getter private long encryptSeed = Crypto.ENCRYPT_SEED;
    private byte[] encryptKey = Crypto.ENCRYPT_KEY;

    @Setter private boolean useSecretKey;
    @Getter @Setter private SessionState state;

    @Getter private int clientTime;
    @Getter private long lastPingTime;
    private int lastClientSeq = 10;

    public GameSession(GameServer server) {
        this.server = server;
        this.state = SessionState.WAITING_FOR_TOKEN;
        this.lastPingTime = System.currentTimeMillis();

        if (GAME_INFO.useUniquePacketKey) {
            this.encryptKey = new byte[4096];
            this.encryptSeed = Crypto.generateEncryptKeyAndSeed(this.encryptKey);
        }
    }

    public GameServer getServer() {
        return server;
    }

    public InetSocketAddress getAddress() {
        try {
            return tunnel.getAddress();
        } catch (Throwable ignore) {
            return null;
        }
    }

    public boolean useSecretKey() {
        return useSecretKey;
    }

    public String getAccountId() {
        return this.getAccount().getId();
    }

    public synchronized void setPlayer(Player player) {
        this.player = player;
        this.player.setSession(this);
        this.player.setAccount(this.getAccount());
    }

    public boolean isLoggedIn() {
        return this.getPlayer() != null;
    }

    public void updateLastPingTime(int clientTime) {
        this.clientTime = clientTime;
        this.lastPingTime = System.currentTimeMillis();
    }

    public int getNextClientSequence() {
        return ++lastClientSeq;
    }

    public void replayPacket(int opcode, String name) {
        Path filePath = FileUtils.getPluginPath(name);
        File p = filePath.toFile();

        if (!p.exists()) return;

        byte[] packet = FileUtils.read(p);

        BasePacket basePacket = new BasePacket(opcode);
        basePacket.setData(packet);

        send(basePacket);
    }

    public void logPacket(String sendOrRecv, int opcode, byte[] payload) {
        Grasscutter.getLogger()
                .info(sendOrRecv + ": " + PacketOpcodesUtils.getOpcodeName(opcode) + " (" + opcode + ")");
        if (GAME_INFO.isShowPacketPayload) System.out.println(Utils.bytesToHex(payload));
    }

    public void send(BasePacket packet) {
        // Test
        if (packet.getOpcode() <= 0) {
            Grasscutter.getLogger().warn("Tried to send packet with missing cmd id!");
            return;
        }

        // Header
        if (packet.shouldBuildHeader()) {
            packet.buildHeader(this.getNextClientSequence());
        }

        // Log
        switch (GAME_INFO.logPackets) {
            case ALL -> {
                if (!PacketOpcodesUtils.LOOP_PACKETS.contains(packet.getOpcode())
                        || GAME_INFO.isShowLoopPackets) {
                    logPacket("SEND", packet.getOpcode(), packet.getData());
                }
            }
            case WHITELIST -> {
                if (SERVER.debugWhitelist.contains(packet.getOpcode())) {
                    logPacket("SEND", packet.getOpcode(), packet.getData());
                }
            }
            case BLACKLIST -> {
                if (!SERVER.debugBlacklist.contains(packet.getOpcode())) {
                    logPacket("SEND", packet.getOpcode(), packet.getData());
                }
            }
            default -> {}
        }

        Grasscutter.getLogger()
            .info("Send: " + PacketOpcodesUtils.getOpcodeName(packet.getOpcode()) + " (" + packet.getOpcode() + ")");

        // Invoke event.
        SendPacketEvent event = new SendPacketEvent(this, packet);
        event.call();
        if (!event.isCanceled()) { // If event is not cancelled, continue.
            try {
                packet = event.getPacket();
                var bytes = packet.build();
                if (packet.shouldEncrypt) {
                    //Crypto.xor(bytes, packet.useDispatchKey() ? Crypto.DISPATCH_KEY : this.encryptKey);
                    if (Grasscutter.getConfig().server.game.useXorEncryption) {
                        Crypto.xor(bytes, packet.useDispatchKey() ? Crypto.DISPATCH_KEY : this.encryptKey);
                    }
                }
                tunnel.writeData(bytes);
            } catch (Exception ignored) {
                Grasscutter.getLogger().debug("Unable to send packet to client.");
            }
        }
    }

    @Override
    public void onConnected(GameSessionManager.KcpTunnel tunnel) {
        this.tunnel = tunnel;
        Grasscutter.getLogger().info(translate("messages.game.connect", this.getAddress().toString()));
    }

    @Override
    public void handleReceive(byte[] bytes) {
        // Decrypt and turn back into a packet
        //Crypto.xor(bytes, useSecretKey() ? this.encryptKey : Crypto.DISPATCH_KEY);
        if (Grasscutter.getConfig().server.game.useXorEncryption) {
            Crypto.xor(bytes, useSecretKey() ? this.encryptKey : Crypto.DISPATCH_KEY);
        }
        ByteBuf packet = Unpooled.wrappedBuffer(bytes);

        // Log
        // logPacket(packet);
        // Handle
        try {
            boolean allDebug = GAME_INFO.logPackets == ServerDebugMode.ALL;
            while (packet.readableBytes() > 0) {
                // Length
                if (packet.readableBytes() < 12) {
                    return;
                }
                // Packet sanity check
                int const1 = packet.readShort();
                if (const1 != 17767) {
                    if (allDebug) {
                        Grasscutter.getLogger()
                                .error("Bad Data Package Received: got {} ,expect 17767", const1);
                    }
                    return; // Bad packet
                }
                // Data
                int opcode = packet.readShort();
                int headerLength = packet.readShort();
                int payloadLength = packet.readInt();
                byte[] header = new byte[headerLength];
                byte[] payload = new byte[payloadLength];

                packet.readBytes(header);
                packet.readBytes(payload);
                // Sanity check #2
                int const2 = packet.readShort();
                if (const2 != -30293) {
                    if (allDebug) {
                        Grasscutter.getLogger()
                                .error("Bad Data Package Received: got {} ,expect -30293", const2);
                    }
                    return; // Bad packet
                }

                // Log packet
                switch (GAME_INFO.logPackets) {
                    case ALL -> {
                        if (!PacketOpcodesUtils.LOOP_PACKETS.contains(opcode) || GAME_INFO.isShowLoopPackets) {
                            logPacket("RECV", opcode, payload);
                        }
                    }
                    case WHITELIST -> {
                        if (SERVER.debugWhitelist.contains(opcode)) {
                            logPacket("RECV", opcode, payload);
                        }
                    }
                    case BLACKLIST -> {
                        if (!(SERVER.debugBlacklist.contains(opcode))) {
                            logPacket("RECV", opcode, payload);
                        }
                    }
                    default -> {}
                }

                Grasscutter.getLogger()
                    .info("Recv: " + PacketOpcodesUtils.getOpcodeName(opcode) + " (" + opcode + ")");

                // Handle
                getServer().getPacketHandler().handle(this, opcode, header, payload);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // byteBuf.release(); //Needn't
            packet.release();
        }
    }

    @Override
    public void handleClose() {
        setState(SessionState.INACTIVE);
        // send disconnection pack in case of reconnection
        Grasscutter.getLogger()
                .info(translate("messages.game.disconnect", this.getAddress().toString()));
        // Save after disconnecting
        if (this.isLoggedIn()) {
            Player player = getPlayer();
            // Call logout event.
            player.onLogout();
        }
        try {
            send(new BasePacket(PacketOpcodes.ServerDisconnectClientNotify));
        } catch (Throwable ignore) {
            Grasscutter.getLogger().warn("closing {} error", getAddress().getAddress().getHostAddress());
        }
        tunnel = null;
    }

    public void close() {
        tunnel.close();
    }

    public boolean isActive() {
        return getState() == SessionState.ACTIVE;
    }

    public enum SessionState {
        INACTIVE,
        WAITING_FOR_TOKEN,
        WAITING_FOR_LOGIN,
        PICKING_CHARACTER,
        ACTIVE,
        ACCOUNT_BANNED
    }
}
