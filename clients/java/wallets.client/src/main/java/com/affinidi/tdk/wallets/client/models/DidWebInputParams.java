/*
 * CloudWalletEssentials
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.wallets.client.models;

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
 * Additional params for did method web
 */
@JsonPropertyOrder({
  DidWebInputParams.JSON_PROPERTY_NAME,
  DidWebInputParams.JSON_PROPERTY_DESCRIPTION,
  DidWebInputParams.JSON_PROPERTY_DID_METHOD,
  DidWebInputParams.JSON_PROPERTY_DID_WEB_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class DidWebInputParams {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Gets or Sets didMethod
   */
  public enum DidMethodEnum {
    WEB("web");

    private String value;

    DidMethodEnum(String value) {
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
    public static DidMethodEnum fromValue(String value) {
      for (DidMethodEnum b : DidMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DID_METHOD = "didMethod";
  private DidMethodEnum didMethod;

  public static final String JSON_PROPERTY_DID_WEB_URL = "didWebUrl";
  private String didWebUrl;

  public DidWebInputParams() {
  }

  public DidWebInputParams name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name of the wallet
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public DidWebInputParams description(String description) {
    
    this.description = description;
    return this;
  }

  /**
   * The description of the wallet
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  public DidWebInputParams didMethod(DidMethodEnum didMethod) {
    
    this.didMethod = didMethod;
    return this;
  }

  /**
   * Get didMethod
   * @return didMethod
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DID_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DidMethodEnum getDidMethod() {
    return didMethod;
  }


  @JsonProperty(JSON_PROPERTY_DID_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDidMethod(DidMethodEnum didMethod) {
    this.didMethod = didMethod;
  }

  public DidWebInputParams didWebUrl(String didWebUrl) {
    
    this.didWebUrl = didWebUrl;
    return this;
  }

  /**
   * If the did method is web, this is the URL of the did
   * @return didWebUrl
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DID_WEB_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDidWebUrl() {
    return didWebUrl;
  }


  @JsonProperty(JSON_PROPERTY_DID_WEB_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDidWebUrl(String didWebUrl) {
    this.didWebUrl = didWebUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DidWebInputParams didWebInputParams = (DidWebInputParams) o;
    return Objects.equals(this.name, didWebInputParams.name) &&
        Objects.equals(this.description, didWebInputParams.description) &&
        Objects.equals(this.didMethod, didWebInputParams.didMethod) &&
        Objects.equals(this.didWebUrl, didWebInputParams.didWebUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, didMethod, didWebUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DidWebInputParams {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    didMethod: ").append(toIndentedString(didMethod)).append("\n");
    sb.append("    didWebUrl: ").append(toIndentedString(didWebUrl)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `didMethod` to the URL query string
    if (getDidMethod() != null) {
      try {
        joiner.add(String.format("%sdidMethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDidMethod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `didWebUrl` to the URL query string
    if (getDidWebUrl() != null) {
      try {
        joiner.add(String.format("%sdidWebUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDidWebUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

