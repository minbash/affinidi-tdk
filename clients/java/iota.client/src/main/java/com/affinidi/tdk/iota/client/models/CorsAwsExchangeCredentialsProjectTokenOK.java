/*
 * IotaService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.iota.client.models;

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

import com.affinidi.tdk.iota.client.JSON;

/**
 * CorsAwsExchangeCredentialsProjectTokenOK
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:17:17.244171119Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CorsAwsExchangeCredentialsProjectTokenOK {
  public static final String SERIALIZED_NAME_CORS_AWS_EXCHANGE_CREDENTIALS_PROJECT_TOKEN_OK = "corsAwsExchangeCredentialsProjectTokenOk";
  @SerializedName(SERIALIZED_NAME_CORS_AWS_EXCHANGE_CREDENTIALS_PROJECT_TOKEN_OK)
  private String corsAwsExchangeCredentialsProjectTokenOk;

  public CorsAwsExchangeCredentialsProjectTokenOK() {
  }

  public CorsAwsExchangeCredentialsProjectTokenOK corsAwsExchangeCredentialsProjectTokenOk(String corsAwsExchangeCredentialsProjectTokenOk) {
    this.corsAwsExchangeCredentialsProjectTokenOk = corsAwsExchangeCredentialsProjectTokenOk;
    return this;
  }

  /**
   * Get corsAwsExchangeCredentialsProjectTokenOk
   * @return corsAwsExchangeCredentialsProjectTokenOk
   */
  @javax.annotation.Nullable
  public String getCorsAwsExchangeCredentialsProjectTokenOk() {
    return corsAwsExchangeCredentialsProjectTokenOk;
  }

  public void setCorsAwsExchangeCredentialsProjectTokenOk(String corsAwsExchangeCredentialsProjectTokenOk) {
    this.corsAwsExchangeCredentialsProjectTokenOk = corsAwsExchangeCredentialsProjectTokenOk;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorsAwsExchangeCredentialsProjectTokenOK corsAwsExchangeCredentialsProjectTokenOK = (CorsAwsExchangeCredentialsProjectTokenOK) o;
    return Objects.equals(this.corsAwsExchangeCredentialsProjectTokenOk, corsAwsExchangeCredentialsProjectTokenOK.corsAwsExchangeCredentialsProjectTokenOk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corsAwsExchangeCredentialsProjectTokenOk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorsAwsExchangeCredentialsProjectTokenOK {\n");
    sb.append("    corsAwsExchangeCredentialsProjectTokenOk: ").append(toIndentedString(corsAwsExchangeCredentialsProjectTokenOk)).append("\n");
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
    openapiFields.add("corsAwsExchangeCredentialsProjectTokenOk");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CorsAwsExchangeCredentialsProjectTokenOK
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CorsAwsExchangeCredentialsProjectTokenOK.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CorsAwsExchangeCredentialsProjectTokenOK is not found in the empty JSON string", CorsAwsExchangeCredentialsProjectTokenOK.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CorsAwsExchangeCredentialsProjectTokenOK.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CorsAwsExchangeCredentialsProjectTokenOK` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("corsAwsExchangeCredentialsProjectTokenOk") != null && !jsonObj.get("corsAwsExchangeCredentialsProjectTokenOk").isJsonNull()) && !jsonObj.get("corsAwsExchangeCredentialsProjectTokenOk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `corsAwsExchangeCredentialsProjectTokenOk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("corsAwsExchangeCredentialsProjectTokenOk").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CorsAwsExchangeCredentialsProjectTokenOK.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CorsAwsExchangeCredentialsProjectTokenOK' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CorsAwsExchangeCredentialsProjectTokenOK> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CorsAwsExchangeCredentialsProjectTokenOK.class));

       return (TypeAdapter<T>) new TypeAdapter<CorsAwsExchangeCredentialsProjectTokenOK>() {
           @Override
           public void write(JsonWriter out, CorsAwsExchangeCredentialsProjectTokenOK value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CorsAwsExchangeCredentialsProjectTokenOK read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CorsAwsExchangeCredentialsProjectTokenOK given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CorsAwsExchangeCredentialsProjectTokenOK
   * @throws IOException if the JSON string is invalid with respect to CorsAwsExchangeCredentialsProjectTokenOK
   */
  public static CorsAwsExchangeCredentialsProjectTokenOK fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CorsAwsExchangeCredentialsProjectTokenOK.class);
  }

  /**
   * Convert an instance of CorsAwsExchangeCredentialsProjectTokenOK to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

