/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/gkehub/v1/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1;

/**
 *
 *
 * <pre>
 * Enum representing the state of an ACM's deployment on a cluster
 * </pre>
 *
 * Protobuf enum {@code google.cloud.gkehub.configmanagement.v1.DeploymentState}
 */
public enum DeploymentState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Deployment's state cannot be determined
   * </pre>
   *
   * <code>DEPLOYMENT_STATE_UNSPECIFIED = 0;</code>
   */
  DEPLOYMENT_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Deployment is not installed
   * </pre>
   *
   * <code>NOT_INSTALLED = 1;</code>
   */
  NOT_INSTALLED(1),
  /**
   *
   *
   * <pre>
   * Deployment is installed
   * </pre>
   *
   * <code>INSTALLED = 2;</code>
   */
  INSTALLED(2),
  /**
   *
   *
   * <pre>
   * Deployment was attempted to be installed, but has errors
   * </pre>
   *
   * <code>ERROR = 3;</code>
   */
  ERROR(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Deployment's state cannot be determined
   * </pre>
   *
   * <code>DEPLOYMENT_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int DEPLOYMENT_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Deployment is not installed
   * </pre>
   *
   * <code>NOT_INSTALLED = 1;</code>
   */
  public static final int NOT_INSTALLED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Deployment is installed
   * </pre>
   *
   * <code>INSTALLED = 2;</code>
   */
  public static final int INSTALLED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Deployment was attempted to be installed, but has errors
   * </pre>
   *
   * <code>ERROR = 3;</code>
   */
  public static final int ERROR_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DeploymentState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DeploymentState forNumber(int value) {
    switch (value) {
      case 0:
        return DEPLOYMENT_STATE_UNSPECIFIED;
      case 1:
        return NOT_INSTALLED;
      case 2:
        return INSTALLED;
      case 3:
        return ERROR;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeploymentState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DeploymentState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<DeploymentState>() {
        public DeploymentState findValueByNumber(int number) {
          return DeploymentState.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final DeploymentState[] VALUES = values();

  public static DeploymentState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DeploymentState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.gkehub.configmanagement.v1.DeploymentState)
}
