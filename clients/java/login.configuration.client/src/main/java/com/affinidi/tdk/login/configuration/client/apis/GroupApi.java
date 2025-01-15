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

package com.affinidi.tdk.login.configuration.client.apis;

import com.fasterxml.jackson.core.type.TypeReference;

import com.affinidi.tdk.login.configuration.client.ApiException;
import com.affinidi.tdk.login.configuration.client.ApiClient;
import com.affinidi.tdk.login.configuration.client.BaseApi;
import com.affinidi.tdk.login.configuration.client.Configuration;
import com.affinidi.tdk.login.configuration.client.Pair;

import com.affinidi.tdk.login.configuration.client.models.ActionForbiddenError;
import com.affinidi.tdk.login.configuration.client.models.AddUserToGroupInput;
import com.affinidi.tdk.login.configuration.client.models.CreateGroupInput;
import com.affinidi.tdk.login.configuration.client.models.GroupDto;
import com.affinidi.tdk.login.configuration.client.models.GroupUserMappingDto;
import com.affinidi.tdk.login.configuration.client.models.GroupUserMappingsList;
import com.affinidi.tdk.login.configuration.client.models.GroupsList;
import com.affinidi.tdk.login.configuration.client.models.GroupsPerUserLimitExceededError;
import com.affinidi.tdk.login.configuration.client.models.InvalidParameterError;
import com.affinidi.tdk.login.configuration.client.models.NotFoundError;
import com.affinidi.tdk.login.configuration.client.models.RemoveUserFromGroupInput;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GroupApi extends BaseApi {

  public GroupApi() {
    super(Configuration.getDefaultApiClient());
  }

  public GroupApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * 
   * 
   * @param groupName  (required)
   * @param addUserToGroupInput AddUserToGroup (required)
   * @return GroupUserMappingDto
   * @throws ApiException if fails to make API call
   */
  public GroupUserMappingDto addUserToGroup(String groupName, AddUserToGroupInput addUserToGroupInput) throws ApiException {
    return this.addUserToGroup(groupName, addUserToGroupInput, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param groupName  (required)
   * @param addUserToGroupInput AddUserToGroup (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupUserMappingDto
   * @throws ApiException if fails to make API call
   */
  public GroupUserMappingDto addUserToGroup(String groupName, AddUserToGroupInput addUserToGroupInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = addUserToGroupInput;
    
    // verify the required parameter 'groupName' is set
    if (groupName == null) {
      throw new ApiException(400, "Missing the required parameter 'groupName' when calling addUserToGroup");
    }
    
    // verify the required parameter 'addUserToGroupInput' is set
    if (addUserToGroupInput == null) {
      throw new ApiException(400, "Missing the required parameter 'addUserToGroupInput' when calling addUserToGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v1/groups/{groupName}/users"
      .replaceAll("\\{" + "groupName" + "\\}", apiClient.escapeString(apiClient.parameterToString(groupName)));

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

    TypeReference<GroupUserMappingDto> localVarReturnType = new TypeReference<GroupUserMappingDto>() {};
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
   * 
   * @param createGroupInput CreateGroup (required)
   * @return GroupDto
   * @throws ApiException if fails to make API call
   */
  public GroupDto createGroup(CreateGroupInput createGroupInput) throws ApiException {
    return this.createGroup(createGroupInput, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param createGroupInput CreateGroup (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupDto
   * @throws ApiException if fails to make API call
   */
  public GroupDto createGroup(CreateGroupInput createGroupInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = createGroupInput;
    
    // verify the required parameter 'createGroupInput' is set
    if (createGroupInput == null) {
      throw new ApiException(400, "Missing the required parameter 'createGroupInput' when calling createGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v1/groups";

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

    TypeReference<GroupDto> localVarReturnType = new TypeReference<GroupDto>() {};
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
   * 
   * @param groupName  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteGroup(String groupName) throws ApiException {
    this.deleteGroup(groupName, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param groupName  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void deleteGroup(String groupName, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupName' is set
    if (groupName == null) {
      throw new ApiException(400, "Missing the required parameter 'groupName' when calling deleteGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v1/groups/{groupName}"
      .replaceAll("\\{" + "groupName" + "\\}", apiClient.escapeString(apiClient.parameterToString(groupName)));

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
   * 
   * @param groupName  (required)
   * @return GroupDto
   * @throws ApiException if fails to make API call
   */
  public GroupDto getGroupById(String groupName) throws ApiException {
    return this.getGroupById(groupName, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param groupName  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupDto
   * @throws ApiException if fails to make API call
   */
  public GroupDto getGroupById(String groupName, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupName' is set
    if (groupName == null) {
      throw new ApiException(400, "Missing the required parameter 'groupName' when calling getGroupById");
    }
    
    // create path and map variables
    String localVarPath = "/v1/groups/{groupName}"
      .replaceAll("\\{" + "groupName" + "\\}", apiClient.escapeString(apiClient.parameterToString(groupName)));

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

    TypeReference<GroupDto> localVarReturnType = new TypeReference<GroupDto>() {};
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
   * 
   * @param groupName  (required)
   * @param limit Maximum number of records to fetch in a list (optional)
   * @param exclusiveStartKey The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation. (optional)
   * @param sortOrder sort response in specific order. By default it is in desc order (optional)
   * @return GroupUserMappingsList
   * @throws ApiException if fails to make API call
   */
  public GroupUserMappingsList listGroupUserMappings(String groupName, Integer limit, String exclusiveStartKey, String sortOrder) throws ApiException {
    return this.listGroupUserMappings(groupName, limit, exclusiveStartKey, sortOrder, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param groupName  (required)
   * @param limit Maximum number of records to fetch in a list (optional)
   * @param exclusiveStartKey The base64url encoded key of the first item that this operation will evaluate (it is not returned). Use the value that was returned in the previous operation. (optional)
   * @param sortOrder sort response in specific order. By default it is in desc order (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupUserMappingsList
   * @throws ApiException if fails to make API call
   */
  public GroupUserMappingsList listGroupUserMappings(String groupName, Integer limit, String exclusiveStartKey, String sortOrder, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupName' is set
    if (groupName == null) {
      throw new ApiException(400, "Missing the required parameter 'groupName' when calling listGroupUserMappings");
    }
    
    // create path and map variables
    String localVarPath = "/v1/groups/{groupName}/users"
      .replaceAll("\\{" + "groupName" + "\\}", apiClient.escapeString(apiClient.parameterToString(groupName)));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("exclusiveStartKey", exclusiveStartKey));
    localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

    TypeReference<GroupUserMappingsList> localVarReturnType = new TypeReference<GroupUserMappingsList>() {};
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
   * 
   * @return GroupsList
   * @throws ApiException if fails to make API call
   */
  public GroupsList listGroups() throws ApiException {
    return this.listGroups(Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param additionalHeaders additionalHeaders for this call
   * @return GroupsList
   * @throws ApiException if fails to make API call
   */
  public GroupsList listGroups(Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/groups";

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

    TypeReference<GroupsList> localVarReturnType = new TypeReference<GroupsList>() {};
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
   * 
   * @param groupName  (required)
   * @param removeUserFromGroupInput Remove user from group (required)
   * @throws ApiException if fails to make API call
   */
  public void removeUserFromGroup(String groupName, RemoveUserFromGroupInput removeUserFromGroupInput) throws ApiException {
    this.removeUserFromGroup(groupName, removeUserFromGroupInput, Collections.emptyMap());
  }


  /**
   * 
   * 
   * @param groupName  (required)
   * @param removeUserFromGroupInput Remove user from group (required)
   * @param additionalHeaders additionalHeaders for this call
   * @throws ApiException if fails to make API call
   */
  public void removeUserFromGroup(String groupName, RemoveUserFromGroupInput removeUserFromGroupInput, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = removeUserFromGroupInput;
    
    // verify the required parameter 'groupName' is set
    if (groupName == null) {
      throw new ApiException(400, "Missing the required parameter 'groupName' when calling removeUserFromGroup");
    }
    
    // verify the required parameter 'removeUserFromGroupInput' is set
    if (removeUserFromGroupInput == null) {
      throw new ApiException(400, "Missing the required parameter 'removeUserFromGroupInput' when calling removeUserFromGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v1/groups/{groupName}/users"
      .replaceAll("\\{" + "groupName" + "\\}", apiClient.escapeString(apiClient.parameterToString(groupName)));

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
