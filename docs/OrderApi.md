# OrderApi

All URIs are relative to *http://dev.channelengine.local/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderAcknowledge**](OrderApi.md#orderAcknowledge) | **POST** /v2/orders/acknowledge | Merchant: Acknowledge Order
[**orderCreate**](OrderApi.md#orderCreate) | **POST** /v2/orders | Channel: Create Order
[**orderGetNew**](OrderApi.md#orderGetNew) | **GET** /v2/orders/new | Merchant: Get New Orders
[**orderInvoice**](OrderApi.md#orderInvoice) | **GET** /v2/orders/{merchantOrderNo}/invoice | Merchant: Download Invoice
[**orderPackingSlip**](OrderApi.md#orderPackingSlip) | **GET** /v2/orders/{merchantOrderNo}/packingslip | Merchant: Download Packing Slip


<a name="orderAcknowledge"></a>
# **orderAcknowledge**
> ModelApiResponse orderAcknowledge(model)

Merchant: Acknowledge Order

For merchants.    Acknowledge an order. By acknowledging the order the merchant can confirm that  the order has been imported. When acknowledging an order the merchant has to supply  references that uniquely identify the order and the order lines. These references  will be used in the other API calls.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
OrderAcknowledgement model = new OrderAcknowledgement(); // OrderAcknowledgement | Relations between the id's returned by ChannelEngine and the references which the merchant uses
try {
    ModelApiResponse result = apiInstance.orderAcknowledge(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderAcknowledge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**OrderAcknowledgement**](OrderAcknowledgement.md)| Relations between the id&#39;s returned by ChannelEngine and the references which the merchant uses |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="orderCreate"></a>
# **orderCreate**
> ModelApiResponse orderCreate(model)

Channel: Create Order

For channels.    Create a new order in ChannelEngine.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
ChannelOrderRequest model = new ChannelOrderRequest(); // ChannelOrderRequest | 
try {
    ModelApiResponse result = apiInstance.orderCreate(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**ChannelOrderRequest**](ChannelOrderRequest.md)|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="orderGetNew"></a>
# **orderGetNew**
> CollectionOfMerchantOrderResponse orderGetNew()

Merchant: Get New Orders

For merchants.                Fetch newly placed orders (order with status NEW).

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
try {
    CollectionOfMerchantOrderResponse result = apiInstance.orderGetNew();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetNew");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CollectionOfMerchantOrderResponse**](CollectionOfMerchantOrderResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="orderInvoice"></a>
# **orderInvoice**
> File orderInvoice(merchantOrderNo, useCustomerCulture)

Merchant: Download Invoice

For merchants.    Generates the ChannelEngine VAT invoice for this order in PDF

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String merchantOrderNo = "merchantOrderNo_example"; // String | The unique order reference as used by the merchant
Boolean useCustomerCulture = true; // Boolean | Generate the invoice in the billing address' country's language
try {
    File result = apiInstance.orderInvoice(merchantOrderNo, useCustomerCulture);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantOrderNo** | **String**| The unique order reference as used by the merchant |
 **useCustomerCulture** | **Boolean**| Generate the invoice in the billing address&#39; country&#39;s language | [optional]

### Return type

[**File**](File.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="orderPackingSlip"></a>
# **orderPackingSlip**
> File orderPackingSlip(merchantOrderNo, useCustomerCulture)

Merchant: Download Packing Slip

For merchants.    Generates the ChannelEngine packing slip for this order in PDF

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String merchantOrderNo = "merchantOrderNo_example"; // String | The unique order reference as used by the merchant
Boolean useCustomerCulture = true; // Boolean | Generate the invoice in the billing address' country's language
try {
    File result = apiInstance.orderPackingSlip(merchantOrderNo, useCustomerCulture);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderPackingSlip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantOrderNo** | **String**| The unique order reference as used by the merchant |
 **useCustomerCulture** | **Boolean**| Generate the invoice in the billing address&#39; country&#39;s language | [optional]

### Return type

[**File**](File.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

