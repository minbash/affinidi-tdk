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
import com.affinidi.tdk.credential.verification.client.models.ErrorDetail;
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
 * Error object
 */
@JsonPropertyOrder({ Error.JSON_PROPERTY_ERROR_CODE, Error.JSON_PROPERTY_ERROR_MESSAGE, Error.JSON_PROPERTY_MESSAGE,
        Error.JSON_PROPERTY_NAME, Error.JSON_PROPERTY_DEBUG_ID, Error.JSON_PROPERTY_DETAILS })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class Error {
    public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
    private String errorCode;

    public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
    private String errorMessage;

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private String message;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_DEBUG_ID = "debugId";
    private String debugId;

    public static final String JSON_PROPERTY_DETAILS = "details";
    private List<ErrorDetail> details = new ArrayList<>();

    public Error() {
    }

    public Error errorCode(String errorCode) {

        this.errorCode = errorCode;
        return this;
    }

    /**
     * Error code
     *
     * @return errorCode
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Error errorMessage(String errorMessage) {

        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Error message
     *
     * @return errorMessage
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Error message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Verbose message
     *
     * @return message
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getMessage() {
        return message;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessage(String message) {
        this.message = message;
    }

    public Error name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Error name
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

    public Error debugId(String debugId) {

        this.debugId = debugId;
        return this;
    }

    /**
     * Debug identifier
     *
     * @return debugId
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DEBUG_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getDebugId() {
        return debugId;
    }

    @JsonProperty(JSON_PROPERTY_DEBUG_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDebugId(String debugId) {
        this.debugId = debugId;
    }

    public Error details(List<ErrorDetail> details) {

        this.details = details;
        return this;
    }

    public Error addDetailsItem(ErrorDetail detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    /**
     * Error details
     *
     * @return details
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ErrorDetail> getDetails() {
        return details;
    }

    @JsonProperty(JSON_PROPERTY_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDetails(List<ErrorDetail> details) {
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
        Error error = (Error) o;
        return Objects.equals(this.errorCode, error.errorCode) && Objects.equals(this.errorMessage, error.errorMessage)
                && Objects.equals(this.message, error.message) && Objects.equals(this.name, error.name)
                && Objects.equals(this.debugId, error.debugId) && Objects.equals(this.details, error.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMessage, message, name, debugId, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    debugId: ").append(toIndentedString(debugId)).append("\n");
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

        // add `errorCode` to the URL query string
        if (getErrorCode() != null) {
            try {
                joiner.add(String.format("%serrorCode%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getErrorCode()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `errorMessage` to the URL query string
        if (getErrorMessage() != null) {
            try {
                joiner.add(String.format("%serrorMessage%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getErrorMessage()), "UTF-8").replaceAll("\\+", "%20")));
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

        // add `debugId` to the URL query string
        if (getDebugId() != null) {
            try {
                joiner.add(String.format("%sdebugId%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getDebugId()), "UTF-8").replaceAll("\\+", "%20")));
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
