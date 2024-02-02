/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * Make a snapshot every hour e.g. at 04:00, 05:00, 06:00.
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.HourlySchedule}
 */
public final class HourlySchedule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.HourlySchedule)
    HourlyScheduleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HourlySchedule.newBuilder() to construct.
  private HourlySchedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HourlySchedule() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HourlySchedule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_HourlySchedule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_HourlySchedule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.HourlySchedule.class,
            com.google.cloud.netapp.v1.HourlySchedule.Builder.class);
  }

  private int bitField0_;
  public static final int SNAPSHOTS_TO_KEEP_FIELD_NUMBER = 1;
  private double snapshotsToKeep_ = 0D;
  /**
   *
   *
   * <pre>
   * The maximum number of Snapshots to keep for the hourly schedule
   * </pre>
   *
   * <code>optional double snapshots_to_keep = 1;</code>
   *
   * @return Whether the snapshotsToKeep field is set.
   */
  @java.lang.Override
  public boolean hasSnapshotsToKeep() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The maximum number of Snapshots to keep for the hourly schedule
   * </pre>
   *
   * <code>optional double snapshots_to_keep = 1;</code>
   *
   * @return The snapshotsToKeep.
   */
  @java.lang.Override
  public double getSnapshotsToKeep() {
    return snapshotsToKeep_;
  }

  public static final int MINUTE_FIELD_NUMBER = 2;
  private double minute_ = 0D;
  /**
   *
   *
   * <pre>
   * Set the minute of the hour to start the snapshot (0-59), defaults to the
   * top of the hour (0).
   * </pre>
   *
   * <code>optional double minute = 2;</code>
   *
   * @return Whether the minute field is set.
   */
  @java.lang.Override
  public boolean hasMinute() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Set the minute of the hour to start the snapshot (0-59), defaults to the
   * top of the hour (0).
   * </pre>
   *
   * <code>optional double minute = 2;</code>
   *
   * @return The minute.
   */
  @java.lang.Override
  public double getMinute() {
    return minute_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeDouble(1, snapshotsToKeep_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(2, minute_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, snapshotsToKeep_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, minute_);
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
    if (!(obj instanceof com.google.cloud.netapp.v1.HourlySchedule)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.HourlySchedule other =
        (com.google.cloud.netapp.v1.HourlySchedule) obj;

    if (hasSnapshotsToKeep() != other.hasSnapshotsToKeep()) return false;
    if (hasSnapshotsToKeep()) {
      if (java.lang.Double.doubleToLongBits(getSnapshotsToKeep())
          != java.lang.Double.doubleToLongBits(other.getSnapshotsToKeep())) return false;
    }
    if (hasMinute() != other.hasMinute()) return false;
    if (hasMinute()) {
      if (java.lang.Double.doubleToLongBits(getMinute())
          != java.lang.Double.doubleToLongBits(other.getMinute())) return false;
    }
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
    if (hasSnapshotsToKeep()) {
      hash = (37 * hash) + SNAPSHOTS_TO_KEEP_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getSnapshotsToKeep()));
    }
    if (hasMinute()) {
      hash = (37 * hash) + MINUTE_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getMinute()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.HourlySchedule parseFrom(
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

  public static Builder newBuilder(com.google.cloud.netapp.v1.HourlySchedule prototype) {
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
   * Make a snapshot every hour e.g. at 04:00, 05:00, 06:00.
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.HourlySchedule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.HourlySchedule)
      com.google.cloud.netapp.v1.HourlyScheduleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_HourlySchedule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_HourlySchedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.HourlySchedule.class,
              com.google.cloud.netapp.v1.HourlySchedule.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.HourlySchedule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      snapshotsToKeep_ = 0D;
      minute_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_HourlySchedule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.HourlySchedule getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.HourlySchedule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.HourlySchedule build() {
      com.google.cloud.netapp.v1.HourlySchedule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.HourlySchedule buildPartial() {
      com.google.cloud.netapp.v1.HourlySchedule result =
          new com.google.cloud.netapp.v1.HourlySchedule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.HourlySchedule result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.snapshotsToKeep_ = snapshotsToKeep_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minute_ = minute_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.netapp.v1.HourlySchedule) {
        return mergeFrom((com.google.cloud.netapp.v1.HourlySchedule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.HourlySchedule other) {
      if (other == com.google.cloud.netapp.v1.HourlySchedule.getDefaultInstance()) return this;
      if (other.hasSnapshotsToKeep()) {
        setSnapshotsToKeep(other.getSnapshotsToKeep());
      }
      if (other.hasMinute()) {
        setMinute(other.getMinute());
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
            case 9:
              {
                snapshotsToKeep_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
            case 17:
              {
                minute_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
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

    private double snapshotsToKeep_;
    /**
     *
     *
     * <pre>
     * The maximum number of Snapshots to keep for the hourly schedule
     * </pre>
     *
     * <code>optional double snapshots_to_keep = 1;</code>
     *
     * @return Whether the snapshotsToKeep field is set.
     */
    @java.lang.Override
    public boolean hasSnapshotsToKeep() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The maximum number of Snapshots to keep for the hourly schedule
     * </pre>
     *
     * <code>optional double snapshots_to_keep = 1;</code>
     *
     * @return The snapshotsToKeep.
     */
    @java.lang.Override
    public double getSnapshotsToKeep() {
      return snapshotsToKeep_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of Snapshots to keep for the hourly schedule
     * </pre>
     *
     * <code>optional double snapshots_to_keep = 1;</code>
     *
     * @param value The snapshotsToKeep to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotsToKeep(double value) {

      snapshotsToKeep_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of Snapshots to keep for the hourly schedule
     * </pre>
     *
     * <code>optional double snapshots_to_keep = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSnapshotsToKeep() {
      bitField0_ = (bitField0_ & ~0x00000001);
      snapshotsToKeep_ = 0D;
      onChanged();
      return this;
    }

    private double minute_;
    /**
     *
     *
     * <pre>
     * Set the minute of the hour to start the snapshot (0-59), defaults to the
     * top of the hour (0).
     * </pre>
     *
     * <code>optional double minute = 2;</code>
     *
     * @return Whether the minute field is set.
     */
    @java.lang.Override
    public boolean hasMinute() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Set the minute of the hour to start the snapshot (0-59), defaults to the
     * top of the hour (0).
     * </pre>
     *
     * <code>optional double minute = 2;</code>
     *
     * @return The minute.
     */
    @java.lang.Override
    public double getMinute() {
      return minute_;
    }
    /**
     *
     *
     * <pre>
     * Set the minute of the hour to start the snapshot (0-59), defaults to the
     * top of the hour (0).
     * </pre>
     *
     * <code>optional double minute = 2;</code>
     *
     * @param value The minute to set.
     * @return This builder for chaining.
     */
    public Builder setMinute(double value) {

      minute_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set the minute of the hour to start the snapshot (0-59), defaults to the
     * top of the hour (0).
     * </pre>
     *
     * <code>optional double minute = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinute() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minute_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.HourlySchedule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.HourlySchedule)
  private static final com.google.cloud.netapp.v1.HourlySchedule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.HourlySchedule();
  }

  public static com.google.cloud.netapp.v1.HourlySchedule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HourlySchedule> PARSER =
      new com.google.protobuf.AbstractParser<HourlySchedule>() {
        @java.lang.Override
        public HourlySchedule parsePartialFrom(
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

  public static com.google.protobuf.Parser<HourlySchedule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HourlySchedule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.HourlySchedule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
