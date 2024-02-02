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
// source: google/monitoring/dashboard/v1/common.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.dashboard.v1;

/**
 *
 *
 * <pre>
 * Describes a ranking-based time series filter. Each input time series is
 * ranked with an aligner. The filter will allow up to `num_time_series` time
 * series to pass through it, selecting them based on the relative ranking.
 *
 * For example, if `ranking_method` is `METHOD_MEAN`,`direction` is `BOTTOM`,
 * and `num_time_series` is 3, then the 3 times series with the lowest mean
 * values will pass through the filter.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.dashboard.v1.PickTimeSeriesFilter}
 */
public final class PickTimeSeriesFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.dashboard.v1.PickTimeSeriesFilter)
    PickTimeSeriesFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PickTimeSeriesFilter.newBuilder() to construct.
  private PickTimeSeriesFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PickTimeSeriesFilter() {
    rankingMethod_ = 0;
    direction_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PickTimeSeriesFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.dashboard.v1.CommonProto
        .internal_static_google_monitoring_dashboard_v1_PickTimeSeriesFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.dashboard.v1.CommonProto
        .internal_static_google_monitoring_dashboard_v1_PickTimeSeriesFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.class,
            com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The value reducers that can be applied to a `PickTimeSeriesFilter`.
   * </pre>
   *
   * Protobuf enum {@code google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method}
   */
  public enum Method implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not allowed. You must specify a different `Method` if you specify a
     * `PickTimeSeriesFilter`.
     * </pre>
     *
     * <code>METHOD_UNSPECIFIED = 0;</code>
     */
    METHOD_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Select the mean of all values.
     * </pre>
     *
     * <code>METHOD_MEAN = 1;</code>
     */
    METHOD_MEAN(1),
    /**
     *
     *
     * <pre>
     * Select the maximum value.
     * </pre>
     *
     * <code>METHOD_MAX = 2;</code>
     */
    METHOD_MAX(2),
    /**
     *
     *
     * <pre>
     * Select the minimum value.
     * </pre>
     *
     * <code>METHOD_MIN = 3;</code>
     */
    METHOD_MIN(3),
    /**
     *
     *
     * <pre>
     * Compute the sum of all values.
     * </pre>
     *
     * <code>METHOD_SUM = 4;</code>
     */
    METHOD_SUM(4),
    /**
     *
     *
     * <pre>
     * Select the most recent value.
     * </pre>
     *
     * <code>METHOD_LATEST = 5;</code>
     */
    METHOD_LATEST(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not allowed. You must specify a different `Method` if you specify a
     * `PickTimeSeriesFilter`.
     * </pre>
     *
     * <code>METHOD_UNSPECIFIED = 0;</code>
     */
    public static final int METHOD_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Select the mean of all values.
     * </pre>
     *
     * <code>METHOD_MEAN = 1;</code>
     */
    public static final int METHOD_MEAN_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Select the maximum value.
     * </pre>
     *
     * <code>METHOD_MAX = 2;</code>
     */
    public static final int METHOD_MAX_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Select the minimum value.
     * </pre>
     *
     * <code>METHOD_MIN = 3;</code>
     */
    public static final int METHOD_MIN_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Compute the sum of all values.
     * </pre>
     *
     * <code>METHOD_SUM = 4;</code>
     */
    public static final int METHOD_SUM_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Select the most recent value.
     * </pre>
     *
     * <code>METHOD_LATEST = 5;</code>
     */
    public static final int METHOD_LATEST_VALUE = 5;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Method valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Method forNumber(int value) {
      switch (value) {
        case 0:
          return METHOD_UNSPECIFIED;
        case 1:
          return METHOD_MEAN;
        case 2:
          return METHOD_MAX;
        case 3:
          return METHOD_MIN;
        case 4:
          return METHOD_SUM;
        case 5:
          return METHOD_LATEST;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Method> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Method> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Method>() {
          public Method findValueByNumber(int number) {
            return Method.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Method[] VALUES = values();

    public static Method valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Method(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method)
  }

  /**
   *
   *
   * <pre>
   * Describes the ranking directions.
   * </pre>
   *
   * Protobuf enum {@code google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction}
   */
  public enum Direction implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not allowed. You must specify a different `Direction` if you specify a
     * `PickTimeSeriesFilter`.
     * </pre>
     *
     * <code>DIRECTION_UNSPECIFIED = 0;</code>
     */
    DIRECTION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Pass the highest `num_time_series` ranking inputs.
     * </pre>
     *
     * <code>TOP = 1;</code>
     */
    TOP(1),
    /**
     *
     *
     * <pre>
     * Pass the lowest `num_time_series` ranking inputs.
     * </pre>
     *
     * <code>BOTTOM = 2;</code>
     */
    BOTTOM(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not allowed. You must specify a different `Direction` if you specify a
     * `PickTimeSeriesFilter`.
     * </pre>
     *
     * <code>DIRECTION_UNSPECIFIED = 0;</code>
     */
    public static final int DIRECTION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Pass the highest `num_time_series` ranking inputs.
     * </pre>
     *
     * <code>TOP = 1;</code>
     */
    public static final int TOP_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Pass the lowest `num_time_series` ranking inputs.
     * </pre>
     *
     * <code>BOTTOM = 2;</code>
     */
    public static final int BOTTOM_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Direction valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Direction forNumber(int value) {
      switch (value) {
        case 0:
          return DIRECTION_UNSPECIFIED;
        case 1:
          return TOP;
        case 2:
          return BOTTOM;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Direction> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Direction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Direction>() {
          public Direction findValueByNumber(int number) {
            return Direction.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.getDescriptor()
          .getEnumTypes()
          .get(1);
    }

    private static final Direction[] VALUES = values();

    public static Direction valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Direction(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction)
  }

  public static final int RANKING_METHOD_FIELD_NUMBER = 1;
  private int rankingMethod_ = 0;
  /**
   *
   *
   * <pre>
   * `ranking_method` is applied to each time series independently to produce
   * the value which will be used to compare the time series to other time
   * series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method ranking_method = 1;</code>
   *
   * @return The enum numeric value on the wire for rankingMethod.
   */
  @java.lang.Override
  public int getRankingMethodValue() {
    return rankingMethod_;
  }
  /**
   *
   *
   * <pre>
   * `ranking_method` is applied to each time series independently to produce
   * the value which will be used to compare the time series to other time
   * series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method ranking_method = 1;</code>
   *
   * @return The rankingMethod.
   */
  @java.lang.Override
  public com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method getRankingMethod() {
    com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method result =
        com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method.forNumber(rankingMethod_);
    return result == null
        ? com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method.UNRECOGNIZED
        : result;
  }

  public static final int NUM_TIME_SERIES_FIELD_NUMBER = 2;
  private int numTimeSeries_ = 0;
  /**
   *
   *
   * <pre>
   * How many time series to allow to pass through the filter.
   * </pre>
   *
   * <code>int32 num_time_series = 2;</code>
   *
   * @return The numTimeSeries.
   */
  @java.lang.Override
  public int getNumTimeSeries() {
    return numTimeSeries_;
  }

  public static final int DIRECTION_FIELD_NUMBER = 3;
  private int direction_ = 0;
  /**
   *
   *
   * <pre>
   * How to use the ranking to select time series that pass through the filter.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction direction = 3;</code>
   *
   * @return The enum numeric value on the wire for direction.
   */
  @java.lang.Override
  public int getDirectionValue() {
    return direction_;
  }
  /**
   *
   *
   * <pre>
   * How to use the ranking to select time series that pass through the filter.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction direction = 3;</code>
   *
   * @return The direction.
   */
  @java.lang.Override
  public com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction getDirection() {
    com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction result =
        com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction.forNumber(direction_);
    return result == null
        ? com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction.UNRECOGNIZED
        : result;
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
    if (rankingMethod_
        != com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method.METHOD_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, rankingMethod_);
    }
    if (numTimeSeries_ != 0) {
      output.writeInt32(2, numTimeSeries_);
    }
    if (direction_
        != com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction.DIRECTION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, direction_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rankingMethod_
        != com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method.METHOD_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, rankingMethod_);
    }
    if (numTimeSeries_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, numTimeSeries_);
    }
    if (direction_
        != com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction.DIRECTION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, direction_);
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
    if (!(obj instanceof com.google.monitoring.dashboard.v1.PickTimeSeriesFilter)) {
      return super.equals(obj);
    }
    com.google.monitoring.dashboard.v1.PickTimeSeriesFilter other =
        (com.google.monitoring.dashboard.v1.PickTimeSeriesFilter) obj;

    if (rankingMethod_ != other.rankingMethod_) return false;
    if (getNumTimeSeries() != other.getNumTimeSeries()) return false;
    if (direction_ != other.direction_) return false;
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
    hash = (37 * hash) + RANKING_METHOD_FIELD_NUMBER;
    hash = (53 * hash) + rankingMethod_;
    hash = (37 * hash) + NUM_TIME_SERIES_FIELD_NUMBER;
    hash = (53 * hash) + getNumTimeSeries();
    hash = (37 * hash) + DIRECTION_FIELD_NUMBER;
    hash = (53 * hash) + direction_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter parseFrom(
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
      com.google.monitoring.dashboard.v1.PickTimeSeriesFilter prototype) {
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
   * Describes a ranking-based time series filter. Each input time series is
   * ranked with an aligner. The filter will allow up to `num_time_series` time
   * series to pass through it, selecting them based on the relative ranking.
   *
   * For example, if `ranking_method` is `METHOD_MEAN`,`direction` is `BOTTOM`,
   * and `num_time_series` is 3, then the 3 times series with the lowest mean
   * values will pass through the filter.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.dashboard.v1.PickTimeSeriesFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.dashboard.v1.PickTimeSeriesFilter)
      com.google.monitoring.dashboard.v1.PickTimeSeriesFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.dashboard.v1.CommonProto
          .internal_static_google_monitoring_dashboard_v1_PickTimeSeriesFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.dashboard.v1.CommonProto
          .internal_static_google_monitoring_dashboard_v1_PickTimeSeriesFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.class,
              com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Builder.class);
    }

    // Construct using com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rankingMethod_ = 0;
      numTimeSeries_ = 0;
      direction_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.dashboard.v1.CommonProto
          .internal_static_google_monitoring_dashboard_v1_PickTimeSeriesFilter_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.PickTimeSeriesFilter getDefaultInstanceForType() {
      return com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.PickTimeSeriesFilter build() {
      com.google.monitoring.dashboard.v1.PickTimeSeriesFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.PickTimeSeriesFilter buildPartial() {
      com.google.monitoring.dashboard.v1.PickTimeSeriesFilter result =
          new com.google.monitoring.dashboard.v1.PickTimeSeriesFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.dashboard.v1.PickTimeSeriesFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rankingMethod_ = rankingMethod_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numTimeSeries_ = numTimeSeries_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.direction_ = direction_;
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
      if (other instanceof com.google.monitoring.dashboard.v1.PickTimeSeriesFilter) {
        return mergeFrom((com.google.monitoring.dashboard.v1.PickTimeSeriesFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.dashboard.v1.PickTimeSeriesFilter other) {
      if (other == com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.getDefaultInstance())
        return this;
      if (other.rankingMethod_ != 0) {
        setRankingMethodValue(other.getRankingMethodValue());
      }
      if (other.getNumTimeSeries() != 0) {
        setNumTimeSeries(other.getNumTimeSeries());
      }
      if (other.direction_ != 0) {
        setDirectionValue(other.getDirectionValue());
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
            case 8:
              {
                rankingMethod_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                numTimeSeries_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                direction_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private int rankingMethod_ = 0;
    /**
     *
     *
     * <pre>
     * `ranking_method` is applied to each time series independently to produce
     * the value which will be used to compare the time series to other time
     * series.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method ranking_method = 1;</code>
     *
     * @return The enum numeric value on the wire for rankingMethod.
     */
    @java.lang.Override
    public int getRankingMethodValue() {
      return rankingMethod_;
    }
    /**
     *
     *
     * <pre>
     * `ranking_method` is applied to each time series independently to produce
     * the value which will be used to compare the time series to other time
     * series.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method ranking_method = 1;</code>
     *
     * @param value The enum numeric value on the wire for rankingMethod to set.
     * @return This builder for chaining.
     */
    public Builder setRankingMethodValue(int value) {
      rankingMethod_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `ranking_method` is applied to each time series independently to produce
     * the value which will be used to compare the time series to other time
     * series.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method ranking_method = 1;</code>
     *
     * @return The rankingMethod.
     */
    @java.lang.Override
    public com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method getRankingMethod() {
      com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method result =
          com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method.forNumber(rankingMethod_);
      return result == null
          ? com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * `ranking_method` is applied to each time series independently to produce
     * the value which will be used to compare the time series to other time
     * series.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method ranking_method = 1;</code>
     *
     * @param value The rankingMethod to set.
     * @return This builder for chaining.
     */
    public Builder setRankingMethod(
        com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      rankingMethod_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `ranking_method` is applied to each time series independently to produce
     * the value which will be used to compare the time series to other time
     * series.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Method ranking_method = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRankingMethod() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rankingMethod_ = 0;
      onChanged();
      return this;
    }

    private int numTimeSeries_;
    /**
     *
     *
     * <pre>
     * How many time series to allow to pass through the filter.
     * </pre>
     *
     * <code>int32 num_time_series = 2;</code>
     *
     * @return The numTimeSeries.
     */
    @java.lang.Override
    public int getNumTimeSeries() {
      return numTimeSeries_;
    }
    /**
     *
     *
     * <pre>
     * How many time series to allow to pass through the filter.
     * </pre>
     *
     * <code>int32 num_time_series = 2;</code>
     *
     * @param value The numTimeSeries to set.
     * @return This builder for chaining.
     */
    public Builder setNumTimeSeries(int value) {

      numTimeSeries_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How many time series to allow to pass through the filter.
     * </pre>
     *
     * <code>int32 num_time_series = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNumTimeSeries() {
      bitField0_ = (bitField0_ & ~0x00000002);
      numTimeSeries_ = 0;
      onChanged();
      return this;
    }

    private int direction_ = 0;
    /**
     *
     *
     * <pre>
     * How to use the ranking to select time series that pass through the filter.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction direction = 3;</code>
     *
     * @return The enum numeric value on the wire for direction.
     */
    @java.lang.Override
    public int getDirectionValue() {
      return direction_;
    }
    /**
     *
     *
     * <pre>
     * How to use the ranking to select time series that pass through the filter.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction direction = 3;</code>
     *
     * @param value The enum numeric value on the wire for direction to set.
     * @return This builder for chaining.
     */
    public Builder setDirectionValue(int value) {
      direction_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How to use the ranking to select time series that pass through the filter.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction direction = 3;</code>
     *
     * @return The direction.
     */
    @java.lang.Override
    public com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction getDirection() {
      com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction result =
          com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction.forNumber(direction_);
      return result == null
          ? com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * How to use the ranking to select time series that pass through the filter.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction direction = 3;</code>
     *
     * @param value The direction to set.
     * @return This builder for chaining.
     */
    public Builder setDirection(
        com.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      direction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How to use the ranking to select time series that pass through the filter.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.PickTimeSeriesFilter.Direction direction = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDirection() {
      bitField0_ = (bitField0_ & ~0x00000004);
      direction_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.dashboard.v1.PickTimeSeriesFilter)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.dashboard.v1.PickTimeSeriesFilter)
  private static final com.google.monitoring.dashboard.v1.PickTimeSeriesFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.dashboard.v1.PickTimeSeriesFilter();
  }

  public static com.google.monitoring.dashboard.v1.PickTimeSeriesFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PickTimeSeriesFilter> PARSER =
      new com.google.protobuf.AbstractParser<PickTimeSeriesFilter>() {
        @java.lang.Override
        public PickTimeSeriesFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<PickTimeSeriesFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PickTimeSeriesFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.dashboard.v1.PickTimeSeriesFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
