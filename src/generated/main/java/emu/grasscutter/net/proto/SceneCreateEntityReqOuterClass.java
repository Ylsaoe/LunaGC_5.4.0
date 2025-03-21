// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneCreateEntityReq.proto

package emu.grasscutter.net.proto;

public final class SceneCreateEntityReqOuterClass {
  private SceneCreateEntityReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneCreateEntityReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneCreateEntityReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CreateEntityInfo entity = 14;</code>
     * @return Whether the entity field is set.
     */
    boolean hasEntity();
    /**
     * <code>.CreateEntityInfo entity = 14;</code>
     * @return The entity.
     */
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity();
    /**
     * <code>.CreateEntityInfo entity = 14;</code>
     */
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder();

    /**
     * <code>.CreateReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.CreateReason reason = 2;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason getReason();

    /**
     * <code>bool is_destroy_when_disconnect = 5;</code>
     * @return The isDestroyWhenDisconnect.
     */
    boolean getIsDestroyWhenDisconnect();
  }
  /**
   * Protobuf type {@code SceneCreateEntityReq}
   */
  public static final class SceneCreateEntityReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneCreateEntityReq)
      SceneCreateEntityReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneCreateEntityReq.newBuilder() to construct.
    private SceneCreateEntityReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneCreateEntityReq() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneCreateEntityReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneCreateEntityReq(
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
            case 16: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 40: {

              isDestroyWhenDisconnect_ = input.readBool();
              break;
            }
            case 114: {
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder subBuilder = null;
              if (entity_ != null) {
                subBuilder = entity_.toBuilder();
              }
              entity_ = input.readMessage(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entity_);
                entity_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.internal_static_SceneCreateEntityReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.internal_static_SceneCreateEntityReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq.class, emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq.Builder.class);
    }

    public static final int ENTITY_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo entity_;
    /**
     * <code>.CreateEntityInfo entity = 14;</code>
     * @return Whether the entity field is set.
     */
    @java.lang.Override
    public boolean hasEntity() {
      return entity_ != null;
    }
    /**
     * <code>.CreateEntityInfo entity = 14;</code>
     * @return The entity.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
      return entity_ == null ? emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
    }
    /**
     * <code>.CreateEntityInfo entity = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
      return getEntity();
    }

    public static final int REASON_FIELD_NUMBER = 2;
    private int reason_;
    /**
     * <code>.CreateReason reason = 2;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.CreateReason reason = 2;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason result = emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason.UNRECOGNIZED : result;
    }

    public static final int IS_DESTROY_WHEN_DISCONNECT_FIELD_NUMBER = 5;
    private boolean isDestroyWhenDisconnect_;
    /**
     * <code>bool is_destroy_when_disconnect = 5;</code>
     * @return The isDestroyWhenDisconnect.
     */
    @java.lang.Override
    public boolean getIsDestroyWhenDisconnect() {
      return isDestroyWhenDisconnect_;
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
      if (reason_ != emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason.CREATE_REASON_NONE.getNumber()) {
        output.writeEnum(2, reason_);
      }
      if (isDestroyWhenDisconnect_ != false) {
        output.writeBool(5, isDestroyWhenDisconnect_);
      }
      if (entity_ != null) {
        output.writeMessage(14, getEntity());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason.CREATE_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, reason_);
      }
      if (isDestroyWhenDisconnect_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isDestroyWhenDisconnect_);
      }
      if (entity_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getEntity());
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq other = (emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq) obj;

      if (hasEntity() != other.hasEntity()) return false;
      if (hasEntity()) {
        if (!getEntity()
            .equals(other.getEntity())) return false;
      }
      if (reason_ != other.reason_) return false;
      if (getIsDestroyWhenDisconnect()
          != other.getIsDestroyWhenDisconnect()) return false;
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
      if (hasEntity()) {
        hash = (37 * hash) + ENTITY_FIELD_NUMBER;
        hash = (53 * hash) + getEntity().hashCode();
      }
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + IS_DESTROY_WHEN_DISCONNECT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDestroyWhenDisconnect());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq prototype) {
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
     * Protobuf type {@code SceneCreateEntityReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneCreateEntityReq)
        emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.internal_static_SceneCreateEntityReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.internal_static_SceneCreateEntityReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq.class, emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq.newBuilder()
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
        if (entityBuilder_ == null) {
          entity_ = null;
        } else {
          entity_ = null;
          entityBuilder_ = null;
        }
        reason_ = 0;

        isDestroyWhenDisconnect_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.internal_static_SceneCreateEntityReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq build() {
        emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq buildPartial() {
        emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq result = new emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq(this);
        if (entityBuilder_ == null) {
          result.entity_ = entity_;
        } else {
          result.entity_ = entityBuilder_.build();
        }
        result.reason_ = reason_;
        result.isDestroyWhenDisconnect_ = isDestroyWhenDisconnect_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq) {
          return mergeFrom((emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq other) {
        if (other == emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq.getDefaultInstance()) return this;
        if (other.hasEntity()) {
          mergeEntity(other.getEntity());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getIsDestroyWhenDisconnect() != false) {
          setIsDestroyWhenDisconnect(other.getIsDestroyWhenDisconnect());
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
        emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo entity_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> entityBuilder_;
      /**
       * <code>.CreateEntityInfo entity = 14;</code>
       * @return Whether the entity field is set.
       */
      public boolean hasEntity() {
        return entityBuilder_ != null || entity_ != null;
      }
      /**
       * <code>.CreateEntityInfo entity = 14;</code>
       * @return The entity.
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
        if (entityBuilder_ == null) {
          return entity_ == null ? emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        } else {
          return entityBuilder_.getMessage();
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 14;</code>
       */
      public Builder setEntity(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entity_ = value;
          onChanged();
        } else {
          entityBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 14;</code>
       */
      public Builder setEntity(
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder builderForValue) {
        if (entityBuilder_ == null) {
          entity_ = builderForValue.build();
          onChanged();
        } else {
          entityBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 14;</code>
       */
      public Builder mergeEntity(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (entity_ != null) {
            entity_ =
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.newBuilder(entity_).mergeFrom(value).buildPartial();
          } else {
            entity_ = value;
          }
          onChanged();
        } else {
          entityBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 14;</code>
       */
      public Builder clearEntity() {
        if (entityBuilder_ == null) {
          entity_ = null;
          onChanged();
        } else {
          entity_ = null;
          entityBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 14;</code>
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder getEntityBuilder() {
        
        onChanged();
        return getEntityFieldBuilder().getBuilder();
      }
      /**
       * <code>.CreateEntityInfo entity = 14;</code>
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
        if (entityBuilder_ != null) {
          return entityBuilder_.getMessageOrBuilder();
        } else {
          return entity_ == null ?
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> 
          getEntityFieldBuilder() {
        if (entityBuilder_ == null) {
          entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder>(
                  getEntity(),
                  getParentForChildren(),
                  isClean());
          entity_ = null;
        }
        return entityBuilder_;
      }

      private int reason_ = 0;
      /**
       * <code>.CreateReason reason = 2;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.CreateReason reason = 2;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.CreateReason reason = 2;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason result = emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.CreateReason reason = 2;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.CreateReasonOuterClass.CreateReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.CreateReason reason = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private boolean isDestroyWhenDisconnect_ ;
      /**
       * <code>bool is_destroy_when_disconnect = 5;</code>
       * @return The isDestroyWhenDisconnect.
       */
      @java.lang.Override
      public boolean getIsDestroyWhenDisconnect() {
        return isDestroyWhenDisconnect_;
      }
      /**
       * <code>bool is_destroy_when_disconnect = 5;</code>
       * @param value The isDestroyWhenDisconnect to set.
       * @return This builder for chaining.
       */
      public Builder setIsDestroyWhenDisconnect(boolean value) {
        
        isDestroyWhenDisconnect_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_destroy_when_disconnect = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDestroyWhenDisconnect() {
        
        isDestroyWhenDisconnect_ = false;
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


      // @@protoc_insertion_point(builder_scope:SceneCreateEntityReq)
    }

    // @@protoc_insertion_point(class_scope:SceneCreateEntityReq)
    private static final emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq();
    }

    public static emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneCreateEntityReq>
        PARSER = new com.google.protobuf.AbstractParser<SceneCreateEntityReq>() {
      @java.lang.Override
      public SceneCreateEntityReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneCreateEntityReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneCreateEntityReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneCreateEntityReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneCreateEntityReqOuterClass.SceneCreateEntityReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneCreateEntityReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneCreateEntityReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SceneCreateEntityReq.proto\032\026CreateEnti" +
      "tyInfo.proto\032\022CreateReason.proto\"|\n\024Scen" +
      "eCreateEntityReq\022!\n\006entity\030\016 \001(\0132\021.Creat" +
      "eEntityInfo\022\035\n\006reason\030\002 \001(\0162\r.CreateReas" +
      "on\022\"\n\032is_destroy_when_disconnect\030\005 \001(\010B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.CreateReasonOuterClass.getDescriptor(),
        });
    internal_static_SceneCreateEntityReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneCreateEntityReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneCreateEntityReq_descriptor,
        new java.lang.String[] { "Entity", "Reason", "IsDestroyWhenDisconnect", });
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.getDescriptor();
    emu.grasscutter.net.proto.CreateReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
