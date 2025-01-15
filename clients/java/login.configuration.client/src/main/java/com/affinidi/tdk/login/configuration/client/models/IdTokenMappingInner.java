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
 * IdTokenMappingInner
 */
@JsonPropertyOrder({
  IdTokenMappingInner.JSON_PROPERTY_SOURCE_FIELD,
  IdTokenMappingInner.JSON_PROPERTY_ID_TOKEN_CLAIM,
  IdTokenMappingInner.JSON_PROPERTY_INPUT_DESCRIPTOR_ID
})
@JsonTypeName("IdTokenMapping_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:39:52.417040092Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IdTokenMappingInner {
  public static final String JSON_PROPERTY_SOURCE_FIELD = "sourceField";
  private String sourceField;

  public static final String JSON_PROPERTY_ID_TOKEN_CLAIM = "idTokenClaim";
  private String idTokenClaim;

  public static final String JSON_PROPERTY_INPUT_DESCRIPTOR_ID = "inputDescriptorId";
  private String inputDescriptorId;

  public IdTokenMappingInner() {
  }

  public IdTokenMappingInner sourceField(String sourceField) {
    
    this.sourceField = sourceField;
    return this;
  }

  /**
   * Name(path) of the corresponding field in the vp_token
   * @return sourceField
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOURCE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourceField() {
    return sourceField;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceField(String sourceField) {
    this.sourceField = sourceField;
  }

  public IdTokenMappingInner idTokenClaim(String idTokenClaim) {
    
    this.idTokenClaim = idTokenClaim;
    return this;
  }

  /**
   * Name of the corresponding field in the id_token
   * @return idTokenClaim
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID_TOKEN_CLAIM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIdTokenClaim() {
    return idTokenClaim;
  }


  @JsonProperty(JSON_PROPERTY_ID_TOKEN_CLAIM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdTokenClaim(String idTokenClaim) {
    this.idTokenClaim = idTokenClaim;
  }

  public IdTokenMappingInner inputDescriptorId(String inputDescriptorId) {
    
    this.inputDescriptorId = inputDescriptorId;
    return this;
  }

  /**
   * Id of related input descriptor from presentation definition
   * @return inputDescriptorId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_DESCRIPTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputDescriptorId() {
    return inputDescriptorId;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_DESCRIPTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputDescriptorId(String inputDescriptorId) {
    this.inputDescriptorId = inputDescriptorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdTokenMappingInner idTokenMappingInner = (IdTokenMappingInner) o;
    return Objects.equals(this.sourceField, idTokenMappingInner.sourceField) &&
        Objects.equals(this.idTokenClaim, idTokenMappingInner.idTokenClaim) &&
        Objects.equals(this.inputDescriptorId, idTokenMappingInner.inputDescriptorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceField, idTokenClaim, inputDescriptorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdTokenMappingInner {\n");
    sb.append("    sourceField: ").append(toIndentedString(sourceField)).append("\n");
    sb.append("    idTokenClaim: ").append(toIndentedString(idTokenClaim)).append("\n");
    sb.append("    inputDescriptorId: ").append(toIndentedString(inputDescriptorId)).append("\n");
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

    // add `sourceField` to the URL query string
    if (getSourceField() != null) {
      try {
        joiner.add(String.format("%ssourceField%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceField()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `idTokenClaim` to the URL query string
    if (getIdTokenClaim() != null) {
      try {
        joiner.add(String.format("%sidTokenClaim%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdTokenClaim()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `inputDescriptorId` to the URL query string
    if (getInputDescriptorId() != null) {
      try {
        joiner.add(String.format("%sinputDescriptorId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInputDescriptorId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

