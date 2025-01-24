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
import com.affinidi.tdk.credential.verification.client.models.W3cCredentialCredentialSchema;
import com.affinidi.tdk.credential.verification.client.models.W3cCredentialCredentialSubject;
import com.affinidi.tdk.credential.verification.client.models.W3cCredentialHolder;
import com.affinidi.tdk.credential.verification.client.models.W3cCredentialStatus;
import com.affinidi.tdk.credential.verification.client.models.W3cPresentationContext;
import com.affinidi.tdk.credential.verification.client.models.W3cProof;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * W3cCredential
 */
@JsonPropertyOrder({ W3cCredential.JSON_PROPERTY_AT_CONTEXT, W3cCredential.JSON_PROPERTY_ID,
        W3cCredential.JSON_PROPERTY_TYPE, W3cCredential.JSON_PROPERTY_HOLDER,
        W3cCredential.JSON_PROPERTY_CREDENTIAL_SUBJECT, W3cCredential.JSON_PROPERTY_CREDENTIAL_STATUS,
        W3cCredential.JSON_PROPERTY_ISSUANCE_DATE, W3cCredential.JSON_PROPERTY_ISSUER,
        W3cCredential.JSON_PROPERTY_EXPIRATION_DATE, W3cCredential.JSON_PROPERTY_PROOF,
        W3cCredential.JSON_PROPERTY_CREDENTIAL_SCHEMA })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class W3cCredential {
    public static final String JSON_PROPERTY_AT_CONTEXT = "@context";
    private W3cPresentationContext atContext;

    public static final String JSON_PROPERTY_ID = "id";
    private JsonNullable<String> id = JsonNullable.<String> undefined();

    public static final String JSON_PROPERTY_TYPE = "type";
    private List<String> type = new ArrayList<>();

    public static final String JSON_PROPERTY_HOLDER = "holder";
    private W3cCredentialHolder holder;

    public static final String JSON_PROPERTY_CREDENTIAL_SUBJECT = "credentialSubject";
    private W3cCredentialCredentialSubject credentialSubject;

    public static final String JSON_PROPERTY_CREDENTIAL_STATUS = "credentialStatus";
    private W3cCredentialStatus credentialStatus;

    public static final String JSON_PROPERTY_ISSUANCE_DATE = "issuanceDate";
    private String issuanceDate;

    public static final String JSON_PROPERTY_ISSUER = "issuer";
    private String issuer;

    public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
    private JsonNullable<String> expirationDate = JsonNullable.<String> undefined();

    public static final String JSON_PROPERTY_PROOF = "proof";
    private W3cProof proof;

    public static final String JSON_PROPERTY_CREDENTIAL_SCHEMA = "credentialSchema";
    private W3cCredentialCredentialSchema credentialSchema;

    public W3cCredential() {
    }

    public W3cCredential atContext(W3cPresentationContext atContext) {

        this.atContext = atContext;
        return this;
    }

    /**
     * Get atContext
     *
     * @return atContext
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_AT_CONTEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public W3cPresentationContext getAtContext() {
        return atContext;
    }

    @JsonProperty(JSON_PROPERTY_AT_CONTEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAtContext(W3cPresentationContext atContext) {
        this.atContext = atContext;
    }

    public W3cCredential id(String id) {
        this.id = JsonNullable.<String> of(id);

        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @JsonIgnore

    public String getId() {
        return id.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public JsonNullable<String> getId_JsonNullable() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    public void setId_JsonNullable(JsonNullable<String> id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = JsonNullable.<String> of(id);
    }

    public W3cCredential type(List<String> type) {

        this.type = type;
        return this;
    }

    public W3cCredential addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    /**
     * Get type
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

    public W3cCredential holder(W3cCredentialHolder holder) {

        this.holder = holder;
        return this;
    }

    /**
     * Get holder
     *
     * @return holder
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_HOLDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public W3cCredentialHolder getHolder() {
        return holder;
    }

    @JsonProperty(JSON_PROPERTY_HOLDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHolder(W3cCredentialHolder holder) {
        this.holder = holder;
    }

    public W3cCredential credentialSubject(W3cCredentialCredentialSubject credentialSubject) {

        this.credentialSubject = credentialSubject;
        return this;
    }

    /**
     * Get credentialSubject
     *
     * @return credentialSubject
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CREDENTIAL_SUBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public W3cCredentialCredentialSubject getCredentialSubject() {
        return credentialSubject;
    }

    @JsonProperty(JSON_PROPERTY_CREDENTIAL_SUBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCredentialSubject(W3cCredentialCredentialSubject credentialSubject) {
        this.credentialSubject = credentialSubject;
    }

    public W3cCredential credentialStatus(W3cCredentialStatus credentialStatus) {

        this.credentialStatus = credentialStatus;
        return this;
    }

    /**
     * Get credentialStatus
     *
     * @return credentialStatus
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CREDENTIAL_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public W3cCredentialStatus getCredentialStatus() {
        return credentialStatus;
    }

    @JsonProperty(JSON_PROPERTY_CREDENTIAL_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCredentialStatus(W3cCredentialStatus credentialStatus) {
        this.credentialStatus = credentialStatus;
    }

    public W3cCredential issuanceDate(String issuanceDate) {

        this.issuanceDate = issuanceDate;
        return this;
    }

    /**
     * Get issuanceDate
     *
     * @return issuanceDate
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ISSUANCE_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getIssuanceDate() {
        return issuanceDate;
    }

    @JsonProperty(JSON_PROPERTY_ISSUANCE_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIssuanceDate(String issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public W3cCredential issuer(String issuer) {

        this.issuer = issuer;
        return this;
    }

    /**
     * Get issuer
     *
     * @return issuer
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ISSUER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getIssuer() {
        return issuer;
    }

    @JsonProperty(JSON_PROPERTY_ISSUER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public W3cCredential expirationDate(String expirationDate) {
        this.expirationDate = JsonNullable.<String> of(expirationDate);

        return this;
    }

    /**
     * Get expirationDate
     *
     * @return expirationDate
     */
    @javax.annotation.Nullable
    @JsonIgnore

    public String getExpirationDate() {
        return expirationDate.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public JsonNullable<String> getExpirationDate_JsonNullable() {
        return expirationDate;
    }

    @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
    public void setExpirationDate_JsonNullable(JsonNullable<String> expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = JsonNullable.<String> of(expirationDate);
    }

    public W3cCredential proof(W3cProof proof) {

        this.proof = proof;
        return this;
    }

    /**
     * Get proof
     *
     * @return proof
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PROOF)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public W3cProof getProof() {
        return proof;
    }

    @JsonProperty(JSON_PROPERTY_PROOF)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setProof(W3cProof proof) {
        this.proof = proof;
    }

    public W3cCredential credentialSchema(W3cCredentialCredentialSchema credentialSchema) {

        this.credentialSchema = credentialSchema;
        return this;
    }

    /**
     * Get credentialSchema
     *
     * @return credentialSchema
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CREDENTIAL_SCHEMA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public W3cCredentialCredentialSchema getCredentialSchema() {
        return credentialSchema;
    }

    @JsonProperty(JSON_PROPERTY_CREDENTIAL_SCHEMA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCredentialSchema(W3cCredentialCredentialSchema credentialSchema) {
        this.credentialSchema = credentialSchema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        W3cCredential w3cCredential = (W3cCredential) o;
        return Objects.equals(this.atContext, w3cCredential.atContext) && equalsNullable(this.id, w3cCredential.id)
                && Objects.equals(this.type, w3cCredential.type) && Objects.equals(this.holder, w3cCredential.holder)
                && Objects.equals(this.credentialSubject, w3cCredential.credentialSubject)
                && Objects.equals(this.credentialStatus, w3cCredential.credentialStatus)
                && Objects.equals(this.issuanceDate, w3cCredential.issuanceDate)
                && Objects.equals(this.issuer, w3cCredential.issuer)
                && equalsNullable(this.expirationDate, w3cCredential.expirationDate)
                && Objects.equals(this.proof, w3cCredential.proof)
                && Objects.equals(this.credentialSchema, w3cCredential.credentialSchema);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(atContext, hashCodeNullable(id), type, holder, credentialSubject, credentialStatus,
                issuanceDate, issuer, hashCodeNullable(expirationDate), proof, credentialSchema);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] { a.get() }) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class W3cCredential {\n");
        sb.append("    atContext: ").append(toIndentedString(atContext)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
        sb.append("    credentialSubject: ").append(toIndentedString(credentialSubject)).append("\n");
        sb.append("    credentialStatus: ").append(toIndentedString(credentialStatus)).append("\n");
        sb.append("    issuanceDate: ").append(toIndentedString(issuanceDate)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
        sb.append("    proof: ").append(toIndentedString(proof)).append("\n");
        sb.append("    credentialSchema: ").append(toIndentedString(credentialSchema)).append("\n");
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

        // add `@context` to the URL query string
        if (getAtContext() != null) {
            joiner.add(getAtContext().toUrlQueryString(prefix + "@context" + suffix));
        }

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

        // add `holder` to the URL query string
        if (getHolder() != null) {
            joiner.add(getHolder().toUrlQueryString(prefix + "holder" + suffix));
        }

        // add `credentialSubject` to the URL query string
        if (getCredentialSubject() != null) {
            joiner.add(getCredentialSubject().toUrlQueryString(prefix + "credentialSubject" + suffix));
        }

        // add `credentialStatus` to the URL query string
        if (getCredentialStatus() != null) {
            joiner.add(getCredentialStatus().toUrlQueryString(prefix + "credentialStatus" + suffix));
        }

        // add `issuanceDate` to the URL query string
        if (getIssuanceDate() != null) {
            try {
                joiner.add(String.format("%sissuanceDate%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getIssuanceDate()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `issuer` to the URL query string
        if (getIssuer() != null) {
            try {
                joiner.add(String.format("%sissuer%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getIssuer()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `expirationDate` to the URL query string
        if (getExpirationDate() != null) {
            try {
                joiner.add(String.format("%sexpirationDate%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getExpirationDate()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `proof` to the URL query string
        if (getProof() != null) {
            joiner.add(getProof().toUrlQueryString(prefix + "proof" + suffix));
        }

        // add `credentialSchema` to the URL query string
        if (getCredentialSchema() != null) {
            joiner.add(getCredentialSchema().toUrlQueryString(prefix + "credentialSchema" + suffix));
        }

        return joiner.toString();
    }

}
