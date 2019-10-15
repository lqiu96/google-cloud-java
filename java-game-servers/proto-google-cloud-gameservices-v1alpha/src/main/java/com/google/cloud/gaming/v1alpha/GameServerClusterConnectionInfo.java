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
// source: google/cloud/gaming/v1alpha/game_server_clusters.proto

package com.google.cloud.gaming.v1alpha;

/**
 *
 *
 * <pre>
 * Game server cluster connection information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo}
 */
public final class GameServerClusterConnectionInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo)
    GameServerClusterConnectionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GameServerClusterConnectionInfo.newBuilder() to construct.
  private GameServerClusterConnectionInfo(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GameServerClusterConnectionInfo() {
    namespace_ = "";
    gkeName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GameServerClusterConnectionInfo(
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
          case 42:
            {
              java.lang.String s = input.readStringRequireUtf8();

              namespace_ = s;
              break;
            }
          case 50:
            {
              java.lang.String s = input.readStringRequireUtf8();

              gkeName_ = s;
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
    return com.google.cloud.gaming.v1alpha.GameServerClusters
        .internal_static_google_cloud_gaming_v1alpha_GameServerClusterConnectionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1alpha.GameServerClusters
        .internal_static_google_cloud_gaming_v1alpha_GameServerClusterConnectionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo.class,
            com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo.Builder.class);
  }

  public static final int NAMESPACE_FIELD_NUMBER = 5;
  private volatile java.lang.Object namespace_;
  /**
   *
   *
   * <pre>
   * Namespace for Kubernetes API server endpoint.
   * </pre>
   *
   * <code>string namespace = 5;</code>
   */
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Namespace for Kubernetes API server endpoint.
   * </pre>
   *
   * <code>string namespace = 5;</code>
   */
  public com.google.protobuf.ByteString getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GKE_NAME_FIELD_NUMBER = 6;
  private volatile java.lang.Object gkeName_;
  /**
   *
   *
   * <pre>
   * This is the gkeName where the game server cluster is installed.
   * It must the format "projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;". For example,
   * "projects/my-project/locations/us-central1/clusters/test".
   * </pre>
   *
   * <code>string gke_name = 6;</code>
   */
  public java.lang.String getGkeName() {
    java.lang.Object ref = gkeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gkeName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * This is the gkeName where the game server cluster is installed.
   * It must the format "projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;". For example,
   * "projects/my-project/locations/us-central1/clusters/test".
   * </pre>
   *
   * <code>string gke_name = 6;</code>
   */
  public com.google.protobuf.ByteString getGkeNameBytes() {
    java.lang.Object ref = gkeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gkeName_ = b;
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
    if (!getNamespaceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, namespace_);
    }
    if (!getGkeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, gkeName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNamespaceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, namespace_);
    }
    if (!getGkeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, gkeName_);
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
    if (!(obj instanceof com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo other =
        (com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo) obj;

    if (!getNamespace().equals(other.getNamespace())) return false;
    if (!getGkeName().equals(other.getGkeName())) return false;
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
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    hash = (37 * hash) + GKE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getGkeName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parseFrom(
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
      com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo prototype) {
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
   * Game server cluster connection information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo)
      com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1alpha.GameServerClusters
          .internal_static_google_cloud_gaming_v1alpha_GameServerClusterConnectionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1alpha.GameServerClusters
          .internal_static_google_cloud_gaming_v1alpha_GameServerClusterConnectionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo.class,
              com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo.newBuilder()
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
      namespace_ = "";

      gkeName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1alpha.GameServerClusters
          .internal_static_google_cloud_gaming_v1alpha_GameServerClusterConnectionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo
        getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo build() {
      com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo buildPartial() {
      com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo result =
          new com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo(this);
      result.namespace_ = namespace_;
      result.gkeName_ = gkeName_;
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
      if (other instanceof com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo) {
        return mergeFrom((com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo other) {
      if (other
          == com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo.getDefaultInstance())
        return this;
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
        onChanged();
      }
      if (!other.getGkeName().isEmpty()) {
        gkeName_ = other.gkeName_;
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
      com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object namespace_ = "";
    /**
     *
     *
     * <pre>
     * Namespace for Kubernetes API server endpoint.
     * </pre>
     *
     * <code>string namespace = 5;</code>
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Namespace for Kubernetes API server endpoint.
     * </pre>
     *
     * <code>string namespace = 5;</code>
     */
    public com.google.protobuf.ByteString getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Namespace for Kubernetes API server endpoint.
     * </pre>
     *
     * <code>string namespace = 5;</code>
     */
    public Builder setNamespace(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      namespace_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Namespace for Kubernetes API server endpoint.
     * </pre>
     *
     * <code>string namespace = 5;</code>
     */
    public Builder clearNamespace() {

      namespace_ = getDefaultInstance().getNamespace();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Namespace for Kubernetes API server endpoint.
     * </pre>
     *
     * <code>string namespace = 5;</code>
     */
    public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      namespace_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gkeName_ = "";
    /**
     *
     *
     * <pre>
     * This is the gkeName where the game server cluster is installed.
     * It must the format "projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;". For example,
     * "projects/my-project/locations/us-central1/clusters/test".
     * </pre>
     *
     * <code>string gke_name = 6;</code>
     */
    public java.lang.String getGkeName() {
      java.lang.Object ref = gkeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gkeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * This is the gkeName where the game server cluster is installed.
     * It must the format "projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;". For example,
     * "projects/my-project/locations/us-central1/clusters/test".
     * </pre>
     *
     * <code>string gke_name = 6;</code>
     */
    public com.google.protobuf.ByteString getGkeNameBytes() {
      java.lang.Object ref = gkeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gkeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * This is the gkeName where the game server cluster is installed.
     * It must the format "projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;". For example,
     * "projects/my-project/locations/us-central1/clusters/test".
     * </pre>
     *
     * <code>string gke_name = 6;</code>
     */
    public Builder setGkeName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      gkeName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This is the gkeName where the game server cluster is installed.
     * It must the format "projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;". For example,
     * "projects/my-project/locations/us-central1/clusters/test".
     * </pre>
     *
     * <code>string gke_name = 6;</code>
     */
    public Builder clearGkeName() {

      gkeName_ = getDefaultInstance().getGkeName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This is the gkeName where the game server cluster is installed.
     * It must the format "projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;". For example,
     * "projects/my-project/locations/us-central1/clusters/test".
     * </pre>
     *
     * <code>string gke_name = 6;</code>
     */
    public Builder setGkeNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      gkeName_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo)
  private static final com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo();
  }

  public static com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameServerClusterConnectionInfo> PARSER =
      new com.google.protobuf.AbstractParser<GameServerClusterConnectionInfo>() {
        @java.lang.Override
        public GameServerClusterConnectionInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GameServerClusterConnectionInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GameServerClusterConnectionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameServerClusterConnectionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1alpha.GameServerClusterConnectionInfo
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
