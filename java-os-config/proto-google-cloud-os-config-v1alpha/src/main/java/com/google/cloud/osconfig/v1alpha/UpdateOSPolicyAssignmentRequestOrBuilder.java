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
// source: google/cloud/osconfig/v1alpha/os_policy_assignments.proto

package com.google.cloud.osconfig.v1alpha;

public interface UpdateOSPolicyAssignmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1alpha.UpdateOSPolicyAssignmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The updated OS policy assignment.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the osPolicyAssignment field is set.
   */
  boolean hasOsPolicyAssignment();
  /**
   *
   *
   * <pre>
   * Required. The updated OS policy assignment.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The osPolicyAssignment.
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignment getOsPolicyAssignment();
  /**
   *
   *
   * <pre>
   * Required. The updated OS policy assignment.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentOrBuilder getOsPolicyAssignmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Field mask that controls which fields of the assignment should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Field mask that controls which fields of the assignment should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Field mask that controls which fields of the assignment should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
