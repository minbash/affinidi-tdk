/*
 * CredentialIssuanceService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.affinidi.tdk.credential.issuance.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.affinidi.tdk.credential.issuance.client.models.FlowDataStatusListsDetailsInner;
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
 * FlowData
 */
@JsonPropertyOrder({ FlowData.JSON_PROPERTY_CREATED_AT, FlowData.JSON_PROPERTY_MODIFIED_AT, FlowData.JSON_PROPERTY_ID,
        FlowData.JSON_PROPERTY_PROJECT_ID, FlowData.JSON_PROPERTY_FLOW_ID, FlowData.JSON_PROPERTY_CREDENTIAL_TYPE_ID,
        FlowData.JSON_PROPERTY_JSON_LD_CONTEXT_URL, FlowData.JSON_PROPERTY_JSON_SCHEMA_URL,
        FlowData.JSON_PROPERTY_CONFIGURATION_ID, FlowData.JSON_PROPERTY_ISSUED_AT, FlowData.JSON_PROPERTY_WALLET_ID,
        FlowData.JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID,
        FlowData.JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID_WALLET_ID,
        FlowData.JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID_CREDENTIAL_TYPE,
        FlowData.JSON_PROPERTY_STATUS_LISTS_DETAILS })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class FlowData {
    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    private String createdAt;

    public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
    private String modifiedAt;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
    private String projectId;

    public static final String JSON_PROPERTY_FLOW_ID = "flowId";
    private String flowId;

    public static final String JSON_PROPERTY_CREDENTIAL_TYPE_ID = "credentialTypeId";
    private String credentialTypeId;

    public static final String JSON_PROPERTY_JSON_LD_CONTEXT_URL = "jsonLdContextUrl";
    private String jsonLdContextUrl;

    public static final String JSON_PROPERTY_JSON_SCHEMA_URL = "jsonSchemaUrl";
    private String jsonSchemaUrl;

    public static final String JSON_PROPERTY_CONFIGURATION_ID = "configurationId";
    private String configurationId;

    public static final String JSON_PROPERTY_ISSUED_AT = "issuedAt";
    private String issuedAt;

    public static final String JSON_PROPERTY_WALLET_ID = "walletId";
    private String walletId;

    public static final String JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID = "projectIdConfigurationId";
    private String projectIdConfigurationId;

    public static final String JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID_WALLET_ID = "projectIdConfigurationIdWalletId";
    private String projectIdConfigurationIdWalletId;

    public static final String JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID_CREDENTIAL_TYPE = "projectIdConfigurationIdCredentialType";
    private String projectIdConfigurationIdCredentialType;

    public static final String JSON_PROPERTY_STATUS_LISTS_DETAILS = "statusListsDetails";
    private List<FlowDataStatusListsDetailsInner> statusListsDetails = new ArrayList<>();

    public FlowData() {
    }

    public FlowData createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * [GEN] ISO 8601 string of the creation date/time the entity
     *
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

    public FlowData modifiedAt(String modifiedAt) {

        this.modifiedAt = modifiedAt;
        return this;
    }

    /**
     * [GEN] ISO 8601 string of the modification date/time the entity
     *
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

    public FlowData id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public FlowData projectId(String projectId) {

        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     *
     * @return projectId
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PROJECT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getProjectId() {
        return projectId;
    }

    @JsonProperty(JSON_PROPERTY_PROJECT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public FlowData flowId(String flowId) {

        this.flowId = flowId;
        return this;
    }

    /**
     * Get flowId
     *
     * @return flowId
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_FLOW_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getFlowId() {
        return flowId;
    }

    @JsonProperty(JSON_PROPERTY_FLOW_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public FlowData credentialTypeId(String credentialTypeId) {

        this.credentialTypeId = credentialTypeId;
        return this;
    }

    /**
     * Get credentialTypeId
     *
     * @return credentialTypeId
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CREDENTIAL_TYPE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getCredentialTypeId() {
        return credentialTypeId;
    }

    @JsonProperty(JSON_PROPERTY_CREDENTIAL_TYPE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCredentialTypeId(String credentialTypeId) {
        this.credentialTypeId = credentialTypeId;
    }

    public FlowData jsonLdContextUrl(String jsonLdContextUrl) {

        this.jsonLdContextUrl = jsonLdContextUrl;
        return this;
    }

    /**
     * Get jsonLdContextUrl
     *
     * @return jsonLdContextUrl
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_JSON_LD_CONTEXT_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getJsonLdContextUrl() {
        return jsonLdContextUrl;
    }

    @JsonProperty(JSON_PROPERTY_JSON_LD_CONTEXT_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setJsonLdContextUrl(String jsonLdContextUrl) {
        this.jsonLdContextUrl = jsonLdContextUrl;
    }

    public FlowData jsonSchemaUrl(String jsonSchemaUrl) {

        this.jsonSchemaUrl = jsonSchemaUrl;
        return this;
    }

    /**
     * Get jsonSchemaUrl
     *
     * @return jsonSchemaUrl
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_JSON_SCHEMA_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getJsonSchemaUrl() {
        return jsonSchemaUrl;
    }

    @JsonProperty(JSON_PROPERTY_JSON_SCHEMA_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setJsonSchemaUrl(String jsonSchemaUrl) {
        this.jsonSchemaUrl = jsonSchemaUrl;
    }

    public FlowData configurationId(String configurationId) {

        this.configurationId = configurationId;
        return this;
    }

    /**
     * Id of configuration, used to issue VC.
     *
     * @return configurationId
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CONFIGURATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getConfigurationId() {
        return configurationId;
    }

    @JsonProperty(JSON_PROPERTY_CONFIGURATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public FlowData issuedAt(String issuedAt) {

        this.issuedAt = issuedAt;
        return this;
    }

    /**
     * when credential was issued to the holder (holder invoked generateCredentials endpoint)
     *
     * @return issuedAt
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ISSUED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getIssuedAt() {
        return issuedAt;
    }

    @JsonProperty(JSON_PROPERTY_ISSUED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public FlowData walletId(String walletId) {

        this.walletId = walletId;
        return this;
    }

    /**
     * Id of wallet, used to issue VC.
     *
     * @return walletId
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_WALLET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getWalletId() {
        return walletId;
    }

    @JsonProperty(JSON_PROPERTY_WALLET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public FlowData projectIdConfigurationId(String projectIdConfigurationId) {

        this.projectIdConfigurationId = projectIdConfigurationId;
        return this;
    }

    /**
     * Id of configuration with which VC was issued. To use as an index, it is grouped together with projectId, as
     * \&quot;{projectIdConfigurationId}#{configurationId}\&quot;
     *
     * @return projectIdConfigurationId
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getProjectIdConfigurationId() {
        return projectIdConfigurationId;
    }

    @JsonProperty(JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProjectIdConfigurationId(String projectIdConfigurationId) {
        this.projectIdConfigurationId = projectIdConfigurationId;
    }

    public FlowData projectIdConfigurationIdWalletId(String projectIdConfigurationIdWalletId) {

        this.projectIdConfigurationIdWalletId = projectIdConfigurationIdWalletId;
        return this;
    }

    /**
     * Id of wallet which issued VC. To use as an index, it is grouped together with projectId, as
     * \&quot;{projectIdConfigurationId}#{walletId}\&quot;
     *
     * @return projectIdConfigurationIdWalletId
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID_WALLET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getProjectIdConfigurationIdWalletId() {
        return projectIdConfigurationIdWalletId;
    }

    @JsonProperty(JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID_WALLET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProjectIdConfigurationIdWalletId(String projectIdConfigurationIdWalletId) {
        this.projectIdConfigurationIdWalletId = projectIdConfigurationIdWalletId;
    }

    public FlowData projectIdConfigurationIdCredentialType(String projectIdConfigurationIdCredentialType) {

        this.projectIdConfigurationIdCredentialType = projectIdConfigurationIdCredentialType;
        return this;
    }

    /**
     * VC.type value. To use as an index, it is grouped together with projectId, as
     * \&quot;{projectIdConfigurationId}#{credentialType}\&quot;
     *
     * @return projectIdConfigurationIdCredentialType
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID_CREDENTIAL_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getProjectIdConfigurationIdCredentialType() {
        return projectIdConfigurationIdCredentialType;
    }

    @JsonProperty(JSON_PROPERTY_PROJECT_ID_CONFIGURATION_ID_CREDENTIAL_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProjectIdConfigurationIdCredentialType(String projectIdConfigurationIdCredentialType) {
        this.projectIdConfigurationIdCredentialType = projectIdConfigurationIdCredentialType;
    }

    public FlowData statusListsDetails(List<FlowDataStatusListsDetailsInner> statusListsDetails) {

        this.statusListsDetails = statusListsDetails;
        return this;
    }

    public FlowData addStatusListsDetailsItem(FlowDataStatusListsDetailsInner statusListsDetailsItem) {
        if (this.statusListsDetails == null) {
            this.statusListsDetails = new ArrayList<>();
        }
        this.statusListsDetails.add(statusListsDetailsItem);
        return this;
    }

    /**
     * Get statusListsDetails
     *
     * @return statusListsDetails
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STATUS_LISTS_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<FlowDataStatusListsDetailsInner> getStatusListsDetails() {
        return statusListsDetails;
    }

    @JsonProperty(JSON_PROPERTY_STATUS_LISTS_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatusListsDetails(List<FlowDataStatusListsDetailsInner> statusListsDetails) {
        this.statusListsDetails = statusListsDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowData flowData = (FlowData) o;
        return Objects.equals(this.createdAt, flowData.createdAt)
                && Objects.equals(this.modifiedAt, flowData.modifiedAt) && Objects.equals(this.id, flowData.id)
                && Objects.equals(this.projectId, flowData.projectId) && Objects.equals(this.flowId, flowData.flowId)
                && Objects.equals(this.credentialTypeId, flowData.credentialTypeId)
                && Objects.equals(this.jsonLdContextUrl, flowData.jsonLdContextUrl)
                && Objects.equals(this.jsonSchemaUrl, flowData.jsonSchemaUrl)
                && Objects.equals(this.configurationId, flowData.configurationId)
                && Objects.equals(this.issuedAt, flowData.issuedAt) && Objects.equals(this.walletId, flowData.walletId)
                && Objects.equals(this.projectIdConfigurationId, flowData.projectIdConfigurationId)
                && Objects.equals(this.projectIdConfigurationIdWalletId, flowData.projectIdConfigurationIdWalletId)
                && Objects.equals(this.projectIdConfigurationIdCredentialType,
                        flowData.projectIdConfigurationIdCredentialType)
                && Objects.equals(this.statusListsDetails, flowData.statusListsDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, modifiedAt, id, projectId, flowId, credentialTypeId, jsonLdContextUrl,
                jsonSchemaUrl, configurationId, issuedAt, walletId, projectIdConfigurationId,
                projectIdConfigurationIdWalletId, projectIdConfigurationIdCredentialType, statusListsDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowData {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
        sb.append("    credentialTypeId: ").append(toIndentedString(credentialTypeId)).append("\n");
        sb.append("    jsonLdContextUrl: ").append(toIndentedString(jsonLdContextUrl)).append("\n");
        sb.append("    jsonSchemaUrl: ").append(toIndentedString(jsonSchemaUrl)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
        sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
        sb.append("    projectIdConfigurationId: ").append(toIndentedString(projectIdConfigurationId)).append("\n");
        sb.append("    projectIdConfigurationIdWalletId: ").append(toIndentedString(projectIdConfigurationIdWalletId))
                .append("\n");
        sb.append("    projectIdConfigurationIdCredentialType: ")
                .append(toIndentedString(projectIdConfigurationIdCredentialType)).append("\n");
        sb.append("    statusListsDetails: ").append(toIndentedString(statusListsDetails)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
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
     * @param prefix
     *            prefix of the query string
     *
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

        // add `createdAt` to the URL query string
        if (getCreatedAt() != null) {
            try {
                joiner.add(String.format("%screatedAt%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `modifiedAt` to the URL query string
        if (getModifiedAt() != null) {
            try {
                joiner.add(String.format("%smodifiedAt%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getModifiedAt()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `id` to the URL query string
        if (getId() != null) {
            try {
                joiner.add(String.format("%sid%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `projectId` to the URL query string
        if (getProjectId() != null) {
            try {
                joiner.add(String.format("%sprojectId%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getProjectId()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `flowId` to the URL query string
        if (getFlowId() != null) {
            try {
                joiner.add(String.format("%sflowId%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getFlowId()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `credentialTypeId` to the URL query string
        if (getCredentialTypeId() != null) {
            try {
                joiner.add(String.format("%scredentialTypeId%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getCredentialTypeId()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `jsonLdContextUrl` to the URL query string
        if (getJsonLdContextUrl() != null) {
            try {
                joiner.add(String.format("%sjsonLdContextUrl%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getJsonLdContextUrl()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `jsonSchemaUrl` to the URL query string
        if (getJsonSchemaUrl() != null) {
            try {
                joiner.add(String.format("%sjsonSchemaUrl%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getJsonSchemaUrl()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `configurationId` to the URL query string
        if (getConfigurationId() != null) {
            try {
                joiner.add(String.format("%sconfigurationId%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getConfigurationId()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `issuedAt` to the URL query string
        if (getIssuedAt() != null) {
            try {
                joiner.add(String.format("%sissuedAt%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getIssuedAt()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `walletId` to the URL query string
        if (getWalletId() != null) {
            try {
                joiner.add(String.format("%swalletId%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getWalletId()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `projectIdConfigurationId` to the URL query string
        if (getProjectIdConfigurationId() != null) {
            try {
                joiner.add(String.format("%sprojectIdConfigurationId%s=%s", prefix, suffix, URLEncoder
                        .encode(String.valueOf(getProjectIdConfigurationId()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `projectIdConfigurationIdWalletId` to the URL query string
        if (getProjectIdConfigurationIdWalletId() != null) {
            try {
                joiner.add(String.format("%sprojectIdConfigurationIdWalletId%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getProjectIdConfigurationIdWalletId()), "UTF-8")
                                .replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `projectIdConfigurationIdCredentialType` to the URL query string
        if (getProjectIdConfigurationIdCredentialType() != null) {
            try {
                joiner.add(String.format("%sprojectIdConfigurationIdCredentialType%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getProjectIdConfigurationIdCredentialType()), "UTF-8")
                                .replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `statusListsDetails` to the URL query string
        if (getStatusListsDetails() != null) {
            for (int i = 0; i < getStatusListsDetails().size(); i++) {
                if (getStatusListsDetails().get(i) != null) {
                    joiner.add(getStatusListsDetails().get(i).toUrlQueryString(String.format("%sstatusListsDetails%s%s",
                            prefix, suffix,
                            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }

}
