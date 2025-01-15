/*
 * IotaService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.iota.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * InitiateDataSharingRequestInput
 */
@JsonPropertyOrder({
  InitiateDataSharingRequestInput.JSON_PROPERTY_QUERY_ID,
  InitiateDataSharingRequestInput.JSON_PROPERTY_CORRELATION_ID,
  InitiateDataSharingRequestInput.JSON_PROPERTY_TOKEN_MAX_AGE,
  InitiateDataSharingRequestInput.JSON_PROPERTY_NONCE,
  InitiateDataSharingRequestInput.JSON_PROPERTY_REDIRECT_URI,
  InitiateDataSharingRequestInput.JSON_PROPERTY_CONFIGURATION_ID,
  InitiateDataSharingRequestInput.JSON_PROPERTY_MODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:42:30.065956999Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InitiateDataSharingRequestInput {
  public static final String JSON_PROPERTY_QUERY_ID = "queryId";
  private String queryId;

  public static final String JSON_PROPERTY_CORRELATION_ID = "correlationId";
  private String correlationId;

  public static final String JSON_PROPERTY_TOKEN_MAX_AGE = "tokenMaxAge";
  private BigDecimal tokenMaxAge;

  public static final String JSON_PROPERTY_NONCE = "nonce";
  private String nonce;

  public static final String JSON_PROPERTY_REDIRECT_URI = "redirectUri";
  private String redirectUri;

  public static final String JSON_PROPERTY_CONFIGURATION_ID = "configurationId";
  private String configurationId;

  /**
   * Determines whether to handle the data-sharing request using the WebSocket or Redirect flow.
   */
  public enum ModeEnum {
    REDIRECT("redirect"),
    
    WEBSOCKET("websocket");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MODE = "mode";
  private ModeEnum mode;

  public InitiateDataSharingRequestInput() {
  }

  public InitiateDataSharingRequestInput queryId(String queryId) {
    
    this.queryId = queryId;
    return this;
  }

  /**
   * The ID of the query.
   * @return queryId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUERY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQueryId() {
    return queryId;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public InitiateDataSharingRequestInput correlationId(String correlationId) {
    
    this.correlationId = correlationId;
    return this;
  }

  /**
   * A unique, randomly generated identifier that correlates the request and response in the data-sharing request flow.
   * @return correlationId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CORRELATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCorrelationId() {
    return correlationId;
  }


  @JsonProperty(JSON_PROPERTY_CORRELATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public InitiateDataSharingRequestInput tokenMaxAge(BigDecimal tokenMaxAge) {
    
    this.tokenMaxAge = tokenMaxAge;
    return this;
  }

  /**
   * This is the lifetime of the signed request token during the data-sharing flow.
   * @return tokenMaxAge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTokenMaxAge() {
    return tokenMaxAge;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenMaxAge(BigDecimal tokenMaxAge) {
    this.tokenMaxAge = tokenMaxAge;
  }

  public InitiateDataSharingRequestInput nonce(String nonce) {
    
    this.nonce = nonce;
    return this;
  }

  /**
   * A randomly generated value that is added in the request and response to prevent replay attacks.
   * @return nonce
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NONCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNonce() {
    return nonce;
  }


  @JsonProperty(JSON_PROPERTY_NONCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  public InitiateDataSharingRequestInput redirectUri(String redirectUri) {
    
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * List of allowed URLs to redirect users, including the response from the request. This is required if the selected data-sharing mode is Redirect.
   * @return redirectUri
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRedirectUri() {
    return redirectUri;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public InitiateDataSharingRequestInput configurationId(String configurationId) {
    
    this.configurationId = configurationId;
    return this;
  }

  /**
   * ID of the Affinidi Iota Framework configuration.
   * @return configurationId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConfigurationId() {
    return configurationId;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfigurationId(String configurationId) {
    this.configurationId = configurationId;
  }

  public InitiateDataSharingRequestInput mode(ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

  /**
   * Determines whether to handle the data-sharing request using the WebSocket or Redirect flow.
   * @return mode
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ModeEnum getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateDataSharingRequestInput initiateDataSharingRequestInput = (InitiateDataSharingRequestInput) o;
    return Objects.equals(this.queryId, initiateDataSharingRequestInput.queryId) &&
        Objects.equals(this.correlationId, initiateDataSharingRequestInput.correlationId) &&
        Objects.equals(this.tokenMaxAge, initiateDataSharingRequestInput.tokenMaxAge) &&
        Objects.equals(this.nonce, initiateDataSharingRequestInput.nonce) &&
        Objects.equals(this.redirectUri, initiateDataSharingRequestInput.redirectUri) &&
        Objects.equals(this.configurationId, initiateDataSharingRequestInput.configurationId) &&
        Objects.equals(this.mode, initiateDataSharingRequestInput.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, correlationId, tokenMaxAge, nonce, redirectUri, configurationId, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDataSharingRequestInput {\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    tokenMaxAge: ").append(toIndentedString(tokenMaxAge)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

    // add `queryId` to the URL query string
    if (getQueryId() != null) {
      try {
        joiner.add(String.format("%squeryId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQueryId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `correlationId` to the URL query string
    if (getCorrelationId() != null) {
      try {
        joiner.add(String.format("%scorrelationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCorrelationId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tokenMaxAge` to the URL query string
    if (getTokenMaxAge() != null) {
      try {
        joiner.add(String.format("%stokenMaxAge%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenMaxAge()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `nonce` to the URL query string
    if (getNonce() != null) {
      try {
        joiner.add(String.format("%snonce%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNonce()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirectUri` to the URL query string
    if (getRedirectUri() != null) {
      try {
        joiner.add(String.format("%sredirectUri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRedirectUri()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `configurationId` to the URL query string
    if (getConfigurationId() != null) {
      try {
        joiner.add(String.format("%sconfigurationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfigurationId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mode` to the URL query string
    if (getMode() != null) {
      try {
        joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

