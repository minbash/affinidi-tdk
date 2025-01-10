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
import com.affinidi.tdk.credential.verification.client.models.JwtObject;
import com.affinidi.tdk.credential.verification.client.models.LdpObject;
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

import com.affinidi.tdk.credential.verification.client.JSON;

/**
 * Format
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-08T23:16:14.786007424Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Format {
  public static final String SERIALIZED_NAME_JWT = "jwt";
  @SerializedName(SERIALIZED_NAME_JWT)
  private JwtObject jwt;

  public static final String SERIALIZED_NAME_JWT_VC = "jwt_vc";
  @SerializedName(SERIALIZED_NAME_JWT_VC)
  private JwtObject jwtVc;

  public static final String SERIALIZED_NAME_JWT_VP = "jwt_vp";
  @SerializedName(SERIALIZED_NAME_JWT_VP)
  private JwtObject jwtVp;

  public static final String SERIALIZED_NAME_LDP = "ldp";
  @SerializedName(SERIALIZED_NAME_LDP)
  private LdpObject ldp;

  public static final String SERIALIZED_NAME_LDP_VC = "ldp_vc";
  @SerializedName(SERIALIZED_NAME_LDP_VC)
  private LdpObject ldpVc;

  public static final String SERIALIZED_NAME_LDP_VP = "ldp_vp";
  @SerializedName(SERIALIZED_NAME_LDP_VP)
  private LdpObject ldpVp;

  public Format() {
  }

  public Format jwt(JwtObject jwt) {
    this.jwt = jwt;
    return this;
  }

  /**
   * Get jwt
   * @return jwt
   */
  @javax.annotation.Nullable
  public JwtObject getJwt() {
    return jwt;
  }

  public void setJwt(JwtObject jwt) {
    this.jwt = jwt;
  }


  public Format jwtVc(JwtObject jwtVc) {
    this.jwtVc = jwtVc;
    return this;
  }

  /**
   * Get jwtVc
   * @return jwtVc
   */
  @javax.annotation.Nullable
  public JwtObject getJwtVc() {
    return jwtVc;
  }

  public void setJwtVc(JwtObject jwtVc) {
    this.jwtVc = jwtVc;
  }


  public Format jwtVp(JwtObject jwtVp) {
    this.jwtVp = jwtVp;
    return this;
  }

  /**
   * Get jwtVp
   * @return jwtVp
   */
  @javax.annotation.Nullable
  public JwtObject getJwtVp() {
    return jwtVp;
  }

  public void setJwtVp(JwtObject jwtVp) {
    this.jwtVp = jwtVp;
  }


  public Format ldp(LdpObject ldp) {
    this.ldp = ldp;
    return this;
  }

  /**
   * Get ldp
   * @return ldp
   */
  @javax.annotation.Nullable
  public LdpObject getLdp() {
    return ldp;
  }

  public void setLdp(LdpObject ldp) {
    this.ldp = ldp;
  }


  public Format ldpVc(LdpObject ldpVc) {
    this.ldpVc = ldpVc;
    return this;
  }

  /**
   * Get ldpVc
   * @return ldpVc
   */
  @javax.annotation.Nullable
  public LdpObject getLdpVc() {
    return ldpVc;
  }

  public void setLdpVc(LdpObject ldpVc) {
    this.ldpVc = ldpVc;
  }


  public Format ldpVp(LdpObject ldpVp) {
    this.ldpVp = ldpVp;
    return this;
  }

  /**
   * Get ldpVp
   * @return ldpVp
   */
  @javax.annotation.Nullable
  public LdpObject getLdpVp() {
    return ldpVp;
  }

  public void setLdpVp(LdpObject ldpVp) {
    this.ldpVp = ldpVp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Format format = (Format) o;
    return Objects.equals(this.jwt, format.jwt) &&
        Objects.equals(this.jwtVc, format.jwtVc) &&
        Objects.equals(this.jwtVp, format.jwtVp) &&
        Objects.equals(this.ldp, format.ldp) &&
        Objects.equals(this.ldpVc, format.ldpVc) &&
        Objects.equals(this.ldpVp, format.ldpVp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jwt, jwtVc, jwtVp, ldp, ldpVc, ldpVp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Format {\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
    sb.append("    jwtVc: ").append(toIndentedString(jwtVc)).append("\n");
    sb.append("    jwtVp: ").append(toIndentedString(jwtVp)).append("\n");
    sb.append("    ldp: ").append(toIndentedString(ldp)).append("\n");
    sb.append("    ldpVc: ").append(toIndentedString(ldpVc)).append("\n");
    sb.append("    ldpVp: ").append(toIndentedString(ldpVp)).append("\n");
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
    openapiFields.add("jwt_vc");
    openapiFields.add("jwt_vp");
    openapiFields.add("ldp");
    openapiFields.add("ldp_vc");
    openapiFields.add("ldp_vp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Format
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Format.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Format is not found in the empty JSON string", Format.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Format.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Format` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `jwt`
      if (jsonObj.get("jwt") != null && !jsonObj.get("jwt").isJsonNull()) {
        JwtObject.validateJsonElement(jsonObj.get("jwt"));
      }
      // validate the optional field `jwt_vc`
      if (jsonObj.get("jwt_vc") != null && !jsonObj.get("jwt_vc").isJsonNull()) {
        JwtObject.validateJsonElement(jsonObj.get("jwt_vc"));
      }
      // validate the optional field `jwt_vp`
      if (jsonObj.get("jwt_vp") != null && !jsonObj.get("jwt_vp").isJsonNull()) {
        JwtObject.validateJsonElement(jsonObj.get("jwt_vp"));
      }
      // validate the optional field `ldp`
      if (jsonObj.get("ldp") != null && !jsonObj.get("ldp").isJsonNull()) {
        LdpObject.validateJsonElement(jsonObj.get("ldp"));
      }
      // validate the optional field `ldp_vc`
      if (jsonObj.get("ldp_vc") != null && !jsonObj.get("ldp_vc").isJsonNull()) {
        LdpObject.validateJsonElement(jsonObj.get("ldp_vc"));
      }
      // validate the optional field `ldp_vp`
      if (jsonObj.get("ldp_vp") != null && !jsonObj.get("ldp_vp").isJsonNull()) {
        LdpObject.validateJsonElement(jsonObj.get("ldp_vp"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Format.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Format' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Format> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Format.class));

       return (TypeAdapter<T>) new TypeAdapter<Format>() {
           @Override
           public void write(JsonWriter out, Format value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Format read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Format given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Format
   * @throws IOException if the JSON string is invalid with respect to Format
   */
  public static Format fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Format.class);
  }

  /**
   * Convert an instance of Format to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

