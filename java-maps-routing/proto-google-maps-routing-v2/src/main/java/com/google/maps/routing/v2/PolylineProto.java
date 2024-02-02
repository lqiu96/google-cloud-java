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
// source: google/maps/routing/v2/polyline.proto

// Protobuf Java Version: 3.25.2
package com.google.maps.routing.v2;

public final class PolylineProto {
  private PolylineProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_Polyline_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_Polyline_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/maps/routing/v2/polyline.proto\022"
          + "\026google.maps.routing.v2\032\034google/protobuf"
          + "/struct.proto\"o\n\010Polyline\022\032\n\020encoded_pol"
          + "yline\030\001 \001(\tH\000\0226\n\023geo_json_linestring\030\002 \001"
          + "(\0132\027.google.protobuf.StructH\000B\017\n\rpolylin"
          + "e_type*S\n\017PolylineQuality\022 \n\034POLYLINE_QU"
          + "ALITY_UNSPECIFIED\020\000\022\020\n\014HIGH_QUALITY\020\001\022\014\n"
          + "\010OVERVIEW\020\002*d\n\020PolylineEncoding\022!\n\035POLYL"
          + "INE_ENCODING_UNSPECIFIED\020\000\022\024\n\020ENCODED_PO"
          + "LYLINE\020\001\022\027\n\023GEO_JSON_LINESTRING\020\002B\302\001\n\032co"
          + "m.google.maps.routing.v2B\rPolylineProtoP"
          + "\001Z:cloud.google.com/go/maps/routing/apiv"
          + "2/routingpb;routingpb\370\001\001\242\002\005GMRV2\252\002\026Googl"
          + "e.Maps.Routing.V2\312\002\026Google\\Maps\\Routing\\"
          + "V2\352\002\031Google::Maps::Routing::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_maps_routing_v2_Polyline_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_routing_v2_Polyline_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_Polyline_descriptor,
            new java.lang.String[] {
              "EncodedPolyline", "GeoJsonLinestring", "PolylineType",
            });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
