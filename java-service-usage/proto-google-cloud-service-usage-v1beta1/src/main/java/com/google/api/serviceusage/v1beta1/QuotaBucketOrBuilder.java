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
// source: google/api/serviceusage/v1beta1/resources.proto

package com.google.api.serviceusage.v1beta1;

public interface QuotaBucketOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.QuotaBucket)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The effective limit of this quota bucket. Equal to default_limit if there
   * are no overrides.
   * </pre>
   *
   * <code>int64 effective_limit = 1;</code>
   *
   * @return The effectiveLimit.
   */
  long getEffectiveLimit();

  /**
   *
   *
   * <pre>
   * The default limit of this quota bucket, as specified by the service
   * configuration.
   * </pre>
   *
   * <code>int64 default_limit = 2;</code>
   *
   * @return The defaultLimit.
   */
  long getDefaultLimit();

  /**
   *
   *
   * <pre>
   * Producer override on this quota bucket.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.QuotaOverride producer_override = 3;</code>
   *
   * @return Whether the producerOverride field is set.
   */
  boolean hasProducerOverride();
  /**
   *
   *
   * <pre>
   * Producer override on this quota bucket.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.QuotaOverride producer_override = 3;</code>
   *
   * @return The producerOverride.
   */
  com.google.api.serviceusage.v1beta1.QuotaOverride getProducerOverride();
  /**
   *
   *
   * <pre>
   * Producer override on this quota bucket.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.QuotaOverride producer_override = 3;</code>
   */
  com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder getProducerOverrideOrBuilder();

  /**
   *
   *
   * <pre>
   * Consumer override on this quota bucket.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.QuotaOverride consumer_override = 4;</code>
   *
   * @return Whether the consumerOverride field is set.
   */
  boolean hasConsumerOverride();
  /**
   *
   *
   * <pre>
   * Consumer override on this quota bucket.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.QuotaOverride consumer_override = 4;</code>
   *
   * @return The consumerOverride.
   */
  com.google.api.serviceusage.v1beta1.QuotaOverride getConsumerOverride();
  /**
   *
   *
   * <pre>
   * Consumer override on this quota bucket.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.QuotaOverride consumer_override = 4;</code>
   */
  com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder getConsumerOverrideOrBuilder();

  /**
   *
   *
   * <pre>
   * Admin override on this quota bucket.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.QuotaOverride admin_override = 5;</code>
   *
   * @return Whether the adminOverride field is set.
   */
  boolean hasAdminOverride();
  /**
   *
   *
   * <pre>
   * Admin override on this quota bucket.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.QuotaOverride admin_override = 5;</code>
   *
   * @return The adminOverride.
   */
  com.google.api.serviceusage.v1beta1.QuotaOverride getAdminOverride();
  /**
   *
   *
   * <pre>
   * Admin override on this quota bucket.
   * </pre>
   *
   * <code>.google.api.serviceusage.v1beta1.QuotaOverride admin_override = 5;</code>
   */
  com.google.api.serviceusage.v1beta1.QuotaOverrideOrBuilder getAdminOverrideOrBuilder();

  /**
   *
   *
   * <pre>
   * The dimensions of this quota bucket.
   *
   * If this map is empty, this is the global bucket, which is the default quota
   * value applied to all requests that do not have a more specific override.
   *
   * If this map is nonempty, the default limit, effective limit, and quota
   * overrides apply only to requests that have the dimensions given in the map.
   *
   * For example, if the map has key `region` and value `us-east-1`, then the
   * specified effective limit is only effective in that region, and the
   * specified overrides apply only in that region.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 6;</code>
   */
  int getDimensionsCount();
  /**
   *
   *
   * <pre>
   * The dimensions of this quota bucket.
   *
   * If this map is empty, this is the global bucket, which is the default quota
   * value applied to all requests that do not have a more specific override.
   *
   * If this map is nonempty, the default limit, effective limit, and quota
   * overrides apply only to requests that have the dimensions given in the map.
   *
   * For example, if the map has key `region` and value `us-east-1`, then the
   * specified effective limit is only effective in that region, and the
   * specified overrides apply only in that region.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 6;</code>
   */
  boolean containsDimensions(java.lang.String key);
  /** Use {@link #getDimensionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDimensions();
  /**
   *
   *
   * <pre>
   * The dimensions of this quota bucket.
   *
   * If this map is empty, this is the global bucket, which is the default quota
   * value applied to all requests that do not have a more specific override.
   *
   * If this map is nonempty, the default limit, effective limit, and quota
   * overrides apply only to requests that have the dimensions given in the map.
   *
   * For example, if the map has key `region` and value `us-east-1`, then the
   * specified effective limit is only effective in that region, and the
   * specified overrides apply only in that region.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDimensionsMap();
  /**
   *
   *
   * <pre>
   * The dimensions of this quota bucket.
   *
   * If this map is empty, this is the global bucket, which is the default quota
   * value applied to all requests that do not have a more specific override.
   *
   * If this map is nonempty, the default limit, effective limit, and quota
   * overrides apply only to requests that have the dimensions given in the map.
   *
   * For example, if the map has key `region` and value `us-east-1`, then the
   * specified effective limit is only effective in that region, and the
   * specified overrides apply only in that region.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 6;</code>
   */
  /* nullable */
  java.lang.String getDimensionsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The dimensions of this quota bucket.
   *
   * If this map is empty, this is the global bucket, which is the default quota
   * value applied to all requests that do not have a more specific override.
   *
   * If this map is nonempty, the default limit, effective limit, and quota
   * overrides apply only to requests that have the dimensions given in the map.
   *
   * For example, if the map has key `region` and value `us-east-1`, then the
   * specified effective limit is only effective in that region, and the
   * specified overrides apply only in that region.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 6;</code>
   */
  java.lang.String getDimensionsOrThrow(java.lang.String key);
}
