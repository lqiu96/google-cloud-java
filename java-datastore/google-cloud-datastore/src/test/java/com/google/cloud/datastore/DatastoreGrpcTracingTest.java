/*
 * Copyright 2026 Google LLC
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

package com.google.cloud.datastore;

import static com.google.cloud.datastore.telemetry.TraceUtil.SPAN_NAME_BEGIN_TRANSACTION;
import static com.google.cloud.datastore.telemetry.TraceUtil.SPAN_NAME_LOOKUP;
import static com.google.cloud.datastore.telemetry.TraceUtil.SPAN_NAME_TRANSACTION_COMMIT;
import static com.google.cloud.datastore.telemetry.TraceUtil.SPAN_NAME_TRANSACTION_LOOKUP;
import static com.google.cloud.datastore.telemetry.TraceUtil.SPAN_NAME_TRANSACTION_RUN;
import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.api.core.ApiFunction;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.rpc.FixedTransportChannelProvider;
import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.datastore.telemetry.TraceUtil;
import com.google.cloud.datastore.v1.MockDatastore;
import com.google.cloud.grpc.GrpcTransportOptions;
import com.google.datastore.v1.BeginTransactionResponse;
import com.google.datastore.v1.CommitResponse;
import com.google.datastore.v1.LookupResponse;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.testing.exporter.InMemorySpanExporter;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;
import io.opentelemetry.sdk.trace.samplers.Sampler;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DatastoreGrpcTracingTest {

  private static final String PROJECT_ID = "test-project";
  private static final String GRPC_SERVICE = "google.datastore.v1.Datastore/";

  private static String serverName;
  private static MockDatastore mockDatastore;
  private static Server inProcessServer;

  private InMemorySpanExporter inMemorySpanExporter;
  private OpenTelemetrySdk openTelemetrySdk;
  private ManagedChannel channel;
  private Datastore datastore;
  private Key key1;

  @BeforeClass
  public static void startServer() throws IOException {
    serverName = InProcessServerBuilder.generateName();
    mockDatastore = new MockDatastore();
    inProcessServer =
        InProcessServerBuilder.forName(serverName)
            .directExecutor()
            .addService(mockDatastore.getServiceDefinition())
            .build()
            .start();
  }

  @AfterClass
  public static void stopServer() throws InterruptedException {
    if (inProcessServer != null) {
      inProcessServer.shutdownNow();
      inProcessServer.awaitTermination(5, TimeUnit.SECONDS);
    }
  }

  @Before
  public void setUp() {
    mockDatastore.reset();
    inMemorySpanExporter = InMemorySpanExporter.create();
    openTelemetrySdk =
        OpenTelemetrySdk.builder()
            .setTracerProvider(
                SdkTracerProvider.builder()
                    .addSpanProcessor(SimpleSpanProcessor.create(inMemorySpanExporter))
                    .setSampler(Sampler.alwaysOn())
                    .build())
            .build();

    GoogleCredentials credentials = GoogleCredentials.create(new AccessToken("test-token", null));
    DatastoreOpenTelemetryOptions otelOptions =
        DatastoreOpenTelemetryOptions.newBuilder()
            .setTracingEnabled(true)
            .setOpenTelemetry(openTelemetrySdk)
            .build();

    DatastoreOptions baseOptions =
        DatastoreOptions.newBuilder()
            .setProjectId(PROJECT_ID)
            .setCredentials(credentials)
            .setTransportOptions(GrpcTransportOptions.newBuilder().build())
            .setOpenTelemetryOptions(otelOptions)
            .build();

    ApiFunction<ManagedChannelBuilder, ManagedChannelBuilder> channelConfigurator =
        TraceUtil.getInstance(baseOptions).getChannelConfigurator();
    assertNotNull(channelConfigurator);

    // Apply Datastore's real gRPC channel configurator onto an in-process channel so GrpcTelemetry
    // runs end-to-end without network access.
    channel =
        channelConfigurator
            .apply(InProcessChannelBuilder.forName(serverName).directExecutor())
            .build();

    DatastoreOptions options =
        baseOptions.toBuilder()
            .setChannelProvider(
                FixedTransportChannelProvider.create(GrpcTransportChannel.create(channel)))
            .build();
    datastore = options.getService();
    key1 = Key.newBuilder(PROJECT_ID, "kind1", "key1").build();
  }

  @After
  public void tearDown() throws Exception {
    if (datastore != null) {
      datastore.close();
    }
    if (channel != null) {
      channel.shutdownNow();
      channel.awaitTermination(5, TimeUnit.SECONDS);
    }
    if (openTelemetrySdk != null) {
      openTelemetrySdk.getSdkTracerProvider().shutdown().join(5, TimeUnit.SECONDS);
    }
    if (inMemorySpanExporter != null) {
      inMemorySpanExporter.reset();
    }
  }

  @Test
  public void lookupWithCallerRootSpan_linksCallerDatastoreAndGrpcSpans() {
    mockDatastore.addResponse(LookupResponse.getDefaultInstance());

    String rootSpanName = "caller-root-grpc-lookup";
    Tracer tracer = openTelemetrySdk.getTracer("caller-app");
    Span rootSpan = tracer.spanBuilder(rootSpanName).startSpan();
    try (Scope ignored = rootSpan.makeCurrent()) {
      assertNull(datastore.get(key1));
    } finally {
      rootSpan.end();
    }

    openTelemetrySdk.getSdkTracerProvider().forceFlush().join(5, TimeUnit.SECONDS);
    Map<String, SpanData> spansByName = indexByName(inMemorySpanExporter.getFinishedSpanItems());
    assertEquals(3, spansByName.size());

    SpanData callerSpan = spansByName.get(rootSpanName);
    SpanData lookupSpan = spansByName.get(SPAN_NAME_LOOKUP);
    SpanData grpcLookupSpan = spansByName.get(GRPC_SERVICE + "Lookup");
    assertNotNull(callerSpan);
    assertNotNull(lookupSpan);
    assertNotNull(grpcLookupSpan);

    String expectedTraceId = rootSpan.getSpanContext().getTraceId();
    assertThat(lookupSpan.getTraceId()).isEqualTo(expectedTraceId);
    assertThat(lookupSpan.getParentSpanId()).isEqualTo(callerSpan.getSpanId());
    assertThat(grpcLookupSpan.getTraceId()).isEqualTo(expectedTraceId);
    assertThat(grpcLookupSpan.getParentSpanId()).isEqualTo(lookupSpan.getSpanId());
  }

  @Test
  public void runInTransactionWithCallerRootSpan_linksCallerTransactionAndGrpcSpans() {
    mockDatastore.addResponse(
        BeginTransactionResponse.newBuilder()
            .setTransaction(ByteString.copyFromUtf8(UUID.randomUUID().toString()))
            .build());
    mockDatastore.addResponse(LookupResponse.getDefaultInstance());
    mockDatastore.addResponse(CommitResponse.getDefaultInstance());

    String rootSpanName = "caller-root-grpc-transaction";
    Tracer tracer = openTelemetrySdk.getTracer("caller-app");
    Span rootSpan = tracer.spanBuilder(rootSpanName).startSpan();
    try (Scope ignored = rootSpan.makeCurrent()) {
      assertNull(datastore.runInTransaction(transaction -> transaction.get(key1)));
    } finally {
      rootSpan.end();
    }

    openTelemetrySdk.getSdkTracerProvider().forceFlush().join(5, TimeUnit.SECONDS);
    Map<String, SpanData> spansByName = indexByName(inMemorySpanExporter.getFinishedSpanItems());
    assertEquals(8, spansByName.size());

    SpanData callerSpan = spansByName.get(rootSpanName);
    SpanData txRunSpan = spansByName.get(SPAN_NAME_TRANSACTION_RUN);
    SpanData txBeginSpan = spansByName.get(SPAN_NAME_BEGIN_TRANSACTION);
    SpanData grpcBeginSpan = spansByName.get(GRPC_SERVICE + "BeginTransaction");
    SpanData txLookupSpan = spansByName.get(SPAN_NAME_TRANSACTION_LOOKUP);
    SpanData grpcLookupSpan = spansByName.get(GRPC_SERVICE + "Lookup");
    SpanData txCommitSpan = spansByName.get(SPAN_NAME_TRANSACTION_COMMIT);
    SpanData grpcCommitSpan = spansByName.get(GRPC_SERVICE + "Commit");

    String expectedTraceId = rootSpan.getSpanContext().getTraceId();
    assertChildOf(txRunSpan, callerSpan, expectedTraceId);
    assertChildOf(txBeginSpan, txRunSpan, expectedTraceId);
    assertChildOf(grpcBeginSpan, txBeginSpan, expectedTraceId);
    assertChildOf(txLookupSpan, txRunSpan, expectedTraceId);
    assertChildOf(grpcLookupSpan, txLookupSpan, expectedTraceId);
    assertChildOf(txCommitSpan, txRunSpan, expectedTraceId);
    assertChildOf(grpcCommitSpan, txCommitSpan, expectedTraceId);
  }

  private static Map<String, SpanData> indexByName(List<SpanData> spans) {
    Map<String, SpanData> byName = new HashMap<>();
    for (SpanData span : spans) {
      byName.put(span.getName(), span);
    }
    return byName;
  }

  private static void assertChildOf(SpanData child, SpanData parent, String expectedTraceId) {
    assertNotNull(parent);
    assertNotNull(child);
    assertThat(child.getTraceId()).isEqualTo(expectedTraceId);
    assertThat(child.getParentSpanId()).isEqualTo(parent.getSpanId());
  }
}
