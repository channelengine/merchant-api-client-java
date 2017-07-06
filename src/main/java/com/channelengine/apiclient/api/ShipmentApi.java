/*
 * ChannelEngine API V2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.apiclient.api;

import com.channelengine.apiclient.ApiCallback;
import com.channelengine.apiclient.ApiClient;
import com.channelengine.apiclient.ApiException;
import com.channelengine.apiclient.ApiResponse;
import com.channelengine.apiclient.Configuration;
import com.channelengine.apiclient.Pair;
import com.channelengine.apiclient.ProgressRequestBody;
import com.channelengine.apiclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.channelengine.apiclient.model.CollectionOfChannelShipmentResponse;
import org.joda.time.DateTime;
import com.channelengine.apiclient.model.MerchantShipmentRequest;
import com.channelengine.apiclient.model.MerchantShipmentTrackingRequest;
import com.channelengine.apiclient.model.ModelApiResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipmentApi {
    private ApiClient apiClient;

    public ShipmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShipmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for shipmentCreate */
    private com.squareup.okhttp.Call shipmentCreateCall(MerchantShipmentRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;
        
        // create path and map variables
        String localVarPath = "/v2/shipments".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/x-www-form-urlencoded"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call shipmentCreateValidateBeforeCall(MerchantShipmentRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling shipmentCreate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = shipmentCreateCall(model, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Merchant: Create Shipment
     * For merchants.    Mark (part of) an order as shipped.
     * @param model  (required)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelApiResponse shipmentCreate(MerchantShipmentRequest model) throws ApiException {
        ApiResponse<ModelApiResponse> resp = shipmentCreateWithHttpInfo(model);
        return resp.getData();
    }

    /**
     * Merchant: Create Shipment
     * For merchants.    Mark (part of) an order as shipped.
     * @param model  (required)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelApiResponse> shipmentCreateWithHttpInfo(MerchantShipmentRequest model) throws ApiException {
        com.squareup.okhttp.Call call = shipmentCreateValidateBeforeCall(model, null, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Merchant: Create Shipment (asynchronously)
     * For merchants.    Mark (part of) an order as shipped.
     * @param model  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shipmentCreateAsync(MerchantShipmentRequest model, final ApiCallback<ModelApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shipmentCreateValidateBeforeCall(model, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for shipmentIndex */
    private com.squareup.okhttp.Call shipmentIndexCall(DateTime createdSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/shipments".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (createdSince != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "createdSince", createdSince));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call shipmentIndexValidateBeforeCall(DateTime createdSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createdSince' is set
        if (createdSince == null) {
            throw new ApiException("Missing the required parameter 'createdSince' when calling shipmentIndex(Async)");
        }
        
        
        com.squareup.okhttp.Call call = shipmentIndexCall(createdSince, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Channel: Get Shipments
     * For channels.    Gets all shipments created since the supplied date.
     * @param createdSince  (required)
     * @return CollectionOfChannelShipmentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionOfChannelShipmentResponse shipmentIndex(DateTime createdSince) throws ApiException {
        ApiResponse<CollectionOfChannelShipmentResponse> resp = shipmentIndexWithHttpInfo(createdSince);
        return resp.getData();
    }

    /**
     * Channel: Get Shipments
     * For channels.    Gets all shipments created since the supplied date.
     * @param createdSince  (required)
     * @return ApiResponse&lt;CollectionOfChannelShipmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CollectionOfChannelShipmentResponse> shipmentIndexWithHttpInfo(DateTime createdSince) throws ApiException {
        com.squareup.okhttp.Call call = shipmentIndexValidateBeforeCall(createdSince, null, null);
        Type localVarReturnType = new TypeToken<CollectionOfChannelShipmentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Channel: Get Shipments (asynchronously)
     * For channels.    Gets all shipments created since the supplied date.
     * @param createdSince  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shipmentIndexAsync(DateTime createdSince, final ApiCallback<CollectionOfChannelShipmentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shipmentIndexValidateBeforeCall(createdSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CollectionOfChannelShipmentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for shipmentUpdate */
    private com.squareup.okhttp.Call shipmentUpdateCall(String merchantShipmentNo, MerchantShipmentTrackingRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;
        
        // create path and map variables
        String localVarPath = "/v2/shipments/{merchantShipmentNo}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "merchantShipmentNo" + "\\}", apiClient.escapeString(merchantShipmentNo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call shipmentUpdateValidateBeforeCall(String merchantShipmentNo, MerchantShipmentTrackingRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'merchantShipmentNo' is set
        if (merchantShipmentNo == null) {
            throw new ApiException("Missing the required parameter 'merchantShipmentNo' when calling shipmentUpdate(Async)");
        }
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling shipmentUpdate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = shipmentUpdateCall(merchantShipmentNo, model, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Merchant: Update Shipment
     * For merchants.    Update an existing shipment with tracking information
     * @param merchantShipmentNo The merchant&#39;s shipment reference (required)
     * @param model The updated tracking information (required)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelApiResponse shipmentUpdate(String merchantShipmentNo, MerchantShipmentTrackingRequest model) throws ApiException {
        ApiResponse<ModelApiResponse> resp = shipmentUpdateWithHttpInfo(merchantShipmentNo, model);
        return resp.getData();
    }

    /**
     * Merchant: Update Shipment
     * For merchants.    Update an existing shipment with tracking information
     * @param merchantShipmentNo The merchant&#39;s shipment reference (required)
     * @param model The updated tracking information (required)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelApiResponse> shipmentUpdateWithHttpInfo(String merchantShipmentNo, MerchantShipmentTrackingRequest model) throws ApiException {
        com.squareup.okhttp.Call call = shipmentUpdateValidateBeforeCall(merchantShipmentNo, model, null, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Merchant: Update Shipment (asynchronously)
     * For merchants.    Update an existing shipment with tracking information
     * @param merchantShipmentNo The merchant&#39;s shipment reference (required)
     * @param model The updated tracking information (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shipmentUpdateAsync(String merchantShipmentNo, MerchantShipmentTrackingRequest model, final ApiCallback<ModelApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shipmentUpdateValidateBeforeCall(merchantShipmentNo, model, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
