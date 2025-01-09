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
 * JsonWebKeyDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:15:45.406501982Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class JsonWebKeyDto {
  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_KTY = "kty";
  @SerializedName(SERIALIZED_NAME_KTY)
  private String kty;

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  private String n;

  public static final String SERIALIZED_NAME_E = "e";
  @SerializedName(SERIALIZED_NAME_E)
  private String e;

  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private String x;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private String y;

  public static final String SERIALIZED_NAME_CRV = "crv";
  @SerializedName(SERIALIZED_NAME_CRV)
  private String crv;

  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_USE = "use";
  @SerializedName(SERIALIZED_NAME_USE)
  private String use;

  public JsonWebKeyDto() {
  }

  public JsonWebKeyDto kid(String kid) {
    this.kid = kid;
    return this;
  }

  /**
   * Get kid
   * @return kid
   */
  @javax.annotation.Nonnull
  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }


  public JsonWebKeyDto kty(String kty) {
    this.kty = kty;
    return this;
  }

  /**
   * Get kty
   * @return kty
   */
  @javax.annotation.Nonnull
  public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }


  public JsonWebKeyDto n(String n) {
    this.n = n;
    return this;
  }

  /**
   * Get n
   * @return n
   */
  @javax.annotation.Nullable
  public String getN() {
    return n;
  }

  public void setN(String n) {
    this.n = n;
  }


  public JsonWebKeyDto e(String e) {
    this.e = e;
    return this;
  }

  /**
   * Get e
   * @return e
   */
  @javax.annotation.Nullable
  public String getE() {
    return e;
  }

  public void setE(String e) {
    this.e = e;
  }


  public JsonWebKeyDto x(String x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
   */
  @javax.annotation.Nullable
  public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }


  public JsonWebKeyDto y(String y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
   */
  @javax.annotation.Nullable
  public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }


  public JsonWebKeyDto crv(String crv) {
    this.crv = crv;
    return this;
  }

  /**
   * Get crv
   * @return crv
   */
  @javax.annotation.Nullable
  public String getCrv() {
    return crv;
  }

  public void setCrv(String crv) {
    this.crv = crv;
  }


  public JsonWebKeyDto alg(String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * Get alg
   * @return alg
   */
  @javax.annotation.Nonnull
  public String getAlg() {
    return alg;
  }

  public void setAlg(String alg) {
    this.alg = alg;
  }


  public JsonWebKeyDto use(String use) {
    this.use = use;
    return this;
  }

  /**
   * Get use
   * @return use
   */
  @javax.annotation.Nonnull
  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonWebKeyDto jsonWebKeyDto = (JsonWebKeyDto) o;
    return Objects.equals(this.kid, jsonWebKeyDto.kid) &&
        Objects.equals(this.kty, jsonWebKeyDto.kty) &&
        Objects.equals(this.n, jsonWebKeyDto.n) &&
        Objects.equals(this.e, jsonWebKeyDto.e) &&
        Objects.equals(this.x, jsonWebKeyDto.x) &&
        Objects.equals(this.y, jsonWebKeyDto.y) &&
        Objects.equals(this.crv, jsonWebKeyDto.crv) &&
        Objects.equals(this.alg, jsonWebKeyDto.alg) &&
        Objects.equals(this.use, jsonWebKeyDto.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kid, kty, n, e, x, y, crv, alg, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonWebKeyDto {\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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
    openapiFields.add("kid");
    openapiFields.add("kty");
    openapiFields.add("n");
    openapiFields.add("e");
    openapiFields.add("x");
    openapiFields.add("y");
    openapiFields.add("crv");
    openapiFields.add("alg");
    openapiFields.add("use");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("kid");
    openapiRequiredFields.add("kty");
    openapiRequiredFields.add("alg");
    openapiRequiredFields.add("use");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JsonWebKeyDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JsonWebKeyDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JsonWebKeyDto is not found in the empty JSON string", JsonWebKeyDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JsonWebKeyDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JsonWebKeyDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JsonWebKeyDto.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("kid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kid").toString()));
      }
      if (!jsonObj.get("kty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kty").toString()));
      }
      if ((jsonObj.get("n") != null && !jsonObj.get("n").isJsonNull()) && !jsonObj.get("n").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `n` to be a primitive type in the JSON string but got `%s`", jsonObj.get("n").toString()));
      }
      if ((jsonObj.get("e") != null && !jsonObj.get("e").isJsonNull()) && !jsonObj.get("e").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `e` to be a primitive type in the JSON string but got `%s`", jsonObj.get("e").toString()));
      }
      if ((jsonObj.get("x") != null && !jsonObj.get("x").isJsonNull()) && !jsonObj.get("x").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `x` to be a primitive type in the JSON string but got `%s`", jsonObj.get("x").toString()));
      }
      if ((jsonObj.get("y") != null && !jsonObj.get("y").isJsonNull()) && !jsonObj.get("y").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `y` to be a primitive type in the JSON string but got `%s`", jsonObj.get("y").toString()));
      }
      if ((jsonObj.get("crv") != null && !jsonObj.get("crv").isJsonNull()) && !jsonObj.get("crv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crv").toString()));
      }
      if (!jsonObj.get("alg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alg").toString()));
      }
      if (!jsonObj.get("use").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `use` to be a primitive type in the JSON string but got `%s`", jsonObj.get("use").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JsonWebKeyDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JsonWebKeyDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JsonWebKeyDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JsonWebKeyDto.class));

       return (TypeAdapter<T>) new TypeAdapter<JsonWebKeyDto>() {
           @Override
           public void write(JsonWriter out, JsonWebKeyDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JsonWebKeyDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JsonWebKeyDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JsonWebKeyDto
   * @throws IOException if the JSON string is invalid with respect to JsonWebKeyDto
   */
  public static JsonWebKeyDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JsonWebKeyDto.class);
  }

  /**
   * Convert an instance of JsonWebKeyDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

