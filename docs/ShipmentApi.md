# ShipmentApi

All URIs are relative to *http://dev.channelengine.local/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**shipmentCreate**](ShipmentApi.md#shipmentCreate) | **POST** /v2/shipments | Merchant: Create Shipment
[**shipmentIndex**](ShipmentApi.md#shipmentIndex) | **GET** /v2/shipments | Channel: Get Shipments
[**shipmentUpdate**](ShipmentApi.md#shipmentUpdate) | **PUT** /v2/shipments/{merchantShipmentNo} | Merchant: Update Shipment


<a name="shipmentCreate"></a>
# **shipmentCreate**
> ModelApiResponse shipmentCreate(model)

Merchant: Create Shipment

For merchants.    Mark (part of) an order as shipped.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
MerchantShipmentRequest model = new MerchantShipmentRequest(); // MerchantShipmentRequest | 
try {
    ModelApiResponse result = apiInstance.shipmentCreate(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#shipmentCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**MerchantShipmentRequest**](MerchantShipmentRequest.md)|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="shipmentIndex"></a>
# **shipmentIndex**
> CollectionOfChannelShipmentResponse shipmentIndex(createdSince)

Channel: Get Shipments

For channels.    Gets all shipments created since the supplied date.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
DateTime createdSince = new DateTime(); // DateTime | 
try {
    CollectionOfChannelShipmentResponse result = apiInstance.shipmentIndex(createdSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#shipmentIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdSince** | **DateTime**|  |

### Return type

[**CollectionOfChannelShipmentResponse**](CollectionOfChannelShipmentResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="shipmentUpdate"></a>
# **shipmentUpdate**
> ModelApiResponse shipmentUpdate(merchantShipmentNo, model)

Merchant: Update Shipment

For merchants.    Update an existing shipment with tracking information

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ShipmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ShipmentApi apiInstance = new ShipmentApi();
String merchantShipmentNo = "merchantShipmentNo_example"; // String | The merchant's shipment reference
MerchantShipmentTrackingRequest model = new MerchantShipmentTrackingRequest(); // MerchantShipmentTrackingRequest | The updated tracking information
try {
    ModelApiResponse result = apiInstance.shipmentUpdate(merchantShipmentNo, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#shipmentUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantShipmentNo** | **String**| The merchant&#39;s shipment reference |
 **model** | [**MerchantShipmentTrackingRequest**](MerchantShipmentTrackingRequest.md)| The updated tracking information |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

