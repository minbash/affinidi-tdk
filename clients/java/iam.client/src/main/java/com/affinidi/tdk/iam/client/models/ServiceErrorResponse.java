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
import com.affinidi.tdk.iam.client.models.ServiceErrorResponseDetailsInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ServiceErrorResponse
 */
@JsonPropertyOrder({
  ServiceErrorResponse.JSON_PROPERTY_DEBUG_ID,
  ServiceErrorResponse.JSON_PROPERTY_NAME,
  ServiceErrorResponse.JSON_PROPERTY_CODE,
  ServiceErrorResponse.JSON_PROPERTY_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:41:03.223863394Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ServiceErrorResponse {
  public static final String JSON_PROPERTY_DEBUG_ID = "debugId";
  private UUID debugId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<ServiceErrorResponseDetailsInner> details = new ArrayList<>();

  public ServiceErrorResponse() {
  }

  public ServiceErrorResponse debugId(UUID debugId) {
    
    this.debugId = debugId;
    return this;
  }

  /**
   * unique id for correlating this specific error to logs
   * @return debugId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEBUG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getDebugId() {
    return debugId;
  }


  @JsonProperty(JSON_PROPERTY_DEBUG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDebugId(UUID debugId) {
    this.debugId = debugId;
  }

  public ServiceErrorResponse name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * name of the error
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

  public ServiceErrorResponse code(String code) {
    
    this.code = code;
    return this;
  }

  /**
   * backwards compatible Affinidi error code
   * @return code
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }

  public ServiceErrorResponse details(List<ServiceErrorResponseDetailsInner> details) {
    
    this.details = details;
    return this;
  }

  public ServiceErrorResponse addDetailsItem(ServiceErrorResponseDetailsInner detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServiceErrorResponseDetailsInner> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(List<ServiceErrorResponseDetailsInner> details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceErrorResponse serviceErrorResponse = (ServiceErrorResponse) o;
    return Objects.equals(this.debugId, serviceErrorResponse.debugId) &&
        Objects.equals(this.name, serviceErrorResponse.name) &&
        Objects.equals(this.code, serviceErrorResponse.code) &&
        Objects.equals(this.details, serviceErrorResponse.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debugId, name, code, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceErrorResponse {\n");
    sb.append("    debugId: ").append(toIndentedString(debugId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

    // add `debugId` to the URL query string
    if (getDebugId() != null) {
      try {
        joiner.add(String.format("%sdebugId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDebugId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `code` to the URL query string
    if (getCode() != null) {
      try {
        joiner.add(String.format("%scode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `details` to the URL query string
    if (getDetails() != null) {
      for (int i = 0; i < getDetails().size(); i++) {
        if (getDetails().get(i) != null) {
          joiner.add(getDetails().get(i).toUrlQueryString(String.format("%sdetails%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

