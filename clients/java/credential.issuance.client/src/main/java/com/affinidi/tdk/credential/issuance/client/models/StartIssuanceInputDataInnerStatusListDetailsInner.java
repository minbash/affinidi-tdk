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
 * StartIssuanceInputDataInnerStatusListDetailsInner
 */
@JsonPropertyOrder({ StartIssuanceInputDataInnerStatusListDetailsInner.JSON_PROPERTY_PURPOSE,
        StartIssuanceInputDataInnerStatusListDetailsInner.JSON_PROPERTY_STANDARD })
@JsonTypeName("StartIssuanceInput_data_inner_statusListDetails_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class StartIssuanceInputDataInnerStatusListDetailsInner {
    /**
     * Gets or Sets purpose
     */
    public enum PurposeEnum {
        REVOCABLE("REVOCABLE");

        private String value;

        PurposeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PurposeEnum fromValue(String value) {
            for (PurposeEnum b : PurposeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_PURPOSE = "purpose";
    private PurposeEnum purpose;

    /**
     * Gets or Sets standard
     */
    public enum StandardEnum {
        REVOCATION_LIST2020("RevocationList2020"),

        BITSTRING_STATUS_LIST_V1("BitstringStatusListV1");

        private String value;

        StandardEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StandardEnum fromValue(String value) {
            for (StandardEnum b : StandardEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_STANDARD = "standard";
    private StandardEnum standard;

    public StartIssuanceInputDataInnerStatusListDetailsInner() {
    }

    public StartIssuanceInputDataInnerStatusListDetailsInner purpose(PurposeEnum purpose) {

        this.purpose = purpose;
        return this;
    }

    /**
     * Get purpose
     *
     * @return purpose
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PURPOSE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public PurposeEnum getPurpose() {
        return purpose;
    }

    @JsonProperty(JSON_PROPERTY_PURPOSE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPurpose(PurposeEnum purpose) {
        this.purpose = purpose;
    }

    public StartIssuanceInputDataInnerStatusListDetailsInner standard(StandardEnum standard) {

        this.standard = standard;
        return this;
    }

    /**
     * Get standard
     *
     * @return standard
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STANDARD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public StandardEnum getStandard() {
        return standard;
    }

    @JsonProperty(JSON_PROPERTY_STANDARD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStandard(StandardEnum standard) {
        this.standard = standard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartIssuanceInputDataInnerStatusListDetailsInner startIssuanceInputDataInnerStatusListDetailsInner = (StartIssuanceInputDataInnerStatusListDetailsInner) o;
        return Objects.equals(this.purpose, startIssuanceInputDataInnerStatusListDetailsInner.purpose)
                && Objects.equals(this.standard, startIssuanceInputDataInnerStatusListDetailsInner.standard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purpose, standard);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartIssuanceInputDataInnerStatusListDetailsInner {\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
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

        // add `purpose` to the URL query string
        if (getPurpose() != null) {
            try {
                joiner.add(String.format("%spurpose%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getPurpose()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `standard` to the URL query string
        if (getStandard() != null) {
            try {
                joiner.add(String.format("%sstandard%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getStandard()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        return joiner.toString();
    }

}
