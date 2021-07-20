/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.api;

import com.channelengine.merchant.apiclient.ApiCallback;
import com.channelengine.merchant.apiclient.ApiClient;
import com.channelengine.merchant.apiclient.ApiException;
import com.channelengine.merchant.apiclient.ApiResponse;
import com.channelengine.merchant.apiclient.Configuration;
import com.channelengine.merchant.apiclient.Pair;
import com.channelengine.merchant.apiclient.ProgressRequestBody;
import com.channelengine.merchant.apiclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.channelengine.merchant.apiclient.model.CollectionOfChannelGlobalChannelResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChannelsApi {
    private ApiClient localVarApiClient;

    public ChannelsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChannelsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for channelPluginsGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call channelPluginsGetCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/channels";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call channelPluginsGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = channelPluginsGetCall(_callback);
        return localVarCall;

    }

    /**
     * Get Channels.
     * Get all channels (excluding deleted ones).&lt;br /&gt;You can use the returned ids to query the listed products for this channel from the ListedProducts endpoint.
     * @return CollectionOfChannelGlobalChannelResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CollectionOfChannelGlobalChannelResponse channelPluginsGet() throws ApiException {
        ApiResponse<CollectionOfChannelGlobalChannelResponse> localVarResp = channelPluginsGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Channels.
     * Get all channels (excluding deleted ones).&lt;br /&gt;You can use the returned ids to query the listed products for this channel from the ListedProducts endpoint.
     * @return ApiResponse&lt;CollectionOfChannelGlobalChannelResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CollectionOfChannelGlobalChannelResponse> channelPluginsGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = channelPluginsGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<CollectionOfChannelGlobalChannelResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Channels. (asynchronously)
     * Get all channels (excluding deleted ones).&lt;br /&gt;You can use the returned ids to query the listed products for this channel from the ListedProducts endpoint.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call channelPluginsGetAsync(final ApiCallback<CollectionOfChannelGlobalChannelResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = channelPluginsGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<CollectionOfChannelGlobalChannelResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
