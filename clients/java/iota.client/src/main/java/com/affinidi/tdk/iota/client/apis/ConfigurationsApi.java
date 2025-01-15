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

package com.affinidi.tdk.iota.client.apis;

import com.fasterxml.jackson.core.type.TypeReference;

import com.affinidi.tdk.iota.client.ApiException;
import com.affinidi.tdk.iota.client.ApiClient;
import com.affinidi.tdk.iota.client.BaseApi;
import com.affinidi.tdk.iota.client.Configuration;
import com.affinidi.tdk.iota.client.Pair;

import com.affinidi.tdk.iota.client.models.AlreadyExistsError;
import com.affinidi.tdk.iota.client.models.CreateIotaConfigurationInput;
import com.affinidi.tdk.iota.client.models.GetIotaConfigurationMetaDataOK;
import com.affinidi.tdk.iota.client.models.InvalidParameterError;
import com.affinidi.tdk.iota.client.models.IotaConfigurationDto;
import com.affinidi.tdk.iota.client.models.ListConfigurationOK;
import com.affinidi.tdk.iota.client.models.NotFoundError;
import com.affinidi.tdk.iota.client.models.OperationForbiddenError;
import com.affinidi.tdk.iota.client.models.ResourceLimitExceededError;
import com.affinidi.tdk.iota.client.models.UpdateConfigurationByIdInput;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ConfigurationsApi extends BaseApi {

  public ConfigurationsApi() {
    super(Configuration.getDefaultApiClient());
  }

  public ConfigurationsApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * 
   * Creates a new Affinidi Iota Framework configuration.
   * @param createIotaConfigurationInput CreateConfiguration (required)
   * @return IotaConfigurationDto
   * @throws ApiException if fails to make API call
   */
  public IotaConfigurationDto createIotaConfiguration(CreateIotaConfigurationInput createIotaConfigurationInput) throws ApiException {
    return this.createIotaConfiguration(createIotaConfigurationInput, Collections.emptyMap());
  }


  /**
   * 
   * Creates a new Affinidi Iota Framework configuration.
   * @param createIotaConfigurationInput CreateConfiguration (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return IotaConfigurationDto
   * @throws ApiException if fails to make API call
   */
  public IotaConfigurationDto createIotaConfiguration(CreateIotaConfigurationInput createIotaConfigurationInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createIotaConfigurationInput;
    
    // verify the required parameter 'createIotaConfigurationInput' is set
    if (createIotaConfigurationInput == null) {
      throw new ApiException(400, "Missing the required parameter 'createIotaConfigurationInput' when calling createIotaConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations";

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

    TypeReference<IotaConfigurationDto> localVarReturnType = new TypeReference<IotaConfigurationDto>() {};
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
   * Deletes an Affinidi Iota Framework configuration by ID.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIotaConfigurationById(String configurationId) throws ApiException {
    this.deleteIotaConfigurationById(configurationId, Collections.emptyMap());
  }


  /**
   * 
   * Deletes an Affinidi Iota Framework configuration by ID.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteIotaConfigurationById(String configurationId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling deleteIotaConfigurationById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations/{configurationId}"
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)));

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

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
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
        null
    );
  }

  /**
   * 
   * Retrieves the details of an Affinidi Iota Framework configuration.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @return IotaConfigurationDto
   * @throws ApiException if fails to make API call
   */
  public IotaConfigurationDto getIotaConfigurationById(String configurationId) throws ApiException {
    return this.getIotaConfigurationById(configurationId, Collections.emptyMap());
  }


  /**
   * 
   * Retrieves the details of an Affinidi Iota Framework configuration.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return IotaConfigurationDto
   * @throws ApiException if fails to make API call
   */
  public IotaConfigurationDto getIotaConfigurationById(String configurationId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling getIotaConfigurationById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations/{configurationId}"
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)));

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

    TypeReference<IotaConfigurationDto> localVarReturnType = new TypeReference<IotaConfigurationDto>() {};
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
   * Retrieves the client metadata of an Affinidi Iota Framework configuration. 
   * @param projectId The ID of the project. (required)
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @return GetIotaConfigurationMetaDataOK
   * @throws ApiException if fails to make API call
   */
  public GetIotaConfigurationMetaDataOK getIotaConfigurationMetaData(String projectId, String configurationId) throws ApiException {
    return this.getIotaConfigurationMetaData(projectId, configurationId, Collections.emptyMap());
  }


  /**
   * 
   * Retrieves the client metadata of an Affinidi Iota Framework configuration. 
   * @param projectId The ID of the project. (required)
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GetIotaConfigurationMetaDataOK
   * @throws ApiException if fails to make API call
   */
  public GetIotaConfigurationMetaDataOK getIotaConfigurationMetaData(String projectId, String configurationId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getIotaConfigurationMetaData");
    }
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling getIotaConfigurationMetaData");
    }
    
    // create path and map variables
    String localVarPath = "/v1/projects/{projectId}/configurations/{configurationId}/metadata"
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(apiClient.parameterToString(projectId)))
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)));

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

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetIotaConfigurationMetaDataOK> localVarReturnType = new TypeReference<GetIotaConfigurationMetaDataOK>() {};
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
   * List all Affinidi Iota Framework configurations.
   * @return ListConfigurationOK
   * @throws ApiException if fails to make API call
   */
  public ListConfigurationOK listIotaConfigurations() throws ApiException {
    return this.listIotaConfigurations(Collections.emptyMap());
  }


  /**
   * 
   * List all Affinidi Iota Framework configurations.
   * @param additionalHeaders additionalHeaders for this call
   * @return ListConfigurationOK
   * @throws ApiException if fails to make API call
   */
  public ListConfigurationOK listIotaConfigurations(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/configurations";

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

    TypeReference<ListConfigurationOK> localVarReturnType = new TypeReference<ListConfigurationOK>() {};
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
   * Updates the details of an Affinidi Iota Framework configuration by ID.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param updateConfigurationByIdInput UpdateConfigurationById (required)
   * @return IotaConfigurationDto
   * @throws ApiException if fails to make API call
   */
  public IotaConfigurationDto updateIotaConfigurationById(String configurationId, UpdateConfigurationByIdInput updateConfigurationByIdInput) throws ApiException {
    return this.updateIotaConfigurationById(configurationId, updateConfigurationByIdInput, Collections.emptyMap());
  }


  /**
   * 
   * Updates the details of an Affinidi Iota Framework configuration by ID.
   * @param configurationId ID of the Affinidi Iota Framework configuration. (required)
   * @param updateConfigurationByIdInput UpdateConfigurationById (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return IotaConfigurationDto
   * @throws ApiException if fails to make API call
   */
  public IotaConfigurationDto updateIotaConfigurationById(String configurationId, UpdateConfigurationByIdInput updateConfigurationByIdInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = updateConfigurationByIdInput;
    
    // verify the required parameter 'configurationId' is set
    if (configurationId == null) {
      throw new ApiException(400, "Missing the required parameter 'configurationId' when calling updateIotaConfigurationById");
    }
    
    // verify the required parameter 'updateConfigurationByIdInput' is set
    if (updateConfigurationByIdInput == null) {
      throw new ApiException(400, "Missing the required parameter 'updateConfigurationByIdInput' when calling updateIotaConfigurationById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/configurations/{configurationId}"
      .replaceAll("\\{" + "configurationId" + "\\}", apiClient.escapeString(apiClient.parameterToString(configurationId)));

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

    TypeReference<IotaConfigurationDto> localVarReturnType = new TypeReference<IotaConfigurationDto>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
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
