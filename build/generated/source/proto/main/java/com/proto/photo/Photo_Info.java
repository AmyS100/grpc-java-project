// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: photo/photo.proto

package com.proto.photo;

/**
 * Protobuf type {@code photo.Photo_Info}
 */
public  final class Photo_Info extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:photo.Photo_Info)
    Photo_InfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Photo_Info.newBuilder() to construct.
  private Photo_Info(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Photo_Info() {
    photo_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Photo_Info(
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
          case 8: {

            deviceId_ = input.readInt32();
            break;
          }
          case 16: {

            photoId_ = input.readInt32();
            break;
          }
          case 26: {

            photo_ = input.readBytes();
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
    return com.proto.photo.Photo.internal_static_photo_Photo_Info_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.photo.Photo.internal_static_photo_Photo_Info_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.photo.Photo_Info.class, com.proto.photo.Photo_Info.Builder.class);
  }

  public static final int DEVICE_ID_FIELD_NUMBER = 1;
  private int deviceId_;
  /**
   * <code>int32 device_id = 1;</code>
   */
  public int getDeviceId() {
    return deviceId_;
  }

  public static final int PHOTO_ID_FIELD_NUMBER = 2;
  private int photoId_;
  /**
   * <code>int32 photo_id = 2;</code>
   */
  public int getPhotoId() {
    return photoId_;
  }

  public static final int PHOTO_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString photo_;
  /**
   * <code>bytes photo = 3;</code>
   */
  public com.google.protobuf.ByteString getPhoto() {
    return photo_;
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
    if (deviceId_ != 0) {
      output.writeInt32(1, deviceId_);
    }
    if (photoId_ != 0) {
      output.writeInt32(2, photoId_);
    }
    if (!photo_.isEmpty()) {
      output.writeBytes(3, photo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deviceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, deviceId_);
    }
    if (photoId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, photoId_);
    }
    if (!photo_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, photo_);
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
    if (!(obj instanceof com.proto.photo.Photo_Info)) {
      return super.equals(obj);
    }
    com.proto.photo.Photo_Info other = (com.proto.photo.Photo_Info) obj;

    if (getDeviceId()
        != other.getDeviceId()) return false;
    if (getPhotoId()
        != other.getPhotoId()) return false;
    if (!getPhoto()
        .equals(other.getPhoto())) return false;
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
    hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceId();
    hash = (37 * hash) + PHOTO_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPhotoId();
    hash = (37 * hash) + PHOTO_FIELD_NUMBER;
    hash = (53 * hash) + getPhoto().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.photo.Photo_Info parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.photo.Photo_Info parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.photo.Photo_Info parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.photo.Photo_Info parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.photo.Photo_Info parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.photo.Photo_Info parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.photo.Photo_Info parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.photo.Photo_Info parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.photo.Photo_Info parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.photo.Photo_Info parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.photo.Photo_Info parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.photo.Photo_Info parseFrom(
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
  public static Builder newBuilder(com.proto.photo.Photo_Info prototype) {
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
   * Protobuf type {@code photo.Photo_Info}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:photo.Photo_Info)
      com.proto.photo.Photo_InfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.photo.Photo.internal_static_photo_Photo_Info_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.photo.Photo.internal_static_photo_Photo_Info_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.photo.Photo_Info.class, com.proto.photo.Photo_Info.Builder.class);
    }

    // Construct using com.proto.photo.Photo_Info.newBuilder()
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
      deviceId_ = 0;

      photoId_ = 0;

      photo_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.photo.Photo.internal_static_photo_Photo_Info_descriptor;
    }

    @java.lang.Override
    public com.proto.photo.Photo_Info getDefaultInstanceForType() {
      return com.proto.photo.Photo_Info.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.photo.Photo_Info build() {
      com.proto.photo.Photo_Info result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.photo.Photo_Info buildPartial() {
      com.proto.photo.Photo_Info result = new com.proto.photo.Photo_Info(this);
      result.deviceId_ = deviceId_;
      result.photoId_ = photoId_;
      result.photo_ = photo_;
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
      if (other instanceof com.proto.photo.Photo_Info) {
        return mergeFrom((com.proto.photo.Photo_Info)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.photo.Photo_Info other) {
      if (other == com.proto.photo.Photo_Info.getDefaultInstance()) return this;
      if (other.getDeviceId() != 0) {
        setDeviceId(other.getDeviceId());
      }
      if (other.getPhotoId() != 0) {
        setPhotoId(other.getPhotoId());
      }
      if (other.getPhoto() != com.google.protobuf.ByteString.EMPTY) {
        setPhoto(other.getPhoto());
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
      com.proto.photo.Photo_Info parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.photo.Photo_Info) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int deviceId_ ;
    /**
     * <code>int32 device_id = 1;</code>
     */
    public int getDeviceId() {
      return deviceId_;
    }
    /**
     * <code>int32 device_id = 1;</code>
     */
    public Builder setDeviceId(int value) {
      
      deviceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 device_id = 1;</code>
     */
    public Builder clearDeviceId() {
      
      deviceId_ = 0;
      onChanged();
      return this;
    }

    private int photoId_ ;
    /**
     * <code>int32 photo_id = 2;</code>
     */
    public int getPhotoId() {
      return photoId_;
    }
    /**
     * <code>int32 photo_id = 2;</code>
     */
    public Builder setPhotoId(int value) {
      
      photoId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 photo_id = 2;</code>
     */
    public Builder clearPhotoId() {
      
      photoId_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString photo_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes photo = 3;</code>
     */
    public com.google.protobuf.ByteString getPhoto() {
      return photo_;
    }
    /**
     * <code>bytes photo = 3;</code>
     */
    public Builder setPhoto(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      photo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes photo = 3;</code>
     */
    public Builder clearPhoto() {
      
      photo_ = getDefaultInstance().getPhoto();
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


    // @@protoc_insertion_point(builder_scope:photo.Photo_Info)
  }

  // @@protoc_insertion_point(class_scope:photo.Photo_Info)
  private static final com.proto.photo.Photo_Info DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.photo.Photo_Info();
  }

  public static com.proto.photo.Photo_Info getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Photo_Info>
      PARSER = new com.google.protobuf.AbstractParser<Photo_Info>() {
    @java.lang.Override
    public Photo_Info parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Photo_Info(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Photo_Info> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Photo_Info> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.photo.Photo_Info getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
