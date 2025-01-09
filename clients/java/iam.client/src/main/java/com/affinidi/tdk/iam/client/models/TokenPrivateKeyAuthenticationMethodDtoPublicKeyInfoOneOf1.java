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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:15:45.406501982Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 {
  public static final String SERIALIZED_NAME_JWKS_URI = "jwksUri";
  @SerializedName(SERIALIZED_NAME_JWKS_URI)
  private String jwksUri;

  public TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1() {
  }

  public TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * Get jwksUri
   * @return jwksUri
   */
  @javax.annotation.Nonnull
  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 tokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 = (TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1) o;
    return Objects.equals(this.jwksUri, tokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1.jwksUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwksUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 {\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
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
    openapiFields.add("jwksUri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jwksUri");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 is not found in the empty JSON string", TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("jwksUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwksUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwksUri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1>() {
           @Override
           public void write(JsonWriter out, TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1
   * @throws IOException if the JSON string is invalid with respect to TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1
   */
  public static TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1.class);
  }

  /**
   * Convert an instance of TokenPrivateKeyAuthenticationMethodDtoPublicKeyInfoOneOf1 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

