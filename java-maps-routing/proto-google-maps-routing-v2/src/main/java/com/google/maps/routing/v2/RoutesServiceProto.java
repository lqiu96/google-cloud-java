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
// source: google/maps/routing/v2/routes_service.proto

// Protobuf Java Version: 3.25.2
package com.google.maps.routing.v2;

public final class RoutesServiceProto {
  private RoutesServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_ComputeRoutesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_ComputeRoutesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_ComputeRoutesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_ComputeRoutesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_ComputeRouteMatrixRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_ComputeRouteMatrixRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_RouteMatrixOrigin_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_RouteMatrixOrigin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_RouteMatrixDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_RouteMatrixDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_RouteMatrixElement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_RouteMatrixElement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_RouteMatrixElement_LocalizedValues_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_RouteMatrixElement_LocalizedValues_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/maps/routing/v2/routes_service."
          + "proto\022\026google.maps.routing.v2\032\034google/ap"
          + "i/annotations.proto\032\027google/api/client.p"
          + "roto\032\037google/api/field_behavior.proto\032*g"
          + "oogle/maps/routing/v2/fallback_info.prot"
          + "o\032.google/maps/routing/v2/geocoding_resu"
          + "lts.proto\032%google/maps/routing/v2/polyli"
          + "ne.proto\032\"google/maps/routing/v2/route.p"
          + "roto\032,google/maps/routing/v2/route_modif"
          + "iers.proto\032.google/maps/routing/v2/route"
          + "_travel_mode.proto\032/google/maps/routing/"
          + "v2/routing_preference.proto\032*google/maps"
          + "/routing/v2/traffic_model.proto\0320google/"
          + "maps/routing/v2/transit_preferences.prot"
          + "o\032\"google/maps/routing/v2/units.proto\032%g"
          + "oogle/maps/routing/v2/waypoint.proto\032\036go"
          + "ogle/protobuf/duration.proto\032\037google/pro"
          + "tobuf/timestamp.proto\032\027google/rpc/status"
          + ".proto\032 google/type/localized_text.proto"
          + "\"\244\013\n\024ComputeRoutesRequest\0226\n\006origin\030\001 \001("
          + "\0132 .google.maps.routing.v2.WaypointB\004\342A\001"
          + "\002\022;\n\013destination\030\002 \001(\0132 .google.maps.rou"
          + "ting.v2.WaypointB\004\342A\001\002\022=\n\rintermediates\030"
          + "\003 \003(\0132 .google.maps.routing.v2.WaypointB"
          + "\004\342A\001\001\022B\n\013travel_mode\030\004 \001(\0162\'.google.maps"
          + ".routing.v2.RouteTravelModeB\004\342A\001\001\022K\n\022rou"
          + "ting_preference\030\005 \001(\0162).google.maps.rout"
          + "ing.v2.RoutingPreferenceB\004\342A\001\001\022G\n\020polyli"
          + "ne_quality\030\006 \001(\0162\'.google.maps.routing.v"
          + "2.PolylineQualityB\004\342A\001\001\022I\n\021polyline_enco"
          + "ding\030\014 \001(\0162(.google.maps.routing.v2.Poly"
          + "lineEncodingB\004\342A\001\001\0228\n\016departure_time\030\007 \001"
          + "(\0132\032.google.protobuf.TimestampB\004\342A\001\001\0226\n\014"
          + "arrival_time\030\023 \001(\0132\032.google.protobuf.Tim"
          + "estampB\004\342A\001\001\022(\n\032compute_alternative_rout"
          + "es\030\010 \001(\010B\004\342A\001\001\022E\n\017route_modifiers\030\t \001(\0132"
          + "&.google.maps.routing.v2.RouteModifiersB"
          + "\004\342A\001\001\022\033\n\rlanguage_code\030\n \001(\tB\004\342A\001\001\022\031\n\013re"
          + "gion_code\030\020 \001(\tB\004\342A\001\001\0222\n\005units\030\013 \001(\0162\035.g"
          + "oogle.maps.routing.v2.UnitsB\004\342A\001\001\022%\n\027opt"
          + "imize_waypoint_order\030\r \001(\010B\004\342A\001\001\022e\n\032requ"
          + "ested_reference_routes\030\016 \003(\0162;.google.ma"
          + "ps.routing.v2.ComputeRoutesRequest.Refer"
          + "enceRouteB\004\342A\001\001\022_\n\022extra_computations\030\017 "
          + "\003(\0162=.google.maps.routing.v2.ComputeRout"
          + "esRequest.ExtraComputationB\004\342A\001\001\022A\n\rtraf"
          + "fic_model\030\022 \001(\0162$.google.maps.routing.v2"
          + ".TrafficModelB\004\342A\001\001\022M\n\023transit_preferenc"
          + "es\030\024 \001(\0132*.google.maps.routing.v2.Transi"
          + "tPreferencesB\004\342A\001\001\"E\n\016ReferenceRoute\022\037\n\033"
          + "REFERENCE_ROUTE_UNSPECIFIED\020\000\022\022\n\016FUEL_EF"
          + "FICIENT\020\001\"\233\001\n\020ExtraComputation\022!\n\035EXTRA_"
          + "COMPUTATION_UNSPECIFIED\020\000\022\t\n\005TOLLS\020\001\022\024\n\020"
          + "FUEL_CONSUMPTION\020\002\022\027\n\023TRAFFIC_ON_POLYLIN"
          + "E\020\003\022*\n&HTML_FORMATTED_NAVIGATION_INSTRUC"
          + "TIONS\020\004\"\310\001\n\025ComputeRoutesResponse\022-\n\006rou"
          + "tes\030\001 \003(\0132\035.google.maps.routing.v2.Route"
          + "\022;\n\rfallback_info\030\002 \001(\0132$.google.maps.ro"
          + "uting.v2.FallbackInfo\022C\n\021geocoding_resul"
          + "ts\030\003 \001(\0132(.google.maps.routing.v2.Geocod"
          + "ingResults\"\236\006\n\031ComputeRouteMatrixRequest"
          + "\022@\n\007origins\030\001 \003(\0132).google.maps.routing."
          + "v2.RouteMatrixOriginB\004\342A\001\002\022J\n\014destinatio"
          + "ns\030\002 \003(\0132..google.maps.routing.v2.RouteM"
          + "atrixDestinationB\004\342A\001\002\022B\n\013travel_mode\030\003 "
          + "\001(\0162\'.google.maps.routing.v2.RouteTravel"
          + "ModeB\004\342A\001\001\022K\n\022routing_preference\030\004 \001(\0162)"
          + ".google.maps.routing.v2.RoutingPreferenc"
          + "eB\004\342A\001\001\0228\n\016departure_time\030\005 \001(\0132\032.google"
          + ".protobuf.TimestampB\004\342A\001\001\0226\n\014arrival_tim"
          + "e\030\013 \001(\0132\032.google.protobuf.TimestampB\004\342A\001"
          + "\001\022\033\n\rlanguage_code\030\006 \001(\tB\004\342A\001\001\022\031\n\013region"
          + "_code\030\t \001(\tB\004\342A\001\001\022d\n\022extra_computations\030"
          + "\010 \003(\0162B.google.maps.routing.v2.ComputeRo"
          + "uteMatrixRequest.ExtraComputationB\004\342A\001\001\022"
          + "A\n\rtraffic_model\030\n \001(\0162$.google.maps.rou"
          + "ting.v2.TrafficModelB\004\342A\001\001\022M\n\023transit_pr"
          + "eferences\030\014 \001(\0132*.google.maps.routing.v2"
          + ".TransitPreferencesB\004\342A\001\001\"@\n\020ExtraComput"
          + "ation\022!\n\035EXTRA_COMPUTATION_UNSPECIFIED\020\000"
          + "\022\t\n\005TOLLS\020\001\"\224\001\n\021RouteMatrixOrigin\0228\n\010way"
          + "point\030\001 \001(\0132 .google.maps.routing.v2.Way"
          + "pointB\004\342A\001\002\022E\n\017route_modifiers\030\002 \001(\0132&.g"
          + "oogle.maps.routing.v2.RouteModifiersB\004\342A"
          + "\001\001\"R\n\026RouteMatrixDestination\0228\n\010waypoint"
          + "\030\001 \001(\0132 .google.maps.routing.v2.Waypoint"
          + "B\004\342A\001\002\"\214\006\n\022RouteMatrixElement\022\031\n\014origin_"
          + "index\030\001 \001(\005H\000\210\001\001\022\036\n\021destination_index\030\002 "
          + "\001(\005H\001\210\001\001\022\"\n\006status\030\003 \001(\0132\022.google.rpc.St"
          + "atus\022F\n\tcondition\030\t \001(\01623.google.maps.ro"
          + "uting.v2.RouteMatrixElementCondition\022\027\n\017"
          + "distance_meters\030\004 \001(\005\022+\n\010duration\030\005 \001(\0132"
          + "\031.google.protobuf.Duration\0222\n\017static_dur"
          + "ation\030\006 \001(\0132\031.google.protobuf.Duration\022D"
          + "\n\017travel_advisory\030\007 \001(\0132+.google.maps.ro"
          + "uting.v2.RouteTravelAdvisory\022;\n\rfallback"
          + "_info\030\010 \001(\0132$.google.maps.routing.v2.Fal"
          + "lbackInfo\022T\n\020localized_values\030\n \001(\0132:.go"
          + "ogle.maps.routing.v2.RouteMatrixElement."
          + "LocalizedValues\032\324\001\n\017LocalizedValues\022,\n\010d"
          + "istance\030\001 \001(\0132\032.google.type.LocalizedTex"
          + "t\022,\n\010duration\030\002 \001(\0132\032.google.type.Locali"
          + "zedText\0223\n\017static_duration\030\003 \001(\0132\032.googl"
          + "e.type.LocalizedText\0220\n\014transit_fare\030\004 \001"
          + "(\0132\032.google.type.LocalizedTextB\017\n\r_origi"
          + "n_indexB\024\n\022_destination_index*t\n\033RouteMa"
          + "trixElementCondition\022.\n*ROUTE_MATRIX_ELE"
          + "MENT_CONDITION_UNSPECIFIED\020\000\022\020\n\014ROUTE_EX"
          + "ISTS\020\001\022\023\n\017ROUTE_NOT_FOUND\020\0022\344\002\n\006Routes\022\225"
          + "\001\n\rComputeRoutes\022,.google.maps.routing.v"
          + "2.ComputeRoutesRequest\032-.google.maps.rou"
          + "ting.v2.ComputeRoutesResponse\"\'\202\323\344\223\002!\"\034/"
          + "directions/v2:computeRoutes:\001*\022\247\001\n\022Compu"
          + "teRouteMatrix\0221.google.maps.routing.v2.C"
          + "omputeRouteMatrixRequest\032*.google.maps.r"
          + "outing.v2.RouteMatrixElement\"0\202\323\344\223\002*\"%/d"
          + "istanceMatrix/v2:computeRouteMatrix:\001*0\001"
          + "\032\030\312A\025routes.googleapis.comB\307\001\n\032com.googl"
          + "e.maps.routing.v2B\022RoutesServiceProtoP\001Z"
          + ":cloud.google.com/go/maps/routing/apiv2/"
          + "routingpb;routingpb\370\001\001\242\002\005GMRV2\252\002\026Google."
          + "Maps.Routing.V2\312\002\026Google\\Maps\\Routing\\V2"
          + "\352\002\031Google::Maps::Routing::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.maps.routing.v2.FallbackInfoProto.getDescriptor(),
              com.google.maps.routing.v2.GeocodingResultsProto.getDescriptor(),
              com.google.maps.routing.v2.PolylineProto.getDescriptor(),
              com.google.maps.routing.v2.RouteProto.getDescriptor(),
              com.google.maps.routing.v2.RouteModifiersProto.getDescriptor(),
              com.google.maps.routing.v2.RouteTravelModeProto.getDescriptor(),
              com.google.maps.routing.v2.RoutingPreferenceProto.getDescriptor(),
              com.google.maps.routing.v2.TrafficModelProto.getDescriptor(),
              com.google.maps.routing.v2.TransitPreferencesProto.getDescriptor(),
              com.google.maps.routing.v2.UnitsProto.getDescriptor(),
              com.google.maps.routing.v2.WaypointProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.LocalizedTextProto.getDescriptor(),
            });
    internal_static_google_maps_routing_v2_ComputeRoutesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_routing_v2_ComputeRoutesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_ComputeRoutesRequest_descriptor,
            new java.lang.String[] {
              "Origin",
              "Destination",
              "Intermediates",
              "TravelMode",
              "RoutingPreference",
              "PolylineQuality",
              "PolylineEncoding",
              "DepartureTime",
              "ArrivalTime",
              "ComputeAlternativeRoutes",
              "RouteModifiers",
              "LanguageCode",
              "RegionCode",
              "Units",
              "OptimizeWaypointOrder",
              "RequestedReferenceRoutes",
              "ExtraComputations",
              "TrafficModel",
              "TransitPreferences",
            });
    internal_static_google_maps_routing_v2_ComputeRoutesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_maps_routing_v2_ComputeRoutesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_ComputeRoutesResponse_descriptor,
            new java.lang.String[] {
              "Routes", "FallbackInfo", "GeocodingResults",
            });
    internal_static_google_maps_routing_v2_ComputeRouteMatrixRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_maps_routing_v2_ComputeRouteMatrixRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_ComputeRouteMatrixRequest_descriptor,
            new java.lang.String[] {
              "Origins",
              "Destinations",
              "TravelMode",
              "RoutingPreference",
              "DepartureTime",
              "ArrivalTime",
              "LanguageCode",
              "RegionCode",
              "ExtraComputations",
              "TrafficModel",
              "TransitPreferences",
            });
    internal_static_google_maps_routing_v2_RouteMatrixOrigin_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_maps_routing_v2_RouteMatrixOrigin_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_RouteMatrixOrigin_descriptor,
            new java.lang.String[] {
              "Waypoint", "RouteModifiers",
            });
    internal_static_google_maps_routing_v2_RouteMatrixDestination_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_maps_routing_v2_RouteMatrixDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_RouteMatrixDestination_descriptor,
            new java.lang.String[] {
              "Waypoint",
            });
    internal_static_google_maps_routing_v2_RouteMatrixElement_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_maps_routing_v2_RouteMatrixElement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_RouteMatrixElement_descriptor,
            new java.lang.String[] {
              "OriginIndex",
              "DestinationIndex",
              "Status",
              "Condition",
              "DistanceMeters",
              "Duration",
              "StaticDuration",
              "TravelAdvisory",
              "FallbackInfo",
              "LocalizedValues",
            });
    internal_static_google_maps_routing_v2_RouteMatrixElement_LocalizedValues_descriptor =
        internal_static_google_maps_routing_v2_RouteMatrixElement_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_maps_routing_v2_RouteMatrixElement_LocalizedValues_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_RouteMatrixElement_LocalizedValues_descriptor,
            new java.lang.String[] {
              "Distance", "Duration", "StaticDuration", "TransitFare",
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
    com.google.maps.routing.v2.FallbackInfoProto.getDescriptor();
    com.google.maps.routing.v2.GeocodingResultsProto.getDescriptor();
    com.google.maps.routing.v2.PolylineProto.getDescriptor();
    com.google.maps.routing.v2.RouteProto.getDescriptor();
    com.google.maps.routing.v2.RouteModifiersProto.getDescriptor();
    com.google.maps.routing.v2.RouteTravelModeProto.getDescriptor();
    com.google.maps.routing.v2.RoutingPreferenceProto.getDescriptor();
    com.google.maps.routing.v2.TrafficModelProto.getDescriptor();
    com.google.maps.routing.v2.TransitPreferencesProto.getDescriptor();
    com.google.maps.routing.v2.UnitsProto.getDescriptor();
    com.google.maps.routing.v2.WaypointProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.LocalizedTextProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
