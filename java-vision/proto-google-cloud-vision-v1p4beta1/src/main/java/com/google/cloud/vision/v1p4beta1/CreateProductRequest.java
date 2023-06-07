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
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

package com.google.cloud.vision.v1p4beta1;

/**
 *
 *
 * <pre>
 * Request message for the `CreateProduct` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.CreateProductRequest}
 */
public final class CreateProductRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.CreateProductRequest)
    CreateProductRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateProductRequest.newBuilder() to construct.
  private CreateProductRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateProductRequest() {
    parent_ = "";
    productId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateProductRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p4beta1_CreateProductRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1p4beta1_CreateProductRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.CreateProductRequest.class,
            com.google.cloud.vision.v1p4beta1.CreateProductRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The project in which the Product should be created.
   *
   * Format is
   * `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The project in which the Product should be created.
   *
   * Format is
   * `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCT_FIELD_NUMBER = 2;
  private com.google.cloud.vision.v1p4beta1.Product product_;
  /**
   *
   *
   * <pre>
   * Required. The product to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the product field is set.
   */
  @java.lang.Override
  public boolean hasProduct() {
    return product_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The product to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The product.
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.Product getProduct() {
    return product_ == null
        ? com.google.cloud.vision.v1p4beta1.Product.getDefaultInstance()
        : product_;
  }
  /**
   *
   *
   * <pre>
   * Required. The product to create.
   * </pre>
   *
   * <code>
   * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.ProductOrBuilder getProductOrBuilder() {
    return product_ == null
        ? com.google.cloud.vision.v1p4beta1.Product.getDefaultInstance()
        : product_;
  }

  public static final int PRODUCT_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object productId_ = "";
  /**
   *
   *
   * <pre>
   * A user-supplied resource id for this Product. If set, the server will
   * attempt to use this value as the resource id. If it is already in use, an
   * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
   * long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string product_id = 3;</code>
   *
   * @return The productId.
   */
  @java.lang.Override
  public java.lang.String getProductId() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A user-supplied resource id for this Product. If set, the server will
   * attempt to use this value as the resource id. If it is already in use, an
   * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
   * long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string product_id = 3;</code>
   *
   * @return The bytes for productId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProductIdBytes() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      productId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (product_ != null) {
      output.writeMessage(2, getProduct());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, productId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (product_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getProduct());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, productId_);
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
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.CreateProductRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.CreateProductRequest other =
        (com.google.cloud.vision.v1p4beta1.CreateProductRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasProduct() != other.hasProduct()) return false;
    if (hasProduct()) {
      if (!getProduct().equals(other.getProduct())) return false;
    }
    if (!getProductId().equals(other.getProductId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest parseFrom(
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
      com.google.cloud.vision.v1p4beta1.CreateProductRequest prototype) {
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
   * Request message for the `CreateProduct` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.CreateProductRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.CreateProductRequest)
      com.google.cloud.vision.v1p4beta1.CreateProductRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p4beta1_CreateProductRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p4beta1_CreateProductRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.CreateProductRequest.class,
              com.google.cloud.vision.v1p4beta1.CreateProductRequest.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p4beta1.CreateProductRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      product_ = null;
      if (productBuilder_ != null) {
        productBuilder_.dispose();
        productBuilder_ = null;
      }
      productId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1p4beta1_CreateProductRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.CreateProductRequest getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.CreateProductRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.CreateProductRequest build() {
      com.google.cloud.vision.v1p4beta1.CreateProductRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.CreateProductRequest buildPartial() {
      com.google.cloud.vision.v1p4beta1.CreateProductRequest result =
          new com.google.cloud.vision.v1p4beta1.CreateProductRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vision.v1p4beta1.CreateProductRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.product_ = productBuilder_ == null ? product_ : productBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.productId_ = productId_;
      }
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
      if (other instanceof com.google.cloud.vision.v1p4beta1.CreateProductRequest) {
        return mergeFrom((com.google.cloud.vision.v1p4beta1.CreateProductRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p4beta1.CreateProductRequest other) {
      if (other == com.google.cloud.vision.v1p4beta1.CreateProductRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
      }
      if (!other.getProductId().isEmpty()) {
        productId_ = other.productId_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getProductFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                productId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The project in which the Product should be created.
     *
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the Product should be created.
     *
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the Product should be created.
     *
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the Product should be created.
     *
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the Product should be created.
     *
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.vision.v1p4beta1.Product product_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.Product,
            com.google.cloud.vision.v1p4beta1.Product.Builder,
            com.google.cloud.vision.v1p4beta1.ProductOrBuilder>
        productBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the product field is set.
     */
    public boolean hasProduct() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The product.
     */
    public com.google.cloud.vision.v1p4beta1.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null
            ? com.google.cloud.vision.v1p4beta1.Product.getDefaultInstance()
            : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProduct(com.google.cloud.vision.v1p4beta1.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
      } else {
        productBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProduct(com.google.cloud.vision.v1p4beta1.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeProduct(com.google.cloud.vision.v1p4beta1.Product value) {
      if (productBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && product_ != null
            && product_ != com.google.cloud.vision.v1p4beta1.Product.getDefaultInstance()) {
          getProductBuilder().mergeFrom(value);
        } else {
          product_ = value;
        }
      } else {
        productBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearProduct() {
      bitField0_ = (bitField0_ & ~0x00000002);
      product_ = null;
      if (productBuilder_ != null) {
        productBuilder_.dispose();
        productBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1p4beta1.Product.Builder getProductBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1p4beta1.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null
            ? com.google.cloud.vision.v1p4beta1.Product.getDefaultInstance()
            : product_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>
     * .google.cloud.vision.v1p4beta1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.Product,
            com.google.cloud.vision.v1p4beta1.Product.Builder,
            com.google.cloud.vision.v1p4beta1.ProductOrBuilder>
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1p4beta1.Product,
                com.google.cloud.vision.v1p4beta1.Product.Builder,
                com.google.cloud.vision.v1p4beta1.ProductOrBuilder>(
                getProduct(), getParentForChildren(), isClean());
        product_ = null;
      }
      return productBuilder_;
    }

    private java.lang.Object productId_ = "";
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this Product. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_id = 3;</code>
     *
     * @return The productId.
     */
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this Product. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_id = 3;</code>
     *
     * @return The bytes for productId.
     */
    public com.google.protobuf.ByteString getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this Product. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_id = 3;</code>
     *
     * @param value The productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      productId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this Product. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProductId() {
      productId_ = getDefaultInstance().getProductId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this Product. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_id = 3;</code>
     *
     * @param value The bytes for productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      productId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.CreateProductRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.CreateProductRequest)
  private static final com.google.cloud.vision.v1p4beta1.CreateProductRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.CreateProductRequest();
  }

  public static com.google.cloud.vision.v1p4beta1.CreateProductRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateProductRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateProductRequest>() {
        @java.lang.Override
        public CreateProductRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateProductRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateProductRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.CreateProductRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
