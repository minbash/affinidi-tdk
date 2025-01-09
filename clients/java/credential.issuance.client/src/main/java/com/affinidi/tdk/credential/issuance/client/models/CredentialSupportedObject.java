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
import com.affinidi.tdk.credential.issuance.client.models.SupportedCredentialMetadata;
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
 * CredentialSupportedObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:15:12.132374761Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CredentialSupportedObject {
  public static final String SERIALIZED_NAME_CREDENTIAL_TYPE_ID = "credentialTypeId";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_TYPE_ID)
  private String credentialTypeId;

  public static final String SERIALIZED_NAME_JSON_SCHEMA_URL = "jsonSchemaUrl";
  @SerializedName(SERIALIZED_NAME_JSON_SCHEMA_URL)
  private String jsonSchemaUrl;

  public static final String SERIALIZED_NAME_JSON_LD_CONTEXT_URL = "jsonLdContextUrl";
  @SerializedName(SERIALIZED_NAME_JSON_LD_CONTEXT_URL)
  private String jsonLdContextUrl;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private SupportedCredentialMetadata metadata;

  public CredentialSupportedObject() {
  }

  public CredentialSupportedObject credentialTypeId(String credentialTypeId) {
    this.credentialTypeId = credentialTypeId;
    return this;
  }

  /**
   * It is a String that identifies a Credential that is being requested to be issued.
   * @return credentialTypeId
   */
  @javax.annotation.Nonnull
  public String getCredentialTypeId() {
    return credentialTypeId;
  }

  public void setCredentialTypeId(String credentialTypeId) {
    this.credentialTypeId = credentialTypeId;
  }


  public CredentialSupportedObject jsonSchemaUrl(String jsonSchemaUrl) {
    this.jsonSchemaUrl = jsonSchemaUrl;
    return this;
  }

  /**
   * credential jsonLdContextUrl
   * @return jsonSchemaUrl
   */
  @javax.annotation.Nonnull
  public String getJsonSchemaUrl() {
    return jsonSchemaUrl;
  }

  public void setJsonSchemaUrl(String jsonSchemaUrl) {
    this.jsonSchemaUrl = jsonSchemaUrl;
  }


  public CredentialSupportedObject jsonLdContextUrl(String jsonLdContextUrl) {
    this.jsonLdContextUrl = jsonLdContextUrl;
    return this;
  }

  /**
   * credential jsonSchemaUrl
   * @return jsonLdContextUrl
   */
  @javax.annotation.Nonnull
  public String getJsonLdContextUrl() {
    return jsonLdContextUrl;
  }

  public void setJsonLdContextUrl(String jsonLdContextUrl) {
    this.jsonLdContextUrl = jsonLdContextUrl;
  }


  public CredentialSupportedObject metadata(SupportedCredentialMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public SupportedCredentialMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(SupportedCredentialMetadata metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialSupportedObject credentialSupportedObject = (CredentialSupportedObject) o;
    return Objects.equals(this.credentialTypeId, credentialSupportedObject.credentialTypeId) &&
        Objects.equals(this.jsonSchemaUrl, credentialSupportedObject.jsonSchemaUrl) &&
        Objects.equals(this.jsonLdContextUrl, credentialSupportedObject.jsonLdContextUrl) &&
        Objects.equals(this.metadata, credentialSupportedObject.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialTypeId, jsonSchemaUrl, jsonLdContextUrl, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialSupportedObject {\n");
    sb.append("    credentialTypeId: ").append(toIndentedString(credentialTypeId)).append("\n");
    sb.append("    jsonSchemaUrl: ").append(toIndentedString(jsonSchemaUrl)).append("\n");
    sb.append("    jsonLdContextUrl: ").append(toIndentedString(jsonLdContextUrl)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("credentialTypeId");
    openapiFields.add("jsonSchemaUrl");
    openapiFields.add("jsonLdContextUrl");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("credentialTypeId");
    openapiRequiredFields.add("jsonSchemaUrl");
    openapiRequiredFields.add("jsonLdContextUrl");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CredentialSupportedObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CredentialSupportedObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CredentialSupportedObject is not found in the empty JSON string", CredentialSupportedObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CredentialSupportedObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CredentialSupportedObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CredentialSupportedObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("credentialTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credentialTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credentialTypeId").toString()));
      }
      if (!jsonObj.get("jsonSchemaUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jsonSchemaUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jsonSchemaUrl").toString()));
      }
      if (!jsonObj.get("jsonLdContextUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jsonLdContextUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jsonLdContextUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CredentialSupportedObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CredentialSupportedObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CredentialSupportedObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CredentialSupportedObject.class));

       return (TypeAdapter<T>) new TypeAdapter<CredentialSupportedObject>() {
           @Override
           public void write(JsonWriter out, CredentialSupportedObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CredentialSupportedObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CredentialSupportedObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CredentialSupportedObject
   * @throws IOException if the JSON string is invalid with respect to CredentialSupportedObject
   */
  public static CredentialSupportedObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CredentialSupportedObject.class);
  }

  /**
   * Convert an instance of CredentialSupportedObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

