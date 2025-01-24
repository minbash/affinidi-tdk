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
 * UpdateNodeInput
 */
@JsonPropertyOrder({ UpdateNodeInput.JSON_PROPERTY_NAME, UpdateNodeInput.JSON_PROPERTY_DESCRIPTION,
        UpdateNodeInput.JSON_PROPERTY_METADATA })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class UpdateNodeInput {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_METADATA = "metadata";
    private String metadata;

    public UpdateNodeInput() {
    }

    public UpdateNodeInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Name of the node
     *
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

    public UpdateNodeInput description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Description of the node
     *
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

    public UpdateNodeInput metadata(String metadata) {

        this.metadata = metadata;
        return this;
    }

    /**
     * metadata of the node in stringified json format
     *
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNodeInput updateNodeInput = (UpdateNodeInput) o;
        return Objects.equals(this.name, updateNodeInput.name)
                && Objects.equals(this.description, updateNodeInput.description)
                && Objects.equals(this.metadata, updateNodeInput.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodeInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

        // add `name` to the URL query string
        if (getName() != null) {
            try {
                joiner.add(String.format("%sname%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `description` to the URL query string
        if (getDescription() != null) {
            try {
                joiner.add(String.format("%sdescription%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
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
