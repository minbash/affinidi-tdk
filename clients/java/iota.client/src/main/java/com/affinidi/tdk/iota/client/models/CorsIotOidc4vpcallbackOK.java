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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CorsIotOidc4vpcallbackOK
 */
@JsonPropertyOrder({ CorsIotOidc4vpcallbackOK.JSON_PROPERTY_CORS_IOT_OIDC4VPCALLBACK_OK })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CorsIotOidc4vpcallbackOK {
    public static final String JSON_PROPERTY_CORS_IOT_OIDC4VPCALLBACK_OK = "corsIotOidc4vpcallbackOk";
    private String corsIotOidc4vpcallbackOk;

    public CorsIotOidc4vpcallbackOK() {
    }

    public CorsIotOidc4vpcallbackOK corsIotOidc4vpcallbackOk(String corsIotOidc4vpcallbackOk) {

        this.corsIotOidc4vpcallbackOk = corsIotOidc4vpcallbackOk;
        return this;
    }

    /**
     * Get corsIotOidc4vpcallbackOk
     *
     * @return corsIotOidc4vpcallbackOk
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CORS_IOT_OIDC4VPCALLBACK_OK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getCorsIotOidc4vpcallbackOk() {
        return corsIotOidc4vpcallbackOk;
    }

    @JsonProperty(JSON_PROPERTY_CORS_IOT_OIDC4VPCALLBACK_OK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCorsIotOidc4vpcallbackOk(String corsIotOidc4vpcallbackOk) {
        this.corsIotOidc4vpcallbackOk = corsIotOidc4vpcallbackOk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorsIotOidc4vpcallbackOK corsIotOidc4vpcallbackOK = (CorsIotOidc4vpcallbackOK) o;
        return Objects.equals(this.corsIotOidc4vpcallbackOk, corsIotOidc4vpcallbackOK.corsIotOidc4vpcallbackOk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corsIotOidc4vpcallbackOk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorsIotOidc4vpcallbackOK {\n");
        sb.append("    corsIotOidc4vpcallbackOk: ").append(toIndentedString(corsIotOidc4vpcallbackOk)).append("\n");
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

        // add `corsIotOidc4vpcallbackOk` to the URL query string
        if (getCorsIotOidc4vpcallbackOk() != null) {
            try {
                joiner.add(String.format("%scorsIotOidc4vpcallbackOk%s=%s", prefix, suffix, URLEncoder
                        .encode(String.valueOf(getCorsIotOidc4vpcallbackOk()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        return joiner.toString();
    }

}
