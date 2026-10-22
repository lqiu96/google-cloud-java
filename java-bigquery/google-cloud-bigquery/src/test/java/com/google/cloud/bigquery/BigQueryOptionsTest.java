/*
 * Copyright 2017 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.api.gax.retrying.RetrySettings;
import com.google.cloud.TransportOptions;
import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BigQueryOptionsTest {

  @Test
  void testInvalidTransport() {
    IllegalArgumentException expected =
        assertThrows(
            IllegalArgumentException.class,
            () ->
                BigQueryOptions.newBuilder()
                    .setTransportOptions(Mockito.mock(TransportOptions.class)));
    assertNotNull(expected.getMessage());
  }

  @Test
  void dataFormatOptions_createdByDefault() {
    BigQueryOptions options = BigQueryOptions.newBuilder().setProjectId("project-id").build();

    assertNotNull(options.getDataFormatOptions());
    assertFalse(options.getDataFormatOptions().useInt64Timestamp());
    assertEquals(
        DataFormatOptions.TimestampFormatOptions.TIMESTAMP_OUTPUT_FORMAT_UNSPECIFIED,
        options.getDataFormatOptions().timestampFormatOptions());
  }

  @Test
  void nonBuilderSetUseInt64Timestamp_capturedInDataFormatOptions() {
    BigQueryOptions options =
        BigQueryOptions.newBuilder()
            .setDataFormatOptions(DataFormatOptions.newBuilder().useInt64Timestamp(false).build())
            .setProjectId("project-id")
            .build();
    options.setUseInt64Timestamps(true);

    assertTrue(options.getDataFormatOptions().useInt64Timestamp());
  }

  @Test
  void nonBuilderSetUseInt64Timestamp_overridesEverything() {
    BigQueryOptions options = BigQueryOptions.newBuilder().setProjectId("project-id").build();
    options.setUseInt64Timestamps(true);

    assertTrue(options.getDataFormatOptions().useInt64Timestamp());
  }

  @Test
  void noDataFormatOptions_capturesUseInt64TimestampSetInBuilder() {
    BigQueryOptions options =
        BigQueryOptions.newBuilder().setUseInt64Timestamps(true).setProjectId("project-id").build();

    assertTrue(options.getDataFormatOptions().useInt64Timestamp());
  }

  @Test
  void dataFormatOptionsSetterHasPrecedence() {
    BigQueryOptions options =
        BigQueryOptions.newBuilder()
            .setProjectId("project-id")
            .setDataFormatOptions(DataFormatOptions.newBuilder().useInt64Timestamp(true).build())
            .setUseInt64Timestamps(false)
            .build();

    assertTrue(options.getDataFormatOptions().useInt64Timestamp());
  }

  @Test
  void testUseJwtAccessWithScope_defaultsToFalse() {
    BigQueryOptions options = BigQueryOptions.newBuilder().setProjectId("project-id").build();

    assertFalse(options.getUseJwtAccessWithScope());
  }

  @Test
  void testGetDefaultRetrySettings() {
    RetrySettings retrySettings = BigQueryOptions.getDefaultRetrySettings();
    assertEquals(6, retrySettings.getMaxAttempts());
    assertEquals(Duration.ofMillis(1000L), retrySettings.getInitialRetryDelayDuration());
    assertEquals(Duration.ofMillis(32_000L), retrySettings.getMaxRetryDelayDuration());
    assertEquals(2.0, retrySettings.getRetryDelayMultiplier());
    assertEquals(Duration.ofMinutes(5), retrySettings.getTotalTimeoutDuration());
    assertEquals(Duration.ofMillis(60_000L), retrySettings.getInitialRpcTimeoutDuration());
    assertEquals(1.0, retrySettings.getRpcTimeoutMultiplier());
    assertEquals(Duration.ofMillis(60_000L), retrySettings.getMaxRpcTimeoutDuration());
  }

  @Test
  void testDefaultInstance_usesBigQueryDefaultRetrySettings() {
    BigQueryOptions options = BigQueryOptions.newBuilder().setProjectId("project-id").build();
    assertEquals(BigQueryOptions.getDefaultRetrySettings(), options.getRetrySettings());
  }

  @Test
  void testBuilderSetRetrySettingsNull_fallsBackToDefault() {
    BigQueryOptions options =
        BigQueryOptions.newBuilder().setProjectId("project-id").setRetrySettings(null).build();
    assertEquals(BigQueryOptions.getDefaultRetrySettings(), options.getRetrySettings());
  }

  @Test
  void testBuilderSetRetrySettingsCustom_preservesCustomSettings() {
    RetrySettings customRetrySettings =
        RetrySettings.newBuilder()
            .setMaxAttempts(10)
            .setTotalTimeoutDuration(Duration.ofMinutes(10))
            .build();
    BigQueryOptions options =
        BigQueryOptions.newBuilder()
            .setProjectId("project-id")
            .setRetrySettings(customRetrySettings)
            .build();
    assertEquals(customRetrySettings, options.getRetrySettings());
  }

  @Test
  void testToBuilder_preservesRetrySettingsAndTransportOptions() {
    RetrySettings customRetrySettings =
        RetrySettings.newBuilder()
            .setMaxAttempts(8)
            .setTotalTimeoutDuration(Duration.ofMinutes(8))
            .build();
    com.google.cloud.http.HttpTransportOptions customTransport =
        com.google.cloud.http.HttpTransportOptions.newBuilder()
            .setConnectTimeout(45_000)
            .setReadTimeout(120_000)
            .build();

    BigQueryOptions options =
        BigQueryOptions.newBuilder()
            .setProjectId("project-id")
            .setRetrySettings(customRetrySettings)
            .setTransportOptions(customTransport)
            .build();

    BigQueryOptions reconstructed = options.toBuilder().build();
    assertEquals(customRetrySettings, reconstructed.getRetrySettings());
    assertEquals(customTransport, reconstructed.getTransportOptions());

    BigQueryOptions defaultOptions =
        BigQueryOptions.newBuilder().setProjectId("project-id").build();
    BigQueryOptions reconstructedDefault = defaultOptions.toBuilder().build();
    assertEquals(BigQueryOptions.getDefaultRetrySettings(), reconstructedDefault.getRetrySettings());
  }
}
