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
// source: google/cloud/netapp/v1/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.netapp.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/netapp/v1/common.proto\022\026g"
          + "oogle.cloud.netapp.v1*U\n\014ServiceLevel\022\035\n"
          + "\031SERVICE_LEVEL_UNSPECIFIED\020\000\022\013\n\007PREMIUM\020"
          + "\001\022\013\n\007EXTREME\020\002\022\014\n\010STANDARD\020\003*U\n\016Encrypti"
          + "onType\022\037\n\033ENCRYPTION_TYPE_UNSPECIFIED\020\000\022"
          + "\023\n\017SERVICE_MANAGED\020\001\022\r\n\tCLOUD_KMS\020\002B\255\001\n\032"
          + "com.google.cloud.netapp.v1B\013CommonProtoP"
          + "\001Z2cloud.google.com/go/netapp/apiv1/neta"
          + "pppb;netapppb\252\002\026Google.Cloud.NetApp.V1\312\002"
          + "\026Google\\Cloud\\NetApp\\V1\352\002\031Google::Cloud:"
          + ":NetApp::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
