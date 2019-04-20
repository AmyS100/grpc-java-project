// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ac/ac.proto

package com.proto.ac;

/**
 * Protobuf type {@code ac.ACDetailResponse}
 */
public  final class ACDetailResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ac.ACDetailResponse)
    ACDetailResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ACDetailResponse.newBuilder() to construct.
  private ACDetailResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ACDetailResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ACDetailResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            com.proto.ac.AC_Controller.Builder subBuilder = null;
            if (acController_ != null) {
              subBuilder = acController_.toBuilder();
            }
            acController_ = input.readMessage(com.proto.ac.AC_Controller.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(acController_);
              acController_ = subBuilder.buildPartial();
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
    return com.proto.ac.Ac.internal_static_ac_ACDetailResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.ac.Ac.internal_static_ac_ACDetailResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.ac.ACDetailResponse.class, com.proto.ac.ACDetailResponse.Builder.class);
  }

  public static final int AC_CONTROLLER_FIELD_NUMBER = 1;
  private com.proto.ac.AC_Controller acController_;
  /**
   * <code>.ac.AC_Controller ac_controller = 1;</code>
   */
  public boolean hasAcController() {
    return acController_ != null;
  }
  /**
   * <code>.ac.AC_Controller ac_controller = 1;</code>
   */
  public com.proto.ac.AC_Controller getAcController() {
    return acController_ == null ? com.proto.ac.AC_Controller.getDefaultInstance() : acController_;
  }
  /**
   * <code>.ac.AC_Controller ac_controller = 1;</code>
   */
  public com.proto.ac.AC_ControllerOrBuilder getAcControllerOrBuilder() {
    return getAcController();
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
    if (acController_ != null) {
      output.writeMessage(1, getAcController());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (acController_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAcController());
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
    if (!(obj instanceof com.proto.ac.ACDetailResponse)) {
      return super.equals(obj);
    }
    com.proto.ac.ACDetailResponse other = (com.proto.ac.ACDetailResponse) obj;

    if (hasAcController() != other.hasAcController()) return false;
    if (hasAcController()) {
      if (!getAcController()
          .equals(other.getAcController())) return false;
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
    if (hasAcController()) {
      hash = (37 * hash) + AC_CONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getAcController().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.ac.ACDetailResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.ac.ACDetailResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.ac.ACDetailResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.ac.ACDetailResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.ac.ACDetailResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.ac.ACDetailResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.ac.ACDetailResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.ac.ACDetailResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.ac.ACDetailResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.ac.ACDetailResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.ac.ACDetailResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.ac.ACDetailResponse parseFrom(
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
  public static Builder newBuilder(com.proto.ac.ACDetailResponse prototype) {
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
   * Protobuf type {@code ac.ACDetailResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ac.ACDetailResponse)
      com.proto.ac.ACDetailResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.ac.Ac.internal_static_ac_ACDetailResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.ac.Ac.internal_static_ac_ACDetailResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.ac.ACDetailResponse.class, com.proto.ac.ACDetailResponse.Builder.class);
    }

    // Construct using com.proto.ac.ACDetailResponse.newBuilder()
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
      if (acControllerBuilder_ == null) {
        acController_ = null;
      } else {
        acController_ = null;
        acControllerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.ac.Ac.internal_static_ac_ACDetailResponse_descriptor;
    }

    @java.lang.Override
    public com.proto.ac.ACDetailResponse getDefaultInstanceForType() {
      return com.proto.ac.ACDetailResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.ac.ACDetailResponse build() {
      com.proto.ac.ACDetailResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.ac.ACDetailResponse buildPartial() {
      com.proto.ac.ACDetailResponse result = new com.proto.ac.ACDetailResponse(this);
      if (acControllerBuilder_ == null) {
        result.acController_ = acController_;
      } else {
        result.acController_ = acControllerBuilder_.build();
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
      if (other instanceof com.proto.ac.ACDetailResponse) {
        return mergeFrom((com.proto.ac.ACDetailResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.ac.ACDetailResponse other) {
      if (other == com.proto.ac.ACDetailResponse.getDefaultInstance()) return this;
      if (other.hasAcController()) {
        mergeAcController(other.getAcController());
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
      com.proto.ac.ACDetailResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.ac.ACDetailResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.ac.AC_Controller acController_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.ac.AC_Controller, com.proto.ac.AC_Controller.Builder, com.proto.ac.AC_ControllerOrBuilder> acControllerBuilder_;
    /**
     * <code>.ac.AC_Controller ac_controller = 1;</code>
     */
    public boolean hasAcController() {
      return acControllerBuilder_ != null || acController_ != null;
    }
    /**
     * <code>.ac.AC_Controller ac_controller = 1;</code>
     */
    public com.proto.ac.AC_Controller getAcController() {
      if (acControllerBuilder_ == null) {
        return acController_ == null ? com.proto.ac.AC_Controller.getDefaultInstance() : acController_;
      } else {
        return acControllerBuilder_.getMessage();
      }
    }
    /**
     * <code>.ac.AC_Controller ac_controller = 1;</code>
     */
    public Builder setAcController(com.proto.ac.AC_Controller value) {
      if (acControllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        acController_ = value;
        onChanged();
      } else {
        acControllerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ac.AC_Controller ac_controller = 1;</code>
     */
    public Builder setAcController(
        com.proto.ac.AC_Controller.Builder builderForValue) {
      if (acControllerBuilder_ == null) {
        acController_ = builderForValue.build();
        onChanged();
      } else {
        acControllerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ac.AC_Controller ac_controller = 1;</code>
     */
    public Builder mergeAcController(com.proto.ac.AC_Controller value) {
      if (acControllerBuilder_ == null) {
        if (acController_ != null) {
          acController_ =
            com.proto.ac.AC_Controller.newBuilder(acController_).mergeFrom(value).buildPartial();
        } else {
          acController_ = value;
        }
        onChanged();
      } else {
        acControllerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ac.AC_Controller ac_controller = 1;</code>
     */
    public Builder clearAcController() {
      if (acControllerBuilder_ == null) {
        acController_ = null;
        onChanged();
      } else {
        acController_ = null;
        acControllerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ac.AC_Controller ac_controller = 1;</code>
     */
    public com.proto.ac.AC_Controller.Builder getAcControllerBuilder() {
      
      onChanged();
      return getAcControllerFieldBuilder().getBuilder();
    }
    /**
     * <code>.ac.AC_Controller ac_controller = 1;</code>
     */
    public com.proto.ac.AC_ControllerOrBuilder getAcControllerOrBuilder() {
      if (acControllerBuilder_ != null) {
        return acControllerBuilder_.getMessageOrBuilder();
      } else {
        return acController_ == null ?
            com.proto.ac.AC_Controller.getDefaultInstance() : acController_;
      }
    }
    /**
     * <code>.ac.AC_Controller ac_controller = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.ac.AC_Controller, com.proto.ac.AC_Controller.Builder, com.proto.ac.AC_ControllerOrBuilder> 
        getAcControllerFieldBuilder() {
      if (acControllerBuilder_ == null) {
        acControllerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.ac.AC_Controller, com.proto.ac.AC_Controller.Builder, com.proto.ac.AC_ControllerOrBuilder>(
                getAcController(),
                getParentForChildren(),
                isClean());
        acController_ = null;
      }
      return acControllerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ac.ACDetailResponse)
  }

  // @@protoc_insertion_point(class_scope:ac.ACDetailResponse)
  private static final com.proto.ac.ACDetailResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.ac.ACDetailResponse();
  }

  public static com.proto.ac.ACDetailResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ACDetailResponse>
      PARSER = new com.google.protobuf.AbstractParser<ACDetailResponse>() {
    @java.lang.Override
    public ACDetailResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ACDetailResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ACDetailResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ACDetailResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.ac.ACDetailResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

