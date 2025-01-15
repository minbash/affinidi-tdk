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
 * GetScannedFileInfoOK
 */
@JsonPropertyOrder({
  GetScannedFileInfoOK.JSON_PROPERTY_DATA,
  GetScannedFileInfoOK.JSON_PROPERTY_JOB_ID,
  GetScannedFileInfoOK.JSON_PROPERTY_STATUS,
  GetScannedFileInfoOK.JSON_PROPERTY_PROFILE_ID,
  GetScannedFileInfoOK.JSON_PROPERTY_EXCLUSIVE_START_KEY,
  GetScannedFileInfoOK.JSON_PROPERTY_NODE_ID,
  GetScannedFileInfoOK.JSON_PROPERTY_CREATED_AT,
  GetScannedFileInfoOK.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GetScannedFileInfoOK {
  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;

  public static final String JSON_PROPERTY_JOB_ID = "jobId";
  private String jobId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  private String profileId;

  public static final String JSON_PROPERTY_EXCLUSIVE_START_KEY = "exclusiveStartKey";
  private String exclusiveStartKey;

  public static final String JSON_PROPERTY_NODE_ID = "nodeId";
  private String nodeId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public GetScannedFileInfoOK() {
  }

  public GetScannedFileInfoOK data(Object data) {
    
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(Object data) {
    this.data = data;
  }

  public GetScannedFileInfoOK jobId(String jobId) {
    
    this.jobId = jobId;
    return this;
  }

  /**
   * A unique, randomly generated idetifier
   * @return jobId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getJobId() {
    return jobId;
  }


  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public GetScannedFileInfoOK status(String status) {
    
    this.status = status;
    return this;
  }

  /**
   * Status of the file scanning once initiated
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }

  public GetScannedFileInfoOK profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * A unique, randomly generated identifier
   * @return profileId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProfileId() {
    return profileId;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public GetScannedFileInfoOK exclusiveStartKey(String exclusiveStartKey) {
    
    this.exclusiveStartKey = exclusiveStartKey;
    return this;
  }

  /**
   * The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation.
   * @return exclusiveStartKey
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUSIVE_START_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExclusiveStartKey() {
    return exclusiveStartKey;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUSIVE_START_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExclusiveStartKey(String exclusiveStartKey) {
    this.exclusiveStartKey = exclusiveStartKey;
  }

  public GetScannedFileInfoOK nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

  /**
   * A unique, randomly generated identifier
   * @return nodeId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNodeId() {
    return nodeId;
  }


  @JsonProperty(JSON_PROPERTY_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public GetScannedFileInfoOK createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GetScannedFileInfoOK name(String name) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetScannedFileInfoOK getScannedFileInfoOK = (GetScannedFileInfoOK) o;
    return Objects.equals(this.data, getScannedFileInfoOK.data) &&
        Objects.equals(this.jobId, getScannedFileInfoOK.jobId) &&
        Objects.equals(this.status, getScannedFileInfoOK.status) &&
        Objects.equals(this.profileId, getScannedFileInfoOK.profileId) &&
        Objects.equals(this.exclusiveStartKey, getScannedFileInfoOK.exclusiveStartKey) &&
        Objects.equals(this.nodeId, getScannedFileInfoOK.nodeId) &&
        Objects.equals(this.createdAt, getScannedFileInfoOK.createdAt) &&
        Objects.equals(this.name, getScannedFileInfoOK.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, jobId, status, profileId, exclusiveStartKey, nodeId, createdAt, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetScannedFileInfoOK {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    exclusiveStartKey: ").append(toIndentedString(exclusiveStartKey)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `data` to the URL query string
    if (getData() != null) {
      try {
        joiner.add(String.format("%sdata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getData()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `jobId` to the URL query string
    if (getJobId() != null) {
      try {
        joiner.add(String.format("%sjobId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJobId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profileId` to the URL query string
    if (getProfileId() != null) {
      try {
        joiner.add(String.format("%sprofileId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `exclusiveStartKey` to the URL query string
    if (getExclusiveStartKey() != null) {
      try {
        joiner.add(String.format("%sexclusiveStartKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExclusiveStartKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `nodeId` to the URL query string
    if (getNodeId() != null) {
      try {
        joiner.add(String.format("%snodeId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNodeId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

