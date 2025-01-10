/*
 * VerificationService
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.credential.verification.client.models;

import java.util.Objects;
import com.affinidi.tdk.credential.verification.client.models.NotFoundErrorDetailsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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

import com.affinidi.tdk.credential.verification.client.JSON;

/**
 * InvalidParameterError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:16:14.786007424Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InvalidParameterError {
  /**
   * Gets or Sets name
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    INVALID_PARAMETER_ERROR("InvalidParameterError");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      NameEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  /**
   * Gets or Sets message
   */
  @JsonAdapter(MessageEnum.Adapter.class)
  public enum MessageEnum {
    INVALID_PARAMETER_PARAM_("Invalid parameter: ${param}.");

    private String value;

    MessageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageEnum fromValue(String value) {
      for (MessageEnum b : MessageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MessageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MessageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MessageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MessageEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MessageEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private MessageEnum message;

  /**
   * Gets or Sets httpStatusCode
   */
  @JsonAdapter(HttpStatusCodeEnum.Adapter.class)
  public enum HttpStatusCodeEnum {
    NUMBER_400(new BigDecimal("400"));

    private BigDecimal value;

    HttpStatusCodeEnum(BigDecimal value) {
      this.value = value;
    }

    public BigDecimal getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HttpStatusCodeEnum fromValue(BigDecimal value) {
      for (HttpStatusCodeEnum b : HttpStatusCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HttpStatusCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HttpStatusCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HttpStatusCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HttpStatusCodeEnum.fromValue(new BigDecimal(value));
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      HttpStatusCodeEnum.fromValue(new BigDecimal(value));
    }
  }

  public static final String SERIALIZED_NAME_HTTP_STATUS_CODE = "httpStatusCode";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS_CODE)
  private HttpStatusCodeEnum httpStatusCode;

  public static final String SERIALIZED_NAME_TRACE_ID = "traceId";
  @SerializedName(SERIALIZED_NAME_TRACE_ID)
  private String traceId;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<NotFoundErrorDetailsInner> details = new ArrayList<>();

  public InvalidParameterError() {
  }

  public InvalidParameterError name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }


  public InvalidParameterError message(MessageEnum message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @javax.annotation.Nonnull
  public MessageEnum getMessage() {
    return message;
  }

  public void setMessage(MessageEnum message) {
    this.message = message;
  }


  public InvalidParameterError httpStatusCode(HttpStatusCodeEnum httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

  /**
   * Get httpStatusCode
   * @return httpStatusCode
   */
  @javax.annotation.Nonnull
  public HttpStatusCodeEnum getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(HttpStatusCodeEnum httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }


  public InvalidParameterError traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Get traceId
   * @return traceId
   */
  @javax.annotation.Nonnull
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }


  public InvalidParameterError details(List<NotFoundErrorDetailsInner> details) {
    this.details = details;
    return this;
  }

  public InvalidParameterError addDetailsItem(NotFoundErrorDetailsInner detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @javax.annotation.Nullable
  public List<NotFoundErrorDetailsInner> getDetails() {
    return details;
  }

  public void setDetails(List<NotFoundErrorDetailsInner> details) {
    this.details = details;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidParameterError invalidParameterError = (InvalidParameterError) o;
    return Objects.equals(this.name, invalidParameterError.name) &&
        Objects.equals(this.message, invalidParameterError.message) &&
        Objects.equals(this.httpStatusCode, invalidParameterError.httpStatusCode) &&
        Objects.equals(this.traceId, invalidParameterError.traceId) &&
        Objects.equals(this.details, invalidParameterError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, message, httpStatusCode, traceId, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidParameterError {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("httpStatusCode");
    openapiFields.add("traceId");
    openapiFields.add("details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("httpStatusCode");
    openapiRequiredFields.add("traceId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvalidParameterError
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvalidParameterError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvalidParameterError is not found in the empty JSON string", InvalidParameterError.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvalidParameterError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvalidParameterError` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvalidParameterError.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `name`
      NameEnum.validateJsonElement(jsonObj.get("name"));
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the required field `message`
      MessageEnum.validateJsonElement(jsonObj.get("message"));
      // validate the required field `httpStatusCode`
      HttpStatusCodeEnum.validateJsonElement(jsonObj.get("httpStatusCode"));
      if (!jsonObj.get("traceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceId").toString()));
      }
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
        if (jsonArraydetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
          }

          // validate the optional field `details` (array)
          for (int i = 0; i < jsonArraydetails.size(); i++) {
            NotFoundErrorDetailsInner.validateJsonElement(jsonArraydetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvalidParameterError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvalidParameterError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvalidParameterError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvalidParameterError.class));

       return (TypeAdapter<T>) new TypeAdapter<InvalidParameterError>() {
           @Override
           public void write(JsonWriter out, InvalidParameterError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvalidParameterError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvalidParameterError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvalidParameterError
   * @throws IOException if the JSON string is invalid with respect to InvalidParameterError
   */
  public static InvalidParameterError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvalidParameterError.class);
  }

  /**
   * Convert an instance of InvalidParameterError to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

