package com.affinidi.tdk.authProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicNameValuePair;

import com.affinidi.tdk.authProvider.helper.AuthProviderConstants;
import com.affinidi.tdk.authProvider.helper.JwtUtil;
import com.affinidi.tdk.authProvider.types.IotaJwtOutput;
import com.affinidi.tdk.common.EnvironmentUtil;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
* This class provides 
* 
*
* @author Priyanka
* 
*/
public class AuthProvider {

    private final String projectId;
    private final String tokenId;
    private final String privateKey;
    private final String keyId;
    private final String passphrase;
    private final String apiGatewayUrl;
    private final String tokenEndPoint;
    private String publicKey;
    private String projectScopeToken;

    AuthProvider(Configurations configurations){
        this.projectId = configurations.projectId;
        this.tokenId = configurations.tokenId;
        this.privateKey = configurations.privateKey;
        this.keyId = configurations.keyId;
        this.passphrase = configurations.passphrase;
        EnvironmentUtil eUtil = new EnvironmentUtil();
        this.apiGatewayUrl = eUtil.getApiGatewayUrlForEnvironment();
        this.tokenEndPoint = eUtil.getElementAuthTokenUrlForEnvironment();
    }

    
    /** 
     * This method identifies if the current AuthProvider has a valid existing
     * projectScopeToken or not. This helps to reuse the valid tokens without always 
     * generating a new.
     * 
     * The validation involves verifying token's signature against the 
     * public (verification) key.
     * 
     * @return boolean
     */
    public boolean shouldRefreshToken() {
        if(this.projectScopeToken == null){
            return true;
        }
        return !(JwtUtil.validProjectTokenPresent(this.projectScopeToken, this.apiGatewayUrl));
    }

    
    /** 
     * @return String
     * @throws Exception
     */
    public String fetchProjectScopedToken() throws Exception{
        boolean tokenFetchRequired = shouldRefreshToken();

        if(tokenFetchRequired){
            this.projectScopeToken = getProjectScopedToken();
        }
        return this.projectScopeToken;
    }

    
    /** 
     * @return String
     * @throws Exception
     */
    public String getUserAccessToken() throws Exception{

        String signedToken = JwtUtil.signPayload(this.tokenId, this.tokenEndPoint, this.privateKey, this.passphrase, this.keyId);
        if(signedToken == null){
            return null;
        }
        final HttpPost httpPost = new HttpPost(this.getTokenEndPoint());
        httpPost.setHeader(AuthProviderConstants.contentTypeHeader, "application/x-www-form-urlencoded");

        final List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("grant_type", "client_credentials"));
        params.add(new BasicNameValuePair("scope", "openid"));
        params.add(new BasicNameValuePair("client_assertion_type", "urn:ietf:params:oauth:client-assertion-type:jwt-bearer"));
        params.add(new BasicNameValuePair("client_assertion", signedToken));
        params.add(new BasicNameValuePair("client_id", this.tokenId));
        httpPost.setEntity(new UrlEncodedFormEntity(params));

        CloseableHttpClient client = HttpClients.createDefault();
        String userAccessToken = null;
        try{
            userAccessToken = client.execute(httpPost, 
                response -> {
                    System.out.println(response.getCode());
                    if(response.getCode() >=200 && response.getCode() < 300){
                        HttpEntity responseEntity = response.getEntity();

                        JsonElement responseAsJson = new Gson().fromJson(EntityUtils.toString(responseEntity), JsonElement.class);
                        JsonObject responseObject = responseAsJson.isJsonObject() ?  responseAsJson.getAsJsonObject() : null;
                        if(responseObject != null && responseObject.get("access_token") != null){
                            return responseObject.get("access_token").getAsString();
                        }
                    }
                    return null;
                });
        }catch(Exception exception){
            throw new Exception(exception.getMessage());
        }
        return userAccessToken;
    }

        
    
    /** 
     * @param apiGatewayUrl
     * @param projectId
     * @return String
     * @throws Exception
     */
    private String getProjectScopedToken() throws Exception{
                                                     
        String userAccessToken = getUserAccessToken();
        
        final HttpPost httpPost = new HttpPost(apiGatewayUrl + AuthProviderConstants.projectScopeTokenApiPath);
    
        final List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("projectId", projectId));
        httpPost.setEntity(new UrlEncodedFormEntity(params));
        
        httpPost.setHeader("Authorization", "Bearer "+userAccessToken);
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");

        CloseableHttpClient client = HttpClients.createDefault();
        String projectScopeToken = null;
        try{
            projectScopeToken = client.execute(httpPost, 
                response -> {
                    if(response.getCode() >=200 && response.getCode() < 300){
                        HttpEntity responseEntity = response.getEntity();
                        

                        JsonElement responseAsJson = new Gson().fromJson(EntityUtils.toString(responseEntity), JsonElement.class);
                        JsonObject responseObject = responseAsJson.isJsonObject() ?  responseAsJson.getAsJsonObject() : null;
                        if(responseObject != null && responseObject.get("accessToken") != null){
                            return responseObject.get("accessToken").getAsString();
                        }
                        
                    }
                    return null;
                });
        }catch(Exception exception){
            throw new Exception(exception.getMessage());
        }

        return projectScopeToken;
    }

    
    /** 
     * @param iotaConfigId
     * @param did
     * @param iotaSessionId
     * @return IotaJwtOutput
     * @throws Exception
     */
    public IotaJwtOutput signIotaJwt(String iotaConfigId, String did, String iotaSessionId) throws Exception {

        String iotaTokenId = "token/"+tokenId;
        String iotaSessionID = (iotaSessionId != null) ? iotaSessionId : UUID.randomUUID().toString();

        String iotaJwt =  JwtUtil.signIotaPayload(iotaTokenId, did, privateKey, passphrase, keyId, projectId, iotaConfigId, iotaSessionID);

        return new IotaJwtOutput(iotaSessionID, iotaJwt);
    }


    /**
    * This class provides a way to pass configurations to the AuthProvider 
    * It also helps to build an instance of AuthProvider which uses
    * these configurations
    * 
    * 
    */
    public static class Configurations{
        private String projectId;
        private String tokenId;
        private String privateKey;
        private String keyId;
        private String passphrase;

        public Configurations projectId(String projectId){
            this.projectId = projectId;
            return this;
        }
        public Configurations tokenId(String tokenId){
            this.tokenId = tokenId;
            return this;
        }
        public Configurations privateKey(String privateKey){
            this.privateKey = privateKey;
            return this;
        }
        public Configurations keyId(String keyId){
            this.keyId = keyId;
            return this;
        }
        public Configurations passphrase(String passphrase){
            this.passphrase = passphrase;
            return this;
        }

        public AuthProvider build() throws Exception{
            if(this.projectId == null || this.privateKey == null || this.tokenId == null){
                throw new Exception("Cannot create Auth provider without projectId, privateKey and toeknId");
            }
            return new AuthProvider(this);
        }
        public AuthProvider buildWithEnv() throws Exception{

            if(this.projectId != null || this.privateKey != null || this.tokenId != null || this.passphrase != null || this.privateKey != null){
                throw new Exception("Please do not pass configurations values while using buildWithEnv. "+
                                    " These values will picked from .env. Alternatively you may use build() in order to explicitly pass values");
            }

            EnvironmentUtil envUtil = new EnvironmentUtil();
            this.keyId = envUtil.getValueFromEnvConfig(AuthProviderConstants.keyIdPropertyNameinEnv);
            this.projectId = envUtil.getValueFromEnvConfig(AuthProviderConstants.projectIdPropertyNameinEnv);
            this.passphrase = envUtil.getValueFromEnvConfig(AuthProviderConstants.passphrasePropertyNameinEnv);
            this.tokenId = envUtil.getValueFromEnvConfig(AuthProviderConstants.tokenIdPropertyNameinEnv);
            this.privateKey = envUtil.getValueFromEnvConfig(AuthProviderConstants.privateKeyPropertyNameinEnv);

            if(this.projectId == null || this.privateKey == null || this.tokenId == null){
                throw new Exception("Cannot create Auth provider without projectId, privateKey and tokenId. Please ensure these values are configured in .env");
            }
            return new AuthProvider(this);
        }
    }

    
    /** 
     * @return String
     */
    public String getProjectId() {
        return projectId;
    }
    /** 
     * @return String
     */
    public String getTokenId() {
        return tokenId;
    }
    /** 
     * @return String
     */
    public String getPrivateKey() {
        return privateKey;
    }
    /** 
     * @return String
     */
    public String getKeyId() {
        return keyId;
    }
    /** 
     * @return String
     */
    public String getPassphrase() {
        return passphrase;
    }
    /** 
     * @return String
     */
    public String getApiGatewayUrl() {
        return apiGatewayUrl;
    }
    /** 
     * @return String
     */
    public String getTokenEndPoint() {
        return tokenEndPoint;
    }
    /** 
     * @return String
     */
    public String getPublicKey() {
        return publicKey;
    }
    /** 
     * @return String
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
    /** 
     * @return String
     */
    public String getProjectScopeToken() {
        return projectScopeToken;
    }
    /** 
     * @return String
     */
    public void setProjectScopeToken(String projectScopeToken) {
        this.projectScopeToken = projectScopeToken;
    }
}
