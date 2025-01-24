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
import com.affinidi.tdk.credential.issuance.client.models.SupportedCredentialMetadataDisplayInnerLogo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SupportedCredentialMetadataDisplayInner
 */
@JsonPropertyOrder({ SupportedCredentialMetadataDisplayInner.JSON_PROPERTY_NAME,
        SupportedCredentialMetadataDisplayInner.JSON_PROPERTY_LOCALE,
        SupportedCredentialMetadataDisplayInner.JSON_PROPERTY_LOGO,
        SupportedCredentialMetadataDisplayInner.JSON_PROPERTY_BACKGROUND_COLOR,
        SupportedCredentialMetadataDisplayInner.JSON_PROPERTY_TEXT_COLOR })
@JsonTypeName("SupportedCredentialMetadata_display_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class SupportedCredentialMetadataDisplayInner extends HashMap<String, Object> {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_LOCALE = "locale";
    private String locale;

    public static final String JSON_PROPERTY_LOGO = "logo";
    private SupportedCredentialMetadataDisplayInnerLogo logo;

    public static final String JSON_PROPERTY_BACKGROUND_COLOR = "backgroundColor";
    private String backgroundColor;

    public static final String JSON_PROPERTY_TEXT_COLOR = "textColor";
    private String textColor;

    public SupportedCredentialMetadataDisplayInner() {

    }

    public SupportedCredentialMetadataDisplayInner name(String name) {

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

    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public SupportedCredentialMetadataDisplayInner locale(String locale) {

        this.locale = locale;
        return this;
    }

    /**
     * Get locale
     *
     * @return locale
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_LOCALE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getLocale() {
        return locale;
    }

    @JsonProperty(JSON_PROPERTY_LOCALE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public SupportedCredentialMetadataDisplayInner logo(SupportedCredentialMetadataDisplayInnerLogo logo) {

        this.logo = logo;
        return this;
    }

    /**
     * Get logo
     *
     * @return logo
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_LOGO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public SupportedCredentialMetadataDisplayInnerLogo getLogo() {
        return logo;
    }

    @JsonProperty(JSON_PROPERTY_LOGO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLogo(SupportedCredentialMetadataDisplayInnerLogo logo) {
        this.logo = logo;
    }

    public SupportedCredentialMetadataDisplayInner backgroundColor(String backgroundColor) {

        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * Get backgroundColor
     *
     * @return backgroundColor
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getBackgroundColor() {
        return backgroundColor;
    }

    @JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public SupportedCredentialMetadataDisplayInner textColor(String textColor) {

        this.textColor = textColor;
        return this;
    }

    /**
     * Get textColor
     *
     * @return textColor
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TEXT_COLOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getTextColor() {
        return textColor;
    }

    @JsonProperty(JSON_PROPERTY_TEXT_COLOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupportedCredentialMetadataDisplayInner supportedCredentialMetadataDisplayInner = (SupportedCredentialMetadataDisplayInner) o;
        return Objects.equals(this.name, supportedCredentialMetadataDisplayInner.name)
                && Objects.equals(this.locale, supportedCredentialMetadataDisplayInner.locale)
                && Objects.equals(this.logo, supportedCredentialMetadataDisplayInner.logo)
                && Objects.equals(this.backgroundColor, supportedCredentialMetadataDisplayInner.backgroundColor)
                && Objects.equals(this.textColor, supportedCredentialMetadataDisplayInner.textColor) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, locale, logo, backgroundColor, textColor, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportedCredentialMetadataDisplayInner {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
        sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
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

        // add `locale` to the URL query string
        if (getLocale() != null) {
            try {
                joiner.add(String.format("%slocale%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getLocale()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `logo` to the URL query string
        if (getLogo() != null) {
            try {
                joiner.add(String.format("%slogo%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getLogo()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `backgroundColor` to the URL query string
        if (getBackgroundColor() != null) {
            try {
                joiner.add(String.format("%sbackgroundColor%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getBackgroundColor()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        // add `textColor` to the URL query string
        if (getTextColor() != null) {
            try {
                joiner.add(String.format("%stextColor%s=%s", prefix, suffix,
                        URLEncoder.encode(String.valueOf(getTextColor()), "UTF-8").replaceAll("\\+", "%20")));
            } catch (UnsupportedEncodingException e) {
                // Should never happen, UTF-8 is always supported
                throw new RuntimeException(e);
            }
        }

        return joiner.toString();
    }

}
