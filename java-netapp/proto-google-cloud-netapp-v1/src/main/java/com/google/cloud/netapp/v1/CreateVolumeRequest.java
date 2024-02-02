/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * Message for creating a Volume
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.CreateVolumeRequest}
 */
public final class CreateVolumeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.CreateVolumeRequest)
    CreateVolumeRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateVolumeRequest.newBuilder() to construct.
  private CreateVolumeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateVolumeRequest() {
    parent_ = "";
    volumeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateVolumeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_CreateVolumeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_CreateVolumeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.CreateVolumeRequest.class,
            com.google.cloud.netapp.v1.CreateVolumeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VOLUME_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object volumeId_ = "";
  /**
   *
   *
   * <pre>
   * Required. Id of the requesting volume
   * If auto-generating Id server-side, remove this field and
   * Id from the method_signature of Create RPC
   * </pre>
   *
   * <code>string volume_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The volumeId.
   */
  @java.lang.Override
  public java.lang.String getVolumeId() {
    java.lang.Object ref = volumeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      volumeId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Id of the requesting volume
   * If auto-generating Id server-side, remove this field and
   * Id from the method_signature of Create RPC
   * </pre>
   *
   * <code>string volume_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for volumeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVolumeIdBytes() {
    java.lang.Object ref = volumeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      volumeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VOLUME_FIELD_NUMBER = 3;
  private com.google.cloud.netapp.v1.Volume volume_;
  /**
   *
   *
   * <pre>
   * Required. The volume being created.
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the volume field is set.
   */
  @java.lang.Override
  public boolean hasVolume() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The volume being created.
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The volume.
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.Volume getVolume() {
    return volume_ == null ? com.google.cloud.netapp.v1.Volume.getDefaultInstance() : volume_;
  }
  /**
   *
   *
   * <pre>
   * Required. The volume being created.
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.VolumeOrBuilder getVolumeOrBuilder() {
    return volume_ == null ? com.google.cloud.netapp.v1.Volume.getDefaultInstance() : volume_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volumeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, volumeId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getVolume());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volumeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, volumeId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getVolume());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.netapp.v1.CreateVolumeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.CreateVolumeRequest other =
        (com.google.cloud.netapp.v1.CreateVolumeRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getVolumeId().equals(other.getVolumeId())) return false;
    if (hasVolume() != other.hasVolume()) return false;
    if (hasVolume()) {
      if (!getVolume().equals(other.getVolume())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + VOLUME_ID_FIELD_NUMBER;
    hash = (53 * hash) + getVolumeId().hashCode();
    if (hasVolume()) {
      hash = (37 * hash) + VOLUME_FIELD_NUMBER;
      hash = (53 * hash) + getVolume().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.netapp.v1.CreateVolumeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Message for creating a Volume
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.CreateVolumeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.CreateVolumeRequest)
      com.google.cloud.netapp.v1.CreateVolumeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_CreateVolumeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_CreateVolumeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.CreateVolumeRequest.class,
              com.google.cloud.netapp.v1.CreateVolumeRequest.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.CreateVolumeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getVolumeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      volumeId_ = "";
      volume_ = null;
      if (volumeBuilder_ != null) {
        volumeBuilder_.dispose();
        volumeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_CreateVolumeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.CreateVolumeRequest getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.CreateVolumeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.CreateVolumeRequest build() {
      com.google.cloud.netapp.v1.CreateVolumeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.CreateVolumeRequest buildPartial() {
      com.google.cloud.netapp.v1.CreateVolumeRequest result =
          new com.google.cloud.netapp.v1.CreateVolumeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.CreateVolumeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.volumeId_ = volumeId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.volume_ = volumeBuilder_ == null ? volume_ : volumeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.netapp.v1.CreateVolumeRequest) {
        return mergeFrom((com.google.cloud.netapp.v1.CreateVolumeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.CreateVolumeRequest other) {
      if (other == com.google.cloud.netapp.v1.CreateVolumeRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getVolumeId().isEmpty()) {
        volumeId_ = other.volumeId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasVolume()) {
        mergeVolume(other.getVolume());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                volumeId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getVolumeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object volumeId_ = "";
    /**
     *
     *
     * <pre>
     * Required. Id of the requesting volume
     * If auto-generating Id server-side, remove this field and
     * Id from the method_signature of Create RPC
     * </pre>
     *
     * <code>string volume_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The volumeId.
     */
    public java.lang.String getVolumeId() {
      java.lang.Object ref = volumeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        volumeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Id of the requesting volume
     * If auto-generating Id server-side, remove this field and
     * Id from the method_signature of Create RPC
     * </pre>
     *
     * <code>string volume_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for volumeId.
     */
    public com.google.protobuf.ByteString getVolumeIdBytes() {
      java.lang.Object ref = volumeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        volumeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Id of the requesting volume
     * If auto-generating Id server-side, remove this field and
     * Id from the method_signature of Create RPC
     * </pre>
     *
     * <code>string volume_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The volumeId to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      volumeId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Id of the requesting volume
     * If auto-generating Id server-side, remove this field and
     * Id from the method_signature of Create RPC
     * </pre>
     *
     * <code>string volume_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVolumeId() {
      volumeId_ = getDefaultInstance().getVolumeId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Id of the requesting volume
     * If auto-generating Id server-side, remove this field and
     * Id from the method_signature of Create RPC
     * </pre>
     *
     * <code>string volume_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for volumeId to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      volumeId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.netapp.v1.Volume volume_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1.Volume,
            com.google.cloud.netapp.v1.Volume.Builder,
            com.google.cloud.netapp.v1.VolumeOrBuilder>
        volumeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The volume being created.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the volume field is set.
     */
    public boolean hasVolume() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being created.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The volume.
     */
    public com.google.cloud.netapp.v1.Volume getVolume() {
      if (volumeBuilder_ == null) {
        return volume_ == null ? com.google.cloud.netapp.v1.Volume.getDefaultInstance() : volume_;
      } else {
        return volumeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being created.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setVolume(com.google.cloud.netapp.v1.Volume value) {
      if (volumeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        volume_ = value;
      } else {
        volumeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being created.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setVolume(com.google.cloud.netapp.v1.Volume.Builder builderForValue) {
      if (volumeBuilder_ == null) {
        volume_ = builderForValue.build();
      } else {
        volumeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being created.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeVolume(com.google.cloud.netapp.v1.Volume value) {
      if (volumeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && volume_ != null
            && volume_ != com.google.cloud.netapp.v1.Volume.getDefaultInstance()) {
          getVolumeBuilder().mergeFrom(value);
        } else {
          volume_ = value;
        }
      } else {
        volumeBuilder_.mergeFrom(value);
      }
      if (volume_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being created.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearVolume() {
      bitField0_ = (bitField0_ & ~0x00000004);
      volume_ = null;
      if (volumeBuilder_ != null) {
        volumeBuilder_.dispose();
        volumeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being created.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.Volume.Builder getVolumeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getVolumeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being created.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.VolumeOrBuilder getVolumeOrBuilder() {
      if (volumeBuilder_ != null) {
        return volumeBuilder_.getMessageOrBuilder();
      } else {
        return volume_ == null ? com.google.cloud.netapp.v1.Volume.getDefaultInstance() : volume_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being created.
     * </pre>
     *
     * <code>.google.cloud.netapp.v1.Volume volume = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1.Volume,
            com.google.cloud.netapp.v1.Volume.Builder,
            com.google.cloud.netapp.v1.VolumeOrBuilder>
        getVolumeFieldBuilder() {
      if (volumeBuilder_ == null) {
        volumeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.netapp.v1.Volume,
                com.google.cloud.netapp.v1.Volume.Builder,
                com.google.cloud.netapp.v1.VolumeOrBuilder>(
                getVolume(), getParentForChildren(), isClean());
        volume_ = null;
      }
      return volumeBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.CreateVolumeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.CreateVolumeRequest)
  private static final com.google.cloud.netapp.v1.CreateVolumeRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.CreateVolumeRequest();
  }

  public static com.google.cloud.netapp.v1.CreateVolumeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateVolumeRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateVolumeRequest>() {
        @java.lang.Override
        public CreateVolumeRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CreateVolumeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateVolumeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.CreateVolumeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
