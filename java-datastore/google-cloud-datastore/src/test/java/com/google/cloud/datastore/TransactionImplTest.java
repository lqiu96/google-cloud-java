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

import static com.google.cloud.datastore.aggregation.Aggregation.count;
import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

import com.google.cloud.NoCredentials;
import com.google.cloud.ServiceOptions;
import com.google.cloud.datastore.models.ExplainOptions;
import com.google.cloud.datastore.spi.DatastoreRpcFactory;
import com.google.cloud.datastore.spi.v1.DatastoreRpc;
import com.google.datastore.v1.AggregationResultBatch;
import com.google.datastore.v1.BeginTransactionRequest;
import com.google.datastore.v1.BeginTransactionResponse;
import com.google.datastore.v1.CommitRequest;
import com.google.datastore.v1.CommitResponse;
import com.google.datastore.v1.RollbackRequest;
import com.google.datastore.v1.RollbackResponse;
import com.google.datastore.v1.RunAggregationQueryRequest;
import com.google.datastore.v1.RunAggregationQueryResponse;
import com.google.protobuf.ByteString;
import org.easymock.Capture;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class TransactionImplTest {

  private static final String PROJECT_ID = "test-project";
  private static final ByteString TXN_ID = ByteString.copyFromUtf8("txn-id");
  private static final AggregationQuery AGGREGATION_QUERY =
      Query.newAggregationQueryBuilder()
          .addAggregation(count().as("total"))
          .over(Query.newEntityQueryBuilder().setKind("Task").build())
          .build();

  private DatastoreRpcFactory rpcFactoryMock;
  private DatastoreRpc rpcMock;
  private Datastore datastore;

  @Before
  public void setUp() {
    rpcFactoryMock = EasyMock.createStrictMock(DatastoreRpcFactory.class);
    rpcMock = EasyMock.createStrictMock(DatastoreRpc.class);
    DatastoreOptions options =
        DatastoreOptions.newBuilder()
            .setProjectId(PROJECT_ID)
            .setCredentials(NoCredentials.getInstance())
            .setHost("http://localhost:8080")
            .setRetrySettings(ServiceOptions.getNoRetrySettings())
            .setServiceRpcFactory(rpcFactoryMock)
            .build();
    EasyMock.expect(rpcFactoryMock.create(options)).andReturn(rpcMock);
    EasyMock.replay(rpcFactoryMock);
    datastore = options.getService();
    EasyMock.verify(rpcFactoryMock);
  }

  @Test
  public void runAggregation_throwsWhenTransactionCommitted() {
    EasyMock.expect(rpcMock.beginTransaction(EasyMock.anyObject(BeginTransactionRequest.class)))
        .andReturn(BeginTransactionResponse.newBuilder().setTransaction(TXN_ID).build());
    EasyMock.expect(rpcMock.commit(EasyMock.anyObject(CommitRequest.class)))
        .andReturn(CommitResponse.getDefaultInstance());
    EasyMock.replay(rpcMock);

    Transaction transaction = datastore.newTransaction();
    transaction.commit();

    DatastoreException ex =
        assertThrows(DatastoreException.class, () -> transaction.runAggregation(AGGREGATION_QUERY));
    assertThat(ex.getReason()).isEqualTo("FAILED_PRECONDITION");
    assertThat(ex.getMessage()).contains("transaction is no longer active");

    ExplainOptions explainOptions = ExplainOptions.newBuilder().build();
    DatastoreException explainEx =
        assertThrows(
            DatastoreException.class,
            () -> transaction.runAggregation(AGGREGATION_QUERY, explainOptions));
    assertThat(explainEx.getReason()).isEqualTo("FAILED_PRECONDITION");
    assertThat(explainEx.getMessage()).contains("transaction is no longer active");
    EasyMock.verify(rpcMock);
  }

  @Test
  public void runAggregation_throwsWhenTransactionRolledBack() {
    EasyMock.expect(rpcMock.beginTransaction(EasyMock.anyObject(BeginTransactionRequest.class)))
        .andReturn(BeginTransactionResponse.newBuilder().setTransaction(TXN_ID).build());
    EasyMock.expect(rpcMock.rollback(EasyMock.anyObject(RollbackRequest.class)))
        .andReturn(RollbackResponse.getDefaultInstance());
    EasyMock.replay(rpcMock);

    Transaction transaction = datastore.newTransaction();
    transaction.rollback();

    DatastoreException ex =
        assertThrows(DatastoreException.class, () -> transaction.runAggregation(AGGREGATION_QUERY));
    assertThat(ex.getReason()).isEqualTo("FAILED_PRECONDITION");
    assertThat(ex.getMessage()).contains("transaction is no longer active");

    ExplainOptions explainOptions = ExplainOptions.newBuilder().build();
    DatastoreException explainEx =
        assertThrows(
            DatastoreException.class,
            () -> transaction.runAggregation(AGGREGATION_QUERY, explainOptions));
    assertThat(explainEx.getReason()).isEqualTo("FAILED_PRECONDITION");
    assertThat(explainEx.getMessage()).contains("transaction is no longer active");
    EasyMock.verify(rpcMock);
  }

  @Test
  public void runAggregation_succeedsWhenTransactionActive() {
    Capture<RunAggregationQueryRequest> capturedRequest = EasyMock.newCapture();
    EasyMock.expect(rpcMock.beginTransaction(EasyMock.anyObject(BeginTransactionRequest.class)))
        .andReturn(BeginTransactionResponse.newBuilder().setTransaction(TXN_ID).build());
    EasyMock.expect(rpcMock.runAggregationQuery(EasyMock.capture(capturedRequest)))
        .andReturn(
            RunAggregationQueryResponse.newBuilder()
                .setBatch(AggregationResultBatch.getDefaultInstance())
                .build());
    EasyMock.replay(rpcMock);

    Transaction transaction = datastore.newTransaction();
    AggregationResults results = transaction.runAggregation(AGGREGATION_QUERY);

    assertThat(results).isNotNull();
    assertThat(capturedRequest.getValue().getReadOptions().getTransaction()).isEqualTo(TXN_ID);
    EasyMock.verify(rpcMock);
  }
}
