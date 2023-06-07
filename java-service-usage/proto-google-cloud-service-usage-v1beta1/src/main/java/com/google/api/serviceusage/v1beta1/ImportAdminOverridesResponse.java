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
// source: google/api/serviceusage/v1beta1/serviceusage.proto

package com.google.api.serviceusage.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for ImportAdminOverrides
 * </pre>
 *
 * Protobuf type {@code google.api.serviceusage.v1beta1.ImportAdminOverridesResponse}
 */
public final class ImportAdminOverridesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.serviceusage.v1beta1.ImportAdminOverridesResponse)
    ImportAdminOverridesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportAdminOverridesResponse.newBuilder() to construct.
  private ImportAdminOverridesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportAdminOverridesResponse() {
    overrides_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportAdminOverridesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.serviceusage.v1beta1.ServiceUsageProto
        .internal_static_google_api_serviceusage_v1beta1_ImportAdminOverridesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.serviceusage.v1beta1.ServiceUsageProto
        .internal_static_google_api_serviceusage_v1beta1_ImportAdminOverridesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse.class,
            com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse.Builder.class);
  }

  public static final int OVERRIDES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride> overrides_;
  /**
   *
   *
   * <pre>
   * The overrides that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride> getOverridesList() {
    return overrides_;
  }
  /**
   *
   *
   * <pre>
   * The overrides that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder>
      getOverridesOrBuilderList() {
    return overrides_;
  }
  /**
   *
   *
   * <pre>
   * The overrides that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  @java.lang.Override
  public int getOverridesCount() {
    return overrides_.size();
  }
  /**
   *
   *
   * <pre>
   * The overrides that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.QuotaOverride getOverrides(int index) {
    return overrides_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The overrides that were created from the imported data.
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
   */
  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder getOverridesOrBuilder(
      int index) {
    return overrides_.get(index);
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
    for (int i = 0; i < overrides_.size(); i++) {
      output.writeMessage(1, overrides_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < overrides_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, overrides_.get(i));
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
    if (!(obj instanceof com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse)) {
      return super.equals(obj);
    }
    com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse other =
        (com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse) obj;

    if (!getOverridesList().equals(other.getOverridesList())) return false;
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
    if (getOverridesCount() > 0) {
      hash = (37 * hash) + OVERRIDES_FIELD_NUMBER;
      hash = (53 * hash) + getOverridesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse parseFrom(
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
      com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse prototype) {
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
   * Response message for ImportAdminOverrides
   * </pre>
   *
   * Protobuf type {@code google.api.serviceusage.v1beta1.ImportAdminOverridesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.serviceusage.v1beta1.ImportAdminOverridesResponse)
      com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1beta1_ImportAdminOverridesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1beta1_ImportAdminOverridesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse.class,
              com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse.Builder.class);
    }

    // Construct using com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (overridesBuilder_ == null) {
        overrides_ = java.util.Collections.emptyList();
      } else {
        overrides_ = null;
        overridesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.serviceusage.v1beta1.ServiceUsageProto
          .internal_static_google_api_serviceusage_v1beta1_ImportAdminOverridesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse
        getDefaultInstanceForType() {
      return com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse build() {
      com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse buildPartial() {
      com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse result =
          new com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse result) {
      if (overridesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          overrides_ = java.util.Collections.unmodifiableList(overrides_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.overrides_ = overrides_;
      } else {
        result.overrides_ = overridesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse) {
        return mergeFrom((com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse other) {
      if (other
          == com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse.getDefaultInstance())
        return this;
      if (overridesBuilder_ == null) {
        if (!other.overrides_.isEmpty()) {
          if (overrides_.isEmpty()) {
            overrides_ = other.overrides_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOverridesIsMutable();
            overrides_.addAll(other.overrides_);
          }
          onChanged();
        }
      } else {
        if (!other.overrides_.isEmpty()) {
          if (overridesBuilder_.isEmpty()) {
            overridesBuilder_.dispose();
            overridesBuilder_ = null;
            overrides_ = other.overrides_;
            bitField0_ = (bitField0_ & ~0x00000001);
            overridesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOverridesFieldBuilder()
                    : null;
          } else {
            overridesBuilder_.addAllMessages(other.overrides_);
          }
        }
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
            case 10:
              {
                com.google.api.serviceusage.v1beta1.QuotaOverride m =
                    input.readMessage(
                        com.google.api.serviceusage.v1beta1.QuotaOverride.parser(),
                        extensionRegistry);
                if (overridesBuilder_ == null) {
                  ensureOverridesIsMutable();
                  overrides_.add(m);
                } else {
                  overridesBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride> overrides_ =
        java.util.Collections.emptyList();

    private void ensureOverridesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        overrides_ =
            new java.util.ArrayList<com.google.api.serviceusage.v1beta1.QuotaOverride>(overrides_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.serviceusage.v1beta1.QuotaOverride,
            com.google.api.serviceusage.v1beta1.QuotaOverride.Builder,
            com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder>
        overridesBuilder_;

    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride> getOverridesList() {
      if (overridesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(overrides_);
      } else {
        return overridesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public int getOverridesCount() {
      if (overridesBuilder_ == null) {
        return overrides_.size();
      } else {
        return overridesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.QuotaOverride getOverrides(int index) {
      if (overridesBuilder_ == null) {
        return overrides_.get(index);
      } else {
        return overridesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder setOverrides(
        int index, com.google.api.serviceusage.v1beta1.QuotaOverride value) {
      if (overridesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOverridesIsMutable();
        overrides_.set(index, value);
        onChanged();
      } else {
        overridesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder setOverrides(
        int index, com.google.api.serviceusage.v1beta1.QuotaOverride.Builder builderForValue) {
      if (overridesBuilder_ == null) {
        ensureOverridesIsMutable();
        overrides_.set(index, builderForValue.build());
        onChanged();
      } else {
        overridesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder addOverrides(com.google.api.serviceusage.v1beta1.QuotaOverride value) {
      if (overridesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOverridesIsMutable();
        overrides_.add(value);
        onChanged();
      } else {
        overridesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder addOverrides(
        int index, com.google.api.serviceusage.v1beta1.QuotaOverride value) {
      if (overridesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOverridesIsMutable();
        overrides_.add(index, value);
        onChanged();
      } else {
        overridesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder addOverrides(
        com.google.api.serviceusage.v1beta1.QuotaOverride.Builder builderForValue) {
      if (overridesBuilder_ == null) {
        ensureOverridesIsMutable();
        overrides_.add(builderForValue.build());
        onChanged();
      } else {
        overridesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder addOverrides(
        int index, com.google.api.serviceusage.v1beta1.QuotaOverride.Builder builderForValue) {
      if (overridesBuilder_ == null) {
        ensureOverridesIsMutable();
        overrides_.add(index, builderForValue.build());
        onChanged();
      } else {
        overridesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder addAllOverrides(
        java.lang.Iterable<? extends com.google.api.serviceusage.v1beta1.QuotaOverride> values) {
      if (overridesBuilder_ == null) {
        ensureOverridesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, overrides_);
        onChanged();
      } else {
        overridesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder clearOverrides() {
      if (overridesBuilder_ == null) {
        overrides_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        overridesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public Builder removeOverrides(int index) {
      if (overridesBuilder_ == null) {
        ensureOverridesIsMutable();
        overrides_.remove(index);
        onChanged();
      } else {
        overridesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.QuotaOverride.Builder getOverridesBuilder(
        int index) {
      return getOverridesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder getOverridesOrBuilder(
        int index) {
      if (overridesBuilder_ == null) {
        return overrides_.get(index);
      } else {
        return overridesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public java.util.List<? extends com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder>
        getOverridesOrBuilderList() {
      if (overridesBuilder_ != null) {
        return overridesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(overrides_);
      }
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.QuotaOverride.Builder addOverridesBuilder() {
      return getOverridesFieldBuilder()
          .addBuilder(com.google.api.serviceusage.v1beta1.QuotaOverride.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public com.google.api.serviceusage.v1beta1.QuotaOverride.Builder addOverridesBuilder(
        int index) {
      return getOverridesFieldBuilder()
          .addBuilder(
              index, com.google.api.serviceusage.v1beta1.QuotaOverride.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The overrides that were created from the imported data.
     * </pre>
     *
     * <code>repeated .google.api.serviceusage.v1beta1.QuotaOverride overrides = 1;</code>
     */
    public java.util.List<com.google.api.serviceusage.v1beta1.QuotaOverride.Builder>
        getOverridesBuilderList() {
      return getOverridesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.serviceusage.v1beta1.QuotaOverride,
            com.google.api.serviceusage.v1beta1.QuotaOverride.Builder,
            com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder>
        getOverridesFieldBuilder() {
      if (overridesBuilder_ == null) {
        overridesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.api.serviceusage.v1beta1.QuotaOverride,
                com.google.api.serviceusage.v1beta1.QuotaOverride.Builder,
                com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder>(
                overrides_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        overrides_ = null;
      }
      return overridesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.api.serviceusage.v1beta1.ImportAdminOverridesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.api.serviceusage.v1beta1.ImportAdminOverridesResponse)
  private static final com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse();
  }

  public static com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportAdminOverridesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ImportAdminOverridesResponse>() {
        @java.lang.Override
        public ImportAdminOverridesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportAdminOverridesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportAdminOverridesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
