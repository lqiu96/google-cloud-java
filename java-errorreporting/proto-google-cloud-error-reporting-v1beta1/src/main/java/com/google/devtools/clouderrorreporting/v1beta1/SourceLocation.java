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
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

package com.google.devtools.clouderrorreporting.v1beta1;

/**
 *
 *
 * <pre>
 * Indicates a location in the source code of the service for which
 * errors are reported.
 * This data should be provided by the application when reporting an error,
 * unless the error report has been generated automatically from Google App
 * Engine logs. All fields are optional.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.SourceLocation}
 */
public final class SourceLocation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouderrorreporting.v1beta1.SourceLocation)
    SourceLocationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SourceLocation.newBuilder() to construct.
  private SourceLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceLocation() {
    filePath_ = "";
    functionName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SourceLocation(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              filePath_ = s;
              break;
            }
          case 16:
            {
              lineNumber_ = input.readInt32();
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              functionName_ = s;
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
    return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.class,
            com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.Builder.class);
  }

  public static final int FILE_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object filePath_;
  /**
   *
   *
   * <pre>
   * The source code filename, which can include a truncated relative
   * path, or a full path from a production machine.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   */
  public java.lang.String getFilePath() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filePath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The source code filename, which can include a truncated relative
   * path, or a full path from a production machine.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   */
  public com.google.protobuf.ByteString getFilePathBytes() {
    java.lang.Object ref = filePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINE_NUMBER_FIELD_NUMBER = 2;
  private int lineNumber_;
  /**
   *
   *
   * <pre>
   * 1-based. 0 indicates that the line number is unknown.
   * </pre>
   *
   * <code>int32 line_number = 2;</code>
   */
  public int getLineNumber() {
    return lineNumber_;
  }

  public static final int FUNCTION_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object functionName_;
  /**
   *
   *
   * <pre>
   * Human-readable name of a function or method.
   * The value can include optional context like the class or package name.
   * For example, `my.package.MyClass.method` in case of Java.
   * </pre>
   *
   * <code>string function_name = 4;</code>
   */
  public java.lang.String getFunctionName() {
    java.lang.Object ref = functionName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      functionName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Human-readable name of a function or method.
   * The value can include optional context like the class or package name.
   * For example, `my.package.MyClass.method` in case of Java.
   * </pre>
   *
   * <code>string function_name = 4;</code>
   */
  public com.google.protobuf.ByteString getFunctionNameBytes() {
    java.lang.Object ref = functionName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      functionName_ = b;
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
    if (!getFilePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filePath_);
    }
    if (lineNumber_ != 0) {
      output.writeInt32(2, lineNumber_);
    }
    if (!getFunctionNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, functionName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFilePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filePath_);
    }
    if (lineNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, lineNumber_);
    }
    if (!getFunctionNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, functionName_);
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
    if (!(obj instanceof com.google.devtools.clouderrorreporting.v1beta1.SourceLocation)) {
      return super.equals(obj);
    }
    com.google.devtools.clouderrorreporting.v1beta1.SourceLocation other =
        (com.google.devtools.clouderrorreporting.v1beta1.SourceLocation) obj;

    if (!getFilePath().equals(other.getFilePath())) return false;
    if (getLineNumber() != other.getLineNumber()) return false;
    if (!getFunctionName().equals(other.getFunctionName())) return false;
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
    hash = (37 * hash) + FILE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getFilePath().hashCode();
    hash = (37 * hash) + LINE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getLineNumber();
    hash = (37 * hash) + FUNCTION_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFunctionName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parseFrom(
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
      com.google.devtools.clouderrorreporting.v1beta1.SourceLocation prototype) {
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
   * Indicates a location in the source code of the service for which
   * errors are reported.
   * This data should be provided by the application when reporting an error,
   * unless the error report has been generated automatically from Google App
   * Engine logs. All fields are optional.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.SourceLocation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouderrorreporting.v1beta1.SourceLocation)
      com.google.devtools.clouderrorreporting.v1beta1.SourceLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.class,
              com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.Builder.class);
    }

    // Construct using com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.newBuilder()
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
      filePath_ = "";

      lineNumber_ = 0;

      functionName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_SourceLocation_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.SourceLocation
        getDefaultInstanceForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.SourceLocation build() {
      com.google.devtools.clouderrorreporting.v1beta1.SourceLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.SourceLocation buildPartial() {
      com.google.devtools.clouderrorreporting.v1beta1.SourceLocation result =
          new com.google.devtools.clouderrorreporting.v1beta1.SourceLocation(this);
      result.filePath_ = filePath_;
      result.lineNumber_ = lineNumber_;
      result.functionName_ = functionName_;
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
      if (other instanceof com.google.devtools.clouderrorreporting.v1beta1.SourceLocation) {
        return mergeFrom((com.google.devtools.clouderrorreporting.v1beta1.SourceLocation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouderrorreporting.v1beta1.SourceLocation other) {
      if (other
          == com.google.devtools.clouderrorreporting.v1beta1.SourceLocation.getDefaultInstance())
        return this;
      if (!other.getFilePath().isEmpty()) {
        filePath_ = other.filePath_;
        onChanged();
      }
      if (other.getLineNumber() != 0) {
        setLineNumber(other.getLineNumber());
      }
      if (!other.getFunctionName().isEmpty()) {
        functionName_ = other.functionName_;
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
      com.google.devtools.clouderrorreporting.v1beta1.SourceLocation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.devtools.clouderrorreporting.v1beta1.SourceLocation)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object filePath_ = "";
    /**
     *
     *
     * <pre>
     * The source code filename, which can include a truncated relative
     * path, or a full path from a production machine.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     */
    public java.lang.String getFilePath() {
      java.lang.Object ref = filePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The source code filename, which can include a truncated relative
     * path, or a full path from a production machine.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     */
    public com.google.protobuf.ByteString getFilePathBytes() {
      java.lang.Object ref = filePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The source code filename, which can include a truncated relative
     * path, or a full path from a production machine.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     */
    public Builder setFilePath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      filePath_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source code filename, which can include a truncated relative
     * path, or a full path from a production machine.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     */
    public Builder clearFilePath() {

      filePath_ = getDefaultInstance().getFilePath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The source code filename, which can include a truncated relative
     * path, or a full path from a production machine.
     * </pre>
     *
     * <code>string file_path = 1;</code>
     */
    public Builder setFilePathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      filePath_ = value;
      onChanged();
      return this;
    }

    private int lineNumber_;
    /**
     *
     *
     * <pre>
     * 1-based. 0 indicates that the line number is unknown.
     * </pre>
     *
     * <code>int32 line_number = 2;</code>
     */
    public int getLineNumber() {
      return lineNumber_;
    }
    /**
     *
     *
     * <pre>
     * 1-based. 0 indicates that the line number is unknown.
     * </pre>
     *
     * <code>int32 line_number = 2;</code>
     */
    public Builder setLineNumber(int value) {

      lineNumber_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * 1-based. 0 indicates that the line number is unknown.
     * </pre>
     *
     * <code>int32 line_number = 2;</code>
     */
    public Builder clearLineNumber() {

      lineNumber_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object functionName_ = "";
    /**
     *
     *
     * <pre>
     * Human-readable name of a function or method.
     * The value can include optional context like the class or package name.
     * For example, `my.package.MyClass.method` in case of Java.
     * </pre>
     *
     * <code>string function_name = 4;</code>
     */
    public java.lang.String getFunctionName() {
      java.lang.Object ref = functionName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        functionName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human-readable name of a function or method.
     * The value can include optional context like the class or package name.
     * For example, `my.package.MyClass.method` in case of Java.
     * </pre>
     *
     * <code>string function_name = 4;</code>
     */
    public com.google.protobuf.ByteString getFunctionNameBytes() {
      java.lang.Object ref = functionName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        functionName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Human-readable name of a function or method.
     * The value can include optional context like the class or package name.
     * For example, `my.package.MyClass.method` in case of Java.
     * </pre>
     *
     * <code>string function_name = 4;</code>
     */
    public Builder setFunctionName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      functionName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human-readable name of a function or method.
     * The value can include optional context like the class or package name.
     * For example, `my.package.MyClass.method` in case of Java.
     * </pre>
     *
     * <code>string function_name = 4;</code>
     */
    public Builder clearFunctionName() {

      functionName_ = getDefaultInstance().getFunctionName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Human-readable name of a function or method.
     * The value can include optional context like the class or package name.
     * For example, `my.package.MyClass.method` in case of Java.
     * </pre>
     *
     * <code>string function_name = 4;</code>
     */
    public Builder setFunctionNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      functionName_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.clouderrorreporting.v1beta1.SourceLocation)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.SourceLocation)
  private static final com.google.devtools.clouderrorreporting.v1beta1.SourceLocation
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouderrorreporting.v1beta1.SourceLocation();
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.SourceLocation
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceLocation> PARSER =
      new com.google.protobuf.AbstractParser<SourceLocation>() {
        @java.lang.Override
        public SourceLocation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SourceLocation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SourceLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouderrorreporting.v1beta1.SourceLocation
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
