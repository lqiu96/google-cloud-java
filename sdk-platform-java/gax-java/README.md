Google API Extensions for Java
==============================

- [API Documentation](https://docs.cloud.google.com/java/docs/reference/gax/latest/overview)

Google API Extensions for Java (GAX Java) is a library which aids in the
development of client libraries for server APIs, based on [gRPC](https://grpc.io)
and Google API conventions.

Application code will rarely need to use most of the classes within this
library directly, but code generated automatically from the API definition
files can use services such as paged list iteration, request batching, and
polling of long-running operations to provide a more convenient and idiomatic
API surface to callers.

Currently, this library shouldn't be used independently of google-cloud-java, otherwise there is
a high risk of diamond dependency problems, because google-cloud-java uses beta features from this
library which can change in breaking ways between versions. See [VERSIONING](#versioning) for
more information.

> For contributors: `gax-java` builds with Maven (with Bazel support). See
> [DEVELOPMENT.md](./DEVELOPMENT.md) for build instructions. The published Maven Central
> artifacts are `com.google.api:gax`, `com.google.api:gax-grpc`, and `com.google.api:gax-httpjson`.

Quickstart
----------

Most applications should manage GAX versions through `com.google.cloud:libraries-bom` rather than
declaring direct GAX versions.

[//]: # ({x-version-update-start:gax:released})
If you are using Maven, add the core artifact and your transport artifact (`gax-grpc` and/or
`gax-httpjson`) to your `pom.xml` file:
```xml
<dependency>
  <groupId>com.google.api</groupId>
  <artifactId>gax</artifactId>
  <version>2.91.0</version>
</dependency>
<dependency>
  <groupId>com.google.api</groupId>
  <artifactId>gax-grpc</artifactId>
  <version>2.91.0</version>
</dependency>
<!-- Optional: for REST (HTTP/JSON) transport -->
<dependency>
  <groupId>com.google.api</groupId>
  <artifactId>gax-httpjson</artifactId>
  <version>2.91.0</version>
</dependency>
```

If you are using Gradle, add this to your dependencies:

```Groovy
implementation 'com.google.api:gax:2.91.0'
implementation 'com.google.api:gax-grpc:2.91.0'
// Optional: for REST (HTTP/JSON) transport
implementation 'com.google.api:gax-httpjson:2.91.0'
```

If you are using SBT, add this to your dependencies:

```Scala
libraryDependencies += "com.google.api" % "gax" % "2.91.0"
libraryDependencies += "com.google.api" % "gax-grpc" % "2.91.0"
// Optional: for REST (HTTP/JSON) transport
libraryDependencies += "com.google.api" % "gax-httpjson" % "2.91.0"
```
[//]: # ({x-version-update-end})

To find the latest version, see https://central.sonatype.com/artifact/com.google.api/gax.

Java Versions
-------------

Java 8 or above is required for using this library.

To build this project, JDK 11 or above is required.
The build produces Java bytecode targeted for Java 8.

The project uses Maven to build and also provides a Bazel build.

If you build this project with Bazel, it requires Bazel and basic UNIX commands
(e.g., `cat`).

Contributing
------------

Contributions to this library are always welcome and highly encouraged.

See the [CONTRIBUTING] documentation for more information on how to get started.

Versioning
----------

This library follows [Semantic Versioning](https://semver.org/), but with some
additional qualifications:

1. Components marked with `@BetaApi` are considered to be "0.x" features inside
   a "1.x" library. This means they can change between minor and patch releases
   in incompatible ways. These features should not be used by any library "B"
   that itself has consumers, unless the components of library B that use
   `@BetaApi` features are also marked with `@BetaApi`. Features marked as
   `@BetaApi` are on a path to eventually become "1.x" features with the marker
   removed.

   **Special exception for google-cloud-java**: google-cloud-java is
   allowed to depend on `@BetaApi` features without declaring the consuming
   code `@BetaApi`, because gax-java and google-cloud-java move in step
   with each other. For this reason, gax-java should not be used
   independently of google-cloud-java.

1. Components marked with `@InternalApi` are technically public, but are only
   public for technical reasons, because of the limitations of Java's access
   modifiers. For the purposes of semver, they should be considered private.

1. Components marked with `@InternalExtensionOnly` are stable for usage, but
   not for extension. Thus, methods will not be removed from interfaces marked
   with this annotation, but methods can be added, thus breaking any
   code implementing the interface. See the javadocs for more details on other
   consequences of this annotation.
1. Components marked with `@ObsoleteApi` are stable for usage in the current major version, 
   but will be marked with `@Deprecated` in a future major version.

### Submodule notes

- `gax` is stable (>= 1.0.0), so anything not marked `@BetaApi`, `@InternalApi`,
or `@InternalExtensionOnly` won't break between minor releases. Anything marked
`@InternalExtensionOnly` can only break extensions between minor releases.
- `gax-grpc` is stable (>= 1.0.0), so anything not marked `@BetaApi`, `@InternalApi`,
or `@InternalExtensionOnly` won't break between minor releases. Anything marked
`@InternalExtensionOnly` can only break extensions between minor releases.
- `gax-httpjson` is stable (>= 1.0.0), so anything not marked `@BetaApi`, `@InternalApi`,
or `@InternalExtensionOnly` won't break between minor releases. Anything marked
`@InternalExtensionOnly` can only break extensions between minor releases.

### Feature notes

- **Long Running Operations** - This feature is not yet considered stable.
- **Streaming** - Streaming features are not yet considered stable.
- **Batching** - Batching features are not yet considered stable.
- **Generated Code Support** - Features to support generated code is not yet
  considered stable.
- **Testing** - There are no plans to consider any code in the testlib jar to be stable.

Module Structure
----------------

This module contains the following Java packages:

### gax

Transport-independent part of GAX for Java.
The term "transport" in this context usually means the distinction between gRPC or REST.
Basically all logic, which does not depend explicitly on gRPC or REST goes to this package.
Examples of such transport-agnostic logic include retries, pagination, batching, tracing,
utilities, and core RPC abstractions.

- `com.google.api.gax.batching` - Contains general-purpose batching and flow control logic.
- `com.google.api.gax.core` - Contains core interfaces and classes such as credentials providers,
  executor providers, and `BackgroundResource`.
- `com.google.api.gax.logging` - Contains structured logging utilities.
- `com.google.api.gax.longrunning` - Contains classes related to long-running operations.
- `com.google.api.gax.nativeimage` - Contains GraalVM Native Image support helpers.
- `com.google.api.gax.paging` - Contains classes related to list calls that return
  results in pages.
- `com.google.api.gax.resumable` - Contains resumable upload session interfaces.
- `com.google.api.gax.retrying` - Contains classes related to retrying API calls.
- `com.google.api.gax.rpc` - Contains classes related to making RPC calls, settings, and call contexts.
- `com.google.api.gax.rpc.internal` - Internal RPC helper utilities.
- `com.google.api.gax.rpc.mtls` - Contains mTLS / Certificate-Based Access helpers.
- `com.google.api.gax.tracing` - Contains tracing and metrics instrumentation (`ApiTracer`,
  OpenTelemetry, and metrics factories).
- `com.google.api.gax.util` - Contains internal time-conversion utilities.

### gax-grpc

This depends on the `gax` module above and provides gRPC-specific implementations of the
interfaces and abstract classes defined in `gax`.

- `com.google.api.gax.grpc` - Contains classes that provide functionality on top
  of gRPC calls, channel pooling, and DirectPath.
- `com.google.api.gax.grpc.nativeimage` - Contains GraalVM Native Image support helpers for gRPC.
- `com.google.longrunning` - Contains the mix-in client for long-running operations
  implemented by a number of Google APIs over gRPC.
- `com.google.longrunning.stub` - Contains the gRPC stub classes for long-running operations.

### gax-httpjson

This module depends on `gax` and provides REST-specific implementations enabling generated
libraries to communicate with backend services over HTTP/JSON.

- `com.google.api.gax.httpjson` - Contains classes that provide functionality on
  top of HTTP/JSON calls.
- `com.google.api.gax.httpjson.longrunning` - Contains the mix-in client for long-running
  operations over HTTP/JSON.
- `com.google.api.gax.httpjson.longrunning.stub` - Contains the HTTP/JSON stub classes for
  long-running operations.

License
-------

BSD 3-Clause - See [LICENSE] for more information.

[CONTRIBUTING]: https://github.com/googleapis/google-cloud-java/blob/main/CONTRIBUTING.md
[LICENSE]: ./LICENSE

