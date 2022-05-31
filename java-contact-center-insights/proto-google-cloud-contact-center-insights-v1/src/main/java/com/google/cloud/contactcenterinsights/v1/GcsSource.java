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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * A Cloud Storage source of conversation data.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.GcsSource}
 */
public final class GcsSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.GcsSource)
    GcsSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GcsSource.newBuilder() to construct.
  private GcsSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GcsSource() {
    audioUri_ = "";
    transcriptUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GcsSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GcsSource(
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
              java.lang.String s = input.readStringRequireUtf8();

              audioUri_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              transcriptUri_ = s;
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
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_GcsSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_GcsSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.GcsSource.class,
            com.google.cloud.contactcenterinsights.v1.GcsSource.Builder.class);
  }

  public static final int AUDIO_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object audioUri_;
  /**
   *
   *
   * <pre>
   * Cloud Storage URI that points to a file that contains the conversation
   * audio.
   * </pre>
   *
   * <code>string audio_uri = 1;</code>
   *
   * @return The audioUri.
   */
  @java.lang.Override
  public java.lang.String getAudioUri() {
    java.lang.Object ref = audioUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      audioUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Cloud Storage URI that points to a file that contains the conversation
   * audio.
   * </pre>
   *
   * <code>string audio_uri = 1;</code>
   *
   * @return The bytes for audioUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAudioUriBytes() {
    java.lang.Object ref = audioUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      audioUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSCRIPT_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object transcriptUri_;
  /**
   *
   *
   * <pre>
   * Immutable. Cloud Storage URI that points to a file that contains the conversation
   * transcript.
   * </pre>
   *
   * <code>string transcript_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The transcriptUri.
   */
  @java.lang.Override
  public java.lang.String getTranscriptUri() {
    java.lang.Object ref = transcriptUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      transcriptUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. Cloud Storage URI that points to a file that contains the conversation
   * transcript.
   * </pre>
   *
   * <code>string transcript_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for transcriptUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTranscriptUriBytes() {
    java.lang.Object ref = transcriptUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      transcriptUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(audioUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, audioUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transcriptUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, transcriptUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(audioUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, audioUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(transcriptUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, transcriptUri_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.GcsSource)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.GcsSource other =
        (com.google.cloud.contactcenterinsights.v1.GcsSource) obj;

    if (!getAudioUri().equals(other.getAudioUri())) return false;
    if (!getTranscriptUri().equals(other.getTranscriptUri())) return false;
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
    hash = (37 * hash) + AUDIO_URI_FIELD_NUMBER;
    hash = (53 * hash) + getAudioUri().hashCode();
    hash = (37 * hash) + TRANSCRIPT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getTranscriptUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.GcsSource prototype) {
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
   * A Cloud Storage source of conversation data.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.GcsSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.GcsSource)
      com.google.cloud.contactcenterinsights.v1.GcsSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_GcsSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_GcsSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.GcsSource.class,
              com.google.cloud.contactcenterinsights.v1.GcsSource.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.GcsSource.newBuilder()
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
      audioUri_ = "";

      transcriptUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_GcsSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.GcsSource getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.GcsSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.GcsSource build() {
      com.google.cloud.contactcenterinsights.v1.GcsSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.GcsSource buildPartial() {
      com.google.cloud.contactcenterinsights.v1.GcsSource result =
          new com.google.cloud.contactcenterinsights.v1.GcsSource(this);
      result.audioUri_ = audioUri_;
      result.transcriptUri_ = transcriptUri_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.GcsSource) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.GcsSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.GcsSource other) {
      if (other == com.google.cloud.contactcenterinsights.v1.GcsSource.getDefaultInstance())
        return this;
      if (!other.getAudioUri().isEmpty()) {
        audioUri_ = other.audioUri_;
        onChanged();
      }
      if (!other.getTranscriptUri().isEmpty()) {
        transcriptUri_ = other.transcriptUri_;
        onChanged();
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
      com.google.cloud.contactcenterinsights.v1.GcsSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.contactcenterinsights.v1.GcsSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object audioUri_ = "";
    /**
     *
     *
     * <pre>
     * Cloud Storage URI that points to a file that contains the conversation
     * audio.
     * </pre>
     *
     * <code>string audio_uri = 1;</code>
     *
     * @return The audioUri.
     */
    public java.lang.String getAudioUri() {
      java.lang.Object ref = audioUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        audioUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage URI that points to a file that contains the conversation
     * audio.
     * </pre>
     *
     * <code>string audio_uri = 1;</code>
     *
     * @return The bytes for audioUri.
     */
    public com.google.protobuf.ByteString getAudioUriBytes() {
      java.lang.Object ref = audioUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        audioUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage URI that points to a file that contains the conversation
     * audio.
     * </pre>
     *
     * <code>string audio_uri = 1;</code>
     *
     * @param value The audioUri to set.
     * @return This builder for chaining.
     */
    public Builder setAudioUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      audioUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage URI that points to a file that contains the conversation
     * audio.
     * </pre>
     *
     * <code>string audio_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAudioUri() {

      audioUri_ = getDefaultInstance().getAudioUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Storage URI that points to a file that contains the conversation
     * audio.
     * </pre>
     *
     * <code>string audio_uri = 1;</code>
     *
     * @param value The bytes for audioUri to set.
     * @return This builder for chaining.
     */
    public Builder setAudioUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      audioUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object transcriptUri_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. Cloud Storage URI that points to a file that contains the conversation
     * transcript.
     * </pre>
     *
     * <code>string transcript_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The transcriptUri.
     */
    public java.lang.String getTranscriptUri() {
      java.lang.Object ref = transcriptUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        transcriptUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Cloud Storage URI that points to a file that contains the conversation
     * transcript.
     * </pre>
     *
     * <code>string transcript_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The bytes for transcriptUri.
     */
    public com.google.protobuf.ByteString getTranscriptUriBytes() {
      java.lang.Object ref = transcriptUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        transcriptUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Cloud Storage URI that points to a file that contains the conversation
     * transcript.
     * </pre>
     *
     * <code>string transcript_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The transcriptUri to set.
     * @return This builder for chaining.
     */
    public Builder setTranscriptUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      transcriptUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Cloud Storage URI that points to a file that contains the conversation
     * transcript.
     * </pre>
     *
     * <code>string transcript_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTranscriptUri() {

      transcriptUri_ = getDefaultInstance().getTranscriptUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Cloud Storage URI that points to a file that contains the conversation
     * transcript.
     * </pre>
     *
     * <code>string transcript_uri = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The bytes for transcriptUri to set.
     * @return This builder for chaining.
     */
    public Builder setTranscriptUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      transcriptUri_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.GcsSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.GcsSource)
  private static final com.google.cloud.contactcenterinsights.v1.GcsSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.GcsSource();
  }

  public static com.google.cloud.contactcenterinsights.v1.GcsSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsSource> PARSER =
      new com.google.protobuf.AbstractParser<GcsSource>() {
        @java.lang.Override
        public GcsSource parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GcsSource(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GcsSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.GcsSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
