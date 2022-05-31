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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

public interface SymptomOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.Symptom)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Timestamp when the Symptom is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Timestamp when the Symptom is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Timestamp when the Symptom is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Type of the Symptom.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.Symptom.SymptomType symptom_type = 2;</code>
   *
   * @return The enum numeric value on the wire for symptomType.
   */
  int getSymptomTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the Symptom.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.Symptom.SymptomType symptom_type = 2;</code>
   *
   * @return The symptomType.
   */
  com.google.cloud.tpu.v2alpha1.Symptom.SymptomType getSymptomType();

  /**
   *
   *
   * <pre>
   * Detailed information of the current Symptom.
   * </pre>
   *
   * <code>string details = 3;</code>
   *
   * @return The details.
   */
  java.lang.String getDetails();
  /**
   *
   *
   * <pre>
   * Detailed information of the current Symptom.
   * </pre>
   *
   * <code>string details = 3;</code>
   *
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString getDetailsBytes();

  /**
   *
   *
   * <pre>
   * A string used to uniquely distinguish a worker within a TPU node.
   * </pre>
   *
   * <code>string worker_id = 4;</code>
   *
   * @return The workerId.
   */
  java.lang.String getWorkerId();
  /**
   *
   *
   * <pre>
   * A string used to uniquely distinguish a worker within a TPU node.
   * </pre>
   *
   * <code>string worker_id = 4;</code>
   *
   * @return The bytes for workerId.
   */
  com.google.protobuf.ByteString getWorkerIdBytes();
}
