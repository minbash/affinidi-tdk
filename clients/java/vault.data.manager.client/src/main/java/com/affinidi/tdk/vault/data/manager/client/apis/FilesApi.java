/*
 * VaultFileSystem
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.affinidi.tdk.vault.data.manager.client.apis;

import com.fasterxml.jackson.core.type.TypeReference;

import com.affinidi.tdk.vault.data.manager.client.ApiException;
import com.affinidi.tdk.vault.data.manager.client.ApiClient;
import com.affinidi.tdk.vault.data.manager.client.BaseApi;
import com.affinidi.tdk.vault.data.manager.client.Configuration;
import com.affinidi.tdk.vault.data.manager.client.Pair;

import com.affinidi.tdk.vault.data.manager.client.models.GetScannedFileInfoOK;
import com.affinidi.tdk.vault.data.manager.client.models.InvalidParameterError;
import com.affinidi.tdk.vault.data.manager.client.models.ListScannedFilesOK;
import com.affinidi.tdk.vault.data.manager.client.models.StartFileScanInput;
import com.affinidi.tdk.vault.data.manager.client.models.StartFileScanOK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class FilesApi extends BaseApi {

    public FilesApi() {
        super(Configuration.getDefaultApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     *
     * Get the details of a scanned file using the textract jobId
     *
     * @param scannedFileJobId
     *            Scanned file jobId. (required)
     * @param exclusiveStartKey
     *            The base64url encoded key of the first item that this operation will evaluate (it is not returned).
     *            Use the value that was returned in the previous operation. (optional)
     *
     * @return GetScannedFileInfoOK
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public GetScannedFileInfoOK getScannedFileInfo(String scannedFileJobId, String exclusiveStartKey)
            throws ApiException {
        return this.getScannedFileInfo(scannedFileJobId, exclusiveStartKey, Collections.emptyMap());
    }

    /**
     *
     * Get the details of a scanned file using the textract jobId
     *
     * @param scannedFileJobId
     *            Scanned file jobId. (required)
     * @param exclusiveStartKey
     *            The base64url encoded key of the first item that this operation will evaluate (it is not returned).
     *            Use the value that was returned in the previous operation. (optional)
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @return GetScannedFileInfoOK
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public GetScannedFileInfoOK getScannedFileInfo(String scannedFileJobId, String exclusiveStartKey,
            Map<String, String> additionalHeaders) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'scannedFileJobId' is set
        if (scannedFileJobId == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'scannedFileJobId' when calling getScannedFileInfo");
        }

        // create path and map variables
        String localVarPath = "/v1/scanned-files/{scannedFileJobId}".replaceAll("\\{" + "scannedFileJobId" + "\\}",
                apiClient.escapeString(apiClient.parameterToString(scannedFileJobId)));

        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPair("exclusiveStartKey", exclusiveStartKey));

        localVarHeaderParams.putAll(additionalHeaders);

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ConsumerTokenAuth" };

        TypeReference<GetScannedFileInfoOK> localVarReturnType = new TypeReference<GetScannedFileInfoOK>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     *
     * List all the the scanned files with all the details, e.g. status and jobId
     *
     * @return ListScannedFilesOK
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public ListScannedFilesOK listScannedFiles() throws ApiException {
        return this.listScannedFiles(Collections.emptyMap());
    }

    /**
     *
     * List all the the scanned files with all the details, e.g. status and jobId
     *
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @return ListScannedFilesOK
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public ListScannedFilesOK listScannedFiles(Map<String, String> additionalHeaders) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/scanned-files/";

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

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ConsumerTokenAuth" };

        TypeReference<ListScannedFilesOK> localVarReturnType = new TypeReference<ListScannedFilesOK>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), localVarPostBody, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     *
     * Start a scan of the file under this node and provide a textract job
     *
     * @param nodeId
     *            Description for nodeId. (required)
     * @param startFileScanInput
     *            StartFileScan (required)
     *
     * @return StartFileScanOK
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public StartFileScanOK startFileScan(String nodeId, StartFileScanInput startFileScanInput) throws ApiException {
        return this.startFileScan(nodeId, startFileScanInput, Collections.emptyMap());
    }

    /**
     *
     * Start a scan of the file under this node and provide a textract job
     *
     * @param nodeId
     *            Description for nodeId. (required)
     * @param startFileScanInput
     *            StartFileScan (required)
     * @param additionalHeaders
     *            additionalHeaders for this call
     *
     * @return StartFileScanOK
     *
     * @throws ApiException
     *             if fails to make API call
     */
    public StartFileScanOK startFileScan(String nodeId, StartFileScanInput startFileScanInput,
            Map<String, String> additionalHeaders) throws ApiException {
        Object localVarPostBody = startFileScanInput;

        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException(400, "Missing the required parameter 'nodeId' when calling startFileScan");
        }

        // verify the required parameter 'startFileScanInput' is set
        if (startFileScanInput == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'startFileScanInput' when calling startFileScan");
        }

        // create path and map variables
        String localVarPath = "/v1/nodes/{nodeId}/file/scan".replaceAll("\\{" + "nodeId" + "\\}",
                apiClient.escapeString(apiClient.parameterToString(nodeId)));

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

        String[] localVarAuthNames = new String[] { "ConsumerTokenAuth" };

        TypeReference<StartFileScanOK> localVarReturnType = new TypeReference<StartFileScanOK>() {
        };
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
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

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ConsumerTokenAuth" };

        return apiClient.invokeAPI(localVarPath, method, localVarQueryParams, localVarCollectionQueryParams,
                localVarQueryStringJoiner.toString(), request, localVarHeaderParams, localVarCookieParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
