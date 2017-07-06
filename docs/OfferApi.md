# OfferApi

All URIs are relative to *http://dev.channelengine.local/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerStockPriceUpdate**](OfferApi.md#offerStockPriceUpdate) | **PUT** /v2/offer | Update stock or price.


<a name="offerStockPriceUpdate"></a>
# **offerStockPriceUpdate**
> SingleOfCollectionsDictionary2Generic offerStockPriceUpdate(updates)

Update stock or price.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.OfferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

OfferApi apiInstance = new OfferApi();
List<MerchantStockPriceUpdateRequest> updates = Arrays.asList(new MerchantStockPriceUpdateRequest()); // List<MerchantStockPriceUpdateRequest> | References to the products that should be updated, and the new values  for the stock or price fields. It is possible to supply only one of the two fields  or both.
try {
    SingleOfCollectionsDictionary2Generic result = apiInstance.offerStockPriceUpdate(updates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferApi#offerStockPriceUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updates** | [**List&lt;MerchantStockPriceUpdateRequest&gt;**](MerchantStockPriceUpdateRequest.md)| References to the products that should be updated, and the new values  for the stock or price fields. It is possible to supply only one of the two fields  or both. |

### Return type

[**SingleOfCollectionsDictionary2Generic**](SingleOfCollectionsDictionary2Generic.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

