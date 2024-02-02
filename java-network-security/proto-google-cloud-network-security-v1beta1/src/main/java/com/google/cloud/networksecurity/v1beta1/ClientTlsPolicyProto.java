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
// source: google/cloud/networksecurity/v1beta1/client_tls_policy.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networksecurity.v1beta1;

public final class ClientTlsPolicyProto {
  private ClientTlsPolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ListClientTlsPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ListClientTlsPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ListClientTlsPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ListClientTlsPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_GetClientTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_GetClientTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_CreateClientTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_CreateClientTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_UpdateClientTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_UpdateClientTlsPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_DeleteClientTlsPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_DeleteClientTlsPolicyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/networksecurity/v1beta1/c"
          + "lient_tls_policy.proto\022$google.cloud.net"
          + "worksecurity.v1beta1\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032.google/cloud/networksecurity/v1beta1/t"
          + "ls.proto\032 google/protobuf/field_mask.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\203\005\n\017"
          + "ClientTlsPolicy\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\022\031\n\013d"
          + "escription\030\002 \001(\tB\004\342A\001\001\0225\n\013create_time\030\003 "
          + "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0225\n"
          + "\013update_time\030\004 \001(\0132\032.google.protobuf.Tim"
          + "estampB\004\342A\001\003\022W\n\006labels\030\005 \003(\0132A.google.cl"
          + "oud.networksecurity.v1beta1.ClientTlsPol"
          + "icy.LabelsEntryB\004\342A\001\001\022\021\n\003sni\030\006 \001(\tB\004\342A\001\001"
          + "\022[\n\022client_certificate\030\007 \001(\01329.google.cl"
          + "oud.networksecurity.v1beta1.CertificateP"
          + "roviderB\004\342A\001\001\022V\n\024server_validation_ca\030\010 "
          + "\003(\01322.google.cloud.networksecurity.v1bet"
          + "a1.ValidationCAB\004\342A\001\001\032-\n\013LabelsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\202\001\352A\177\n.netw"
          + "orksecurity.googleapis.com/ClientTlsPoli"
          + "cy\022Mprojects/{project}/locations/{locati"
          + "on}/clientTlsPolicies/{client_tls_policy"
          + "}\"\201\001\n\034ListClientTlsPoliciesRequest\022:\n\006pa"
          + "rent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.googleapi"
          + "s.com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npag"
          + "e_token\030\003 \001(\t\"\214\001\n\035ListClientTlsPoliciesR"
          + "esponse\022R\n\023client_tls_policies\030\001 \003(\01325.g"
          + "oogle.cloud.networksecurity.v1beta1.Clie"
          + "ntTlsPolicy\022\027\n\017next_page_token\030\002 \001(\t\"b\n\031"
          + "GetClientTlsPolicyRequest\022E\n\004name\030\001 \001(\tB"
          + "7\342A\001\002\372A0\n.networksecurity.googleapis.com"
          + "/ClientTlsPolicy\"\343\001\n\034CreateClientTlsPoli"
          + "cyRequest\022G\n\006parent\030\001 \001(\tB7\342A\001\002\372A0\022.netw"
          + "orksecurity.googleapis.com/ClientTlsPoli"
          + "cy\022\"\n\024client_tls_policy_id\030\002 \001(\tB\004\342A\001\002\022V"
          + "\n\021client_tls_policy\030\003 \001(\01325.google.cloud"
          + ".networksecurity.v1beta1.ClientTlsPolicy"
          + "B\004\342A\001\002\"\255\001\n\034UpdateClientTlsPolicyRequest\022"
          + "5\n\013update_mask\030\001 \001(\0132\032.google.protobuf.F"
          + "ieldMaskB\004\342A\001\001\022V\n\021client_tls_policy\030\002 \001("
          + "\01325.google.cloud.networksecurity.v1beta1"
          + ".ClientTlsPolicyB\004\342A\001\002\"e\n\034DeleteClientTl"
          + "sPolicyRequest\022E\n\004name\030\001 \001(\tB7\342A\001\002\372A0\n.n"
          + "etworksecurity.googleapis.com/ClientTlsP"
          + "olicyB\216\002\n(com.google.cloud.networksecuri"
          + "ty.v1beta1B\024ClientTlsPolicyProtoP\001ZRclou"
          + "d.google.com/go/networksecurity/apiv1bet"
          + "a1/networksecuritypb;networksecuritypb\252\002"
          + "$Google.Cloud.NetworkSecurity.V1Beta1\312\002$"
          + "Google\\Cloud\\NetworkSecurity\\V1beta1\352\002\'G"
          + "oogle::Cloud::NetworkSecurity::V1beta1b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.networksecurity.v1beta1.TlsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Sni",
              "ClientCertificate",
              "ServerValidationCa",
            });
    internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_LabelsEntry_descriptor =
        internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ClientTlsPolicy_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_networksecurity_v1beta1_ListClientTlsPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networksecurity_v1beta1_ListClientTlsPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ListClientTlsPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_networksecurity_v1beta1_ListClientTlsPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networksecurity_v1beta1_ListClientTlsPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ListClientTlsPoliciesResponse_descriptor,
            new java.lang.String[] {
              "ClientTlsPolicies", "NextPageToken",
            });
    internal_static_google_cloud_networksecurity_v1beta1_GetClientTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networksecurity_v1beta1_GetClientTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_GetClientTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_networksecurity_v1beta1_CreateClientTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_networksecurity_v1beta1_CreateClientTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_CreateClientTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ClientTlsPolicyId", "ClientTlsPolicy",
            });
    internal_static_google_cloud_networksecurity_v1beta1_UpdateClientTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_networksecurity_v1beta1_UpdateClientTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_UpdateClientTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "ClientTlsPolicy",
            });
    internal_static_google_cloud_networksecurity_v1beta1_DeleteClientTlsPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_networksecurity_v1beta1_DeleteClientTlsPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_DeleteClientTlsPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.networksecurity.v1beta1.TlsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
