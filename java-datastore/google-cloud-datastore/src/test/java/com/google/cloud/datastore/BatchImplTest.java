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

import com.google.cloud.NoCredentials;
import com.google.cloud.ServiceOptions;
import com.google.cloud.datastore.spi.DatastoreRpcFactory;
import com.google.cloud.datastore.spi.v1.DatastoreRpc;
import com.google.common.collect.ImmutableList;
import com.google.datastore.v1.CommitRequest;
import com.google.datastore.v1.CommitResponse;
import org.easymock.Capture;
import org.easymock.EasyMock;
import org.junit.Test;

public class BatchImplTest {

  private static final String PROJECT_ID = "test-project";
  private static final Key KEY = Key.newBuilder(PROJECT_ID, "Task", "k1").build();
  private static final Entity ENTITY = Entity.newBuilder(KEY).set("done", true).build();

  @Test
  public void submit_includesInstanceLevelRequestOptions() {
    DatastoreRpcFactory rpcFactoryMock = EasyMock.createStrictMock(DatastoreRpcFactory.class);
    DatastoreRpc rpcMock = EasyMock.createStrictMock(DatastoreRpc.class);
    DatastoreOptions options =
        DatastoreOptions.newBuilder()
            .setProjectId(PROJECT_ID)
            .setCredentials(NoCredentials.getInstance())
            .setHost("http://localhost:8080")
            .setRetrySettings(ServiceOptions.getNoRetrySettings())
            .setRequestTags(ImmutableList.of("instance-tag-1", "instance-tag-2"))
            .setServiceRpcFactory(rpcFactoryMock)
            .build();

    Capture<CommitRequest> capturedRequest = EasyMock.newCapture();
    EasyMock.expect(rpcFactoryMock.create(options)).andReturn(rpcMock);
    EasyMock.expect(rpcMock.commit(EasyMock.capture(capturedRequest)))
        .andReturn(CommitResponse.getDefaultInstance());
    EasyMock.replay(rpcFactoryMock, rpcMock);

    Datastore datastore = options.getService();
    Batch batch = datastore.newBatch();
    batch.put(ENTITY);
    batch.submit();

    EasyMock.verify(rpcFactoryMock, rpcMock);
    assertThat(batch.isActive()).isFalse();
    CommitRequest request = capturedRequest.getValue();
    assertThat(request.getMode()).isEqualTo(CommitRequest.Mode.NON_TRANSACTIONAL);
    assertThat(request.getRequestOptions().getRequestTagsList())
        .containsExactly("instance-tag-1", "instance-tag-2")
        .inOrder();
  }

  @Test
  public void submit_withoutInstanceLevelRequestTags() {
    DatastoreRpcFactory rpcFactoryMock = EasyMock.createStrictMock(DatastoreRpcFactory.class);
    DatastoreRpc rpcMock = EasyMock.createStrictMock(DatastoreRpc.class);
    DatastoreOptions options =
        DatastoreOptions.newBuilder()
            .setProjectId(PROJECT_ID)
            .setCredentials(NoCredentials.getInstance())
            .setHost("http://localhost:8080")
            .setRetrySettings(ServiceOptions.getNoRetrySettings())
            .setServiceRpcFactory(rpcFactoryMock)
            .build();

    Capture<CommitRequest> capturedRequest = EasyMock.newCapture();
    EasyMock.expect(rpcFactoryMock.create(options)).andReturn(rpcMock);
    EasyMock.expect(rpcMock.commit(EasyMock.capture(capturedRequest)))
        .andReturn(CommitResponse.getDefaultInstance());
    EasyMock.replay(rpcFactoryMock, rpcMock);

    Datastore datastore = options.getService();
    Batch batch = datastore.newBatch();
    batch.put(ENTITY);
    batch.submit();

    EasyMock.verify(rpcFactoryMock, rpcMock);
    assertThat(capturedRequest.getValue().getRequestOptions().getRequestTagsList()).isEmpty();
  }
}
