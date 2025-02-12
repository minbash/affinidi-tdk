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

import com.affinidi.tdk.credential.issuance.client.ApiException;
import com.affinidi.tdk.credential.issuance.client.models.ChangeCredentialStatus400Response;
import com.affinidi.tdk.credential.issuance.client.models.ChangeCredentialStatusInput;
import com.affinidi.tdk.credential.issuance.client.models.FlowData;
import com.affinidi.tdk.credential.issuance.client.models.InvalidParameterError;
import com.affinidi.tdk.credential.issuance.client.models.ListIssuanceRecordResponse;
import com.affinidi.tdk.credential.issuance.client.models.NotFoundError;
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
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * change credential status.
     *
     * change credential status.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeCredentialStatusTest() throws ApiException {
        String projectId = null;
        String configurationId = null;
        ChangeCredentialStatusInput changeCredentialStatusInput = null;
        FlowData response = api.changeCredentialStatus(projectId, configurationId, changeCredentialStatusInput);

        // TODO: test validations
    }
    /**
     * List records
     *
     * Retrieve a list of issuance data records.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIssuanceDataRecordsTest() throws ApiException {
        String projectId = null;
        String configurationId = null;
        Integer limit = null;
        String exclusiveStartKey = null;
        ListIssuanceRecordResponse response = api.listIssuanceDataRecords(projectId, configurationId, limit, exclusiveStartKey);

        // TODO: test validations
    }
}
