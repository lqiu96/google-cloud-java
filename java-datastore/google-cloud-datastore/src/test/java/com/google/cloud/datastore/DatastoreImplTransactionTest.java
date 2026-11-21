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
import com.google.cloud.datastore.spi.DatastoreRpcFactory;
import com.google.cloud.datastore.spi.v1.DatastoreRpc;
import com.google.datastore.v1.BeginTransactionRequest;
import com.google.datastore.v1.BeginTransactionResponse;
import com.google.datastore.v1.CommitRequest;
import com.google.datastore.v1.CommitResponse;
import com.google.datastore.v1.RollbackRequest;
import com.google.datastore.v1.RollbackResponse;
import com.google.datastore.v1.TransactionOptions;
import com.google.protobuf.ByteString;
import java.util.concurrent.atomic.AtomicInteger;
import org.easymock.Capture;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.Duration;

public class DatastoreImplTransactionTest {

  private static final String PROJECT_ID = "test-project";
  private static final ByteString TXN_1 = ByteString.copyFromUtf8("txn-1");
  private static final ByteString TXN_2 = ByteString.copyFromUtf8("txn-2");

  private DatastoreRpcFactory rpcFactoryMock;
  private DatastoreRpc rpcMock;
  private Datastore datastore;

  @Before
  public void setUp() {
    rpcFactoryMock = EasyMock.createStrictMock(DatastoreRpcFactory.class);
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
            .setProjectId(PROJECT_ID)
            .setCredentials(NoCredentials.getInstance())
            .setHost("http://localhost:8080")
            .setRetrySettings(retrySettings)
            .setServiceRpcFactory(rpcFactoryMock)
            .build();
    EasyMock.expect(rpcFactoryMock.create(options)).andReturn(rpcMock);
    EasyMock.replay(rpcFactoryMock);
    datastore = options.getService();
    EasyMock.verify(rpcFactoryMock);
  }

  @Test
  public void runInTransaction_oneArgPopulatesPreviousTransactionOnRetry() {
    Capture<BeginTransactionRequest> firstBegin = EasyMock.newCapture();
    Capture<BeginTransactionRequest> secondBegin = EasyMock.newCapture();

    EasyMock.expect(rpcMock.beginTransaction(EasyMock.capture(firstBegin)))
        .andReturn(BeginTransactionResponse.newBuilder().setTransaction(TXN_1).build());
    EasyMock.expect(rpcMock.rollback(EasyMock.anyObject(RollbackRequest.class)))
        .andReturn(RollbackResponse.getDefaultInstance());
    EasyMock.expect(rpcMock.beginTransaction(EasyMock.capture(secondBegin)))
        .andReturn(BeginTransactionResponse.newBuilder().setTransaction(TXN_2).build());
    EasyMock.expect(rpcMock.commit(EasyMock.anyObject(CommitRequest.class)))
        .andReturn(CommitResponse.getDefaultInstance());
    EasyMock.replay(rpcMock);

    AtomicInteger attempts = new AtomicInteger(0);
    int result =
        datastore.runInTransaction(
            txn -> {
              if (attempts.incrementAndGet() == 1) {
                throw new DatastoreException(10, "aborted", "ABORTED", false, null);
              }
              return attempts.get();
            });

    EasyMock.verify(rpcMock);
    assertThat(result).isEqualTo(2);
    assertThat(firstBegin.getValue().getTransactionOptions().getModeCase())
        .isEqualTo(TransactionOptions.ModeCase.READ_WRITE);
    assertThat(
            firstBegin.getValue().getTransactionOptions().getReadWrite().getPreviousTransaction())
        .isEmpty();
    assertThat(
            secondBegin.getValue().getTransactionOptions().getReadWrite().getPreviousTransaction())
        .isEqualTo(TXN_1);
  }

  @Test
  public void runInTransaction_nullOptionsPopulatesPreviousTransactionOnRetry() {
    Capture<BeginTransactionRequest> secondBegin = EasyMock.newCapture();

    EasyMock.expect(rpcMock.beginTransaction(EasyMock.anyObject(BeginTransactionRequest.class)))
        .andReturn(BeginTransactionResponse.newBuilder().setTransaction(TXN_1).build());
    EasyMock.expect(rpcMock.rollback(EasyMock.anyObject(RollbackRequest.class)))
        .andReturn(RollbackResponse.getDefaultInstance());
    EasyMock.expect(rpcMock.beginTransaction(EasyMock.capture(secondBegin)))
        .andReturn(BeginTransactionResponse.newBuilder().setTransaction(TXN_2).build());
    EasyMock.expect(rpcMock.commit(EasyMock.anyObject(CommitRequest.class)))
        .andReturn(CommitResponse.getDefaultInstance());
    EasyMock.replay(rpcMock);

    AtomicInteger attempts = new AtomicInteger(0);
    int result =
        datastore.runInTransaction(
            txn -> {
              if (attempts.incrementAndGet() == 1) {
                throw new DatastoreException(10, "aborted", "ABORTED", false, null);
              }
              return attempts.get();
            },
            null);

    EasyMock.verify(rpcMock);
    assertThat(result).isEqualTo(2);
    assertThat(
            secondBegin.getValue().getTransactionOptions().getReadWrite().getPreviousTransaction())
        .isEqualTo(TXN_1);
  }

  @Test
  public void runInTransaction_readOnlyOptionsDoesNotSetPreviousTransactionOnRetry() {
    Capture<BeginTransactionRequest> secondBegin = EasyMock.newCapture();

    EasyMock.expect(rpcMock.beginTransaction(EasyMock.anyObject(BeginTransactionRequest.class)))
        .andReturn(BeginTransactionResponse.newBuilder().setTransaction(TXN_1).build());
    EasyMock.expect(rpcMock.rollback(EasyMock.anyObject(RollbackRequest.class)))
        .andReturn(RollbackResponse.getDefaultInstance());
    EasyMock.expect(rpcMock.beginTransaction(EasyMock.capture(secondBegin)))
        .andReturn(BeginTransactionResponse.newBuilder().setTransaction(TXN_2).build());
    EasyMock.expect(rpcMock.commit(EasyMock.anyObject(CommitRequest.class)))
        .andReturn(CommitResponse.getDefaultInstance());
    EasyMock.replay(rpcMock);

    TransactionOptions readOnlyOptions =
        TransactionOptions.newBuilder()
            .setReadOnly(TransactionOptions.ReadOnly.getDefaultInstance())
            .build();
    AtomicInteger attempts = new AtomicInteger(0);
    int result =
        datastore.runInTransaction(
            txn -> {
              if (attempts.incrementAndGet() == 1) {
                throw new DatastoreException(10, "aborted", "ABORTED", false, null);
              }
              return attempts.get();
            },
            readOnlyOptions);

    EasyMock.verify(rpcMock);
    assertThat(result).isEqualTo(2);
    assertThat(secondBegin.getValue().getTransactionOptions().getModeCase())
        .isEqualTo(TransactionOptions.ModeCase.READ_ONLY);
  }

  @Test
  public void runInTransaction_newTransactionFailureDoesNotThrowNpe() {
    DatastoreException beginFailure =
        new DatastoreException(7, "permission denied", "PERMISSION_DENIED", false, null);
    EasyMock.expect(rpcMock.beginTransaction(EasyMock.anyObject(BeginTransactionRequest.class)))
        .andThrow(beginFailure);
    EasyMock.replay(rpcMock);

    DatastoreException thrown =
        assertThrows(DatastoreException.class, () -> datastore.runInTransaction(txn -> "ok"));

    EasyMock.verify(rpcMock);
    assertThat(thrown.getCause()).isSameInstanceAs(beginFailure);
  }

  @Test
  public void runInTransaction_newTransactionFailureOnRetryDoesNotUseStaleTransaction() {
    DatastoreException retryBeginFailure =
        new DatastoreException(7, "permission denied", "PERMISSION_DENIED", false, null);
    EasyMock.expect(rpcMock.beginTransaction(EasyMock.anyObject(BeginTransactionRequest.class)))
        .andReturn(BeginTransactionResponse.newBuilder().setTransaction(TXN_1).build());
    EasyMock.expect(rpcMock.rollback(EasyMock.anyObject(RollbackRequest.class)))
        .andReturn(RollbackResponse.getDefaultInstance());
    EasyMock.expect(rpcMock.beginTransaction(EasyMock.anyObject(BeginTransactionRequest.class)))
        .andThrow(retryBeginFailure);
    EasyMock.replay(rpcMock);

    DatastoreException thrown =
        assertThrows(
            DatastoreException.class,
            () ->
                datastore.runInTransaction(
                    txn -> {
                      throw new DatastoreException(10, "aborted", "ABORTED", false, null);
                    }));

    EasyMock.verify(rpcMock);
    assertThat(thrown.getCause()).isSameInstanceAs(retryBeginFailure);
  }
}
