/*
 * Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.logging;

// [START logging_quickstart]
import com.google.cloud.MonitoredResource;
import com.google.cloud.logging.LogEntry;
import com.google.cloud.logging.Logging;
import com.google.cloud.logging.LoggingOptions;
import com.google.cloud.logging.Payload.StringPayload;
import com.google.cloud.logging.Severity;
import java.util.Collections;

/**
 * This sample demonstrates writing logs using the Cloud Logging API. The library also offers a
 * {@code java.util.logging} handler ({@code com.google.cloud.logging.LoggingHandler}). Logback
 * integration is also available at
 * https://github.com/googleapis/google-cloud-java/tree/main/java-logging-logback. Using the {@code
 * java.util.logging} handler or Logback appender should be preferred to using the API directly.
 */
public class QuickstartSample {

  /** Expects a new or existing Cloud log name as the first argument. */
  public static void main(String... args) throws Exception {
    // The name of the log to write to
    String logName = args[0]; // "my-log";
    String textPayload = "Hello, world!";

    // Instantiates a client (create once and reuse across requests; close on application shutdown)
    Logging logging = LoggingOptions.getDefaultInstance().getService();
    try {
      LogEntry entry =
          LogEntry.newBuilder(StringPayload.of(textPayload))
              .setSeverity(Severity.ERROR)
              .setLogName(logName)
              .setResource(MonitoredResource.newBuilder("global").build())
              .build();

      // Writes the log entry asynchronously
      logging.write(Collections.singleton(entry));

      // Flush any pending log entries before shutting down
      logging.flush();
    } finally {
      logging.close();
    }
    System.out.printf("Logged: %s%n", textPayload);
  }
}
// [END logging_quickstart]
