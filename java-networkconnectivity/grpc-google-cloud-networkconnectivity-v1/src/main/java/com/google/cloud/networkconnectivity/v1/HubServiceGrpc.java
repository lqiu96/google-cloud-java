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
package com.google.cloud.networkconnectivity.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Network Connectivity Center is a hub-and-spoke abstraction for network
 * connectivity management in Google Cloud. It reduces operational complexity
 * through a simple, centralized connectivity management model.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/networkconnectivity/v1/hub.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HubServiceGrpc {

  private HubServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME =
      "google.cloud.networkconnectivity.v1.HubService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListHubsRequest,
          com.google.cloud.networkconnectivity.v1.ListHubsResponse>
      getListHubsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHubs",
      requestType = com.google.cloud.networkconnectivity.v1.ListHubsRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.ListHubsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListHubsRequest,
          com.google.cloud.networkconnectivity.v1.ListHubsResponse>
      getListHubsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.ListHubsRequest,
            com.google.cloud.networkconnectivity.v1.ListHubsResponse>
        getListHubsMethod;
    if ((getListHubsMethod = HubServiceGrpc.getListHubsMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getListHubsMethod = HubServiceGrpc.getListHubsMethod) == null) {
          HubServiceGrpc.getListHubsMethod =
              getListHubsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.ListHubsRequest,
                          com.google.cloud.networkconnectivity.v1.ListHubsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHubs"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListHubsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListHubsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("ListHubs"))
                      .build();
        }
      }
    }
    return getListHubsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.GetHubRequest,
          com.google.cloud.networkconnectivity.v1.Hub>
      getGetHubMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHub",
      requestType = com.google.cloud.networkconnectivity.v1.GetHubRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.Hub.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.GetHubRequest,
          com.google.cloud.networkconnectivity.v1.Hub>
      getGetHubMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.GetHubRequest,
            com.google.cloud.networkconnectivity.v1.Hub>
        getGetHubMethod;
    if ((getGetHubMethod = HubServiceGrpc.getGetHubMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getGetHubMethod = HubServiceGrpc.getGetHubMethod) == null) {
          HubServiceGrpc.getGetHubMethod =
              getGetHubMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.GetHubRequest,
                          com.google.cloud.networkconnectivity.v1.Hub>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHub"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.GetHubRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.Hub.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("GetHub"))
                      .build();
        }
      }
    }
    return getGetHubMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.CreateHubRequest,
          com.google.longrunning.Operation>
      getCreateHubMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHub",
      requestType = com.google.cloud.networkconnectivity.v1.CreateHubRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.CreateHubRequest,
          com.google.longrunning.Operation>
      getCreateHubMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.CreateHubRequest,
            com.google.longrunning.Operation>
        getCreateHubMethod;
    if ((getCreateHubMethod = HubServiceGrpc.getCreateHubMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getCreateHubMethod = HubServiceGrpc.getCreateHubMethod) == null) {
          HubServiceGrpc.getCreateHubMethod =
              getCreateHubMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.CreateHubRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHub"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.CreateHubRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("CreateHub"))
                      .build();
        }
      }
    }
    return getCreateHubMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.UpdateHubRequest,
          com.google.longrunning.Operation>
      getUpdateHubMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHub",
      requestType = com.google.cloud.networkconnectivity.v1.UpdateHubRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.UpdateHubRequest,
          com.google.longrunning.Operation>
      getUpdateHubMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.UpdateHubRequest,
            com.google.longrunning.Operation>
        getUpdateHubMethod;
    if ((getUpdateHubMethod = HubServiceGrpc.getUpdateHubMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getUpdateHubMethod = HubServiceGrpc.getUpdateHubMethod) == null) {
          HubServiceGrpc.getUpdateHubMethod =
              getUpdateHubMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.UpdateHubRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHub"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.UpdateHubRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("UpdateHub"))
                      .build();
        }
      }
    }
    return getUpdateHubMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.DeleteHubRequest,
          com.google.longrunning.Operation>
      getDeleteHubMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHub",
      requestType = com.google.cloud.networkconnectivity.v1.DeleteHubRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.DeleteHubRequest,
          com.google.longrunning.Operation>
      getDeleteHubMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.DeleteHubRequest,
            com.google.longrunning.Operation>
        getDeleteHubMethod;
    if ((getDeleteHubMethod = HubServiceGrpc.getDeleteHubMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getDeleteHubMethod = HubServiceGrpc.getDeleteHubMethod) == null) {
          HubServiceGrpc.getDeleteHubMethod =
              getDeleteHubMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.DeleteHubRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHub"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.DeleteHubRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("DeleteHub"))
                      .build();
        }
      }
    }
    return getDeleteHubMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest,
          com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse>
      getListHubSpokesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHubSpokes",
      requestType = com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest,
          com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse>
      getListHubSpokesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest,
            com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse>
        getListHubSpokesMethod;
    if ((getListHubSpokesMethod = HubServiceGrpc.getListHubSpokesMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getListHubSpokesMethod = HubServiceGrpc.getListHubSpokesMethod) == null) {
          HubServiceGrpc.getListHubSpokesMethod =
              getListHubSpokesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest,
                          com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHubSpokes"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("ListHubSpokes"))
                      .build();
        }
      }
    }
    return getListHubSpokesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListSpokesRequest,
          com.google.cloud.networkconnectivity.v1.ListSpokesResponse>
      getListSpokesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSpokes",
      requestType = com.google.cloud.networkconnectivity.v1.ListSpokesRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.ListSpokesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListSpokesRequest,
          com.google.cloud.networkconnectivity.v1.ListSpokesResponse>
      getListSpokesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.ListSpokesRequest,
            com.google.cloud.networkconnectivity.v1.ListSpokesResponse>
        getListSpokesMethod;
    if ((getListSpokesMethod = HubServiceGrpc.getListSpokesMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getListSpokesMethod = HubServiceGrpc.getListSpokesMethod) == null) {
          HubServiceGrpc.getListSpokesMethod =
              getListSpokesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.ListSpokesRequest,
                          com.google.cloud.networkconnectivity.v1.ListSpokesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSpokes"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListSpokesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListSpokesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("ListSpokes"))
                      .build();
        }
      }
    }
    return getListSpokesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.GetSpokeRequest,
          com.google.cloud.networkconnectivity.v1.Spoke>
      getGetSpokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpoke",
      requestType = com.google.cloud.networkconnectivity.v1.GetSpokeRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.Spoke.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.GetSpokeRequest,
          com.google.cloud.networkconnectivity.v1.Spoke>
      getGetSpokeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.GetSpokeRequest,
            com.google.cloud.networkconnectivity.v1.Spoke>
        getGetSpokeMethod;
    if ((getGetSpokeMethod = HubServiceGrpc.getGetSpokeMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getGetSpokeMethod = HubServiceGrpc.getGetSpokeMethod) == null) {
          HubServiceGrpc.getGetSpokeMethod =
              getGetSpokeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.GetSpokeRequest,
                          com.google.cloud.networkconnectivity.v1.Spoke>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpoke"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.GetSpokeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.Spoke.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("GetSpoke"))
                      .build();
        }
      }
    }
    return getGetSpokeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.CreateSpokeRequest,
          com.google.longrunning.Operation>
      getCreateSpokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSpoke",
      requestType = com.google.cloud.networkconnectivity.v1.CreateSpokeRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.CreateSpokeRequest,
          com.google.longrunning.Operation>
      getCreateSpokeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.CreateSpokeRequest,
            com.google.longrunning.Operation>
        getCreateSpokeMethod;
    if ((getCreateSpokeMethod = HubServiceGrpc.getCreateSpokeMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getCreateSpokeMethod = HubServiceGrpc.getCreateSpokeMethod) == null) {
          HubServiceGrpc.getCreateSpokeMethod =
              getCreateSpokeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.CreateSpokeRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSpoke"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.CreateSpokeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("CreateSpoke"))
                      .build();
        }
      }
    }
    return getCreateSpokeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest,
          com.google.longrunning.Operation>
      getUpdateSpokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSpoke",
      requestType = com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest,
          com.google.longrunning.Operation>
      getUpdateSpokeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest,
            com.google.longrunning.Operation>
        getUpdateSpokeMethod;
    if ((getUpdateSpokeMethod = HubServiceGrpc.getUpdateSpokeMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getUpdateSpokeMethod = HubServiceGrpc.getUpdateSpokeMethod) == null) {
          HubServiceGrpc.getUpdateSpokeMethod =
              getUpdateSpokeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSpoke"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("UpdateSpoke"))
                      .build();
        }
      }
    }
    return getUpdateSpokeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest,
          com.google.longrunning.Operation>
      getRejectHubSpokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RejectHubSpoke",
      requestType = com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest,
          com.google.longrunning.Operation>
      getRejectHubSpokeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest,
            com.google.longrunning.Operation>
        getRejectHubSpokeMethod;
    if ((getRejectHubSpokeMethod = HubServiceGrpc.getRejectHubSpokeMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getRejectHubSpokeMethod = HubServiceGrpc.getRejectHubSpokeMethod) == null) {
          HubServiceGrpc.getRejectHubSpokeMethod =
              getRejectHubSpokeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RejectHubSpoke"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("RejectHubSpoke"))
                      .build();
        }
      }
    }
    return getRejectHubSpokeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest,
          com.google.longrunning.Operation>
      getAcceptHubSpokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptHubSpoke",
      requestType = com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest,
          com.google.longrunning.Operation>
      getAcceptHubSpokeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest,
            com.google.longrunning.Operation>
        getAcceptHubSpokeMethod;
    if ((getAcceptHubSpokeMethod = HubServiceGrpc.getAcceptHubSpokeMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getAcceptHubSpokeMethod = HubServiceGrpc.getAcceptHubSpokeMethod) == null) {
          HubServiceGrpc.getAcceptHubSpokeMethod =
              getAcceptHubSpokeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptHubSpoke"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("AcceptHubSpoke"))
                      .build();
        }
      }
    }
    return getAcceptHubSpokeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest,
          com.google.longrunning.Operation>
      getDeleteSpokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSpoke",
      requestType = com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest,
          com.google.longrunning.Operation>
      getDeleteSpokeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest,
            com.google.longrunning.Operation>
        getDeleteSpokeMethod;
    if ((getDeleteSpokeMethod = HubServiceGrpc.getDeleteSpokeMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getDeleteSpokeMethod = HubServiceGrpc.getDeleteSpokeMethod) == null) {
          HubServiceGrpc.getDeleteSpokeMethod =
              getDeleteSpokeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSpoke"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("DeleteSpoke"))
                      .build();
        }
      }
    }
    return getDeleteSpokeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.GetRouteTableRequest,
          com.google.cloud.networkconnectivity.v1.RouteTable>
      getGetRouteTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRouteTable",
      requestType = com.google.cloud.networkconnectivity.v1.GetRouteTableRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.RouteTable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.GetRouteTableRequest,
          com.google.cloud.networkconnectivity.v1.RouteTable>
      getGetRouteTableMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.GetRouteTableRequest,
            com.google.cloud.networkconnectivity.v1.RouteTable>
        getGetRouteTableMethod;
    if ((getGetRouteTableMethod = HubServiceGrpc.getGetRouteTableMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getGetRouteTableMethod = HubServiceGrpc.getGetRouteTableMethod) == null) {
          HubServiceGrpc.getGetRouteTableMethod =
              getGetRouteTableMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.GetRouteTableRequest,
                          com.google.cloud.networkconnectivity.v1.RouteTable>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRouteTable"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.GetRouteTableRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.RouteTable
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("GetRouteTable"))
                      .build();
        }
      }
    }
    return getGetRouteTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.GetRouteRequest,
          com.google.cloud.networkconnectivity.v1.Route>
      getGetRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoute",
      requestType = com.google.cloud.networkconnectivity.v1.GetRouteRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.Route.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.GetRouteRequest,
          com.google.cloud.networkconnectivity.v1.Route>
      getGetRouteMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.GetRouteRequest,
            com.google.cloud.networkconnectivity.v1.Route>
        getGetRouteMethod;
    if ((getGetRouteMethod = HubServiceGrpc.getGetRouteMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getGetRouteMethod = HubServiceGrpc.getGetRouteMethod) == null) {
          HubServiceGrpc.getGetRouteMethod =
              getGetRouteMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.GetRouteRequest,
                          com.google.cloud.networkconnectivity.v1.Route>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoute"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.GetRouteRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.Route.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("GetRoute"))
                      .build();
        }
      }
    }
    return getGetRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListRoutesRequest,
          com.google.cloud.networkconnectivity.v1.ListRoutesResponse>
      getListRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoutes",
      requestType = com.google.cloud.networkconnectivity.v1.ListRoutesRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.ListRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListRoutesRequest,
          com.google.cloud.networkconnectivity.v1.ListRoutesResponse>
      getListRoutesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.ListRoutesRequest,
            com.google.cloud.networkconnectivity.v1.ListRoutesResponse>
        getListRoutesMethod;
    if ((getListRoutesMethod = HubServiceGrpc.getListRoutesMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getListRoutesMethod = HubServiceGrpc.getListRoutesMethod) == null) {
          HubServiceGrpc.getListRoutesMethod =
              getListRoutesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.ListRoutesRequest,
                          com.google.cloud.networkconnectivity.v1.ListRoutesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoutes"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListRoutesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListRoutesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("ListRoutes"))
                      .build();
        }
      }
    }
    return getListRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest,
          com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse>
      getListRouteTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRouteTables",
      requestType = com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest,
          com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse>
      getListRouteTablesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest,
            com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse>
        getListRouteTablesMethod;
    if ((getListRouteTablesMethod = HubServiceGrpc.getListRouteTablesMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getListRouteTablesMethod = HubServiceGrpc.getListRouteTablesMethod) == null) {
          HubServiceGrpc.getListRouteTablesMethod =
              getListRouteTablesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest,
                          com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRouteTables"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new HubServiceMethodDescriptorSupplier("ListRouteTables"))
                      .build();
        }
      }
    }
    return getListRouteTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.GetGroupRequest,
          com.google.cloud.networkconnectivity.v1.Group>
      getGetGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGroup",
      requestType = com.google.cloud.networkconnectivity.v1.GetGroupRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.Group.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.GetGroupRequest,
          com.google.cloud.networkconnectivity.v1.Group>
      getGetGroupMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.GetGroupRequest,
            com.google.cloud.networkconnectivity.v1.Group>
        getGetGroupMethod;
    if ((getGetGroupMethod = HubServiceGrpc.getGetGroupMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getGetGroupMethod = HubServiceGrpc.getGetGroupMethod) == null) {
          HubServiceGrpc.getGetGroupMethod =
              getGetGroupMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.GetGroupRequest,
                          com.google.cloud.networkconnectivity.v1.Group>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGroup"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.GetGroupRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.Group.getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("GetGroup"))
                      .build();
        }
      }
    }
    return getGetGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListGroupsRequest,
          com.google.cloud.networkconnectivity.v1.ListGroupsResponse>
      getListGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGroups",
      requestType = com.google.cloud.networkconnectivity.v1.ListGroupsRequest.class,
      responseType = com.google.cloud.networkconnectivity.v1.ListGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.networkconnectivity.v1.ListGroupsRequest,
          com.google.cloud.networkconnectivity.v1.ListGroupsResponse>
      getListGroupsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.networkconnectivity.v1.ListGroupsRequest,
            com.google.cloud.networkconnectivity.v1.ListGroupsResponse>
        getListGroupsMethod;
    if ((getListGroupsMethod = HubServiceGrpc.getListGroupsMethod) == null) {
      synchronized (HubServiceGrpc.class) {
        if ((getListGroupsMethod = HubServiceGrpc.getListGroupsMethod) == null) {
          HubServiceGrpc.getListGroupsMethod =
              getListGroupsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.networkconnectivity.v1.ListGroupsRequest,
                          com.google.cloud.networkconnectivity.v1.ListGroupsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGroups"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListGroupsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.networkconnectivity.v1.ListGroupsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new HubServiceMethodDescriptorSupplier("ListGroups"))
                      .build();
        }
      }
    }
    return getListGroupsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static HubServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HubServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<HubServiceStub>() {
          @java.lang.Override
          public HubServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new HubServiceStub(channel, callOptions);
          }
        };
    return HubServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HubServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HubServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<HubServiceBlockingStub>() {
          @java.lang.Override
          public HubServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new HubServiceBlockingStub(channel, callOptions);
          }
        };
    return HubServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static HubServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HubServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<HubServiceFutureStub>() {
          @java.lang.Override
          public HubServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new HubServiceFutureStub(channel, callOptions);
          }
        };
    return HubServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Network Connectivity Center is a hub-and-spoke abstraction for network
   * connectivity management in Google Cloud. It reduces operational complexity
   * through a simple, centralized connectivity management model.
   * </pre>
   */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center hubs associated with a given project.
     * </pre>
     */
    default void listHubs(
        com.google.cloud.networkconnectivity.v1.ListHubsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListHubsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHubsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center hub.
     * </pre>
     */
    default void getHub(
        com.google.cloud.networkconnectivity.v1.GetHubRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Hub> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHubMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Network Connectivity Center hub in the specified project.
     * </pre>
     */
    default void createHub(
        com.google.cloud.networkconnectivity.v1.CreateHubRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHubMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the description and/or labels of a Network Connectivity Center
     * hub.
     * </pre>
     */
    default void updateHub(
        com.google.cloud.networkconnectivity.v1.UpdateHubRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHubMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Network Connectivity Center hub.
     * </pre>
     */
    default void deleteHub(
        com.google.cloud.networkconnectivity.v1.DeleteHubRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHubMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center spokes associated with a
     * specified hub and location. The list includes both spokes that are attached
     * to the hub and spokes that have been proposed but not yet accepted.
     * </pre>
     */
    default void listHubSpokes(
        com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListHubSpokesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center spokes in a specified project and
     * location.
     * </pre>
     */
    default void listSpokes(
        com.google.cloud.networkconnectivity.v1.ListSpokesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListSpokesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSpokesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center spoke.
     * </pre>
     */
    default void getSpoke(
        com.google.cloud.networkconnectivity.v1.GetSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Spoke>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpokeMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a Network Connectivity Center spoke.
     * </pre>
     */
    default void createSpoke(
        com.google.cloud.networkconnectivity.v1.CreateSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateSpokeMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a Network Connectivity Center spoke.
     * </pre>
     */
    default void updateSpoke(
        com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateSpokeMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Rejects a Network Connectivity Center spoke from being attached to a hub.
     * If the spoke was previously in the `ACTIVE` state, it
     * transitions to the `INACTIVE` state and is no longer able to
     * connect to other spokes that are attached to the hub.
     * </pre>
     */
    default void rejectHubSpoke(
        com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getRejectHubSpokeMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Accepts a proposal to attach a Network Connectivity Center spoke
     * to a hub.
     * </pre>
     */
    default void acceptHubSpoke(
        com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getAcceptHubSpokeMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Network Connectivity Center spoke.
     * </pre>
     */
    default void deleteSpoke(
        com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteSpokeMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center route table.
     * </pre>
     */
    default void getRouteTable(
        com.google.cloud.networkconnectivity.v1.GetRouteTableRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.RouteTable>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetRouteTableMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details about the specified route.
     * </pre>
     */
    default void getRoute(
        com.google.cloud.networkconnectivity.v1.GetRouteRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Route>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRouteMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists routes in a given project.
     * </pre>
     */
    default void listRoutes(
        com.google.cloud.networkconnectivity.v1.ListRoutesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListRoutesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRoutesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists route tables in a given project.
     * </pre>
     */
    default void listRouteTables(
        com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListRouteTablesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center group.
     * </pre>
     */
    default void getGroup(
        com.google.cloud.networkconnectivity.v1.GetGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Group>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGroupMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists groups in a given hub.
     * </pre>
     */
    default void listGroups(
        com.google.cloud.networkconnectivity.v1.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListGroupsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGroupsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HubService.
   *
   * <pre>
   * Network Connectivity Center is a hub-and-spoke abstraction for network
   * connectivity management in Google Cloud. It reduces operational complexity
   * through a simple, centralized connectivity management model.
   * </pre>
   */
  public abstract static class HubServiceImplBase implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return HubServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HubService.
   *
   * <pre>
   * Network Connectivity Center is a hub-and-spoke abstraction for network
   * connectivity management in Google Cloud. It reduces operational complexity
   * through a simple, centralized connectivity management model.
   * </pre>
   */
  public static final class HubServiceStub extends io.grpc.stub.AbstractAsyncStub<HubServiceStub> {
    private HubServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HubServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HubServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center hubs associated with a given project.
     * </pre>
     */
    public void listHubs(
        com.google.cloud.networkconnectivity.v1.ListHubsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListHubsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHubsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center hub.
     * </pre>
     */
    public void getHub(
        com.google.cloud.networkconnectivity.v1.GetHubRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Hub> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHubMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Network Connectivity Center hub in the specified project.
     * </pre>
     */
    public void createHub(
        com.google.cloud.networkconnectivity.v1.CreateHubRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHubMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the description and/or labels of a Network Connectivity Center
     * hub.
     * </pre>
     */
    public void updateHub(
        com.google.cloud.networkconnectivity.v1.UpdateHubRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHubMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Network Connectivity Center hub.
     * </pre>
     */
    public void deleteHub(
        com.google.cloud.networkconnectivity.v1.DeleteHubRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHubMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center spokes associated with a
     * specified hub and location. The list includes both spokes that are attached
     * to the hub and spokes that have been proposed but not yet accepted.
     * </pre>
     */
    public void listHubSpokes(
        com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHubSpokesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center spokes in a specified project and
     * location.
     * </pre>
     */
    public void listSpokes(
        com.google.cloud.networkconnectivity.v1.ListSpokesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListSpokesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSpokesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center spoke.
     * </pre>
     */
    public void getSpoke(
        com.google.cloud.networkconnectivity.v1.GetSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Spoke>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpokeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a Network Connectivity Center spoke.
     * </pre>
     */
    public void createSpoke(
        com.google.cloud.networkconnectivity.v1.CreateSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSpokeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a Network Connectivity Center spoke.
     * </pre>
     */
    public void updateSpoke(
        com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSpokeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Rejects a Network Connectivity Center spoke from being attached to a hub.
     * If the spoke was previously in the `ACTIVE` state, it
     * transitions to the `INACTIVE` state and is no longer able to
     * connect to other spokes that are attached to the hub.
     * </pre>
     */
    public void rejectHubSpoke(
        com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRejectHubSpokeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Accepts a proposal to attach a Network Connectivity Center spoke
     * to a hub.
     * </pre>
     */
    public void acceptHubSpoke(
        com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcceptHubSpokeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Network Connectivity Center spoke.
     * </pre>
     */
    public void deleteSpoke(
        com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSpokeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center route table.
     * </pre>
     */
    public void getRouteTable(
        com.google.cloud.networkconnectivity.v1.GetRouteTableRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.RouteTable>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRouteTableMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details about the specified route.
     * </pre>
     */
    public void getRoute(
        com.google.cloud.networkconnectivity.v1.GetRouteRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Route>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists routes in a given project.
     * </pre>
     */
    public void listRoutes(
        com.google.cloud.networkconnectivity.v1.ListRoutesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListRoutesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists route tables in a given project.
     * </pre>
     */
    public void listRouteTables(
        com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRouteTablesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center group.
     * </pre>
     */
    public void getGroup(
        com.google.cloud.networkconnectivity.v1.GetGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Group>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists groups in a given hub.
     * </pre>
     */
    public void listGroups(
        com.google.cloud.networkconnectivity.v1.ListGroupsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.ListGroupsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HubService.
   *
   * <pre>
   * Network Connectivity Center is a hub-and-spoke abstraction for network
   * connectivity management in Google Cloud. It reduces operational complexity
   * through a simple, centralized connectivity management model.
   * </pre>
   */
  public static final class HubServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HubServiceBlockingStub> {
    private HubServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HubServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HubServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center hubs associated with a given project.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.ListHubsResponse listHubs(
        com.google.cloud.networkconnectivity.v1.ListHubsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHubsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center hub.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.Hub getHub(
        com.google.cloud.networkconnectivity.v1.GetHubRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHubMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Network Connectivity Center hub in the specified project.
     * </pre>
     */
    public com.google.longrunning.Operation createHub(
        com.google.cloud.networkconnectivity.v1.CreateHubRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHubMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the description and/or labels of a Network Connectivity Center
     * hub.
     * </pre>
     */
    public com.google.longrunning.Operation updateHub(
        com.google.cloud.networkconnectivity.v1.UpdateHubRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHubMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Network Connectivity Center hub.
     * </pre>
     */
    public com.google.longrunning.Operation deleteHub(
        com.google.cloud.networkconnectivity.v1.DeleteHubRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHubMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center spokes associated with a
     * specified hub and location. The list includes both spokes that are attached
     * to the hub and spokes that have been proposed but not yet accepted.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse listHubSpokes(
        com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHubSpokesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center spokes in a specified project and
     * location.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.ListSpokesResponse listSpokes(
        com.google.cloud.networkconnectivity.v1.ListSpokesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSpokesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center spoke.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.Spoke getSpoke(
        com.google.cloud.networkconnectivity.v1.GetSpokeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpokeMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a Network Connectivity Center spoke.
     * </pre>
     */
    public com.google.longrunning.Operation createSpoke(
        com.google.cloud.networkconnectivity.v1.CreateSpokeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSpokeMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a Network Connectivity Center spoke.
     * </pre>
     */
    public com.google.longrunning.Operation updateSpoke(
        com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSpokeMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Rejects a Network Connectivity Center spoke from being attached to a hub.
     * If the spoke was previously in the `ACTIVE` state, it
     * transitions to the `INACTIVE` state and is no longer able to
     * connect to other spokes that are attached to the hub.
     * </pre>
     */
    public com.google.longrunning.Operation rejectHubSpoke(
        com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRejectHubSpokeMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Accepts a proposal to attach a Network Connectivity Center spoke
     * to a hub.
     * </pre>
     */
    public com.google.longrunning.Operation acceptHubSpoke(
        com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcceptHubSpokeMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Network Connectivity Center spoke.
     * </pre>
     */
    public com.google.longrunning.Operation deleteSpoke(
        com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSpokeMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center route table.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.RouteTable getRouteTable(
        com.google.cloud.networkconnectivity.v1.GetRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRouteTableMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details about the specified route.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.Route getRoute(
        com.google.cloud.networkconnectivity.v1.GetRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRouteMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists routes in a given project.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.ListRoutesResponse listRoutes(
        com.google.cloud.networkconnectivity.v1.ListRoutesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRoutesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists route tables in a given project.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse listRouteTables(
        com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRouteTablesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center group.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.Group getGroup(
        com.google.cloud.networkconnectivity.v1.GetGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGroupMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists groups in a given hub.
     * </pre>
     */
    public com.google.cloud.networkconnectivity.v1.ListGroupsResponse listGroups(
        com.google.cloud.networkconnectivity.v1.ListGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HubService.
   *
   * <pre>
   * Network Connectivity Center is a hub-and-spoke abstraction for network
   * connectivity management in Google Cloud. It reduces operational complexity
   * through a simple, centralized connectivity management model.
   * </pre>
   */
  public static final class HubServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HubServiceFutureStub> {
    private HubServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HubServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HubServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center hubs associated with a given project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.ListHubsResponse>
        listHubs(com.google.cloud.networkconnectivity.v1.ListHubsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHubsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center hub.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.Hub>
        getHub(com.google.cloud.networkconnectivity.v1.GetHubRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHubMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Network Connectivity Center hub in the specified project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createHub(com.google.cloud.networkconnectivity.v1.CreateHubRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHubMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the description and/or labels of a Network Connectivity Center
     * hub.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        updateHub(com.google.cloud.networkconnectivity.v1.UpdateHubRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHubMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Network Connectivity Center hub.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteHub(com.google.cloud.networkconnectivity.v1.DeleteHubRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHubMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center spokes associated with a
     * specified hub and location. The list includes both spokes that are attached
     * to the hub and spokes that have been proposed but not yet accepted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse>
        listHubSpokes(com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHubSpokesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists the Network Connectivity Center spokes in a specified project and
     * location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.ListSpokesResponse>
        listSpokes(com.google.cloud.networkconnectivity.v1.ListSpokesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSpokesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center spoke.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.Spoke>
        getSpoke(com.google.cloud.networkconnectivity.v1.GetSpokeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpokeMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a Network Connectivity Center spoke.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createSpoke(com.google.cloud.networkconnectivity.v1.CreateSpokeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSpokeMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the parameters of a Network Connectivity Center spoke.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        updateSpoke(com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSpokeMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Rejects a Network Connectivity Center spoke from being attached to a hub.
     * If the spoke was previously in the `ACTIVE` state, it
     * transitions to the `INACTIVE` state and is no longer able to
     * connect to other spokes that are attached to the hub.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        rejectHubSpoke(com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRejectHubSpokeMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Accepts a proposal to attach a Network Connectivity Center spoke
     * to a hub.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        acceptHubSpoke(com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcceptHubSpokeMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a Network Connectivity Center spoke.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteSpoke(com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSpokeMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center route table.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.RouteTable>
        getRouteTable(com.google.cloud.networkconnectivity.v1.GetRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRouteTableMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details about the specified route.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.Route>
        getRoute(com.google.cloud.networkconnectivity.v1.GetRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRouteMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists routes in a given project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.ListRoutesResponse>
        listRoutes(com.google.cloud.networkconnectivity.v1.ListRoutesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists route tables in a given project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse>
        listRouteTables(com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRouteTablesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets details about a Network Connectivity Center group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.Group>
        getGroup(com.google.cloud.networkconnectivity.v1.GetGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists groups in a given hub.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.networkconnectivity.v1.ListGroupsResponse>
        listGroups(com.google.cloud.networkconnectivity.v1.ListGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_HUBS = 0;
  private static final int METHODID_GET_HUB = 1;
  private static final int METHODID_CREATE_HUB = 2;
  private static final int METHODID_UPDATE_HUB = 3;
  private static final int METHODID_DELETE_HUB = 4;
  private static final int METHODID_LIST_HUB_SPOKES = 5;
  private static final int METHODID_LIST_SPOKES = 6;
  private static final int METHODID_GET_SPOKE = 7;
  private static final int METHODID_CREATE_SPOKE = 8;
  private static final int METHODID_UPDATE_SPOKE = 9;
  private static final int METHODID_REJECT_HUB_SPOKE = 10;
  private static final int METHODID_ACCEPT_HUB_SPOKE = 11;
  private static final int METHODID_DELETE_SPOKE = 12;
  private static final int METHODID_GET_ROUTE_TABLE = 13;
  private static final int METHODID_GET_ROUTE = 14;
  private static final int METHODID_LIST_ROUTES = 15;
  private static final int METHODID_LIST_ROUTE_TABLES = 16;
  private static final int METHODID_GET_GROUP = 17;
  private static final int METHODID_LIST_GROUPS = 18;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_HUBS:
          serviceImpl.listHubs(
              (com.google.cloud.networkconnectivity.v1.ListHubsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.networkconnectivity.v1.ListHubsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_HUB:
          serviceImpl.getHub(
              (com.google.cloud.networkconnectivity.v1.GetHubRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Hub>)
                  responseObserver);
          break;
        case METHODID_CREATE_HUB:
          serviceImpl.createHub(
              (com.google.cloud.networkconnectivity.v1.CreateHubRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_HUB:
          serviceImpl.updateHub(
              (com.google.cloud.networkconnectivity.v1.UpdateHubRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_HUB:
          serviceImpl.deleteHub(
              (com.google.cloud.networkconnectivity.v1.DeleteHubRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_HUB_SPOKES:
          serviceImpl.listHubSpokes(
              (com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_SPOKES:
          serviceImpl.listSpokes(
              (com.google.cloud.networkconnectivity.v1.ListSpokesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.networkconnectivity.v1.ListSpokesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_SPOKE:
          serviceImpl.getSpoke(
              (com.google.cloud.networkconnectivity.v1.GetSpokeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Spoke>)
                  responseObserver);
          break;
        case METHODID_CREATE_SPOKE:
          serviceImpl.createSpoke(
              (com.google.cloud.networkconnectivity.v1.CreateSpokeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_SPOKE:
          serviceImpl.updateSpoke(
              (com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_REJECT_HUB_SPOKE:
          serviceImpl.rejectHubSpoke(
              (com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_ACCEPT_HUB_SPOKE:
          serviceImpl.acceptHubSpoke(
              (com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_SPOKE:
          serviceImpl.deleteSpoke(
              (com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_ROUTE_TABLE:
          serviceImpl.getRouteTable(
              (com.google.cloud.networkconnectivity.v1.GetRouteTableRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.RouteTable>)
                  responseObserver);
          break;
        case METHODID_GET_ROUTE:
          serviceImpl.getRoute(
              (com.google.cloud.networkconnectivity.v1.GetRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Route>)
                  responseObserver);
          break;
        case METHODID_LIST_ROUTES:
          serviceImpl.listRoutes(
              (com.google.cloud.networkconnectivity.v1.ListRoutesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.networkconnectivity.v1.ListRoutesResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_ROUTE_TABLES:
          serviceImpl.listRouteTables(
              (com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_GROUP:
          serviceImpl.getGroup(
              (com.google.cloud.networkconnectivity.v1.GetGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.networkconnectivity.v1.Group>)
                  responseObserver);
          break;
        case METHODID_LIST_GROUPS:
          serviceImpl.listGroups(
              (com.google.cloud.networkconnectivity.v1.ListGroupsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.networkconnectivity.v1.ListGroupsResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
            getListHubsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.ListHubsRequest,
                    com.google.cloud.networkconnectivity.v1.ListHubsResponse>(
                    service, METHODID_LIST_HUBS)))
        .addMethod(
            getGetHubMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.GetHubRequest,
                    com.google.cloud.networkconnectivity.v1.Hub>(service, METHODID_GET_HUB)))
        .addMethod(
            getCreateHubMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.CreateHubRequest,
                    com.google.longrunning.Operation>(service, METHODID_CREATE_HUB)))
        .addMethod(
            getUpdateHubMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.UpdateHubRequest,
                    com.google.longrunning.Operation>(service, METHODID_UPDATE_HUB)))
        .addMethod(
            getDeleteHubMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.DeleteHubRequest,
                    com.google.longrunning.Operation>(service, METHODID_DELETE_HUB)))
        .addMethod(
            getListHubSpokesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.ListHubSpokesRequest,
                    com.google.cloud.networkconnectivity.v1.ListHubSpokesResponse>(
                    service, METHODID_LIST_HUB_SPOKES)))
        .addMethod(
            getListSpokesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.ListSpokesRequest,
                    com.google.cloud.networkconnectivity.v1.ListSpokesResponse>(
                    service, METHODID_LIST_SPOKES)))
        .addMethod(
            getGetSpokeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.GetSpokeRequest,
                    com.google.cloud.networkconnectivity.v1.Spoke>(service, METHODID_GET_SPOKE)))
        .addMethod(
            getCreateSpokeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.CreateSpokeRequest,
                    com.google.longrunning.Operation>(service, METHODID_CREATE_SPOKE)))
        .addMethod(
            getUpdateSpokeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest,
                    com.google.longrunning.Operation>(service, METHODID_UPDATE_SPOKE)))
        .addMethod(
            getRejectHubSpokeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.RejectHubSpokeRequest,
                    com.google.longrunning.Operation>(service, METHODID_REJECT_HUB_SPOKE)))
        .addMethod(
            getAcceptHubSpokeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.AcceptHubSpokeRequest,
                    com.google.longrunning.Operation>(service, METHODID_ACCEPT_HUB_SPOKE)))
        .addMethod(
            getDeleteSpokeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest,
                    com.google.longrunning.Operation>(service, METHODID_DELETE_SPOKE)))
        .addMethod(
            getGetRouteTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.GetRouteTableRequest,
                    com.google.cloud.networkconnectivity.v1.RouteTable>(
                    service, METHODID_GET_ROUTE_TABLE)))
        .addMethod(
            getGetRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.GetRouteRequest,
                    com.google.cloud.networkconnectivity.v1.Route>(service, METHODID_GET_ROUTE)))
        .addMethod(
            getListRoutesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.ListRoutesRequest,
                    com.google.cloud.networkconnectivity.v1.ListRoutesResponse>(
                    service, METHODID_LIST_ROUTES)))
        .addMethod(
            getListRouteTablesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.ListRouteTablesRequest,
                    com.google.cloud.networkconnectivity.v1.ListRouteTablesResponse>(
                    service, METHODID_LIST_ROUTE_TABLES)))
        .addMethod(
            getGetGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.GetGroupRequest,
                    com.google.cloud.networkconnectivity.v1.Group>(service, METHODID_GET_GROUP)))
        .addMethod(
            getListGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.networkconnectivity.v1.ListGroupsRequest,
                    com.google.cloud.networkconnectivity.v1.ListGroupsResponse>(
                    service, METHODID_LIST_GROUPS)))
        .build();
  }

  private abstract static class HubServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HubServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.networkconnectivity.v1.HubProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HubService");
    }
  }

  private static final class HubServiceFileDescriptorSupplier
      extends HubServiceBaseDescriptorSupplier {
    HubServiceFileDescriptorSupplier() {}
  }

  private static final class HubServiceMethodDescriptorSupplier
      extends HubServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HubServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HubServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new HubServiceFileDescriptorSupplier())
                      .addMethod(getListHubsMethod())
                      .addMethod(getGetHubMethod())
                      .addMethod(getCreateHubMethod())
                      .addMethod(getUpdateHubMethod())
                      .addMethod(getDeleteHubMethod())
                      .addMethod(getListHubSpokesMethod())
                      .addMethod(getListSpokesMethod())
                      .addMethod(getGetSpokeMethod())
                      .addMethod(getCreateSpokeMethod())
                      .addMethod(getUpdateSpokeMethod())
                      .addMethod(getRejectHubSpokeMethod())
                      .addMethod(getAcceptHubSpokeMethod())
                      .addMethod(getDeleteSpokeMethod())
                      .addMethod(getGetRouteTableMethod())
                      .addMethod(getGetRouteMethod())
                      .addMethod(getListRoutesMethod())
                      .addMethod(getListRouteTablesMethod())
                      .addMethod(getGetGroupMethod())
                      .addMethod(getListGroupsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
