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

import com.affinidi.tdk.login.configuration.client.models.BlockedUsers;
import com.affinidi.tdk.login.configuration.client.models.BlockedUsersInput;
import com.affinidi.tdk.login.configuration.client.models.GroupNames;
import com.affinidi.tdk.login.configuration.client.models.GroupNamesInput;
import com.affinidi.tdk.login.configuration.client.models.InvalidGroupsError;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class DenyListApi extends BaseApi {

    public DenyListApi() {
        super(Configuration.getDefaultApiClient());
    }

    public DenyListApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     *
     * Block Single or Multiple Groups
     *
     * @param groupNamesInput
     *            List of group names as input (optional)
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public void blockGroups(GroupNamesInput groupNamesInput) throws ApiException {
        this.blockGroups(groupNamesInput, Collections.emptyMap());
    }

    /**
     *
     * Block Single or Multiple Groups
     *
     * @param groupNamesInput
     *            List of group names as input (optional)
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public void blockGroups(GroupNamesInput groupNamesInput, Map<String, String> additionalHeaders)
            throws ApiException {
        Object localVarPostBody = groupNamesInput;

        // create path and map variables
        String localVarPath = "/v1/deny-list/groups/add";

        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.putAll(additionalHeaders);

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    }

    /**
     *
     * Block Single or Multiple user ids
     *
     * @param blockedUsersInput
     *            List of blocked users as input (optional)
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public void blockUsers(BlockedUsersInput blockedUsersInput) throws ApiException {
        this.blockUsers(blockedUsersInput, Collections.emptyMap());
    }

    /**
     *
     * Block Single or Multiple user ids
     *
     * @param blockedUsersInput
     *            List of blocked users as input (optional)
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public void blockUsers(BlockedUsersInput blockedUsersInput, Map<String, String> additionalHeaders)
            throws ApiException {
        Object localVarPostBody = blockedUsersInput;

        // create path and map variables
        String localVarPath = "/v1/deny-list/users/add";

        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.putAll(additionalHeaders);

        final String[] localVarAccepts = {

        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    }

    /**
     *
     * Get Blocked Groups
     *
     * @param pageToken
     *            (optional)
     *
     * @return GroupNames
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public GroupNames listBlockedGroups(String pageToken) throws ApiException {
        return this.listBlockedGroups(pageToken, Collections.emptyMap());
    }

    /**
     *
     * Get Blocked Groups
     *
     * @param pageToken
     *            (optional)
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @return GroupNames
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public GroupNames listBlockedGroups(String pageToken, Map<String, String> additionalHeaders) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/deny-list/groups";

        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPair("pageToken", pageToken));

        localVarHeaderParams.putAll(additionalHeaders);

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

        TypeReference<GroupNames> localVarReturnType = new TypeReference<GroupNames>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     *
     * Get List of Blocked Users
     *
     * @param pageToken
     *            (optional)
     *
     * @return BlockedUsers
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public BlockedUsers listBlockedUsers(String pageToken) throws ApiException {
        return this.listBlockedUsers(pageToken, Collections.emptyMap());
    }

    /**
     *
     * Get List of Blocked Users
     *
     * @param pageToken
     *            (optional)
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @return BlockedUsers
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public BlockedUsers listBlockedUsers(String pageToken, Map<String, String> additionalHeaders) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/deny-list/users";

        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPair("pageToken", pageToken));

        localVarHeaderParams.putAll(additionalHeaders);

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

        TypeReference<BlockedUsers> localVarReturnType = new TypeReference<BlockedUsers>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     *
     * Unblock Single or Multiple Groups
     *
     * @param groupNamesInput
     *            List of group names as input (optional)
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public void unblockGroups(GroupNamesInput groupNamesInput) throws ApiException {
        this.unblockGroups(groupNamesInput, Collections.emptyMap());
    }

    /**
     *
     * Unblock Single or Multiple Groups
     *
     * @param groupNamesInput
     *            List of group names as input (optional)
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public void unblockGroups(GroupNamesInput groupNamesInput, Map<String, String> additionalHeaders)
            throws ApiException {
        Object localVarPostBody = groupNamesInput;

        // create path and map variables
        String localVarPath = "/v1/deny-list/groups/remove";

        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.putAll(additionalHeaders);

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    }

    /**
     *
     * Unblock Single or Multiple user ids
     *
     * @param blockedUsersInput
     *            List of blocked users as input (optional)
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public void unblockUsers(BlockedUsersInput blockedUsersInput) throws ApiException {
        this.unblockUsers(blockedUsersInput, Collections.emptyMap());
    }

    /**
     *
     * Unblock Single or Multiple user ids
     *
     * @param blockedUsersInput
     *            List of blocked users as input (optional)
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public void unblockUsers(BlockedUsersInput blockedUsersInput, Map<String, String> additionalHeaders)
            throws ApiException {
        Object localVarPostBody = blockedUsersInput;

        // create path and map variables
        String localVarPath = "/v1/deny-list/users/remove";

        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.putAll(additionalHeaders);

        final String[] localVarAccepts = {

        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    }

    @Override
    public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType,
            Map<String, String> additionalHeaders) throws ApiException {
        String localVarPath = url.replace(apiClient.getBaseURL(), "");
        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarHeaderParams.putAll(additionalHeaders);

        final String[] localVarAccepts = {

        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

        return apiClient.invokeAPI(localVarPath, method, localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), request, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
