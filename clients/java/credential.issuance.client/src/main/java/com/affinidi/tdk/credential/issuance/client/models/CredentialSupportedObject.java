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
import com.affinidi.tdk.credential.issuance.client.models.SupportedCredentialMetadata;
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
 * CredentialSupportedObject
 */
@JsonPropertyOrder({ CredentialSupportedObject.JSON_PROPERTY_CREDENTIAL_TYPE_ID,
        CredentialSupportedObject.JSON_PROPERTY_JSON_SCHEMA_URL,
        CredentialSupportedObject.JSON_PROPERTY_JSON_LD_CONTEXT_URL, CredentialSupportedObject.JSON_PROPERTY_METADATA })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CredentialSupportedObject {
    public static final String JSON_PROPERTY_CREDENTIAL_TYPE_ID = "credentialTypeId";
    private String credentialTypeId;

    public static final String JSON_PROPERTY_JSON_SCHEMA_URL = "jsonSchemaUrl";
    private String jsonSchemaUrl;

    public static final String JSON_PROPERTY_JSON_LD_CONTEXT_URL = "jsonLdContextUrl";
    private String jsonLdContextUrl;

    public static final String JSON_PROPERTY_METADATA = "metadata";
    private SupportedCredentialMetadata metadata;

    public CredentialSupportedObject() {
    }

    public CredentialSupportedObject credentialTypeId(String credentialTypeId) {

        this.credentialTypeId = credentialTypeId;
        return this;
    }

    /**
     * It is a String that identifies a Credential that is being requested to be issued.
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

    public CredentialSupportedObject jsonSchemaUrl(String jsonSchemaUrl) {

        this.jsonSchemaUrl = jsonSchemaUrl;
        return this;
    }

    /**
     * credential jsonLdContextUrl
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

    public CredentialSupportedObject jsonLdContextUrl(String jsonLdContextUrl) {

        this.jsonLdContextUrl = jsonLdContextUrl;
        return this;
    }

    /**
     * credential jsonSchemaUrl
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

    public CredentialSupportedObject metadata(SupportedCredentialMetadata metadata) {

        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public SupportedCredentialMetadata getMetadata() {
        return metadata;
    }

    @JsonProperty(JSON_PROPERTY_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMetadata(SupportedCredentialMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CredentialSupportedObject credentialSupportedObject = (CredentialSupportedObject) o;
        return Objects.equals(this.credentialTypeId, credentialSupportedObject.credentialTypeId)
                && Objects.equals(this.jsonSchemaUrl, credentialSupportedObject.jsonSchemaUrl)
                && Objects.equals(this.jsonLdContextUrl, credentialSupportedObject.jsonLdContextUrl)
                && Objects.equals(this.metadata, credentialSupportedObject.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentialTypeId, jsonSchemaUrl, jsonLdContextUrl, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CredentialSupportedObject {\n");
        sb.append("    credentialTypeId: ").append(toIndentedString(credentialTypeId)).append("\n");
        sb.append("    jsonSchemaUrl: ").append(toIndentedString(jsonSchemaUrl)).append("\n");
        sb.append("    jsonLdContextUrl: ").append(toIndentedString(jsonLdContextUrl)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

        // add `metadata` to the URL query string
        if (getMetadata() != null) {
            try {
                joiner.add(String.format("%smetadata%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getMetadata()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        return joiner.toString();
    }

}
