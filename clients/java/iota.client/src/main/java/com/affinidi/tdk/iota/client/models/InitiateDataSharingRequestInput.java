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
import java.math.BigDecimal;
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
 * InitiateDataSharingRequestInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:17:17.244171119Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InitiateDataSharingRequestInput {
  public static final String SERIALIZED_NAME_QUERY_ID = "queryId";
  @SerializedName(SERIALIZED_NAME_QUERY_ID)
  private String queryId;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  public static final String SERIALIZED_NAME_TOKEN_MAX_AGE = "tokenMaxAge";
  @SerializedName(SERIALIZED_NAME_TOKEN_MAX_AGE)
  private BigDecimal tokenMaxAge;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirectUri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_CONFIGURATION_ID = "configurationId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_ID)
  private String configurationId;

  /**
   * Determines whether to handle the data-sharing request using the WebSocket or Redirect flow.
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    REDIRECT("redirect"),
    
    WEBSOCKET("websocket");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ModeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode;

  public InitiateDataSharingRequestInput() {
  }

  public InitiateDataSharingRequestInput queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * The ID of the query.
   * @return queryId
   */
  @javax.annotation.Nonnull
  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }


  public InitiateDataSharingRequestInput correlationId(String correlationId) {
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


  public InitiateDataSharingRequestInput tokenMaxAge(BigDecimal tokenMaxAge) {
    this.tokenMaxAge = tokenMaxAge;
    return this;
  }

  /**
   * This is the lifetime of the signed request token during the data-sharing flow.
   * @return tokenMaxAge
   */
  @javax.annotation.Nullable
  public BigDecimal getTokenMaxAge() {
    return tokenMaxAge;
  }

  public void setTokenMaxAge(BigDecimal tokenMaxAge) {
    this.tokenMaxAge = tokenMaxAge;
  }


  public InitiateDataSharingRequestInput nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * A randomly generated value that is added in the request and response to prevent replay attacks.
   * @return nonce
   */
  @javax.annotation.Nonnull
  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public InitiateDataSharingRequestInput redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * List of allowed URLs to redirect users, including the response from the request. This is required if the selected data-sharing mode is Redirect.
   * @return redirectUri
   */
  @javax.annotation.Nonnull
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  public InitiateDataSharingRequestInput configurationId(String configurationId) {
    this.configurationId = configurationId;
    return this;
  }

  /**
   * ID of the Affinidi Iota Framework configuration.
   * @return configurationId
   */
  @javax.annotation.Nonnull
  public String getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(String configurationId) {
    this.configurationId = configurationId;
  }


  public InitiateDataSharingRequestInput mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Determines whether to handle the data-sharing request using the WebSocket or Redirect flow.
   * @return mode
   */
  @javax.annotation.Nonnull
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateDataSharingRequestInput initiateDataSharingRequestInput = (InitiateDataSharingRequestInput) o;
    return Objects.equals(this.queryId, initiateDataSharingRequestInput.queryId) &&
        Objects.equals(this.correlationId, initiateDataSharingRequestInput.correlationId) &&
        Objects.equals(this.tokenMaxAge, initiateDataSharingRequestInput.tokenMaxAge) &&
        Objects.equals(this.nonce, initiateDataSharingRequestInput.nonce) &&
        Objects.equals(this.redirectUri, initiateDataSharingRequestInput.redirectUri) &&
        Objects.equals(this.configurationId, initiateDataSharingRequestInput.configurationId) &&
        Objects.equals(this.mode, initiateDataSharingRequestInput.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, correlationId, tokenMaxAge, nonce, redirectUri, configurationId, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDataSharingRequestInput {\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    tokenMaxAge: ").append(toIndentedString(tokenMaxAge)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
    openapiFields.add("queryId");
    openapiFields.add("correlationId");
    openapiFields.add("tokenMaxAge");
    openapiFields.add("nonce");
    openapiFields.add("redirectUri");
    openapiFields.add("configurationId");
    openapiFields.add("mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("queryId");
    openapiRequiredFields.add("correlationId");
    openapiRequiredFields.add("nonce");
    openapiRequiredFields.add("redirectUri");
    openapiRequiredFields.add("configurationId");
    openapiRequiredFields.add("mode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InitiateDataSharingRequestInput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InitiateDataSharingRequestInput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InitiateDataSharingRequestInput is not found in the empty JSON string", InitiateDataSharingRequestInput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InitiateDataSharingRequestInput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InitiateDataSharingRequestInput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InitiateDataSharingRequestInput.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("queryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queryId").toString()));
      }
      if (!jsonObj.get("correlationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlationId").toString()));
      }
      if (!jsonObj.get("nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonce").toString()));
      }
      if (!jsonObj.get("redirectUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirectUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirectUri").toString()));
      }
      if (!jsonObj.get("configurationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationId").toString()));
      }
      if (!jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      // validate the required field `mode`
      ModeEnum.validateJsonElement(jsonObj.get("mode"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InitiateDataSharingRequestInput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InitiateDataSharingRequestInput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InitiateDataSharingRequestInput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InitiateDataSharingRequestInput.class));

       return (TypeAdapter<T>) new TypeAdapter<InitiateDataSharingRequestInput>() {
           @Override
           public void write(JsonWriter out, InitiateDataSharingRequestInput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InitiateDataSharingRequestInput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InitiateDataSharingRequestInput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InitiateDataSharingRequestInput
   * @throws IOException if the JSON string is invalid with respect to InitiateDataSharingRequestInput
   */
  public static InitiateDataSharingRequestInput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InitiateDataSharingRequestInput.class);
  }

  /**
   * Convert an instance of InitiateDataSharingRequestInput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

