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

package com.affinidi.tdk.credential.issuance.client.apis;

import com.fasterxml.jackson.core.type.TypeReference;

import com.affinidi.tdk.credential.issuance.client.ApiException;
import com.affinidi.tdk.credential.issuance.client.ApiClient;
import com.affinidi.tdk.credential.issuance.client.BaseApi;
import com.affinidi.tdk.credential.issuance.client.Configuration;
import com.affinidi.tdk.credential.issuance.client.Pair;

import com.affinidi.tdk.credential.issuance.client.models.ActionForbiddenError;
import com.affinidi.tdk.credential.issuance.client.models.CredentialResponse;
import com.affinidi.tdk.credential.issuance.client.models.InvalidJwtTokenError;
import com.affinidi.tdk.credential.issuance.client.models.InvalidParameterError;
import com.affinidi.tdk.credential.issuance.client.models.IssuanceStateResponse;
import com.affinidi.tdk.credential.issuance.client.models.ListIssuanceResponse;
import com.affinidi.tdk.credential.issuance.client.models.NotFoundError;
import com.affinidi.tdk.credential.issuance.client.models.StartIssuance400Response;
import com.affinidi.tdk.credential.issuance.client.models.StartIssuanceInput;
import com.affinidi.tdk.credential.issuance.client.models.StartIssuanceResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class IssuanceApi extends BaseApi {

  public IssuanceApi() {
    super(Configuration.getDefaultApiClient());
  }

  public IssuanceApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * 
   * Get issuance status
   * @param issuanceId  (required)
   * @param projectId Affinidi project id (required)
   * @return IssuanceStateResponse
   * @throws ApiException if fails to make API call
   */
  public IssuanceStateResponse issuanceState(String issuanceId, String projectId) throws ApiException {
    return this.issuanceState(issuanceId, projectId, Collections.emptyMap());
  }


  /**
   * 
   * Get issuance status
   * @param issuanceId  (required)
   * @param projectId Affinidi project id (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return IssuanceStateResponse
   * @throws ApiException if fails to make API call
   */
  public IssuanceStateResponse issuanceState(String issuanceId, String projectId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issuanceId' is set
    if (issuanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'issuanceId' when calling issuanceState");
    }
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling issuanceState");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{projectId}/issuance/state/{issuanceId}"
      .replaceAll("\\{" + "issuanceId" + "\\}", apiClient.escapeString(apiClient.parameterToString(issuanceId)))
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(apiClient.parameterToString(projectId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<IssuanceStateResponse> localVarReturnType = new TypeReference<IssuanceStateResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * Endpoint to issue credentials directly without following OID4VCI flow
   * @param projectId Affinidi project id (required)
   * @param startIssuanceInput Request body to start issuance (required)
   * @return CredentialResponse
   * @throws ApiException if fails to make API call
   */
  public CredentialResponse issueCredentials(String projectId, StartIssuanceInput startIssuanceInput) throws ApiException {
    return this.issueCredentials(projectId, startIssuanceInput, Collections.emptyMap());
  }


  /**
   * 
   * Endpoint to issue credentials directly without following OID4VCI flow
   * @param projectId Affinidi project id (required)
   * @param startIssuanceInput Request body to start issuance (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return CredentialResponse
   * @throws ApiException if fails to make API call
   */
  public CredentialResponse issueCredentials(String projectId, StartIssuanceInput startIssuanceInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = startIssuanceInput;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling issueCredentials");
    }
    
    // verify the required parameter 'startIssuanceInput' is set
    if (startIssuanceInput == null) {
      throw new ApiException(400, "Missing the required parameter 'startIssuanceInput' when calling issueCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{projectId}/credential/issue"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(apiClient.parameterToString(projectId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<CredentialResponse> localVarReturnType = new TypeReference<CredentialResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * List all issuances for Project
   * @param projectId Affinidi project id (required)
   * @return ListIssuanceResponse
   * @throws ApiException if fails to make API call
   */
  public ListIssuanceResponse listIssuance(String projectId) throws ApiException {
    return this.listIssuance(projectId, Collections.emptyMap());
  }


  /**
   * 
   * List all issuances for Project
   * @param projectId Affinidi project id (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ListIssuanceResponse
   * @throws ApiException if fails to make API call
   */
  public ListIssuanceResponse listIssuance(String projectId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling listIssuance");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{projectId}/issuance"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(apiClient.parameterToString(projectId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<ListIssuanceResponse> localVarReturnType = new TypeReference<ListIssuanceResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * 
   * Endpoint used b websites to start the issuance process
   * @param projectId Affinidi project id (required)
   * @param startIssuanceInput Request body to start issuance (required)
   * @return StartIssuanceResponse
   * @throws ApiException if fails to make API call
   */
  public StartIssuanceResponse startIssuance(String projectId, StartIssuanceInput startIssuanceInput) throws ApiException {
    return this.startIssuance(projectId, startIssuanceInput, Collections.emptyMap());
  }


  /**
   * 
   * Endpoint used b websites to start the issuance process
   * @param projectId Affinidi project id (required)
   * @param startIssuanceInput Request body to start issuance (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return StartIssuanceResponse
   * @throws ApiException if fails to make API call
   */
  public StartIssuanceResponse startIssuance(String projectId, StartIssuanceInput startIssuanceInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = startIssuanceInput;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling startIssuance");
    }
    
    // verify the required parameter 'startIssuanceInput' is set
    if (startIssuanceInput == null) {
      throw new ApiException(400, "Missing the required parameter 'startIssuanceInput' when calling startIssuance");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{projectId}/issuance/start"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(apiClient.parameterToString(projectId)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<StartIssuanceResponse> localVarReturnType = new TypeReference<StartIssuanceResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
