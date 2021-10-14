/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.9
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


import java.io.File;
import com.channelengine.merchant.apiclient.model.MerchantChannelLabelShipmentRequest;
import com.channelengine.merchant.apiclient.model.MerchantShipmentLabelCarrierRequest;
import com.channelengine.merchant.apiclient.model.MerchantShipmentRequest;
import com.channelengine.merchant.apiclient.model.MerchantShipmentTrackingRequest;
import com.channelengine.merchant.apiclient.model.ModelApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipmentApi {
    private ApiClient localVarApiClient;

    public ShipmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShipmentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for shipmentCreate
     * @param merchantShipmentRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentCreateCall(MerchantShipmentRequest merchantShipmentRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = merchantShipmentRequest;

        // create path and map variables
        String localVarPath = "/v2/shipments";

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
            "application/json-patch+json", "application/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call shipmentCreateValidateBeforeCall(MerchantShipmentRequest merchantShipmentRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = shipmentCreateCall(merchantShipmentRequest, _callback);
        return localVarCall;

    }

    /**
     * Create Shipment.
     * Mark (part of) an order as shipped.
     * @param merchantShipmentRequest  (optional)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public ModelApiResponse shipmentCreate(MerchantShipmentRequest merchantShipmentRequest) throws ApiException {
        ApiResponse<ModelApiResponse> localVarResp = shipmentCreateWithHttpInfo(merchantShipmentRequest);
        return localVarResp.getData();
    }

    /**
     * Create Shipment.
     * Mark (part of) an order as shipped.
     * @param merchantShipmentRequest  (optional)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModelApiResponse> shipmentCreateWithHttpInfo(MerchantShipmentRequest merchantShipmentRequest) throws ApiException {
        okhttp3.Call localVarCall = shipmentCreateValidateBeforeCall(merchantShipmentRequest, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Shipment. (asynchronously)
     * Mark (part of) an order as shipped.
     * @param merchantShipmentRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentCreateAsync(MerchantShipmentRequest merchantShipmentRequest, final ApiCallback<ModelApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = shipmentCreateValidateBeforeCall(merchantShipmentRequest, _callback);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for shipmentCreateForChannelMethod
     * @param merchantChannelLabelShipmentRequest The shipment to create (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentCreateForChannelMethodCall(MerchantChannelLabelShipmentRequest merchantChannelLabelShipmentRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = merchantChannelLabelShipmentRequest;

        // create path and map variables
        String localVarPath = "/v2/shipments/channelmethod";

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
            "application/json-patch+json", "application/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call shipmentCreateForChannelMethodValidateBeforeCall(MerchantChannelLabelShipmentRequest merchantChannelLabelShipmentRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = shipmentCreateForChannelMethodCall(merchantChannelLabelShipmentRequest, _callback);
        return localVarCall;

    }

    /**
     * Create shipment for channel provided shipping labels
     * Create a shipment, which will request a shipping label from the channel
     * @param merchantChannelLabelShipmentRequest The shipment to create (optional)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ModelApiResponse shipmentCreateForChannelMethod(MerchantChannelLabelShipmentRequest merchantChannelLabelShipmentRequest) throws ApiException {
        ApiResponse<ModelApiResponse> localVarResp = shipmentCreateForChannelMethodWithHttpInfo(merchantChannelLabelShipmentRequest);
        return localVarResp.getData();
    }

    /**
     * Create shipment for channel provided shipping labels
     * Create a shipment, which will request a shipping label from the channel
     * @param merchantChannelLabelShipmentRequest The shipment to create (optional)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModelApiResponse> shipmentCreateForChannelMethodWithHttpInfo(MerchantChannelLabelShipmentRequest merchantChannelLabelShipmentRequest) throws ApiException {
        okhttp3.Call localVarCall = shipmentCreateForChannelMethodValidateBeforeCall(merchantChannelLabelShipmentRequest, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create shipment for channel provided shipping labels (asynchronously)
     * Create a shipment, which will request a shipping label from the channel
     * @param merchantChannelLabelShipmentRequest The shipment to create (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentCreateForChannelMethodAsync(MerchantChannelLabelShipmentRequest merchantChannelLabelShipmentRequest, final ApiCallback<ModelApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = shipmentCreateForChannelMethodValidateBeforeCall(merchantChannelLabelShipmentRequest, _callback);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for shipmentGetShipmentLabelCarriers
     * @param merchantOrderNo The merchant&#39;s order reference. (required)
     * @param merchantShipmentLabelCarrierRequest The parcel information (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentGetShipmentLabelCarriersCall(String merchantOrderNo, MerchantShipmentLabelCarrierRequest merchantShipmentLabelCarrierRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = merchantShipmentLabelCarrierRequest;

        // create path and map variables
        String localVarPath = "/v2/carriers/{merchantOrderNo}"
            .replaceAll("\\{" + "merchantOrderNo" + "\\}", localVarApiClient.escapeString(merchantOrderNo.toString()));

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
            "application/json-patch+json", "application/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call shipmentGetShipmentLabelCarriersValidateBeforeCall(String merchantOrderNo, MerchantShipmentLabelCarrierRequest merchantShipmentLabelCarrierRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'merchantOrderNo' is set
        if (merchantOrderNo == null) {
            throw new ApiException("Missing the required parameter 'merchantOrderNo' when calling shipmentGetShipmentLabelCarriers(Async)");
        }
        

        okhttp3.Call localVarCall = shipmentGetShipmentLabelCarriersCall(merchantOrderNo, merchantShipmentLabelCarrierRequest, _callback);
        return localVarCall;

    }

    /**
     * Get carriers for channel provided shipping labels
     * Get the carriers for buying a shipping label from the channel
     * @param merchantOrderNo The merchant&#39;s order reference. (required)
     * @param merchantShipmentLabelCarrierRequest The parcel information (optional)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ModelApiResponse shipmentGetShipmentLabelCarriers(String merchantOrderNo, MerchantShipmentLabelCarrierRequest merchantShipmentLabelCarrierRequest) throws ApiException {
        ApiResponse<ModelApiResponse> localVarResp = shipmentGetShipmentLabelCarriersWithHttpInfo(merchantOrderNo, merchantShipmentLabelCarrierRequest);
        return localVarResp.getData();
    }

    /**
     * Get carriers for channel provided shipping labels
     * Get the carriers for buying a shipping label from the channel
     * @param merchantOrderNo The merchant&#39;s order reference. (required)
     * @param merchantShipmentLabelCarrierRequest The parcel information (optional)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModelApiResponse> shipmentGetShipmentLabelCarriersWithHttpInfo(String merchantOrderNo, MerchantShipmentLabelCarrierRequest merchantShipmentLabelCarrierRequest) throws ApiException {
        okhttp3.Call localVarCall = shipmentGetShipmentLabelCarriersValidateBeforeCall(merchantOrderNo, merchantShipmentLabelCarrierRequest, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get carriers for channel provided shipping labels (asynchronously)
     * Get the carriers for buying a shipping label from the channel
     * @param merchantOrderNo The merchant&#39;s order reference. (required)
     * @param merchantShipmentLabelCarrierRequest The parcel information (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentGetShipmentLabelCarriersAsync(String merchantOrderNo, MerchantShipmentLabelCarrierRequest merchantShipmentLabelCarrierRequest, final ApiCallback<ModelApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = shipmentGetShipmentLabelCarriersValidateBeforeCall(merchantOrderNo, merchantShipmentLabelCarrierRequest, _callback);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for shipmentShippingLabel
     * @param merchantShipmentNo The unique shipment reference as used by the merchant. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> shippingLabel </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentShippingLabelCall(String merchantShipmentNo, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/orders/{merchantShipmentNo}/shippinglabel"
            .replaceAll("\\{" + "merchantShipmentNo" + "\\}", localVarApiClient.escapeString(merchantShipmentNo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.shippingLabel", "application/json"
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
    private okhttp3.Call shipmentShippingLabelValidateBeforeCall(String merchantShipmentNo, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'merchantShipmentNo' is set
        if (merchantShipmentNo == null) {
            throw new ApiException("Missing the required parameter 'merchantShipmentNo' when calling shipmentShippingLabel(Async)");
        }
        

        okhttp3.Call localVarCall = shipmentShippingLabelCall(merchantShipmentNo, _callback);
        return localVarCall;

    }

    /**
     * Download shipping label.
     * Downloads the shipping label for the shipment
     * @param merchantShipmentNo The unique shipment reference as used by the merchant. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> shippingLabel </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public File shipmentShippingLabel(String merchantShipmentNo) throws ApiException {
        ApiResponse<File> localVarResp = shipmentShippingLabelWithHttpInfo(merchantShipmentNo);
        return localVarResp.getData();
    }

    /**
     * Download shipping label.
     * Downloads the shipping label for the shipment
     * @param merchantShipmentNo The unique shipment reference as used by the merchant. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> shippingLabel </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> shipmentShippingLabelWithHttpInfo(String merchantShipmentNo) throws ApiException {
        okhttp3.Call localVarCall = shipmentShippingLabelValidateBeforeCall(merchantShipmentNo, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Download shipping label. (asynchronously)
     * Downloads the shipping label for the shipment
     * @param merchantShipmentNo The unique shipment reference as used by the merchant. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> shippingLabel </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentShippingLabelAsync(String merchantShipmentNo, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = shipmentShippingLabelValidateBeforeCall(merchantShipmentNo, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for shipmentUpdate
     * @param merchantShipmentNo The merchant&#39;s shipment reference. (required)
     * @param merchantShipmentTrackingRequest The updated tracking information. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentUpdateCall(String merchantShipmentNo, MerchantShipmentTrackingRequest merchantShipmentTrackingRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = merchantShipmentTrackingRequest;

        // create path and map variables
        String localVarPath = "/v2/shipments/{merchantShipmentNo}"
            .replaceAll("\\{" + "merchantShipmentNo" + "\\}", localVarApiClient.escapeString(merchantShipmentNo.toString()));

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
            "application/json-patch+json", "application/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call shipmentUpdateValidateBeforeCall(String merchantShipmentNo, MerchantShipmentTrackingRequest merchantShipmentTrackingRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'merchantShipmentNo' is set
        if (merchantShipmentNo == null) {
            throw new ApiException("Missing the required parameter 'merchantShipmentNo' when calling shipmentUpdate(Async)");
        }
        

        okhttp3.Call localVarCall = shipmentUpdateCall(merchantShipmentNo, merchantShipmentTrackingRequest, _callback);
        return localVarCall;

    }

    /**
     * Update Shipment.
     * Update an existing shipment with tracking information.
     * @param merchantShipmentNo The merchant&#39;s shipment reference. (required)
     * @param merchantShipmentTrackingRequest The updated tracking information. (optional)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ModelApiResponse shipmentUpdate(String merchantShipmentNo, MerchantShipmentTrackingRequest merchantShipmentTrackingRequest) throws ApiException {
        ApiResponse<ModelApiResponse> localVarResp = shipmentUpdateWithHttpInfo(merchantShipmentNo, merchantShipmentTrackingRequest);
        return localVarResp.getData();
    }

    /**
     * Update Shipment.
     * Update an existing shipment with tracking information.
     * @param merchantShipmentNo The merchant&#39;s shipment reference. (required)
     * @param merchantShipmentTrackingRequest The updated tracking information. (optional)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModelApiResponse> shipmentUpdateWithHttpInfo(String merchantShipmentNo, MerchantShipmentTrackingRequest merchantShipmentTrackingRequest) throws ApiException {
        okhttp3.Call localVarCall = shipmentUpdateValidateBeforeCall(merchantShipmentNo, merchantShipmentTrackingRequest, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Shipment. (asynchronously)
     * Update an existing shipment with tracking information.
     * @param merchantShipmentNo The merchant&#39;s shipment reference. (required)
     * @param merchantShipmentTrackingRequest The updated tracking information. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentUpdateAsync(String merchantShipmentNo, MerchantShipmentTrackingRequest merchantShipmentTrackingRequest, final ApiCallback<ModelApiResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = shipmentUpdateValidateBeforeCall(merchantShipmentNo, merchantShipmentTrackingRequest, _callback);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
