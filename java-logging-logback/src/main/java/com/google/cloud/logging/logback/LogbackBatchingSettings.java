/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.logging.logback;

import com.google.api.gax.batching.BatchingSettings;
import com.google.api.gax.batching.FlowControlSettings;
import com.google.api.gax.batching.FlowController.LimitExceededBehavior;
import java.time.Duration;

/**
 * Provides batching and flow-control settings configuration in {@code logback.xml}, since {@link
 * com.google.api.gax.batching.BatchingSettings} cannot be configured directly using <a
 * href="https://logback.qos.ch/manual/configuration.html">Logback XML configuration</a>. Each
 * property maps to the corresponding setting in {@link
 * com.google.api.gax.batching.BatchingSettings} or {@link
 * com.google.api.gax.batching.FlowControlSettings}.
 */
public class LogbackBatchingSettings {
  private Long elementCountThreshold = null;
  private Long requestByteThreshold = null;
  private Long delayThreshold = null;
  private Long maxOutstandingElementCount = null;
  private Long maxOutstandingRequestBytes = null;
  private LimitExceededBehavior limitExceededBehavior = null;

  /**
   * Sets the maximum number of log entries accumulated in a batch before sending a write request.
   *
   * @param value maximum number of log entries per batch, or {@code null} to use the default.
   */
  public void setElementCountThreshold(Long value) {
    elementCountThreshold = value;
  }

  /**
   * Sets the maximum total size, in bytes, of log entries accumulated in a batch before sending a
   * write request.
   *
   * @param value maximum batch size in bytes, or {@code null} to use the default.
   */
  public void setRequestByteThreshold(Long value) {
    requestByteThreshold = value;
  }

  /**
   * Sets the maximum time, in milliseconds, to wait after the first entry is added to a batch
   * before sending a write request.
   *
   * @param value delay threshold in milliseconds, or {@code null} to use the default.
   */
  public void setDelayThreshold(Long value) {
    delayThreshold = value;
  }

  /**
   * Sets the maximum number of outstanding (in-flight) log entries allowed by flow control before
   * {@link #setLimitExceededBehavior(LimitExceededBehavior)} takes effect.
   *
   * @param value maximum outstanding log entry count, or {@code null} for no element count limit.
   */
  public void setMaxOutstandingElementCount(Long value) {
    maxOutstandingElementCount = value;
  }

  /**
   * Sets the maximum total size, in bytes, of outstanding (in-flight) write requests allowed by
   * flow control before {@link #setLimitExceededBehavior(LimitExceededBehavior)} takes effect.
   *
   * @param value maximum outstanding request size in bytes, or {@code null} for no byte limit.
   */
  public void setMaxOutstandingRequestBytes(Long value) {
    maxOutstandingRequestBytes = value;
  }

  /**
   * Sets the flow-control behavior when {@code maxOutstandingElementCount} or {@code
   * maxOutstandingRequestBytes} is exceeded.
   *
   * <p>Valid values are {@link LimitExceededBehavior#Block} ({@code "Block"}), {@link
   * LimitExceededBehavior#ThrowException} ({@code "ThrowException"}), and {@link
   * LimitExceededBehavior#Ignore} ({@code "Ignore"}).
   *
   * @param value the {@link LimitExceededBehavior} to apply, or {@code null} to use the default.
   */
  public void setLimitExceededBehavior(LimitExceededBehavior value) {
    limitExceededBehavior = value;
  }

  /**
   * Builds a {@link BatchingSettings} instance from the configured batching and flow-control
   * properties.
   *
   * @return the built {@link BatchingSettings}.
   */
  public BatchingSettings build() {
    BatchingSettings.Builder settings = BatchingSettings.newBuilder();
    if (elementCountThreshold != null) {
      settings.setElementCountThreshold(elementCountThreshold);
    }
    if (requestByteThreshold != null) {
      settings.setRequestByteThreshold(requestByteThreshold);
    }
    if (delayThreshold != null) {
      settings.setDelayThresholdDuration(Duration.ofMillis(delayThreshold));
    }
    if (maxOutstandingElementCount != null
        || maxOutstandingRequestBytes != null
        || limitExceededBehavior != null) {
      FlowControlSettings.Builder flowControlSettings = FlowControlSettings.newBuilder();
      flowControlSettings.setMaxOutstandingElementCount(maxOutstandingElementCount);
      flowControlSettings.setMaxOutstandingRequestBytes(maxOutstandingRequestBytes);
      if (limitExceededBehavior != null) {
        flowControlSettings.setLimitExceededBehavior(limitExceededBehavior);
      }
      settings.setFlowControlSettings(flowControlSettings.build());
    }
    return settings.build();
  }
}
