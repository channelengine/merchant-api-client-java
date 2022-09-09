/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.13.0
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


import com.channelengine.merchant.apiclient.model.CollectionOfMerchantProductBundleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductBundleApi {
    private ApiClient localVarApiClient;

    public ProductBundleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductBundleApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for productBundleGetByFilter
     * @param search Search product(s) by Name, MerchantProductNo, Ean or Brand&lt;br /&gt;This search is applied to the result after applying the other filters. (optional)
     * @param eanList Search products by submitting a list of EAN&#39;s. (optional)
     * @param merchantProductNoList Search products by submitting a list of MerchantProductNo&#39;s. (optional)
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
    public okhttp3.Call productBundleGetByFilterCall(String search, List<String> eanList, List<String> merchantProductNoList, Integer page, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/productbundles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (eanList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "eanList", eanList));
        }

        if (merchantProductNoList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "merchantProductNoList", merchantProductNoList));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

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
    private okhttp3.Call productBundleGetByFilterValidateBeforeCall(String search, List<String> eanList, List<String> merchantProductNoList, Integer page, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = productBundleGetByFilterCall(search, eanList, merchantProductNoList, page, _callback);
        return localVarCall;

    }

    /**
     * Get product bundles.
     * You can get the full product information on bundles from the regular /products endpoint.
     * @param search Search product(s) by Name, MerchantProductNo, Ean or Brand&lt;br /&gt;This search is applied to the result after applying the other filters. (optional)
     * @param eanList Search products by submitting a list of EAN&#39;s. (optional)
     * @param merchantProductNoList Search products by submitting a list of MerchantProductNo&#39;s. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return CollectionOfMerchantProductBundleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CollectionOfMerchantProductBundleResponse productBundleGetByFilter(String search, List<String> eanList, List<String> merchantProductNoList, Integer page) throws ApiException {
        ApiResponse<CollectionOfMerchantProductBundleResponse> localVarResp = productBundleGetByFilterWithHttpInfo(search, eanList, merchantProductNoList, page);
        return localVarResp.getData();
    }

    /**
     * Get product bundles.
     * You can get the full product information on bundles from the regular /products endpoint.
     * @param search Search product(s) by Name, MerchantProductNo, Ean or Brand&lt;br /&gt;This search is applied to the result after applying the other filters. (optional)
     * @param eanList Search products by submitting a list of EAN&#39;s. (optional)
     * @param merchantProductNoList Search products by submitting a list of MerchantProductNo&#39;s. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return ApiResponse&lt;CollectionOfMerchantProductBundleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CollectionOfMerchantProductBundleResponse> productBundleGetByFilterWithHttpInfo(String search, List<String> eanList, List<String> merchantProductNoList, Integer page) throws ApiException {
        okhttp3.Call localVarCall = productBundleGetByFilterValidateBeforeCall(search, eanList, merchantProductNoList, page, null);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantProductBundleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get product bundles. (asynchronously)
     * You can get the full product information on bundles from the regular /products endpoint.
     * @param search Search product(s) by Name, MerchantProductNo, Ean or Brand&lt;br /&gt;This search is applied to the result after applying the other filters. (optional)
     * @param eanList Search products by submitting a list of EAN&#39;s. (optional)
     * @param merchantProductNoList Search products by submitting a list of MerchantProductNo&#39;s. (optional)
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
    public okhttp3.Call productBundleGetByFilterAsync(String search, List<String> eanList, List<String> merchantProductNoList, Integer page, final ApiCallback<CollectionOfMerchantProductBundleResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = productBundleGetByFilterValidateBeforeCall(search, eanList, merchantProductNoList, page, _callback);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantProductBundleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
