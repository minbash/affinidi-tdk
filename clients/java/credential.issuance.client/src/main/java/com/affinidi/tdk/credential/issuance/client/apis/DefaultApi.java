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

import com.affinidi.tdk.credential.issuance.client.models.ChangeCredentialStatus400Response;
import com.affinidi.tdk.credential.issuance.client.models.ChangeCredentialStatusInput;
import com.affinidi.tdk.credential.issuance.client.models.FlowData;
import com.affinidi.tdk.credential.issuance.client.models.InvalidParameterError;
import com.affinidi.tdk.credential.issuance.client.models.ListIssuanceRecordResponse;
import com.affinidi.tdk.credential.issuance.client.models.NotFoundError;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class DefaultApi extends BaseApi {

    public DefaultApi() {
        super(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * change credential status. change credential status.
     *
     * @param projectId
     *            project id (required)
     * @param configurationId
     *            configuration id (required)
     * @param changeCredentialStatusInput
     *            Request body for changing credential status (required)
     *
     * @return FlowData
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public FlowData changeCredentialStatus(String projectId, String configurationId,
            ChangeCredentialStatusInput changeCredentialStatusInput) throws ApiException {
        return this.changeCredentialStatus(projectId, configurationId, changeCredentialStatusInput,
                Collections.emptyMap());
    }

    /**
     * change credential status. change credential status.
     *
     * @param projectId
     *            project id (required)
     * @param configurationId
     *            configuration id (required)
     * @param changeCredentialStatusInput
     *            Request body for changing credential status (required)
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @return FlowData
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public FlowData changeCredentialStatus(String projectId, String configurationId,
            ChangeCredentialStatusInput changeCredentialStatusInput, Map<String, String> additionalHeaders)
            throws ApiException {
        Object localVarPostBody = changeCredentialStatusInput;

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'projectId' when calling changeCredentialStatus");
        }

        // verify the required parameter 'configurationId' is set
        if (configurationId == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'configurationId' when calling changeCredentialStatus");
        }

        // verify the required parameter 'changeCredentialStatusInput' is set
        if (changeCredentialStatusInput == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'changeCredentialStatusInput' when calling changeCredentialStatus");
        }

        // create path and map variables
        String localVarPath = "/v1/{projectId}/configurations/{configurationId}/issuance/change-status"
                .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(apiClient.parameterToString(projectId)))
                .replaceAll("\\{" + "configurationId" + "\\}",
                        apiClient.escapeString(apiClient.parameterToString(configurationId)));

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

        TypeReference<FlowData> localVarReturnType = new TypeReference<FlowData>() {
        };
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List records Retrieve a list of issuance data records.
     *
     * @param projectId
     *            Affinidi project id (required)
     * @param configurationId
     *            The id of the issuance configuration (required)
     * @param limit
     *            Maximum number of records to fetch in a list (optional, default to 10)
     * @param exclusiveStartKey
     *            exclusiveStartKey for retrieving the next batch of data. (optional)
     *
     * @return ListIssuanceRecordResponse
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public ListIssuanceRecordResponse listIssuanceDataRecords(String projectId, String configurationId, Integer limit,
            String exclusiveStartKey) throws ApiException {
        return this.listIssuanceDataRecords(projectId, configurationId, limit, exclusiveStartKey,
                Collections.emptyMap());
    }

    /**
     * List records Retrieve a list of issuance data records.
     *
     * @param projectId
     *            Affinidi project id (required)
     * @param configurationId
     *            The id of the issuance configuration (required)
     * @param limit
     *            Maximum number of records to fetch in a list (optional, default to 10)
     * @param exclusiveStartKey
     *            exclusiveStartKey for retrieving the next batch of data. (optional)
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @return ListIssuanceRecordResponse
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public ListIssuanceRecordResponse listIssuanceDataRecords(String projectId, String configurationId, Integer limit,
            String exclusiveStartKey, Map<String, String> additionalHeaders) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'projectId' when calling listIssuanceDataRecords");
        }

        // verify the required parameter 'configurationId' is set
        if (configurationId == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'configurationId' when calling listIssuanceDataRecords");
        }

        // create path and map variables
        String localVarPath = "/v1/{projectId}/configurations/{configurationId}/issuance/issuance-data-records"
                .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(apiClient.parameterToString(projectId)))
                .replaceAll("\\{" + "configurationId" + "\\}",
                        apiClient.escapeString(apiClient.parameterToString(configurationId)));

        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        localVarQueryParams.addAll(apiClient.parameterToPair("exclusiveStartKey", exclusiveStartKey));

        localVarHeaderParams.putAll(additionalHeaders);

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

        TypeReference<ListIssuanceRecordResponse> localVarReturnType = new TypeReference<ListIssuanceRecordResponse>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
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

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ProjectTokenAuth" };

        return apiClient.invokeAPI(localVarPath, method, localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), request, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
