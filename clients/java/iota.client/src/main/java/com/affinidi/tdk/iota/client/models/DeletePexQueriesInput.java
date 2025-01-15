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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * DeletePexQueriesInput
 */
@JsonPropertyOrder({
  DeletePexQueriesInput.JSON_PROPERTY_QUERY_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:42:30.065956999Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePexQueriesInput {
  public static final String JSON_PROPERTY_QUERY_IDS = "queryIds";
  private List<String> queryIds = new ArrayList<>();

  public DeletePexQueriesInput() {
  }

  public DeletePexQueriesInput queryIds(List<String> queryIds) {
    
    this.queryIds = queryIds;
    return this;
  }

  public DeletePexQueriesInput addQueryIdsItem(String queryIdsItem) {
    if (this.queryIds == null) {
      this.queryIds = new ArrayList<>();
    }
    this.queryIds.add(queryIdsItem);
    return this;
  }

  /**
   * Get queryIds
   * @return queryIds
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUERY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getQueryIds() {
    return queryIds;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueryIds(List<String> queryIds) {
    this.queryIds = queryIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePexQueriesInput deletePexQueriesInput = (DeletePexQueriesInput) o;
    return Objects.equals(this.queryIds, deletePexQueriesInput.queryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePexQueriesInput {\n");
    sb.append("    queryIds: ").append(toIndentedString(queryIds)).append("\n");
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

    // add `queryIds` to the URL query string
    if (getQueryIds() != null) {
      for (int i = 0; i < getQueryIds().size(); i++) {
        try {
          joiner.add(String.format("%squeryIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getQueryIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

