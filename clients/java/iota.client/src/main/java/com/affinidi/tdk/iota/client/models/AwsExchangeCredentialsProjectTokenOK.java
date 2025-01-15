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
import com.affinidi.tdk.iota.client.models.AwsExchangeCredentialsProjectTokenOKCredentials;
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
 * AwsExchangeCredentialsProjectTokenOK
 */
@JsonPropertyOrder({
  AwsExchangeCredentialsProjectTokenOK.JSON_PROPERTY_CONNECTION_CLIENT_ID,
  AwsExchangeCredentialsProjectTokenOK.JSON_PROPERTY_CREDENTIALS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AwsExchangeCredentialsProjectTokenOK {
  public static final String JSON_PROPERTY_CONNECTION_CLIENT_ID = "connectionClientId";
  private String connectionClientId;

  public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
  private AwsExchangeCredentialsProjectTokenOKCredentials credentials;

  public AwsExchangeCredentialsProjectTokenOK() {
  }

  public AwsExchangeCredentialsProjectTokenOK connectionClientId(String connectionClientId) {
    
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

  public AwsExchangeCredentialsProjectTokenOK credentials(AwsExchangeCredentialsProjectTokenOKCredentials credentials) {
    
    this.credentials = credentials;
    return this;
  }

  /**
   * Get credentials
   * @return credentials
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AwsExchangeCredentialsProjectTokenOKCredentials getCredentials() {
    return credentials;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredentials(AwsExchangeCredentialsProjectTokenOKCredentials credentials) {
    this.credentials = credentials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsExchangeCredentialsProjectTokenOK awsExchangeCredentialsProjectTokenOK = (AwsExchangeCredentialsProjectTokenOK) o;
    return Objects.equals(this.connectionClientId, awsExchangeCredentialsProjectTokenOK.connectionClientId) &&
        Objects.equals(this.credentials, awsExchangeCredentialsProjectTokenOK.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionClientId, credentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsExchangeCredentialsProjectTokenOK {\n");
    sb.append("    connectionClientId: ").append(toIndentedString(connectionClientId)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

    // add `credentials` to the URL query string
    if (getCredentials() != null) {
      joiner.add(getCredentials().toUrlQueryString(prefix + "credentials" + suffix));
    }

    return joiner.toString();
  }

}

