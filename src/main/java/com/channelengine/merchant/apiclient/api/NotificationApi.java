/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.12
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


import com.channelengine.merchant.apiclient.model.CollectionOfMerchantNotificationResponse;
import com.channelengine.merchant.apiclient.model.NotificationType;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationApi {
    private ApiClient localVarApiClient;

    public NotificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotificationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for notificationIndex
     * @param fromDate Filter on the notification date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the notification date, until this date. This date is exclusive. (optional)
     * @param types Notification type(s) to filter on. (optional)
     * @param merchantOrderNos Filter on unique order reference used by the merchant. (optional)
     * @param channelOrderNos Filter on unique order reference used by the channel. (optional)
     * @param merchantReturnNos Filter on unique return reference used by the merchant. (optional)
     * @param channelReturnNos Filter on unique return reference used by the channel. (optional)
     * @param merchantShipmentNos Filter on unique shipment reference used by the merchant. (optional)
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
    public okhttp3.Call notificationIndexCall(OffsetDateTime fromDate, OffsetDateTime toDate, List<NotificationType> types, List<String> merchantOrderNos, List<String> channelOrderNos, List<String> merchantReturnNos, List<String> channelReturnNos, List<String> merchantShipmentNos, Integer page, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/notifications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromDate", fromDate));
        }

        if (toDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toDate", toDate));
        }

        if (types != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "types", types));
        }

        if (merchantOrderNos != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "merchantOrderNos", merchantOrderNos));
        }

        if (channelOrderNos != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "channelOrderNos", channelOrderNos));
        }

        if (merchantReturnNos != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "merchantReturnNos", merchantReturnNos));
        }

        if (channelReturnNos != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "channelReturnNos", channelReturnNos));
        }

        if (merchantShipmentNos != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "merchantShipmentNos", merchantShipmentNos));
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
    private okhttp3.Call notificationIndexValidateBeforeCall(OffsetDateTime fromDate, OffsetDateTime toDate, List<NotificationType> types, List<String> merchantOrderNos, List<String> channelOrderNos, List<String> merchantReturnNos, List<String> channelReturnNos, List<String> merchantShipmentNos, Integer page, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = notificationIndexCall(fromDate, toDate, types, merchantOrderNos, channelOrderNos, merchantReturnNos, channelReturnNos, merchantShipmentNos, page, _callback);
        return localVarCall;

    }

    /**
     * Get Notifications.
     * Gets all notifications based on filter.
     * @param fromDate Filter on the notification date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the notification date, until this date. This date is exclusive. (optional)
     * @param types Notification type(s) to filter on. (optional)
     * @param merchantOrderNos Filter on unique order reference used by the merchant. (optional)
     * @param channelOrderNos Filter on unique order reference used by the channel. (optional)
     * @param merchantReturnNos Filter on unique return reference used by the merchant. (optional)
     * @param channelReturnNos Filter on unique return reference used by the channel. (optional)
     * @param merchantShipmentNos Filter on unique shipment reference used by the merchant. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return CollectionOfMerchantNotificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CollectionOfMerchantNotificationResponse notificationIndex(OffsetDateTime fromDate, OffsetDateTime toDate, List<NotificationType> types, List<String> merchantOrderNos, List<String> channelOrderNos, List<String> merchantReturnNos, List<String> channelReturnNos, List<String> merchantShipmentNos, Integer page) throws ApiException {
        ApiResponse<CollectionOfMerchantNotificationResponse> localVarResp = notificationIndexWithHttpInfo(fromDate, toDate, types, merchantOrderNos, channelOrderNos, merchantReturnNos, channelReturnNos, merchantShipmentNos, page);
        return localVarResp.getData();
    }

    /**
     * Get Notifications.
     * Gets all notifications based on filter.
     * @param fromDate Filter on the notification date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the notification date, until this date. This date is exclusive. (optional)
     * @param types Notification type(s) to filter on. (optional)
     * @param merchantOrderNos Filter on unique order reference used by the merchant. (optional)
     * @param channelOrderNos Filter on unique order reference used by the channel. (optional)
     * @param merchantReturnNos Filter on unique return reference used by the merchant. (optional)
     * @param channelReturnNos Filter on unique return reference used by the channel. (optional)
     * @param merchantShipmentNos Filter on unique shipment reference used by the merchant. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return ApiResponse&lt;CollectionOfMerchantNotificationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CollectionOfMerchantNotificationResponse> notificationIndexWithHttpInfo(OffsetDateTime fromDate, OffsetDateTime toDate, List<NotificationType> types, List<String> merchantOrderNos, List<String> channelOrderNos, List<String> merchantReturnNos, List<String> channelReturnNos, List<String> merchantShipmentNos, Integer page) throws ApiException {
        okhttp3.Call localVarCall = notificationIndexValidateBeforeCall(fromDate, toDate, types, merchantOrderNos, channelOrderNos, merchantReturnNos, channelReturnNos, merchantShipmentNos, page, null);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantNotificationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Notifications. (asynchronously)
     * Gets all notifications based on filter.
     * @param fromDate Filter on the notification date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the notification date, until this date. This date is exclusive. (optional)
     * @param types Notification type(s) to filter on. (optional)
     * @param merchantOrderNos Filter on unique order reference used by the merchant. (optional)
     * @param channelOrderNos Filter on unique order reference used by the channel. (optional)
     * @param merchantReturnNos Filter on unique return reference used by the merchant. (optional)
     * @param channelReturnNos Filter on unique return reference used by the channel. (optional)
     * @param merchantShipmentNos Filter on unique shipment reference used by the merchant. (optional)
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
    public okhttp3.Call notificationIndexAsync(OffsetDateTime fromDate, OffsetDateTime toDate, List<NotificationType> types, List<String> merchantOrderNos, List<String> channelOrderNos, List<String> merchantReturnNos, List<String> channelReturnNos, List<String> merchantShipmentNos, Integer page, final ApiCallback<CollectionOfMerchantNotificationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = notificationIndexValidateBeforeCall(fromDate, toDate, types, merchantOrderNos, channelOrderNos, merchantReturnNos, channelReturnNos, merchantShipmentNos, page, _callback);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantNotificationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
