/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.4
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


import com.channelengine.merchant.apiclient.model.CollectionOfChannelListedProductResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListedProductsApi {
    private ApiClient localVarApiClient;

    public ListedProductsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListedProductsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for listedProductGetByFilter
     * @param channelId  (required)
     * @param page The page to filter on. Starts at 1. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listedProductGetByFilterCall(Integer channelId, Integer page, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/channels/{channelId}/products"
            .replaceAll("\\{" + "channelId" + "\\}", localVarApiClient.escapeString(channelId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

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
    private okhttp3.Call listedProductGetByFilterValidateBeforeCall(Integer channelId, Integer page, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new ApiException("Missing the required parameter 'channelId' when calling listedProductGetByFilter(Async)");
        }
        

        okhttp3.Call localVarCall = listedProductGetByFilterCall(channelId, page, _callback);
        return localVarCall;

    }

    /**
     * Get Listed Products
     * Gets the status of products listed for channel (export status) and on a channel (channel status).&lt;br /&gt;Includes products that were previously deleted from but are now set to be created again.&lt;br /&gt;Note: not all channels provide adequate options to retrieve the status on the channel.
     * @param channelId  (required)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return CollectionOfChannelListedProductResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CollectionOfChannelListedProductResponse listedProductGetByFilter(Integer channelId, Integer page) throws ApiException {
        ApiResponse<CollectionOfChannelListedProductResponse> localVarResp = listedProductGetByFilterWithHttpInfo(channelId, page);
        return localVarResp.getData();
    }

    /**
     * Get Listed Products
     * Gets the status of products listed for channel (export status) and on a channel (channel status).&lt;br /&gt;Includes products that were previously deleted from but are now set to be created again.&lt;br /&gt;Note: not all channels provide adequate options to retrieve the status on the channel.
     * @param channelId  (required)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return ApiResponse&lt;CollectionOfChannelListedProductResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CollectionOfChannelListedProductResponse> listedProductGetByFilterWithHttpInfo(Integer channelId, Integer page) throws ApiException {
        okhttp3.Call localVarCall = listedProductGetByFilterValidateBeforeCall(channelId, page, null);
        Type localVarReturnType = new TypeToken<CollectionOfChannelListedProductResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Listed Products (asynchronously)
     * Gets the status of products listed for channel (export status) and on a channel (channel status).&lt;br /&gt;Includes products that were previously deleted from but are now set to be created again.&lt;br /&gt;Note: not all channels provide adequate options to retrieve the status on the channel.
     * @param channelId  (required)
     * @param page The page to filter on. Starts at 1. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listedProductGetByFilterAsync(Integer channelId, Integer page, final ApiCallback<CollectionOfChannelListedProductResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listedProductGetByFilterValidateBeforeCall(channelId, page, _callback);
        Type localVarReturnType = new TypeToken<CollectionOfChannelListedProductResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
