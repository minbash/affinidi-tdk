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
 * CreatePexQueryInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:17:17.244171119Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreatePexQueryInput {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VP_DEFINITION = "vpDefinition";
  @SerializedName(SERIALIZED_NAME_VP_DEFINITION)
  private String vpDefinition;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public CreatePexQueryInput() {
  }

  public CreatePexQueryInput name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the presentation definition to quickly identify the query.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreatePexQueryInput vpDefinition(String vpDefinition) {
    this.vpDefinition = vpDefinition;
    return this;
  }

  /**
   * The presentation definition describing the data requirement that must be satisfied by the user. The value is in a JSON stringify format.
   * @return vpDefinition
   */
  @javax.annotation.Nonnull
  public String getVpDefinition() {
    return vpDefinition;
  }

  public void setVpDefinition(String vpDefinition) {
    this.vpDefinition = vpDefinition;
  }


  public CreatePexQueryInput description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An optional description of what the query is used for.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePexQueryInput createPexQueryInput = (CreatePexQueryInput) o;
    return Objects.equals(this.name, createPexQueryInput.name) &&
        Objects.equals(this.vpDefinition, createPexQueryInput.vpDefinition) &&
        Objects.equals(this.description, createPexQueryInput.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, vpDefinition, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePexQueryInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vpDefinition: ").append(toIndentedString(vpDefinition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("vpDefinition");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("vpDefinition");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreatePexQueryInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatePexQueryInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePexQueryInput is not found in the empty JSON string", CreatePexQueryInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatePexQueryInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePexQueryInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePexQueryInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("vpDefinition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpDefinition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpDefinition").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePexQueryInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePexQueryInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePexQueryInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePexQueryInput.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePexQueryInput>() {
           @Override
           public void write(JsonWriter out, CreatePexQueryInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePexQueryInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreatePexQueryInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatePexQueryInput
   * @throws IOException if the JSON string is invalid with respect to CreatePexQueryInput
   */
  public static CreatePexQueryInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePexQueryInput.class);
  }

  /**
   * Convert an instance of CreatePexQueryInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

