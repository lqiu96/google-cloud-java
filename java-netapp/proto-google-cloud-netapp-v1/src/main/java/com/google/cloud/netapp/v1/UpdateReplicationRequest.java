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
// source: google/cloud/netapp/v1/replication.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * UpdateReplicationRequest updates description and/or labels for a replication.
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.UpdateReplicationRequest}
 */
public final class UpdateReplicationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.UpdateReplicationRequest)
    UpdateReplicationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateReplicationRequest.newBuilder() to construct.
  private UpdateReplicationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateReplicationRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateReplicationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.ReplicationProto
        .internal_static_google_cloud_netapp_v1_UpdateReplicationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.ReplicationProto
        .internal_static_google_cloud_netapp_v1_UpdateReplicationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.UpdateReplicationRequest.class,
            com.google.cloud.netapp.v1.UpdateReplicationRequest.Builder.class);
  }

  private int bitField0_;
  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
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
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
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
   * Required. Mask of fields to update.  At least one path must be supplied in
   * this field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int REPLICATION_FIELD_NUMBER = 2;
  private com.google.cloud.netapp.v1.Replication replication_;
  /**
   *
   *
   * <pre>
   * Required. A replication resource
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the replication field is set.
   */
  @java.lang.Override
  public boolean hasReplication() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. A replication resource
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The replication.
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.Replication getReplication() {
    return replication_ == null
        ? com.google.cloud.netapp.v1.Replication.getDefaultInstance()
        : replication_;
  }
  /**
   *
   *
   * <pre>
   * Required. A replication resource
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.ReplicationOrBuilder getReplicationOrBuilder() {
    return replication_ == null
        ? com.google.cloud.netapp.v1.Replication.getDefaultInstance()
        : replication_;
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
      output.writeMessage(2, getReplication());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReplication());
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
    if (!(obj instanceof com.google.cloud.netapp.v1.UpdateReplicationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.UpdateReplicationRequest other =
        (com.google.cloud.netapp.v1.UpdateReplicationRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasReplication() != other.hasReplication()) return false;
    if (hasReplication()) {
      if (!getReplication().equals(other.getReplication())) return false;
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
    if (hasReplication()) {
      hash = (37 * hash) + REPLICATION_FIELD_NUMBER;
      hash = (53 * hash) + getReplication().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.netapp.v1.UpdateReplicationRequest prototype) {
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
   * UpdateReplicationRequest updates description and/or labels for a replication.
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.UpdateReplicationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.UpdateReplicationRequest)
      com.google.cloud.netapp.v1.UpdateReplicationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.ReplicationProto
          .internal_static_google_cloud_netapp_v1_UpdateReplicationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.ReplicationProto
          .internal_static_google_cloud_netapp_v1_UpdateReplicationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.UpdateReplicationRequest.class,
              com.google.cloud.netapp.v1.UpdateReplicationRequest.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.UpdateReplicationRequest.newBuilder()
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
        getReplicationFieldBuilder();
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
      replication_ = null;
      if (replicationBuilder_ != null) {
        replicationBuilder_.dispose();
        replicationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.ReplicationProto
          .internal_static_google_cloud_netapp_v1_UpdateReplicationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.UpdateReplicationRequest getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.UpdateReplicationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.UpdateReplicationRequest build() {
      com.google.cloud.netapp.v1.UpdateReplicationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.UpdateReplicationRequest buildPartial() {
      com.google.cloud.netapp.v1.UpdateReplicationRequest result =
          new com.google.cloud.netapp.v1.UpdateReplicationRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.UpdateReplicationRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.replication_ =
            replicationBuilder_ == null ? replication_ : replicationBuilder_.build();
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
      if (other instanceof com.google.cloud.netapp.v1.UpdateReplicationRequest) {
        return mergeFrom((com.google.cloud.netapp.v1.UpdateReplicationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.UpdateReplicationRequest other) {
      if (other == com.google.cloud.netapp.v1.UpdateReplicationRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasReplication()) {
        mergeReplication(other.getReplication());
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
                input.readMessage(getReplicationFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
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
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
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
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
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
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
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
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
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
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
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
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
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
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
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
     * Required. Mask of fields to update.  At least one path must be supplied in
     * this field.
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

    private com.google.cloud.netapp.v1.Replication replication_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1.Replication,
            com.google.cloud.netapp.v1.Replication.Builder,
            com.google.cloud.netapp.v1.ReplicationOrBuilder>
        replicationBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A replication resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the replication field is set.
     */
    public boolean hasReplication() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A replication resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The replication.
     */
    public com.google.cloud.netapp.v1.Replication getReplication() {
      if (replicationBuilder_ == null) {
        return replication_ == null
            ? com.google.cloud.netapp.v1.Replication.getDefaultInstance()
            : replication_;
      } else {
        return replicationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A replication resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReplication(com.google.cloud.netapp.v1.Replication value) {
      if (replicationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        replication_ = value;
      } else {
        replicationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A replication resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReplication(com.google.cloud.netapp.v1.Replication.Builder builderForValue) {
      if (replicationBuilder_ == null) {
        replication_ = builderForValue.build();
      } else {
        replicationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A replication resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeReplication(com.google.cloud.netapp.v1.Replication value) {
      if (replicationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && replication_ != null
            && replication_ != com.google.cloud.netapp.v1.Replication.getDefaultInstance()) {
          getReplicationBuilder().mergeFrom(value);
        } else {
          replication_ = value;
        }
      } else {
        replicationBuilder_.mergeFrom(value);
      }
      if (replication_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A replication resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearReplication() {
      bitField0_ = (bitField0_ & ~0x00000002);
      replication_ = null;
      if (replicationBuilder_ != null) {
        replicationBuilder_.dispose();
        replicationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A replication resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.Replication.Builder getReplicationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReplicationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A replication resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.ReplicationOrBuilder getReplicationOrBuilder() {
      if (replicationBuilder_ != null) {
        return replicationBuilder_.getMessageOrBuilder();
      } else {
        return replication_ == null
            ? com.google.cloud.netapp.v1.Replication.getDefaultInstance()
            : replication_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A replication resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.Replication replication = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1.Replication,
            com.google.cloud.netapp.v1.Replication.Builder,
            com.google.cloud.netapp.v1.ReplicationOrBuilder>
        getReplicationFieldBuilder() {
      if (replicationBuilder_ == null) {
        replicationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.netapp.v1.Replication,
                com.google.cloud.netapp.v1.Replication.Builder,
                com.google.cloud.netapp.v1.ReplicationOrBuilder>(
                getReplication(), getParentForChildren(), isClean());
        replication_ = null;
      }
      return replicationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.UpdateReplicationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.UpdateReplicationRequest)
  private static final com.google.cloud.netapp.v1.UpdateReplicationRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.UpdateReplicationRequest();
  }

  public static com.google.cloud.netapp.v1.UpdateReplicationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateReplicationRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateReplicationRequest>() {
        @java.lang.Override
        public UpdateReplicationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateReplicationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateReplicationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.UpdateReplicationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
