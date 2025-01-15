/*
 * VaultFileSystem
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.vault.data.manager.client.models;

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
 * MoveNodeInput
 */
@JsonPropertyOrder({
  MoveNodeInput.JSON_PROPERTY_DESTINATION_NODE_ID,
  MoveNodeInput.JSON_PROPERTY_RESOLVE_NAME_CONFLICTS_AUTOMATICALLY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:43:03.269651168Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MoveNodeInput {
  public static final String JSON_PROPERTY_DESTINATION_NODE_ID = "destinationNodeId";
  private String destinationNodeId;

  public static final String JSON_PROPERTY_RESOLVE_NAME_CONFLICTS_AUTOMATICALLY = "resolveNameConflictsAutomatically";
  private Boolean resolveNameConflictsAutomatically = false;

  public MoveNodeInput() {
  }

  public MoveNodeInput destinationNodeId(String destinationNodeId) {
    
    this.destinationNodeId = destinationNodeId;
    return this;
  }

  /**
   * Parent to which current node should be moved
   * @return destinationNodeId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESTINATION_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestinationNodeId() {
    return destinationNodeId;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestinationNodeId(String destinationNodeId) {
    this.destinationNodeId = destinationNodeId;
  }

  public MoveNodeInput resolveNameConflictsAutomatically(Boolean resolveNameConflictsAutomatically) {
    
    this.resolveNameConflictsAutomatically = resolveNameConflictsAutomatically;
    return this;
  }

  /**
   * automatically update the name of Node if target Node has children with the same name. If not provided, name won&#39;t be updated automatically
   * @return resolveNameConflictsAutomatically
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVE_NAME_CONFLICTS_AUTOMATICALLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getResolveNameConflictsAutomatically() {
    return resolveNameConflictsAutomatically;
  }


  @JsonProperty(JSON_PROPERTY_RESOLVE_NAME_CONFLICTS_AUTOMATICALLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolveNameConflictsAutomatically(Boolean resolveNameConflictsAutomatically) {
    this.resolveNameConflictsAutomatically = resolveNameConflictsAutomatically;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveNodeInput moveNodeInput = (MoveNodeInput) o;
    return Objects.equals(this.destinationNodeId, moveNodeInput.destinationNodeId) &&
        Objects.equals(this.resolveNameConflictsAutomatically, moveNodeInput.resolveNameConflictsAutomatically);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationNodeId, resolveNameConflictsAutomatically);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveNodeInput {\n");
    sb.append("    destinationNodeId: ").append(toIndentedString(destinationNodeId)).append("\n");
    sb.append("    resolveNameConflictsAutomatically: ").append(toIndentedString(resolveNameConflictsAutomatically)).append("\n");
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

    // add `destinationNodeId` to the URL query string
    if (getDestinationNodeId() != null) {
      try {
        joiner.add(String.format("%sdestinationNodeId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDestinationNodeId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `resolveNameConflictsAutomatically` to the URL query string
    if (getResolveNameConflictsAutomatically() != null) {
      try {
        joiner.add(String.format("%sresolveNameConflictsAutomatically%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResolveNameConflictsAutomatically()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

