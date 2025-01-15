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
import com.affinidi.tdk.credential.issuance.client.models.CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCodeTxCode;
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
 * Grant type for &#x60;pre-authorized_code&#x60; flow
 */
@JsonPropertyOrder({
  CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode.JSON_PROPERTY_PRE_AUTHORIZED_CODE,
  CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode.JSON_PROPERTY_TX_CODE
})
@JsonTypeName("CredentialOfferResponse_grants_urn_ietf_params_oauth_grant_type_pre_authorized_code")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:40:30.454277569Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode {
  public static final String JSON_PROPERTY_PRE_AUTHORIZED_CODE = "pre-authorized_code";
  private String preAuthorizedCode;

  public static final String JSON_PROPERTY_TX_CODE = "tx_code";
  private CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCodeTxCode txCode;

  public CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode() {
  }

  public CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode preAuthorizedCode(String preAuthorizedCode) {
    
    this.preAuthorizedCode = preAuthorizedCode;
    return this;
  }

  /**
   * pre authorized code to be exchanged with jwt token
   * @return preAuthorizedCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRE_AUTHORIZED_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPreAuthorizedCode() {
    return preAuthorizedCode;
  }


  @JsonProperty(JSON_PROPERTY_PRE_AUTHORIZED_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreAuthorizedCode(String preAuthorizedCode) {
    this.preAuthorizedCode = preAuthorizedCode;
  }

  public CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode txCode(CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCodeTxCode txCode) {
    
    this.txCode = txCode;
    return this;
  }

  /**
   * Get txCode
   * @return txCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCodeTxCode getTxCode() {
    return txCode;
  }


  @JsonProperty(JSON_PROPERTY_TX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxCode(CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCodeTxCode txCode) {
    this.txCode = txCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode credentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode = (CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode) o;
    return Objects.equals(this.preAuthorizedCode, credentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode.preAuthorizedCode) &&
        Objects.equals(this.txCode, credentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode.txCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preAuthorizedCode, txCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialOfferResponseGrantsUrnIetfParamsOauthGrantTypePreAuthorizedCode {\n");
    sb.append("    preAuthorizedCode: ").append(toIndentedString(preAuthorizedCode)).append("\n");
    sb.append("    txCode: ").append(toIndentedString(txCode)).append("\n");
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

    // add `pre-authorized_code` to the URL query string
    if (getPreAuthorizedCode() != null) {
      try {
        joiner.add(String.format("%spre-authorized_code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPreAuthorizedCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tx_code` to the URL query string
    if (getTxCode() != null) {
      joiner.add(getTxCode().toUrlQueryString(prefix + "tx_code" + suffix));
    }

    return joiner.toString();
  }

}

