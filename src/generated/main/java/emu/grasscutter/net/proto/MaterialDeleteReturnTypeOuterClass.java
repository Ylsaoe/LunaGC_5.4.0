// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MaterialDeleteReturnType.proto

package emu.grasscutter.net.proto;

public final class MaterialDeleteReturnTypeOuterClass {
  private MaterialDeleteReturnTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MaterialDeleteReturnType}
   */
  public enum MaterialDeleteReturnType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MATERIAL_DELETE_RETURN_BAG = 0;</code>
     */
    MATERIAL_DELETE_RETURN_BAG(0),
    /**
     * <code>MATERIAL_DELETE_RETURN_SEED = 1;</code>
     */
    MATERIAL_DELETE_RETURN_SEED(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MATERIAL_DELETE_RETURN_BAG = 0;</code>
     */
    public static final int MATERIAL_DELETE_RETURN_BAG_VALUE = 0;
    /**
     * <code>MATERIAL_DELETE_RETURN_SEED = 1;</code>
     */
    public static final int MATERIAL_DELETE_RETURN_SEED_VALUE = 1;


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
    public static MaterialDeleteReturnType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MaterialDeleteReturnType forNumber(int value) {
      switch (value) {
        case 0: return MATERIAL_DELETE_RETURN_BAG;
        case 1: return MATERIAL_DELETE_RETURN_SEED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MaterialDeleteReturnType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MaterialDeleteReturnType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MaterialDeleteReturnType>() {
            public MaterialDeleteReturnType findValueByNumber(int number) {
              return MaterialDeleteReturnType.forNumber(number);
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
      return emu.grasscutter.net.proto.MaterialDeleteReturnTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MaterialDeleteReturnType[] VALUES = values();

    public static MaterialDeleteReturnType valueOf(
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

    private MaterialDeleteReturnType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MaterialDeleteReturnType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036MaterialDeleteReturnType.proto*[\n\030Mate" +
      "rialDeleteReturnType\022\036\n\032MATERIAL_DELETE_" +
      "RETURN_BAG\020\000\022\037\n\033MATERIAL_DELETE_RETURN_S" +
      "EED\020\001B\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
