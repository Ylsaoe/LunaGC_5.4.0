// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HuntingOfferData.proto

package emu.grasscutter.net.proto;

public final class HuntingOfferDataOuterClass {
  private HuntingOfferDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HuntingOfferDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HuntingOfferData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 city_id = 2;</code>
     * @return The cityId.
     */
    int getCityId();

    /**
     * <code>.HuntingOfferState state = 6;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.HuntingOfferState state = 6;</code>
     * @return The state.
     */
    emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState getState();

    /**
     * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
     * @return Whether the oKMFEGEGAFH field is set.
     */
    boolean hasOKMFEGEGAFH();
    /**
     * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
     * @return The oKMFEGEGAFH.
     */
    emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getOKMFEGEGAFH();
    /**
     * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
     */
    emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getOKMFEGEGAFHOrBuilder();
  }
  /**
   * Protobuf type {@code HuntingOfferData}
   */
  public static final class HuntingOfferData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HuntingOfferData)
      HuntingOfferDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HuntingOfferData.newBuilder() to construct.
    private HuntingOfferData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HuntingOfferData() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HuntingOfferData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HuntingOfferData(
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

              cityId_ = input.readUInt32();
              break;
            }
            case 48: {
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
            case 90: {
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder subBuilder = null;
              if (oKMFEGEGAFH_ != null) {
                subBuilder = oKMFEGEGAFH_.toBuilder();
              }
              oKMFEGEGAFH_ = input.readMessage(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(oKMFEGEGAFH_);
                oKMFEGEGAFH_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.HuntingOfferDataOuterClass.internal_static_HuntingOfferData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HuntingOfferDataOuterClass.internal_static_HuntingOfferData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData.class, emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData.Builder.class);
    }

    public static final int CITY_ID_FIELD_NUMBER = 2;
    private int cityId_;
    /**
     * <code>uint32 city_id = 2;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
    }

    public static final int STATE_FIELD_NUMBER = 6;
    private int state_;
    /**
     * <code>.HuntingOfferState state = 6;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.HuntingOfferState state = 6;</code>
     * @return The state.
     */
    @java.lang.Override public emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState getState() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState result = emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState.valueOf(state_);
      return result == null ? emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState.UNRECOGNIZED : result;
    }

    public static final int OKMFEGEGAFH_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair oKMFEGEGAFH_;
    /**
     * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
     * @return Whether the oKMFEGEGAFH field is set.
     */
    @java.lang.Override
    public boolean hasOKMFEGEGAFH() {
      return oKMFEGEGAFH_ != null;
    }
    /**
     * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
     * @return The oKMFEGEGAFH.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getOKMFEGEGAFH() {
      return oKMFEGEGAFH_ == null ? emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : oKMFEGEGAFH_;
    }
    /**
     * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getOKMFEGEGAFHOrBuilder() {
      return getOKMFEGEGAFH();
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
      if (cityId_ != 0) {
        output.writeUInt32(2, cityId_);
      }
      if (state_ != emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState.HuntingOfferState_NONE.getNumber()) {
        output.writeEnum(6, state_);
      }
      if (oKMFEGEGAFH_ != null) {
        output.writeMessage(11, getOKMFEGEGAFH());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cityId_);
      }
      if (state_ != emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState.HuntingOfferState_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, state_);
      }
      if (oKMFEGEGAFH_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getOKMFEGEGAFH());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData other = (emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData) obj;

      if (getCityId()
          != other.getCityId()) return false;
      if (state_ != other.state_) return false;
      if (hasOKMFEGEGAFH() != other.hasOKMFEGEGAFH()) return false;
      if (hasOKMFEGEGAFH()) {
        if (!getOKMFEGEGAFH()
            .equals(other.getOKMFEGEGAFH())) return false;
      }
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
      hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      if (hasOKMFEGEGAFH()) {
        hash = (37 * hash) + OKMFEGEGAFH_FIELD_NUMBER;
        hash = (53 * hash) + getOKMFEGEGAFH().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData prototype) {
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
     * Protobuf type {@code HuntingOfferData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HuntingOfferData)
        emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HuntingOfferDataOuterClass.internal_static_HuntingOfferData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HuntingOfferDataOuterClass.internal_static_HuntingOfferData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData.class, emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData.newBuilder()
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
        cityId_ = 0;

        state_ = 0;

        if (oKMFEGEGAFHBuilder_ == null) {
          oKMFEGEGAFH_ = null;
        } else {
          oKMFEGEGAFH_ = null;
          oKMFEGEGAFHBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HuntingOfferDataOuterClass.internal_static_HuntingOfferData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData build() {
        emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData buildPartial() {
        emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData result = new emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData(this);
        result.cityId_ = cityId_;
        result.state_ = state_;
        if (oKMFEGEGAFHBuilder_ == null) {
          result.oKMFEGEGAFH_ = oKMFEGEGAFH_;
        } else {
          result.oKMFEGEGAFH_ = oKMFEGEGAFHBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData) {
          return mergeFrom((emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData other) {
        if (other == emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData.getDefaultInstance()) return this;
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.hasOKMFEGEGAFH()) {
          mergeOKMFEGEGAFH(other.getOKMFEGEGAFH());
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
        emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cityId_ ;
      /**
       * <code>uint32 city_id = 2;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 city_id = 2;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {
        
        cityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 city_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        
        cityId_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.HuntingOfferState state = 6;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.HuntingOfferState state = 6;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingOfferState state = 6;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState getState() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState result = emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState.valueOf(state_);
        return result == null ? emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState.UNRECOGNIZED : result;
      }
      /**
       * <code>.HuntingOfferState state = 6;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.grasscutter.net.proto.HuntingOfferStateOuterClass.HuntingOfferState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingOfferState state = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair oKMFEGEGAFH_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> oKMFEGEGAFHBuilder_;
      /**
       * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
       * @return Whether the oKMFEGEGAFH field is set.
       */
      public boolean hasOKMFEGEGAFH() {
        return oKMFEGEGAFHBuilder_ != null || oKMFEGEGAFH_ != null;
      }
      /**
       * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
       * @return The oKMFEGEGAFH.
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getOKMFEGEGAFH() {
        if (oKMFEGEGAFHBuilder_ == null) {
          return oKMFEGEGAFH_ == null ? emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : oKMFEGEGAFH_;
        } else {
          return oKMFEGEGAFHBuilder_.getMessage();
        }
      }
      /**
       * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
       */
      public Builder setOKMFEGEGAFH(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (oKMFEGEGAFHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          oKMFEGEGAFH_ = value;
          onChanged();
        } else {
          oKMFEGEGAFHBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
       */
      public Builder setOKMFEGEGAFH(
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder builderForValue) {
        if (oKMFEGEGAFHBuilder_ == null) {
          oKMFEGEGAFH_ = builderForValue.build();
          onChanged();
        } else {
          oKMFEGEGAFHBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
       */
      public Builder mergeOKMFEGEGAFH(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (oKMFEGEGAFHBuilder_ == null) {
          if (oKMFEGEGAFH_ != null) {
            oKMFEGEGAFH_ =
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.newBuilder(oKMFEGEGAFH_).mergeFrom(value).buildPartial();
          } else {
            oKMFEGEGAFH_ = value;
          }
          onChanged();
        } else {
          oKMFEGEGAFHBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
       */
      public Builder clearOKMFEGEGAFH() {
        if (oKMFEGEGAFHBuilder_ == null) {
          oKMFEGEGAFH_ = null;
          onChanged();
        } else {
          oKMFEGEGAFH_ = null;
          oKMFEGEGAFHBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder getOKMFEGEGAFHBuilder() {
        
        onChanged();
        return getOKMFEGEGAFHFieldBuilder().getBuilder();
      }
      /**
       * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getOKMFEGEGAFHOrBuilder() {
        if (oKMFEGEGAFHBuilder_ != null) {
          return oKMFEGEGAFHBuilder_.getMessageOrBuilder();
        } else {
          return oKMFEGEGAFH_ == null ?
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : oKMFEGEGAFH_;
        }
      }
      /**
       * <code>.HuntingPair OKMFEGEGAFH = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> 
          getOKMFEGEGAFHFieldBuilder() {
        if (oKMFEGEGAFHBuilder_ == null) {
          oKMFEGEGAFHBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder>(
                  getOKMFEGEGAFH(),
                  getParentForChildren(),
                  isClean());
          oKMFEGEGAFH_ = null;
        }
        return oKMFEGEGAFHBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HuntingOfferData)
    }

    // @@protoc_insertion_point(class_scope:HuntingOfferData)
    private static final emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData();
    }

    public static emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HuntingOfferData>
        PARSER = new com.google.protobuf.AbstractParser<HuntingOfferData>() {
      @java.lang.Override
      public HuntingOfferData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HuntingOfferData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HuntingOfferData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HuntingOfferData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingOfferDataOuterClass.HuntingOfferData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HuntingOfferData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HuntingOfferData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026HuntingOfferData.proto\032\021HuntingPair.pr" +
      "oto\032\027HuntingOfferState.proto\"i\n\020HuntingO" +
      "fferData\022\017\n\007city_id\030\002 \001(\r\022!\n\005state\030\006 \001(\016" +
      "2\022.HuntingOfferState\022!\n\013OKMFEGEGAFH\030\013 \001(" +
      "\0132\014.HuntingPairB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HuntingPairOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.HuntingOfferStateOuterClass.getDescriptor(),
        });
    internal_static_HuntingOfferData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HuntingOfferData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HuntingOfferData_descriptor,
        new java.lang.String[] { "CityId", "State", "OKMFEGEGAFH", });
    emu.grasscutter.net.proto.HuntingPairOuterClass.getDescriptor();
    emu.grasscutter.net.proto.HuntingOfferStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
