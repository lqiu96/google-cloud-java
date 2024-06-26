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
// source: google/cloud/discoveryengine/v1beta/data_store.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

public final class DataStoreProto {
  private DataStoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_DataStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_DataStore_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/discoveryengine/v1beta/da"
          + "ta_store.proto\022#google.cloud.discoveryen"
          + "gine.v1beta\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\0320google/"
          + "cloud/discoveryengine/v1beta/common.prot"
          + "o\032Dgoogle/cloud/discoveryengine/v1beta/d"
          + "ocument_processing_config.proto\0320google/"
          + "cloud/discoveryengine/v1beta/schema.prot"
          + "o\032\037google/protobuf/timestamp.proto\"\354\006\n\tD"
          + "ataStore\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\031\n\014display_n"
          + "ame\030\002 \001(\tB\003\340A\002\022U\n\021industry_vertical\030\003 \001("
          + "\01625.google.cloud.discoveryengine.v1beta."
          + "IndustryVerticalB\003\340A\005\022I\n\016solution_types\030"
          + "\005 \003(\01621.google.cloud.discoveryengine.v1b"
          + "eta.SolutionType\022\036\n\021default_schema_id\030\007 "
          + "\001(\tB\003\340A\003\022Y\n\016content_config\030\006 \001(\0162<.googl"
          + "e.cloud.discoveryengine.v1beta.DataStore"
          + ".ContentConfigB\003\340A\005\0224\n\013create_time\030\004 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\022a\n\032doc"
          + "ument_processing_config\030\033 \001(\0132=.google.c"
          + "loud.discoveryengine.v1beta.DocumentProc"
          + "essingConfig\022D\n\017starting_schema\030\034 \001(\0132+."
          + "google.cloud.discoveryengine.v1beta.Sche"
          + "ma\"i\n\rContentConfig\022\036\n\032CONTENT_CONFIG_UN"
          + "SPECIFIED\020\000\022\016\n\nNO_CONTENT\020\001\022\024\n\020CONTENT_R"
          + "EQUIRED\020\002\022\022\n\016PUBLIC_WEBSITE\020\003:\311\001\352A\305\001\n(di"
          + "scoveryengine.googleapis.com/DataStore\022?"
          + "projects/{project}/locations/{location}/"
          + "dataStores/{data_store}\022Xprojects/{proje"
          + "ct}/locations/{location}/collections/{co"
          + "llection}/dataStores/{data_store}B\225\002\n\'co"
          + "m.google.cloud.discoveryengine.v1betaB\016D"
          + "ataStoreProtoP\001ZQcloud.google.com/go/dis"
          + "coveryengine/apiv1beta/discoveryenginepb"
          + ";discoveryenginepb\242\002\017DISCOVERYENGINE\252\002#G"
          + "oogle.Cloud.DiscoveryEngine.V1Beta\312\002#Goo"
          + "gle\\Cloud\\DiscoveryEngine\\V1beta\352\002&Googl"
          + "e::Cloud::DiscoveryEngine::V1betab\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.CommonProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.DocumentProcessingConfigProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.SchemaProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_DataStore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_DataStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_DataStore_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "IndustryVertical",
              "SolutionTypes",
              "DefaultSchemaId",
              "ContentConfig",
              "CreateTime",
              "DocumentProcessingConfig",
              "StartingSchema",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.CommonProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.DocumentProcessingConfigProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.SchemaProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
