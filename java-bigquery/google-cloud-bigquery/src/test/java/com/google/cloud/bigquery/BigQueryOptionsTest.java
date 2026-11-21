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
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.api.gax.retrying.ResultRetryAlgorithm;
import com.google.cloud.NoCredentials;
import com.google.cloud.TransportOptions;
import com.google.cloud.bigquery.DataFormatOptions.TimestampFormatOptions;
import com.google.cloud.bigquery.QueryJobConfiguration.JobCreationMode;
import io.opentelemetry.api.trace.Tracer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Modifier;
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
  void testToBuilderPreservesAllBigQueryFields() {
    Tracer tracer = Mockito.mock(Tracer.class);
    ResultRetryAlgorithm<?> retryAlgorithm = Mockito.mock(ResultRetryAlgorithm.class);
    DataFormatOptions dataFormatOptions =
        DataFormatOptions.newBuilder()
            .useInt64Timestamp(true)
            .timestampFormatOptions(TimestampFormatOptions.ISO8601_STRING)
            .build();

    BigQueryOptions options =
        BigQueryOptions.newBuilder()
            .setProjectId("project-id")
            .setCredentials(NoCredentials.getInstance())
            .setLocation("EU")
            .setThrowNotFound(true)
            .setDefaultJobCreationMode(JobCreationMode.JOB_CREATION_OPTIONAL)
            .setDataFormatOptions(dataFormatOptions)
            .setEnableOpenTelemetryTracing(true)
            .setOpenTelemetryTracer(tracer)
            .setResultRetryAlgorithm(retryAlgorithm)
            .build();

    BigQueryOptions copy = options.toBuilder().build();

    assertEquals(options, copy);
    assertEquals(options.hashCode(), copy.hashCode());
    assertEquals("EU", copy.getLocation());
    assertTrue(copy.getThrowNotFound());
    assertEquals(JobCreationMode.JOB_CREATION_OPTIONAL, copy.getDefaultJobCreationMode());
    assertEquals(dataFormatOptions, copy.getDataFormatOptions());
    assertTrue(copy.getUseInt64Timestamps());
    assertTrue(copy.isOpenTelemetryTracingEnabled());
    assertSame(tracer, copy.getOpenTelemetryTracer());
    assertSame(retryAlgorithm, copy.getResultRetryAlgorithm());
  }

  @Test
  void testToBuilderPreservesPostBuildMutatedFields() {
    BigQueryOptions options =
        BigQueryOptions.newBuilder()
            .setProjectId("project-id")
            .setCredentials(NoCredentials.getInstance())
            .build();
    options.setThrowNotFound(true);
    options.setDefaultJobCreationMode(JobCreationMode.JOB_CREATION_REQUIRED);
    options.setUseInt64Timestamps(true);

    BigQueryOptions copy = options.toBuilder().build();

    assertEquals(options, copy);
    assertEquals(options.hashCode(), copy.hashCode());
    assertTrue(copy.getThrowNotFound());
    assertEquals(JobCreationMode.JOB_CREATION_REQUIRED, copy.getDefaultJobCreationMode());
    assertTrue(copy.getUseInt64Timestamps());
    assertTrue(copy.getDataFormatOptions().useInt64Timestamp());
  }

  @Test
  void testEqualsAndHashCodeIncludeAllBigQueryFields() {
    Tracer tracerA = Mockito.mock(Tracer.class);
    Tracer tracerB = Mockito.mock(Tracer.class);
    ResultRetryAlgorithm<?> retryAlgorithmA = Mockito.mock(ResultRetryAlgorithm.class);
    ResultRetryAlgorithm<?> retryAlgorithmB = Mockito.mock(ResultRetryAlgorithm.class);
    DataFormatOptions isoOptions =
        DataFormatOptions.newBuilder()
            .useInt64Timestamp(true)
            .timestampFormatOptions(TimestampFormatOptions.ISO8601_STRING)
            .build();

    BigQueryOptions base =
        BigQueryOptions.newBuilder()
            .setProjectId("project-id")
            .setCredentials(NoCredentials.getInstance())
            .setLocation("US")
            .setThrowNotFound(false)
            .setDefaultJobCreationMode(JobCreationMode.JOB_CREATION_MODE_UNSPECIFIED)
            .setEnableOpenTelemetryTracing(false)
            .setOpenTelemetryTracer(tracerA)
            .setResultRetryAlgorithm(retryAlgorithmA)
            .build();

    BigQueryOptions same = base.toBuilder().build();
    assertEquals(base, same);
    assertEquals(base.hashCode(), same.hashCode());

    assertNotEquals(base, base.toBuilder().setLocation("EU").build());
    assertNotEquals(base, base.toBuilder().setThrowNotFound(true).build());
    assertNotEquals(
        base,
        base.toBuilder().setDefaultJobCreationMode(JobCreationMode.JOB_CREATION_OPTIONAL).build());
    assertNotEquals(base, base.toBuilder().setDataFormatOptions(isoOptions).build());
    assertNotEquals(base, base.toBuilder().setEnableOpenTelemetryTracing(true).build());
    assertNotEquals(base, base.toBuilder().setOpenTelemetryTracer(tracerB).build());
    assertNotEquals(base, base.toBuilder().setResultRetryAlgorithm(retryAlgorithmB).build());

    BigQueryOptions defaultRetry =
        BigQueryOptions.newBuilder()
            .setProjectId("project-id")
            .setCredentials(NoCredentials.getInstance())
            .build();
    BigQueryOptions explicitDefaultRetry =
        defaultRetry.toBuilder()
            .setResultRetryAlgorithm(BigQueryBaseService.DEFAULT_BIGQUERY_EXCEPTION_HANDLER)
            .build();
    assertEquals(defaultRetry, explicitDefaultRetry);
    assertEquals(defaultRetry.hashCode(), explicitDefaultRetry.hashCode());
    assertSame(
        BigQueryBaseService.DEFAULT_BIGQUERY_EXCEPTION_HANDLER,
        explicitDefaultRetry.getResultRetryAlgorithm());
  }

  @Test
  void testMutablePostBuildFieldsAreVolatile() throws NoSuchFieldException {
    assertTrue(
        Modifier.isVolatile(
            BigQueryOptions.class.getDeclaredField("setThrowNotFound").getModifiers()));
    assertTrue(
        Modifier.isVolatile(
            BigQueryOptions.class.getDeclaredField("useInt64Timestamps").getModifiers()));
    assertTrue(
        Modifier.isVolatile(
            BigQueryOptions.class.getDeclaredField("dataFormatOptions").getModifiers()));
    assertTrue(
        Modifier.isVolatile(
            BigQueryOptions.class.getDeclaredField("defaultJobCreationMode").getModifiers()));
  }

  @Test
  void testSerializationPreservesBigQueryFields() throws Exception {
    DataFormatOptions dataFormatOptions =
        DataFormatOptions.newBuilder()
            .useInt64Timestamp(true)
            .timestampFormatOptions(TimestampFormatOptions.INT64)
            .build();
    BigQueryOptions options =
        BigQueryOptions.newBuilder()
            .setProjectId("project-id")
            .setCredentials(NoCredentials.getInstance())
            .setLocation("EU")
            .setThrowNotFound(true)
            .setDefaultJobCreationMode(JobCreationMode.JOB_CREATION_OPTIONAL)
            .setDataFormatOptions(dataFormatOptions)
            .setEnableOpenTelemetryTracing(true)
            .build();

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    try (ObjectOutputStream oos = new ObjectOutputStream(out)) {
      oos.writeObject(options);
    }
    BigQueryOptions deserialized;
    try (ObjectInputStream ois =
        new ObjectInputStream(new ByteArrayInputStream(out.toByteArray()))) {
      deserialized = (BigQueryOptions) ois.readObject();
    }

    assertEquals(options, deserialized);
    assertEquals(options.hashCode(), deserialized.hashCode());
    assertSame(
        BigQueryBaseService.DEFAULT_BIGQUERY_EXCEPTION_HANDLER,
        deserialized.getResultRetryAlgorithm());
  }

  @Test
  void testToBuilderSetUseInt64TimestampsOverridesCopiedDataFormatOptions() {
    BigQueryOptions base =
        BigQueryOptions.newBuilder()
            .setProjectId("project-id")
            .setCredentials(NoCredentials.getInstance())
            .setDataFormatOptions(
                DataFormatOptions.newBuilder()
                    .useInt64Timestamp(false)
                    .timestampFormatOptions(TimestampFormatOptions.ISO8601_STRING)
                    .build())
            .build();

    BigQueryOptions enabled = base.toBuilder().setUseInt64Timestamps(true).build();
    assertTrue(enabled.getUseInt64Timestamps());
    assertTrue(enabled.getDataFormatOptions().useInt64Timestamp());
    assertEquals(
        TimestampFormatOptions.ISO8601_STRING,
        enabled.getDataFormatOptions().timestampFormatOptions());

    BigQueryOptions disabled = enabled.toBuilder().setUseInt64Timestamps(false).build();
    assertFalse(disabled.getUseInt64Timestamps());
    assertFalse(disabled.getDataFormatOptions().useInt64Timestamp());

    BigQueryOptions explicitDataFormatPrecedence =
        base.toBuilder()
            .setDataFormatOptions(DataFormatOptions.newBuilder().useInt64Timestamp(true).build())
            .setUseInt64Timestamps(false)
            .build();
    assertTrue(explicitDataFormatPrecedence.getUseInt64Timestamps());
    assertTrue(explicitDataFormatPrecedence.getDataFormatOptions().useInt64Timestamp());
  }
}
