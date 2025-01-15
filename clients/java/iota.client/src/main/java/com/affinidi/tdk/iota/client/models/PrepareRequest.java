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
 * PrepareRequest
 */
@JsonPropertyOrder({
  PrepareRequest.JSON_PROPERTY_CONNECTION_CLIENT_ID,
  PrepareRequest.JSON_PROPERTY_QUERY_ID,
  PrepareRequest.JSON_PROPERTY_CORRELATION_ID,
  PrepareRequest.JSON_PROPERTY_TOKEN_MAX_AGE,
  PrepareRequest.JSON_PROPERTY_AUDIENCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class PrepareRequest {
  public static final String JSON_PROPERTY_CONNECTION_CLIENT_ID = "connectionClientId";
  private String connectionClientId;

  public static final String JSON_PROPERTY_QUERY_ID = "queryId";
  private String queryId;

  public static final String JSON_PROPERTY_CORRELATION_ID = "correlationId";
  private String correlationId;

  public static final String JSON_PROPERTY_TOKEN_MAX_AGE = "tokenMaxAge";
  private BigDecimal tokenMaxAge;

  public static final String JSON_PROPERTY_AUDIENCE = "audience";
  private String audience;

  public PrepareRequest() {
  }

  public PrepareRequest connectionClientId(String connectionClientId) {
    
    this.connectionClientId = connectionClientId;
    return this;
  }

  /**
   * Get connectionClientId
   * @return connectionClientId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTION_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectionClientId() {
    return connectionClientId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionClientId(String connectionClientId) {
    this.connectionClientId = connectionClientId;
  }

  public PrepareRequest queryId(String queryId) {
    
    this.queryId = queryId;
    return this;
  }

  /**
   * Get queryId
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

  public PrepareRequest correlationId(String correlationId) {
    
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

  public PrepareRequest tokenMaxAge(BigDecimal tokenMaxAge) {
    
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

  public PrepareRequest audience(String audience) {
    
    this.audience = audience;
    return this;
  }

  /**
   * Get audience
   * @return audience
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAudience() {
    return audience;
  }


  @JsonProperty(JSON_PROPERTY_AUDIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAudience(String audience) {
    this.audience = audience;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareRequest prepareRequest = (PrepareRequest) o;
    return Objects.equals(this.connectionClientId, prepareRequest.connectionClientId) &&
        Objects.equals(this.queryId, prepareRequest.queryId) &&
        Objects.equals(this.correlationId, prepareRequest.correlationId) &&
        Objects.equals(this.tokenMaxAge, prepareRequest.tokenMaxAge) &&
        Objects.equals(this.audience, prepareRequest.audience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionClientId, queryId, correlationId, tokenMaxAge, audience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareRequest {\n");
    sb.append("    connectionClientId: ").append(toIndentedString(connectionClientId)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    tokenMaxAge: ").append(toIndentedString(tokenMaxAge)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
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

    // add `connectionClientId` to the URL query string
    if (getConnectionClientId() != null) {
      try {
        joiner.add(String.format("%sconnectionClientId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnectionClientId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

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

    // add `audience` to the URL query string
    if (getAudience() != null) {
      try {
        joiner.add(String.format("%saudience%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAudience()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

