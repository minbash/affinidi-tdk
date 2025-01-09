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
import com.affinidi.tdk.login.configuration.client.models.IdTokenMapping;
import com.affinidi.tdk.login.configuration.client.models.LoginConfigurationClientMetadataInput;
import com.affinidi.tdk.login.configuration.client.models.TokenEndpointAuthMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.affinidi.tdk.login.configuration.client.JSON;

/**
 * UpdateLoginConfigurationInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:14:35.669482265Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateLoginConfigurationInput {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REDIRECT_URIS = "redirectUris";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URIS)
  private List<String> redirectUris = new ArrayList<>();

  public static final String SERIALIZED_NAME_POST_LOGOUT_REDIRECT_URIS = "postLogoutRedirectUris";
  @SerializedName(SERIALIZED_NAME_POST_LOGOUT_REDIRECT_URIS)
  private List<String> postLogoutRedirectUris = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "clientSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_VP_DEFINITION = "vpDefinition";
  @SerializedName(SERIALIZED_NAME_VP_DEFINITION)
  private String vpDefinition;

  public static final String SERIALIZED_NAME_PRESENTATION_DEFINITION = "presentationDefinition";
  @SerializedName(SERIALIZED_NAME_PRESENTATION_DEFINITION)
  private Object presentationDefinition;

  public static final String SERIALIZED_NAME_ID_TOKEN_MAPPING = "idTokenMapping";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN_MAPPING)
  private IdTokenMapping idTokenMapping = new ArrayList<>();

  public static final String SERIALIZED_NAME_CLIENT_METADATA = "clientMetadata";
  @SerializedName(SERIALIZED_NAME_CLIENT_METADATA)
  private LoginConfigurationClientMetadataInput clientMetadata;

  public static final String SERIALIZED_NAME_TOKEN_ENDPOINT_AUTH_METHOD = "tokenEndpointAuthMethod";
  @SerializedName(SERIALIZED_NAME_TOKEN_ENDPOINT_AUTH_METHOD)
  private TokenEndpointAuthMethod tokenEndpointAuthMethod;

  public static final String SERIALIZED_NAME_FAIL_ON_MAPPING_CONFLICT = "failOnMappingConflict";
  @SerializedName(SERIALIZED_NAME_FAIL_ON_MAPPING_CONFLICT)
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
  public String getName() {
    return name;
  }

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
  public List<String> getRedirectUris() {
    return redirectUris;
  }

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
  public List<String> getPostLogoutRedirectUris() {
    return postLogoutRedirectUris;
  }

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
  public String getClientSecret() {
    return clientSecret;
  }

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
  public String getVpDefinition() {
    return vpDefinition;
  }

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
  public Object getPresentationDefinition() {
    return presentationDefinition;
  }

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
  public IdTokenMapping getIdTokenMapping() {
    return idTokenMapping;
  }

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
  public LoginConfigurationClientMetadataInput getClientMetadata() {
    return clientMetadata;
  }

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
  public TokenEndpointAuthMethod getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }

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
  public Boolean getFailOnMappingConflict() {
    return failOnMappingConflict;
  }

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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("redirectUris");
    openapiFields.add("postLogoutRedirectUris");
    openapiFields.add("clientSecret");
    openapiFields.add("vpDefinition");
    openapiFields.add("presentationDefinition");
    openapiFields.add("idTokenMapping");
    openapiFields.add("clientMetadata");
    openapiFields.add("tokenEndpointAuthMethod");
    openapiFields.add("failOnMappingConflict");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateLoginConfigurationInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateLoginConfigurationInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateLoginConfigurationInput is not found in the empty JSON string", UpdateLoginConfigurationInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateLoginConfigurationInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateLoginConfigurationInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("redirectUris") != null && !jsonObj.get("redirectUris").isJsonNull() && !jsonObj.get("redirectUris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectUris` to be an array in the JSON string but got `%s`", jsonObj.get("redirectUris").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("postLogoutRedirectUris") != null && !jsonObj.get("postLogoutRedirectUris").isJsonNull() && !jsonObj.get("postLogoutRedirectUris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `postLogoutRedirectUris` to be an array in the JSON string but got `%s`", jsonObj.get("postLogoutRedirectUris").toString()));
      }
      if ((jsonObj.get("clientSecret") != null && !jsonObj.get("clientSecret").isJsonNull()) && !jsonObj.get("clientSecret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientSecret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientSecret").toString()));
      }
      if ((jsonObj.get("vpDefinition") != null && !jsonObj.get("vpDefinition").isJsonNull()) && !jsonObj.get("vpDefinition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpDefinition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpDefinition").toString()));
      }
      // validate the optional field `clientMetadata`
      if (jsonObj.get("clientMetadata") != null && !jsonObj.get("clientMetadata").isJsonNull()) {
        LoginConfigurationClientMetadataInput.validateJsonElement(jsonObj.get("clientMetadata"));
      }
      // validate the optional field `tokenEndpointAuthMethod`
      if (jsonObj.get("tokenEndpointAuthMethod") != null && !jsonObj.get("tokenEndpointAuthMethod").isJsonNull()) {
        TokenEndpointAuthMethod.validateJsonElement(jsonObj.get("tokenEndpointAuthMethod"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateLoginConfigurationInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateLoginConfigurationInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateLoginConfigurationInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateLoginConfigurationInput.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateLoginConfigurationInput>() {
           @Override
           public void write(JsonWriter out, UpdateLoginConfigurationInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateLoginConfigurationInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateLoginConfigurationInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateLoginConfigurationInput
   * @throws IOException if the JSON string is invalid with respect to UpdateLoginConfigurationInput
   */
  public static UpdateLoginConfigurationInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateLoginConfigurationInput.class);
  }

  /**
   * Convert an instance of UpdateLoginConfigurationInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

