// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1beta1/target.proto

package com.google.cloud.scheduler.v1beta1;

public interface AppEngineHttpTargetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1beta1.AppEngineHttpTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HTTP method to use for the request. PATCH and OPTIONS are not
   * permitted.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.HttpMethod http_method = 1;</code>
   */
  int getHttpMethodValue();
  /**
   *
   *
   * <pre>
   * The HTTP method to use for the request. PATCH and OPTIONS are not
   * permitted.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.HttpMethod http_method = 1;</code>
   */
  com.google.cloud.scheduler.v1beta1.HttpMethod getHttpMethod();

  /**
   *
   *
   * <pre>
   * App Engine Routing setting for the job.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.AppEngineRouting app_engine_routing = 2;</code>
   */
  boolean hasAppEngineRouting();
  /**
   *
   *
   * <pre>
   * App Engine Routing setting for the job.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.AppEngineRouting app_engine_routing = 2;</code>
   */
  com.google.cloud.scheduler.v1beta1.AppEngineRouting getAppEngineRouting();
  /**
   *
   *
   * <pre>
   * App Engine Routing setting for the job.
   * </pre>
   *
   * <code>.google.cloud.scheduler.v1beta1.AppEngineRouting app_engine_routing = 2;</code>
   */
  com.google.cloud.scheduler.v1beta1.AppEngineRoutingOrBuilder getAppEngineRoutingOrBuilder();

  /**
   *
   *
   * <pre>
   * The relative URI.
   * The relative URL must begin with "/" and must be a valid HTTP relative URL.
   * It can contain a path, query string arguments, and `#` fragments.
   * If the relative URL is empty, then the root path "/" will be used.
   * No spaces are allowed, and the maximum length allowed is 2083 characters.
   * </pre>
   *
   * <code>string relative_uri = 3;</code>
   */
  java.lang.String getRelativeUri();
  /**
   *
   *
   * <pre>
   * The relative URI.
   * The relative URL must begin with "/" and must be a valid HTTP relative URL.
   * It can contain a path, query string arguments, and `#` fragments.
   * If the relative URL is empty, then the root path "/" will be used.
   * No spaces are allowed, and the maximum length allowed is 2083 characters.
   * </pre>
   *
   * <code>string relative_uri = 3;</code>
   */
  com.google.protobuf.ByteString getRelativeUriBytes();

  /**
   *
   *
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values. Headers can be set
   * when the job is created.
   * Cloud Scheduler sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Scheduler will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the job has an [body][google.cloud.scheduler.v1beta1.AppEngineHttpTarget.body], Cloud Scheduler sets the
   * following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explictly
   *   setting `Content-Type` to a particular media type when the job is
   *   created.
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Scheduler. This value is
   *   output only. It cannot be changed.
   * The headers below are output only. They cannot be set or overridden:
   * * `X-Google-*`: For Google internal use only.
   * * `X-AppEngine-*`: For Google internal use only. See
   *   [Reading request headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * In addition, some App Engine headers, which contain
   * job-specific information, are also be sent to the job handler; see
   * [request headers](https://cloud.google.com/appengine/docs/standard/python/config/cron#securing_urls_for_cron).
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  int getHeadersCount();
  /**
   *
   *
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values. Headers can be set
   * when the job is created.
   * Cloud Scheduler sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Scheduler will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the job has an [body][google.cloud.scheduler.v1beta1.AppEngineHttpTarget.body], Cloud Scheduler sets the
   * following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explictly
   *   setting `Content-Type` to a particular media type when the job is
   *   created.
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Scheduler. This value is
   *   output only. It cannot be changed.
   * The headers below are output only. They cannot be set or overridden:
   * * `X-Google-*`: For Google internal use only.
   * * `X-AppEngine-*`: For Google internal use only. See
   *   [Reading request headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * In addition, some App Engine headers, which contain
   * job-specific information, are also be sent to the job handler; see
   * [request headers](https://cloud.google.com/appengine/docs/standard/python/config/cron#securing_urls_for_cron).
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  boolean containsHeaders(java.lang.String key);
  /** Use {@link #getHeadersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getHeaders();
  /**
   *
   *
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values. Headers can be set
   * when the job is created.
   * Cloud Scheduler sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Scheduler will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the job has an [body][google.cloud.scheduler.v1beta1.AppEngineHttpTarget.body], Cloud Scheduler sets the
   * following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explictly
   *   setting `Content-Type` to a particular media type when the job is
   *   created.
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Scheduler. This value is
   *   output only. It cannot be changed.
   * The headers below are output only. They cannot be set or overridden:
   * * `X-Google-*`: For Google internal use only.
   * * `X-AppEngine-*`: For Google internal use only. See
   *   [Reading request headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * In addition, some App Engine headers, which contain
   * job-specific information, are also be sent to the job handler; see
   * [request headers](https://cloud.google.com/appengine/docs/standard/python/config/cron#securing_urls_for_cron).
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getHeadersMap();
  /**
   *
   *
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values. Headers can be set
   * when the job is created.
   * Cloud Scheduler sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Scheduler will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the job has an [body][google.cloud.scheduler.v1beta1.AppEngineHttpTarget.body], Cloud Scheduler sets the
   * following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explictly
   *   setting `Content-Type` to a particular media type when the job is
   *   created.
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Scheduler. This value is
   *   output only. It cannot be changed.
   * The headers below are output only. They cannot be set or overridden:
   * * `X-Google-*`: For Google internal use only.
   * * `X-AppEngine-*`: For Google internal use only. See
   *   [Reading request headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * In addition, some App Engine headers, which contain
   * job-specific information, are also be sent to the job handler; see
   * [request headers](https://cloud.google.com/appengine/docs/standard/python/config/cron#securing_urls_for_cron).
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  java.lang.String getHeadersOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * HTTP request headers.
   * This map contains the header field names and values. Headers can be set
   * when the job is created.
   * Cloud Scheduler sets some headers to default values:
   * * `User-Agent`: By default, this header is
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"`.
   *   This header can be modified, but Cloud Scheduler will append
   *   `"AppEngine-Google; (+http://code.google.com/appengine)"` to the
   *   modified `User-Agent`.
   * If the job has an [body][google.cloud.scheduler.v1beta1.AppEngineHttpTarget.body], Cloud Scheduler sets the
   * following headers:
   * * `Content-Type`: By default, the `Content-Type` header is set to
   *   `"application/octet-stream"`. The default can be overridden by explictly
   *   setting `Content-Type` to a particular media type when the job is
   *   created.
   *   For example, `Content-Type` can be set to `"application/json"`.
   * * `Content-Length`: This is computed by Cloud Scheduler. This value is
   *   output only. It cannot be changed.
   * The headers below are output only. They cannot be set or overridden:
   * * `X-Google-*`: For Google internal use only.
   * * `X-AppEngine-*`: For Google internal use only. See
   *   [Reading request headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers).
   * In addition, some App Engine headers, which contain
   * job-specific information, are also be sent to the job handler; see
   * [request headers](https://cloud.google.com/appengine/docs/standard/python/config/cron#securing_urls_for_cron).
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 4;</code>
   */
  java.lang.String getHeadersOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Body.
   * HTTP request body. A request body is allowed only if the HTTP method is
   * POST or PUT. It will result in invalid argument error to set a body on a
   * job with an incompatible [HttpMethod][google.cloud.scheduler.v1beta1.HttpMethod].
   * </pre>
   *
   * <code>bytes body = 5;</code>
   */
  com.google.protobuf.ByteString getBody();
}
