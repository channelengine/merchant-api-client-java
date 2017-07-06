/*
 * ChannelEngine API V2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.2.0
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


import com.channelengine.apiclient.model.ChannelOrderRequest;
import com.channelengine.apiclient.model.CollectionOfMerchantOrderResponse;
import java.io.File;
import com.channelengine.apiclient.model.ModelApiResponse;
import com.channelengine.apiclient.model.OrderAcknowledgement;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderApi {
    private ApiClient apiClient;

    public OrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for orderAcknowledge */
    private com.squareup.okhttp.Call orderAcknowledgeCall(OrderAcknowledgement model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;
        
        // create path and map variables
        String localVarPath = "/v2/orders/acknowledge".replaceAll("\\{format\\}","json");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call orderAcknowledgeValidateBeforeCall(OrderAcknowledgement model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling orderAcknowledge(Async)");
        }
        
        
        com.squareup.okhttp.Call call = orderAcknowledgeCall(model, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Merchant: Acknowledge Order
     * For merchants.    Acknowledge an order. By acknowledging the order the merchant can confirm that  the order has been imported. When acknowledging an order the merchant has to supply  references that uniquely identify the order and the order lines. These references  will be used in the other API calls.
     * @param model Relations between the id&#39;s returned by ChannelEngine and the references which the merchant uses (required)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelApiResponse orderAcknowledge(OrderAcknowledgement model) throws ApiException {
        ApiResponse<ModelApiResponse> resp = orderAcknowledgeWithHttpInfo(model);
        return resp.getData();
    }

    /**
     * Merchant: Acknowledge Order
     * For merchants.    Acknowledge an order. By acknowledging the order the merchant can confirm that  the order has been imported. When acknowledging an order the merchant has to supply  references that uniquely identify the order and the order lines. These references  will be used in the other API calls.
     * @param model Relations between the id&#39;s returned by ChannelEngine and the references which the merchant uses (required)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelApiResponse> orderAcknowledgeWithHttpInfo(OrderAcknowledgement model) throws ApiException {
        com.squareup.okhttp.Call call = orderAcknowledgeValidateBeforeCall(model, null, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Merchant: Acknowledge Order (asynchronously)
     * For merchants.    Acknowledge an order. By acknowledging the order the merchant can confirm that  the order has been imported. When acknowledging an order the merchant has to supply  references that uniquely identify the order and the order lines. These references  will be used in the other API calls.
     * @param model Relations between the id&#39;s returned by ChannelEngine and the references which the merchant uses (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orderAcknowledgeAsync(OrderAcknowledgement model, final ApiCallback<ModelApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = orderAcknowledgeValidateBeforeCall(model, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for orderCreate */
    private com.squareup.okhttp.Call orderCreateCall(ChannelOrderRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;
        
        // create path and map variables
        String localVarPath = "/v2/orders".replaceAll("\\{format\\}","json");

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
    private com.squareup.okhttp.Call orderCreateValidateBeforeCall(ChannelOrderRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling orderCreate(Async)");
        }
        
        
        com.squareup.okhttp.Call call = orderCreateCall(model, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Channel: Create Order
     * For channels.    Create a new order in ChannelEngine.
     * @param model  (required)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelApiResponse orderCreate(ChannelOrderRequest model) throws ApiException {
        ApiResponse<ModelApiResponse> resp = orderCreateWithHttpInfo(model);
        return resp.getData();
    }

    /**
     * Channel: Create Order
     * For channels.    Create a new order in ChannelEngine.
     * @param model  (required)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelApiResponse> orderCreateWithHttpInfo(ChannelOrderRequest model) throws ApiException {
        com.squareup.okhttp.Call call = orderCreateValidateBeforeCall(model, null, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Channel: Create Order (asynchronously)
     * For channels.    Create a new order in ChannelEngine.
     * @param model  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orderCreateAsync(ChannelOrderRequest model, final ApiCallback<ModelApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = orderCreateValidateBeforeCall(model, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for orderGetNew */
    private com.squareup.okhttp.Call orderGetNewCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/orders/new".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call orderGetNewValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = orderGetNewCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Merchant: Get New Orders
     * For merchants.                Fetch newly placed orders (order with status NEW).
     * @return CollectionOfMerchantOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionOfMerchantOrderResponse orderGetNew() throws ApiException {
        ApiResponse<CollectionOfMerchantOrderResponse> resp = orderGetNewWithHttpInfo();
        return resp.getData();
    }

    /**
     * Merchant: Get New Orders
     * For merchants.                Fetch newly placed orders (order with status NEW).
     * @return ApiResponse&lt;CollectionOfMerchantOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CollectionOfMerchantOrderResponse> orderGetNewWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = orderGetNewValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantOrderResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Merchant: Get New Orders (asynchronously)
     * For merchants.                Fetch newly placed orders (order with status NEW).
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orderGetNewAsync(final ApiCallback<CollectionOfMerchantOrderResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = orderGetNewValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CollectionOfMerchantOrderResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for orderInvoice */
    private com.squareup.okhttp.Call orderInvoiceCall(String merchantOrderNo, Boolean useCustomerCulture, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/orders/{merchantOrderNo}/invoice".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "merchantOrderNo" + "\\}", apiClient.escapeString(merchantOrderNo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (useCustomerCulture != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "useCustomerCulture", useCustomerCulture));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/pdf"
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
    private com.squareup.okhttp.Call orderInvoiceValidateBeforeCall(String merchantOrderNo, Boolean useCustomerCulture, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'merchantOrderNo' is set
        if (merchantOrderNo == null) {
            throw new ApiException("Missing the required parameter 'merchantOrderNo' when calling orderInvoice(Async)");
        }
        
        
        com.squareup.okhttp.Call call = orderInvoiceCall(merchantOrderNo, useCustomerCulture, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Merchant: Download Invoice
     * For merchants.    Generates the ChannelEngine VAT invoice for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File orderInvoice(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        ApiResponse<File> resp = orderInvoiceWithHttpInfo(merchantOrderNo, useCustomerCulture);
        return resp.getData();
    }

    /**
     * Merchant: Download Invoice
     * For merchants.    Generates the ChannelEngine VAT invoice for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> orderInvoiceWithHttpInfo(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        com.squareup.okhttp.Call call = orderInvoiceValidateBeforeCall(merchantOrderNo, useCustomerCulture, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Merchant: Download Invoice (asynchronously)
     * For merchants.    Generates the ChannelEngine VAT invoice for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orderInvoiceAsync(String merchantOrderNo, Boolean useCustomerCulture, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = orderInvoiceValidateBeforeCall(merchantOrderNo, useCustomerCulture, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for orderPackingSlip */
    private com.squareup.okhttp.Call orderPackingSlipCall(String merchantOrderNo, Boolean useCustomerCulture, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/orders/{merchantOrderNo}/packingslip".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "merchantOrderNo" + "\\}", apiClient.escapeString(merchantOrderNo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (useCustomerCulture != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "useCustomerCulture", useCustomerCulture));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/pdf"
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
    private com.squareup.okhttp.Call orderPackingSlipValidateBeforeCall(String merchantOrderNo, Boolean useCustomerCulture, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'merchantOrderNo' is set
        if (merchantOrderNo == null) {
            throw new ApiException("Missing the required parameter 'merchantOrderNo' when calling orderPackingSlip(Async)");
        }
        
        
        com.squareup.okhttp.Call call = orderPackingSlipCall(merchantOrderNo, useCustomerCulture, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Merchant: Download Packing Slip
     * For merchants.    Generates the ChannelEngine packing slip for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File orderPackingSlip(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        ApiResponse<File> resp = orderPackingSlipWithHttpInfo(merchantOrderNo, useCustomerCulture);
        return resp.getData();
    }

    /**
     * Merchant: Download Packing Slip
     * For merchants.    Generates the ChannelEngine packing slip for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> orderPackingSlipWithHttpInfo(String merchantOrderNo, Boolean useCustomerCulture) throws ApiException {
        com.squareup.okhttp.Call call = orderPackingSlipValidateBeforeCall(merchantOrderNo, useCustomerCulture, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Merchant: Download Packing Slip (asynchronously)
     * For merchants.    Generates the ChannelEngine packing slip for this order in PDF
     * @param merchantOrderNo The unique order reference as used by the merchant (required)
     * @param useCustomerCulture Generate the invoice in the billing address&#39; country&#39;s language (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call orderPackingSlipAsync(String merchantOrderNo, Boolean useCustomerCulture, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = orderPackingSlipValidateBeforeCall(merchantOrderNo, useCustomerCulture, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
