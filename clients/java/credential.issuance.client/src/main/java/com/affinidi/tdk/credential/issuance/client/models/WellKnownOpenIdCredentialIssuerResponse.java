/*
 * CredentialIssuanceService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.credential.issuance.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.affinidi.tdk.credential.issuance.client.models.WellKnownOpenIdCredentialIssuerResponseCredentialsSupportedInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * WellKnownOpenIdCredentialIssuerResponse
 */
@JsonPropertyOrder({
  WellKnownOpenIdCredentialIssuerResponse.JSON_PROPERTY_AUTHORIZATION_ENDPOINT,
  WellKnownOpenIdCredentialIssuerResponse.JSON_PROPERTY_CREDENTIAL_ENDPOINT,
  WellKnownOpenIdCredentialIssuerResponse.JSON_PROPERTY_CREDENTIAL_ISSUER,
  WellKnownOpenIdCredentialIssuerResponse.JSON_PROPERTY_CREDENTIALS_SUPPORTED,
  WellKnownOpenIdCredentialIssuerResponse.JSON_PROPERTY_DEFERRED_CREDENTIAL_ENDPOINT,
  WellKnownOpenIdCredentialIssuerResponse.JSON_PROPERTY_GRANT_TYPES_SUPPORTED,
  WellKnownOpenIdCredentialIssuerResponse.JSON_PROPERTY_JWKS_URI,
  WellKnownOpenIdCredentialIssuerResponse.JSON_PROPERTY_SCOPES_SUPPORTED,
  WellKnownOpenIdCredentialIssuerResponse.JSON_PROPERTY_TOKEN_ENDPOINT,
  WellKnownOpenIdCredentialIssuerResponse.JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHODS_SUPPORTED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WellKnownOpenIdCredentialIssuerResponse extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_AUTHORIZATION_ENDPOINT = "authorization_endpoint";
  private String authorizationEndpoint;

  public static final String JSON_PROPERTY_CREDENTIAL_ENDPOINT = "credential_endpoint";
  private String credentialEndpoint;

  public static final String JSON_PROPERTY_CREDENTIAL_ISSUER = "credential_issuer";
  private String credentialIssuer;

  public static final String JSON_PROPERTY_CREDENTIALS_SUPPORTED = "credentials_supported";
  private List<WellKnownOpenIdCredentialIssuerResponseCredentialsSupportedInner> credentialsSupported = new ArrayList<>();

  public static final String JSON_PROPERTY_DEFERRED_CREDENTIAL_ENDPOINT = "deferred_credential_endpoint";
  private String deferredCredentialEndpoint;

  /**
   * Gets or Sets grantTypesSupported
   */
  public enum GrantTypesSupportedEnum {
    AUTHORIZATION_CODE("authorization_code"),
    
    URN_IETF_PARAMS_OAUTH_GRANT_TYPE_PRE_AUTHORIZED_CODE("urn:ietf:params:oauth:grant-type:pre-authorized_code");

    private String value;

    GrantTypesSupportedEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantTypesSupportedEnum fromValue(String value) {
      for (GrantTypesSupportedEnum b : GrantTypesSupportedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_GRANT_TYPES_SUPPORTED = "grant_types_supported";
  private List<GrantTypesSupportedEnum> grantTypesSupported = new ArrayList<>();

  public static final String JSON_PROPERTY_JWKS_URI = "jwks_uri";
  private String jwksUri;

  /**
   * Gets or Sets scopesSupported
   */
  public enum ScopesSupportedEnum {
    OPENID("openid");

    private String value;

    ScopesSupportedEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopesSupportedEnum fromValue(String value) {
      for (ScopesSupportedEnum b : ScopesSupportedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCOPES_SUPPORTED = "scopes_supported";
  private List<ScopesSupportedEnum> scopesSupported = new ArrayList<>();

  public static final String JSON_PROPERTY_TOKEN_ENDPOINT = "token_endpoint";
  private String tokenEndpoint;

  /**
   * Gets or Sets tokenEndpointAuthMethodsSupported
   */
  public enum TokenEndpointAuthMethodsSupportedEnum {
    CLIENT_SECRET_POST("client_secret_post"),
    
    CLIENT_SECRET_BASIC("client_secret_basic"),
    
    NONE("none");

    private String value;

    TokenEndpointAuthMethodsSupportedEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TokenEndpointAuthMethodsSupportedEnum fromValue(String value) {
      for (TokenEndpointAuthMethodsSupportedEnum b : TokenEndpointAuthMethodsSupportedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHODS_SUPPORTED = "token_endpoint_auth_methods_supported";
  private List<TokenEndpointAuthMethodsSupportedEnum> tokenEndpointAuthMethodsSupported = new ArrayList<>();

  public WellKnownOpenIdCredentialIssuerResponse() {

  }

  public WellKnownOpenIdCredentialIssuerResponse authorizationEndpoint(String authorizationEndpoint) {
    
    this.authorizationEndpoint = authorizationEndpoint;
    return this;
  }

  /**
   * Get authorizationEndpoint
   * @return authorizationEndpoint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorizationEndpoint() {
    return authorizationEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationEndpoint(String authorizationEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
  }

  public WellKnownOpenIdCredentialIssuerResponse credentialEndpoint(String credentialEndpoint) {
    
    this.credentialEndpoint = credentialEndpoint;
    return this;
  }

  /**
   * Get credentialEndpoint
   * @return credentialEndpoint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDENTIAL_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCredentialEndpoint() {
    return credentialEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentialEndpoint(String credentialEndpoint) {
    this.credentialEndpoint = credentialEndpoint;
  }

  public WellKnownOpenIdCredentialIssuerResponse credentialIssuer(String credentialIssuer) {
    
    this.credentialIssuer = credentialIssuer;
    return this;
  }

  /**
   * Get credentialIssuer
   * @return credentialIssuer
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDENTIAL_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCredentialIssuer() {
    return credentialIssuer;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentialIssuer(String credentialIssuer) {
    this.credentialIssuer = credentialIssuer;
  }

  public WellKnownOpenIdCredentialIssuerResponse credentialsSupported(List<WellKnownOpenIdCredentialIssuerResponseCredentialsSupportedInner> credentialsSupported) {
    
    this.credentialsSupported = credentialsSupported;
    return this;
  }

  public WellKnownOpenIdCredentialIssuerResponse addCredentialsSupportedItem(WellKnownOpenIdCredentialIssuerResponseCredentialsSupportedInner credentialsSupportedItem) {
    if (this.credentialsSupported == null) {
      this.credentialsSupported = new ArrayList<>();
    }
    this.credentialsSupported.add(credentialsSupportedItem);
    return this;
  }

  /**
   * Get credentialsSupported
   * @return credentialsSupported
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDENTIALS_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WellKnownOpenIdCredentialIssuerResponseCredentialsSupportedInner> getCredentialsSupported() {
    return credentialsSupported;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIALS_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentialsSupported(List<WellKnownOpenIdCredentialIssuerResponseCredentialsSupportedInner> credentialsSupported) {
    this.credentialsSupported = credentialsSupported;
  }

  public WellKnownOpenIdCredentialIssuerResponse deferredCredentialEndpoint(String deferredCredentialEndpoint) {
    
    this.deferredCredentialEndpoint = deferredCredentialEndpoint;
    return this;
  }

  /**
   * Get deferredCredentialEndpoint
   * @return deferredCredentialEndpoint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFERRED_CREDENTIAL_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeferredCredentialEndpoint() {
    return deferredCredentialEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_DEFERRED_CREDENTIAL_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeferredCredentialEndpoint(String deferredCredentialEndpoint) {
    this.deferredCredentialEndpoint = deferredCredentialEndpoint;
  }

  public WellKnownOpenIdCredentialIssuerResponse grantTypesSupported(List<GrantTypesSupportedEnum> grantTypesSupported) {
    
    this.grantTypesSupported = grantTypesSupported;
    return this;
  }

  public WellKnownOpenIdCredentialIssuerResponse addGrantTypesSupportedItem(GrantTypesSupportedEnum grantTypesSupportedItem) {
    if (this.grantTypesSupported == null) {
      this.grantTypesSupported = new ArrayList<>();
    }
    this.grantTypesSupported.add(grantTypesSupportedItem);
    return this;
  }

  /**
   * Get grantTypesSupported
   * @return grantTypesSupported
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRANT_TYPES_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GrantTypesSupportedEnum> getGrantTypesSupported() {
    return grantTypesSupported;
  }


  @JsonProperty(JSON_PROPERTY_GRANT_TYPES_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrantTypesSupported(List<GrantTypesSupportedEnum> grantTypesSupported) {
    this.grantTypesSupported = grantTypesSupported;
  }

  public WellKnownOpenIdCredentialIssuerResponse jwksUri(String jwksUri) {
    
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * Get jwksUri
   * @return jwksUri
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JWKS_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJwksUri() {
    return jwksUri;
  }


  @JsonProperty(JSON_PROPERTY_JWKS_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }

  public WellKnownOpenIdCredentialIssuerResponse scopesSupported(List<ScopesSupportedEnum> scopesSupported) {
    
    this.scopesSupported = scopesSupported;
    return this;
  }

  public WellKnownOpenIdCredentialIssuerResponse addScopesSupportedItem(ScopesSupportedEnum scopesSupportedItem) {
    if (this.scopesSupported == null) {
      this.scopesSupported = new ArrayList<>();
    }
    this.scopesSupported.add(scopesSupportedItem);
    return this;
  }

  /**
   * Get scopesSupported
   * @return scopesSupported
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPES_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ScopesSupportedEnum> getScopesSupported() {
    return scopesSupported;
  }


  @JsonProperty(JSON_PROPERTY_SCOPES_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScopesSupported(List<ScopesSupportedEnum> scopesSupported) {
    this.scopesSupported = scopesSupported;
  }

  public WellKnownOpenIdCredentialIssuerResponse tokenEndpoint(String tokenEndpoint) {
    
    this.tokenEndpoint = tokenEndpoint;
    return this;
  }

  /**
   * Get tokenEndpoint
   * @return tokenEndpoint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenEndpoint() {
    return tokenEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
  }

  public WellKnownOpenIdCredentialIssuerResponse tokenEndpointAuthMethodsSupported(List<TokenEndpointAuthMethodsSupportedEnum> tokenEndpointAuthMethodsSupported) {
    
    this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
    return this;
  }

  public WellKnownOpenIdCredentialIssuerResponse addTokenEndpointAuthMethodsSupportedItem(TokenEndpointAuthMethodsSupportedEnum tokenEndpointAuthMethodsSupportedItem) {
    if (this.tokenEndpointAuthMethodsSupported == null) {
      this.tokenEndpointAuthMethodsSupported = new ArrayList<>();
    }
    this.tokenEndpointAuthMethodsSupported.add(tokenEndpointAuthMethodsSupportedItem);
    return this;
  }

  /**
   * Get tokenEndpointAuthMethodsSupported
   * @return tokenEndpointAuthMethodsSupported
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHODS_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TokenEndpointAuthMethodsSupportedEnum> getTokenEndpointAuthMethodsSupported() {
    return tokenEndpointAuthMethodsSupported;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHODS_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenEndpointAuthMethodsSupported(List<TokenEndpointAuthMethodsSupportedEnum> tokenEndpointAuthMethodsSupported) {
    this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WellKnownOpenIdCredentialIssuerResponse wellKnownOpenIdCredentialIssuerResponse = (WellKnownOpenIdCredentialIssuerResponse) o;
    return Objects.equals(this.authorizationEndpoint, wellKnownOpenIdCredentialIssuerResponse.authorizationEndpoint) &&
        Objects.equals(this.credentialEndpoint, wellKnownOpenIdCredentialIssuerResponse.credentialEndpoint) &&
        Objects.equals(this.credentialIssuer, wellKnownOpenIdCredentialIssuerResponse.credentialIssuer) &&
        Objects.equals(this.credentialsSupported, wellKnownOpenIdCredentialIssuerResponse.credentialsSupported) &&
        Objects.equals(this.deferredCredentialEndpoint, wellKnownOpenIdCredentialIssuerResponse.deferredCredentialEndpoint) &&
        Objects.equals(this.grantTypesSupported, wellKnownOpenIdCredentialIssuerResponse.grantTypesSupported) &&
        Objects.equals(this.jwksUri, wellKnownOpenIdCredentialIssuerResponse.jwksUri) &&
        Objects.equals(this.scopesSupported, wellKnownOpenIdCredentialIssuerResponse.scopesSupported) &&
        Objects.equals(this.tokenEndpoint, wellKnownOpenIdCredentialIssuerResponse.tokenEndpoint) &&
        Objects.equals(this.tokenEndpointAuthMethodsSupported, wellKnownOpenIdCredentialIssuerResponse.tokenEndpointAuthMethodsSupported) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationEndpoint, credentialEndpoint, credentialIssuer, credentialsSupported, deferredCredentialEndpoint, grantTypesSupported, jwksUri, scopesSupported, tokenEndpoint, tokenEndpointAuthMethodsSupported, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WellKnownOpenIdCredentialIssuerResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
    sb.append("    credentialEndpoint: ").append(toIndentedString(credentialEndpoint)).append("\n");
    sb.append("    credentialIssuer: ").append(toIndentedString(credentialIssuer)).append("\n");
    sb.append("    credentialsSupported: ").append(toIndentedString(credentialsSupported)).append("\n");
    sb.append("    deferredCredentialEndpoint: ").append(toIndentedString(deferredCredentialEndpoint)).append("\n");
    sb.append("    grantTypesSupported: ").append(toIndentedString(grantTypesSupported)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    scopesSupported: ").append(toIndentedString(scopesSupported)).append("\n");
    sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
    sb.append("    tokenEndpointAuthMethodsSupported: ").append(toIndentedString(tokenEndpointAuthMethodsSupported)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `authorization_endpoint` to the URL query string
    if (getAuthorizationEndpoint() != null) {
      try {
        joiner.add(String.format("%sauthorization_endpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizationEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `credential_endpoint` to the URL query string
    if (getCredentialEndpoint() != null) {
      try {
        joiner.add(String.format("%scredential_endpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCredentialEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `credential_issuer` to the URL query string
    if (getCredentialIssuer() != null) {
      try {
        joiner.add(String.format("%scredential_issuer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCredentialIssuer()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `credentials_supported` to the URL query string
    if (getCredentialsSupported() != null) {
      for (int i = 0; i < getCredentialsSupported().size(); i++) {
        if (getCredentialsSupported().get(i) != null) {
          joiner.add(getCredentialsSupported().get(i).toUrlQueryString(String.format("%scredentials_supported%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `deferred_credential_endpoint` to the URL query string
    if (getDeferredCredentialEndpoint() != null) {
      try {
        joiner.add(String.format("%sdeferred_credential_endpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeferredCredentialEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `grant_types_supported` to the URL query string
    if (getGrantTypesSupported() != null) {
      for (int i = 0; i < getGrantTypesSupported().size(); i++) {
        try {
          joiner.add(String.format("%sgrant_types_supported%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getGrantTypesSupported().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `jwks_uri` to the URL query string
    if (getJwksUri() != null) {
      try {
        joiner.add(String.format("%sjwks_uri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJwksUri()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `scopes_supported` to the URL query string
    if (getScopesSupported() != null) {
      for (int i = 0; i < getScopesSupported().size(); i++) {
        try {
          joiner.add(String.format("%sscopes_supported%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getScopesSupported().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `token_endpoint` to the URL query string
    if (getTokenEndpoint() != null) {
      try {
        joiner.add(String.format("%stoken_endpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `token_endpoint_auth_methods_supported` to the URL query string
    if (getTokenEndpointAuthMethodsSupported() != null) {
      for (int i = 0; i < getTokenEndpointAuthMethodsSupported().size(); i++) {
        try {
          joiner.add(String.format("%stoken_endpoint_auth_methods_supported%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTokenEndpointAuthMethodsSupported().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

