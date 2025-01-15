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
import com.affinidi.tdk.vault.data.manager.client.models.EdekInfo;
import com.affinidi.tdk.vault.data.manager.client.models.NodeStatus;
import com.affinidi.tdk.vault.data.manager.client.models.NodeType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetDetailedNodeInfoOK
 */
@JsonPropertyOrder({
  GetDetailedNodeInfoOK.JSON_PROPERTY_NODE_ID,
  GetDetailedNodeInfoOK.JSON_PROPERTY_STATUS,
  GetDetailedNodeInfoOK.JSON_PROPERTY_FILE_COUNT,
  GetDetailedNodeInfoOK.JSON_PROPERTY_PROFILE_COUNT,
  GetDetailedNodeInfoOK.JSON_PROPERTY_FOLDER_COUNT,
  GetDetailedNodeInfoOK.JSON_PROPERTY_VC_COUNT,
  GetDetailedNodeInfoOK.JSON_PROPERTY_NAME,
  GetDetailedNodeInfoOK.JSON_PROPERTY_CONSUMER_ID,
  GetDetailedNodeInfoOK.JSON_PROPERTY_PARENT_NODE_ID,
  GetDetailedNodeInfoOK.JSON_PROPERTY_PROFILE_ID,
  GetDetailedNodeInfoOK.JSON_PROPERTY_CREATED_AT,
  GetDetailedNodeInfoOK.JSON_PROPERTY_MODIFIED_AT,
  GetDetailedNodeInfoOK.JSON_PROPERTY_CREATED_BY,
  GetDetailedNodeInfoOK.JSON_PROPERTY_MODIFIED_BY,
  GetDetailedNodeInfoOK.JSON_PROPERTY_DESCRIPTION,
  GetDetailedNodeInfoOK.JSON_PROPERTY_TYPE,
  GetDetailedNodeInfoOK.JSON_PROPERTY_LINK,
  GetDetailedNodeInfoOK.JSON_PROPERTY_SCHEMA,
  GetDetailedNodeInfoOK.JSON_PROPERTY_CONSUMED_FILE_STORAGE,
  GetDetailedNodeInfoOK.JSON_PROPERTY_EDEK_INFO,
  GetDetailedNodeInfoOK.JSON_PROPERTY_METADATA,
  GetDetailedNodeInfoOK.JSON_PROPERTY_GET_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:43:03.269651168Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetDetailedNodeInfoOK {
  public static final String JSON_PROPERTY_NODE_ID = "nodeId";
  private String nodeId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private NodeStatus status;

  public static final String JSON_PROPERTY_FILE_COUNT = "fileCount";
  private BigDecimal fileCount;

  public static final String JSON_PROPERTY_PROFILE_COUNT = "profileCount";
  private BigDecimal profileCount;

  public static final String JSON_PROPERTY_FOLDER_COUNT = "folderCount";
  private BigDecimal folderCount;

  public static final String JSON_PROPERTY_VC_COUNT = "vcCount";
  private BigDecimal vcCount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONSUMER_ID = "consumerId";
  private String consumerId;

  public static final String JSON_PROPERTY_PARENT_NODE_ID = "parentNodeId";
  private String parentNodeId;

  public static final String JSON_PROPERTY_PROFILE_ID = "profileId";
  private String profileId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private String modifiedAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private String modifiedBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NodeType type;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private String schema;

  public static final String JSON_PROPERTY_CONSUMED_FILE_STORAGE = "consumedFileStorage";
  private BigDecimal consumedFileStorage;

  public static final String JSON_PROPERTY_EDEK_INFO = "edekInfo";
  private EdekInfo edekInfo;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private String metadata;

  public static final String JSON_PROPERTY_GET_URL = "getUrl";
  private String getUrl;

  public GetDetailedNodeInfoOK() {
  }

  public GetDetailedNodeInfoOK nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

  /**
   * A unique identifier of current node
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

  public GetDetailedNodeInfoOK status(NodeStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NodeStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(NodeStatus status) {
    this.status = status;
  }

  public GetDetailedNodeInfoOK fileCount(BigDecimal fileCount) {
    
    this.fileCount = fileCount;
    return this;
  }

  /**
   * number of files in current node
   * @return fileCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFileCount() {
    return fileCount;
  }


  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileCount(BigDecimal fileCount) {
    this.fileCount = fileCount;
  }

  public GetDetailedNodeInfoOK profileCount(BigDecimal profileCount) {
    
    this.profileCount = profileCount;
    return this;
  }

  /**
   * number of profiles in current node
   * @return profileCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getProfileCount() {
    return profileCount;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileCount(BigDecimal profileCount) {
    this.profileCount = profileCount;
  }

  public GetDetailedNodeInfoOK folderCount(BigDecimal folderCount) {
    
    this.folderCount = folderCount;
    return this;
  }

  /**
   * number of folders in current node
   * @return folderCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLDER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFolderCount() {
    return folderCount;
  }


  @JsonProperty(JSON_PROPERTY_FOLDER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFolderCount(BigDecimal folderCount) {
    this.folderCount = folderCount;
  }

  public GetDetailedNodeInfoOK vcCount(BigDecimal vcCount) {
    
    this.vcCount = vcCount;
    return this;
  }

  /**
   * number of vcCount in current node
   * @return vcCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VC_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVcCount() {
    return vcCount;
  }


  @JsonProperty(JSON_PROPERTY_VC_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVcCount(BigDecimal vcCount) {
    this.vcCount = vcCount;
  }

  public GetDetailedNodeInfoOK name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * display name of current node
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

  public GetDetailedNodeInfoOK consumerId(String consumerId) {
    
    this.consumerId = consumerId;
    return this;
  }

  /**
   * unique identifier for consumer
   * @return consumerId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONSUMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConsumerId() {
    return consumerId;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public GetDetailedNodeInfoOK parentNodeId(String parentNodeId) {
    
    this.parentNodeId = parentNodeId;
    return this;
  }

  /**
   * parent node path
   * @return parentNodeId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARENT_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getParentNodeId() {
    return parentNodeId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParentNodeId(String parentNodeId) {
    this.parentNodeId = parentNodeId;
  }

  public GetDetailedNodeInfoOK profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

  /**
   * A unique identifier of profile, under which current node is created
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

  public GetDetailedNodeInfoOK createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * creation date/time of the node
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

  public GetDetailedNodeInfoOK modifiedAt(String modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * modification date/time of the node
   * @return modifiedAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModifiedAt() {
    return modifiedAt;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public GetDetailedNodeInfoOK createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Identifier of the user who created the node
   * @return createdBy
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public GetDetailedNodeInfoOK modifiedBy(String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * Identifier of the user who last updated the node
   * @return modifiedBy
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModifiedBy() {
    return modifiedBy;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public GetDetailedNodeInfoOK description(String description) {
    
    this.description = description;
    return this;
  }

  /**
   * Description of the node
   * @return description
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }

  public GetDetailedNodeInfoOK type(NodeType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NodeType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(NodeType type) {
    this.type = type;
  }

  public GetDetailedNodeInfoOK link(String link) {
    
    this.link = link;
    return this;
  }

  /**
   * id of the file, used for FILE node only
   * @return link
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(String link) {
    this.link = link;
  }

  public GetDetailedNodeInfoOK schema(String schema) {
    
    this.schema = schema;
    return this;
  }

  /**
   * name of the schema, used for PROFILE node only
   * @return schema
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchema() {
    return schema;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchema(String schema) {
    this.schema = schema;
  }

  public GetDetailedNodeInfoOK consumedFileStorage(BigDecimal consumedFileStorage) {
    
    this.consumedFileStorage = consumedFileStorage;
    return this;
  }

  /**
   * amount of bytes used by the stored data, used for ROOT_ELEMENT only for now
   * @return consumedFileStorage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMED_FILE_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getConsumedFileStorage() {
    return consumedFileStorage;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMED_FILE_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumedFileStorage(BigDecimal consumedFileStorage) {
    this.consumedFileStorage = consumedFileStorage;
  }

  public GetDetailedNodeInfoOK edekInfo(EdekInfo edekInfo) {
    
    this.edekInfo = edekInfo;
    return this;
  }

  /**
   * Get edekInfo
   * @return edekInfo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDEK_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EdekInfo getEdekInfo() {
    return edekInfo;
  }


  @JsonProperty(JSON_PROPERTY_EDEK_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdekInfo(EdekInfo edekInfo) {
    this.edekInfo = edekInfo;
  }

  public GetDetailedNodeInfoOK metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

  /**
   * A JSON string format containing metadata of the node
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public GetDetailedNodeInfoOK getUrl(String getUrl) {
    
    this.getUrl = getUrl;
    return this;
  }

  /**
   * Get getUrl
   * @return getUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGetUrl() {
    return getUrl;
  }


  @JsonProperty(JSON_PROPERTY_GET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGetUrl(String getUrl) {
    this.getUrl = getUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDetailedNodeInfoOK getDetailedNodeInfoOK = (GetDetailedNodeInfoOK) o;
    return Objects.equals(this.nodeId, getDetailedNodeInfoOK.nodeId) &&
        Objects.equals(this.status, getDetailedNodeInfoOK.status) &&
        Objects.equals(this.fileCount, getDetailedNodeInfoOK.fileCount) &&
        Objects.equals(this.profileCount, getDetailedNodeInfoOK.profileCount) &&
        Objects.equals(this.folderCount, getDetailedNodeInfoOK.folderCount) &&
        Objects.equals(this.vcCount, getDetailedNodeInfoOK.vcCount) &&
        Objects.equals(this.name, getDetailedNodeInfoOK.name) &&
        Objects.equals(this.consumerId, getDetailedNodeInfoOK.consumerId) &&
        Objects.equals(this.parentNodeId, getDetailedNodeInfoOK.parentNodeId) &&
        Objects.equals(this.profileId, getDetailedNodeInfoOK.profileId) &&
        Objects.equals(this.createdAt, getDetailedNodeInfoOK.createdAt) &&
        Objects.equals(this.modifiedAt, getDetailedNodeInfoOK.modifiedAt) &&
        Objects.equals(this.createdBy, getDetailedNodeInfoOK.createdBy) &&
        Objects.equals(this.modifiedBy, getDetailedNodeInfoOK.modifiedBy) &&
        Objects.equals(this.description, getDetailedNodeInfoOK.description) &&
        Objects.equals(this.type, getDetailedNodeInfoOK.type) &&
        Objects.equals(this.link, getDetailedNodeInfoOK.link) &&
        Objects.equals(this.schema, getDetailedNodeInfoOK.schema) &&
        Objects.equals(this.consumedFileStorage, getDetailedNodeInfoOK.consumedFileStorage) &&
        Objects.equals(this.edekInfo, getDetailedNodeInfoOK.edekInfo) &&
        Objects.equals(this.metadata, getDetailedNodeInfoOK.metadata) &&
        Objects.equals(this.getUrl, getDetailedNodeInfoOK.getUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, status, fileCount, profileCount, folderCount, vcCount, name, consumerId, parentNodeId, profileId, createdAt, modifiedAt, createdBy, modifiedBy, description, type, link, schema, consumedFileStorage, edekInfo, metadata, getUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDetailedNodeInfoOK {\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
    sb.append("    profileCount: ").append(toIndentedString(profileCount)).append("\n");
    sb.append("    folderCount: ").append(toIndentedString(folderCount)).append("\n");
    sb.append("    vcCount: ").append(toIndentedString(vcCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    parentNodeId: ").append(toIndentedString(parentNodeId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    consumedFileStorage: ").append(toIndentedString(consumedFileStorage)).append("\n");
    sb.append("    edekInfo: ").append(toIndentedString(edekInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    getUrl: ").append(toIndentedString(getUrl)).append("\n");
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

    // add `nodeId` to the URL query string
    if (getNodeId() != null) {
      try {
        joiner.add(String.format("%snodeId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNodeId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `fileCount` to the URL query string
    if (getFileCount() != null) {
      try {
        joiner.add(String.format("%sfileCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFileCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profileCount` to the URL query string
    if (getProfileCount() != null) {
      try {
        joiner.add(String.format("%sprofileCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `folderCount` to the URL query string
    if (getFolderCount() != null) {
      try {
        joiner.add(String.format("%sfolderCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolderCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `vcCount` to the URL query string
    if (getVcCount() != null) {
      try {
        joiner.add(String.format("%svcCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVcCount()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `consumerId` to the URL query string
    if (getConsumerId() != null) {
      try {
        joiner.add(String.format("%sconsumerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `parentNodeId` to the URL query string
    if (getParentNodeId() != null) {
      try {
        joiner.add(String.format("%sparentNodeId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParentNodeId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modifiedAt` to the URL query string
    if (getModifiedAt() != null) {
      try {
        joiner.add(String.format("%smodifiedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifiedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modifiedBy` to the URL query string
    if (getModifiedBy() != null) {
      try {
        joiner.add(String.format("%smodifiedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifiedBy()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `link` to the URL query string
    if (getLink() != null) {
      try {
        joiner.add(String.format("%slink%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLink()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `schema` to the URL query string
    if (getSchema() != null) {
      try {
        joiner.add(String.format("%sschema%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSchema()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `consumedFileStorage` to the URL query string
    if (getConsumedFileStorage() != null) {
      try {
        joiner.add(String.format("%sconsumedFileStorage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumedFileStorage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `edekInfo` to the URL query string
    if (getEdekInfo() != null) {
      joiner.add(getEdekInfo().toUrlQueryString(prefix + "edekInfo" + suffix));
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      try {
        joiner.add(String.format("%smetadata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetadata()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `getUrl` to the URL query string
    if (getGetUrl() != null) {
      try {
        joiner.add(String.format("%sgetUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGetUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

