# Google Auth Library

Open source authentication client library for Java.

[![stable](https://badges.github.io/stability-badges/dist/stable.svg)](https://github.com/badges/stability-badges)
[![Maven](https://img.shields.io/maven-central/v/com.google.auth/google-auth-library-credentials.svg)](https://img.shields.io/maven-central/v/com.google.auth/google-auth-library-credentials.svg)

## Documentation

See the [official guide](https://docs.cloud.google.com/java/getting-started/getting-started-with-google-auth-library) for ways
to authenticate to Google Cloud and for more information about the Google Auth Library.

See the [API Documentation](https://docs.cloud.google.com/java/docs/reference/google-auth-library/latest/overview) to see
the Javadocs for Google Auth Library.

## Modules

Import the [Bill of Materials (`google-auth-library-bom`)](bom/README.md) to align versions across
all modules (`groupId: com.google.auth`):

| Artifact ID | Module Directory | Purpose |
| --- | --- | --- |
| `google-auth-library-oauth2-http` | `oauth2_http/` | Primary OAuth 2.0, ADC, Workload Identity Federation, impersonation, and OIDC ID token library. |
| `google-auth-library-credentials` | `credentials/` | Lightweight, transport-agnostic `Credentials` and `ApiKeyCredentials` interfaces. |
| `google-auth-library-appengine` | `appengine/` | Legacy App Engine Standard `AppEngineCredentials` backed by the App Identity API. |
| `google-auth-library-cab-token-generator` | `cab-token-generator/` | Client-side Credential Access Boundary (CAB) token generator. |
| `google-auth-library-bom` | `bom/` | Maven BOM managing consistent versions for all Google Auth Library artifacts. |

## Versioning

This library follows [Semantic Versioning](https://semver.org/), but with some
additional qualifications:

1. Components marked with `@ObsoleteApi` are stable for usage in the current major version,
   but will be marked with `@Deprecated` in a future major version.
   **NOTE**: We reserve the right to mark anything as `@Deprecated` and introduce breaking
   changes in a minor version to fix any ***critical bugs and
   vulnerabilities***.

2. Components marked with `@InternalApi` are technically public, but are only
   public for technical reasons, because of the limitations of Java's access
   modifiers. For the purposes of semver, they should be considered private.

3. Components marked with `@InternalExtensionOnly` are stable for usage, but
   not for extension. Thus, methods will not be removed from interfaces marked
   with this annotation, but methods can be added, thus breaking any
   code implementing the interface. See the javadocs for more details on other
   consequences of this annotation.

4. Components marked with `@BetaApi` are considered to be "0.x" features inside
   a "1.x" library. This means they can change between minor and patch releases
   in incompatible ways. These features should not be used by any library "B"
   that itself has consumers, unless the components of library B that use
   `@BetaApi` features are also marked with `@BetaApi`. Features marked as
   `@BetaApi` are on a path to eventually become "1.x" features with the marker
   removed.

## Contributing

Contributions to this library are always welcome and highly encouraged.

See [CONTRIBUTING](../CONTRIBUTING.md) documentation for more information on how to get started.

Please note that this project is released with a Contributor Code of Conduct. By participating in
this project you agree to abide by its terms. See [Code of Conduct](../CODE_OF_CONDUCT.md) for more
information.

## Running the Tests

To run the tests you will need:

* Maven 3+

```bash
$ mvn test
```

## License

BSD 3-Clause - See [BSD 3-Clause License](https://opensource.org/license/BSD-3-Clause) and [pom.xml](pom.xml) for more information.
