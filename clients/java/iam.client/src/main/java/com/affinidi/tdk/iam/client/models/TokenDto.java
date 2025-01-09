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
import com.affinidi.tdk.iam.client.models.TokenAuthenticationMethodDto;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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

import com.affinidi.tdk.iam.client.JSON;

/**
 * TokenDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:15:45.406501982Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TokenDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ARI = "ari";
  @SerializedName(SERIALIZED_NAME_ARI)
  private String ari;

  public static final String SERIALIZED_NAME_OWNER_ARI = "ownerAri";
  @SerializedName(SERIALIZED_NAME_OWNER_ARI)
  private String ownerAri;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AUTHENTICATION_METHOD = "authenticationMethod";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_METHOD)
  private TokenAuthenticationMethodDto authenticationMethod;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
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
  public UUID getId() {
    return id;
  }

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
  public String getAri() {
    return ari;
  }

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
  public String getOwnerAri() {
    return ownerAri;
  }

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
  public String getName() {
    return name;
  }

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
  public TokenAuthenticationMethodDto getAuthenticationMethod() {
    return authenticationMethod;
  }

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
  public List<String> getScopes() {
    return scopes;
  }

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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("ari");
    openapiFields.add("ownerAri");
    openapiFields.add("name");
    openapiFields.add("authenticationMethod");
    openapiFields.add("scopes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("ari");
    openapiRequiredFields.add("ownerAri");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("authenticationMethod");
    openapiRequiredFields.add("scopes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TokenDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenDto is not found in the empty JSON string", TokenDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("ari").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ari` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ari").toString()));
      }
      if (!jsonObj.get("ownerAri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerAri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerAri").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `authenticationMethod`
      TokenAuthenticationMethodDto.validateJsonElement(jsonObj.get("authenticationMethod"));
      // ensure the required json array is present
      if (jsonObj.get("scopes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("scopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be an array in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenDto.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenDto>() {
           @Override
           public void write(JsonWriter out, TokenDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TokenDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TokenDto
   * @throws IOException if the JSON string is invalid with respect to TokenDto
   */
  public static TokenDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenDto.class);
  }

  /**
   * Convert an instance of TokenDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

