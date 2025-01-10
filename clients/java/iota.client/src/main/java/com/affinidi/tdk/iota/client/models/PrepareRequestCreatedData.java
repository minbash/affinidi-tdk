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
 * PrepareRequestCreatedData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:17:17.244171119Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PrepareRequestCreatedData {
  public static final String SERIALIZED_NAME_JWT = "jwt";
  @SerializedName(SERIALIZED_NAME_JWT)
  private String jwt;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  public PrepareRequestCreatedData() {
  }

  public PrepareRequestCreatedData jwt(String jwt) {
    this.jwt = jwt;
    return this;
  }

  /**
   * Get jwt
   * @return jwt
   */
  @javax.annotation.Nonnull
  public String getJwt() {
    return jwt;
  }

  public void setJwt(String jwt) {
    this.jwt = jwt;
  }


  public PrepareRequestCreatedData correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * A unique, randomly generated identifier that correlates the request and response in the data-sharing request flow.
   * @return correlationId
   */
  @javax.annotation.Nonnull
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepareRequestCreatedData prepareRequestCreatedData = (PrepareRequestCreatedData) o;
    return Objects.equals(this.jwt, prepareRequestCreatedData.jwt) &&
        Objects.equals(this.correlationId, prepareRequestCreatedData.correlationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwt, correlationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepareRequestCreatedData {\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
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
    openapiFields.add("jwt");
    openapiFields.add("correlationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jwt");
    openapiRequiredFields.add("correlationId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PrepareRequestCreatedData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PrepareRequestCreatedData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrepareRequestCreatedData is not found in the empty JSON string", PrepareRequestCreatedData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PrepareRequestCreatedData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrepareRequestCreatedData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PrepareRequestCreatedData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("jwt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwt").toString()));
      }
      if (!jsonObj.get("correlationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrepareRequestCreatedData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrepareRequestCreatedData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrepareRequestCreatedData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrepareRequestCreatedData.class));

       return (TypeAdapter<T>) new TypeAdapter<PrepareRequestCreatedData>() {
           @Override
           public void write(JsonWriter out, PrepareRequestCreatedData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrepareRequestCreatedData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PrepareRequestCreatedData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PrepareRequestCreatedData
   * @throws IOException if the JSON string is invalid with respect to PrepareRequestCreatedData
   */
  public static PrepareRequestCreatedData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrepareRequestCreatedData.class);
  }

  /**
   * Convert an instance of PrepareRequestCreatedData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

