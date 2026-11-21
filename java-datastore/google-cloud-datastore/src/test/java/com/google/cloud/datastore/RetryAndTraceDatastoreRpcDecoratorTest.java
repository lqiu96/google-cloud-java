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

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

import com.google.api.gax.retrying.RetrySettings;
import com.google.cloud.NoCredentials;
import com.google.cloud.datastore.spi.v1.DatastoreRpc;
import com.google.cloud.datastore.telemetry.TraceUtil;
import com.google.datastore.v1.ReadOptions;
import com.google.datastore.v1.RunAggregationQueryRequest;
import com.google.datastore.v1.RunAggregationQueryResponse;
import com.google.datastore.v1.TransactionOptions;
import com.google.protobuf.ByteString;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.Duration;

public class RetryAndTraceDatastoreRpcDecoratorTest {

  private DatastoreRpc rpcMock;
  private RetryAndTraceDatastoreRpcDecorator decorator;

  @Before
  public void setUp() {
    rpcMock = EasyMock.createStrictMock(DatastoreRpc.class);
    RetrySettings retrySettings =
        RetrySettings.newBuilder()
            .setMaxAttempts(3)
            .setInitialRetryDelay(Duration.ofMillis(1))
            .setMaxRetryDelay(Duration.ofMillis(1))
            .setRetryDelayMultiplier(1.0)
            .setTotalTimeout(Duration.ofSeconds(10))
            .build();
    DatastoreOptions options =
        DatastoreOptions.newBuilder()
            .setProjectId("test-project")
            .setCredentials(NoCredentials.getInstance())
            .setHost("http://localhost:8080")
            .setRetrySettings(retrySettings)
            .build();
    decorator =
        RetryAndTraceDatastoreRpcDecorator.newBuilder()
            .setDatastoreRpc(rpcMock)
            .setTraceUtil(TraceUtil.getInstance(options))
            .setRetrySettings(retrySettings)
            .setDatastoreOptions(options)
            .build();
  }

  @Test
  public void runAggregationQuery_transactionalDoesNotRetryAborted() {
    RunAggregationQueryRequest request =
        RunAggregationQueryRequest.newBuilder()
            .setReadOptions(
                ReadOptions.newBuilder().setTransaction(ByteString.copyFromUtf8("txn-1")).build())
            .build();
    EasyMock.expect(rpcMock.runAggregationQuery(request))
        .andThrow(new DatastoreException(10, "ABORTED", "ABORTED", null))
        .once();
    EasyMock.replay(rpcMock);

    DatastoreException ex =
        assertThrows(DatastoreException.class, () -> decorator.runAggregationQuery(request));

    EasyMock.verify(rpcMock);
    assertThat(ex.getCode()).isEqualTo(10);
    assertThat(ex.getReason()).isEqualTo("ABORTED");
  }

  @Test
  public void runAggregationQuery_newTransactionDoesNotRetryAborted() {
    RunAggregationQueryRequest request =
        RunAggregationQueryRequest.newBuilder()
            .setReadOptions(
                ReadOptions.newBuilder()
                    .setNewTransaction(TransactionOptions.getDefaultInstance())
                    .build())
            .build();
    EasyMock.expect(rpcMock.runAggregationQuery(request))
        .andThrow(new DatastoreException(10, "ABORTED", "ABORTED", null))
        .once();
    EasyMock.replay(rpcMock);

    DatastoreException ex =
        assertThrows(DatastoreException.class, () -> decorator.runAggregationQuery(request));

    EasyMock.verify(rpcMock);
    assertThat(ex.getCode()).isEqualTo(10);
    assertThat(ex.getReason()).isEqualTo("ABORTED");
  }

  @Test
  public void runAggregationQuery_transactionalStillRetriesUnavailable() {
    RunAggregationQueryRequest request =
        RunAggregationQueryRequest.newBuilder()
            .setReadOptions(
                ReadOptions.newBuilder().setTransaction(ByteString.copyFromUtf8("txn-1")).build())
            .build();
    RunAggregationQueryResponse expected = RunAggregationQueryResponse.getDefaultInstance();
    EasyMock.expect(rpcMock.runAggregationQuery(request))
        .andThrow(new DatastoreException(14, "UNAVAILABLE", "UNAVAILABLE", null))
        .andReturn(expected);
    EasyMock.replay(rpcMock);

    RunAggregationQueryResponse actual = decorator.runAggregationQuery(request);

    EasyMock.verify(rpcMock);
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  public void runAggregationQuery_nonTransactionalRetriesAborted() {
    RunAggregationQueryRequest request = RunAggregationQueryRequest.getDefaultInstance();
    RunAggregationQueryResponse expected = RunAggregationQueryResponse.getDefaultInstance();
    EasyMock.expect(rpcMock.runAggregationQuery(request))
        .andThrow(new DatastoreException(10, "ABORTED", "ABORTED", null))
        .andReturn(expected);
    EasyMock.replay(rpcMock);

    RunAggregationQueryResponse actual = decorator.runAggregationQuery(request);

    EasyMock.verify(rpcMock);
    assertThat(actual).isEqualTo(expected);
  }
}
