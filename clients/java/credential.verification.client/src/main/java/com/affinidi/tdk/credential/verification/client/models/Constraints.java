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
import com.affinidi.tdk.credential.verification.client.models.ConstraintsStatuses;
import com.affinidi.tdk.credential.verification.client.models.Field;
import com.affinidi.tdk.credential.verification.client.models.HolderSubject;
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

import com.affinidi.tdk.credential.verification.client.JSON;

/**
 * Constraints
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:16:14.786007424Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Constraints {
  /**
   * Gets or Sets limitDisclosure
   */
  @JsonAdapter(LimitDisclosureEnum.Adapter.class)
  public enum LimitDisclosureEnum {
    REQUIRED("required"),
    
    PREFERRED("preferred");

    private String value;

    LimitDisclosureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LimitDisclosureEnum fromValue(String value) {
      for (LimitDisclosureEnum b : LimitDisclosureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LimitDisclosureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LimitDisclosureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LimitDisclosureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LimitDisclosureEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LimitDisclosureEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LIMIT_DISCLOSURE = "limit_disclosure";
  @SerializedName(SERIALIZED_NAME_LIMIT_DISCLOSURE)
  private LimitDisclosureEnum limitDisclosure;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private ConstraintsStatuses statuses;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<Field> fields = new ArrayList<>();

  /**
   * Gets or Sets subjectIsIssuer
   */
  @JsonAdapter(SubjectIsIssuerEnum.Adapter.class)
  public enum SubjectIsIssuerEnum {
    REQUIRED("required"),
    
    PREFERRED("preferred");

    private String value;

    SubjectIsIssuerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubjectIsIssuerEnum fromValue(String value) {
      for (SubjectIsIssuerEnum b : SubjectIsIssuerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubjectIsIssuerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubjectIsIssuerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubjectIsIssuerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubjectIsIssuerEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SubjectIsIssuerEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SUBJECT_IS_ISSUER = "subject_is_issuer";
  @SerializedName(SERIALIZED_NAME_SUBJECT_IS_ISSUER)
  private SubjectIsIssuerEnum subjectIsIssuer;

  public static final String SERIALIZED_NAME_IS_HOLDER = "is_holder";
  @SerializedName(SERIALIZED_NAME_IS_HOLDER)
  private List<HolderSubject> isHolder = new ArrayList<>();

  public static final String SERIALIZED_NAME_SAME_SUBJECT = "same_subject";
  @SerializedName(SERIALIZED_NAME_SAME_SUBJECT)
  private List<HolderSubject> sameSubject = new ArrayList<>();

  public Constraints() {
  }

  public Constraints limitDisclosure(LimitDisclosureEnum limitDisclosure) {
    this.limitDisclosure = limitDisclosure;
    return this;
  }

  /**
   * Get limitDisclosure
   * @return limitDisclosure
   */
  @javax.annotation.Nullable
  public LimitDisclosureEnum getLimitDisclosure() {
    return limitDisclosure;
  }

  public void setLimitDisclosure(LimitDisclosureEnum limitDisclosure) {
    this.limitDisclosure = limitDisclosure;
  }


  public Constraints statuses(ConstraintsStatuses statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * Get statuses
   * @return statuses
   */
  @javax.annotation.Nullable
  public ConstraintsStatuses getStatuses() {
    return statuses;
  }

  public void setStatuses(ConstraintsStatuses statuses) {
    this.statuses = statuses;
  }


  public Constraints fields(List<Field> fields) {
    this.fields = fields;
    return this;
  }

  public Constraints addFieldsItem(Field fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
   */
  @javax.annotation.Nullable
  public List<Field> getFields() {
    return fields;
  }

  public void setFields(List<Field> fields) {
    this.fields = fields;
  }


  public Constraints subjectIsIssuer(SubjectIsIssuerEnum subjectIsIssuer) {
    this.subjectIsIssuer = subjectIsIssuer;
    return this;
  }

  /**
   * Get subjectIsIssuer
   * @return subjectIsIssuer
   */
  @javax.annotation.Nullable
  public SubjectIsIssuerEnum getSubjectIsIssuer() {
    return subjectIsIssuer;
  }

  public void setSubjectIsIssuer(SubjectIsIssuerEnum subjectIsIssuer) {
    this.subjectIsIssuer = subjectIsIssuer;
  }


  public Constraints isHolder(List<HolderSubject> isHolder) {
    this.isHolder = isHolder;
    return this;
  }

  public Constraints addIsHolderItem(HolderSubject isHolderItem) {
    if (this.isHolder == null) {
      this.isHolder = new ArrayList<>();
    }
    this.isHolder.add(isHolderItem);
    return this;
  }

  /**
   * Get isHolder
   * @return isHolder
   */
  @javax.annotation.Nullable
  public List<HolderSubject> getIsHolder() {
    return isHolder;
  }

  public void setIsHolder(List<HolderSubject> isHolder) {
    this.isHolder = isHolder;
  }


  public Constraints sameSubject(List<HolderSubject> sameSubject) {
    this.sameSubject = sameSubject;
    return this;
  }

  public Constraints addSameSubjectItem(HolderSubject sameSubjectItem) {
    if (this.sameSubject == null) {
      this.sameSubject = new ArrayList<>();
    }
    this.sameSubject.add(sameSubjectItem);
    return this;
  }

  /**
   * Get sameSubject
   * @return sameSubject
   */
  @javax.annotation.Nullable
  public List<HolderSubject> getSameSubject() {
    return sameSubject;
  }

  public void setSameSubject(List<HolderSubject> sameSubject) {
    this.sameSubject = sameSubject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Constraints constraints = (Constraints) o;
    return Objects.equals(this.limitDisclosure, constraints.limitDisclosure) &&
        Objects.equals(this.statuses, constraints.statuses) &&
        Objects.equals(this.fields, constraints.fields) &&
        Objects.equals(this.subjectIsIssuer, constraints.subjectIsIssuer) &&
        Objects.equals(this.isHolder, constraints.isHolder) &&
        Objects.equals(this.sameSubject, constraints.sameSubject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitDisclosure, statuses, fields, subjectIsIssuer, isHolder, sameSubject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Constraints {\n");
    sb.append("    limitDisclosure: ").append(toIndentedString(limitDisclosure)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    subjectIsIssuer: ").append(toIndentedString(subjectIsIssuer)).append("\n");
    sb.append("    isHolder: ").append(toIndentedString(isHolder)).append("\n");
    sb.append("    sameSubject: ").append(toIndentedString(sameSubject)).append("\n");
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
    openapiFields.add("limit_disclosure");
    openapiFields.add("statuses");
    openapiFields.add("fields");
    openapiFields.add("subject_is_issuer");
    openapiFields.add("is_holder");
    openapiFields.add("same_subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Constraints
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Constraints.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Constraints is not found in the empty JSON string", Constraints.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Constraints.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Constraints` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("limit_disclosure") != null && !jsonObj.get("limit_disclosure").isJsonNull()) && !jsonObj.get("limit_disclosure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit_disclosure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit_disclosure").toString()));
      }
      // validate the optional field `limit_disclosure`
      if (jsonObj.get("limit_disclosure") != null && !jsonObj.get("limit_disclosure").isJsonNull()) {
        LimitDisclosureEnum.validateJsonElement(jsonObj.get("limit_disclosure"));
      }
      // validate the optional field `statuses`
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) {
        ConstraintsStatuses.validateJsonElement(jsonObj.get("statuses"));
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            Field.validateJsonElement(jsonArrayfields.get(i));
          };
        }
      }
      if ((jsonObj.get("subject_is_issuer") != null && !jsonObj.get("subject_is_issuer").isJsonNull()) && !jsonObj.get("subject_is_issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_is_issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_is_issuer").toString()));
      }
      // validate the optional field `subject_is_issuer`
      if (jsonObj.get("subject_is_issuer") != null && !jsonObj.get("subject_is_issuer").isJsonNull()) {
        SubjectIsIssuerEnum.validateJsonElement(jsonObj.get("subject_is_issuer"));
      }
      if (jsonObj.get("is_holder") != null && !jsonObj.get("is_holder").isJsonNull()) {
        JsonArray jsonArrayisHolder = jsonObj.getAsJsonArray("is_holder");
        if (jsonArrayisHolder != null) {
          // ensure the json data is an array
          if (!jsonObj.get("is_holder").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `is_holder` to be an array in the JSON string but got `%s`", jsonObj.get("is_holder").toString()));
          }

          // validate the optional field `is_holder` (array)
          for (int i = 0; i < jsonArrayisHolder.size(); i++) {
            HolderSubject.validateJsonElement(jsonArrayisHolder.get(i));
          };
        }
      }
      if (jsonObj.get("same_subject") != null && !jsonObj.get("same_subject").isJsonNull()) {
        JsonArray jsonArraysameSubject = jsonObj.getAsJsonArray("same_subject");
        if (jsonArraysameSubject != null) {
          // ensure the json data is an array
          if (!jsonObj.get("same_subject").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `same_subject` to be an array in the JSON string but got `%s`", jsonObj.get("same_subject").toString()));
          }

          // validate the optional field `same_subject` (array)
          for (int i = 0; i < jsonArraysameSubject.size(); i++) {
            HolderSubject.validateJsonElement(jsonArraysameSubject.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Constraints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Constraints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Constraints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Constraints.class));

       return (TypeAdapter<T>) new TypeAdapter<Constraints>() {
           @Override
           public void write(JsonWriter out, Constraints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Constraints read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Constraints given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Constraints
   * @throws IOException if the JSON string is invalid with respect to Constraints
   */
  public static Constraints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Constraints.class);
  }

  /**
   * Convert an instance of Constraints to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

