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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CredentialResponseDeferred
 */
@JsonPropertyOrder({
  CredentialResponseDeferred.JSON_PROPERTY_TRANSACTION_ID,
  CredentialResponseDeferred.JSON_PROPERTY_C_NONCE,
  CredentialResponseDeferred.JSON_PROPERTY_C_NONCE_EXPIRES_IN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:40:30.454277569Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CredentialResponseDeferred {
  public static final String JSON_PROPERTY_TRANSACTION_ID = "transaction_id";
  private String transactionId;

  public static final String JSON_PROPERTY_C_NONCE = "c_nonce";
  private String cNonce;

  public static final String JSON_PROPERTY_C_NONCE_EXPIRES_IN = "c_nonce_expires_in";
  private BigDecimal cNonceExpiresIn;

  public CredentialResponseDeferred() {
  }

  public CredentialResponseDeferred transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

  /**
   * String identifying a Deferred Issuance transaction. This claim is contained in the response if the Credential Issuer was unable to immediately issue the Credential.
   * @return transactionId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransactionId() {
    return transactionId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public CredentialResponseDeferred cNonce(String cNonce) {
    
    this.cNonce = cNonce;
    return this;
  }

  /**
   * String containing a nonce to be used when creating a proof of possession of the key proof
   * @return cNonce
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_C_NONCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getcNonce() {
    return cNonce;
  }


  @JsonProperty(JSON_PROPERTY_C_NONCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setcNonce(String cNonce) {
    this.cNonce = cNonce;
  }

  public CredentialResponseDeferred cNonceExpiresIn(BigDecimal cNonceExpiresIn) {
    
    this.cNonceExpiresIn = cNonceExpiresIn;
    return this;
  }

  /**
   * Lifetime in seconds of the c_nonce
   * @return cNonceExpiresIn
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_C_NONCE_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getcNonceExpiresIn() {
    return cNonceExpiresIn;
  }


  @JsonProperty(JSON_PROPERTY_C_NONCE_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setcNonceExpiresIn(BigDecimal cNonceExpiresIn) {
    this.cNonceExpiresIn = cNonceExpiresIn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialResponseDeferred credentialResponseDeferred = (CredentialResponseDeferred) o;
    return Objects.equals(this.transactionId, credentialResponseDeferred.transactionId) &&
        Objects.equals(this.cNonce, credentialResponseDeferred.cNonce) &&
        Objects.equals(this.cNonceExpiresIn, credentialResponseDeferred.cNonceExpiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, cNonce, cNonceExpiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialResponseDeferred {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    cNonce: ").append(toIndentedString(cNonce)).append("\n");
    sb.append("    cNonceExpiresIn: ").append(toIndentedString(cNonceExpiresIn)).append("\n");
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

    // add `transaction_id` to the URL query string
    if (getTransactionId() != null) {
      try {
        joiner.add(String.format("%stransaction_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `c_nonce` to the URL query string
    if (getcNonce() != null) {
      try {
        joiner.add(String.format("%sc_nonce%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getcNonce()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `c_nonce_expires_in` to the URL query string
    if (getcNonceExpiresIn() != null) {
      try {
        joiner.add(String.format("%sc_nonce_expires_in%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getcNonceExpiresIn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

