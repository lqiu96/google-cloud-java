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
 * Make a snapshot once a month e.g. at 2nd 04:00, 7th 05:20, 24th 23:50
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.MonthlySchedule}
 */
public final class MonthlySchedule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.MonthlySchedule)
    MonthlyScheduleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MonthlySchedule.newBuilder() to construct.
  private MonthlySchedule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MonthlySchedule() {
    daysOfMonth_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MonthlySchedule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_MonthlySchedule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_MonthlySchedule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.MonthlySchedule.class,
            com.google.cloud.netapp.v1.MonthlySchedule.Builder.class);
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

  public static final int HOUR_FIELD_NUMBER = 3;
  private double hour_ = 0D;
  /**
   *
   *
   * <pre>
   * Set the hour to start the snapshot (0-23), defaults to midnight (0).
   * </pre>
   *
   * <code>optional double hour = 3;</code>
   *
   * @return Whether the hour field is set.
   */
  @java.lang.Override
  public boolean hasHour() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * Set the hour to start the snapshot (0-23), defaults to midnight (0).
   * </pre>
   *
   * <code>optional double hour = 3;</code>
   *
   * @return The hour.
   */
  @java.lang.Override
  public double getHour() {
    return hour_;
  }

  public static final int DAYS_OF_MONTH_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object daysOfMonth_ = "";
  /**
   *
   *
   * <pre>
   * Set the day or days of the month to make a snapshot (1-31). Accepts a
   * comma separated number of days. Defaults to '1'.
   * </pre>
   *
   * <code>optional string days_of_month = 4;</code>
   *
   * @return Whether the daysOfMonth field is set.
   */
  @java.lang.Override
  public boolean hasDaysOfMonth() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   *
   *
   * <pre>
   * Set the day or days of the month to make a snapshot (1-31). Accepts a
   * comma separated number of days. Defaults to '1'.
   * </pre>
   *
   * <code>optional string days_of_month = 4;</code>
   *
   * @return The daysOfMonth.
   */
  @java.lang.Override
  public java.lang.String getDaysOfMonth() {
    java.lang.Object ref = daysOfMonth_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      daysOfMonth_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Set the day or days of the month to make a snapshot (1-31). Accepts a
   * comma separated number of days. Defaults to '1'.
   * </pre>
   *
   * <code>optional string days_of_month = 4;</code>
   *
   * @return The bytes for daysOfMonth.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDaysOfMonthBytes() {
    java.lang.Object ref = daysOfMonth_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      daysOfMonth_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeDouble(1, snapshotsToKeep_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeDouble(2, minute_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeDouble(3, hour_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, daysOfMonth_);
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
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(3, hour_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, daysOfMonth_);
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
    if (!(obj instanceof com.google.cloud.netapp.v1.MonthlySchedule)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.MonthlySchedule other =
        (com.google.cloud.netapp.v1.MonthlySchedule) obj;

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
    if (hasHour() != other.hasHour()) return false;
    if (hasHour()) {
      if (java.lang.Double.doubleToLongBits(getHour())
          != java.lang.Double.doubleToLongBits(other.getHour())) return false;
    }
    if (hasDaysOfMonth() != other.hasDaysOfMonth()) return false;
    if (hasDaysOfMonth()) {
      if (!getDaysOfMonth().equals(other.getDaysOfMonth())) return false;
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
    if (hasHour()) {
      hash = (37 * hash) + HOUR_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getHour()));
    }
    if (hasDaysOfMonth()) {
      hash = (37 * hash) + DAYS_OF_MONTH_FIELD_NUMBER;
      hash = (53 * hash) + getDaysOfMonth().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule parseFrom(
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

  public static Builder newBuilder(com.google.cloud.netapp.v1.MonthlySchedule prototype) {
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
   * Make a snapshot once a month e.g. at 2nd 04:00, 7th 05:20, 24th 23:50
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.MonthlySchedule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.MonthlySchedule)
      com.google.cloud.netapp.v1.MonthlyScheduleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_MonthlySchedule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_MonthlySchedule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.MonthlySchedule.class,
              com.google.cloud.netapp.v1.MonthlySchedule.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.MonthlySchedule.newBuilder()
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
      hour_ = 0D;
      daysOfMonth_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_MonthlySchedule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.MonthlySchedule getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.MonthlySchedule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.MonthlySchedule build() {
      com.google.cloud.netapp.v1.MonthlySchedule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.MonthlySchedule buildPartial() {
      com.google.cloud.netapp.v1.MonthlySchedule result =
          new com.google.cloud.netapp.v1.MonthlySchedule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.MonthlySchedule result) {
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
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.hour_ = hour_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.daysOfMonth_ = daysOfMonth_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.cloud.netapp.v1.MonthlySchedule) {
        return mergeFrom((com.google.cloud.netapp.v1.MonthlySchedule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.MonthlySchedule other) {
      if (other == com.google.cloud.netapp.v1.MonthlySchedule.getDefaultInstance()) return this;
      if (other.hasSnapshotsToKeep()) {
        setSnapshotsToKeep(other.getSnapshotsToKeep());
      }
      if (other.hasMinute()) {
        setMinute(other.getMinute());
      }
      if (other.hasHour()) {
        setHour(other.getHour());
      }
      if (other.hasDaysOfMonth()) {
        daysOfMonth_ = other.daysOfMonth_;
        bitField0_ |= 0x00000008;
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
            case 25:
              {
                hour_ = input.readDouble();
                bitField0_ |= 0x00000004;
                break;
              } // case 25
            case 34:
              {
                daysOfMonth_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private double hour_;
    /**
     *
     *
     * <pre>
     * Set the hour to start the snapshot (0-23), defaults to midnight (0).
     * </pre>
     *
     * <code>optional double hour = 3;</code>
     *
     * @return Whether the hour field is set.
     */
    @java.lang.Override
    public boolean hasHour() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Set the hour to start the snapshot (0-23), defaults to midnight (0).
     * </pre>
     *
     * <code>optional double hour = 3;</code>
     *
     * @return The hour.
     */
    @java.lang.Override
    public double getHour() {
      return hour_;
    }
    /**
     *
     *
     * <pre>
     * Set the hour to start the snapshot (0-23), defaults to midnight (0).
     * </pre>
     *
     * <code>optional double hour = 3;</code>
     *
     * @param value The hour to set.
     * @return This builder for chaining.
     */
    public Builder setHour(double value) {

      hour_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set the hour to start the snapshot (0-23), defaults to midnight (0).
     * </pre>
     *
     * <code>optional double hour = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHour() {
      bitField0_ = (bitField0_ & ~0x00000004);
      hour_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object daysOfMonth_ = "";
    /**
     *
     *
     * <pre>
     * Set the day or days of the month to make a snapshot (1-31). Accepts a
     * comma separated number of days. Defaults to '1'.
     * </pre>
     *
     * <code>optional string days_of_month = 4;</code>
     *
     * @return Whether the daysOfMonth field is set.
     */
    public boolean hasDaysOfMonth() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * Set the day or days of the month to make a snapshot (1-31). Accepts a
     * comma separated number of days. Defaults to '1'.
     * </pre>
     *
     * <code>optional string days_of_month = 4;</code>
     *
     * @return The daysOfMonth.
     */
    public java.lang.String getDaysOfMonth() {
      java.lang.Object ref = daysOfMonth_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        daysOfMonth_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Set the day or days of the month to make a snapshot (1-31). Accepts a
     * comma separated number of days. Defaults to '1'.
     * </pre>
     *
     * <code>optional string days_of_month = 4;</code>
     *
     * @return The bytes for daysOfMonth.
     */
    public com.google.protobuf.ByteString getDaysOfMonthBytes() {
      java.lang.Object ref = daysOfMonth_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        daysOfMonth_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Set the day or days of the month to make a snapshot (1-31). Accepts a
     * comma separated number of days. Defaults to '1'.
     * </pre>
     *
     * <code>optional string days_of_month = 4;</code>
     *
     * @param value The daysOfMonth to set.
     * @return This builder for chaining.
     */
    public Builder setDaysOfMonth(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      daysOfMonth_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set the day or days of the month to make a snapshot (1-31). Accepts a
     * comma separated number of days. Defaults to '1'.
     * </pre>
     *
     * <code>optional string days_of_month = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDaysOfMonth() {
      daysOfMonth_ = getDefaultInstance().getDaysOfMonth();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Set the day or days of the month to make a snapshot (1-31). Accepts a
     * comma separated number of days. Defaults to '1'.
     * </pre>
     *
     * <code>optional string days_of_month = 4;</code>
     *
     * @param value The bytes for daysOfMonth to set.
     * @return This builder for chaining.
     */
    public Builder setDaysOfMonthBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      daysOfMonth_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.MonthlySchedule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.MonthlySchedule)
  private static final com.google.cloud.netapp.v1.MonthlySchedule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.MonthlySchedule();
  }

  public static com.google.cloud.netapp.v1.MonthlySchedule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MonthlySchedule> PARSER =
      new com.google.protobuf.AbstractParser<MonthlySchedule>() {
        @java.lang.Override
        public MonthlySchedule parsePartialFrom(
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

  public static com.google.protobuf.Parser<MonthlySchedule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MonthlySchedule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.MonthlySchedule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
