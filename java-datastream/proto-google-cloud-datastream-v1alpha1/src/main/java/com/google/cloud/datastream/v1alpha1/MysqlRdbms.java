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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

/**
 *
 *
 * <pre>
 * MySQL database structure
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1alpha1.MysqlRdbms}
 */
public final class MysqlRdbms extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1alpha1.MysqlRdbms)
    MysqlRdbmsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MysqlRdbms.newBuilder() to construct.
  private MysqlRdbms(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MysqlRdbms() {
    mysqlDatabases_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MysqlRdbms();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MysqlRdbms(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mysqlDatabases_ =
                    new java.util.ArrayList<com.google.cloud.datastream.v1alpha1.MysqlDatabase>();
                mutable_bitField0_ |= 0x00000001;
              }
              mysqlDatabases_.add(
                  input.readMessage(
                      com.google.cloud.datastream.v1alpha1.MysqlDatabase.parser(),
                      extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        mysqlDatabases_ = java.util.Collections.unmodifiableList(mysqlDatabases_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1alpha1_MysqlRdbms_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1alpha1_MysqlRdbms_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1alpha1.MysqlRdbms.class,
            com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder.class);
  }

  public static final int MYSQL_DATABASES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.datastream.v1alpha1.MysqlDatabase> mysqlDatabases_;
  /**
   *
   *
   * <pre>
   * Mysql databases on the server
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datastream.v1alpha1.MysqlDatabase>
      getMysqlDatabasesList() {
    return mysqlDatabases_;
  }
  /**
   *
   *
   * <pre>
   * Mysql databases on the server
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datastream.v1alpha1.MysqlDatabaseOrBuilder>
      getMysqlDatabasesOrBuilderList() {
    return mysqlDatabases_;
  }
  /**
   *
   *
   * <pre>
   * Mysql databases on the server
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
   */
  @java.lang.Override
  public int getMysqlDatabasesCount() {
    return mysqlDatabases_.size();
  }
  /**
   *
   *
   * <pre>
   * Mysql databases on the server
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlDatabase getMysqlDatabases(int index) {
    return mysqlDatabases_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Mysql databases on the server
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlDatabaseOrBuilder getMysqlDatabasesOrBuilder(
      int index) {
    return mysqlDatabases_.get(index);
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
    for (int i = 0; i < mysqlDatabases_.size(); i++) {
      output.writeMessage(1, mysqlDatabases_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mysqlDatabases_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, mysqlDatabases_.get(i));
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
    if (!(obj instanceof com.google.cloud.datastream.v1alpha1.MysqlRdbms)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1alpha1.MysqlRdbms other =
        (com.google.cloud.datastream.v1alpha1.MysqlRdbms) obj;

    if (!getMysqlDatabasesList().equals(other.getMysqlDatabasesList())) return false;
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
    if (getMysqlDatabasesCount() > 0) {
      hash = (37 * hash) + MYSQL_DATABASES_FIELD_NUMBER;
      hash = (53 * hash) + getMysqlDatabasesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datastream.v1alpha1.MysqlRdbms prototype) {
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
   * MySQL database structure
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1alpha1.MysqlRdbms}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1alpha1.MysqlRdbms)
      com.google.cloud.datastream.v1alpha1.MysqlRdbmsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_MysqlRdbms_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_MysqlRdbms_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1alpha1.MysqlRdbms.class,
              com.google.cloud.datastream.v1alpha1.MysqlRdbms.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1alpha1.MysqlRdbms.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMysqlDatabasesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mysqlDatabasesBuilder_ == null) {
        mysqlDatabases_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mysqlDatabasesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_MysqlRdbms_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.MysqlRdbms getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.MysqlRdbms build() {
      com.google.cloud.datastream.v1alpha1.MysqlRdbms result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.MysqlRdbms buildPartial() {
      com.google.cloud.datastream.v1alpha1.MysqlRdbms result =
          new com.google.cloud.datastream.v1alpha1.MysqlRdbms(this);
      int from_bitField0_ = bitField0_;
      if (mysqlDatabasesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mysqlDatabases_ = java.util.Collections.unmodifiableList(mysqlDatabases_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mysqlDatabases_ = mysqlDatabases_;
      } else {
        result.mysqlDatabases_ = mysqlDatabasesBuilder_.build();
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
      if (other instanceof com.google.cloud.datastream.v1alpha1.MysqlRdbms) {
        return mergeFrom((com.google.cloud.datastream.v1alpha1.MysqlRdbms) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1alpha1.MysqlRdbms other) {
      if (other == com.google.cloud.datastream.v1alpha1.MysqlRdbms.getDefaultInstance())
        return this;
      if (mysqlDatabasesBuilder_ == null) {
        if (!other.mysqlDatabases_.isEmpty()) {
          if (mysqlDatabases_.isEmpty()) {
            mysqlDatabases_ = other.mysqlDatabases_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMysqlDatabasesIsMutable();
            mysqlDatabases_.addAll(other.mysqlDatabases_);
          }
          onChanged();
        }
      } else {
        if (!other.mysqlDatabases_.isEmpty()) {
          if (mysqlDatabasesBuilder_.isEmpty()) {
            mysqlDatabasesBuilder_.dispose();
            mysqlDatabasesBuilder_ = null;
            mysqlDatabases_ = other.mysqlDatabases_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mysqlDatabasesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMysqlDatabasesFieldBuilder()
                    : null;
          } else {
            mysqlDatabasesBuilder_.addAllMessages(other.mysqlDatabases_);
          }
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
      com.google.cloud.datastream.v1alpha1.MysqlRdbms parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datastream.v1alpha1.MysqlRdbms) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.datastream.v1alpha1.MysqlDatabase> mysqlDatabases_ =
        java.util.Collections.emptyList();

    private void ensureMysqlDatabasesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mysqlDatabases_ =
            new java.util.ArrayList<com.google.cloud.datastream.v1alpha1.MysqlDatabase>(
                mysqlDatabases_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1alpha1.MysqlDatabase,
            com.google.cloud.datastream.v1alpha1.MysqlDatabase.Builder,
            com.google.cloud.datastream.v1alpha1.MysqlDatabaseOrBuilder>
        mysqlDatabasesBuilder_;

    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1alpha1.MysqlDatabase>
        getMysqlDatabasesList() {
      if (mysqlDatabasesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mysqlDatabases_);
      } else {
        return mysqlDatabasesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public int getMysqlDatabasesCount() {
      if (mysqlDatabasesBuilder_ == null) {
        return mysqlDatabases_.size();
      } else {
        return mysqlDatabasesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlDatabase getMysqlDatabases(int index) {
      if (mysqlDatabasesBuilder_ == null) {
        return mysqlDatabases_.get(index);
      } else {
        return mysqlDatabasesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public Builder setMysqlDatabases(
        int index, com.google.cloud.datastream.v1alpha1.MysqlDatabase value) {
      if (mysqlDatabasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMysqlDatabasesIsMutable();
        mysqlDatabases_.set(index, value);
        onChanged();
      } else {
        mysqlDatabasesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public Builder setMysqlDatabases(
        int index, com.google.cloud.datastream.v1alpha1.MysqlDatabase.Builder builderForValue) {
      if (mysqlDatabasesBuilder_ == null) {
        ensureMysqlDatabasesIsMutable();
        mysqlDatabases_.set(index, builderForValue.build());
        onChanged();
      } else {
        mysqlDatabasesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public Builder addMysqlDatabases(com.google.cloud.datastream.v1alpha1.MysqlDatabase value) {
      if (mysqlDatabasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMysqlDatabasesIsMutable();
        mysqlDatabases_.add(value);
        onChanged();
      } else {
        mysqlDatabasesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public Builder addMysqlDatabases(
        int index, com.google.cloud.datastream.v1alpha1.MysqlDatabase value) {
      if (mysqlDatabasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMysqlDatabasesIsMutable();
        mysqlDatabases_.add(index, value);
        onChanged();
      } else {
        mysqlDatabasesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public Builder addMysqlDatabases(
        com.google.cloud.datastream.v1alpha1.MysqlDatabase.Builder builderForValue) {
      if (mysqlDatabasesBuilder_ == null) {
        ensureMysqlDatabasesIsMutable();
        mysqlDatabases_.add(builderForValue.build());
        onChanged();
      } else {
        mysqlDatabasesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public Builder addMysqlDatabases(
        int index, com.google.cloud.datastream.v1alpha1.MysqlDatabase.Builder builderForValue) {
      if (mysqlDatabasesBuilder_ == null) {
        ensureMysqlDatabasesIsMutable();
        mysqlDatabases_.add(index, builderForValue.build());
        onChanged();
      } else {
        mysqlDatabasesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public Builder addAllMysqlDatabases(
        java.lang.Iterable<? extends com.google.cloud.datastream.v1alpha1.MysqlDatabase> values) {
      if (mysqlDatabasesBuilder_ == null) {
        ensureMysqlDatabasesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, mysqlDatabases_);
        onChanged();
      } else {
        mysqlDatabasesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public Builder clearMysqlDatabases() {
      if (mysqlDatabasesBuilder_ == null) {
        mysqlDatabases_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mysqlDatabasesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public Builder removeMysqlDatabases(int index) {
      if (mysqlDatabasesBuilder_ == null) {
        ensureMysqlDatabasesIsMutable();
        mysqlDatabases_.remove(index);
        onChanged();
      } else {
        mysqlDatabasesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlDatabase.Builder getMysqlDatabasesBuilder(
        int index) {
      return getMysqlDatabasesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlDatabaseOrBuilder getMysqlDatabasesOrBuilder(
        int index) {
      if (mysqlDatabasesBuilder_ == null) {
        return mysqlDatabases_.get(index);
      } else {
        return mysqlDatabasesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datastream.v1alpha1.MysqlDatabaseOrBuilder>
        getMysqlDatabasesOrBuilderList() {
      if (mysqlDatabasesBuilder_ != null) {
        return mysqlDatabasesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mysqlDatabases_);
      }
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlDatabase.Builder addMysqlDatabasesBuilder() {
      return getMysqlDatabasesFieldBuilder()
          .addBuilder(com.google.cloud.datastream.v1alpha1.MysqlDatabase.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlDatabase.Builder addMysqlDatabasesBuilder(
        int index) {
      return getMysqlDatabasesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.datastream.v1alpha1.MysqlDatabase.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Mysql databases on the server
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlDatabase mysql_databases = 1;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1alpha1.MysqlDatabase.Builder>
        getMysqlDatabasesBuilderList() {
      return getMysqlDatabasesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1alpha1.MysqlDatabase,
            com.google.cloud.datastream.v1alpha1.MysqlDatabase.Builder,
            com.google.cloud.datastream.v1alpha1.MysqlDatabaseOrBuilder>
        getMysqlDatabasesFieldBuilder() {
      if (mysqlDatabasesBuilder_ == null) {
        mysqlDatabasesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datastream.v1alpha1.MysqlDatabase,
                com.google.cloud.datastream.v1alpha1.MysqlDatabase.Builder,
                com.google.cloud.datastream.v1alpha1.MysqlDatabaseOrBuilder>(
                mysqlDatabases_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mysqlDatabases_ = null;
      }
      return mysqlDatabasesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1alpha1.MysqlRdbms)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1alpha1.MysqlRdbms)
  private static final com.google.cloud.datastream.v1alpha1.MysqlRdbms DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1alpha1.MysqlRdbms();
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlRdbms getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MysqlRdbms> PARSER =
      new com.google.protobuf.AbstractParser<MysqlRdbms>() {
        @java.lang.Override
        public MysqlRdbms parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MysqlRdbms(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MysqlRdbms> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MysqlRdbms> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlRdbms getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
