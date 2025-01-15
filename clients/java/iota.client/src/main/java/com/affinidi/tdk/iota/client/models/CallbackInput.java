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
 * CallbackInput
 */
@JsonPropertyOrder({
  CallbackInput.JSON_PROPERTY_STATE,
  CallbackInput.JSON_PROPERTY_PRESENTATION_SUBMISSION,
  CallbackInput.JSON_PROPERTY_VP_TOKEN,
  CallbackInput.JSON_PROPERTY_ERROR,
  CallbackInput.JSON_PROPERTY_ERROR_DESCRIPTION,
  CallbackInput.JSON_PROPERTY_ONBOARDED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CallbackInput {
  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_PRESENTATION_SUBMISSION = "presentation_submission";
  private String presentationSubmission;

  public static final String JSON_PROPERTY_VP_TOKEN = "vp_token";
  private String vpToken;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_ERROR_DESCRIPTION = "error_description";
  private String errorDescription;

  public static final String JSON_PROPERTY_ONBOARDED = "onboarded";
  private Boolean onboarded;

  public CallbackInput() {
  }

  public CallbackInput state(String state) {
    
    this.state = state;
    return this;
  }

  /**
   * A randomly generated string that follows a valid UUID (version 1-5) format to validate the session.
   * @return state
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(String state) {
    this.state = state;
  }

  public CallbackInput presentationSubmission(String presentationSubmission) {
    
    this.presentationSubmission = presentationSubmission;
    return this;
  }

  /**
   * A JSON string format that describes the link between the Verifiable Presentation and Presentation Definition for the verifier. The presentation submission follows the OID4VP standard.
   * @return presentationSubmission
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESENTATION_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPresentationSubmission() {
    return presentationSubmission;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATION_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentationSubmission(String presentationSubmission) {
    this.presentationSubmission = presentationSubmission;
  }

  public CallbackInput vpToken(String vpToken) {
    
    this.vpToken = vpToken;
    return this;
  }

  /**
   * A JSON string format containing the data the user consented to share in a Verifiable Presentation format. The VP Token follows the OID4VP standard.
   * @return vpToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VP_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVpToken() {
    return vpToken;
  }


  @JsonProperty(JSON_PROPERTY_VP_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpToken(String vpToken) {
    this.vpToken = vpToken;
  }

  public CallbackInput error(String error) {
    
    this.error = error;
    return this;
  }

  /**
   * A short string indicating the error code reported by the service. It follows the OAuth 2.0 error code format (e.g., invalid_request, access_denied). The default is access_denied.
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }

  public CallbackInput errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * A human-readable description that provides detailed information about the error.
   * @return errorDescription
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDescription() {
    return errorDescription;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public CallbackInput onboarded(Boolean onboarded) {
    
    this.onboarded = onboarded;
    return this;
  }

  /**
   * It specifies whether the data sharing flow triggered an onboarding process to the Affinidi Vault [New User].
   * @return onboarded
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONBOARDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnboarded() {
    return onboarded;
  }


  @JsonProperty(JSON_PROPERTY_ONBOARDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnboarded(Boolean onboarded) {
    this.onboarded = onboarded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackInput callbackInput = (CallbackInput) o;
    return Objects.equals(this.state, callbackInput.state) &&
        Objects.equals(this.presentationSubmission, callbackInput.presentationSubmission) &&
        Objects.equals(this.vpToken, callbackInput.vpToken) &&
        Objects.equals(this.error, callbackInput.error) &&
        Objects.equals(this.errorDescription, callbackInput.errorDescription) &&
        Objects.equals(this.onboarded, callbackInput.onboarded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, presentationSubmission, vpToken, error, errorDescription, onboarded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackInput {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    presentationSubmission: ").append(toIndentedString(presentationSubmission)).append("\n");
    sb.append("    vpToken: ").append(toIndentedString(vpToken)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    onboarded: ").append(toIndentedString(onboarded)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
   * @param prefix prefix of the query string
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `presentation_submission` to the URL query string
    if (getPresentationSubmission() != null) {
      try {
        joiner.add(String.format("%spresentation_submission%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPresentationSubmission()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `vp_token` to the URL query string
    if (getVpToken() != null) {
      try {
        joiner.add(String.format("%svp_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVpToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error` to the URL query string
    if (getError() != null) {
      try {
        joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `error_description` to the URL query string
    if (getErrorDescription() != null) {
      try {
        joiner.add(String.format("%serror_description%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getErrorDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `onboarded` to the URL query string
    if (getOnboarded() != null) {
      try {
        joiner.add(String.format("%sonboarded%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOnboarded()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

