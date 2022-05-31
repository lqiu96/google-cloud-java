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
// source: google/cloud/recommender/v1/recommender_service.proto

package com.google.cloud.recommender.v1;

public interface ListInsightsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1.ListInsightsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The container resource on which to execute the request.
   * Acceptable formats:
   * * `projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   * * `projects/[PROJECT_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   * * `billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   * * `folders/[FOLDER_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   * * `organizations/[ORGANIZATION_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   * LOCATION here refers to GCP Locations:
   * https://cloud.google.com/about/locations/
   * INSIGHT_TYPE_ID refers to supported insight types:
   * https://cloud.google.com/recommender/docs/insights/insight-types.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The container resource on which to execute the request.
   * Acceptable formats:
   * * `projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   * * `projects/[PROJECT_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   * * `billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   * * `folders/[FOLDER_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   * * `organizations/[ORGANIZATION_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   * LOCATION here refers to GCP Locations:
   * https://cloud.google.com/about/locations/
   * INSIGHT_TYPE_ID refers to supported insight types:
   * https://cloud.google.com/recommender/docs/insights/insight-types.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of results to return from this request.  Non-positive
   * values are ignored. If not specified, the server will determine the number
   * of results to return.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. If present, retrieves the next batch of results from the preceding call to
   * this method. `page_token` must be the value of `next_page_token` from the
   * previous response. The values of other method parameters must be identical
   * to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. If present, retrieves the next batch of results from the preceding call to
   * this method. `page_token` must be the value of `next_page_token` from the
   * previous response. The values of other method parameters must be identical
   * to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Filter expression to restrict the insights returned. Supported
   * filter fields:
   * * `stateInfo.state`
   * * `insightSubtype`
   * * `severity`
   * Examples:
   * * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED`
   * * `insightSubtype = PERMISSIONS_USAGE`
   * * `severity = CRITICAL OR severity = HIGH`
   * * `stateInfo.state = ACTIVE AND (severity = CRITICAL OR severity = HIGH)`
   * (These expressions are based on the filter language described at
   * https://google.aip.dev/160)
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Filter expression to restrict the insights returned. Supported
   * filter fields:
   * * `stateInfo.state`
   * * `insightSubtype`
   * * `severity`
   * Examples:
   * * `stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED`
   * * `insightSubtype = PERMISSIONS_USAGE`
   * * `severity = CRITICAL OR severity = HIGH`
   * * `stateInfo.state = ACTIVE AND (severity = CRITICAL OR severity = HIGH)`
   * (These expressions are based on the filter language described at
   * https://google.aip.dev/160)
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
