package emu.grasscutter;

import emu.grasscutter.game.world.Position;
import emu.grasscutter.utils.Utils;
import emu.grasscutter.utils.objects.SparseSet;

import java.util.Arrays;

public final class GameConstants {
    public static String VERSION = "5.4.0";
    public static int[] VERSION_PARTS = {5, 4, 0};
    public static boolean DEBUG = false;

    public static final int DEFAULT_TEAMS = 4;
    public static final int MAX_TEAMS = 50;
    public static final int MAIN_CHARACTER_MALE = 10000005;
    public static final int MAIN_CHARACTER_FEMALE = 10000007;
    public static final Position START_POSITION = new Position(2747, 194, -1719);
    public static final int MAX_FRIENDS = 60;
    public static final int MAX_FRIEND_REQUESTS = 50;
    public static final int SERVER_CONSOLE_UID = 99; // The UID of the server console's "player".
    public static final int BATTLE_PASS_MAX_LEVEL = 50;
    public static final int BATTLE_PASS_POINT_PER_LEVEL = 1000;
    public static final int BATTLE_PASS_POINT_PER_WEEK = 10000;
    public static final int BATTLE_PASS_LEVEL_PRICE = 150;
    public static final int BATTLE_PASS_CURRENT_INDEX = 2;
    // Default entity ability hashes.
    public static final String[] DEFAULT_ABILITY_STRINGS = {
        "Avatar_DefaultAbility_VisionReplaceDieInvincible",
         "Avatar_DefaultAbility_AvartarInShaderChange",
         "Avatar_SprintBS_Invincible",
         "Avatar_Freeze_Duration_Reducer",
         "Avatar_Attack_ReviveEnergy",
         "Avatar_Component_Initializer",
         "Avatar_FallAnthem_Achievement_Listener",
         "GrapplingHookSkill_Ability",
         "Avatar_PlayerBoy_DiveStamina_Reduction",
         "Ability_Avatar_Dive_SealEcho",
         "Absorb_SealEcho_Bullet_01",
         "Absorb_SealEcho_Bullet_02",
         "Ability_Avatar_Dive_CrabShield",
         "ActivityAbility_Absorb_Shoot",
         "SceneAbility_DiveVolume",
         "Avatar_PlayerGirl_DiveStamina_Reduction",
         "Ability_Avatar_Dive_Team",
         "Avatar_Absorb_TrackingMissile",
         "Avatar_Absorb_SwordFishSlash",
         "TeamAbility_Natsaurus_Transfer_Vehicle_Skill",
         "DynamicAbility_Phlogiston",
         "DynamicAbility_NightsoulBlessing",
         "TeamAbility_Natsaurus_Vehicle_State_Listener",
         "DynamicAbility_ArcLight_Predicate",
         "DynamicAbility_CommonArcLight_Invincible_V5_0",
         "DynamicAbility_ArcLight_Wathcer",
         "SceneObj_Area_Nt_Property_Prop_YouLieDragon_Collision_DynamicAbility",
         "TeamAbility_Natsaurus_Preload_Drillhead",
         "TeamAbility_Natsaurus_Preload_Hookwalker",
         "TeamAbility_Natsaurus_Preload_Mosasaurus",
         "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet",
         "TeamAbility_NightsoulBurst",
         "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_01",
         "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_02",
         "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_03",
         "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_04",
         "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_05",
         "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_06",
         "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_07",
         "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_5001",
         "Avatar_HDMesh_Controller",
         "Avatar_Trampoline_Jump_Controller",
         "Avatar_ArkheGrade_CD_Controller",
         "Avatar_FluidAgitator",
         "Avatar_TriggerNyxInstant",
         "Avatar_NyxState_Listener"
     };
      public static final String[] DEFAULT_TEAM_ABILITY_STRINGS = {
             "Ability_Avatar_Dive_Team",
             // "Vehicle_Natsaurus_Common_HumanDragonCollaboration",
             "TeamAbility_Natsaurus_Transfer_Vehicle_Skill",
             "DynamicAbility_Phlogiston",
             "TeamAbility_Natsaurus_Vehicle_State_Listener",
             "DynamicAbility_ArcLight_Predicate",
             "DynamicAbility_CommonArcLight_Invincible_V5_0",
             "DynamicAbility_ArcLight_Wathcer",
             "SceneObj_Area_Nt_Property_Prop_YouLieDragon_Collision_DynamicAbility",
             "TeamAbility_Natsaurus_Preload_Drillhead",
             "TeamAbility_Natsaurus_Preload_Hookwalker",
             "TeamAbility_Natsaurus_Preload_Mosasaurus",
             "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet",
             "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_01",
             "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_02",
             "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_03",
             "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_04",
             "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_05",
             "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_06",
             "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_07",
             "TeamAbility_Natsaurus_Hookwalker_ElementalArt_TriggerBullet_5001"
     };
    public static final SparseSet ILLEGAL_WEAPONS = new SparseSet("""
        10000-10008, 11411, 11506-11508, 12505, 12506, 12508, 12509,
        13503, 13506, 14411, 14503, 14505, 14508, 15504-15506
        """);
    public static final SparseSet ILLEGAL_RELICS = new SparseSet("""
        20001, 23300-23340, 23383-23385, 78310-78554, 99310-99554
        """);
    public static final SparseSet ILLEGAL_ITEMS = new SparseSet("""
        100086, 100087, 100100-101000, 101106-101110, 101306, 101500-104000,
        105001, 105004, 106000-107000, 107011, 108000, 109000-110000,
        115000-130000, 200200-200899, 220050, 220054
        """);
    public static final int[] DEFAULT_ABILITY_HASHES =
            Arrays.stream(DEFAULT_ABILITY_STRINGS).mapToInt(Utils::abilityHash).toArray();
    public static final int DEFAULT_ABILITY_NAME = Utils.abilityHash("Default");
}
