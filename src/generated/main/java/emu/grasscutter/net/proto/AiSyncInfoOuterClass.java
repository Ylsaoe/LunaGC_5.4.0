// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AiSyncInfo.proto

package emu.grasscutter.net.proto;

public final class AiSyncInfoOuterClass {
  private AiSyncInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AiSyncInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AiSyncInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 8;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <pre>
     *prolly
     * </pre>
     *
     * <code>bool has_path_to_target = 14;</code>
     * @return The hasPathToTarget.
     */
    boolean getHasPathToTarget();

    /**
     * <pre>
     *prolly
     * </pre>
     *
     * <code>bool is_self_killing = 12;</code>
     * @return The isSelfKilling.
     */
    boolean getIsSelfKilling();
  }
  /**
   * Protobuf type {@code AiSyncInfo}
   */
  public static final class AiSyncInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AiSyncInfo)
      AiSyncInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AiSyncInfo.newBuilder() to construct.
    private AiSyncInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AiSyncInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AiSyncInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AiSyncInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 64: {

              entityId_ = input.readUInt32();
              break;
            }
            case 96: {

              isSelfKilling_ = input.readBool();
              break;
            }
            case 112: {

              hasPathToTarget_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AiSyncInfoOuterClass.internal_static_AiSyncInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AiSyncInfoOuterClass.internal_static_AiSyncInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo.class, emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 8;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 8;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int HAS_PATH_TO_TARGET_FIELD_NUMBER = 14;
    private boolean hasPathToTarget_;
    /**
     * <pre>
     *prolly
     * </pre>
     *
     * <code>bool has_path_to_target = 14;</code>
     * @return The hasPathToTarget.
     */
    @java.lang.Override
    public boolean getHasPathToTarget() {
      return hasPathToTarget_;
    }

    public static final int IS_SELF_KILLING_FIELD_NUMBER = 12;
    private boolean isSelfKilling_;
    /**
     * <pre>
     *prolly
     * </pre>
     *
     * <code>bool is_self_killing = 12;</code>
     * @return The isSelfKilling.
     */
    @java.lang.Override
    public boolean getIsSelfKilling() {
      return isSelfKilling_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (entityId_ != 0) {
        output.writeUInt32(8, entityId_);
      }
      if (isSelfKilling_ != false) {
        output.writeBool(12, isSelfKilling_);
      }
      if (hasPathToTarget_ != false) {
        output.writeBool(14, hasPathToTarget_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, entityId_);
      }
      if (isSelfKilling_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isSelfKilling_);
      }
      if (hasPathToTarget_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, hasPathToTarget_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo other = (emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getHasPathToTarget()
          != other.getHasPathToTarget()) return false;
      if (getIsSelfKilling()
          != other.getIsSelfKilling()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + HAS_PATH_TO_TARGET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHasPathToTarget());
      hash = (37 * hash) + IS_SELF_KILLING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSelfKilling());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code AiSyncInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AiSyncInfo)
        emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AiSyncInfoOuterClass.internal_static_AiSyncInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AiSyncInfoOuterClass.internal_static_AiSyncInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo.class, emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        hasPathToTarget_ = false;

        isSelfKilling_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AiSyncInfoOuterClass.internal_static_AiSyncInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo build() {
        emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo buildPartial() {
        emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo result = new emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo(this);
        result.entityId_ = entityId_;
        result.hasPathToTarget_ = hasPathToTarget_;
        result.isSelfKilling_ = isSelfKilling_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo other) {
        if (other == emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getHasPathToTarget() != false) {
          setHasPathToTarget(other.getHasPathToTarget());
        }
        if (other.getIsSelfKilling() != false) {
          setIsSelfKilling(other.getIsSelfKilling());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 8;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 8;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private boolean hasPathToTarget_ ;
      /**
       * <pre>
       *prolly
       * </pre>
       *
       * <code>bool has_path_to_target = 14;</code>
       * @return The hasPathToTarget.
       */
      @java.lang.Override
      public boolean getHasPathToTarget() {
        return hasPathToTarget_;
      }
      /**
       * <pre>
       *prolly
       * </pre>
       *
       * <code>bool has_path_to_target = 14;</code>
       * @param value The hasPathToTarget to set.
       * @return This builder for chaining.
       */
      public Builder setHasPathToTarget(boolean value) {
        
        hasPathToTarget_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *prolly
       * </pre>
       *
       * <code>bool has_path_to_target = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearHasPathToTarget() {
        
        hasPathToTarget_ = false;
        onChanged();
        return this;
      }

      private boolean isSelfKilling_ ;
      /**
       * <pre>
       *prolly
       * </pre>
       *
       * <code>bool is_self_killing = 12;</code>
       * @return The isSelfKilling.
       */
      @java.lang.Override
      public boolean getIsSelfKilling() {
        return isSelfKilling_;
      }
      /**
       * <pre>
       *prolly
       * </pre>
       *
       * <code>bool is_self_killing = 12;</code>
       * @param value The isSelfKilling to set.
       * @return This builder for chaining.
       */
      public Builder setIsSelfKilling(boolean value) {
        
        isSelfKilling_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *prolly
       * </pre>
       *
       * <code>bool is_self_killing = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSelfKilling() {
        
        isSelfKilling_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:AiSyncInfo)
    }

    // @@protoc_insertion_point(class_scope:AiSyncInfo)
    private static final emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo();
    }

    public static emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AiSyncInfo>
        PARSER = new com.google.protobuf.AbstractParser<AiSyncInfo>() {
      @java.lang.Override
      public AiSyncInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AiSyncInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AiSyncInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AiSyncInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AiSyncInfoOuterClass.AiSyncInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AiSyncInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AiSyncInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020AiSyncInfo.proto\"T\n\nAiSyncInfo\022\021\n\tenti" +
      "ty_id\030\010 \001(\r\022\032\n\022has_path_to_target\030\016 \001(\010\022" +
      "\027\n\017is_self_killing\030\014 \001(\010B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AiSyncInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AiSyncInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AiSyncInfo_descriptor,
        new java.lang.String[] { "EntityId", "HasPathToTarget", "IsSelfKilling", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
