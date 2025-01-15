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
 * Object containing the proof of possession of the cryptographic key material the issued Credential would be bound to.
 */
@JsonPropertyOrder({
  CredentialProof.JSON_PROPERTY_PROOF_TYPE,
  CredentialProof.JSON_PROPERTY_JWT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:40:30.454277569Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CredentialProof {
  /**
   * String denoting the key proof type.
   */
  public enum ProofTypeEnum {
    JWT("jwt");

    private String value;

    ProofTypeEnum(String value) {
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
    public static ProofTypeEnum fromValue(String value) {
      for (ProofTypeEnum b : ProofTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PROOF_TYPE = "proof_type";
  private ProofTypeEnum proofType;

  public static final String JSON_PROPERTY_JWT = "jwt";
  private String jwt;

  public CredentialProof() {
  }

  public CredentialProof proofType(ProofTypeEnum proofType) {
    
    this.proofType = proofType;
    return this;
  }

  /**
   * String denoting the key proof type.
   * @return proofType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROOF_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProofTypeEnum getProofType() {
    return proofType;
  }


  @JsonProperty(JSON_PROPERTY_PROOF_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProofType(ProofTypeEnum proofType) {
    this.proofType = proofType;
  }

  public CredentialProof jwt(String jwt) {
    
    this.jwt = jwt;
    return this;
  }

  /**
   * Get jwt
   * @return jwt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_JWT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getJwt() {
    return jwt;
  }


  @JsonProperty(JSON_PROPERTY_JWT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJwt(String jwt) {
    this.jwt = jwt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialProof credentialProof = (CredentialProof) o;
    return Objects.equals(this.proofType, credentialProof.proofType) &&
        Objects.equals(this.jwt, credentialProof.jwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proofType, jwt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialProof {\n");
    sb.append("    proofType: ").append(toIndentedString(proofType)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
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

    // add `proof_type` to the URL query string
    if (getProofType() != null) {
      try {
        joiner.add(String.format("%sproof_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProofType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `jwt` to the URL query string
    if (getJwt() != null) {
      try {
        joiner.add(String.format("%sjwt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJwt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

