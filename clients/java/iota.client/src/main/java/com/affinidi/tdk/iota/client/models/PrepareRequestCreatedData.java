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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PrepareRequestCreatedData
 */
@JsonPropertyOrder({
  PrepareRequestCreatedData.JSON_PROPERTY_JWT,
  PrepareRequestCreatedData.JSON_PROPERTY_CORRELATION_ID
})
@JsonTypeName("PrepareRequestCreated_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class PrepareRequestCreatedData {
  public static final String JSON_PROPERTY_JWT = "jwt";
  private String jwt;

  public static final String JSON_PROPERTY_CORRELATION_ID = "correlationId";
  private String correlationId;

  public PrepareRequestCreatedData() {
  }

  public PrepareRequestCreatedData jwt(String jwt) {
    
    this.jwt = jwt;
    return this;
  }

  /**
   * Get jwt
   * @return jwt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_JWT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getJwt() {
    return jwt;
  }


  @JsonProperty(JSON_PROPERTY_JWT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJwt(String jwt) {
    this.jwt = jwt;
  }

  public PrepareRequestCreatedData correlationId(String correlationId) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareRequestCreatedData prepareRequestCreatedData = (PrepareRequestCreatedData) o;
    return Objects.equals(this.jwt, prepareRequestCreatedData.jwt) &&
        Objects.equals(this.correlationId, prepareRequestCreatedData.correlationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwt, correlationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareRequestCreatedData {\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
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

    // add `jwt` to the URL query string
    if (getJwt() != null) {
      try {
        joiner.add(String.format("%sjwt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJwt()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

