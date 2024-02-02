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
// source: google/cloud/netapp/v1/active_directory.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * UpdateActiveDirectoryRequest for updating an active directory.
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.UpdateActiveDirectoryRequest}
 */
public final class UpdateActiveDirectoryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.UpdateActiveDirectoryRequest)
    UpdateActiveDirectoryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateActiveDirectoryRequest.newBuilder() to construct.
  private UpdateActiveDirectoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateActiveDirectoryRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateActiveDirectoryRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.ActiveDirectoryProto
        .internal_static_google_cloud_netapp_v1_UpdateActiveDirectoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.ActiveDirectoryProto
        .internal_static_google_cloud_netapp_v1_UpdateActiveDirectoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest.class,
            com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest.Builder.class);
  }

  private int bitField0_;
  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Active Directory resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Active Directory resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Active Directory resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int ACTIVE_DIRECTORY_FIELD_NUMBER = 2;
  private com.google.cloud.netapp.v1.ActiveDirectory activeDirectory_;
  /**
   *
   *
   * <pre>
   * Required. The volume being updated
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the activeDirectory field is set.
   */
  @java.lang.Override
  public boolean hasActiveDirectory() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The volume being updated
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The activeDirectory.
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.ActiveDirectory getActiveDirectory() {
    return activeDirectory_ == null
        ? com.google.cloud.netapp.v1.ActiveDirectory.getDefaultInstance()
        : activeDirectory_;
  }
  /**
   *
   *
   * <pre>
   * Required. The volume being updated
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.ActiveDirectoryOrBuilder getActiveDirectoryOrBuilder() {
    return activeDirectory_ == null
        ? com.google.cloud.netapp.v1.ActiveDirectory.getDefaultInstance()
        : activeDirectory_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getUpdateMask());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getActiveDirectory());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateMask());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getActiveDirectory());
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
    if (!(obj instanceof com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest other =
        (com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasActiveDirectory() != other.hasActiveDirectory()) return false;
    if (hasActiveDirectory()) {
      if (!getActiveDirectory().equals(other.getActiveDirectory())) return false;
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasActiveDirectory()) {
      hash = (37 * hash) + ACTIVE_DIRECTORY_FIELD_NUMBER;
      hash = (53 * hash) + getActiveDirectory().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest parseFrom(
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
      com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest prototype) {
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
   * UpdateActiveDirectoryRequest for updating an active directory.
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.UpdateActiveDirectoryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.UpdateActiveDirectoryRequest)
      com.google.cloud.netapp.v1.UpdateActiveDirectoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.ActiveDirectoryProto
          .internal_static_google_cloud_netapp_v1_UpdateActiveDirectoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.ActiveDirectoryProto
          .internal_static_google_cloud_netapp_v1_UpdateActiveDirectoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest.class,
              com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUpdateMaskFieldBuilder();
        getActiveDirectoryFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      activeDirectory_ = null;
      if (activeDirectoryBuilder_ != null) {
        activeDirectoryBuilder_.dispose();
        activeDirectoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.ActiveDirectoryProto
          .internal_static_google_cloud_netapp_v1_UpdateActiveDirectoryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest build() {
      com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest buildPartial() {
      com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest result =
          new com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.activeDirectory_ =
            activeDirectoryBuilder_ == null ? activeDirectory_ : activeDirectoryBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest) {
        return mergeFrom((com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest other) {
      if (other == com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasActiveDirectory()) {
        mergeActiveDirectory(other.getActiveDirectory());
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
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getActiveDirectoryFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Active Directory resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Active Directory resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Active Directory resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Active Directory resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Active Directory resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Active Directory resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Active Directory resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Active Directory resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Active Directory resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.cloud.netapp.v1.ActiveDirectory activeDirectory_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1.ActiveDirectory,
            com.google.cloud.netapp.v1.ActiveDirectory.Builder,
            com.google.cloud.netapp.v1.ActiveDirectoryOrBuilder>
        activeDirectoryBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The volume being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the activeDirectory field is set.
     */
    public boolean hasActiveDirectory() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The activeDirectory.
     */
    public com.google.cloud.netapp.v1.ActiveDirectory getActiveDirectory() {
      if (activeDirectoryBuilder_ == null) {
        return activeDirectory_ == null
            ? com.google.cloud.netapp.v1.ActiveDirectory.getDefaultInstance()
            : activeDirectory_;
      } else {
        return activeDirectoryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setActiveDirectory(com.google.cloud.netapp.v1.ActiveDirectory value) {
      if (activeDirectoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        activeDirectory_ = value;
      } else {
        activeDirectoryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setActiveDirectory(
        com.google.cloud.netapp.v1.ActiveDirectory.Builder builderForValue) {
      if (activeDirectoryBuilder_ == null) {
        activeDirectory_ = builderForValue.build();
      } else {
        activeDirectoryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeActiveDirectory(com.google.cloud.netapp.v1.ActiveDirectory value) {
      if (activeDirectoryBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && activeDirectory_ != null
            && activeDirectory_
                != com.google.cloud.netapp.v1.ActiveDirectory.getDefaultInstance()) {
          getActiveDirectoryBuilder().mergeFrom(value);
        } else {
          activeDirectory_ = value;
        }
      } else {
        activeDirectoryBuilder_.mergeFrom(value);
      }
      if (activeDirectory_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearActiveDirectory() {
      bitField0_ = (bitField0_ & ~0x00000002);
      activeDirectory_ = null;
      if (activeDirectoryBuilder_ != null) {
        activeDirectoryBuilder_.dispose();
        activeDirectoryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.ActiveDirectory.Builder getActiveDirectoryBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getActiveDirectoryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.ActiveDirectoryOrBuilder getActiveDirectoryOrBuilder() {
      if (activeDirectoryBuilder_ != null) {
        return activeDirectoryBuilder_.getMessageOrBuilder();
      } else {
        return activeDirectory_ == null
            ? com.google.cloud.netapp.v1.ActiveDirectory.getDefaultInstance()
            : activeDirectory_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The volume being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.ActiveDirectory active_directory = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1.ActiveDirectory,
            com.google.cloud.netapp.v1.ActiveDirectory.Builder,
            com.google.cloud.netapp.v1.ActiveDirectoryOrBuilder>
        getActiveDirectoryFieldBuilder() {
      if (activeDirectoryBuilder_ == null) {
        activeDirectoryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.netapp.v1.ActiveDirectory,
                com.google.cloud.netapp.v1.ActiveDirectory.Builder,
                com.google.cloud.netapp.v1.ActiveDirectoryOrBuilder>(
                getActiveDirectory(), getParentForChildren(), isClean());
        activeDirectory_ = null;
      }
      return activeDirectoryBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.UpdateActiveDirectoryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.UpdateActiveDirectoryRequest)
  private static final com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest();
  }

  public static com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateActiveDirectoryRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateActiveDirectoryRequest>() {
        @java.lang.Override
        public UpdateActiveDirectoryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateActiveDirectoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateActiveDirectoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.UpdateActiveDirectoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
