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

import com.affinidi.tdk.credential.issuance.client.JSON;

/**
 * CorsGenerateCredentialsOK
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:15:12.132374761Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CorsGenerateCredentialsOK {
  public static final String SERIALIZED_NAME_CORS_GENERATE_CREDENTIALS_OK = "corsGenerateCredentialsOk";
  @SerializedName(SERIALIZED_NAME_CORS_GENERATE_CREDENTIALS_OK)
  private String corsGenerateCredentialsOk;

  public CorsGenerateCredentialsOK() {
  }

  public CorsGenerateCredentialsOK corsGenerateCredentialsOk(String corsGenerateCredentialsOk) {
    this.corsGenerateCredentialsOk = corsGenerateCredentialsOk;
    return this;
  }

  /**
   * Get corsGenerateCredentialsOk
   * @return corsGenerateCredentialsOk
   */
  @javax.annotation.Nullable
  public String getCorsGenerateCredentialsOk() {
    return corsGenerateCredentialsOk;
  }

  public void setCorsGenerateCredentialsOk(String corsGenerateCredentialsOk) {
    this.corsGenerateCredentialsOk = corsGenerateCredentialsOk;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorsGenerateCredentialsOK corsGenerateCredentialsOK = (CorsGenerateCredentialsOK) o;
    return Objects.equals(this.corsGenerateCredentialsOk, corsGenerateCredentialsOK.corsGenerateCredentialsOk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corsGenerateCredentialsOk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorsGenerateCredentialsOK {\n");
    sb.append("    corsGenerateCredentialsOk: ").append(toIndentedString(corsGenerateCredentialsOk)).append("\n");
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
    openapiFields.add("corsGenerateCredentialsOk");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CorsGenerateCredentialsOK
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CorsGenerateCredentialsOK.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CorsGenerateCredentialsOK is not found in the empty JSON string", CorsGenerateCredentialsOK.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CorsGenerateCredentialsOK.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CorsGenerateCredentialsOK` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("corsGenerateCredentialsOk") != null && !jsonObj.get("corsGenerateCredentialsOk").isJsonNull()) && !jsonObj.get("corsGenerateCredentialsOk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `corsGenerateCredentialsOk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("corsGenerateCredentialsOk").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CorsGenerateCredentialsOK.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CorsGenerateCredentialsOK' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CorsGenerateCredentialsOK> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CorsGenerateCredentialsOK.class));

       return (TypeAdapter<T>) new TypeAdapter<CorsGenerateCredentialsOK>() {
           @Override
           public void write(JsonWriter out, CorsGenerateCredentialsOK value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CorsGenerateCredentialsOK read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CorsGenerateCredentialsOK given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CorsGenerateCredentialsOK
   * @throws IOException if the JSON string is invalid with respect to CorsGenerateCredentialsOK
   */
  public static CorsGenerateCredentialsOK fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CorsGenerateCredentialsOK.class);
  }

  /**
   * Convert an instance of CorsGenerateCredentialsOK to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

