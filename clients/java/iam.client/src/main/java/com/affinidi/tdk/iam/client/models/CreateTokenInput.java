/*
 * Iam
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.iam.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.affinidi.tdk.iam.client.models.TokenAuthenticationMethodDto;
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
 * CreateTokenInput
 */
@JsonPropertyOrder({
  CreateTokenInput.JSON_PROPERTY_NAME,
  CreateTokenInput.JSON_PROPERTY_AUTHENTICATION_METHOD,
  CreateTokenInput.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateTokenInput {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AUTHENTICATION_METHOD = "authenticationMethod";
  private TokenAuthenticationMethodDto authenticationMethod;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public CreateTokenInput() {
  }

  public CreateTokenInput name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }

  public CreateTokenInput authenticationMethod(TokenAuthenticationMethodDto authenticationMethod) {
    
    this.authenticationMethod = authenticationMethod;
    return this;
  }

  /**
   * Get authenticationMethod
   * @return authenticationMethod
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TokenAuthenticationMethodDto getAuthenticationMethod() {
    return authenticationMethod;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthenticationMethod(TokenAuthenticationMethodDto authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  public CreateTokenInput description(String description) {
    
    this.description = description;
    return this;
  }

  /**
   * Get description
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTokenInput createTokenInput = (CreateTokenInput) o;
    return Objects.equals(this.name, createTokenInput.name) &&
        Objects.equals(this.authenticationMethod, createTokenInput.authenticationMethod) &&
        Objects.equals(this.description, createTokenInput.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, authenticationMethod, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTokenInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    // add `authenticationMethod` to the URL query string
    if (getAuthenticationMethod() != null) {
      joiner.add(getAuthenticationMethod().toUrlQueryString(prefix + "authenticationMethod" + suffix));
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

    return joiner.toString();
  }

}

