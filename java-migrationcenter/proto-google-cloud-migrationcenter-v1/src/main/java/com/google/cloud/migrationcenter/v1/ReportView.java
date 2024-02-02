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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.migrationcenter.v1;

/**
 *
 *
 * <pre>
 * Specifies the types of views that provide complete or partial details
 * of a Report.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.migrationcenter.v1.ReportView}
 */
public enum ReportView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The report view is not specified. The API displays the basic view by
   * default.
   * </pre>
   *
   * <code>REPORT_VIEW_UNSPECIFIED = 0;</code>
   */
  REPORT_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The report view includes only basic metadata of the Report. Useful for
   * list views.
   * </pre>
   *
   * <code>REPORT_VIEW_BASIC = 1;</code>
   */
  REPORT_VIEW_BASIC(1),
  /**
   *
   *
   * <pre>
   * The report view includes all the metadata of the Report. Useful for
   * preview.
   * </pre>
   *
   * <code>REPORT_VIEW_FULL = 2;</code>
   */
  REPORT_VIEW_FULL(2),
  /**
   *
   *
   * <pre>
   * The report view includes the standard metadata of an report. Useful for
   * detail view.
   * </pre>
   *
   * <code>REPORT_VIEW_STANDARD = 3;</code>
   */
  REPORT_VIEW_STANDARD(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The report view is not specified. The API displays the basic view by
   * default.
   * </pre>
   *
   * <code>REPORT_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int REPORT_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The report view includes only basic metadata of the Report. Useful for
   * list views.
   * </pre>
   *
   * <code>REPORT_VIEW_BASIC = 1;</code>
   */
  public static final int REPORT_VIEW_BASIC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The report view includes all the metadata of the Report. Useful for
   * preview.
   * </pre>
   *
   * <code>REPORT_VIEW_FULL = 2;</code>
   */
  public static final int REPORT_VIEW_FULL_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The report view includes the standard metadata of an report. Useful for
   * detail view.
   * </pre>
   *
   * <code>REPORT_VIEW_STANDARD = 3;</code>
   */
  public static final int REPORT_VIEW_STANDARD_VALUE = 3;

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
  public static ReportView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ReportView forNumber(int value) {
    switch (value) {
      case 0:
        return REPORT_VIEW_UNSPECIFIED;
      case 1:
        return REPORT_VIEW_BASIC;
      case 2:
        return REPORT_VIEW_FULL;
      case 3:
        return REPORT_VIEW_STANDARD;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReportView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ReportView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ReportView>() {
        public ReportView findValueByNumber(int number) {
          return ReportView.forNumber(number);
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
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto.getDescriptor()
        .getEnumTypes()
        .get(10);
  }

  private static final ReportView[] VALUES = values();

  public static ReportView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ReportView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.migrationcenter.v1.ReportView)
}
