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
import com.affinidi.tdk.login.configuration.client.models.IdTokenMapping;
import com.affinidi.tdk.login.configuration.client.models.LoginConfigurationClientMetadataInput;
import com.affinidi.tdk.login.configuration.client.models.TokenEndpointAuthMethod;
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
 * UpdateLoginConfigurationInput
 */
@JsonPropertyOrder({
  UpdateLoginConfigurationInput.JSON_PROPERTY_NAME,
  UpdateLoginConfigurationInput.JSON_PROPERTY_REDIRECT_URIS,
  UpdateLoginConfigurationInput.JSON_PROPERTY_POST_LOGOUT_REDIRECT_URIS,
  UpdateLoginConfigurationInput.JSON_PROPERTY_CLIENT_SECRET,
  UpdateLoginConfigurationInput.JSON_PROPERTY_VP_DEFINITION,
  UpdateLoginConfigurationInput.JSON_PROPERTY_PRESENTATION_DEFINITION,
  UpdateLoginConfigurationInput.JSON_PROPERTY_ID_TOKEN_MAPPING,
  UpdateLoginConfigurationInput.JSON_PROPERTY_CLIENT_METADATA,
  UpdateLoginConfigurationInput.JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD,
  UpdateLoginConfigurationInput.JSON_PROPERTY_FAIL_ON_MAPPING_CONFLICT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class UpdateLoginConfigurationInput {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REDIRECT_URIS = "redirectUris";
  private List<String> redirectUris = new ArrayList<>();

  public static final String JSON_PROPERTY_POST_LOGOUT_REDIRECT_URIS = "postLogoutRedirectUris";
  private List<String> postLogoutRedirectUris = new ArrayList<>();

  public static final String JSON_PROPERTY_CLIENT_SECRET = "clientSecret";
  private String clientSecret;

  public static final String JSON_PROPERTY_VP_DEFINITION = "vpDefinition";
  private String vpDefinition;

  public static final String JSON_PROPERTY_PRESENTATION_DEFINITION = "presentationDefinition";
  private Object presentationDefinition;

  public static final String JSON_PROPERTY_ID_TOKEN_MAPPING = "idTokenMapping";
  private IdTokenMapping idTokenMapping = new ArrayList<>();

  public static final String JSON_PROPERTY_CLIENT_METADATA = "clientMetadata";
  private LoginConfigurationClientMetadataInput clientMetadata;

  public static final String JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD = "tokenEndpointAuthMethod";
  private TokenEndpointAuthMethod tokenEndpointAuthMethod;

  public static final String JSON_PROPERTY_FAIL_ON_MAPPING_CONFLICT = "failOnMappingConflict";
  private Boolean failOnMappingConflict;

  public UpdateLoginConfigurationInput() {
  }

  public UpdateLoginConfigurationInput name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * User defined login configuration name
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

  public UpdateLoginConfigurationInput redirectUris(List<String> redirectUris) {
    
    this.redirectUris = redirectUris;
    return this;
  }

  public UpdateLoginConfigurationInput addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * OAuth 2.0 Redirect URIs
   * @return redirectUris
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRedirectUris() {
    return redirectUris;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public UpdateLoginConfigurationInput postLogoutRedirectUris(List<String> postLogoutRedirectUris) {
    
    this.postLogoutRedirectUris = postLogoutRedirectUris;
    return this;
  }

  public UpdateLoginConfigurationInput addPostLogoutRedirectUrisItem(String postLogoutRedirectUrisItem) {
    if (this.postLogoutRedirectUris == null) {
      this.postLogoutRedirectUris = new ArrayList<>();
    }
    this.postLogoutRedirectUris.add(postLogoutRedirectUrisItem);
    return this;
  }

  /**
   * Post Logout Redirect URIs, Used to redirect the user&#39;s browser to a specified URL after the logout process is complete. Must match the domain, port, scheme of at least one of the registered redirect URIs
   * @return postLogoutRedirectUris
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_LOGOUT_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPostLogoutRedirectUris() {
    return postLogoutRedirectUris;
  }


  @JsonProperty(JSON_PROPERTY_POST_LOGOUT_REDIRECT_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostLogoutRedirectUris(List<String> postLogoutRedirectUris) {
    this.postLogoutRedirectUris = postLogoutRedirectUris;
  }

  public UpdateLoginConfigurationInput clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * OAuth2 client secret
   * @return clientSecret
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public UpdateLoginConfigurationInput vpDefinition(String vpDefinition) {
    
    this.vpDefinition = vpDefinition;
    return this;
  }

  /**
   * VP definition in JSON stringify format
   * @return vpDefinition
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VP_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVpDefinition() {
    return vpDefinition;
  }


  @JsonProperty(JSON_PROPERTY_VP_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpDefinition(String vpDefinition) {
    this.vpDefinition = vpDefinition;
  }

  public UpdateLoginConfigurationInput presentationDefinition(Object presentationDefinition) {
    
    this.presentationDefinition = presentationDefinition;
    return this;
  }

  /**
   * Presentation Definition
   * @return presentationDefinition
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESENTATION_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPresentationDefinition() {
    return presentationDefinition;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATION_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresentationDefinition(Object presentationDefinition) {
    this.presentationDefinition = presentationDefinition;
  }

  public UpdateLoginConfigurationInput idTokenMapping(IdTokenMapping idTokenMapping) {
    
    this.idTokenMapping = idTokenMapping;
    return this;
  }

  /**
   * Get idTokenMapping
   * @return idTokenMapping
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_TOKEN_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdTokenMapping getIdTokenMapping() {
    return idTokenMapping;
  }


  @JsonProperty(JSON_PROPERTY_ID_TOKEN_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdTokenMapping(IdTokenMapping idTokenMapping) {
    this.idTokenMapping = idTokenMapping;
  }

  public UpdateLoginConfigurationInput clientMetadata(LoginConfigurationClientMetadataInput clientMetadata) {
    
    this.clientMetadata = clientMetadata;
    return this;
  }

  /**
   * Get clientMetadata
   * @return clientMetadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LoginConfigurationClientMetadataInput getClientMetadata() {
    return clientMetadata;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientMetadata(LoginConfigurationClientMetadataInput clientMetadata) {
    this.clientMetadata = clientMetadata;
  }

  public UpdateLoginConfigurationInput tokenEndpointAuthMethod(TokenEndpointAuthMethod tokenEndpointAuthMethod) {
    
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

  /**
   * Get tokenEndpointAuthMethod
   * @return tokenEndpointAuthMethod
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenEndpointAuthMethod getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ENDPOINT_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenEndpointAuthMethod(TokenEndpointAuthMethod tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }

  public UpdateLoginConfigurationInput failOnMappingConflict(Boolean failOnMappingConflict) {
    
    this.failOnMappingConflict = failOnMappingConflict;
    return this;
  }

  /**
   * Interrupts login process if duplications of data fields names will be found
   * @return failOnMappingConflict
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAIL_ON_MAPPING_CONFLICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFailOnMappingConflict() {
    return failOnMappingConflict;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_ON_MAPPING_CONFLICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailOnMappingConflict(Boolean failOnMappingConflict) {
    this.failOnMappingConflict = failOnMappingConflict;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLoginConfigurationInput updateLoginConfigurationInput = (UpdateLoginConfigurationInput) o;
    return Objects.equals(this.name, updateLoginConfigurationInput.name) &&
        Objects.equals(this.redirectUris, updateLoginConfigurationInput.redirectUris) &&
        Objects.equals(this.postLogoutRedirectUris, updateLoginConfigurationInput.postLogoutRedirectUris) &&
        Objects.equals(this.clientSecret, updateLoginConfigurationInput.clientSecret) &&
        Objects.equals(this.vpDefinition, updateLoginConfigurationInput.vpDefinition) &&
        Objects.equals(this.presentationDefinition, updateLoginConfigurationInput.presentationDefinition) &&
        Objects.equals(this.idTokenMapping, updateLoginConfigurationInput.idTokenMapping) &&
        Objects.equals(this.clientMetadata, updateLoginConfigurationInput.clientMetadata) &&
        Objects.equals(this.tokenEndpointAuthMethod, updateLoginConfigurationInput.tokenEndpointAuthMethod) &&
        Objects.equals(this.failOnMappingConflict, updateLoginConfigurationInput.failOnMappingConflict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, redirectUris, postLogoutRedirectUris, clientSecret, vpDefinition, presentationDefinition, idTokenMapping, clientMetadata, tokenEndpointAuthMethod, failOnMappingConflict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLoginConfigurationInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    postLogoutRedirectUris: ").append(toIndentedString(postLogoutRedirectUris)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    vpDefinition: ").append(toIndentedString(vpDefinition)).append("\n");
    sb.append("    presentationDefinition: ").append(toIndentedString(presentationDefinition)).append("\n");
    sb.append("    idTokenMapping: ").append(toIndentedString(idTokenMapping)).append("\n");
    sb.append("    clientMetadata: ").append(toIndentedString(clientMetadata)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ").append(toIndentedString(tokenEndpointAuthMethod)).append("\n");
    sb.append("    failOnMappingConflict: ").append(toIndentedString(failOnMappingConflict)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirectUris` to the URL query string
    if (getRedirectUris() != null) {
      for (int i = 0; i < getRedirectUris().size(); i++) {
        try {
          joiner.add(String.format("%sredirectUris%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getRedirectUris().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `postLogoutRedirectUris` to the URL query string
    if (getPostLogoutRedirectUris() != null) {
      for (int i = 0; i < getPostLogoutRedirectUris().size(); i++) {
        try {
          joiner.add(String.format("%spostLogoutRedirectUris%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getPostLogoutRedirectUris().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `clientSecret` to the URL query string
    if (getClientSecret() != null) {
      try {
        joiner.add(String.format("%sclientSecret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientSecret()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `vpDefinition` to the URL query string
    if (getVpDefinition() != null) {
      try {
        joiner.add(String.format("%svpDefinition%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVpDefinition()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `presentationDefinition` to the URL query string
    if (getPresentationDefinition() != null) {
      try {
        joiner.add(String.format("%spresentationDefinition%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPresentationDefinition()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `idTokenMapping` to the URL query string
    if (getIdTokenMapping() != null) {
      try {
        joiner.add(String.format("%sidTokenMapping%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdTokenMapping()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `clientMetadata` to the URL query string
    if (getClientMetadata() != null) {
      joiner.add(getClientMetadata().toUrlQueryString(prefix + "clientMetadata" + suffix));
    }

    // add `tokenEndpointAuthMethod` to the URL query string
    if (getTokenEndpointAuthMethod() != null) {
      try {
        joiner.add(String.format("%stokenEndpointAuthMethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenEndpointAuthMethod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failOnMappingConflict` to the URL query string
    if (getFailOnMappingConflict() != null) {
      try {
        joiner.add(String.format("%sfailOnMappingConflict%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailOnMappingConflict()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

