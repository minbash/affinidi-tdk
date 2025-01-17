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

import com.affinidi.tdk.vault.data.manager.client.ApiException;
import com.affinidi.tdk.vault.data.manager.client.models.GetScannedFileInfoOK;
import com.affinidi.tdk.vault.data.manager.client.models.InvalidParameterError;
import com.affinidi.tdk.vault.data.manager.client.models.ListScannedFilesOK;
import com.affinidi.tdk.vault.data.manager.client.models.StartFileScanInput;
import com.affinidi.tdk.vault.data.manager.client.models.StartFileScanOK;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
@Disabled
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    /**
     * Get the details of a scanned file using the textract jobId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScannedFileInfoTest() throws ApiException {
        String scannedFileJobId = null;
        String exclusiveStartKey = null;
        GetScannedFileInfoOK response = api.getScannedFileInfo(scannedFileJobId, exclusiveStartKey);

        // TODO: test validations
    }
    /**
     * List all the the scanned files with all the details, e.g. status and jobId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listScannedFilesTest() throws ApiException {
        ListScannedFilesOK response = api.listScannedFiles();

        // TODO: test validations
    }
    /**
     * Start a scan of the file under this node and provide a textract job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startFileScanTest() throws ApiException {
        String nodeId = null;
        StartFileScanInput startFileScanInput = null;
        StartFileScanOK response = api.startFileScan(nodeId, startFileScanInput);

        // TODO: test validations
    }
}
