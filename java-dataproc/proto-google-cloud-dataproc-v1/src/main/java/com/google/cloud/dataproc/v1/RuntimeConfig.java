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
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Runtime configuration for a workload.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.RuntimeConfig}
 */
public final class RuntimeConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.RuntimeConfig)
    RuntimeConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RuntimeConfig.newBuilder() to construct.
  private RuntimeConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RuntimeConfig() {
    version_ = "";
    containerImage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RuntimeConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RuntimeConfig(
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

              version_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              containerImage_ = s;
              break;
            }
          case 26:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                properties_ =
                    com.google.protobuf.MapField.newMapField(
                        PropertiesDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String> properties__ =
                  input.readMessage(
                      PropertiesDefaultEntryHolder.defaultEntry.getParserForType(),
                      extensionRegistry);
              properties_.getMutableMap().put(properties__.getKey(), properties__.getValue());
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
    return com.google.cloud.dataproc.v1.SharedProto
        .internal_static_google_cloud_dataproc_v1_RuntimeConfig_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 3:
        return internalGetProperties();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.SharedProto
        .internal_static_google_cloud_dataproc_v1_RuntimeConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.RuntimeConfig.class,
            com.google.cloud.dataproc.v1.RuntimeConfig.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object version_;
  /**
   *
   *
   * <pre>
   * Optional. Version of the batch runtime.
   * </pre>
   *
   * <code>string version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Version of the batch runtime.
   * </pre>
   *
   * <code>string version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTAINER_IMAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object containerImage_;
  /**
   *
   *
   * <pre>
   * Optional. Optional custom container image for the job runtime environment. If
   * not specified, a default container image will be used.
   * </pre>
   *
   * <code>string container_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The containerImage.
   */
  @java.lang.Override
  public java.lang.String getContainerImage() {
    java.lang.Object ref = containerImage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      containerImage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Optional custom container image for the job runtime environment. If
   * not specified, a default container image will be used.
   * </pre>
   *
   * <code>string container_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for containerImage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContainerImageBytes() {
    java.lang.Object ref = containerImage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      containerImage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROPERTIES_FIELD_NUMBER = 3;

  private static final class PropertiesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.dataproc.v1.SharedProto
                .internal_static_google_cloud_dataproc_v1_RuntimeConfig_PropertiesEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> properties_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetProperties() {
    if (properties_ == null) {
      return com.google.protobuf.MapField.emptyMapField(PropertiesDefaultEntryHolder.defaultEntry);
    }
    return properties_;
  }

  public int getPropertiesCount() {
    return internalGetProperties().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, which are used to configure workload
   * execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public boolean containsProperties(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetProperties().getMap().containsKey(key);
  }
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getProperties() {
    return getPropertiesMap();
  }
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, which are used to configure workload
   * execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getPropertiesMap() {
    return internalGetProperties().getMap();
  }
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, which are used to configure workload
   * execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public java.lang.String getPropertiesOrDefault(
      java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetProperties().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, which are used to configure workload
   * execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public java.lang.String getPropertiesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetProperties().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(containerImage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, containerImage_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetProperties(), PropertiesDefaultEntryHolder.defaultEntry, 3);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(containerImage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, containerImage_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetProperties().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> properties__ =
          PropertiesDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, properties__);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.RuntimeConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.RuntimeConfig other =
        (com.google.cloud.dataproc.v1.RuntimeConfig) obj;

    if (!getVersion().equals(other.getVersion())) return false;
    if (!getContainerImage().equals(other.getContainerImage())) return false;
    if (!internalGetProperties().equals(other.internalGetProperties())) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + CONTAINER_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getContainerImage().hashCode();
    if (!internalGetProperties().getMap().isEmpty()) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetProperties().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.RuntimeConfig prototype) {
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
   * Runtime configuration for a workload.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.RuntimeConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.RuntimeConfig)
      com.google.cloud.dataproc.v1.RuntimeConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_RuntimeConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 3:
          return internalGetProperties();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 3:
          return internalGetMutableProperties();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_RuntimeConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.RuntimeConfig.class,
              com.google.cloud.dataproc.v1.RuntimeConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.RuntimeConfig.newBuilder()
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
      version_ = "";

      containerImage_ = "";

      internalGetMutableProperties().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.SharedProto
          .internal_static_google_cloud_dataproc_v1_RuntimeConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.RuntimeConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.RuntimeConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.RuntimeConfig build() {
      com.google.cloud.dataproc.v1.RuntimeConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.RuntimeConfig buildPartial() {
      com.google.cloud.dataproc.v1.RuntimeConfig result =
          new com.google.cloud.dataproc.v1.RuntimeConfig(this);
      int from_bitField0_ = bitField0_;
      result.version_ = version_;
      result.containerImage_ = containerImage_;
      result.properties_ = internalGetProperties();
      result.properties_.makeImmutable();
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
      if (other instanceof com.google.cloud.dataproc.v1.RuntimeConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.RuntimeConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.RuntimeConfig other) {
      if (other == com.google.cloud.dataproc.v1.RuntimeConfig.getDefaultInstance()) return this;
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (!other.getContainerImage().isEmpty()) {
        containerImage_ = other.containerImage_;
        onChanged();
      }
      internalGetMutableProperties().mergeFrom(other.internalGetProperties());
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
      com.google.cloud.dataproc.v1.RuntimeConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.RuntimeConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Version of the batch runtime.
     * </pre>
     *
     * <code>string version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Version of the batch runtime.
     * </pre>
     *
     * <code>string version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Version of the batch runtime.
     * </pre>
     *
     * <code>string version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      version_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Version of the batch runtime.
     * </pre>
     *
     * <code>string version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {

      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Version of the batch runtime.
     * </pre>
     *
     * <code>string version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      version_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object containerImage_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Optional custom container image for the job runtime environment. If
     * not specified, a default container image will be used.
     * </pre>
     *
     * <code>string container_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The containerImage.
     */
    public java.lang.String getContainerImage() {
      java.lang.Object ref = containerImage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        containerImage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional custom container image for the job runtime environment. If
     * not specified, a default container image will be used.
     * </pre>
     *
     * <code>string container_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for containerImage.
     */
    public com.google.protobuf.ByteString getContainerImageBytes() {
      java.lang.Object ref = containerImage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        containerImage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional custom container image for the job runtime environment. If
     * not specified, a default container image will be used.
     * </pre>
     *
     * <code>string container_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The containerImage to set.
     * @return This builder for chaining.
     */
    public Builder setContainerImage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      containerImage_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional custom container image for the job runtime environment. If
     * not specified, a default container image will be used.
     * </pre>
     *
     * <code>string container_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContainerImage() {

      containerImage_ = getDefaultInstance().getContainerImage();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Optional custom container image for the job runtime environment. If
     * not specified, a default container image will be used.
     * </pre>
     *
     * <code>string container_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for containerImage to set.
     * @return This builder for chaining.
     */
    public Builder setContainerImageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      containerImage_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> properties_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetProperties() {
      if (properties_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PropertiesDefaultEntryHolder.defaultEntry);
      }
      return properties_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableProperties() {
      onChanged();
      ;
      if (properties_ == null) {
        properties_ =
            com.google.protobuf.MapField.newMapField(PropertiesDefaultEntryHolder.defaultEntry);
      }
      if (!properties_.isMutable()) {
        properties_ = properties_.copy();
      }
      return properties_;
    }

    public int getPropertiesCount() {
      return internalGetProperties().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Optional. A mapping of property names to values, which are used to configure workload
     * execution.
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    @java.lang.Override
    public boolean containsProperties(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetProperties().getMap().containsKey(key);
    }
    /** Use {@link #getPropertiesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getProperties() {
      return getPropertiesMap();
    }
    /**
     *
     *
     * <pre>
     * Optional. A mapping of property names to values, which are used to configure workload
     * execution.
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getPropertiesMap() {
      return internalGetProperties().getMap();
    }
    /**
     *
     *
     * <pre>
     * Optional. A mapping of property names to values, which are used to configure workload
     * execution.
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    @java.lang.Override
    public java.lang.String getPropertiesOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetProperties().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Optional. A mapping of property names to values, which are used to configure workload
     * execution.
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    @java.lang.Override
    public java.lang.String getPropertiesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetProperties().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearProperties() {
      internalGetMutableProperties().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A mapping of property names to values, which are used to configure workload
     * execution.
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder removeProperties(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableProperties().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableProperties() {
      return internalGetMutableProperties().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Optional. A mapping of property names to values, which are used to configure workload
     * execution.
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder putProperties(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableProperties().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A mapping of property names to values, which are used to configure workload
     * execution.
     * </pre>
     *
     * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder putAllProperties(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableProperties().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.RuntimeConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.RuntimeConfig)
  private static final com.google.cloud.dataproc.v1.RuntimeConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.RuntimeConfig();
  }

  public static com.google.cloud.dataproc.v1.RuntimeConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeConfig> PARSER =
      new com.google.protobuf.AbstractParser<RuntimeConfig>() {
        @java.lang.Override
        public RuntimeConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RuntimeConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RuntimeConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.RuntimeConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
