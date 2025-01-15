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

import com.affinidi.tdk.iota.client.ApiException;
import com.affinidi.tdk.iota.client.models.AlreadyExistsError;
import com.affinidi.tdk.iota.client.models.CreatePexQueryInput;
import com.affinidi.tdk.iota.client.models.InvalidParameterError;
import com.affinidi.tdk.iota.client.models.ListPexQueriesOK;
import com.affinidi.tdk.iota.client.models.NotFoundError;
import com.affinidi.tdk.iota.client.models.OperationForbiddenError;
import com.affinidi.tdk.iota.client.models.PexQueryDto;
import com.affinidi.tdk.iota.client.models.ResourceLimitExceededError;
import com.affinidi.tdk.iota.client.models.SavePexQueriesUpdateInput;
import com.affinidi.tdk.iota.client.models.UpdatePexQueryInput;
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
 * API tests for PexQueryApi
 */
@Disabled
public class PexQueryApiTest {

    private final PexQueryApi api = new PexQueryApi();

    /**
     * Creates a new Presentation Definition in the configuration to query data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPexQueryTest() throws ApiException {
        String configurationId = null;
        CreatePexQueryInput createPexQueryInput = null;
        PexQueryDto response = api.createPexQuery(configurationId, createPexQueryInput);

        // TODO: test validations
    }
    /**
     * Deletes all Presentation Definition queries of a configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePexQueriesTest() throws ApiException {
        String configurationId = null;
        api.deletePexQueries(configurationId);

        // TODO: test validations
    }
    /**
     * Deletes a Presentation Definition in the configuration by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePexQueryByIdTest() throws ApiException {
        String configurationId = null;
        String queryId = null;
        api.deletePexQueryById(configurationId, queryId);

        // TODO: test validations
    }
    /**
     * Retrieves a Presentation Definition in the configuration by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPexQueryByIdTest() throws ApiException {
        String configurationId = null;
        String queryId = null;
        PexQueryDto response = api.getPexQueryById(configurationId, queryId);

        // TODO: test validations
    }
    /**
     * Lists all Presentation Definitions in the configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPexQueriesTest() throws ApiException {
        String configurationId = null;
        Integer limit = null;
        String exclusiveStartKey = null;
        ListPexQueriesOK response = api.listPexQueries(configurationId, limit, exclusiveStartKey);

        // TODO: test validations
    }
    /**
     * Saves all Presentation Definition queries of a configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void savePexQueriesTest() throws ApiException {
        String configurationId = null;
        SavePexQueriesUpdateInput savePexQueriesUpdateInput = null;
        Object response = api.savePexQueries(configurationId, savePexQueriesUpdateInput);

        // TODO: test validations
    }
    /**
     * Updates the Presentation Definition in the configuration by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePexQueryByIdTest() throws ApiException {
        String configurationId = null;
        String queryId = null;
        UpdatePexQueryInput updatePexQueryInput = null;
        PexQueryDto response = api.updatePexQueryById(configurationId, queryId, updatePexQueryInput);

        // TODO: test validations
    }
}
