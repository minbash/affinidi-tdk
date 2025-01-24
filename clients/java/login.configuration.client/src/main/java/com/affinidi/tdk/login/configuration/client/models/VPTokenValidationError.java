/*
 * OidcVpAdapterBackend
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.affinidi.tdk.login.configuration.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.affinidi.tdk.login.configuration.client.models.InvalidParameterErrorDetailsInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * VPTokenValidationError
 */
@JsonPropertyOrder({ VPTokenValidationError.JSON_PROPERTY_NAME, VPTokenValidationError.JSON_PROPERTY_MESSAGE,
        VPTokenValidationError.JSON_PROPERTY_HTTP_STATUS_CODE, VPTokenValidationError.JSON_PROPERTY_TRACE_ID,
        VPTokenValidationError.JSON_PROPERTY_DETAILS })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class VPTokenValidationError {
    /**
     * Gets or Sets name
     */
    public enum NameEnum {
        VP_TOKEN_VALIDATION_ERROR("VPTokenValidationError");

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            for (NameEnum b : NameEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_NAME = "name";
    private NameEnum name;

    /**
     * Gets or Sets message
     */
    public enum MessageEnum {
        VP_TOKEN_VALIDATION_ENDED_WITH_AN_ERROR("VP token validation ended with an error");

        private String value;

        MessageEnum(String value) {
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
        public static MessageEnum fromValue(String value) {
            for (MessageEnum b : MessageEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private MessageEnum message;

    /**
     * Gets or Sets httpStatusCode
     */
    public enum HttpStatusCodeEnum {
        NUMBER_400(new BigDecimal("400"));

        private BigDecimal value;

        HttpStatusCodeEnum(BigDecimal value) {
            this.value = value;
        }

        @JsonValue
        public BigDecimal getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HttpStatusCodeEnum fromValue(BigDecimal value) {
            for (HttpStatusCodeEnum b : HttpStatusCodeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_HTTP_STATUS_CODE = "httpStatusCode";
    private HttpStatusCodeEnum httpStatusCode;

    public static final String JSON_PROPERTY_TRACE_ID = "traceId";
    private String traceId;

    public static final String JSON_PROPERTY_DETAILS = "details";
    private List<InvalidParameterErrorDetailsInner> details = new ArrayList<>();

    public VPTokenValidationError() {
    }

    public VPTokenValidationError name(NameEnum name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public NameEnum getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(NameEnum name) {
        this.name = name;
    }

    public VPTokenValidationError message(MessageEnum message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public MessageEnum getMessage() {
        return message;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMessage(MessageEnum message) {
        this.message = message;
    }

    public VPTokenValidationError httpStatusCode(HttpStatusCodeEnum httpStatusCode) {

        this.httpStatusCode = httpStatusCode;
        return this;
    }

    /**
     * Get httpStatusCode
     *
     * @return httpStatusCode
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_HTTP_STATUS_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public HttpStatusCodeEnum getHttpStatusCode() {
        return httpStatusCode;
    }

    @JsonProperty(JSON_PROPERTY_HTTP_STATUS_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setHttpStatusCode(HttpStatusCodeEnum httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public VPTokenValidationError traceId(String traceId) {

        this.traceId = traceId;
        return this;
    }

    /**
     * Get traceId
     *
     * @return traceId
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TRACE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getTraceId() {
        return traceId;
    }

    @JsonProperty(JSON_PROPERTY_TRACE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public VPTokenValidationError details(List<InvalidParameterErrorDetailsInner> details) {

        this.details = details;
        return this;
    }

    public VPTokenValidationError addDetailsItem(InvalidParameterErrorDetailsInner detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    /**
     * Get details
     *
     * @return details
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<InvalidParameterErrorDetailsInner> getDetails() {
        return details;
    }

    @JsonProperty(JSON_PROPERTY_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDetails(List<InvalidParameterErrorDetailsInner> details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VPTokenValidationError vpTokenValidationError = (VPTokenValidationError) o;
        return Objects.equals(this.name, vpTokenValidationError.name)
                && Objects.equals(this.message, vpTokenValidationError.message)
                && Objects.equals(this.httpStatusCode, vpTokenValidationError.httpStatusCode)
                && Objects.equals(this.traceId, vpTokenValidationError.traceId)
                && Objects.equals(this.details, vpTokenValidationError.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, message, httpStatusCode, traceId, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VPTokenValidationError {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

        // add `message` to the URL query string
        if (getMessage() != null) {
            try {
                joiner.add(String.format("%smessage%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `httpStatusCode` to the URL query string
        if (getHttpStatusCode() != null) {
            try {
                joiner.add(String.format("%shttpStatusCode%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getHttpStatusCode()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `traceId` to the URL query string
        if (getTraceId() != null) {
            try {
                joiner.add(String.format("%straceId%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getTraceId()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `details` to the URL query string
        if (getDetails() != null) {
            for (int i = 0; i < getDetails().size(); i++) {
                if (getDetails().get(i) != null) {
                    joiner.add(getDetails().get(i).toUrlQueryString(String.format("%sdetails%s%s", prefix, suffix,
                            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }

}
