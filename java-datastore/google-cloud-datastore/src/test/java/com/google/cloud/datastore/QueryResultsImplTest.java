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

import com.google.cloud.NoCredentials;
import com.google.cloud.ServiceOptions;
import com.google.cloud.datastore.spi.DatastoreRpcFactory;
import com.google.cloud.datastore.spi.v1.DatastoreRpc;
import com.google.datastore.v1.EntityResult;
import com.google.datastore.v1.QueryResultBatch;
import com.google.datastore.v1.QueryResultBatch.MoreResultsType;
import com.google.datastore.v1.RunQueryRequest;
import com.google.datastore.v1.RunQueryResponse;
import com.google.protobuf.ByteString;
import java.util.NoSuchElementException;
import org.easymock.Capture;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class QueryResultsImplTest {

  private static final String PROJECT_ID = "test-project";
  private static final String KIND = "Task";
  private static final Key KEY_1 = Key.newBuilder(PROJECT_ID, KIND, "k1").build();
  private static final Key KEY_2 = Key.newBuilder(PROJECT_ID, KIND, "k2").build();
  private static final Entity ENTITY_1 = Entity.newBuilder(KEY_1).set("name", "one").build();
  private static final Entity ENTITY_2 = Entity.newBuilder(KEY_2).set("name", "two").build();
  private static final ByteString CURSOR_START = ByteString.copyFromUtf8("cursor-start");
  private static final ByteString CURSOR_SKIP = ByteString.copyFromUtf8("cursor-skip");
  private static final ByteString CURSOR_1 = ByteString.copyFromUtf8("cursor-1");
  private static final ByteString CURSOR_2 = ByteString.copyFromUtf8("cursor-2");
  private static final ByteString CURSOR_BATCH_1_END = ByteString.copyFromUtf8("cursor-b1-end");
  private static final ByteString CURSOR_END = ByteString.copyFromUtf8("cursor-end");

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
  public void getCursorAfter_doesNotAdvanceOnHasNextWithinBatch() {
    RunQueryResponse response =
        RunQueryResponse.newBuilder()
            .setBatch(
                QueryResultBatch.newBuilder()
                    .setEntityResultType(EntityResult.ResultType.FULL)
                    .addEntityResults(entityResult(ENTITY_1, CURSOR_1))
                    .addEntityResults(entityResult(ENTITY_2, CURSOR_2))
                    .setMoreResults(MoreResultsType.MORE_RESULTS_AFTER_LIMIT)
                    .setEndCursor(CURSOR_END))
            .build();
    EasyMock.expect(rpcMock.runQuery(EasyMock.anyObject(RunQueryRequest.class)))
        .andReturn(response);
    EasyMock.replay(rpcMock);

    Query<Entity> query =
        Query.newEntityQueryBuilder()
            .setKind(KIND)
            .setStartCursor(new Cursor(CURSOR_START))
            .build();
    QueryResults<Entity> results = datastore.run(query);

    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_START));
    assertThat(results.hasNext()).isTrue();
    assertThat(results.hasNext()).isTrue();
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_START));

    assertThat(results.next()).isEqualTo(ENTITY_1);
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_1));

    assertThat(results.hasNext()).isTrue();
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_1));

    assertThat(results.next()).isEqualTo(ENTITY_2);
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_2));

    assertThat(results.hasNext()).isFalse();
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_END));
    assertThrows(NoSuchElementException.class, results::next);
    EasyMock.verify(rpcMock);
  }

  @Test
  public void getCursorAfter_doesNotAdvanceOnHasNextAcrossBatches() {
    RunQueryResponse batch1 =
        RunQueryResponse.newBuilder()
            .setBatch(
                QueryResultBatch.newBuilder()
                    .setEntityResultType(EntityResult.ResultType.FULL)
                    .addEntityResults(entityResult(ENTITY_1, CURSOR_1))
                    .setMoreResults(MoreResultsType.NOT_FINISHED)
                    .setEndCursor(CURSOR_BATCH_1_END))
            .build();
    RunQueryResponse batch2 =
        RunQueryResponse.newBuilder()
            .setBatch(
                QueryResultBatch.newBuilder()
                    .setEntityResultType(EntityResult.ResultType.FULL)
                    .addEntityResults(entityResult(ENTITY_2, CURSOR_2))
                    .setMoreResults(MoreResultsType.NO_MORE_RESULTS)
                    .setEndCursor(CURSOR_END))
            .build();
    EasyMock.expect(rpcMock.runQuery(EasyMock.anyObject(RunQueryRequest.class))).andReturn(batch1);
    EasyMock.expect(rpcMock.runQuery(EasyMock.anyObject(RunQueryRequest.class))).andReturn(batch2);
    EasyMock.replay(rpcMock);

    QueryResults<Entity> results =
        datastore.run(Query.newEntityQueryBuilder().setKind(KIND).build());

    assertThat(results.next()).isEqualTo(ENTITY_1);
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_1));

    assertThat(results.hasNext()).isTrue();
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_1));

    assertThat(results.next()).isEqualTo(ENTITY_2);
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_2));

    assertThat(results.hasNext()).isFalse();
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_END));
    EasyMock.verify(rpcMock);
  }

  @Test
  public void getCursorAfter_preservesSkippedCursorUntilNext() {
    RunQueryResponse response =
        RunQueryResponse.newBuilder()
            .setBatch(
                QueryResultBatch.newBuilder()
                    .setEntityResultType(EntityResult.ResultType.FULL)
                    .setSkippedResults(3)
                    .setSkippedCursor(CURSOR_SKIP)
                    .addEntityResults(entityResult(ENTITY_1, CURSOR_1))
                    .setMoreResults(MoreResultsType.NO_MORE_RESULTS)
                    .setEndCursor(CURSOR_END))
            .build();
    EasyMock.expect(rpcMock.runQuery(EasyMock.anyObject(RunQueryRequest.class)))
        .andReturn(response);
    EasyMock.replay(rpcMock);

    QueryResults<Entity> results =
        datastore.run(Query.newEntityQueryBuilder().setKind(KIND).build());

    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_SKIP));
    assertThat(results.hasNext()).isTrue();
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_SKIP));
    assertThat(results.next()).isEqualTo(ENTITY_1);
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_1));
    EasyMock.verify(rpcMock);
  }

  @Test
  public void nextWithoutHasNext_advancesCursorAndThrowsWhenExhausted() {
    RunQueryResponse response =
        RunQueryResponse.newBuilder()
            .setBatch(
                QueryResultBatch.newBuilder()
                    .setEntityResultType(EntityResult.ResultType.FULL)
                    .addEntityResults(entityResult(ENTITY_1, CURSOR_1))
                    .setMoreResults(MoreResultsType.NO_MORE_RESULTS)
                    .setEndCursor(CURSOR_END))
            .build();
    EasyMock.expect(rpcMock.runQuery(EasyMock.anyObject(RunQueryRequest.class)))
        .andReturn(response);
    EasyMock.replay(rpcMock);

    QueryResults<Entity> results =
        datastore.run(Query.newEntityQueryBuilder().setKind(KIND).build());

    assertThat(results.next()).isEqualTo(ENTITY_1);
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_1));
    assertThrows(NoSuchElementException.class, results::next);
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_END));
    assertThrows(UnsupportedOperationException.class, results::remove);
    EasyMock.verify(rpcMock);
  }

  @Test
  public void hasNext_transientFailureRetryPreservesLimitWithoutDoubleSubtraction() {
    RunQueryResponse batch1 =
        RunQueryResponse.newBuilder()
            .setBatch(
                QueryResultBatch.newBuilder()
                    .setEntityResultType(EntityResult.ResultType.FULL)
                    .addEntityResults(entityResult(ENTITY_1, CURSOR_1))
                    .setMoreResults(MoreResultsType.NOT_FINISHED)
                    .setEndCursor(CURSOR_BATCH_1_END))
            .build();
    RunQueryResponse batch2 =
        RunQueryResponse.newBuilder()
            .setBatch(
                QueryResultBatch.newBuilder()
                    .setEntityResultType(EntityResult.ResultType.FULL)
                    .addEntityResults(entityResult(ENTITY_2, CURSOR_2))
                    .setMoreResults(MoreResultsType.MORE_RESULTS_AFTER_LIMIT)
                    .setEndCursor(CURSOR_END))
            .build();

    Capture<RunQueryRequest> failedAttemptRequest = EasyMock.newCapture();
    Capture<RunQueryRequest> retriedAttemptRequest = EasyMock.newCapture();

    EasyMock.expect(rpcMock.runQuery(EasyMock.anyObject(RunQueryRequest.class))).andReturn(batch1);
    EasyMock.expect(rpcMock.runQuery(EasyMock.capture(failedAttemptRequest)))
        .andThrow(new DatastoreException(14, "unavailable", "UNAVAILABLE"));
    EasyMock.expect(rpcMock.runQuery(EasyMock.capture(retriedAttemptRequest))).andReturn(batch2);
    EasyMock.replay(rpcMock);

    Query<Entity> query = Query.newEntityQueryBuilder().setKind(KIND).setLimit(2).build();
    QueryResults<Entity> results = datastore.run(query);

    assertThat(results.next()).isEqualTo(ENTITY_1);
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_1));

    DatastoreException transientError = assertThrows(DatastoreException.class, results::hasNext);
    assertThat(transientError.getCode()).isEqualTo(14);
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_1));

    // Retrying hasNext() after a transient failure must resend the same remaining limit (1),
    // not double-subtract to 0.
    assertThat(results.hasNext()).isTrue();
    assertThat(failedAttemptRequest.getValue().getQuery().getLimit().getValue()).isEqualTo(1);
    assertThat(retriedAttemptRequest.getValue().getQuery().getLimit().getValue()).isEqualTo(1);
    assertThat(retriedAttemptRequest.getValue().getQuery().getStartCursor())
        .isEqualTo(CURSOR_BATCH_1_END);

    assertThat(results.next()).isEqualTo(ENTITY_2);
    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_2));
    assertThat(results.hasNext()).isFalse();
    EasyMock.verify(rpcMock);
  }

  @Test
  public void hasNext_transientFailureRetryPreservesOffsetWithoutDoubleSubtraction() {
    RunQueryResponse batch1 =
        RunQueryResponse.newBuilder()
            .setBatch(
                QueryResultBatch.newBuilder()
                    .setEntityResultType(EntityResult.ResultType.FULL)
                    .setSkippedResults(1)
                    .setSkippedCursor(CURSOR_SKIP)
                    .setMoreResults(MoreResultsType.NOT_FINISHED)
                    .setEndCursor(CURSOR_BATCH_1_END))
            .build();
    RunQueryResponse batch2 =
        RunQueryResponse.newBuilder()
            .setBatch(
                QueryResultBatch.newBuilder()
                    .setEntityResultType(EntityResult.ResultType.FULL)
                    .setSkippedResults(2)
                    .setSkippedCursor(CURSOR_BATCH_1_END)
                    .addEntityResults(entityResult(ENTITY_1, CURSOR_1))
                    .setMoreResults(MoreResultsType.NO_MORE_RESULTS)
                    .setEndCursor(CURSOR_END))
            .build();

    Capture<RunQueryRequest> failedAttemptRequest = EasyMock.newCapture();
    Capture<RunQueryRequest> retriedAttemptRequest = EasyMock.newCapture();

    EasyMock.expect(rpcMock.runQuery(EasyMock.anyObject(RunQueryRequest.class))).andReturn(batch1);
    EasyMock.expect(rpcMock.runQuery(EasyMock.capture(failedAttemptRequest)))
        .andThrow(new DatastoreException(14, "unavailable", "UNAVAILABLE"));
    EasyMock.expect(rpcMock.runQuery(EasyMock.capture(retriedAttemptRequest))).andReturn(batch2);
    EasyMock.replay(rpcMock);

    Query<Entity> query =
        Query.newEntityQueryBuilder().setKind(KIND).setOffset(3).setLimit(2).build();
    QueryResults<Entity> results = datastore.run(query);

    assertThat(results.getCursorAfter()).isEqualTo(new Cursor(CURSOR_SKIP));
    DatastoreException transientError = assertThrows(DatastoreException.class, results::hasNext);
    assertThat(transientError.getCode()).isEqualTo(14);

    // Retrying hasNext() must resend the same remaining offset (2) and limit (2).
    assertThat(results.hasNext()).isTrue();
    assertThat(failedAttemptRequest.getValue().getQuery().getOffset()).isEqualTo(2);
    assertThat(failedAttemptRequest.getValue().getQuery().getLimit().getValue()).isEqualTo(2);
    assertThat(retriedAttemptRequest.getValue().getQuery().getOffset()).isEqualTo(2);
    assertThat(retriedAttemptRequest.getValue().getQuery().getLimit().getValue()).isEqualTo(2);
    assertThat(retriedAttemptRequest.getValue().getQuery().getStartCursor())
        .isEqualTo(CURSOR_BATCH_1_END);

    assertThat(results.next()).isEqualTo(ENTITY_1);
    assertThat(results.hasNext()).isFalse();
    EasyMock.verify(rpcMock);
  }

  private static EntityResult entityResult(Entity entity, ByteString cursor) {
    return EntityResult.newBuilder().setEntity(entity.toPb()).setCursor(cursor).build();
  }
}
