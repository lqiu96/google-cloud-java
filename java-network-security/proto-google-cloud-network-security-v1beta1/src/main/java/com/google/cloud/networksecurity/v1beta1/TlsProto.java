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
// source: google/cloud/networksecurity/v1beta1/tls.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.networksecurity.v1beta1;

public final class TlsProto {
  private TlsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_GrpcEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_GrpcEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_ValidationCA_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_ValidationCA_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_CertificateProviderInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_CertificateProviderInstance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_networksecurity_v1beta1_CertificateProvider_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_networksecurity_v1beta1_CertificateProvider_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/networksecurity/v1beta1/t"
          + "ls.proto\022$google.cloud.networksecurity.v"
          + "1beta1\032\037google/api/field_behavior.proto\""
          + "(\n\014GrpcEndpoint\022\030\n\ntarget_uri\030\001 \001(\tB\004\342A\001"
          + "\002\"\317\001\n\014ValidationCA\022K\n\rgrpc_endpoint\030\002 \001("
          + "\01322.google.cloud.networksecurity.v1beta1"
          + ".GrpcEndpointH\000\022j\n\035certificate_provider_"
          + "instance\030\003 \001(\0132A.google.cloud.networksec"
          + "urity.v1beta1.CertificateProviderInstanc"
          + "eH\000B\006\n\004type\"<\n\033CertificateProviderInstan"
          + "ce\022\035\n\017plugin_instance\030\001 \001(\tB\004\342A\001\002\"\326\001\n\023Ce"
          + "rtificateProvider\022K\n\rgrpc_endpoint\030\002 \001(\013"
          + "22.google.cloud.networksecurity.v1beta1."
          + "GrpcEndpointH\000\022j\n\035certificate_provider_i"
          + "nstance\030\003 \001(\0132A.google.cloud.networksecu"
          + "rity.v1beta1.CertificateProviderInstance"
          + "H\000B\006\n\004typeB\202\002\n(com.google.cloud.networks"
          + "ecurity.v1beta1B\010TlsProtoP\001ZRcloud.googl"
          + "e.com/go/networksecurity/apiv1beta1/netw"
          + "orksecuritypb;networksecuritypb\252\002$Google"
          + ".Cloud.NetworkSecurity.V1Beta1\312\002$Google\\"
          + "Cloud\\NetworkSecurity\\V1beta1\352\002\'Google::"
          + "Cloud::NetworkSecurity::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_networksecurity_v1beta1_GrpcEndpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_networksecurity_v1beta1_GrpcEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_GrpcEndpoint_descriptor,
            new java.lang.String[] {
              "TargetUri",
            });
    internal_static_google_cloud_networksecurity_v1beta1_ValidationCA_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_networksecurity_v1beta1_ValidationCA_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_ValidationCA_descriptor,
            new java.lang.String[] {
              "GrpcEndpoint", "CertificateProviderInstance", "Type",
            });
    internal_static_google_cloud_networksecurity_v1beta1_CertificateProviderInstance_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_networksecurity_v1beta1_CertificateProviderInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_CertificateProviderInstance_descriptor,
            new java.lang.String[] {
              "PluginInstance",
            });
    internal_static_google_cloud_networksecurity_v1beta1_CertificateProvider_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_networksecurity_v1beta1_CertificateProvider_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_networksecurity_v1beta1_CertificateProvider_descriptor,
            new java.lang.String[] {
              "GrpcEndpoint", "CertificateProviderInstance", "Type",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
