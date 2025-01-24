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
import com.affinidi.tdk.iam.client.models.JsonWebKeyDto;
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
 * JsonWebKeySetDto
 */
@JsonPropertyOrder({ JsonWebKeySetDto.JSON_PROPERTY_KEYS })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class JsonWebKeySetDto {
    public static final String JSON_PROPERTY_KEYS = "keys";
    private List<JsonWebKeyDto> keys = new ArrayList<>();

    public JsonWebKeySetDto() {
    }

    public JsonWebKeySetDto keys(List<JsonWebKeyDto> keys) {

        this.keys = keys;
        return this;
    }

    public JsonWebKeySetDto addKeysItem(JsonWebKeyDto keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    /**
     * Get keys
     *
     * @return keys
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_KEYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public List<JsonWebKeyDto> getKeys() {
        return keys;
    }

    @JsonProperty(JSON_PROPERTY_KEYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setKeys(List<JsonWebKeyDto> keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JsonWebKeySetDto jsonWebKeySetDto = (JsonWebKeySetDto) o;
        return Objects.equals(this.keys, jsonWebKeySetDto.keys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JsonWebKeySetDto {\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

        // add `keys` to the URL query string
        if (getKeys() != null) {
            for (int i = 0; i < getKeys().size(); i++) {
                if (getKeys().get(i) != null) {
                    joiner.add(getKeys().get(i).toUrlQueryString(String.format("%skeys%s%s", prefix, suffix,
                            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }

}
