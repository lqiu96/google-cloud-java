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
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Resource that represents a degree pursuing or acquired by a candidate.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.Degree}
 */
public final class Degree extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.Degree)
    DegreeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Degree.newBuilder() to construct.
  private Degree(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Degree() {
    degreeType_ = 0;
    degreeName_ = "";
    fieldsOfStudy_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Degree();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Degree(
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
          case 8:
            {
              int rawValue = input.readEnum();

              degreeType_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              degreeName_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fieldsOfStudy_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              fieldsOfStudy_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fieldsOfStudy_ = fieldsOfStudy_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.ProfileResourceProto
        .internal_static_google_cloud_talent_v4beta1_Degree_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.ProfileResourceProto
        .internal_static_google_cloud_talent_v4beta1_Degree_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.Degree.class,
            com.google.cloud.talent.v4beta1.Degree.Builder.class);
  }

  public static final int DEGREE_TYPE_FIELD_NUMBER = 1;
  private int degreeType_;
  /**
   *
   *
   * <pre>
   * ISCED degree type.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.DegreeType degree_type = 1;</code>
   *
   * @return The enum numeric value on the wire for degreeType.
   */
  @java.lang.Override
  public int getDegreeTypeValue() {
    return degreeType_;
  }
  /**
   *
   *
   * <pre>
   * ISCED degree type.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.DegreeType degree_type = 1;</code>
   *
   * @return The degreeType.
   */
  @java.lang.Override
  public com.google.cloud.talent.v4beta1.DegreeType getDegreeType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.talent.v4beta1.DegreeType result =
        com.google.cloud.talent.v4beta1.DegreeType.valueOf(degreeType_);
    return result == null ? com.google.cloud.talent.v4beta1.DegreeType.UNRECOGNIZED : result;
  }

  public static final int DEGREE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object degreeName_;
  /**
   *
   *
   * <pre>
   * Full Degree name.
   * For example, "B.S.", "Master of Arts", and so on.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string degree_name = 2;</code>
   *
   * @return The degreeName.
   */
  @java.lang.Override
  public java.lang.String getDegreeName() {
    java.lang.Object ref = degreeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      degreeName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Full Degree name.
   * For example, "B.S.", "Master of Arts", and so on.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string degree_name = 2;</code>
   *
   * @return The bytes for degreeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDegreeNameBytes() {
    java.lang.Object ref = degreeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      degreeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELDS_OF_STUDY_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList fieldsOfStudy_;
  /**
   *
   *
   * <pre>
   * Fields of study for the degree.
   * For example, "Computer science", "engineering".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>repeated string fields_of_study = 3;</code>
   *
   * @return A list containing the fieldsOfStudy.
   */
  public com.google.protobuf.ProtocolStringList getFieldsOfStudyList() {
    return fieldsOfStudy_;
  }
  /**
   *
   *
   * <pre>
   * Fields of study for the degree.
   * For example, "Computer science", "engineering".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>repeated string fields_of_study = 3;</code>
   *
   * @return The count of fieldsOfStudy.
   */
  public int getFieldsOfStudyCount() {
    return fieldsOfStudy_.size();
  }
  /**
   *
   *
   * <pre>
   * Fields of study for the degree.
   * For example, "Computer science", "engineering".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>repeated string fields_of_study = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The fieldsOfStudy at the given index.
   */
  public java.lang.String getFieldsOfStudy(int index) {
    return fieldsOfStudy_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Fields of study for the degree.
   * For example, "Computer science", "engineering".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>repeated string fields_of_study = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the fieldsOfStudy at the given index.
   */
  public com.google.protobuf.ByteString getFieldsOfStudyBytes(int index) {
    return fieldsOfStudy_.getByteString(index);
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
    if (degreeType_
        != com.google.cloud.talent.v4beta1.DegreeType.DEGREE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, degreeType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(degreeName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, degreeName_);
    }
    for (int i = 0; i < fieldsOfStudy_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fieldsOfStudy_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (degreeType_
        != com.google.cloud.talent.v4beta1.DegreeType.DEGREE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, degreeType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(degreeName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, degreeName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fieldsOfStudy_.size(); i++) {
        dataSize += computeStringSizeNoTag(fieldsOfStudy_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFieldsOfStudyList().size();
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.Degree)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.Degree other = (com.google.cloud.talent.v4beta1.Degree) obj;

    if (degreeType_ != other.degreeType_) return false;
    if (!getDegreeName().equals(other.getDegreeName())) return false;
    if (!getFieldsOfStudyList().equals(other.getFieldsOfStudyList())) return false;
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
    hash = (37 * hash) + DEGREE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + degreeType_;
    hash = (37 * hash) + DEGREE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDegreeName().hashCode();
    if (getFieldsOfStudyCount() > 0) {
      hash = (37 * hash) + FIELDS_OF_STUDY_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsOfStudyList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.Degree parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.Degree parseFrom(
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

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.Degree prototype) {
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
   * Resource that represents a degree pursuing or acquired by a candidate.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.Degree}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.Degree)
      com.google.cloud.talent.v4beta1.DegreeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.ProfileResourceProto
          .internal_static_google_cloud_talent_v4beta1_Degree_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.ProfileResourceProto
          .internal_static_google_cloud_talent_v4beta1_Degree_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.Degree.class,
              com.google.cloud.talent.v4beta1.Degree.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.Degree.newBuilder()
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
      degreeType_ = 0;

      degreeName_ = "";

      fieldsOfStudy_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.ProfileResourceProto
          .internal_static_google_cloud_talent_v4beta1_Degree_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.Degree getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.Degree.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.Degree build() {
      com.google.cloud.talent.v4beta1.Degree result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.Degree buildPartial() {
      com.google.cloud.talent.v4beta1.Degree result =
          new com.google.cloud.talent.v4beta1.Degree(this);
      int from_bitField0_ = bitField0_;
      result.degreeType_ = degreeType_;
      result.degreeName_ = degreeName_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fieldsOfStudy_ = fieldsOfStudy_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fieldsOfStudy_ = fieldsOfStudy_;
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
      if (other instanceof com.google.cloud.talent.v4beta1.Degree) {
        return mergeFrom((com.google.cloud.talent.v4beta1.Degree) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.Degree other) {
      if (other == com.google.cloud.talent.v4beta1.Degree.getDefaultInstance()) return this;
      if (other.degreeType_ != 0) {
        setDegreeTypeValue(other.getDegreeTypeValue());
      }
      if (!other.getDegreeName().isEmpty()) {
        degreeName_ = other.degreeName_;
        onChanged();
      }
      if (!other.fieldsOfStudy_.isEmpty()) {
        if (fieldsOfStudy_.isEmpty()) {
          fieldsOfStudy_ = other.fieldsOfStudy_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFieldsOfStudyIsMutable();
          fieldsOfStudy_.addAll(other.fieldsOfStudy_);
        }
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
      com.google.cloud.talent.v4beta1.Degree parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4beta1.Degree) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private int degreeType_ = 0;
    /**
     *
     *
     * <pre>
     * ISCED degree type.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.DegreeType degree_type = 1;</code>
     *
     * @return The enum numeric value on the wire for degreeType.
     */
    @java.lang.Override
    public int getDegreeTypeValue() {
      return degreeType_;
    }
    /**
     *
     *
     * <pre>
     * ISCED degree type.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.DegreeType degree_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for degreeType to set.
     * @return This builder for chaining.
     */
    public Builder setDegreeTypeValue(int value) {

      degreeType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ISCED degree type.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.DegreeType degree_type = 1;</code>
     *
     * @return The degreeType.
     */
    @java.lang.Override
    public com.google.cloud.talent.v4beta1.DegreeType getDegreeType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.talent.v4beta1.DegreeType result =
          com.google.cloud.talent.v4beta1.DegreeType.valueOf(degreeType_);
      return result == null ? com.google.cloud.talent.v4beta1.DegreeType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * ISCED degree type.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.DegreeType degree_type = 1;</code>
     *
     * @param value The degreeType to set.
     * @return This builder for chaining.
     */
    public Builder setDegreeType(com.google.cloud.talent.v4beta1.DegreeType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      degreeType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * ISCED degree type.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.DegreeType degree_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDegreeType() {

      degreeType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object degreeName_ = "";
    /**
     *
     *
     * <pre>
     * Full Degree name.
     * For example, "B.S.", "Master of Arts", and so on.
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>string degree_name = 2;</code>
     *
     * @return The degreeName.
     */
    public java.lang.String getDegreeName() {
      java.lang.Object ref = degreeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        degreeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Full Degree name.
     * For example, "B.S.", "Master of Arts", and so on.
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>string degree_name = 2;</code>
     *
     * @return The bytes for degreeName.
     */
    public com.google.protobuf.ByteString getDegreeNameBytes() {
      java.lang.Object ref = degreeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        degreeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Full Degree name.
     * For example, "B.S.", "Master of Arts", and so on.
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>string degree_name = 2;</code>
     *
     * @param value The degreeName to set.
     * @return This builder for chaining.
     */
    public Builder setDegreeName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      degreeName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full Degree name.
     * For example, "B.S.", "Master of Arts", and so on.
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>string degree_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDegreeName() {

      degreeName_ = getDefaultInstance().getDegreeName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full Degree name.
     * For example, "B.S.", "Master of Arts", and so on.
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>string degree_name = 2;</code>
     *
     * @param value The bytes for degreeName to set.
     * @return This builder for chaining.
     */
    public Builder setDegreeNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      degreeName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList fieldsOfStudy_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureFieldsOfStudyIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fieldsOfStudy_ = new com.google.protobuf.LazyStringArrayList(fieldsOfStudy_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Fields of study for the degree.
     * For example, "Computer science", "engineering".
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>repeated string fields_of_study = 3;</code>
     *
     * @return A list containing the fieldsOfStudy.
     */
    public com.google.protobuf.ProtocolStringList getFieldsOfStudyList() {
      return fieldsOfStudy_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Fields of study for the degree.
     * For example, "Computer science", "engineering".
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>repeated string fields_of_study = 3;</code>
     *
     * @return The count of fieldsOfStudy.
     */
    public int getFieldsOfStudyCount() {
      return fieldsOfStudy_.size();
    }
    /**
     *
     *
     * <pre>
     * Fields of study for the degree.
     * For example, "Computer science", "engineering".
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>repeated string fields_of_study = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The fieldsOfStudy at the given index.
     */
    public java.lang.String getFieldsOfStudy(int index) {
      return fieldsOfStudy_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Fields of study for the degree.
     * For example, "Computer science", "engineering".
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>repeated string fields_of_study = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the fieldsOfStudy at the given index.
     */
    public com.google.protobuf.ByteString getFieldsOfStudyBytes(int index) {
      return fieldsOfStudy_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Fields of study for the degree.
     * For example, "Computer science", "engineering".
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>repeated string fields_of_study = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The fieldsOfStudy to set.
     * @return This builder for chaining.
     */
    public Builder setFieldsOfStudy(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFieldsOfStudyIsMutable();
      fieldsOfStudy_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields of study for the degree.
     * For example, "Computer science", "engineering".
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>repeated string fields_of_study = 3;</code>
     *
     * @param value The fieldsOfStudy to add.
     * @return This builder for chaining.
     */
    public Builder addFieldsOfStudy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFieldsOfStudyIsMutable();
      fieldsOfStudy_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields of study for the degree.
     * For example, "Computer science", "engineering".
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>repeated string fields_of_study = 3;</code>
     *
     * @param values The fieldsOfStudy to add.
     * @return This builder for chaining.
     */
    public Builder addAllFieldsOfStudy(java.lang.Iterable<java.lang.String> values) {
      ensureFieldsOfStudyIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, fieldsOfStudy_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields of study for the degree.
     * For example, "Computer science", "engineering".
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>repeated string fields_of_study = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFieldsOfStudy() {
      fieldsOfStudy_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields of study for the degree.
     * For example, "Computer science", "engineering".
     * Number of characters allowed is 100.
     * </pre>
     *
     * <code>repeated string fields_of_study = 3;</code>
     *
     * @param value The bytes of the fieldsOfStudy to add.
     * @return This builder for chaining.
     */
    public Builder addFieldsOfStudyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureFieldsOfStudyIsMutable();
      fieldsOfStudy_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.Degree)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.Degree)
  private static final com.google.cloud.talent.v4beta1.Degree DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.Degree();
  }

  public static com.google.cloud.talent.v4beta1.Degree getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Degree> PARSER =
      new com.google.protobuf.AbstractParser<Degree>() {
        @java.lang.Override
        public Degree parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Degree(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Degree> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Degree> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.Degree getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
