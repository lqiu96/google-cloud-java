/*
 * Copyright 2026 Google LLC
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *    * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *
 *    * Neither the name of Google LLC nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.google.auth.oauth2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.api.client.json.GenericJson;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.auth.Credentials;
import com.google.auth.http.HttpTransportFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/** Tests validation of the JSON {@code universe_domain} field across credential loaders. */
class JsonUniverseDomainValidationTest {

  private static final String CUSTOM_UNIVERSE_DOMAIN = "example.com";
  private static final HttpTransportFactory MOCK_TRANSPORT_FACTORY = MockHttpTransport::new;
  private static final String[] INVALID_UNIVERSE_DOMAIN_ENTRIES = {
    "\"universe_domain\":\"\"", "\"universe_domain\":\"   \"", "\"universe_domain\":123"
  };
  private static final String[] BLANK_UNIVERSE_DOMAIN_ENTRIES = {
    "\"universe_domain\":\"\"", "\"universe_domain\":\"   \""
  };

  private static String rsaPrivateKeyPkcs8;
  private static String ecPrivateKeyPkcs8;

  @BeforeAll
  static void generateKeys() throws Exception {
    KeyPairGenerator rsaGenerator = KeyPairGenerator.getInstance("RSA");
    rsaGenerator.initialize(2048);
    KeyPair rsaPair = rsaGenerator.generateKeyPair();
    rsaPrivateKeyPkcs8 = encodePkcs8Pem(rsaPair.getPrivate().getEncoded());

    KeyPairGenerator ecGenerator = KeyPairGenerator.getInstance("EC");
    ecGenerator.initialize(new ECGenParameterSpec("secp256r1"));
    KeyPair ecPair = ecGenerator.generateKeyPair();
    ecPrivateKeyPkcs8 = encodePkcs8Pem(ecPair.getPrivate().getEncoded());
  }

  private static String encodePkcs8Pem(byte[] derBytes) {
    String base64 =
        Base64.getMimeEncoder(64, "\n".getBytes(StandardCharsets.US_ASCII))
            .encodeToString(derBytes);
    return "-----BEGIN " + "PRIVATE KEY-----\n" + base64 + "\n-----END " + "PRIVATE KEY-----\n";
  }

  private static InputStream toStream(String json) {
    return new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
  }

  private static String jsonString(String value) {
    return "\"" + value.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n") + "\"";
  }

  private static String serviceAccountJson(String universeDomainEntry) {
    return "{"
        + "\"type\":\"service_account\","
        + "\"project_id\":\"test-project\","
        + "\"private_key_id\":\"key-id-1\","
        + "\"private_key\":"
        + jsonString(rsaPrivateKeyPkcs8)
        + ","
        + "\"client_email\":\"test@test-project.iam.gserviceaccount.com\","
        + "\"client_id\":\"1234567890\""
        + (universeDomainEntry == null ? "" : "," + universeDomainEntry)
        + "}";
  }

  private static String externalAccountJson(String universeDomainEntry) {
    return "{"
        + "\"type\":\"external_account\","
        + "\"audience\":\"//iam.googleapis.com/projects/123/locations/global/"
        + "workloadIdentityPools/pool/providers/provider\","
        + "\"subject_token_type\":\"urn:ietf:params:oauth:token-type:jwt\","
        + "\"token_url\":\"https://sts.example.com/v1/token\","
        + "\"credential_source\":{\"file\":\"/tmp/test-token\"}"
        + (universeDomainEntry == null ? "" : "," + universeDomainEntry)
        + "}";
  }

  private static String externalAccountAuthorizedUserJson(String universeDomainEntry) {
    return "{"
        + "\"type\":\"external_account_authorized_user\","
        + "\"audience\":\"//iam.googleapis.com/locations/global/workforcePools/pool/providers/p\","
        + "\"refresh_token\":\"dummy-refresh-token\","
        + "\"token_url\":\"https://sts.example.com/v1/oauthtoken\","
        + "\"client_id\":\"dummy-client-id\","
        + "\"client_secret\":\"dummy-client-secret\""
        + (universeDomainEntry == null ? "" : "," + universeDomainEntry)
        + "}";
  }

  private static String userCredentialsJson(String universeDomainEntry) {
    return "{"
        + "\"type\":\"authorized_user\","
        + "\"client_id\":\"dummy-client-id\","
        + "\"client_secret\":\"dummy-client-secret\","
        + "\"refresh_token\":\"dummy-refresh-token\""
        + (universeDomainEntry == null ? "" : "," + universeDomainEntry)
        + "}";
  }

  private static String impersonatedCredentialsJson(
      String topLevelUniverseEntry, String sourceUniverseEntry) {
    return "{"
        + "\"type\":\"impersonated_service_account\","
        + "\"service_account_impersonation_url\":"
        + "\"https://iamcredentials.googleapis.com/v1/projects/-/serviceAccounts/"
        + "target@test-project.iam.gserviceaccount.com:generateAccessToken\","
        + "\"source_credentials\":"
        + serviceAccountJson(sourceUniverseEntry)
        + (topLevelUniverseEntry == null ? "" : "," + topLevelUniverseEntry)
        + "}";
  }

  private static String gdchCredentialsJson(String universeDomainEntry) {
    return "{"
        + "\"type\":\"gdch_service_account\","
        + "\"format_version\":\"1\","
        + "\"project\":\"test-project\","
        + "\"private_key_id\":\"key-id-1\","
        + "\"private_key\":"
        + jsonString(ecPrivateKeyPkcs8)
        + ","
        + "\"name\":\"test-identity\","
        + "\"token_uri\":\"https://service-identity.example.com/authenticate\""
        + (universeDomainEntry == null ? "" : "," + universeDomainEntry)
        + "}";
  }

  @Test
  void serviceAccountCredentials_fromStream_rejectsInvalidUniverseDomain() {
    for (String entry : INVALID_UNIVERSE_DOMAIN_ENTRIES) {
      String json = serviceAccountJson(entry);
      assertThrows(
          IOException.class,
          () -> ServiceAccountCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
      assertThrows(
          IOException.class,
          () -> GoogleCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
    }
  }

  @Test
  void serviceAccountCredentials_fromStream_nullUniverseDomainDefaultsToGoogleDefaultUniverse()
      throws IOException {
    ServiceAccountCredentials creds =
        ServiceAccountCredentials.fromStream(
            toStream(serviceAccountJson("\"universe_domain\":null")), MOCK_TRANSPORT_FACTORY);
    assertEquals(Credentials.GOOGLE_DEFAULT_UNIVERSE, creds.getUniverseDomain());
    assertFalse(creds.isExplicitUniverseDomain());
  }

  @Test
  void serviceAccountCredentials_fromStream_validUniverseDomainPreserved() throws IOException {
    ServiceAccountCredentials creds =
        ServiceAccountCredentials.fromStream(
            toStream(serviceAccountJson("\"universe_domain\":\"" + CUSTOM_UNIVERSE_DOMAIN + "\"")),
            MOCK_TRANSPORT_FACTORY);
    assertEquals(CUSTOM_UNIVERSE_DOMAIN, creds.getUniverseDomain());
    assertTrue(creds.isExplicitUniverseDomain());
  }

  @Test
  void serviceAccountJwtAccessCredentials_fromStream_rejectsInvalidUniverseDomain() {
    for (String entry : INVALID_UNIVERSE_DOMAIN_ENTRIES) {
      String json = serviceAccountJson(entry);
      assertThrows(
          IOException.class, () -> ServiceAccountJwtAccessCredentials.fromStream(toStream(json)));
    }
  }

  @Test
  void
      serviceAccountJwtAccessCredentials_fromStream_nullUniverseDomainDefaultsToGoogleDefaultUniverse()
          throws IOException {
    ServiceAccountJwtAccessCredentials creds =
        ServiceAccountJwtAccessCredentials.fromStream(
            toStream(serviceAccountJson("\"universe_domain\":null")));
    assertEquals(Credentials.GOOGLE_DEFAULT_UNIVERSE, creds.getUniverseDomain());
  }

  @Test
  void serviceAccountJwtAccessCredentials_fromStream_validUniverseDomainPreserved()
      throws IOException {
    ServiceAccountJwtAccessCredentials creds =
        ServiceAccountJwtAccessCredentials.fromStream(
            toStream(serviceAccountJson("\"universe_domain\":\"" + CUSTOM_UNIVERSE_DOMAIN + "\"")));
    assertEquals(CUSTOM_UNIVERSE_DOMAIN, creds.getUniverseDomain());
  }

  @Test
  void externalAccountCredentials_fromStream_rejectsInvalidUniverseDomain() {
    for (String entry : INVALID_UNIVERSE_DOMAIN_ENTRIES) {
      String json = externalAccountJson(entry);
      assertThrows(
          CredentialFormatException.class,
          () -> ExternalAccountCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
      assertThrows(
          IOException.class,
          () -> GoogleCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
    }
  }

  @Test
  void externalAccountCredentials_fromJson_rejectsBlankUniverseDomain() {
    for (String blankValue : new String[] {"", "   "}) {
      GenericJson json = new GenericJson();
      json.put("type", "external_account");
      json.put(
          "audience",
          "//iam.googleapis.com/projects/123/locations/global/workloadIdentityPools/p/providers/pr");
      json.put("subject_token_type", "urn:ietf:params:oauth:token-type:jwt");
      json.put("token_url", "https://sts.example.com/v1/token");
      json.put("credential_source", Collections.singletonMap("file", "/tmp/test-token"));
      json.put("universe_domain", blankValue);

      assertThrows(
          IllegalArgumentException.class,
          () -> ExternalAccountCredentials.fromJson(json, MOCK_TRANSPORT_FACTORY));
    }
  }

  @Test
  void externalAccountCredentials_fromStream_nullUniverseDomainDefaultsToGoogleDefaultUniverse()
      throws IOException {
    ExternalAccountCredentials creds =
        ExternalAccountCredentials.fromStream(
            toStream(externalAccountJson("\"universe_domain\":null")), MOCK_TRANSPORT_FACTORY);
    assertInstanceOf(IdentityPoolCredentials.class, creds);
    assertEquals(Credentials.GOOGLE_DEFAULT_UNIVERSE, creds.getUniverseDomain());
    assertFalse(creds.isExplicitUniverseDomain());
  }

  @Test
  void externalAccountCredentials_fromStream_validUniverseDomainPreserved() throws IOException {
    ExternalAccountCredentials creds =
        ExternalAccountCredentials.fromStream(
            toStream(externalAccountJson("\"universe_domain\":\"" + CUSTOM_UNIVERSE_DOMAIN + "\"")),
            MOCK_TRANSPORT_FACTORY);
    assertEquals(CUSTOM_UNIVERSE_DOMAIN, creds.getUniverseDomain());
    assertTrue(creds.isExplicitUniverseDomain());
  }

  @Test
  void externalAccountAuthorizedUserCredentials_fromStream_rejectsInvalidUniverseDomain() {
    for (String entry : INVALID_UNIVERSE_DOMAIN_ENTRIES) {
      String json = externalAccountAuthorizedUserJson(entry);
      assertThrows(
          IOException.class,
          () ->
              ExternalAccountAuthorizedUserCredentials.fromStream(
                  toStream(json), MOCK_TRANSPORT_FACTORY));
      assertThrows(
          IOException.class,
          () -> GoogleCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
    }
  }

  @Test
  void
      externalAccountAuthorizedUserCredentials_fromStream_nullUniverseDomainDefaultsToGoogleDefaultUniverse()
          throws IOException {
    ExternalAccountAuthorizedUserCredentials creds =
        ExternalAccountAuthorizedUserCredentials.fromStream(
            toStream(externalAccountAuthorizedUserJson("\"universe_domain\":null")),
            MOCK_TRANSPORT_FACTORY);
    assertEquals(Credentials.GOOGLE_DEFAULT_UNIVERSE, creds.getUniverseDomain());
    assertFalse(creds.isExplicitUniverseDomain());
  }

  @Test
  void externalAccountAuthorizedUserCredentials_fromStream_validUniverseDomainPreserved()
      throws IOException {
    ExternalAccountAuthorizedUserCredentials creds =
        ExternalAccountAuthorizedUserCredentials.fromStream(
            toStream(
                externalAccountAuthorizedUserJson(
                    "\"universe_domain\":\"" + CUSTOM_UNIVERSE_DOMAIN + "\"")),
            MOCK_TRANSPORT_FACTORY);
    assertEquals(CUSTOM_UNIVERSE_DOMAIN, creds.getUniverseDomain());
    assertTrue(creds.isExplicitUniverseDomain());
  }

  @Test
  void userCredentials_fromStream_rejectsInvalidUniverseDomain() {
    for (String entry : INVALID_UNIVERSE_DOMAIN_ENTRIES) {
      String json = userCredentialsJson(entry);
      assertThrows(
          IOException.class,
          () -> UserCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
      assertThrows(
          IOException.class,
          () -> GoogleCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
    }
  }

  @Test
  void userCredentials_fromStream_nullUniverseDomainDefaultsToGoogleDefaultUniverse()
      throws IOException {
    UserCredentials creds =
        UserCredentials.fromStream(
            toStream(userCredentialsJson("\"universe_domain\":null")), MOCK_TRANSPORT_FACTORY);
    assertEquals(Credentials.GOOGLE_DEFAULT_UNIVERSE, creds.getUniverseDomain());
  }

  @Test
  void impersonatedCredentials_fromStream_rejectsInvalidTopLevelUniverseDomain() {
    for (String entry : INVALID_UNIVERSE_DOMAIN_ENTRIES) {
      String json = impersonatedCredentialsJson(entry, null);
      assertThrows(
          IOException.class,
          () -> ImpersonatedCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
      assertThrows(
          IOException.class,
          () -> GoogleCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
    }
  }

  @Test
  void impersonatedCredentials_fromStream_rejectsInvalidSourceUniverseDomain() {
    for (String entry : BLANK_UNIVERSE_DOMAIN_ENTRIES) {
      String json = impersonatedCredentialsJson(null, entry);
      assertThrows(
          IOException.class,
          () -> ImpersonatedCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
      assertThrows(
          IOException.class,
          () -> GoogleCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
    }
  }

  @Test
  void
      impersonatedCredentials_fromStream_nullTopLevelUniverseDomainDefaultsToGoogleDefaultUniverse()
          throws IOException {
    ImpersonatedCredentials creds =
        ImpersonatedCredentials.fromStream(
            toStream(impersonatedCredentialsJson("\"universe_domain\":null", null)),
            MOCK_TRANSPORT_FACTORY);
    assertEquals(Credentials.GOOGLE_DEFAULT_UNIVERSE, creds.getUniverseDomain());
  }

  @Test
  void gdchCredentials_fromStream_rejectsInvalidUniverseDomain() {
    for (String entry : INVALID_UNIVERSE_DOMAIN_ENTRIES) {
      String json = gdchCredentialsJson(entry);
      assertThrows(
          IOException.class,
          () -> GdchCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
      assertThrows(
          IOException.class,
          () -> GoogleCredentials.fromStream(toStream(json), MOCK_TRANSPORT_FACTORY));
    }
  }

  @Test
  void gdchCredentials_fromStream_nullUniverseDomainSucceeds() throws IOException {
    GdchCredentials creds =
        GdchCredentials.fromStream(
            toStream(gdchCredentialsJson("\"universe_domain\":null")), MOCK_TRANSPORT_FACTORY);
    assertEquals("test-project", creds.getProjectId());
  }

  @Test
  void extractUniverseDomainFromJson_handlesAbsentAndJavaNull() throws IOException {
    Map<String, Object> absent = new LinkedHashMap<>();
    assertNull(GoogleCredentials.extractUniverseDomainFromJson(absent));

    Map<String, Object> withNull = new LinkedHashMap<>();
    withNull.put("universe_domain", null);
    assertNull(GoogleCredentials.extractUniverseDomainFromJson(withNull));
  }
}
