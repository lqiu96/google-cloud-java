/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/automl/v1beta1/text.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Dataset metadata for text sentiment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.TextSentimentDatasetMetadata}
 */
public final class TextSentimentDatasetMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.TextSentimentDatasetMetadata)
    TextSentimentDatasetMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TextSentimentDatasetMetadata.newBuilder() to construct.
  private TextSentimentDatasetMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextSentimentDatasetMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TextSentimentDatasetMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TextSentimentDatasetMetadata(
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
          case 8:
            {
              sentimentMax_ = input.readInt32();
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
    return com.google.cloud.automl.v1beta1.TextProto
        .internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.TextProto
        .internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata.class,
            com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata.Builder.class);
  }

  public static final int SENTIMENT_MAX_FIELD_NUMBER = 1;
  private int sentimentMax_;
  /**
   *
   *
   * <pre>
   * Required. A sentiment is expressed as an integer ordinal, where higher
   * value means a more positive sentiment. The range of sentiments that will be
   * used is between 0 and sentiment_max (inclusive on both ends), and all the
   * values in the range must be represented in the dataset before a model can
   * be created. sentiment_max value must be between 1 and 10 (inclusive).
   * </pre>
   *
   * <code>int32 sentiment_max = 1;</code>
   *
   * @return The sentimentMax.
   */
  public int getSentimentMax() {
    return sentimentMax_;
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
    if (sentimentMax_ != 0) {
      output.writeInt32(1, sentimentMax_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sentimentMax_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, sentimentMax_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata other =
        (com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata) obj;

    if (getSentimentMax() != other.getSentimentMax()) return false;
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
    hash = (37 * hash) + SENTIMENT_MAX_FIELD_NUMBER;
    hash = (53 * hash) + getSentimentMax();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parseFrom(
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
      com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata prototype) {
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
   * Dataset metadata for text sentiment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.TextSentimentDatasetMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.TextSentimentDatasetMetadata)
      com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.TextProto
          .internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.TextProto
          .internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata.class,
              com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata.newBuilder()
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
      sentimentMax_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.TextProto
          .internal_static_google_cloud_automl_v1beta1_TextSentimentDatasetMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata build() {
      com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata buildPartial() {
      com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata result =
          new com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata(this);
      result.sentimentMax_ = sentimentMax_;
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
      if (other instanceof com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata) {
        return mergeFrom((com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata other) {
      if (other
          == com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata.getDefaultInstance())
        return this;
      if (other.getSentimentMax() != 0) {
        setSentimentMax(other.getSentimentMax());
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
      com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sentimentMax_;
    /**
     *
     *
     * <pre>
     * Required. A sentiment is expressed as an integer ordinal, where higher
     * value means a more positive sentiment. The range of sentiments that will be
     * used is between 0 and sentiment_max (inclusive on both ends), and all the
     * values in the range must be represented in the dataset before a model can
     * be created. sentiment_max value must be between 1 and 10 (inclusive).
     * </pre>
     *
     * <code>int32 sentiment_max = 1;</code>
     *
     * @return The sentimentMax.
     */
    public int getSentimentMax() {
      return sentimentMax_;
    }
    /**
     *
     *
     * <pre>
     * Required. A sentiment is expressed as an integer ordinal, where higher
     * value means a more positive sentiment. The range of sentiments that will be
     * used is between 0 and sentiment_max (inclusive on both ends), and all the
     * values in the range must be represented in the dataset before a model can
     * be created. sentiment_max value must be between 1 and 10 (inclusive).
     * </pre>
     *
     * <code>int32 sentiment_max = 1;</code>
     *
     * @param value The sentimentMax to set.
     * @return This builder for chaining.
     */
    public Builder setSentimentMax(int value) {

      sentimentMax_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A sentiment is expressed as an integer ordinal, where higher
     * value means a more positive sentiment. The range of sentiments that will be
     * used is between 0 and sentiment_max (inclusive on both ends), and all the
     * values in the range must be represented in the dataset before a model can
     * be created. sentiment_max value must be between 1 and 10 (inclusive).
     * </pre>
     *
     * <code>int32 sentiment_max = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSentimentMax() {

      sentimentMax_ = 0;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.TextSentimentDatasetMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.TextSentimentDatasetMetadata)
  private static final com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata();
  }

  public static com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextSentimentDatasetMetadata> PARSER =
      new com.google.protobuf.AbstractParser<TextSentimentDatasetMetadata>() {
        @java.lang.Override
        public TextSentimentDatasetMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TextSentimentDatasetMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TextSentimentDatasetMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextSentimentDatasetMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.TextSentimentDatasetMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
