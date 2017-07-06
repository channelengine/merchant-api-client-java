# ReturnApi

All URIs are relative to *http://dev.channelengine.local/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**returnDeclareForChannel**](ReturnApi.md#returnDeclareForChannel) | **POST** /v2/returns/channel | Channel: Create Return
[**returnDeclareForMerchant**](ReturnApi.md#returnDeclareForMerchant) | **POST** /v2/returns/merchant | Merchant: Create Return
[**returnGetDeclaredByChannel**](ReturnApi.md#returnGetDeclaredByChannel) | **GET** /v2/returns/merchant | Merchant: Get Returns
[**returnGetDeclaredByMerchant**](ReturnApi.md#returnGetDeclaredByMerchant) | **GET** /v2/returns/channel | Channel: Get Returns


<a name="returnDeclareForChannel"></a>
# **returnDeclareForChannel**
> ModelApiResponse returnDeclareForChannel(model)

Channel: Create Return

For channels.                Mark (part of) an order as returned by the customer.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ReturnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReturnApi apiInstance = new ReturnApi();
ChannelReturnRequest model = new ChannelReturnRequest(); // ChannelReturnRequest | 
try {
    ModelApiResponse result = apiInstance.returnDeclareForChannel(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnApi#returnDeclareForChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**ChannelReturnRequest**](ChannelReturnRequest.md)|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="returnDeclareForMerchant"></a>
# **returnDeclareForMerchant**
> ModelApiResponse returnDeclareForMerchant(model)

Merchant: Create Return

For merchants.    Mark (part of) an order as returned by the customer.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ReturnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReturnApi apiInstance = new ReturnApi();
MerchantReturnRequest model = new MerchantReturnRequest(); // MerchantReturnRequest | 
try {
    ModelApiResponse result = apiInstance.returnDeclareForMerchant(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnApi#returnDeclareForMerchant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**MerchantReturnRequest**](MerchantReturnRequest.md)|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="returnGetDeclaredByChannel"></a>
# **returnGetDeclaredByChannel**
> CollectionOfMerchantReturnResponse returnGetDeclaredByChannel(createdSince)

Merchant: Get Returns

For merchants.    Get all returns created by the channel. This call is supposed  to be used by merchants. Channels should use the &#39;GET /v2/returns/channel&#39;  call.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ReturnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReturnApi apiInstance = new ReturnApi();
DateTime createdSince = new DateTime(); // DateTime | 
try {
    CollectionOfMerchantReturnResponse result = apiInstance.returnGetDeclaredByChannel(createdSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnApi#returnGetDeclaredByChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdSince** | **DateTime**|  |

### Return type

[**CollectionOfMerchantReturnResponse**](CollectionOfMerchantReturnResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="returnGetDeclaredByMerchant"></a>
# **returnGetDeclaredByMerchant**
> CollectionOfChannelReturnResponse returnGetDeclaredByMerchant(createdSince)

Channel: Get Returns

For channels.                Get all returns created by the merchant. This call is supposed  to be used by channels. Merchants should use the &#39;GET /v2/returns/merchant&#39;  call.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ReturnApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ReturnApi apiInstance = new ReturnApi();
DateTime createdSince = new DateTime(); // DateTime | 
try {
    CollectionOfChannelReturnResponse result = apiInstance.returnGetDeclaredByMerchant(createdSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReturnApi#returnGetDeclaredByMerchant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdSince** | **DateTime**|  |

### Return type

[**CollectionOfChannelReturnResponse**](CollectionOfChannelReturnResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

