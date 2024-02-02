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
// source: google/monitoring/v3/notification_service.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `UpdateNotificationChannel` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.UpdateNotificationChannelRequest}
 */
public final class UpdateNotificationChannelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.UpdateNotificationChannelRequest)
    UpdateNotificationChannelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateNotificationChannelRequest.newBuilder() to construct.
  private UpdateNotificationChannelRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateNotificationChannelRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateNotificationChannelRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.NotificationServiceProto
        .internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.NotificationServiceProto
        .internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.UpdateNotificationChannelRequest.class,
            com.google.monitoring.v3.UpdateNotificationChannelRequest.Builder.class);
  }

  private int bitField0_;
  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int NOTIFICATION_CHANNEL_FIELD_NUMBER = 3;
  private com.google.monitoring.v3.NotificationChannel notificationChannel_;
  /**
   *
   *
   * <pre>
   * Required. A description of the changes to be applied to the specified
   * notification channel. The description must provide a definition for
   * fields to be updated; the names of these fields should also be
   * included in the `update_mask`.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the notificationChannel field is set.
   */
  @java.lang.Override
  public boolean hasNotificationChannel() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. A description of the changes to be applied to the specified
   * notification channel. The description must provide a definition for
   * fields to be updated; the names of these fields should also be
   * included in the `update_mask`.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The notificationChannel.
   */
  @java.lang.Override
  public com.google.monitoring.v3.NotificationChannel getNotificationChannel() {
    return notificationChannel_ == null
        ? com.google.monitoring.v3.NotificationChannel.getDefaultInstance()
        : notificationChannel_;
  }
  /**
   *
   *
   * <pre>
   * Required. A description of the changes to be applied to the specified
   * notification channel. The description must provide a definition for
   * fields to be updated; the names of these fields should also be
   * included in the `update_mask`.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.NotificationChannelOrBuilder getNotificationChannelOrBuilder() {
    return notificationChannel_ == null
        ? com.google.monitoring.v3.NotificationChannel.getDefaultInstance()
        : notificationChannel_;
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
      output.writeMessage(2, getUpdateMask());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getNotificationChannel());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getNotificationChannel());
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
    if (!(obj instanceof com.google.monitoring.v3.UpdateNotificationChannelRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.UpdateNotificationChannelRequest other =
        (com.google.monitoring.v3.UpdateNotificationChannelRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasNotificationChannel() != other.hasNotificationChannel()) return false;
    if (hasNotificationChannel()) {
      if (!getNotificationChannel().equals(other.getNotificationChannel())) return false;
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
    if (hasNotificationChannel()) {
      hash = (37 * hash) + NOTIFICATION_CHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + getNotificationChannel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest parseFrom(
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
      com.google.monitoring.v3.UpdateNotificationChannelRequest prototype) {
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
   * The `UpdateNotificationChannel` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.UpdateNotificationChannelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.UpdateNotificationChannelRequest)
      com.google.monitoring.v3.UpdateNotificationChannelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.UpdateNotificationChannelRequest.class,
              com.google.monitoring.v3.UpdateNotificationChannelRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.UpdateNotificationChannelRequest.newBuilder()
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
        getNotificationChannelFieldBuilder();
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
      notificationChannel_ = null;
      if (notificationChannelBuilder_ != null) {
        notificationChannelBuilder_.dispose();
        notificationChannelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.UpdateNotificationChannelRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.UpdateNotificationChannelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.UpdateNotificationChannelRequest build() {
      com.google.monitoring.v3.UpdateNotificationChannelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.UpdateNotificationChannelRequest buildPartial() {
      com.google.monitoring.v3.UpdateNotificationChannelRequest result =
          new com.google.monitoring.v3.UpdateNotificationChannelRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.v3.UpdateNotificationChannelRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.notificationChannel_ =
            notificationChannelBuilder_ == null
                ? notificationChannel_
                : notificationChannelBuilder_.build();
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
      if (other instanceof com.google.monitoring.v3.UpdateNotificationChannelRequest) {
        return mergeFrom((com.google.monitoring.v3.UpdateNotificationChannelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.UpdateNotificationChannelRequest other) {
      if (other == com.google.monitoring.v3.UpdateNotificationChannelRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasNotificationChannel()) {
        mergeNotificationChannel(other.getNotificationChannel());
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
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(
                    getNotificationChannelFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
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
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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

    private com.google.monitoring.v3.NotificationChannel notificationChannel_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.NotificationChannel,
            com.google.monitoring.v3.NotificationChannel.Builder,
            com.google.monitoring.v3.NotificationChannelOrBuilder>
        notificationChannelBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A description of the changes to be applied to the specified
     * notification channel. The description must provide a definition for
     * fields to be updated; the names of these fields should also be
     * included in the `update_mask`.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the notificationChannel field is set.
     */
    public boolean hasNotificationChannel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A description of the changes to be applied to the specified
     * notification channel. The description must provide a definition for
     * fields to be updated; the names of these fields should also be
     * included in the `update_mask`.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The notificationChannel.
     */
    public com.google.monitoring.v3.NotificationChannel getNotificationChannel() {
      if (notificationChannelBuilder_ == null) {
        return notificationChannel_ == null
            ? com.google.monitoring.v3.NotificationChannel.getDefaultInstance()
            : notificationChannel_;
      } else {
        return notificationChannelBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A description of the changes to be applied to the specified
     * notification channel. The description must provide a definition for
     * fields to be updated; the names of these fields should also be
     * included in the `update_mask`.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNotificationChannel(com.google.monitoring.v3.NotificationChannel value) {
      if (notificationChannelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        notificationChannel_ = value;
      } else {
        notificationChannelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A description of the changes to be applied to the specified
     * notification channel. The description must provide a definition for
     * fields to be updated; the names of these fields should also be
     * included in the `update_mask`.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNotificationChannel(
        com.google.monitoring.v3.NotificationChannel.Builder builderForValue) {
      if (notificationChannelBuilder_ == null) {
        notificationChannel_ = builderForValue.build();
      } else {
        notificationChannelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A description of the changes to be applied to the specified
     * notification channel. The description must provide a definition for
     * fields to be updated; the names of these fields should also be
     * included in the `update_mask`.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeNotificationChannel(com.google.monitoring.v3.NotificationChannel value) {
      if (notificationChannelBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && notificationChannel_ != null
            && notificationChannel_
                != com.google.monitoring.v3.NotificationChannel.getDefaultInstance()) {
          getNotificationChannelBuilder().mergeFrom(value);
        } else {
          notificationChannel_ = value;
        }
      } else {
        notificationChannelBuilder_.mergeFrom(value);
      }
      if (notificationChannel_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A description of the changes to be applied to the specified
     * notification channel. The description must provide a definition for
     * fields to be updated; the names of these fields should also be
     * included in the `update_mask`.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearNotificationChannel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      notificationChannel_ = null;
      if (notificationChannelBuilder_ != null) {
        notificationChannelBuilder_.dispose();
        notificationChannelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A description of the changes to be applied to the specified
     * notification channel. The description must provide a definition for
     * fields to be updated; the names of these fields should also be
     * included in the `update_mask`.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.monitoring.v3.NotificationChannel.Builder getNotificationChannelBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getNotificationChannelFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A description of the changes to be applied to the specified
     * notification channel. The description must provide a definition for
     * fields to be updated; the names of these fields should also be
     * included in the `update_mask`.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.monitoring.v3.NotificationChannelOrBuilder getNotificationChannelOrBuilder() {
      if (notificationChannelBuilder_ != null) {
        return notificationChannelBuilder_.getMessageOrBuilder();
      } else {
        return notificationChannel_ == null
            ? com.google.monitoring.v3.NotificationChannel.getDefaultInstance()
            : notificationChannel_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A description of the changes to be applied to the specified
     * notification channel. The description must provide a definition for
     * fields to be updated; the names of these fields should also be
     * included in the `update_mask`.
     * </pre>
     *
     * <code>
     * .google.monitoring.v3.NotificationChannel notification_channel = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.NotificationChannel,
            com.google.monitoring.v3.NotificationChannel.Builder,
            com.google.monitoring.v3.NotificationChannelOrBuilder>
        getNotificationChannelFieldBuilder() {
      if (notificationChannelBuilder_ == null) {
        notificationChannelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.NotificationChannel,
                com.google.monitoring.v3.NotificationChannel.Builder,
                com.google.monitoring.v3.NotificationChannelOrBuilder>(
                getNotificationChannel(), getParentForChildren(), isClean());
        notificationChannel_ = null;
      }
      return notificationChannelBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.UpdateNotificationChannelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.UpdateNotificationChannelRequest)
  private static final com.google.monitoring.v3.UpdateNotificationChannelRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.UpdateNotificationChannelRequest();
  }

  public static com.google.monitoring.v3.UpdateNotificationChannelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateNotificationChannelRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateNotificationChannelRequest>() {
        @java.lang.Override
        public UpdateNotificationChannelRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateNotificationChannelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateNotificationChannelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.UpdateNotificationChannelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
