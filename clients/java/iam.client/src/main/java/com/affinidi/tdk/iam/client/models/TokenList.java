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
import com.affinidi.tdk.iam.client.models.TokenDto;
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
 * TokenList
 */
@JsonPropertyOrder({
  TokenList.JSON_PROPERTY_TOKENS,
  TokenList.JSON_PROPERTY_LAST_EVALUATED_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-15T13:41:03.223863394Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TokenList {
  public static final String JSON_PROPERTY_TOKENS = "tokens";
  private List<TokenDto> tokens = new ArrayList<>();

  public static final String JSON_PROPERTY_LAST_EVALUATED_KEY = "lastEvaluatedKey";
  private String lastEvaluatedKey;

  public TokenList() {
  }

  public TokenList tokens(List<TokenDto> tokens) {
    
    this.tokens = tokens;
    return this;
  }

  public TokenList addTokensItem(TokenDto tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

  /**
   * Get tokens
   * @return tokens
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TokenDto> getTokens() {
    return tokens;
  }


  @JsonProperty(JSON_PROPERTY_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokens(List<TokenDto> tokens) {
    this.tokens = tokens;
  }

  public TokenList lastEvaluatedKey(String lastEvaluatedKey) {
    
    this.lastEvaluatedKey = lastEvaluatedKey;
    return this;
  }

  /**
   * Get lastEvaluatedKey
   * @return lastEvaluatedKey
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_EVALUATED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastEvaluatedKey() {
    return lastEvaluatedKey;
  }


  @JsonProperty(JSON_PROPERTY_LAST_EVALUATED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastEvaluatedKey(String lastEvaluatedKey) {
    this.lastEvaluatedKey = lastEvaluatedKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenList tokenList = (TokenList) o;
    return Objects.equals(this.tokens, tokenList.tokens) &&
        Objects.equals(this.lastEvaluatedKey, tokenList.lastEvaluatedKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokens, lastEvaluatedKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenList {\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    lastEvaluatedKey: ").append(toIndentedString(lastEvaluatedKey)).append("\n");
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

    // add `tokens` to the URL query string
    if (getTokens() != null) {
      for (int i = 0; i < getTokens().size(); i++) {
        if (getTokens().get(i) != null) {
          joiner.add(getTokens().get(i).toUrlQueryString(String.format("%stokens%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `lastEvaluatedKey` to the URL query string
    if (getLastEvaluatedKey() != null) {
      try {
        joiner.add(String.format("%slastEvaluatedKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastEvaluatedKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

