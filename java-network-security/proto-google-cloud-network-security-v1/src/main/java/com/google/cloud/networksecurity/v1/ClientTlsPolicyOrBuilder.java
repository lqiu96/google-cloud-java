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
// source: google/cloud/networksecurity/v1/client_tls_policy.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networksecurity.v1;

public interface ClientTlsPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1.ClientTlsPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the ClientTlsPolicy resource. It matches the pattern
   * `projects/&#42;&#47;locations/{location}/clientTlsPolicies/{client_tls_policy}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Name of the ClientTlsPolicy resource. It matches the pattern
   * `projects/&#42;&#47;locations/{location}/clientTlsPolicies/{client_tls_policy}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Free-text description of the resource.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Free-text description of the resource.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Set of label tags associated with the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Server Name Indication string to present to the server during TLS
   * handshake. E.g: "secure.example.com".
   * </pre>
   *
   * <code>string sni = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sni.
   */
  java.lang.String getSni();
  /**
   *
   *
   * <pre>
   * Optional. Server Name Indication string to present to the server during TLS
   * handshake. E.g: "secure.example.com".
   * </pre>
   *
   * <code>string sni = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for sni.
   */
  com.google.protobuf.ByteString getSniBytes();

  /**
   *
   *
   * <pre>
   * Optional. Defines a mechanism to provision client identity (public and private keys)
   * for peer to peer authentication. The presence of this dictates mTLS.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1.CertificateProvider client_certificate = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the clientCertificate field is set.
   */
  boolean hasClientCertificate();
  /**
   *
   *
   * <pre>
   * Optional. Defines a mechanism to provision client identity (public and private keys)
   * for peer to peer authentication. The presence of this dictates mTLS.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1.CertificateProvider client_certificate = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The clientCertificate.
   */
  com.google.cloud.networksecurity.v1.CertificateProvider getClientCertificate();
  /**
   *
   *
   * <pre>
   * Optional. Defines a mechanism to provision client identity (public and private keys)
   * for peer to peer authentication. The presence of this dictates mTLS.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1.CertificateProvider client_certificate = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.networksecurity.v1.CertificateProviderOrBuilder getClientCertificateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Defines the mechanism to obtain the Certificate Authority certificate to
   * validate the server certificate. If empty, client does not validate the
   * server certificate.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networksecurity.v1.ValidationCA server_validation_ca = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.networksecurity.v1.ValidationCA> getServerValidationCaList();
  /**
   *
   *
   * <pre>
   * Optional. Defines the mechanism to obtain the Certificate Authority certificate to
   * validate the server certificate. If empty, client does not validate the
   * server certificate.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networksecurity.v1.ValidationCA server_validation_ca = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.networksecurity.v1.ValidationCA getServerValidationCa(int index);
  /**
   *
   *
   * <pre>
   * Optional. Defines the mechanism to obtain the Certificate Authority certificate to
   * validate the server certificate. If empty, client does not validate the
   * server certificate.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networksecurity.v1.ValidationCA server_validation_ca = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getServerValidationCaCount();
  /**
   *
   *
   * <pre>
   * Optional. Defines the mechanism to obtain the Certificate Authority certificate to
   * validate the server certificate. If empty, client does not validate the
   * server certificate.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networksecurity.v1.ValidationCA server_validation_ca = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.networksecurity.v1.ValidationCAOrBuilder>
      getServerValidationCaOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Defines the mechanism to obtain the Certificate Authority certificate to
   * validate the server certificate. If empty, client does not validate the
   * server certificate.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networksecurity.v1.ValidationCA server_validation_ca = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.networksecurity.v1.ValidationCAOrBuilder getServerValidationCaOrBuilder(
      int index);
}
