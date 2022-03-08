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
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

package com.google.cloud.video.stitcher.v1;

/**
 *
 *
 * <pre>
 * Request message for VideoStitcherService.updateCdnKey.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.UpdateCdnKeyRequest}
 */
public final class UpdateCdnKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.UpdateCdnKeyRequest)
    UpdateCdnKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateCdnKeyRequest.newBuilder() to construct.
  private UpdateCdnKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateCdnKeyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateCdnKeyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateCdnKeyRequest(
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
          case 10:
            {
              com.google.cloud.video.stitcher.v1.CdnKey.Builder subBuilder = null;
              if (cdnKey_ != null) {
                subBuilder = cdnKey_.toBuilder();
              }
              cdnKey_ =
                  input.readMessage(
                      com.google.cloud.video.stitcher.v1.CdnKey.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cdnKey_);
                cdnKey_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto
        .internal_static_google_cloud_video_stitcher_v1_UpdateCdnKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto
        .internal_static_google_cloud_video_stitcher_v1_UpdateCdnKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest.class,
            com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest.Builder.class);
  }

  public static final int CDN_KEY_FIELD_NUMBER = 1;
  private com.google.cloud.video.stitcher.v1.CdnKey cdnKey_;
  /**
   *
   *
   * <pre>
   * Required. The CDN key resource which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the cdnKey field is set.
   */
  @java.lang.Override
  public boolean hasCdnKey() {
    return cdnKey_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The CDN key resource which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The cdnKey.
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.CdnKey getCdnKey() {
    return cdnKey_ == null
        ? com.google.cloud.video.stitcher.v1.CdnKey.getDefaultInstance()
        : cdnKey_;
  }
  /**
   *
   *
   * <pre>
   * Required. The CDN key resource which replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder getCdnKeyOrBuilder() {
    return getCdnKey();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
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
   * Required. The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (cdnKey_ != null) {
      output.writeMessage(1, getCdnKey());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cdnKey_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCdnKey());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest other =
        (com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest) obj;

    if (hasCdnKey() != other.hasCdnKey()) return false;
    if (hasCdnKey()) {
      if (!getCdnKey().equals(other.getCdnKey())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasCdnKey()) {
      hash = (37 * hash) + CDN_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getCdnKey().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parseFrom(
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
      com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest prototype) {
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
   * Request message for VideoStitcherService.updateCdnKey.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.UpdateCdnKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.UpdateCdnKeyRequest)
      com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto
          .internal_static_google_cloud_video_stitcher_v1_UpdateCdnKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto
          .internal_static_google_cloud_video_stitcher_v1_UpdateCdnKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest.class,
              com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cdnKeyBuilder_ == null) {
        cdnKey_ = null;
      } else {
        cdnKey_ = null;
        cdnKeyBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.VideoStitcherServiceProto
          .internal_static_google_cloud_video_stitcher_v1_UpdateCdnKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest build() {
      com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest buildPartial() {
      com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest result =
          new com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest(this);
      if (cdnKeyBuilder_ == null) {
        result.cdnKey_ = cdnKey_;
      } else {
        result.cdnKey_ = cdnKeyBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest other) {
      if (other == com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest.getDefaultInstance())
        return this;
      if (other.hasCdnKey()) {
        mergeCdnKey(other.getCdnKey());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.video.stitcher.v1.CdnKey cdnKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.CdnKey,
            com.google.cloud.video.stitcher.v1.CdnKey.Builder,
            com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder>
        cdnKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The CDN key resource which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the cdnKey field is set.
     */
    public boolean hasCdnKey() {
      return cdnKeyBuilder_ != null || cdnKey_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The CDN key resource which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The cdnKey.
     */
    public com.google.cloud.video.stitcher.v1.CdnKey getCdnKey() {
      if (cdnKeyBuilder_ == null) {
        return cdnKey_ == null
            ? com.google.cloud.video.stitcher.v1.CdnKey.getDefaultInstance()
            : cdnKey_;
      } else {
        return cdnKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The CDN key resource which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCdnKey(com.google.cloud.video.stitcher.v1.CdnKey value) {
      if (cdnKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cdnKey_ = value;
        onChanged();
      } else {
        cdnKeyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CDN key resource which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCdnKey(com.google.cloud.video.stitcher.v1.CdnKey.Builder builderForValue) {
      if (cdnKeyBuilder_ == null) {
        cdnKey_ = builderForValue.build();
        onChanged();
      } else {
        cdnKeyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CDN key resource which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCdnKey(com.google.cloud.video.stitcher.v1.CdnKey value) {
      if (cdnKeyBuilder_ == null) {
        if (cdnKey_ != null) {
          cdnKey_ =
              com.google.cloud.video.stitcher.v1.CdnKey.newBuilder(cdnKey_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          cdnKey_ = value;
        }
        onChanged();
      } else {
        cdnKeyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CDN key resource which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCdnKey() {
      if (cdnKeyBuilder_ == null) {
        cdnKey_ = null;
        onChanged();
      } else {
        cdnKey_ = null;
        cdnKeyBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CDN key resource which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.video.stitcher.v1.CdnKey.Builder getCdnKeyBuilder() {

      onChanged();
      return getCdnKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The CDN key resource which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder getCdnKeyOrBuilder() {
      if (cdnKeyBuilder_ != null) {
        return cdnKeyBuilder_.getMessageOrBuilder();
      } else {
        return cdnKey_ == null
            ? com.google.cloud.video.stitcher.v1.CdnKey.getDefaultInstance()
            : cdnKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The CDN key resource which replaces the resource on the server.
     * </pre>
     *
     * <code>
     * .google.cloud.video.stitcher.v1.CdnKey cdn_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.video.stitcher.v1.CdnKey,
            com.google.cloud.video.stitcher.v1.CdnKey.Builder,
            com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder>
        getCdnKeyFieldBuilder() {
      if (cdnKeyBuilder_ == null) {
        cdnKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.video.stitcher.v1.CdnKey,
                com.google.cloud.video.stitcher.v1.CdnKey.Builder,
                com.google.cloud.video.stitcher.v1.CdnKeyOrBuilder>(
                getCdnKey(), getParentForChildren(), isClean());
        cdnKey_ = null;
      }
      return cdnKeyBuilder_;
    }

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
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. The update mask applies to the resource.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.UpdateCdnKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.UpdateCdnKeyRequest)
  private static final com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest();
  }

  public static com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCdnKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateCdnKeyRequest>() {
        @java.lang.Override
        public UpdateCdnKeyRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateCdnKeyRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateCdnKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCdnKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.UpdateCdnKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
