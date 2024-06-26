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
// source: google/cloud/discoveryengine/v1beta/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Interval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Interval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_UserInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_EmbeddingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_EmbeddingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_DoubleList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_DoubleList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/discoveryengine/v1beta/co"
          + "mmon.proto\022#google.cloud.discoveryengine"
          + ".v1beta\032\031google/api/resource.proto\"x\n\010In"
          + "terval\022\021\n\007minimum\030\001 \001(\001H\000\022\033\n\021exclusive_m"
          + "inimum\030\002 \001(\001H\000\022\021\n\007maximum\030\003 \001(\001H\001\022\033\n\021exc"
          + "lusive_maximum\030\004 \001(\001H\001B\005\n\003minB\005\n\003max\"0\n\017"
          + "CustomAttribute\022\014\n\004text\030\001 \003(\t\022\017\n\007numbers"
          + "\030\002 \003(\001\"/\n\010UserInfo\022\017\n\007user_id\030\001 \001(\t\022\022\n\nu"
          + "ser_agent\030\002 \001(\t\"%\n\017EmbeddingConfig\022\022\n\nfi"
          + "eld_path\030\001 \001(\t\"\034\n\nDoubleList\022\016\n\006values\030\001"
          + " \003(\001*M\n\020IndustryVertical\022!\n\035INDUSTRY_VER"
          + "TICAL_UNSPECIFIED\020\000\022\013\n\007GENERIC\020\001\022\t\n\005MEDI"
          + "A\020\002*\201\001\n\014SolutionType\022\035\n\031SOLUTION_TYPE_UN"
          + "SPECIFIED\020\000\022 \n\034SOLUTION_TYPE_RECOMMENDAT"
          + "ION\020\001\022\030\n\024SOLUTION_TYPE_SEARCH\020\002\022\026\n\022SOLUT"
          + "ION_TYPE_CHAT\020\003*_\n\nSearchTier\022\033\n\027SEARCH_"
          + "TIER_UNSPECIFIED\020\000\022\030\n\024SEARCH_TIER_STANDA"
          + "RD\020\001\022\032\n\026SEARCH_TIER_ENTERPRISE\020\002*C\n\013Sear"
          + "chAddOn\022\035\n\031SEARCH_ADD_ON_UNSPECIFIED\020\000\022\025"
          + "\n\021SEARCH_ADD_ON_LLM\020\001B\354\004\n\'com.google.clo"
          + "ud.discoveryengine.v1betaB\013CommonProtoP\001"
          + "ZQcloud.google.com/go/discoveryengine/ap"
          + "iv1beta/discoveryenginepb;discoveryengin"
          + "epb\242\002\017DISCOVERYENGINE\252\002#Google.Cloud.Dis"
          + "coveryEngine.V1Beta\312\002#Google\\Cloud\\Disco"
          + "veryEngine\\V1beta\352\002&Google::Cloud::Disco"
          + "veryEngine::V1beta\352A\346\001\n%discoveryengine."
          + "googleapis.com/Branch\022Qprojects/{project"
          + "}/locations/{location}/dataStores/{data_"
          + "store}/branches/{branch}\022jprojects/{proj"
          + "ect}/locations/{location}/collections/{c"
          + "ollection}/dataStores/{data_store}/branc"
          + "hes/{branch}\352Am\n)discoveryengine.googlea"
          + "pis.com/Collection\022@projects/{project}/l"
          + "ocations/{location}/collections/{collect"
          + "ion}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_Interval_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Interval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Interval_descriptor,
            new java.lang.String[] {
              "Minimum", "ExclusiveMinimum", "Maximum", "ExclusiveMaximum", "Min", "Max",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_descriptor,
            new java.lang.String[] {
              "Text", "Numbers",
            });
    internal_static_google_cloud_discoveryengine_v1beta_UserInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_UserInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_UserInfo_descriptor,
            new java.lang.String[] {
              "UserId", "UserAgent",
            });
    internal_static_google_cloud_discoveryengine_v1beta_EmbeddingConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_EmbeddingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_EmbeddingConfig_descriptor,
            new java.lang.String[] {
              "FieldPath",
            });
    internal_static_google_cloud_discoveryengine_v1beta_DoubleList_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_DoubleList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_DoubleList_descriptor,
            new java.lang.String[] {
              "Values",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
