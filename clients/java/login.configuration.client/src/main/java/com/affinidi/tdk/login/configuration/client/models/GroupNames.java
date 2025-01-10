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
 * GroupNames
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:14:35.669482265Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GroupNames {
  public static final String SERIALIZED_NAME_GROUP_NAMES = "groupNames";
  @SerializedName(SERIALIZED_NAME_GROUP_NAMES)
  private List<String> groupNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "pageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private Object pageToken;

  public GroupNames() {
  }

  public GroupNames groupNames(List<String> groupNames) {
    this.groupNames = groupNames;
    return this;
  }

  public GroupNames addGroupNamesItem(String groupNamesItem) {
    if (this.groupNames == null) {
      this.groupNames = new ArrayList<>();
    }
    this.groupNames.add(groupNamesItem);
    return this;
  }

  /**
   * Get groupNames
   * @return groupNames
   */
  @javax.annotation.Nonnull
  public List<String> getGroupNames() {
    return groupNames;
  }

  public void setGroupNames(List<String> groupNames) {
    this.groupNames = groupNames;
  }


  public GroupNames pageToken(Object pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Get pageToken
   * @return pageToken
   */
  @javax.annotation.Nullable
  public Object getPageToken() {
    return pageToken;
  }

  public void setPageToken(Object pageToken) {
    this.pageToken = pageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupNames groupNames = (GroupNames) o;
    return Objects.equals(this.groupNames, groupNames.groupNames) &&
        Objects.equals(this.pageToken, groupNames.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupNames, pageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupNames {\n");
    sb.append("    groupNames: ").append(toIndentedString(groupNames)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
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
    openapiFields.add("groupNames");
    openapiFields.add("pageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("groupNames");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GroupNames
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupNames.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupNames is not found in the empty JSON string", GroupNames.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GroupNames.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupNames` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GroupNames.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("groupNames") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("groupNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupNames` to be an array in the JSON string but got `%s`", jsonObj.get("groupNames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupNames.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupNames' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupNames> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupNames.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupNames>() {
           @Override
           public void write(JsonWriter out, GroupNames value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupNames read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GroupNames given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GroupNames
   * @throws IOException if the JSON string is invalid with respect to GroupNames
   */
  public static GroupNames fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupNames.class);
  }

  /**
   * Convert an instance of GroupNames to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

