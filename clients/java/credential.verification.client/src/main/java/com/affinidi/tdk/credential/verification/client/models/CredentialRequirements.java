/*
 * VerificationService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.affinidi.tdk.credential.verification.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.affinidi.tdk.credential.verification.client.models.CredentialRequirementsConstraints;
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
 * Requirements of the VC
 */
@JsonPropertyOrder({ CredentialRequirements.JSON_PROPERTY_TYPE, CredentialRequirements.JSON_PROPERTY_CONSTRAINTS })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CredentialRequirements {
    public static final String JSON_PROPERTY_TYPE = "type";
    private List<String> type = new ArrayList<>();

    public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
    private CredentialRequirementsConstraints constraints;

    public CredentialRequirements() {
    }

    public CredentialRequirements type(List<String> type) {

        this.type = type;
        return this;
    }

    public CredentialRequirements addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    /**
     * Type list of the VC requirements
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public List<String> getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(List<String> type) {
        this.type = type;
    }

    public CredentialRequirements constraints(CredentialRequirementsConstraints constraints) {

        this.constraints = constraints;
        return this;
    }

    /**
     * Get constraints
     *
     * @return constraints
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public CredentialRequirementsConstraints getConstraints() {
        return constraints;
    }

    @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConstraints(CredentialRequirementsConstraints constraints) {
        this.constraints = constraints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CredentialRequirements credentialRequirements = (CredentialRequirements) o;
        return Objects.equals(this.type, credentialRequirements.type)
                && Objects.equals(this.constraints, credentialRequirements.constraints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, constraints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CredentialRequirements {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

        // add `type` to the URL query string
        if (getType() != null) {
            for (int i = 0; i < getType().size(); i++) {
                try {
                    joiner.add(String.format("%stype%s%s=%s", prefix, suffix,
                            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                            URLEncoder.encode(String.valueOf(getType().get(i)), "UTF-8").replaceAll("\\+", "%20")));
                } catch (UnsupportedEncodingException e) {
                    // Should never happen, UTF-8 is always supported
                    throw new RuntimeException(e);
                }
            }
        }

        // add `constraints` to the URL query string
        if (getConstraints() != null) {
            joiner.add(getConstraints().toUrlQueryString(prefix + "constraints" + suffix));
        }

        return joiner.toString();
    }

}
