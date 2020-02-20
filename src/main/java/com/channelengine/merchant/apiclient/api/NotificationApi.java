/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationApi {
    private ApiClient apiClient;

    public NotificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotificationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for notificationIndex
     * @param fromDate Filter on the notification date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the notification date, until this date. This date is exclusive. (optional)
     * @param types Notification type(s) to filter on (optional)
     * @param merchantOrderNos Filter on unique order reference used by the merchant (optional)
     * @param channelOrderNos Filter on unique order reference used by the channel (optional)
     * @param merchantReturnNos Filter on unique return reference used by the merchant (optional)
     * @param channelReturnNos Filter on unique return reference used by the channel (optional)
     * @param merchantShipmentNos Filter on unique shipment reference used by the merchant (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call notificationIndexCall(OffsetDateTime fromDate, OffsetDateTime toDate, List<String> types, List<String> merchantOrderNos, List<String> channelOrderNos, List<String> merchantReturnNos, List<String> channelReturnNos, List<String> merchantShipmentNos, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/notifications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fromDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromDate", fromDate));
        if (toDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toDate", toDate));
        if (types != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "types", types));
        if (merchantOrderNos != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "merchantOrderNos", merchantOrderNos));
        if (channelOrderNos != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "channelOrderNos", channelOrderNos));
        if (merchantReturnNos != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "merchantReturnNos", merchantReturnNos));
        if (channelReturnNos != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "channelReturnNos", channelReturnNos));
        if (merchantShipmentNos != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "merchantShipmentNos", merchantShipmentNos));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call notificationIndexValidateBeforeCall(OffsetDateTime fromDate, OffsetDateTime toDate, List<String> types, List<String> merchantOrderNos, List<String> channelOrderNos, List<String> merchantReturnNos, List<String> channelReturnNos, List<String> merchantShipmentNos, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = notificationIndexCall(fromDate, toDate, types, merchantOrderNos, channelOrderNos, merchantReturnNos, channelReturnNos, merchantShipmentNos, page, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Notifications
     * Gets all notifications based on filter
     * @param fromDate Filter on the notification date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the notification date, until this date. This date is exclusive. (optional)
     * @param types Notification type(s) to filter on (optional)
     * @param merchantOrderNos Filter on unique order reference used by the merchant (optional)
     * @param channelOrderNos Filter on unique order reference used by the channel (optional)
     * @param merchantReturnNos Filter on unique return reference used by the merchant (optional)
     * @param channelReturnNos Filter on unique return reference used by the channel (optional)
     * @param merchantShipmentNos Filter on unique shipment reference used by the merchant (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return CollectionOfMerchantNotificationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionOfMerchantNotificationResponse notificationIndex(OffsetDateTime fromDate, OffsetDateTime toDate, List<String> types, List<String> merchantOrderNos, List<String> channelOrderNos, List<String> merchantReturnNos, List<String> channelReturnNos, List<String> merchantShipmentNos, Integer page) throws ApiException {
        ApiResponse<CollectionOfMerchantNotificationResponse> resp = notificationIndexWithHttpInfo(fromDate, toDate, types, merchantOrderNos, channelOrderNos, merchantReturnNos, channelReturnNos, merchantShipmentNos, page);
        return resp.getData();
    }

    /**
     * Get Notifications
     * Gets all notifications based on filter
     * @param fromDate Filter on the notification date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the notification date, until this date. This date is exclusive. (optional)
     * @param types Notification type(s) to filter on (optional)
     * @param merchantOrderNos Filter on unique order reference used by the merchant (optional)
     * @param channelOrderNos Filter on unique order reference used by the channel (optional)
     * @param merchantReturnNos Filter on unique return reference used by the merchant (optional)
     * @param channelReturnNos Filter on unique return reference used by the channel (optional)
     * @param merchantShipmentNos Filter on unique shipment reference used by the merchant (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return ApiResponse&lt;CollectionOfMerchantNotificationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CollectionOfMerchantNotificationResponse> notificationIndexWithHttpInfo(OffsetDateTime fromDate, OffsetDateTime toDate, List<String> types, List<String> merchantOrderNos, List<String> channelOrderNos, List<String> merchantReturnNos, List<String> channelReturnNos, List<String> merchantShipmentNos, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = notificationIndexValidateBeforeCall(fromDate, toDate, types, merchantOrderNos, channelOrderNos, merchantReturnNos, channelReturnNos, merchantShipmentNos, page, null, null);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantNotificationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Notifications (asynchronously)
     * Gets all notifications based on filter
     * @param fromDate Filter on the notification date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the notification date, until this date. This date is exclusive. (optional)
     * @param types Notification type(s) to filter on (optional)
     * @param merchantOrderNos Filter on unique order reference used by the merchant (optional)
     * @param channelOrderNos Filter on unique order reference used by the channel (optional)
     * @param merchantReturnNos Filter on unique return reference used by the merchant (optional)
     * @param channelReturnNos Filter on unique return reference used by the channel (optional)
     * @param merchantShipmentNos Filter on unique shipment reference used by the merchant (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call notificationIndexAsync(OffsetDateTime fromDate, OffsetDateTime toDate, List<String> types, List<String> merchantOrderNos, List<String> channelOrderNos, List<String> merchantReturnNos, List<String> channelReturnNos, List<String> merchantShipmentNos, Integer page, final ApiCallback<CollectionOfMerchantNotificationResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = notificationIndexValidateBeforeCall(fromDate, toDate, types, merchantOrderNos, channelOrderNos, merchantReturnNos, channelReturnNos, merchantShipmentNos, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantNotificationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}