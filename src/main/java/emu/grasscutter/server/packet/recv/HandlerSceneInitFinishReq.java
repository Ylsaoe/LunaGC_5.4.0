package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.player.Player.SceneLoadState;
import emu.grasscutter.game.world.WeatherArea;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.*;

@Opcodes(PacketOpcodes.SceneInitFinishReq)
public class HandlerSceneInitFinishReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var player = session.getPlayer();
        var world = player.getWorld();

        // Info packets
        session.send(new PacketServerTimeNotify());
        session.send(new PacketWorldPlayerInfoNotify(world));
        session.send(new PacketWorldDataNotify(world));
        session.send(new PacketPlayerWorldSceneInfoListNotify(player));
        session.send(new BasePacket(PacketOpcodes.SceneForceUnlockNotify));
        session.send(new PacketHostPlayerNotify(world));

        session.send(new PacketSceneTimeNotify(player));
        session.send(new PacketPlayerGameTimeNotify(player));
        session.send(new PacketPlayerEnterSceneInfoNotify(player));

        session.getPlayer().getScene().reloadWeathers();
        session.getPlayer().updateWeather(session.getPlayer().getScene());
        WeatherArea area = session.getPlayer().getScene().getWeatherAreas().get(session.getPlayer().getWeatherAreaId());
        if(area != null)
            session.send(new PacketSceneAreaWeatherNotify(area.getConfig().getAreaID(), area.getCurrentClimateType(), area.getTransDuration()));
        else
            session.send(new PacketSceneAreaWeatherNotify(session.getPlayer()));
        session.send(new PacketScenePlayerInfoNotify(world));
        session.send(new PacketSceneTeamUpdateNotify(player));

        session.send(new PacketSyncTeamEntityNotify(player));
        session.send(new PacketSyncScenePlayTeamEntityNotify(player));

        // Done Packet
        session.send(new PacketSceneInitFinishRsp(player));
        //session.send((BasePacket)new PacketWindSeedUID());

        // Set scene load state.
        player.setSceneLoadState(SceneLoadState.INIT);
        // Run scene initialization.
        player.getScene().playerSceneInitialized(player);
    }
}
