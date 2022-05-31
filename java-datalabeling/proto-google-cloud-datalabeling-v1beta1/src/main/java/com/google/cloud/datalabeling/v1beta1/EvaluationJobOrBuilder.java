/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/evaluation_job.proto

package com.google.cloud.datalabeling.v1beta1;

public interface EvaluationJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.EvaluationJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. After you create a job, Data Labeling Service assigns a name
   * to the job with the following format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/evaluationJobs/&lt;var&gt;{evaluation_job_id}&lt;/var&gt;"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. After you create a job, Data Labeling Service assigns a name
   * to the job with the following format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/evaluationJobs/&lt;var&gt;{evaluation_job_id}&lt;/var&gt;"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Description of the job. The description can be up to 25,000
   * characters long.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Required. Description of the job. The description can be up to 25,000
   * characters long.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Describes the current state of the job.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.EvaluationJob.State state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Describes the current state of the job.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.EvaluationJob.State state = 3;</code>
   *
   * @return The state.
   */
  com.google.cloud.datalabeling.v1beta1.EvaluationJob.State getState();

  /**
   *
   *
   * <pre>
   * Required. Describes the interval at which the job runs. This interval must
   * be at least 1 day, and it is rounded to the nearest day. For example, if
   * you specify a 50-hour interval, the job runs every 2 days.
   * You can provide the schedule in
   * [crontab format](/scheduler/docs/configuring/cron-job-schedules) or in an
   * [English-like
   * format](/appengine/docs/standard/python/config/cronref#schedule_format).
   * Regardless of what you specify, the job will run at 10:00 AM UTC. Only the
   * interval from this schedule is used, not the specific time of day.
   * </pre>
   *
   * <code>string schedule = 4;</code>
   *
   * @return The schedule.
   */
  java.lang.String getSchedule();
  /**
   *
   *
   * <pre>
   * Required. Describes the interval at which the job runs. This interval must
   * be at least 1 day, and it is rounded to the nearest day. For example, if
   * you specify a 50-hour interval, the job runs every 2 days.
   * You can provide the schedule in
   * [crontab format](/scheduler/docs/configuring/cron-job-schedules) or in an
   * [English-like
   * format](/appengine/docs/standard/python/config/cronref#schedule_format).
   * Regardless of what you specify, the job will run at 10:00 AM UTC. Only the
   * interval from this schedule is used, not the specific time of day.
   * </pre>
   *
   * <code>string schedule = 4;</code>
   *
   * @return The bytes for schedule.
   */
  com.google.protobuf.ByteString getScheduleBytes();

  /**
   *
   *
   * <pre>
   * Required. The [AI Platform Prediction model
   * version](/ml-engine/docs/prediction-overview) to be evaluated. Prediction
   * input and output is sampled from this model version. When creating an
   * evaluation job, specify the model version in the following format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/models/&lt;var&gt;{model_name}&lt;/var&gt;/versions/&lt;var&gt;{version_name}&lt;/var&gt;"
   * There can only be one evaluation job per model version.
   * </pre>
   *
   * <code>string model_version = 5;</code>
   *
   * @return The modelVersion.
   */
  java.lang.String getModelVersion();
  /**
   *
   *
   * <pre>
   * Required. The [AI Platform Prediction model
   * version](/ml-engine/docs/prediction-overview) to be evaluated. Prediction
   * input and output is sampled from this model version. When creating an
   * evaluation job, specify the model version in the following format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/models/&lt;var&gt;{model_name}&lt;/var&gt;/versions/&lt;var&gt;{version_name}&lt;/var&gt;"
   * There can only be one evaluation job per model version.
   * </pre>
   *
   * <code>string model_version = 5;</code>
   *
   * @return The bytes for modelVersion.
   */
  com.google.protobuf.ByteString getModelVersionBytes();

  /**
   *
   *
   * <pre>
   * Required. Configuration details for the evaluation job.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.EvaluationJobConfig evaluation_job_config = 6;</code>
   *
   * @return Whether the evaluationJobConfig field is set.
   */
  boolean hasEvaluationJobConfig();
  /**
   *
   *
   * <pre>
   * Required. Configuration details for the evaluation job.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.EvaluationJobConfig evaluation_job_config = 6;</code>
   *
   * @return The evaluationJobConfig.
   */
  com.google.cloud.datalabeling.v1beta1.EvaluationJobConfig getEvaluationJobConfig();
  /**
   *
   *
   * <pre>
   * Required. Configuration details for the evaluation job.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.EvaluationJobConfig evaluation_job_config = 6;</code>
   */
  com.google.cloud.datalabeling.v1beta1.EvaluationJobConfigOrBuilder
      getEvaluationJobConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Name of the [AnnotationSpecSet][google.cloud.datalabeling.v1beta1.AnnotationSpecSet] describing all the
   * labels that your machine learning model outputs. You must create this
   * resource before you create an evaluation job and provide its name in the
   * following format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/annotationSpecSets/&lt;var&gt;{annotation_spec_set_id}&lt;/var&gt;"
   * </pre>
   *
   * <code>string annotation_spec_set = 7;</code>
   *
   * @return The annotationSpecSet.
   */
  java.lang.String getAnnotationSpecSet();
  /**
   *
   *
   * <pre>
   * Required. Name of the [AnnotationSpecSet][google.cloud.datalabeling.v1beta1.AnnotationSpecSet] describing all the
   * labels that your machine learning model outputs. You must create this
   * resource before you create an evaluation job and provide its name in the
   * following format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;/annotationSpecSets/&lt;var&gt;{annotation_spec_set_id}&lt;/var&gt;"
   * </pre>
   *
   * <code>string annotation_spec_set = 7;</code>
   *
   * @return The bytes for annotationSpecSet.
   */
  com.google.protobuf.ByteString getAnnotationSpecSetBytes();

  /**
   *
   *
   * <pre>
   * Required. Whether you want Data Labeling Service to provide ground truth
   * labels for prediction input. If you want the service to assign human
   * labelers to annotate your data, set this to `true`. If you want to provide
   * your own ground truth labels in the evaluation job's BigQuery table, set
   * this to `false`.
   * </pre>
   *
   * <code>bool label_missing_ground_truth = 8;</code>
   *
   * @return The labelMissingGroundTruth.
   */
  boolean getLabelMissingGroundTruth();

  /**
   *
   *
   * <pre>
   * Output only. Every time the evaluation job runs and an error occurs, the
   * failed attempt is appended to this array.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Attempt attempts = 9;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.Attempt> getAttemptsList();
  /**
   *
   *
   * <pre>
   * Output only. Every time the evaluation job runs and an error occurs, the
   * failed attempt is appended to this array.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Attempt attempts = 9;</code>
   */
  com.google.cloud.datalabeling.v1beta1.Attempt getAttempts(int index);
  /**
   *
   *
   * <pre>
   * Output only. Every time the evaluation job runs and an error occurs, the
   * failed attempt is appended to this array.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Attempt attempts = 9;</code>
   */
  int getAttemptsCount();
  /**
   *
   *
   * <pre>
   * Output only. Every time the evaluation job runs and an error occurs, the
   * failed attempt is appended to this array.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Attempt attempts = 9;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.AttemptOrBuilder>
      getAttemptsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Every time the evaluation job runs and an error occurs, the
   * failed attempt is appended to this array.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Attempt attempts = 9;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AttemptOrBuilder getAttemptsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Timestamp of when this evaluation job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp of when this evaluation job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp of when this evaluation job was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
