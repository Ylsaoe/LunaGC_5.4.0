// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapMarkFromType.proto

package emu.grasscutter.net.proto;

public final class MapMarkFromTypeOuterClass {
  private MapMarkFromTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MapMarkFromType}
   */
  public enum MapMarkFromType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MAP_MARK_FROM_TYPE_NONE = 0;</code>
     */
    MAP_MARK_FROM_TYPE_NONE(0),
    /**
     * <code>MAP_MARK_FROM_TYPE_MONSTER = 1;</code>
     */
    MAP_MARK_FROM_TYPE_MONSTER(1),
    /**
     * <code>MAP_MARK_FROM_TYPE_QUEST = 2;</code>
     */
    MAP_MARK_FROM_TYPE_QUEST(2),
    /**
     * <code>MAP_MARK_FROM_TYPE_NOE = 3;</code>
     */
    MAP_MARK_FROM_TYPE_NOE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MAP_MARK_FROM_TYPE_NONE = 0;</code>
     */
    public static final int MAP_MARK_FROM_TYPE_NONE_VALUE = 0;
    /**
     * <code>MAP_MARK_FROM_TYPE_MONSTER = 1;</code>
     */
    public static final int MAP_MARK_FROM_TYPE_MONSTER_VALUE = 1;
    /**
     * <code>MAP_MARK_FROM_TYPE_QUEST = 2;</code>
     */
    public static final int MAP_MARK_FROM_TYPE_QUEST_VALUE = 2;
    /**
     * <code>MAP_MARK_FROM_TYPE_NOE = 3;</code>
     */
    public static final int MAP_MARK_FROM_TYPE_NOE_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MapMarkFromType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MapMarkFromType forNumber(int value) {
      switch (value) {
        case 0: return MAP_MARK_FROM_TYPE_NONE;
        case 1: return MAP_MARK_FROM_TYPE_MONSTER;
        case 2: return MAP_MARK_FROM_TYPE_QUEST;
        case 3: return MAP_MARK_FROM_TYPE_NOE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MapMarkFromType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MapMarkFromType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MapMarkFromType>() {
            public MapMarkFromType findValueByNumber(int number) {
              return MapMarkFromType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MapMarkFromTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MapMarkFromType[] VALUES = values();

    public static MapMarkFromType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MapMarkFromType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MapMarkFromType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025MapMarkFromType.proto*\210\001\n\017MapMarkFromT" +
      "ype\022\033\n\027MAP_MARK_FROM_TYPE_NONE\020\000\022\036\n\032MAP_" +
      "MARK_FROM_TYPE_MONSTER\020\001\022\034\n\030MAP_MARK_FRO" +
      "M_TYPE_QUEST\020\002\022\032\n\026MAP_MARK_FROM_TYPE_NOE" +
      "\020\003B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
