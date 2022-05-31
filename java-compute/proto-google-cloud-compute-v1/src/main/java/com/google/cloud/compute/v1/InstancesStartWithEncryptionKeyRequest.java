/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest}
 */
public final class InstancesStartWithEncryptionKeyRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest)
    InstancesStartWithEncryptionKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstancesStartWithEncryptionKeyRequest.newBuilder() to construct.
  private InstancesStartWithEncryptionKeyRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstancesStartWithEncryptionKeyRequest() {
    disks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstancesStartWithEncryptionKeyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InstancesStartWithEncryptionKeyRequest(
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
          case 764752818:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                disks_ =
                    new java.util.ArrayList<
                        com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk>();
                mutable_bitField0_ |= 0x00000001;
              }
              disks_.add(
                  input.readMessage(
                      com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.parser(),
                      extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        disks_ = java.util.Collections.unmodifiableList(disks_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstancesStartWithEncryptionKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstancesStartWithEncryptionKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest.class,
            com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest.Builder.class);
  }

  public static final int DISKS_FIELD_NUMBER = 95594102;
  private java.util.List<com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk> disks_;
  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk>
      getDisksList() {
    return disks_;
  }
  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDiskOrBuilder>
      getDisksOrBuilderList() {
    return disks_;
  }
  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
   * </code>
   */
  @java.lang.Override
  public int getDisksCount() {
    return disks_.size();
  }
  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk getDisks(int index) {
    return disks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDiskOrBuilder getDisksOrBuilder(
      int index) {
    return disks_.get(index);
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
    for (int i = 0; i < disks_.size(); i++) {
      output.writeMessage(95594102, disks_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < disks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(95594102, disks_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest other =
        (com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest) obj;

    if (!getDisksList().equals(other.getDisksList())) return false;
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
    if (getDisksCount() > 0) {
      hash = (37 * hash) + DISKS_FIELD_NUMBER;
      hash = (53 * hash) + getDisksList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest)
      com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesStartWithEncryptionKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesStartWithEncryptionKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest.class,
              com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDisksFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (disksBuilder_ == null) {
        disks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        disksBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesStartWithEncryptionKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest build() {
      com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest buildPartial() {
      com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest result =
          new com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest(this);
      int from_bitField0_ = bitField0_;
      if (disksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          disks_ = java.util.Collections.unmodifiableList(disks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.disks_ = disks_;
      } else {
        result.disks_ = disksBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest) {
        return mergeFrom(
            (com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest other) {
      if (other
          == com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest
              .getDefaultInstance()) return this;
      if (disksBuilder_ == null) {
        if (!other.disks_.isEmpty()) {
          if (disks_.isEmpty()) {
            disks_ = other.disks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDisksIsMutable();
            disks_.addAll(other.disks_);
          }
          onChanged();
        }
      } else {
        if (!other.disks_.isEmpty()) {
          if (disksBuilder_.isEmpty()) {
            disksBuilder_.dispose();
            disksBuilder_ = null;
            disks_ = other.disks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            disksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDisksFieldBuilder()
                    : null;
          } else {
            disksBuilder_.addAllMessages(other.disks_);
          }
        }
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
      com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk> disks_ =
        java.util.Collections.emptyList();

    private void ensureDisksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        disks_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk>(
                disks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk,
            com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder,
            com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDiskOrBuilder>
        disksBuilder_;

    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk>
        getDisksList() {
      if (disksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(disks_);
      } else {
        return disksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public int getDisksCount() {
      if (disksBuilder_ == null) {
        return disks_.size();
      } else {
        return disksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk getDisks(int index) {
      if (disksBuilder_ == null) {
        return disks_.get(index);
      } else {
        return disksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public Builder setDisks(
        int index, com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk value) {
      if (disksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDisksIsMutable();
        disks_.set(index, value);
        onChanged();
      } else {
        disksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public Builder setDisks(
        int index,
        com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder builderForValue) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.set(index, builderForValue.build());
        onChanged();
      } else {
        disksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public Builder addDisks(com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk value) {
      if (disksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDisksIsMutable();
        disks_.add(value);
        onChanged();
      } else {
        disksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public Builder addDisks(
        int index, com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk value) {
      if (disksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDisksIsMutable();
        disks_.add(index, value);
        onChanged();
      } else {
        disksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public Builder addDisks(
        com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder builderForValue) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.add(builderForValue.build());
        onChanged();
      } else {
        disksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public Builder addDisks(
        int index,
        com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder builderForValue) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.add(index, builderForValue.build());
        onChanged();
      } else {
        disksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public Builder addAllDisks(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk>
            values) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, disks_);
        onChanged();
      } else {
        disksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public Builder clearDisks() {
      if (disksBuilder_ == null) {
        disks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        disksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public Builder removeDisks(int index) {
      if (disksBuilder_ == null) {
        ensureDisksIsMutable();
        disks_.remove(index);
        onChanged();
      } else {
        disksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder getDisksBuilder(
        int index) {
      return getDisksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDiskOrBuilder
        getDisksOrBuilder(int index) {
      if (disksBuilder_ == null) {
        return disks_.get(index);
      } else {
        return disksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDiskOrBuilder>
        getDisksOrBuilderList() {
      if (disksBuilder_ != null) {
        return disksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(disks_);
      }
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder
        addDisksBuilder() {
      return getDisksFieldBuilder()
          .addBuilder(
              com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder addDisksBuilder(
        int index) {
      return getDisksFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder>
        getDisksBuilderList() {
      return getDisksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk,
            com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder,
            com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDiskOrBuilder>
        getDisksFieldBuilder() {
      if (disksBuilder_ == null) {
        disksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk,
                com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk.Builder,
                com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDiskOrBuilder>(
                disks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        disks_ = null;
      }
      return disksBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest)
  private static final com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest();
  }

  public static com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstancesStartWithEncryptionKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<InstancesStartWithEncryptionKeyRequest>() {
        @java.lang.Override
        public InstancesStartWithEncryptionKeyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InstancesStartWithEncryptionKeyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InstancesStartWithEncryptionKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstancesStartWithEncryptionKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
