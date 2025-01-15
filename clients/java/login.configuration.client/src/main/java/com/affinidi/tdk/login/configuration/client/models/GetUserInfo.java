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
 * GetUserInfo
 */
@JsonPropertyOrder({
  GetUserInfo.JSON_PROPERTY_BIRTHDATE,
  GetUserInfo.JSON_PROPERTY_EMAIL,
  GetUserInfo.JSON_PROPERTY_EMAIL_VERIFIED,
  GetUserInfo.JSON_PROPERTY_FAMILY_NAME,
  GetUserInfo.JSON_PROPERTY_GENDER,
  GetUserInfo.JSON_PROPERTY_GIVEN_NAME,
  GetUserInfo.JSON_PROPERTY_LOCALE,
  GetUserInfo.JSON_PROPERTY_MIDDLE_NAME,
  GetUserInfo.JSON_PROPERTY_NAME,
  GetUserInfo.JSON_PROPERTY_NICKNAME,
  GetUserInfo.JSON_PROPERTY_PHONE_NUMBER,
  GetUserInfo.JSON_PROPERTY_PHONE_NUMBER_VERIFIED,
  GetUserInfo.JSON_PROPERTY_PICTURE,
  GetUserInfo.JSON_PROPERTY_PREFERRED_USERNAME,
  GetUserInfo.JSON_PROPERTY_PROFILE,
  GetUserInfo.JSON_PROPERTY_SUB,
  GetUserInfo.JSON_PROPERTY_UPDATED_AT,
  GetUserInfo.JSON_PROPERTY_WEBSITE,
  GetUserInfo.JSON_PROPERTY_ZONEINFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:39:52.417040092Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetUserInfo {
  public static final String JSON_PROPERTY_BIRTHDATE = "birthdate";
  private String birthdate;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_EMAIL_VERIFIED = "email_verified";
  private Boolean emailVerified;

  public static final String JSON_PROPERTY_FAMILY_NAME = "family_name";
  private String familyName;

  public static final String JSON_PROPERTY_GENDER = "gender";
  private String gender;

  public static final String JSON_PROPERTY_GIVEN_NAME = "given_name";
  private String givenName;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middle_name";
  private String middleName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NICKNAME = "nickname";
  private String nickname;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_PHONE_NUMBER_VERIFIED = "phone_number_verified";
  private Boolean phoneNumberVerified;

  public static final String JSON_PROPERTY_PICTURE = "picture";
  private String picture;

  public static final String JSON_PROPERTY_PREFERRED_USERNAME = "preferred_username";
  private String preferredUsername;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private String profile;

  public static final String JSON_PROPERTY_SUB = "sub";
  private String sub;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Integer updatedAt;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private String website;

  public static final String JSON_PROPERTY_ZONEINFO = "zoneinfo";
  private String zoneinfo;

  public GetUserInfo() {
  }

  public GetUserInfo birthdate(String birthdate) {
    
    this.birthdate = birthdate;
    return this;
  }

  /**
   * End-User&#39;s birthday, represented as an ISO 8601:2004 [ISO8601‑2004] YYYY-MM-DD format.  The year MAY be 0000, indicating that it is omitted. To represent only the year,  YYYY format is allowed. Note that depending on the underlying platform&#39;s date related  function, providing just year can result in varying month and day, so the implementers  need to take this factor into account to correctly process the dates. 
   * @return birthdate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIRTHDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBirthdate() {
    return birthdate;
  }


  @JsonProperty(JSON_PROPERTY_BIRTHDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  public GetUserInfo email(String email) {
    
    this.email = email;
    return this;
  }

  /**
   * End-User&#39;s preferred e-mail address. Its value MUST conform to the RFC 5322 [RFC5322]  addr-spec syntax. The RP MUST NOT rely upon this value being unique, as discussed in Section 5.7. 
   * @return email
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }

  public GetUserInfo emailVerified(Boolean emailVerified) {
    
    this.emailVerified = emailVerified;
    return this;
  }

  /**
   * True if the End-User&#39;s e-mail address has been verified; otherwise false. When this  Claim Value is true, this means that the OP took affirmative steps to ensure that  this e-mail address was controlled by the End-User at the time the verification was  performed. The means by which an e-mail address is verified is context-specific, and  dependent upon the trust framework or contractual agreements within which the parties  are operating. 
   * @return emailVerified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmailVerified() {
    return emailVerified;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public GetUserInfo familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

  /**
   * Surname(s) or last name(s) of the End-User. Note that in some cultures, people can have  multiple family names or no family name; all can be present, with the names being  separated by space characters. 
   * @return familyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamilyName() {
    return familyName;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public GetUserInfo gender(String gender) {
    
    this.gender = gender;
    return this;
  }

  /**
   * End-User&#39;s gender. Values defined by this specification are female and male.  Other values MAY be used when neither of the defined values are applicable. 
   * @return gender
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGender(String gender) {
    this.gender = gender;
  }

  public GetUserInfo givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

  /**
   * Given name(s) or first name(s) of the End-User. Note that in some cultures,  people can have multiple given names; all can be present, with the names being  separated by space characters. 
   * @return givenName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivenName() {
    return givenName;
  }


  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public GetUserInfo locale(String locale) {
    
    this.locale = locale;
    return this;
  }

  /**
   * End-User&#39;s locale, represented as a BCP47 [RFC5646] language tag. This is  typically an ISO 639-1 Alpha-2 [ISO639‑1] language code in lowercase and an  ISO 3166-1 Alpha-2 [ISO3166‑1] country code in uppercase, separated by a dash.  For example, en-US or fr-CA. As a compatibility note, some implementations have  used an underscore as the separator rather than a dash, for example, en_US;  Relying Parties MAY choose to accept this locale syntax as well. 
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

  public GetUserInfo middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name(s) of the End-User. Note that in some cultures, people can have  multiple middle names; all can be present, with the names being separated by  space characters. Also note that in some cultures, middle names are not used. 
   * @return middleName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMiddleName() {
    return middleName;
  }


  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public GetUserInfo name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * End-User&#39;s full name in displayable form including all name parts, possibly  including titles and suffixes, ordered according to the End-User&#39;s locale and preferences. 
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

  public GetUserInfo nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

  /**
   * Casual name of the End-User that may or may not be the same as the given_name.  For instance, a nickname value of Mike might be returned alongside a given_name value of Michael. 
   * @return nickname
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNickname() {
    return nickname;
  }


  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public GetUserInfo phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * End-User&#39;s preferred telephone number. E.164 [E.164] is RECOMMENDED as the format of this Claim,  for example, +1 (425) 555-1212 or +56 (2) 687 2400. If the phone number contains an extension,  it is RECOMMENDED that the extension be represented using the RFC 3966 [RFC3966] extension syntax,  for example, +1 (604) 555-1234;ext&#x3D;5678. 
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public GetUserInfo phoneNumberVerified(Boolean phoneNumberVerified) {
    
    this.phoneNumberVerified = phoneNumberVerified;
    return this;
  }

  /**
   * True if the End-User&#39;s phone number has been verified; otherwise false. When this Claim  Value is true, this means that the OP took affirmative steps to ensure that this phone  number was controlled by the End-User at the time the verification was performed. The means  by which a phone number is verified is context-specific, and dependent upon the trust framework  or contractual agreements within which the parties are operating. When true, the phone_number  Claim MUST be in E.164 format and any extensions MUST be represented in RFC 3966 format. 
   * @return phoneNumberVerified
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPhoneNumberVerified() {
    return phoneNumberVerified;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumberVerified(Boolean phoneNumberVerified) {
    this.phoneNumberVerified = phoneNumberVerified;
  }

  public GetUserInfo picture(String picture) {
    
    this.picture = picture;
    return this;
  }

  /**
   * URL of the End-User&#39;s profile picture. This URL MUST refer to an image file (for example, a PNG,  JPEG, or GIF image file), rather than to a Web page containing an image. Note that this URL SHOULD specifically reference a profile photo of the End-User suitable for displaying when describing the  End-User, rather than an arbitrary photo taken by the End-User. 
   * @return picture
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PICTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPicture() {
    return picture;
  }


  @JsonProperty(JSON_PROPERTY_PICTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPicture(String picture) {
    this.picture = picture;
  }

  public GetUserInfo preferredUsername(String preferredUsername) {
    
    this.preferredUsername = preferredUsername;
    return this;
  }

  /**
   * Non-unique shorthand name by which the End-User wishes to be referred to at the RP, such as  janedoe or j.doe. This value MAY be any valid JSON string including special characters  such as @, /, or whitespace. 
   * @return preferredUsername
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFERRED_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreferredUsername() {
    return preferredUsername;
  }


  @JsonProperty(JSON_PROPERTY_PREFERRED_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferredUsername(String preferredUsername) {
    this.preferredUsername = preferredUsername;
  }

  public GetUserInfo profile(String profile) {
    
    this.profile = profile;
    return this;
  }

  /**
   * URL of the End-User&#39;s profile page. The contents of this Web page SHOULD be about the End-User. 
   * @return profile
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfile() {
    return profile;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfile(String profile) {
    this.profile = profile;
  }

  public GetUserInfo sub(String sub) {
    
    this.sub = sub;
    return this;
  }

  /**
   * Subject - Identifier for the End-User at the IssuerURL. 
   * @return sub
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSub() {
    return sub;
  }


  @JsonProperty(JSON_PROPERTY_SUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSub(String sub) {
    this.sub = sub;
  }

  public GetUserInfo updatedAt(Integer updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time the End-User&#39;s information was last updated. Its value is a JSON number  representing the number of seconds from 1970-01-01T0:0:0Z as measured in UTC until the date/time. 
   * @return updatedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }

  public GetUserInfo website(String website) {
    
    this.website = website;
    return this;
  }

  /**
   * URL of the End-User&#39;s Web page or blog. This Web page SHOULD contain information  published by the End-User or an organization that the End-User is affiliated with. 
   * @return website
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsite() {
    return website;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsite(String website) {
    this.website = website;
  }

  public GetUserInfo zoneinfo(String zoneinfo) {
    
    this.zoneinfo = zoneinfo;
    return this;
  }

  /**
   * String from zoneinfo [zoneinfo] time zone database representing the End-User&#39;s  time zone. For example, Europe/Paris or America/Los_Angeles. 
   * @return zoneinfo
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZONEINFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZoneinfo() {
    return zoneinfo;
  }


  @JsonProperty(JSON_PROPERTY_ZONEINFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZoneinfo(String zoneinfo) {
    this.zoneinfo = zoneinfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserInfo getUserInfo = (GetUserInfo) o;
    return Objects.equals(this.birthdate, getUserInfo.birthdate) &&
        Objects.equals(this.email, getUserInfo.email) &&
        Objects.equals(this.emailVerified, getUserInfo.emailVerified) &&
        Objects.equals(this.familyName, getUserInfo.familyName) &&
        Objects.equals(this.gender, getUserInfo.gender) &&
        Objects.equals(this.givenName, getUserInfo.givenName) &&
        Objects.equals(this.locale, getUserInfo.locale) &&
        Objects.equals(this.middleName, getUserInfo.middleName) &&
        Objects.equals(this.name, getUserInfo.name) &&
        Objects.equals(this.nickname, getUserInfo.nickname) &&
        Objects.equals(this.phoneNumber, getUserInfo.phoneNumber) &&
        Objects.equals(this.phoneNumberVerified, getUserInfo.phoneNumberVerified) &&
        Objects.equals(this.picture, getUserInfo.picture) &&
        Objects.equals(this.preferredUsername, getUserInfo.preferredUsername) &&
        Objects.equals(this.profile, getUserInfo.profile) &&
        Objects.equals(this.sub, getUserInfo.sub) &&
        Objects.equals(this.updatedAt, getUserInfo.updatedAt) &&
        Objects.equals(this.website, getUserInfo.website) &&
        Objects.equals(this.zoneinfo, getUserInfo.zoneinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthdate, email, emailVerified, familyName, gender, givenName, locale, middleName, name, nickname, phoneNumber, phoneNumberVerified, picture, preferredUsername, profile, sub, updatedAt, website, zoneinfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserInfo {\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberVerified: ").append(toIndentedString(phoneNumberVerified)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    preferredUsername: ").append(toIndentedString(preferredUsername)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    zoneinfo: ").append(toIndentedString(zoneinfo)).append("\n");
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

    // add `birthdate` to the URL query string
    if (getBirthdate() != null) {
      try {
        joiner.add(String.format("%sbirthdate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBirthdate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email_verified` to the URL query string
    if (getEmailVerified() != null) {
      try {
        joiner.add(String.format("%semail_verified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailVerified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `family_name` to the URL query string
    if (getFamilyName() != null) {
      try {
        joiner.add(String.format("%sfamily_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFamilyName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `gender` to the URL query string
    if (getGender() != null) {
      try {
        joiner.add(String.format("%sgender%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGender()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `given_name` to the URL query string
    if (getGivenName() != null) {
      try {
        joiner.add(String.format("%sgiven_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGivenName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `locale` to the URL query string
    if (getLocale() != null) {
      try {
        joiner.add(String.format("%slocale%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocale()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `middle_name` to the URL query string
    if (getMiddleName() != null) {
      try {
        joiner.add(String.format("%smiddle_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMiddleName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `nickname` to the URL query string
    if (getNickname() != null) {
      try {
        joiner.add(String.format("%snickname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNickname()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `phone_number` to the URL query string
    if (getPhoneNumber() != null) {
      try {
        joiner.add(String.format("%sphone_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhoneNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `phone_number_verified` to the URL query string
    if (getPhoneNumberVerified() != null) {
      try {
        joiner.add(String.format("%sphone_number_verified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhoneNumberVerified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `picture` to the URL query string
    if (getPicture() != null) {
      try {
        joiner.add(String.format("%spicture%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPicture()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `preferred_username` to the URL query string
    if (getPreferredUsername() != null) {
      try {
        joiner.add(String.format("%spreferred_username%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPreferredUsername()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `profile` to the URL query string
    if (getProfile() != null) {
      try {
        joiner.add(String.format("%sprofile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfile()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sub` to the URL query string
    if (getSub() != null) {
      try {
        joiner.add(String.format("%ssub%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSub()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `updated_at` to the URL query string
    if (getUpdatedAt() != null) {
      try {
        joiner.add(String.format("%supdated_at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `website` to the URL query string
    if (getWebsite() != null) {
      try {
        joiner.add(String.format("%swebsite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebsite()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `zoneinfo` to the URL query string
    if (getZoneinfo() != null) {
      try {
        joiner.add(String.format("%szoneinfo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getZoneinfo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

