/*
 * OidcVpAdapterBackend
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.login.configuration.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Requested Client Authentication method for the Token Endpoint. The options are: &#x60;client_secret_post&#x60;: (default) Send client_id and client_secret as application/x-www-form-urlencoded in the HTTP body. &#x60;client_secret_basic&#x60;: Send client_id and client_secret as application/x-www-form-urlencoded encoded in the HTTP Authorization header. &#x60;none&#x60;: For public clients (native/mobile apps) which can not have secret. 
 */
public enum TokenEndpointAuthMethod {
  
  CLIENT_SECRET_BASIC("client_secret_basic"),
  
  CLIENT_SECRET_POST("client_secret_post"),
  
  NONE("none");

  private String value;

  TokenEndpointAuthMethod(String value) {
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
  public static TokenEndpointAuthMethod fromValue(String value) {
    for (TokenEndpointAuthMethod b : TokenEndpointAuthMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }
}

