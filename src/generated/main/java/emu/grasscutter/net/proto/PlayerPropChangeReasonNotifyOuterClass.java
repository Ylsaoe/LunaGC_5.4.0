// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerPropChangeReasonNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerPropChangeReasonNotifyOuterClass {
  private PlayerPropChangeReasonNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerPropChangeReasonNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerPropChangeReasonNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float old_value = 7;</code>
     * @return The oldValue.
     */
    float getOldValue();

    /**
     * <code>float cur_value = 9;</code>
     * @return The curValue.
     */
    float getCurValue();

    /**
     * <code>.PropChangeReason reason = 8;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.PropChangeReason reason = 8;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason getReason();

    /**
     * <code>uint32 prop_type = 12;</code>
     * @return The propType.
     */
    int getPropType();
  }
  /**
   * Protobuf type {@code PlayerPropChangeReasonNotify}
   */
  public static final class PlayerPropChangeReasonNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerPropChangeReasonNotify)
      PlayerPropChangeReasonNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerPropChangeReasonNotify.newBuilder() to construct.
    private PlayerPropChangeReasonNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerPropChangeReasonNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerPropChangeReasonNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerPropChangeReasonNotify(
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
            case 61: {

              oldValue_ = input.readFloat();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 77: {

              curValue_ = input.readFloat();
              break;
            }
            case 96: {

              propType_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.class, emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.Builder.class);
    }

    public static final int OLD_VALUE_FIELD_NUMBER = 7;
    private float oldValue_;
    /**
     * <code>float old_value = 7;</code>
     * @return The oldValue.
     */
    @java.lang.Override
    public float getOldValue() {
      return oldValue_;
    }

    public static final int CUR_VALUE_FIELD_NUMBER = 9;
    private float curValue_;
    /**
     * <code>float cur_value = 9;</code>
     * @return The curValue.
     */
    @java.lang.Override
    public float getCurValue() {
      return curValue_;
    }

    public static final int REASON_FIELD_NUMBER = 8;
    private int reason_;
    /**
     * <code>.PropChangeReason reason = 8;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.PropChangeReason reason = 8;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason result = emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
    }

    public static final int PROP_TYPE_FIELD_NUMBER = 12;
    private int propType_;
    /**
     * <code>uint32 prop_type = 12;</code>
     * @return The propType.
     */
    @java.lang.Override
    public int getPropType() {
      return propType_;
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
      if (oldValue_ != 0F) {
        output.writeFloat(7, oldValue_);
      }
      if (reason_ != emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
        output.writeEnum(8, reason_);
      }
      if (curValue_ != 0F) {
        output.writeFloat(9, curValue_);
      }
      if (propType_ != 0) {
        output.writeUInt32(12, propType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oldValue_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, oldValue_);
      }
      if (reason_ != emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, reason_);
      }
      if (curValue_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, curValue_);
      }
      if (propType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, propType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify other = (emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify) obj;

      if (java.lang.Float.floatToIntBits(getOldValue())
          != java.lang.Float.floatToIntBits(
              other.getOldValue())) return false;
      if (java.lang.Float.floatToIntBits(getCurValue())
          != java.lang.Float.floatToIntBits(
              other.getCurValue())) return false;
      if (reason_ != other.reason_) return false;
      if (getPropType()
          != other.getPropType()) return false;
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
      hash = (37 * hash) + OLD_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getOldValue());
      hash = (37 * hash) + CUR_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCurValue());
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + PROP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPropType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify prototype) {
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
     * Protobuf type {@code PlayerPropChangeReasonNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerPropChangeReasonNotify)
        emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.class, emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.newBuilder()
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
        oldValue_ = 0F;

        curValue_ = 0F;

        reason_ = 0;

        propType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify build() {
        emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify result = new emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify(this);
        result.oldValue_ = oldValue_;
        result.curValue_ = curValue_;
        result.reason_ = reason_;
        result.propType_ = propType_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.getDefaultInstance()) return this;
        if (other.getOldValue() != 0F) {
          setOldValue(other.getOldValue());
        }
        if (other.getCurValue() != 0F) {
          setCurValue(other.getCurValue());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getPropType() != 0) {
          setPropType(other.getPropType());
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
        emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float oldValue_ ;
      /**
       * <code>float old_value = 7;</code>
       * @return The oldValue.
       */
      @java.lang.Override
      public float getOldValue() {
        return oldValue_;
      }
      /**
       * <code>float old_value = 7;</code>
       * @param value The oldValue to set.
       * @return This builder for chaining.
       */
      public Builder setOldValue(float value) {
        
        oldValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float old_value = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearOldValue() {
        
        oldValue_ = 0F;
        onChanged();
        return this;
      }

      private float curValue_ ;
      /**
       * <code>float cur_value = 9;</code>
       * @return The curValue.
       */
      @java.lang.Override
      public float getCurValue() {
        return curValue_;
      }
      /**
       * <code>float cur_value = 9;</code>
       * @param value The curValue to set.
       * @return This builder for chaining.
       */
      public Builder setCurValue(float value) {
        
        curValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float cur_value = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurValue() {
        
        curValue_ = 0F;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.PropChangeReason reason = 8;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.PropChangeReason reason = 8;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PropChangeReason reason = 8;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason result = emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.PropChangeReason reason = 8;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PropChangeReason reason = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int propType_ ;
      /**
       * <code>uint32 prop_type = 12;</code>
       * @return The propType.
       */
      @java.lang.Override
      public int getPropType() {
        return propType_;
      }
      /**
       * <code>uint32 prop_type = 12;</code>
       * @param value The propType to set.
       * @return This builder for chaining.
       */
      public Builder setPropType(int value) {
        
        propType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 prop_type = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPropType() {
        
        propType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerPropChangeReasonNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerPropChangeReasonNotify)
    private static final emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify();
    }

    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerPropChangeReasonNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerPropChangeReasonNotify>() {
      @java.lang.Override
      public PlayerPropChangeReasonNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerPropChangeReasonNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerPropChangeReasonNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerPropChangeReasonNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerPropChangeReasonNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"PlayerPropChangeReasonNotify.proto\032\026Pr" +
      "opChangeReason.proto\"z\n\034PlayerPropChange" +
      "ReasonNotify\022\021\n\told_value\030\007 \001(\002\022\021\n\tcur_v" +
      "alue\030\t \001(\002\022!\n\006reason\030\010 \001(\0162\021.PropChangeR" +
      "eason\022\021\n\tprop_type\030\014 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PropChangeReasonOuterClass.getDescriptor(),
        });
    internal_static_PlayerPropChangeReasonNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerPropChangeReasonNotify_descriptor,
        new java.lang.String[] { "OldValue", "CurValue", "Reason", "PropType", });
    emu.grasscutter.net.proto.PropChangeReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
