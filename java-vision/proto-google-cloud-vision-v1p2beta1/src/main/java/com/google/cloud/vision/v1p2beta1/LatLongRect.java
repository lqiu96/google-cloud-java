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
// source: google/cloud/vision/v1p2beta1/image_annotator.proto

package com.google.cloud.vision.v1p2beta1;

/**
 *
 *
 * <pre>
 * Rectangle determined by min and max `LatLng` pairs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p2beta1.LatLongRect}
 */
public final class LatLongRect extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p2beta1.LatLongRect)
    LatLongRectOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LatLongRect.newBuilder() to construct.
  private LatLongRect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LatLongRect() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LatLongRect();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LatLongRect(
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
              com.google.type.LatLng.Builder subBuilder = null;
              if (minLatLng_ != null) {
                subBuilder = minLatLng_.toBuilder();
              }
              minLatLng_ = input.readMessage(com.google.type.LatLng.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(minLatLng_);
                minLatLng_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.type.LatLng.Builder subBuilder = null;
              if (maxLatLng_ != null) {
                subBuilder = maxLatLng_.toBuilder();
              }
              maxLatLng_ = input.readMessage(com.google.type.LatLng.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(maxLatLng_);
                maxLatLng_ = subBuilder.buildPartial();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p2beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p2beta1_LatLongRect_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p2beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p2beta1_LatLongRect_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p2beta1.LatLongRect.class,
            com.google.cloud.vision.v1p2beta1.LatLongRect.Builder.class);
  }

  public static final int MIN_LAT_LNG_FIELD_NUMBER = 1;
  private com.google.type.LatLng minLatLng_;
  /**
   *
   *
   * <pre>
   * Min lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng min_lat_lng = 1;</code>
   *
   * @return Whether the minLatLng field is set.
   */
  @java.lang.Override
  public boolean hasMinLatLng() {
    return minLatLng_ != null;
  }
  /**
   *
   *
   * <pre>
   * Min lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng min_lat_lng = 1;</code>
   *
   * @return The minLatLng.
   */
  @java.lang.Override
  public com.google.type.LatLng getMinLatLng() {
    return minLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : minLatLng_;
  }
  /**
   *
   *
   * <pre>
   * Min lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng min_lat_lng = 1;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getMinLatLngOrBuilder() {
    return getMinLatLng();
  }

  public static final int MAX_LAT_LNG_FIELD_NUMBER = 2;
  private com.google.type.LatLng maxLatLng_;
  /**
   *
   *
   * <pre>
   * Max lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng max_lat_lng = 2;</code>
   *
   * @return Whether the maxLatLng field is set.
   */
  @java.lang.Override
  public boolean hasMaxLatLng() {
    return maxLatLng_ != null;
  }
  /**
   *
   *
   * <pre>
   * Max lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng max_lat_lng = 2;</code>
   *
   * @return The maxLatLng.
   */
  @java.lang.Override
  public com.google.type.LatLng getMaxLatLng() {
    return maxLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : maxLatLng_;
  }
  /**
   *
   *
   * <pre>
   * Max lat/long pair.
   * </pre>
   *
   * <code>.google.type.LatLng max_lat_lng = 2;</code>
   */
  @java.lang.Override
  public com.google.type.LatLngOrBuilder getMaxLatLngOrBuilder() {
    return getMaxLatLng();
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
    if (minLatLng_ != null) {
      output.writeMessage(1, getMinLatLng());
    }
    if (maxLatLng_ != null) {
      output.writeMessage(2, getMaxLatLng());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minLatLng_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMinLatLng());
    }
    if (maxLatLng_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMaxLatLng());
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
    if (!(obj instanceof com.google.cloud.vision.v1p2beta1.LatLongRect)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p2beta1.LatLongRect other =
        (com.google.cloud.vision.v1p2beta1.LatLongRect) obj;

    if (hasMinLatLng() != other.hasMinLatLng()) return false;
    if (hasMinLatLng()) {
      if (!getMinLatLng().equals(other.getMinLatLng())) return false;
    }
    if (hasMaxLatLng() != other.hasMaxLatLng()) return false;
    if (hasMaxLatLng()) {
      if (!getMaxLatLng().equals(other.getMaxLatLng())) return false;
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
    if (hasMinLatLng()) {
      hash = (37 * hash) + MIN_LAT_LNG_FIELD_NUMBER;
      hash = (53 * hash) + getMinLatLng().hashCode();
    }
    if (hasMaxLatLng()) {
      hash = (37 * hash) + MAX_LAT_LNG_FIELD_NUMBER;
      hash = (53 * hash) + getMaxLatLng().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vision.v1p2beta1.LatLongRect prototype) {
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
   * Rectangle determined by min and max `LatLng` pairs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p2beta1.LatLongRect}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p2beta1.LatLongRect)
      com.google.cloud.vision.v1p2beta1.LatLongRectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p2beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p2beta1_LatLongRect_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p2beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p2beta1_LatLongRect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p2beta1.LatLongRect.class,
              com.google.cloud.vision.v1p2beta1.LatLongRect.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p2beta1.LatLongRect.newBuilder()
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
      if (minLatLngBuilder_ == null) {
        minLatLng_ = null;
      } else {
        minLatLng_ = null;
        minLatLngBuilder_ = null;
      }
      if (maxLatLngBuilder_ == null) {
        maxLatLng_ = null;
      } else {
        maxLatLng_ = null;
        maxLatLngBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p2beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p2beta1_LatLongRect_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p2beta1.LatLongRect getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p2beta1.LatLongRect.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p2beta1.LatLongRect build() {
      com.google.cloud.vision.v1p2beta1.LatLongRect result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p2beta1.LatLongRect buildPartial() {
      com.google.cloud.vision.v1p2beta1.LatLongRect result =
          new com.google.cloud.vision.v1p2beta1.LatLongRect(this);
      if (minLatLngBuilder_ == null) {
        result.minLatLng_ = minLatLng_;
      } else {
        result.minLatLng_ = minLatLngBuilder_.build();
      }
      if (maxLatLngBuilder_ == null) {
        result.maxLatLng_ = maxLatLng_;
      } else {
        result.maxLatLng_ = maxLatLngBuilder_.build();
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
      if (other instanceof com.google.cloud.vision.v1p2beta1.LatLongRect) {
        return mergeFrom((com.google.cloud.vision.v1p2beta1.LatLongRect) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p2beta1.LatLongRect other) {
      if (other == com.google.cloud.vision.v1p2beta1.LatLongRect.getDefaultInstance()) return this;
      if (other.hasMinLatLng()) {
        mergeMinLatLng(other.getMinLatLng());
      }
      if (other.hasMaxLatLng()) {
        mergeMaxLatLng(other.getMaxLatLng());
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
      com.google.cloud.vision.v1p2beta1.LatLongRect parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1p2beta1.LatLongRect) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.type.LatLng minLatLng_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        minLatLngBuilder_;
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     *
     * @return Whether the minLatLng field is set.
     */
    public boolean hasMinLatLng() {
      return minLatLngBuilder_ != null || minLatLng_ != null;
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     *
     * @return The minLatLng.
     */
    public com.google.type.LatLng getMinLatLng() {
      if (minLatLngBuilder_ == null) {
        return minLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : minLatLng_;
      } else {
        return minLatLngBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public Builder setMinLatLng(com.google.type.LatLng value) {
      if (minLatLngBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minLatLng_ = value;
        onChanged();
      } else {
        minLatLngBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public Builder setMinLatLng(com.google.type.LatLng.Builder builderForValue) {
      if (minLatLngBuilder_ == null) {
        minLatLng_ = builderForValue.build();
        onChanged();
      } else {
        minLatLngBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public Builder mergeMinLatLng(com.google.type.LatLng value) {
      if (minLatLngBuilder_ == null) {
        if (minLatLng_ != null) {
          minLatLng_ =
              com.google.type.LatLng.newBuilder(minLatLng_).mergeFrom(value).buildPartial();
        } else {
          minLatLng_ = value;
        }
        onChanged();
      } else {
        minLatLngBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public Builder clearMinLatLng() {
      if (minLatLngBuilder_ == null) {
        minLatLng_ = null;
        onChanged();
      } else {
        minLatLng_ = null;
        minLatLngBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public com.google.type.LatLng.Builder getMinLatLngBuilder() {

      onChanged();
      return getMinLatLngFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    public com.google.type.LatLngOrBuilder getMinLatLngOrBuilder() {
      if (minLatLngBuilder_ != null) {
        return minLatLngBuilder_.getMessageOrBuilder();
      } else {
        return minLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : minLatLng_;
      }
    }
    /**
     *
     *
     * <pre>
     * Min lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng min_lat_lng = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        getMinLatLngFieldBuilder() {
      if (minLatLngBuilder_ == null) {
        minLatLngBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.LatLng,
                com.google.type.LatLng.Builder,
                com.google.type.LatLngOrBuilder>(getMinLatLng(), getParentForChildren(), isClean());
        minLatLng_ = null;
      }
      return minLatLngBuilder_;
    }

    private com.google.type.LatLng maxLatLng_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        maxLatLngBuilder_;
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     *
     * @return Whether the maxLatLng field is set.
     */
    public boolean hasMaxLatLng() {
      return maxLatLngBuilder_ != null || maxLatLng_ != null;
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     *
     * @return The maxLatLng.
     */
    public com.google.type.LatLng getMaxLatLng() {
      if (maxLatLngBuilder_ == null) {
        return maxLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : maxLatLng_;
      } else {
        return maxLatLngBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public Builder setMaxLatLng(com.google.type.LatLng value) {
      if (maxLatLngBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxLatLng_ = value;
        onChanged();
      } else {
        maxLatLngBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public Builder setMaxLatLng(com.google.type.LatLng.Builder builderForValue) {
      if (maxLatLngBuilder_ == null) {
        maxLatLng_ = builderForValue.build();
        onChanged();
      } else {
        maxLatLngBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public Builder mergeMaxLatLng(com.google.type.LatLng value) {
      if (maxLatLngBuilder_ == null) {
        if (maxLatLng_ != null) {
          maxLatLng_ =
              com.google.type.LatLng.newBuilder(maxLatLng_).mergeFrom(value).buildPartial();
        } else {
          maxLatLng_ = value;
        }
        onChanged();
      } else {
        maxLatLngBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public Builder clearMaxLatLng() {
      if (maxLatLngBuilder_ == null) {
        maxLatLng_ = null;
        onChanged();
      } else {
        maxLatLng_ = null;
        maxLatLngBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public com.google.type.LatLng.Builder getMaxLatLngBuilder() {

      onChanged();
      return getMaxLatLngFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    public com.google.type.LatLngOrBuilder getMaxLatLngOrBuilder() {
      if (maxLatLngBuilder_ != null) {
        return maxLatLngBuilder_.getMessageOrBuilder();
      } else {
        return maxLatLng_ == null ? com.google.type.LatLng.getDefaultInstance() : maxLatLng_;
      }
    }
    /**
     *
     *
     * <pre>
     * Max lat/long pair.
     * </pre>
     *
     * <code>.google.type.LatLng max_lat_lng = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>
        getMaxLatLngFieldBuilder() {
      if (maxLatLngBuilder_ == null) {
        maxLatLngBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.LatLng,
                com.google.type.LatLng.Builder,
                com.google.type.LatLngOrBuilder>(getMaxLatLng(), getParentForChildren(), isClean());
        maxLatLng_ = null;
      }
      return maxLatLngBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p2beta1.LatLongRect)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p2beta1.LatLongRect)
  private static final com.google.cloud.vision.v1p2beta1.LatLongRect DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p2beta1.LatLongRect();
  }

  public static com.google.cloud.vision.v1p2beta1.LatLongRect getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LatLongRect> PARSER =
      new com.google.protobuf.AbstractParser<LatLongRect>() {
        @java.lang.Override
        public LatLongRect parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LatLongRect(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LatLongRect> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LatLongRect> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p2beta1.LatLongRect getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
