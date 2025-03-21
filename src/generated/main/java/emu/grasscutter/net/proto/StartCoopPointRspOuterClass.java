// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartCoopPointRsp.proto

package emu.grasscutter.net.proto;

public final class StartCoopPointRspOuterClass {
  private StartCoopPointRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartCoopPointRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartCoopPointRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MainCoop start_main_coop = 5;</code>
     * @return Whether the startMainCoop field is set.
     */
    boolean hasStartMainCoop();
    /**
     * <code>.MainCoop start_main_coop = 5;</code>
     * @return The startMainCoop.
     */
    emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop getStartMainCoop();
    /**
     * <code>.MainCoop start_main_coop = 5;</code>
     */
    emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder getStartMainCoopOrBuilder();

    /**
     * <code>uint32 coop_point = 9;</code>
     * @return The coopPoint.
     */
    int getCoopPoint();

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_start = 11;</code>
     * @return The isStart.
     */
    boolean getIsStart();
  }
  /**
   * Protobuf type {@code StartCoopPointRsp}
   */
  public static final class StartCoopPointRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartCoopPointRsp)
      StartCoopPointRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartCoopPointRsp.newBuilder() to construct.
    private StartCoopPointRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartCoopPointRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartCoopPointRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StartCoopPointRsp(
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
            case 42: {
              emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder subBuilder = null;
              if (startMainCoop_ != null) {
                subBuilder = startMainCoop_.toBuilder();
              }
              startMainCoop_ = input.readMessage(emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startMainCoop_);
                startMainCoop_ = subBuilder.buildPartial();
              }

              break;
            }
            case 72: {

              coopPoint_ = input.readUInt32();
              break;
            }
            case 80: {

              retcode_ = input.readInt32();
              break;
            }
            case 88: {

              isStart_ = input.readBool();
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
      return emu.grasscutter.net.proto.StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp.class, emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp.Builder.class);
    }

    public static final int START_MAIN_COOP_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop startMainCoop_;
    /**
     * <code>.MainCoop start_main_coop = 5;</code>
     * @return Whether the startMainCoop field is set.
     */
    @java.lang.Override
    public boolean hasStartMainCoop() {
      return startMainCoop_ != null;
    }
    /**
     * <code>.MainCoop start_main_coop = 5;</code>
     * @return The startMainCoop.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop getStartMainCoop() {
      return startMainCoop_ == null ? emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.getDefaultInstance() : startMainCoop_;
    }
    /**
     * <code>.MainCoop start_main_coop = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder getStartMainCoopOrBuilder() {
      return getStartMainCoop();
    }

    public static final int COOP_POINT_FIELD_NUMBER = 9;
    private int coopPoint_;
    /**
     * <code>uint32 coop_point = 9;</code>
     * @return The coopPoint.
     */
    @java.lang.Override
    public int getCoopPoint() {
      return coopPoint_;
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int IS_START_FIELD_NUMBER = 11;
    private boolean isStart_;
    /**
     * <code>bool is_start = 11;</code>
     * @return The isStart.
     */
    @java.lang.Override
    public boolean getIsStart() {
      return isStart_;
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
      if (startMainCoop_ != null) {
        output.writeMessage(5, getStartMainCoop());
      }
      if (coopPoint_ != 0) {
        output.writeUInt32(9, coopPoint_);
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      if (isStart_ != false) {
        output.writeBool(11, isStart_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (startMainCoop_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getStartMainCoop());
      }
      if (coopPoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, coopPoint_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
      }
      if (isStart_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isStart_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp other = (emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp) obj;

      if (hasStartMainCoop() != other.hasStartMainCoop()) return false;
      if (hasStartMainCoop()) {
        if (!getStartMainCoop()
            .equals(other.getStartMainCoop())) return false;
      }
      if (getCoopPoint()
          != other.getCoopPoint()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsStart()
          != other.getIsStart()) return false;
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
      if (hasStartMainCoop()) {
        hash = (37 * hash) + START_MAIN_COOP_FIELD_NUMBER;
        hash = (53 * hash) + getStartMainCoop().hashCode();
      }
      hash = (37 * hash) + COOP_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getCoopPoint();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_START_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStart());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp prototype) {
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
     * Protobuf type {@code StartCoopPointRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartCoopPointRsp)
        emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp.class, emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp.newBuilder()
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
        if (startMainCoopBuilder_ == null) {
          startMainCoop_ = null;
        } else {
          startMainCoop_ = null;
          startMainCoopBuilder_ = null;
        }
        coopPoint_ = 0;

        retcode_ = 0;

        isStart_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.StartCoopPointRspOuterClass.internal_static_StartCoopPointRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp build() {
        emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp buildPartial() {
        emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp result = new emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp(this);
        if (startMainCoopBuilder_ == null) {
          result.startMainCoop_ = startMainCoop_;
        } else {
          result.startMainCoop_ = startMainCoopBuilder_.build();
        }
        result.coopPoint_ = coopPoint_;
        result.retcode_ = retcode_;
        result.isStart_ = isStart_;
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
        if (other instanceof emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp) {
          return mergeFrom((emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp other) {
        if (other == emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp.getDefaultInstance()) return this;
        if (other.hasStartMainCoop()) {
          mergeStartMainCoop(other.getStartMainCoop());
        }
        if (other.getCoopPoint() != 0) {
          setCoopPoint(other.getCoopPoint());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsStart() != false) {
          setIsStart(other.getIsStart());
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
        emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop startMainCoop_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder> startMainCoopBuilder_;
      /**
       * <code>.MainCoop start_main_coop = 5;</code>
       * @return Whether the startMainCoop field is set.
       */
      public boolean hasStartMainCoop() {
        return startMainCoopBuilder_ != null || startMainCoop_ != null;
      }
      /**
       * <code>.MainCoop start_main_coop = 5;</code>
       * @return The startMainCoop.
       */
      public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop getStartMainCoop() {
        if (startMainCoopBuilder_ == null) {
          return startMainCoop_ == null ? emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.getDefaultInstance() : startMainCoop_;
        } else {
          return startMainCoopBuilder_.getMessage();
        }
      }
      /**
       * <code>.MainCoop start_main_coop = 5;</code>
       */
      public Builder setStartMainCoop(emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop value) {
        if (startMainCoopBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          startMainCoop_ = value;
          onChanged();
        } else {
          startMainCoopBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MainCoop start_main_coop = 5;</code>
       */
      public Builder setStartMainCoop(
          emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder builderForValue) {
        if (startMainCoopBuilder_ == null) {
          startMainCoop_ = builderForValue.build();
          onChanged();
        } else {
          startMainCoopBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MainCoop start_main_coop = 5;</code>
       */
      public Builder mergeStartMainCoop(emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop value) {
        if (startMainCoopBuilder_ == null) {
          if (startMainCoop_ != null) {
            startMainCoop_ =
              emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.newBuilder(startMainCoop_).mergeFrom(value).buildPartial();
          } else {
            startMainCoop_ = value;
          }
          onChanged();
        } else {
          startMainCoopBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MainCoop start_main_coop = 5;</code>
       */
      public Builder clearStartMainCoop() {
        if (startMainCoopBuilder_ == null) {
          startMainCoop_ = null;
          onChanged();
        } else {
          startMainCoop_ = null;
          startMainCoopBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MainCoop start_main_coop = 5;</code>
       */
      public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder getStartMainCoopBuilder() {
        
        onChanged();
        return getStartMainCoopFieldBuilder().getBuilder();
      }
      /**
       * <code>.MainCoop start_main_coop = 5;</code>
       */
      public emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder getStartMainCoopOrBuilder() {
        if (startMainCoopBuilder_ != null) {
          return startMainCoopBuilder_.getMessageOrBuilder();
        } else {
          return startMainCoop_ == null ?
              emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.getDefaultInstance() : startMainCoop_;
        }
      }
      /**
       * <code>.MainCoop start_main_coop = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder> 
          getStartMainCoopFieldBuilder() {
        if (startMainCoopBuilder_ == null) {
          startMainCoopBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoop.Builder, emu.grasscutter.net.proto.MainCoopOuterClass.MainCoopOrBuilder>(
                  getStartMainCoop(),
                  getParentForChildren(),
                  isClean());
          startMainCoop_ = null;
        }
        return startMainCoopBuilder_;
      }

      private int coopPoint_ ;
      /**
       * <code>uint32 coop_point = 9;</code>
       * @return The coopPoint.
       */
      @java.lang.Override
      public int getCoopPoint() {
        return coopPoint_;
      }
      /**
       * <code>uint32 coop_point = 9;</code>
       * @param value The coopPoint to set.
       * @return This builder for chaining.
       */
      public Builder setCoopPoint(int value) {
        
        coopPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coop_point = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoopPoint() {
        
        coopPoint_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isStart_ ;
      /**
       * <code>bool is_start = 11;</code>
       * @return The isStart.
       */
      @java.lang.Override
      public boolean getIsStart() {
        return isStart_;
      }
      /**
       * <code>bool is_start = 11;</code>
       * @param value The isStart to set.
       * @return This builder for chaining.
       */
      public Builder setIsStart(boolean value) {
        
        isStart_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_start = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStart() {
        
        isStart_ = false;
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


      // @@protoc_insertion_point(builder_scope:StartCoopPointRsp)
    }

    // @@protoc_insertion_point(class_scope:StartCoopPointRsp)
    private static final emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp();
    }

    public static emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartCoopPointRsp>
        PARSER = new com.google.protobuf.AbstractParser<StartCoopPointRsp>() {
      @java.lang.Override
      public StartCoopPointRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StartCoopPointRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StartCoopPointRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartCoopPointRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.StartCoopPointRspOuterClass.StartCoopPointRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartCoopPointRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartCoopPointRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027StartCoopPointRsp.proto\032\016MainCoop.prot" +
      "o\"n\n\021StartCoopPointRsp\022\"\n\017start_main_coo" +
      "p\030\005 \001(\0132\t.MainCoop\022\022\n\ncoop_point\030\t \001(\r\022\017" +
      "\n\007retcode\030\n \001(\005\022\020\n\010is_start\030\013 \001(\010B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MainCoopOuterClass.getDescriptor(),
        });
    internal_static_StartCoopPointRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartCoopPointRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartCoopPointRsp_descriptor,
        new java.lang.String[] { "StartMainCoop", "CoopPoint", "Retcode", "IsStart", });
    emu.grasscutter.net.proto.MainCoopOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
