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
 * TypedPrincipalId
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:15:45.406501982Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TypedPrincipalId {
  public static final String SERIALIZED_NAME_PRINCIPAL_ID = "principalId";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_ID)
  private String principalId;

  public TypedPrincipalId() {
  }

  public TypedPrincipalId principalId(String principalId) {
    this.principalId = principalId;
    return this;
  }

  /**
   * Get principalId
   * @return principalId
   */
  @javax.annotation.Nonnull
  public String getPrincipalId() {
    return principalId;
  }

  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypedPrincipalId typedPrincipalId = (TypedPrincipalId) o;
    return Objects.equals(this.principalId, typedPrincipalId.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypedPrincipalId {\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
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
    openapiFields.add("principalId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("principalId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TypedPrincipalId
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TypedPrincipalId.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TypedPrincipalId is not found in the empty JSON string", TypedPrincipalId.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TypedPrincipalId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TypedPrincipalId` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TypedPrincipalId.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("principalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `principalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("principalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TypedPrincipalId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TypedPrincipalId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TypedPrincipalId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TypedPrincipalId.class));

       return (TypeAdapter<T>) new TypeAdapter<TypedPrincipalId>() {
           @Override
           public void write(JsonWriter out, TypedPrincipalId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TypedPrincipalId read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TypedPrincipalId given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TypedPrincipalId
   * @throws IOException if the JSON string is invalid with respect to TypedPrincipalId
   */
  public static TypedPrincipalId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TypedPrincipalId.class);
  }

  /**
   * Convert an instance of TypedPrincipalId to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

