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
// source: google/maps/addressvalidation/v1/address_validation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.maps.addressvalidation.v1;

public final class AddressValidationServiceProto {
  private AddressValidationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_ValidateAddressRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_ValidateAddressRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_ValidateAddressResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_ValidateAddressResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_ValidationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_ValidationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_Verdict_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_Verdict_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/maps/addressvalidation/v1/addre"
          + "ss_validation_service.proto\022 google.maps"
          + ".addressvalidation.v1\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\032\037go"
          + "ogle/api/field_behavior.proto\032.google/ma"
          + "ps/addressvalidation/v1/address.proto\032.g"
          + "oogle/maps/addressvalidation/v1/geocode."
          + "proto\032/google/maps/addressvalidation/v1/"
          + "metadata.proto\0320google/maps/addressvalid"
          + "ation/v1/usps_data.proto\032 google/type/po"
          + "stal_address.proto\"\203\001\n\026ValidateAddressRe"
          + "quest\0221\n\007address\030\001 \001(\0132\032.google.type.Pos"
          + "talAddressB\004\342A\001\002\022\034\n\024previous_response_id"
          + "\030\002 \001(\t\022\030\n\020enable_usps_cass\030\003 \001(\010\"r\n\027Vali"
          + "dateAddressResponse\022B\n\006result\030\001 \001(\01322.go"
          + "ogle.maps.addressvalidation.v1.Validatio"
          + "nResult\022\023\n\013response_id\030\002 \001(\t\"\315\002\n Provide"
          + "ValidationFeedbackRequest\022q\n\nconclusion\030"
          + "\001 \001(\0162W.google.maps.addressvalidation.v1"
          + ".ProvideValidationFeedbackRequest.Valida"
          + "tionConclusionB\004\342A\001\002\022\031\n\013response_id\030\002 \001("
          + "\tB\004\342A\001\002\"\232\001\n\024ValidationConclusion\022%\n!VALI"
          + "DATION_CONCLUSION_UNSPECIFIED\020\000\022\032\n\026VALID"
          + "ATED_VERSION_USED\020\001\022\025\n\021USER_VERSION_USED"
          + "\020\002\022\034\n\030UNVALIDATED_VERSION_USED\020\003\022\n\n\006UNUS"
          + "ED\020\004\"#\n!ProvideValidationFeedbackRespons"
          + "e\"\312\002\n\020ValidationResult\022:\n\007verdict\030\001 \001(\0132"
          + ").google.maps.addressvalidation.v1.Verdi"
          + "ct\022:\n\007address\030\002 \001(\0132).google.maps.addres"
          + "svalidation.v1.Address\022:\n\007geocode\030\003 \001(\0132"
          + ").google.maps.addressvalidation.v1.Geoco"
          + "de\022C\n\010metadata\030\004 \001(\01321.google.maps.addre"
          + "ssvalidation.v1.AddressMetadata\022=\n\tusps_"
          + "data\030\005 \001(\0132*.google.maps.addressvalidati"
          + "on.v1.UspsData\"\211\004\n\007Verdict\022P\n\021input_gran"
          + "ularity\030\001 \001(\01625.google.maps.addressvalid"
          + "ation.v1.Verdict.Granularity\022U\n\026validati"
          + "on_granularity\030\002 \001(\01625.google.maps.addre"
          + "ssvalidation.v1.Verdict.Granularity\022R\n\023g"
          + "eocode_granularity\030\003 \001(\01625.google.maps.a"
          + "ddressvalidation.v1.Verdict.Granularity\022"
          + "\030\n\020address_complete\030\004 \001(\010\022\"\n\032has_unconfi"
          + "rmed_components\030\005 \001(\010\022\037\n\027has_inferred_co"
          + "mponents\030\006 \001(\010\022\037\n\027has_replaced_component"
          + "s\030\007 \001(\010\"\200\001\n\013Granularity\022\033\n\027GRANULARITY_U"
          + "NSPECIFIED\020\000\022\017\n\013SUB_PREMISE\020\001\022\013\n\007PREMISE"
          + "\020\002\022\025\n\021PREMISE_PROXIMITY\020\003\022\t\n\005BLOCK\020\004\022\t\n\005"
          + "ROUTE\020\005\022\t\n\005OTHER\020\0062\262\003\n\021AddressValidation"
          + "\022\246\001\n\017ValidateAddress\0228.google.maps.addre"
          + "ssvalidation.v1.ValidateAddressRequest\0329"
          + ".google.maps.addressvalidation.v1.Valida"
          + "teAddressResponse\"\036\202\323\344\223\002\030\"\023/v1:validateA"
          + "ddress:\001*\022\316\001\n\031ProvideValidationFeedback\022"
          + "B.google.maps.addressvalidation.v1.Provi"
          + "deValidationFeedbackRequest\032C.google.map"
          + "s.addressvalidation.v1.ProvideValidation"
          + "FeedbackResponse\"(\202\323\344\223\002\"\"\035/v1:provideVal"
          + "idationFeedback:\001*\032#\312A addressvalidation"
          + ".googleapis.comB\232\002\n$com.google.maps.addr"
          + "essvalidation.v1B\035AddressValidationServi"
          + "ceProtoP\001ZXcloud.google.com/go/maps/addr"
          + "essvalidation/apiv1/addressvalidationpb;"
          + "addressvalidationpb\370\001\001\242\002\007GMPAVV1\252\002 Googl"
          + "e.Maps.AddressValidation.V1\312\002 Google\\Map"
          + "s\\AddressValidation\\V1\352\002#Google::Maps::A"
          + "ddressValidation::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.maps.addressvalidation.v1.AddressProto.getDescriptor(),
              com.google.maps.addressvalidation.v1.GeocodeProto.getDescriptor(),
              com.google.maps.addressvalidation.v1.MetadataProto.getDescriptor(),
              com.google.maps.addressvalidation.v1.UspsDataProto.getDescriptor(),
              com.google.type.PostalAddressProto.getDescriptor(),
            });
    internal_static_google_maps_addressvalidation_v1_ValidateAddressRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_addressvalidation_v1_ValidateAddressRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_ValidateAddressRequest_descriptor,
            new java.lang.String[] {
              "Address", "PreviousResponseId", "EnableUspsCass",
            });
    internal_static_google_maps_addressvalidation_v1_ValidateAddressResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_maps_addressvalidation_v1_ValidateAddressResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_ValidateAddressResponse_descriptor,
            new java.lang.String[] {
              "Result", "ResponseId",
            });
    internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_descriptor,
            new java.lang.String[] {
              "Conclusion", "ResponseId",
            });
    internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_maps_addressvalidation_v1_ValidationResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_maps_addressvalidation_v1_ValidationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_ValidationResult_descriptor,
            new java.lang.String[] {
              "Verdict", "Address", "Geocode", "Metadata", "UspsData",
            });
    internal_static_google_maps_addressvalidation_v1_Verdict_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_maps_addressvalidation_v1_Verdict_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_Verdict_descriptor,
            new java.lang.String[] {
              "InputGranularity",
              "ValidationGranularity",
              "GeocodeGranularity",
              "AddressComplete",
              "HasUnconfirmedComponents",
              "HasInferredComponents",
              "HasReplacedComponents",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.maps.addressvalidation.v1.AddressProto.getDescriptor();
    com.google.maps.addressvalidation.v1.GeocodeProto.getDescriptor();
    com.google.maps.addressvalidation.v1.MetadataProto.getDescriptor();
    com.google.maps.addressvalidation.v1.UspsDataProto.getDescriptor();
    com.google.type.PostalAddressProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
