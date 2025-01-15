/*
 * Iam
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.iam.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.affinidi.tdk.iam.client.models.TokenAuthenticationMethodDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TokenDto
 */
@JsonPropertyOrder({
  TokenDto.JSON_PROPERTY_ID,
  TokenDto.JSON_PROPERTY_ARI,
  TokenDto.JSON_PROPERTY_OWNER_ARI,
  TokenDto.JSON_PROPERTY_NAME,
  TokenDto.JSON_PROPERTY_AUTHENTICATION_METHOD,
  TokenDto.JSON_PROPERTY_SCOPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TokenDto {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ARI = "ari";
  private String ari;

  public static final String JSON_PROPERTY_OWNER_ARI = "ownerAri";
  private String ownerAri;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AUTHENTICATION_METHOD = "authenticationMethod";
  private TokenAuthenticationMethodDto authenticationMethod;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private List<String> scopes = new ArrayList<>();

  public TokenDto() {
  }

  public TokenDto id(UUID id) {
    
    this.id = id;
    return this;
  }

  /**
   * Token Id
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }

  public TokenDto ari(String ari) {
    
    this.ari = ari;
    return this;
  }

  /**
   * Token ARI
   * @return ari
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ARI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAri() {
    return ari;
  }


  @JsonProperty(JSON_PROPERTY_ARI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAri(String ari) {
    this.ari = ari;
  }

  public TokenDto ownerAri(String ownerAri) {
    
    this.ownerAri = ownerAri;
    return this;
  }

  /**
   * The Token owner&#39;s ARI
   * @return ownerAri
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OWNER_ARI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOwnerAri() {
    return ownerAri;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ARI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwnerAri(String ownerAri) {
    this.ownerAri = ownerAri;
  }

  public TokenDto name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Owner defined Token display name
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

  public TokenDto authenticationMethod(TokenAuthenticationMethodDto authenticationMethod) {
    
    this.authenticationMethod = authenticationMethod;
    return this;
  }

  /**
   * Get authenticationMethod
   * @return authenticationMethod
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TokenAuthenticationMethodDto getAuthenticationMethod() {
    return authenticationMethod;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthenticationMethod(TokenAuthenticationMethodDto authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  public TokenDto scopes(List<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public TokenDto addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Scopes that will be assigned to the Token on authentication
   * @return scopes
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getScopes() {
    return scopes;
  }


  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenDto tokenDto = (TokenDto) o;
    return Objects.equals(this.id, tokenDto.id) &&
        Objects.equals(this.ari, tokenDto.ari) &&
        Objects.equals(this.ownerAri, tokenDto.ownerAri) &&
        Objects.equals(this.name, tokenDto.name) &&
        Objects.equals(this.authenticationMethod, tokenDto.authenticationMethod) &&
        Objects.equals(this.scopes, tokenDto.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ari, ownerAri, name, authenticationMethod, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ari: ").append(toIndentedString(ari)).append("\n");
    sb.append("    ownerAri: ").append(toIndentedString(ownerAri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ari` to the URL query string
    if (getAri() != null) {
      try {
        joiner.add(String.format("%sari%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAri()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ownerAri` to the URL query string
    if (getOwnerAri() != null) {
      try {
        joiner.add(String.format("%sownerAri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOwnerAri()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `authenticationMethod` to the URL query string
    if (getAuthenticationMethod() != null) {
      joiner.add(getAuthenticationMethod().toUrlQueryString(prefix + "authenticationMethod" + suffix));
    }

    // add `scopes` to the URL query string
    if (getScopes() != null) {
      for (int i = 0; i < getScopes().size(); i++) {
        try {
          joiner.add(String.format("%sscopes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getScopes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

