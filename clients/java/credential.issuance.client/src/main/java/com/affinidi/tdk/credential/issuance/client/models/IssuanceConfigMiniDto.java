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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * IssuanceConfigMiniDto
 */
@JsonPropertyOrder({ IssuanceConfigMiniDto.JSON_PROPERTY_ID, IssuanceConfigMiniDto.JSON_PROPERTY_NAME,
        IssuanceConfigMiniDto.JSON_PROPERTY_ISSUER_DID, IssuanceConfigMiniDto.JSON_PROPERTY_ISSUER_WALLET_ID,
        IssuanceConfigMiniDto.JSON_PROPERTY_CREDENTIAL_OFFER_DURATION,
        IssuanceConfigMiniDto.JSON_PROPERTY_C_NONCE_DURATION, IssuanceConfigMiniDto.JSON_PROPERTY_FORMAT,
        IssuanceConfigMiniDto.JSON_PROPERTY_ISSUER_URI, IssuanceConfigMiniDto.JSON_PROPERTY_ISSUER_METADATA,
        IssuanceConfigMiniDto.JSON_PROPERTY_VERSION })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class IssuanceConfigMiniDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_ISSUER_DID = "issuerDid";
    private String issuerDid;

    public static final String JSON_PROPERTY_ISSUER_WALLET_ID = "issuerWalletId";
    private String issuerWalletId;

    public static final String JSON_PROPERTY_CREDENTIAL_OFFER_DURATION = "credentialOfferDuration";
    private BigDecimal credentialOfferDuration;

    public static final String JSON_PROPERTY_C_NONCE_DURATION = "cNonceDuration";
    private BigDecimal cNonceDuration;

    /**
     * String identifying the format of this Credential, i.e., jwt_vc_json-ld or ldp_vc. Depending on the format value,
     * the object contains further elements defining the type
     */
    public enum FormatEnum {
        LDP_VC("ldp_vc"),

        JWT_VC_JSON_LD("jwt_vc_json-ld"),

        SD_JWT_VC_JSON_LD("sd_jwt_vc_json-ld");

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            for (FormatEnum b : FormatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_FORMAT = "format";
    private FormatEnum format;

    public static final String JSON_PROPERTY_ISSUER_URI = "issuerUri";
    private String issuerUri;

    public static final String JSON_PROPERTY_ISSUER_METADATA = "issuerMetadata";
    private Map<String, Object> issuerMetadata = new HashMap<>();

    public static final String JSON_PROPERTY_VERSION = "version";
    private BigDecimal version;

    public IssuanceConfigMiniDto() {
    }

    public IssuanceConfigMiniDto id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public IssuanceConfigMiniDto name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
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

    public IssuanceConfigMiniDto issuerDid(String issuerDid) {

        this.issuerDid = issuerDid;
        return this;
    }

    /**
     * Issuer DID
     *
     * @return issuerDid
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ISSUER_DID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getIssuerDid() {
        return issuerDid;
    }

    @JsonProperty(JSON_PROPERTY_ISSUER_DID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
    }

    public IssuanceConfigMiniDto issuerWalletId(String issuerWalletId) {

        this.issuerWalletId = issuerWalletId;
        return this;
    }

    /**
     * Issuer Wallet id
     *
     * @return issuerWalletId
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ISSUER_WALLET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getIssuerWalletId() {
        return issuerWalletId;
    }

    @JsonProperty(JSON_PROPERTY_ISSUER_WALLET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIssuerWalletId(String issuerWalletId) {
        this.issuerWalletId = issuerWalletId;
    }

    public IssuanceConfigMiniDto credentialOfferDuration(BigDecimal credentialOfferDuration) {

        this.credentialOfferDuration = credentialOfferDuration;
        return this;
    }

    /**
     * credential offer duration in second
     *
     * @return credentialOfferDuration
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CREDENTIAL_OFFER_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getCredentialOfferDuration() {
        return credentialOfferDuration;
    }

    @JsonProperty(JSON_PROPERTY_CREDENTIAL_OFFER_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCredentialOfferDuration(BigDecimal credentialOfferDuration) {
        this.credentialOfferDuration = credentialOfferDuration;
    }

    public IssuanceConfigMiniDto cNonceDuration(BigDecimal cNonceDuration) {

        this.cNonceDuration = cNonceDuration;
        return this;
    }

    /**
     * c_nonce duration in second
     *
     * @return cNonceDuration
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_C_NONCE_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getcNonceDuration() {
        return cNonceDuration;
    }

    @JsonProperty(JSON_PROPERTY_C_NONCE_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setcNonceDuration(BigDecimal cNonceDuration) {
        this.cNonceDuration = cNonceDuration;
    }

    public IssuanceConfigMiniDto format(FormatEnum format) {

        this.format = format;
        return this;
    }

    /**
     * String identifying the format of this Credential, i.e., jwt_vc_json-ld or ldp_vc. Depending on the format value,
     * the object contains further elements defining the type
     *
     * @return format
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public FormatEnum getFormat() {
        return format;
    }

    @JsonProperty(JSON_PROPERTY_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public IssuanceConfigMiniDto issuerUri(String issuerUri) {

        this.issuerUri = issuerUri;
        return this;
    }

    /**
     * Issuer URI
     *
     * @return issuerUri
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ISSUER_URI)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getIssuerUri() {
        return issuerUri;
    }

    @JsonProperty(JSON_PROPERTY_ISSUER_URI)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIssuerUri(String issuerUri) {
        this.issuerUri = issuerUri;
    }

    public IssuanceConfigMiniDto issuerMetadata(Map<String, Object> issuerMetadata) {

        this.issuerMetadata = issuerMetadata;
        return this;
    }

    public IssuanceConfigMiniDto putIssuerMetadataItem(String key, Object issuerMetadataItem) {
        if (this.issuerMetadata == null) {
            this.issuerMetadata = new HashMap<>();
        }
        this.issuerMetadata.put(key, issuerMetadataItem);
        return this;
    }

    /**
     * Issuer public information wallet may want to show to user during consent confirmation
     *
     * @return issuerMetadata
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ISSUER_METADATA)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

    public Map<String, Object> getIssuerMetadata() {
        return issuerMetadata;
    }

    @JsonProperty(JSON_PROPERTY_ISSUER_METADATA)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
    public void setIssuerMetadata(Map<String, Object> issuerMetadata) {
        this.issuerMetadata = issuerMetadata;
    }

    public IssuanceConfigMiniDto version(BigDecimal version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getVersion() {
        return version;
    }

    @JsonProperty(JSON_PROPERTY_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuanceConfigMiniDto issuanceConfigMiniDto = (IssuanceConfigMiniDto) o;
        return Objects.equals(this.id, issuanceConfigMiniDto.id)
                && Objects.equals(this.name, issuanceConfigMiniDto.name)
                && Objects.equals(this.issuerDid, issuanceConfigMiniDto.issuerDid)
                && Objects.equals(this.issuerWalletId, issuanceConfigMiniDto.issuerWalletId)
                && Objects.equals(this.credentialOfferDuration, issuanceConfigMiniDto.credentialOfferDuration)
                && Objects.equals(this.cNonceDuration, issuanceConfigMiniDto.cNonceDuration)
                && Objects.equals(this.format, issuanceConfigMiniDto.format)
                && Objects.equals(this.issuerUri, issuanceConfigMiniDto.issuerUri)
                && Objects.equals(this.issuerMetadata, issuanceConfigMiniDto.issuerMetadata)
                && Objects.equals(this.version, issuanceConfigMiniDto.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, issuerDid, issuerWalletId, credentialOfferDuration, cNonceDuration, format,
                issuerUri, issuerMetadata, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuanceConfigMiniDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    issuerDid: ").append(toIndentedString(issuerDid)).append("\n");
        sb.append("    issuerWalletId: ").append(toIndentedString(issuerWalletId)).append("\n");
        sb.append("    credentialOfferDuration: ").append(toIndentedString(credentialOfferDuration)).append("\n");
        sb.append("    cNonceDuration: ").append(toIndentedString(cNonceDuration)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    issuerUri: ").append(toIndentedString(issuerUri)).append("\n");
        sb.append("    issuerMetadata: ").append(toIndentedString(issuerMetadata)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

        // add `id` to the URL query string
        if (getId() != null) {
            try {
                joiner.add(String.format("%sid%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

        // add `issuerDid` to the URL query string
        if (getIssuerDid() != null) {
            try {
                joiner.add(String.format("%sissuerDid%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getIssuerDid()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `issuerWalletId` to the URL query string
        if (getIssuerWalletId() != null) {
            try {
                joiner.add(String.format("%sissuerWalletId%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getIssuerWalletId()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `credentialOfferDuration` to the URL query string
        if (getCredentialOfferDuration() != null) {
            try {
                joiner.add(String.format("%scredentialOfferDuration%s=%s", prefix, suffix, URLEncoder
                        .encode(String.valueOf(getCredentialOfferDuration()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `cNonceDuration` to the URL query string
        if (getcNonceDuration() != null) {
            try {
                joiner.add(String.format("%scNonceDuration%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getcNonceDuration()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `format` to the URL query string
        if (getFormat() != null) {
            try {
                joiner.add(String.format("%sformat%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getFormat()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `issuerUri` to the URL query string
        if (getIssuerUri() != null) {
            try {
                joiner.add(String.format("%sissuerUri%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getIssuerUri()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `issuerMetadata` to the URL query string
        if (getIssuerMetadata() != null) {
            for (String _key : getIssuerMetadata().keySet()) {
                try {
                    joiner.add(String.format("%sissuerMetadata%s%s=%s", prefix, suffix,
                            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
                            getIssuerMetadata().get(_key),
                            URLEncoder.encode(String.valueOf(getIssuerMetadata().get(_key)), "UTF-8").replaceAll("\\+",
                                    "%20")));
                } catch (UnsupportedEncodingException e) {
                    // Should never happen, UTF-8 is always supported
                    throw new RuntimeException(e);
                }
            }
        }

        // add `version` to the URL query string
        if (getVersion() != null) {
            try {
                joiner.add(String.format("%sversion%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        return joiner.toString();
    }

}
