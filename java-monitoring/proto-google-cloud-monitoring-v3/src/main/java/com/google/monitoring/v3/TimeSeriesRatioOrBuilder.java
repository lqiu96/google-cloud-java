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
// source: google/monitoring/v3/service.proto

// Protobuf Java Version: 3.25.2
package com.google.monitoring.v3;

public interface TimeSeriesRatioOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.TimeSeriesRatio)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying good service provided. Must have
   * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
   * DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string good_service_filter = 4;</code>
   *
   * @return The goodServiceFilter.
   */
  java.lang.String getGoodServiceFilter();
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying good service provided. Must have
   * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
   * DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string good_service_filter = 4;</code>
   *
   * @return The bytes for goodServiceFilter.
   */
  com.google.protobuf.ByteString getGoodServiceFilterBytes();

  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying bad service, either demanded service
   * that was not provided or demanded service that was of inadequate quality.
   * Must have `ValueType = DOUBLE` or `ValueType = INT64` and must have
   * `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string bad_service_filter = 5;</code>
   *
   * @return The badServiceFilter.
   */
  java.lang.String getBadServiceFilter();
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying bad service, either demanded service
   * that was not provided or demanded service that was of inadequate quality.
   * Must have `ValueType = DOUBLE` or `ValueType = INT64` and must have
   * `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string bad_service_filter = 5;</code>
   *
   * @return The bytes for badServiceFilter.
   */
  com.google.protobuf.ByteString getBadServiceFilterBytes();

  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying total demanded service. Must have
   * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
   * DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string total_service_filter = 6;</code>
   *
   * @return The totalServiceFilter.
   */
  java.lang.String getTotalServiceFilter();
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying total demanded service. Must have
   * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
   * DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string total_service_filter = 6;</code>
   *
   * @return The bytes for totalServiceFilter.
   */
  com.google.protobuf.ByteString getTotalServiceFilterBytes();
}
