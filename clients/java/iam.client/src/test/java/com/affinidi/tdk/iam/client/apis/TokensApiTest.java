/*
 * Iam
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.affinidi.tdk.iam.client.apis;

import com.affinidi.tdk.iam.client.ApiException;
import com.affinidi.tdk.iam.client.models.ActionForbiddenError;
import com.affinidi.tdk.iam.client.models.CreateTokenInput;
import com.affinidi.tdk.iam.client.models.InvalidParameterError;
import com.affinidi.tdk.iam.client.models.NotFoundError;
import com.affinidi.tdk.iam.client.models.ProjectWithPolicyList;
import com.affinidi.tdk.iam.client.models.TokenDto;
import com.affinidi.tdk.iam.client.models.TokenList;
import java.util.UUID;
import com.affinidi.tdk.iam.client.models.UnexpectedError;
import com.affinidi.tdk.iam.client.models.UpdateTokenInput;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokensApi
 */
@Disabled
public class TokensApiTest {

    private final TokensApi api = new TokensApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTokenTest() throws ApiException {
        CreateTokenInput createTokenInput = null;
        TokenDto response = api.createToken(createTokenInput);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTokenTest() throws ApiException {
        UUID tokenId = null;
        api.deleteToken(tokenId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTokenTest() throws ApiException {
        UUID tokenId = null;
        TokenDto response = api.getToken(tokenId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProjectsOfTokenTest() throws ApiException {
        UUID tokenId = null;
        Integer limit = null;
        String exclusiveStartKey = null;
        ProjectWithPolicyList response = api.listProjectsOfToken(tokenId, limit, exclusiveStartKey);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTokenTest() throws ApiException {
        Integer limit = null;
        String exclusiveStartKey = null;
        TokenList response = api.listToken(limit, exclusiveStartKey);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTokenTest() throws ApiException {
        UUID tokenId = null;
        UpdateTokenInput updateTokenInput = null;
        TokenDto response = api.updateToken(tokenId, updateTokenInput);
        // TODO: test validations
    }

}
