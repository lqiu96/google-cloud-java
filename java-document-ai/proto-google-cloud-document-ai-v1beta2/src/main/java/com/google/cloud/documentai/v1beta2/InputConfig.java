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
// source: google/cloud/documentai/v1beta2/document_understanding.proto

package com.google.cloud.documentai.v1beta2;

/**
 *
 *
 * <pre>
 * The desired input location and metadata.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta2.InputConfig}
 */
public final class InputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta2.InputConfig)
    InputConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InputConfig.newBuilder() to construct.
  private InputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InputConfig() {
    mimeType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InputConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InputConfig(
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
              com.google.cloud.documentai.v1beta2.GcsSource.Builder subBuilder = null;
              if (sourceCase_ == 1) {
                subBuilder = ((com.google.cloud.documentai.v1beta2.GcsSource) source_).toBuilder();
              }
              source_ =
                  input.readMessage(
                      com.google.cloud.documentai.v1beta2.GcsSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.documentai.v1beta2.GcsSource) source_);
                source_ = subBuilder.buildPartial();
              }
              sourceCase_ = 1;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              mimeType_ = s;
              break;
            }
          case 26:
            {
              sourceCase_ = 3;
              source_ = input.readBytes();
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
    return com.google.cloud.documentai.v1beta2.DocumentAiProto
        .internal_static_google_cloud_documentai_v1beta2_InputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta2.DocumentAiProto
        .internal_static_google_cloud_documentai_v1beta2_InputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta2.InputConfig.class,
            com.google.cloud.documentai.v1beta2.InputConfig.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_SOURCE(1),
    CONTENTS(3),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCS_SOURCE;
        case 3:
          return CONTENTS;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from. This must be a
   * single file.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  @java.lang.Override
  public boolean hasGcsSource() {
    return sourceCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from. This must be a
   * single file.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta2.GcsSource getGcsSource() {
    if (sourceCase_ == 1) {
      return (com.google.cloud.documentai.v1beta2.GcsSource) source_;
    }
    return com.google.cloud.documentai.v1beta2.GcsSource.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to read the input from. This must be a
   * single file.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta2.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    if (sourceCase_ == 1) {
      return (com.google.cloud.documentai.v1beta2.GcsSource) source_;
    }
    return com.google.cloud.documentai.v1beta2.GcsSource.getDefaultInstance();
  }

  public static final int CONTENTS_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Content in bytes, represented as a stream of bytes.
   * Note: As with all `bytes` fields, proto buffer messages use a pure binary
   * representation, whereas JSON representations use base64.
   * This field only works for synchronous ProcessDocument method.
   * </pre>
   *
   * <code>bytes contents = 3;</code>
   *
   * @return Whether the contents field is set.
   */
  @java.lang.Override
  public boolean hasContents() {
    return sourceCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Content in bytes, represented as a stream of bytes.
   * Note: As with all `bytes` fields, proto buffer messages use a pure binary
   * representation, whereas JSON representations use base64.
   * This field only works for synchronous ProcessDocument method.
   * </pre>
   *
   * <code>bytes contents = 3;</code>
   *
   * @return The contents.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContents() {
    if (sourceCase_ == 3) {
      return (com.google.protobuf.ByteString) source_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object mimeType_;
  /**
   *
   *
   * <pre>
   * Required. Mimetype of the input. Current supported mimetypes are application/pdf,
   * image/tiff, and image/gif.
   * In addition, application/json type is supported for requests with
   * [ProcessDocumentRequest.automl_params][google.cloud.documentai.v1beta2.ProcessDocumentRequest.automl_params] field set. The JSON file needs to
   * be in [Document][google.cloud.documentai.v1beta2.Document] format.
   * </pre>
   *
   * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The mimeType.
   */
  @java.lang.Override
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Mimetype of the input. Current supported mimetypes are application/pdf,
   * image/tiff, and image/gif.
   * In addition, application/json type is supported for requests with
   * [ProcessDocumentRequest.automl_params][google.cloud.documentai.v1beta2.ProcessDocumentRequest.automl_params] field set. The JSON file needs to
   * be in [Document][google.cloud.documentai.v1beta2.Document] format.
   * </pre>
   *
   * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for mimeType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mimeType_ = b;
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
    if (sourceCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.documentai.v1beta2.GcsSource) source_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mimeType_);
    }
    if (sourceCase_ == 3) {
      output.writeBytes(3, (com.google.protobuf.ByteString) source_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.documentai.v1beta2.GcsSource) source_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mimeType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mimeType_);
    }
    if (sourceCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              3, (com.google.protobuf.ByteString) source_);
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta2.InputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta2.InputConfig other =
        (com.google.cloud.documentai.v1beta2.InputConfig) obj;

    if (!getMimeType().equals(other.getMimeType())) return false;
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 1:
        if (!getGcsSource().equals(other.getGcsSource())) return false;
        break;
      case 3:
        if (!getContents().equals(other.getContents())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getGcsSource().hashCode();
        break;
      case 3:
        hash = (37 * hash) + CONTENTS_FIELD_NUMBER;
        hash = (53 * hash) + getContents().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.documentai.v1beta2.InputConfig prototype) {
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
   * The desired input location and metadata.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta2.InputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta2.InputConfig)
      com.google.cloud.documentai.v1beta2.InputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1beta2.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta2_InputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta2.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta2_InputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta2.InputConfig.class,
              com.google.cloud.documentai.v1beta2.InputConfig.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta2.InputConfig.newBuilder()
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
      mimeType_ = "";

      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1beta2.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta2_InputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta2.InputConfig getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta2.InputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta2.InputConfig build() {
      com.google.cloud.documentai.v1beta2.InputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta2.InputConfig buildPartial() {
      com.google.cloud.documentai.v1beta2.InputConfig result =
          new com.google.cloud.documentai.v1beta2.InputConfig(this);
      if (sourceCase_ == 1) {
        if (gcsSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = gcsSourceBuilder_.build();
        }
      }
      if (sourceCase_ == 3) {
        result.source_ = source_;
      }
      result.mimeType_ = mimeType_;
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof com.google.cloud.documentai.v1beta2.InputConfig) {
        return mergeFrom((com.google.cloud.documentai.v1beta2.InputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta2.InputConfig other) {
      if (other == com.google.cloud.documentai.v1beta2.InputConfig.getDefaultInstance())
        return this;
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
        onChanged();
      }
      switch (other.getSourceCase()) {
        case GCS_SOURCE:
          {
            mergeGcsSource(other.getGcsSource());
            break;
          }
        case CONTENTS:
          {
            setContents(other.getContents());
            break;
          }
        case SOURCE_NOT_SET:
          {
            break;
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
      com.google.cloud.documentai.v1beta2.InputConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.documentai.v1beta2.InputConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta2.GcsSource,
            com.google.cloud.documentai.v1beta2.GcsSource.Builder,
            com.google.cloud.documentai.v1beta2.GcsSourceOrBuilder>
        gcsSourceBuilder_;
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from. This must be a
     * single file.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
     *
     * @return Whether the gcsSource field is set.
     */
    @java.lang.Override
    public boolean hasGcsSource() {
      return sourceCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from. This must be a
     * single file.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
     *
     * @return The gcsSource.
     */
    @java.lang.Override
    public com.google.cloud.documentai.v1beta2.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (com.google.cloud.documentai.v1beta2.GcsSource) source_;
        }
        return com.google.cloud.documentai.v1beta2.GcsSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return gcsSourceBuilder_.getMessage();
        }
        return com.google.cloud.documentai.v1beta2.GcsSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from. This must be a
     * single file.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.documentai.v1beta2.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from. This must be a
     * single file.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(
        com.google.cloud.documentai.v1beta2.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from. This must be a
     * single file.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
     */
    public Builder mergeGcsSource(com.google.cloud.documentai.v1beta2.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1
            && source_ != com.google.cloud.documentai.v1beta2.GcsSource.getDefaultInstance()) {
          source_ =
              com.google.cloud.documentai.v1beta2.GcsSource.newBuilder(
                      (com.google.cloud.documentai.v1beta2.GcsSource) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          gcsSourceBuilder_.mergeFrom(value);
        }
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from. This must be a
     * single file.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        gcsSourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from. This must be a
     * single file.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.documentai.v1beta2.GcsSource.Builder getGcsSourceBuilder() {
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from. This must be a
     * single file.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.documentai.v1beta2.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if ((sourceCase_ == 1) && (gcsSourceBuilder_ != null)) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (com.google.cloud.documentai.v1beta2.GcsSource) source_;
        }
        return com.google.cloud.documentai.v1beta2.GcsSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to read the input from. This must be a
     * single file.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.GcsSource gcs_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta2.GcsSource,
            com.google.cloud.documentai.v1beta2.GcsSource.Builder,
            com.google.cloud.documentai.v1beta2.GcsSourceOrBuilder>
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ = com.google.cloud.documentai.v1beta2.GcsSource.getDefaultInstance();
        }
        gcsSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1beta2.GcsSource,
                com.google.cloud.documentai.v1beta2.GcsSource.Builder,
                com.google.cloud.documentai.v1beta2.GcsSourceOrBuilder>(
                (com.google.cloud.documentai.v1beta2.GcsSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();
      ;
      return gcsSourceBuilder_;
    }

    /**
     *
     *
     * <pre>
     * Content in bytes, represented as a stream of bytes.
     * Note: As with all `bytes` fields, proto buffer messages use a pure binary
     * representation, whereas JSON representations use base64.
     * This field only works for synchronous ProcessDocument method.
     * </pre>
     *
     * <code>bytes contents = 3;</code>
     *
     * @return Whether the contents field is set.
     */
    public boolean hasContents() {
      return sourceCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Content in bytes, represented as a stream of bytes.
     * Note: As with all `bytes` fields, proto buffer messages use a pure binary
     * representation, whereas JSON representations use base64.
     * This field only works for synchronous ProcessDocument method.
     * </pre>
     *
     * <code>bytes contents = 3;</code>
     *
     * @return The contents.
     */
    public com.google.protobuf.ByteString getContents() {
      if (sourceCase_ == 3) {
        return (com.google.protobuf.ByteString) source_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * Content in bytes, represented as a stream of bytes.
     * Note: As with all `bytes` fields, proto buffer messages use a pure binary
     * representation, whereas JSON representations use base64.
     * This field only works for synchronous ProcessDocument method.
     * </pre>
     *
     * <code>bytes contents = 3;</code>
     *
     * @param value The contents to set.
     * @return This builder for chaining.
     */
    public Builder setContents(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceCase_ = 3;
      source_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Content in bytes, represented as a stream of bytes.
     * Note: As with all `bytes` fields, proto buffer messages use a pure binary
     * representation, whereas JSON representations use base64.
     * This field only works for synchronous ProcessDocument method.
     * </pre>
     *
     * <code>bytes contents = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContents() {
      if (sourceCase_ == 3) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     *
     *
     * <pre>
     * Required. Mimetype of the input. Current supported mimetypes are application/pdf,
     * image/tiff, and image/gif.
     * In addition, application/json type is supported for requests with
     * [ProcessDocumentRequest.automl_params][google.cloud.documentai.v1beta2.ProcessDocumentRequest.automl_params] field set. The JSON file needs to
     * be in [Document][google.cloud.documentai.v1beta2.Document] format.
     * </pre>
     *
     * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The mimeType.
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Mimetype of the input. Current supported mimetypes are application/pdf,
     * image/tiff, and image/gif.
     * In addition, application/json type is supported for requests with
     * [ProcessDocumentRequest.automl_params][google.cloud.documentai.v1beta2.ProcessDocumentRequest.automl_params] field set. The JSON file needs to
     * be in [Document][google.cloud.documentai.v1beta2.Document] format.
     * </pre>
     *
     * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for mimeType.
     */
    public com.google.protobuf.ByteString getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Mimetype of the input. Current supported mimetypes are application/pdf,
     * image/tiff, and image/gif.
     * In addition, application/json type is supported for requests with
     * [ProcessDocumentRequest.automl_params][google.cloud.documentai.v1beta2.ProcessDocumentRequest.automl_params] field set. The JSON file needs to
     * be in [Document][google.cloud.documentai.v1beta2.Document] format.
     * </pre>
     *
     * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      mimeType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mimetype of the input. Current supported mimetypes are application/pdf,
     * image/tiff, and image/gif.
     * In addition, application/json type is supported for requests with
     * [ProcessDocumentRequest.automl_params][google.cloud.documentai.v1beta2.ProcessDocumentRequest.automl_params] field set. The JSON file needs to
     * be in [Document][google.cloud.documentai.v1beta2.Document] format.
     * </pre>
     *
     * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMimeType() {

      mimeType_ = getDefaultInstance().getMimeType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mimetype of the input. Current supported mimetypes are application/pdf,
     * image/tiff, and image/gif.
     * In addition, application/json type is supported for requests with
     * [ProcessDocumentRequest.automl_params][google.cloud.documentai.v1beta2.ProcessDocumentRequest.automl_params] field set. The JSON file needs to
     * be in [Document][google.cloud.documentai.v1beta2.Document] format.
     * </pre>
     *
     * <code>string mime_type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      mimeType_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta2.InputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta2.InputConfig)
  private static final com.google.cloud.documentai.v1beta2.InputConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta2.InputConfig();
  }

  public static com.google.cloud.documentai.v1beta2.InputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InputConfig> PARSER =
      new com.google.protobuf.AbstractParser<InputConfig>() {
        @java.lang.Override
        public InputConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InputConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta2.InputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
