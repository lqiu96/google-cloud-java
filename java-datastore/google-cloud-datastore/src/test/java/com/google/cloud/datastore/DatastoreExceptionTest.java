/*
 * Copyright 2015 Google LLC
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

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ErrorDetails;
import com.google.cloud.BaseServiceException;
import com.google.cloud.RetryHelper;
import com.google.protobuf.Any;
import com.google.rpc.ErrorInfo;
import io.grpc.Status;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import org.junit.Test;

public class DatastoreExceptionTest {

  @Test
  public void testDatastoreException() {
    DatastoreException exception = new DatastoreException(10, "message", "ABORTED");
    assertEquals(10, exception.getCode());
    assertEquals("ABORTED", exception.getReason());
    assertEquals("message", exception.getMessage());
    assertTrue(exception.isRetryable());

    exception = new DatastoreException(4, "message", "DEADLINE_EXCEEDED");
    assertEquals(4, exception.getCode());
    assertEquals("DEADLINE_EXCEEDED", exception.getReason());
    assertEquals("message", exception.getMessage());
    assertTrue(exception.isRetryable());

    exception = new DatastoreException(14, "message", "UNAVAILABLE");
    assertEquals(14, exception.getCode());
    assertEquals("UNAVAILABLE", exception.getReason());
    assertEquals("message", exception.getMessage());
    assertTrue(exception.isRetryable());

    exception = new DatastoreException(2, "message", "INTERNAL");
    assertEquals(2, exception.getCode());
    assertEquals("INTERNAL", exception.getReason());
    assertEquals("message", exception.getMessage());
    assertFalse(exception.isRetryable());

    IOException cause = new SocketTimeoutException("socketTimeoutMessage");
    exception = new DatastoreException(cause);
    assertEquals(DatastoreException.UNKNOWN_CODE, exception.getCode());
    assertNull(exception.getReason());
    assertEquals("socketTimeoutMessage", exception.getMessage());
    assertEquals(cause, exception.getCause());
    assertTrue(exception.isRetryable());
    assertSame(cause, exception.getCause());

    exception = new DatastoreException(2, "message", "INTERNAL", cause);
    assertEquals(2, exception.getCode());
    assertEquals("INTERNAL", exception.getReason());
    assertEquals("message", exception.getMessage());
    assertFalse(exception.isRetryable());
    assertSame(cause, exception.getCause());
  }

  @Test
  public void testTranslateAndThrow() {
    Exception cause = new DatastoreException(14, "message", "UNAVAILABLE");
    RetryHelper.RetryHelperException exceptionMock =
        createMock(RetryHelper.RetryHelperException.class);
    expect(exceptionMock.getCause()).andReturn(cause).times(2);
    replay(exceptionMock);
    try {
      DatastoreException.translateAndThrow(exceptionMock);
    } catch (BaseServiceException ex) {
      assertEquals(14, ex.getCode());
      assertEquals("message", ex.getMessage());
      assertTrue(ex.isRetryable());
    } finally {
      verify(exceptionMock);
    }
    cause = new IllegalArgumentException("message");
    exceptionMock = createMock(RetryHelper.RetryHelperException.class);
    expect(exceptionMock.getMessage()).andReturn("message").times(1);
    expect(exceptionMock.getCause()).andReturn(cause).times(4);
    replay(exceptionMock);
    try {
      DatastoreException.translateAndThrow(exceptionMock);
    } catch (BaseServiceException ex) {
      assertEquals(DatastoreException.UNKNOWN_CODE, ex.getCode());
      assertEquals("message", ex.getMessage());
      assertFalse(ex.isRetryable());
      assertSame(cause, ex.getCause());
    } finally {
      verify(exceptionMock);
    }
  }

  @Test
  public void testThrowInvalidRequest() {
    try {
      DatastoreException.throwInvalidRequest("message %s %d", "a", 1);
      fail("Exception expected");
    } catch (DatastoreException ex) {
      assertEquals("FAILED_PRECONDITION", ex.getReason());
      assertEquals("message a 1", ex.getMessage());
    }
  }

  @Test
  public void testAsDatastoreExceptionPreservesNonEmptyApiExceptionReason() {
    ErrorDetails errorDetails =
        ErrorDetails.builder()
            .setRawErrorMessages(
                Collections.singletonList(
                    Any.pack(ErrorInfo.newBuilder().setReason("CONSUMER_INVALID").build())))
            .build();
    ApiException apiException =
        new ApiException(
            "invalid consumer",
            null,
            GrpcStatusCode.of(Status.Code.PERMISSION_DENIED),
            false,
            errorDetails);

    DatastoreException ex = DatastoreException.asDatastoreException(apiException);

    assertEquals(7, ex.getCode());
    assertEquals("CONSUMER_INVALID", ex.getReason());
    assertFalse(ex.isRetryable());
    assertEquals("PERMISSION_DENIED", DatastoreException.extractStatusCode(ex));
    assertSame(apiException, ex.getCause());
  }

  @Test
  public void testAsDatastoreExceptionWithErrorInfoPreservesRetryableAndCanonicalStatusCode() {
    ErrorDetails abortedDetails =
        ErrorDetails.builder()
            .setRawErrorMessages(
                Collections.singletonList(
                    Any.pack(ErrorInfo.newBuilder().setReason("LOCK_CONTENTION").build())))
            .build();
    ApiException abortedApiEx =
        new ApiException(
            "aborted", null, GrpcStatusCode.of(Status.Code.ABORTED), false, abortedDetails);
    DatastoreException aborted = DatastoreException.asDatastoreException(abortedApiEx);
    assertEquals(10, aborted.getCode());
    assertEquals("LOCK_CONTENTION", aborted.getReason());
    assertTrue(aborted.isRetryable());
    assertEquals("ABORTED", DatastoreException.extractStatusCode(aborted));

    ErrorDetails deadlineDetails =
        ErrorDetails.builder()
            .setRawErrorMessages(
                Collections.singletonList(
                    Any.pack(ErrorInfo.newBuilder().setReason("DEADLINE_CUSTOM").build())))
            .build();
    ApiException deadlineApiEx =
        new ApiException(
            "deadline exceeded",
            null,
            GrpcStatusCode.of(Status.Code.DEADLINE_EXCEEDED),
            false,
            deadlineDetails);
    DatastoreException deadline = DatastoreException.asDatastoreException(deadlineApiEx);
    assertEquals(4, deadline.getCode());
    assertEquals("DEADLINE_CUSTOM", deadline.getReason());
    assertTrue(deadline.isRetryable());
    assertEquals("DEADLINE_EXCEEDED", DatastoreException.extractStatusCode(deadline));

    ErrorDetails unavailableDetails =
        ErrorDetails.builder()
            .setRawErrorMessages(
                Collections.singletonList(
                    Any.pack(ErrorInfo.newBuilder().setReason("BACKEND_OVERLOADED").build())))
            .build();
    ApiException unavailableApiEx =
        new ApiException(
            "unavailable",
            null,
            GrpcStatusCode.of(Status.Code.UNAVAILABLE),
            true,
            unavailableDetails);
    DatastoreException unavailable = DatastoreException.asDatastoreException(unavailableApiEx);
    assertEquals(14, unavailable.getCode());
    assertEquals("BACKEND_OVERLOADED", unavailable.getReason());
    assertTrue(unavailable.isRetryable());
    assertEquals("UNAVAILABLE", DatastoreException.extractStatusCode(unavailable));

    // Also verify wrapped propagation (e.g. runInTransaction) and direct construction with custom
    // reason without an ApiException cause.
    DatastoreException wrapped =
        new DatastoreException(DatastoreException.UNKNOWN_CODE, "wrapped", null, aborted);
    assertEquals("ABORTED", DatastoreException.extractStatusCode(wrapped));
    DatastoreException directUnavailable =
        new DatastoreException(14, "unavailable", "BACKEND_OVERLOADED");
    assertTrue(directUnavailable.isRetryable());
    assertEquals("UNAVAILABLE", DatastoreException.extractStatusCode(directUnavailable));
    DatastoreException clientPrecondition =
        new DatastoreException(DatastoreException.UNKNOWN_CODE, "invalid", "FAILED_PRECONDITION");
    assertFalse(clientPrecondition.isRetryable());
    assertEquals("FAILED_PRECONDITION", DatastoreException.extractStatusCode(clientPrecondition));
  }

  @Test
  public void testAsDatastoreExceptionFallsBackToStatusCodeNameWhenReasonMissingOrEmpty() {
    ApiException withoutReason =
        new ApiException("unavailable", null, GrpcStatusCode.of(Status.Code.UNAVAILABLE), true);
    DatastoreException exWithoutReason = DatastoreException.asDatastoreException(withoutReason);
    assertEquals(14, exWithoutReason.getCode());
    assertEquals("UNAVAILABLE", exWithoutReason.getReason());

    ErrorDetails emptyReasonDetails =
        ErrorDetails.builder()
            .setRawErrorMessages(
                Collections.singletonList(Any.pack(ErrorInfo.newBuilder().setReason("").build())))
            .build();
    ApiException withEmptyReason =
        new ApiException(
            "aborted", null, GrpcStatusCode.of(Status.Code.ABORTED), false, emptyReasonDetails);
    DatastoreException exWithEmptyReason = DatastoreException.asDatastoreException(withEmptyReason);
    assertEquals(10, exWithEmptyReason.getCode());
    assertEquals("ABORTED", exWithEmptyReason.getReason());
  }
}
