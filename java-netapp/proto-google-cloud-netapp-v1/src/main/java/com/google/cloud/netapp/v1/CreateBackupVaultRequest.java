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
// source: google/cloud/netapp/v1/backup_vault.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * CreateBackupVaultRequest creates a backup vault.
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.CreateBackupVaultRequest}
 */
public final class CreateBackupVaultRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.CreateBackupVaultRequest)
    CreateBackupVaultRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateBackupVaultRequest.newBuilder() to construct.
  private CreateBackupVaultRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateBackupVaultRequest() {
    parent_ = "";
    backupVaultId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateBackupVaultRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.BackupVaultProto
        .internal_static_google_cloud_netapp_v1_CreateBackupVaultRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.BackupVaultProto
        .internal_static_google_cloud_netapp_v1_CreateBackupVaultRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.CreateBackupVaultRequest.class,
            com.google.cloud.netapp.v1.CreateBackupVaultRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The location to create the backup vaults, in the format
   * `projects/{project_id}/locations/{location}`
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
   * Required. The location to create the backup vaults, in the format
   * `projects/{project_id}/locations/{location}`
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

  public static final int BACKUP_VAULT_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object backupVaultId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the backupVault.
   * The ID must be unique within the specified location.
   * The max supported length is 63 characters.
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * Values that do not match this pattern will trigger an INVALID_ARGUMENT
   * error.
   * </pre>
   *
   * <code>string backup_vault_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backupVaultId.
   */
  @java.lang.Override
  public java.lang.String getBackupVaultId() {
    java.lang.Object ref = backupVaultId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backupVaultId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the backupVault.
   * The ID must be unique within the specified location.
   * The max supported length is 63 characters.
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * Values that do not match this pattern will trigger an INVALID_ARGUMENT
   * error.
   * </pre>
   *
   * <code>string backup_vault_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backupVaultId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBackupVaultIdBytes() {
    java.lang.Object ref = backupVaultId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      backupVaultId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BACKUP_VAULT_FIELD_NUMBER = 3;
  private com.google.cloud.netapp.v1.BackupVault backupVault_;
  /**
   *
   *
   * <pre>
   * Required. A backupVault resource
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the backupVault field is set.
   */
  @java.lang.Override
  public boolean hasBackupVault() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. A backupVault resource
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The backupVault.
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.BackupVault getBackupVault() {
    return backupVault_ == null
        ? com.google.cloud.netapp.v1.BackupVault.getDefaultInstance()
        : backupVault_;
  }
  /**
   *
   *
   * <pre>
   * Required. A backupVault resource
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.BackupVaultOrBuilder getBackupVaultOrBuilder() {
    return backupVault_ == null
        ? com.google.cloud.netapp.v1.BackupVault.getDefaultInstance()
        : backupVault_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backupVaultId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, backupVaultId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getBackupVault());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(backupVaultId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, backupVaultId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getBackupVault());
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
    if (!(obj instanceof com.google.cloud.netapp.v1.CreateBackupVaultRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.CreateBackupVaultRequest other =
        (com.google.cloud.netapp.v1.CreateBackupVaultRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getBackupVaultId().equals(other.getBackupVaultId())) return false;
    if (hasBackupVault() != other.hasBackupVault()) return false;
    if (hasBackupVault()) {
      if (!getBackupVault().equals(other.getBackupVault())) return false;
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
    hash = (37 * hash) + BACKUP_VAULT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBackupVaultId().hashCode();
    if (hasBackupVault()) {
      hash = (37 * hash) + BACKUP_VAULT_FIELD_NUMBER;
      hash = (53 * hash) + getBackupVault().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.netapp.v1.CreateBackupVaultRequest prototype) {
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
   * CreateBackupVaultRequest creates a backup vault.
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.CreateBackupVaultRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.CreateBackupVaultRequest)
      com.google.cloud.netapp.v1.CreateBackupVaultRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.BackupVaultProto
          .internal_static_google_cloud_netapp_v1_CreateBackupVaultRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.BackupVaultProto
          .internal_static_google_cloud_netapp_v1_CreateBackupVaultRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.CreateBackupVaultRequest.class,
              com.google.cloud.netapp.v1.CreateBackupVaultRequest.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.CreateBackupVaultRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getBackupVaultFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      backupVaultId_ = "";
      backupVault_ = null;
      if (backupVaultBuilder_ != null) {
        backupVaultBuilder_.dispose();
        backupVaultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.BackupVaultProto
          .internal_static_google_cloud_netapp_v1_CreateBackupVaultRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.CreateBackupVaultRequest getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.CreateBackupVaultRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.CreateBackupVaultRequest build() {
      com.google.cloud.netapp.v1.CreateBackupVaultRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.CreateBackupVaultRequest buildPartial() {
      com.google.cloud.netapp.v1.CreateBackupVaultRequest result =
          new com.google.cloud.netapp.v1.CreateBackupVaultRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.CreateBackupVaultRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.backupVaultId_ = backupVaultId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.backupVault_ =
            backupVaultBuilder_ == null ? backupVault_ : backupVaultBuilder_.build();
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
      if (other instanceof com.google.cloud.netapp.v1.CreateBackupVaultRequest) {
        return mergeFrom((com.google.cloud.netapp.v1.CreateBackupVaultRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.CreateBackupVaultRequest other) {
      if (other == com.google.cloud.netapp.v1.CreateBackupVaultRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBackupVaultId().isEmpty()) {
        backupVaultId_ = other.backupVaultId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasBackupVault()) {
        mergeBackupVault(other.getBackupVault());
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
                backupVaultId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getBackupVaultFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The location to create the backup vaults, in the format
     * `projects/{project_id}/locations/{location}`
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
     * Required. The location to create the backup vaults, in the format
     * `projects/{project_id}/locations/{location}`
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
     * Required. The location to create the backup vaults, in the format
     * `projects/{project_id}/locations/{location}`
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
     * Required. The location to create the backup vaults, in the format
     * `projects/{project_id}/locations/{location}`
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
     * Required. The location to create the backup vaults, in the format
     * `projects/{project_id}/locations/{location}`
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

    private java.lang.Object backupVaultId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the backupVault.
     * The ID must be unique within the specified location.
     * The max supported length is 63 characters.
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * Values that do not match this pattern will trigger an INVALID_ARGUMENT
     * error.
     * </pre>
     *
     * <code>string backup_vault_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The backupVaultId.
     */
    public java.lang.String getBackupVaultId() {
      java.lang.Object ref = backupVaultId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backupVaultId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the backupVault.
     * The ID must be unique within the specified location.
     * The max supported length is 63 characters.
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * Values that do not match this pattern will trigger an INVALID_ARGUMENT
     * error.
     * </pre>
     *
     * <code>string backup_vault_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for backupVaultId.
     */
    public com.google.protobuf.ByteString getBackupVaultIdBytes() {
      java.lang.Object ref = backupVaultId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        backupVaultId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the backupVault.
     * The ID must be unique within the specified location.
     * The max supported length is 63 characters.
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * Values that do not match this pattern will trigger an INVALID_ARGUMENT
     * error.
     * </pre>
     *
     * <code>string backup_vault_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The backupVaultId to set.
     * @return This builder for chaining.
     */
    public Builder setBackupVaultId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      backupVaultId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the backupVault.
     * The ID must be unique within the specified location.
     * The max supported length is 63 characters.
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * Values that do not match this pattern will trigger an INVALID_ARGUMENT
     * error.
     * </pre>
     *
     * <code>string backup_vault_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBackupVaultId() {
      backupVaultId_ = getDefaultInstance().getBackupVaultId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the backupVault.
     * The ID must be unique within the specified location.
     * The max supported length is 63 characters.
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * Values that do not match this pattern will trigger an INVALID_ARGUMENT
     * error.
     * </pre>
     *
     * <code>string backup_vault_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for backupVaultId to set.
     * @return This builder for chaining.
     */
    public Builder setBackupVaultIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      backupVaultId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.netapp.v1.BackupVault backupVault_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1.BackupVault,
            com.google.cloud.netapp.v1.BackupVault.Builder,
            com.google.cloud.netapp.v1.BackupVaultOrBuilder>
        backupVaultBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A backupVault resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the backupVault field is set.
     */
    public boolean hasBackupVault() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A backupVault resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The backupVault.
     */
    public com.google.cloud.netapp.v1.BackupVault getBackupVault() {
      if (backupVaultBuilder_ == null) {
        return backupVault_ == null
            ? com.google.cloud.netapp.v1.BackupVault.getDefaultInstance()
            : backupVault_;
      } else {
        return backupVaultBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A backupVault resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBackupVault(com.google.cloud.netapp.v1.BackupVault value) {
      if (backupVaultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        backupVault_ = value;
      } else {
        backupVaultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A backupVault resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBackupVault(com.google.cloud.netapp.v1.BackupVault.Builder builderForValue) {
      if (backupVaultBuilder_ == null) {
        backupVault_ = builderForValue.build();
      } else {
        backupVaultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A backupVault resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeBackupVault(com.google.cloud.netapp.v1.BackupVault value) {
      if (backupVaultBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && backupVault_ != null
            && backupVault_ != com.google.cloud.netapp.v1.BackupVault.getDefaultInstance()) {
          getBackupVaultBuilder().mergeFrom(value);
        } else {
          backupVault_ = value;
        }
      } else {
        backupVaultBuilder_.mergeFrom(value);
      }
      if (backupVault_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A backupVault resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearBackupVault() {
      bitField0_ = (bitField0_ & ~0x00000004);
      backupVault_ = null;
      if (backupVaultBuilder_ != null) {
        backupVaultBuilder_.dispose();
        backupVaultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A backupVault resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.BackupVault.Builder getBackupVaultBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getBackupVaultFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A backupVault resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.BackupVaultOrBuilder getBackupVaultOrBuilder() {
      if (backupVaultBuilder_ != null) {
        return backupVaultBuilder_.getMessageOrBuilder();
      } else {
        return backupVault_ == null
            ? com.google.cloud.netapp.v1.BackupVault.getDefaultInstance()
            : backupVault_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A backupVault resource
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1.BackupVault,
            com.google.cloud.netapp.v1.BackupVault.Builder,
            com.google.cloud.netapp.v1.BackupVaultOrBuilder>
        getBackupVaultFieldBuilder() {
      if (backupVaultBuilder_ == null) {
        backupVaultBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.netapp.v1.BackupVault,
                com.google.cloud.netapp.v1.BackupVault.Builder,
                com.google.cloud.netapp.v1.BackupVaultOrBuilder>(
                getBackupVault(), getParentForChildren(), isClean());
        backupVault_ = null;
      }
      return backupVaultBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.CreateBackupVaultRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.CreateBackupVaultRequest)
  private static final com.google.cloud.netapp.v1.CreateBackupVaultRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.CreateBackupVaultRequest();
  }

  public static com.google.cloud.netapp.v1.CreateBackupVaultRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBackupVaultRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateBackupVaultRequest>() {
        @java.lang.Override
        public CreateBackupVaultRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateBackupVaultRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBackupVaultRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.CreateBackupVaultRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
