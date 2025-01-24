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
 * CorsGetCredentialOfferOK
 */
@JsonPropertyOrder({ CorsGetCredentialOfferOK.JSON_PROPERTY_CORS_GET_CREDENTIAL_OFFER_OK })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CorsGetCredentialOfferOK {
    public static final String JSON_PROPERTY_CORS_GET_CREDENTIAL_OFFER_OK = "corsGetCredentialOfferOk";
    private String corsGetCredentialOfferOk;

    public CorsGetCredentialOfferOK() {
    }

    public CorsGetCredentialOfferOK corsGetCredentialOfferOk(String corsGetCredentialOfferOk) {

        this.corsGetCredentialOfferOk = corsGetCredentialOfferOk;
        return this;
    }

    /**
     * Get corsGetCredentialOfferOk
     *
     * @return corsGetCredentialOfferOk
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CORS_GET_CREDENTIAL_OFFER_OK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getCorsGetCredentialOfferOk() {
        return corsGetCredentialOfferOk;
    }

    @JsonProperty(JSON_PROPERTY_CORS_GET_CREDENTIAL_OFFER_OK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCorsGetCredentialOfferOk(String corsGetCredentialOfferOk) {
        this.corsGetCredentialOfferOk = corsGetCredentialOfferOk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorsGetCredentialOfferOK corsGetCredentialOfferOK = (CorsGetCredentialOfferOK) o;
        return Objects.equals(this.corsGetCredentialOfferOk, corsGetCredentialOfferOK.corsGetCredentialOfferOk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corsGetCredentialOfferOk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorsGetCredentialOfferOK {\n");
        sb.append("    corsGetCredentialOfferOk: ").append(toIndentedString(corsGetCredentialOfferOk)).append("\n");
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

        // add `corsGetCredentialOfferOk` to the URL query string
        if (getCorsGetCredentialOfferOk() != null) {
            try {
                joiner.add(String.format("%scorsGetCredentialOfferOk%s=%s", prefix, suffix, URLEncoder
                        .encode(String.valueOf(getCorsGetCredentialOfferOk()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        return joiner.toString();
    }

}
