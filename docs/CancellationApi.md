# CancellationApi

All URIs are relative to *http://dev.channelengine.local/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancellationCreate**](CancellationApi.md#cancellationCreate) | **POST** /v2/cancellations | Merchant: Create Cancellation
[**cancellationIndex**](CancellationApi.md#cancellationIndex) | **GET** /v2/cancellations | Channel: Get Cancellations


<a name="cancellationCreate"></a>
# **cancellationCreate**
> ModelApiResponse cancellationCreate(cancellation)

Merchant: Create Cancellation

For merchants.    Mark (part of) an order as cancelled.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.CancellationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

CancellationApi apiInstance = new CancellationApi();
MerchantCancellationRequest cancellation = new MerchantCancellationRequest(); // MerchantCancellationRequest | 
try {
    ModelApiResponse result = apiInstance.cancellationCreate(cancellation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancellationApi#cancellationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancellation** | [**MerchantCancellationRequest**](MerchantCancellationRequest.md)|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="cancellationIndex"></a>
# **cancellationIndex**
> CollectionOfChannelCancellationResponse cancellationIndex(createdSince)

Channel: Get Cancellations

For channels.    Gets all cancellations created since the supplied date.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.CancellationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

CancellationApi apiInstance = new CancellationApi();
DateTime createdSince = new DateTime(); // DateTime | 
try {
    CollectionOfChannelCancellationResponse result = apiInstance.cancellationIndex(createdSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancellationApi#cancellationIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdSince** | **DateTime**|  |

### Return type

[**CollectionOfChannelCancellationResponse**](CollectionOfChannelCancellationResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

