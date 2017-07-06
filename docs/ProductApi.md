# ProductApi

All URIs are relative to *http://dev.channelengine.local/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productAcknowledgeDataChanges**](ProductApi.md#productAcknowledgeDataChanges) | **POST** /v2/products/data | Channel: Acknowledge Product Data Changes
[**productAcknowledgeOfferChanges**](ProductApi.md#productAcknowledgeOfferChanges) | **POST** /v2/products/offers | Channel: Acknowledge Product Offer Changes
[**productCreate**](ProductApi.md#productCreate) | **POST** /v2/products | Merchant: Create Product
[**productDelete**](ProductApi.md#productDelete) | **DELETE** /v2/products/{merchantProductNo} | Merchant: Delete Product
[**productGetByMerchantProductNo**](ProductApi.md#productGetByMerchantProductNo) | **GET** /v2/products/merchant/{merchantProductNo} | Merchant: Get Product
[**productGetDataChanges**](ProductApi.md#productGetDataChanges) | **GET** /v2/products/data | Channel: Get Product Data Changes
[**productGetOfferChanges**](ProductApi.md#productGetOfferChanges) | **GET** /v2/products/offers | Channel: Get Product Offer Changes


<a name="productAcknowledgeDataChanges"></a>
# **productAcknowledgeDataChanges**
> ModelApiResponse productAcknowledgeDataChanges(changes)

Channel: Acknowledge Product Data Changes

For channels.                This endpoint should be called after a call to GET &#39;v2/products/data&#39;. After a call to  this endpoint ChannelEngine &#39;knows&#39; which products are known to the channel (and the last  time they have been updated) and is therefore able to only return the products  that really have changed since the last call to POST &#39;v2/products/data&#39;.  The supplied ChannelReturnNo will be saved  in our database and is supposed to be unique, the &#39;Updated&#39; and &#39;Removed&#39;  fields consist of ChannelReferences which are sent in a previous call  within the field &#39;Created&#39;.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ProductApi apiInstance = new ProductApi();
ChannelProcessedChangesRequest changes = new ChannelProcessedChangesRequest(); // ChannelProcessedChangesRequest | The merchant references of the products which have been                successfully created, updated or deleted (after a call to 'GetDataChanges')
try {
    ModelApiResponse result = apiInstance.productAcknowledgeDataChanges(changes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productAcknowledgeDataChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changes** | [**ChannelProcessedChangesRequest**](ChannelProcessedChangesRequest.md)| The merchant references of the products which have been                successfully created, updated or deleted (after a call to &#39;GetDataChanges&#39;) |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="productAcknowledgeOfferChanges"></a>
# **productAcknowledgeOfferChanges**
> ModelApiResponse productAcknowledgeOfferChanges(changes)

Channel: Acknowledge Product Offer Changes

For channels.                After a call to GET &#39;v2/products/offers&#39; this endpoint should be called with the  ChannelReturnNo of the products that are successfully updated.  Please see &#39;v2/products/data&#39; and &#39;v2/products/data&#39; for documentation.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ProductApi apiInstance = new ProductApi();
List<String> changes = Arrays.asList(new List<String>()); // List<String> | The channel references of the updated products
try {
    ModelApiResponse result = apiInstance.productAcknowledgeOfferChanges(changes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productAcknowledgeOfferChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changes** | **List&lt;String&gt;**| The channel references of the updated products |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="productCreate"></a>
# **productCreate**
> SingleOfProductCreationResult productCreate(products)

Merchant: Create Product

For merchants.    Create a product. The parent serves as the &#39;base&#39; product of the children.  For example, the children could be different sizes or colors of the parent product.  For channels where every size and color are different products this does not make any difference  (the children will just be sent separately, while ignoring the parent).  But there are channels where the parent and the children need to be sent together, for example  when there is one product with a list of sizes. In this case all the product information is retrieved  from the parent product while the size list is generated from the children.    Note that the parent itself is a &#39;blueprint&#39; of the child products and we do our best to make sure it  does not end up on the marketplaces itself. Only the children can be purchased.    It&#39;s not possible to nest parent and children more than one level (A parent can have many children,  but any child cannot itself also have children).    The supplied MerchantProductNo needs to be unique.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ProductApi apiInstance = new ProductApi();
List<MerchantProductRequest> products = Arrays.asList(new MerchantProductRequest()); // List<MerchantProductRequest> | 
try {
    SingleOfProductCreationResult result = apiInstance.productCreate(products);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **products** | [**List&lt;MerchantProductRequest&gt;**](MerchantProductRequest.md)|  |

### Return type

[**SingleOfProductCreationResult**](SingleOfProductCreationResult.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

<a name="productDelete"></a>
# **productDelete**
> ModelApiResponse productDelete(merchantProductNo)

Merchant: Delete Product

For merchants.    Deactivate a product based on the merchant reference.  Note that we do not really delete a product, as the product  might still be referenced by orders etc. Therefore, the references  used for this product cannot be reused. We do however deactivate the product  which means that it will not be sent to channels.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ProductApi apiInstance = new ProductApi();
String merchantProductNo = "merchantProductNo_example"; // String | 
try {
    ModelApiResponse result = apiInstance.productDelete(merchantProductNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantProductNo** | **String**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="productGetByMerchantProductNo"></a>
# **productGetByMerchantProductNo**
> SingleOfMerchantProductResponse productGetByMerchantProductNo(merchantProductNo)

Merchant: Get Product

For merchants.    Retrieve a product based on the merchant reference.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ProductApi apiInstance = new ProductApi();
String merchantProductNo = "merchantProductNo_example"; // String | 
try {
    SingleOfMerchantProductResponse result = apiInstance.productGetByMerchantProductNo(merchantProductNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetByMerchantProductNo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantProductNo** | **String**|  |

### Return type

[**SingleOfMerchantProductResponse**](SingleOfMerchantProductResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="productGetDataChanges"></a>
# **productGetDataChanges**
> SingleOfChannelProductChangesResponse productGetDataChanges(maxCount)

Channel: Get Product Data Changes

For channels.    Get all products which have changes since the post http call to POST &#39;v2/products/data&#39;.  The response contains the products which should be created, updated or removed from the channel.  After the products have been received and processed successfully &#39;v2/products/data&#39; should  be called with the merchant references of the products which have been processed (see POST &#39;v2/products/data&#39;).   ChannelEnginewill save this information to make sure that the next call to GET &#39;v2/products/data&#39; only returns the  products that really have changes (and therefore should be created, updated or deleted).  A channel willing to integrate with channelengine should therefore only do the following things:      1. Periodically poll &#39;v2/products/data&#39; for changes.      2. If any products are returned, save, update or remove these products.      3. Send the merchant references of the products that have succesfully been processed      in step 2 to POST &#39;v2/products/data&#39;.       These three simple steps will make sure that the products on the channel will be synchronized   with the products on ChannelEngine. ChannelEngine will use the API key to determine the customer  whose products should be returned. Note that child products are only returned if their parent product  has been acknowledged in a previous transaction. This way ChannelEngine knows the value of   &#39;ChannelParentReference&#39;.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ProductApi apiInstance = new ProductApi();
Integer maxCount = 56; // Integer | Optional - limit the amount of products returned for each field              (ToBeCreated, ToBeUpdated, ToBeRemoved) to this number.
try {
    SingleOfChannelProductChangesResponse result = apiInstance.productGetDataChanges(maxCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetDataChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxCount** | **Integer**| Optional - limit the amount of products returned for each field              (ToBeCreated, ToBeUpdated, ToBeRemoved) to this number. | [optional]

### Return type

[**SingleOfChannelProductChangesResponse**](SingleOfChannelProductChangesResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="productGetOfferChanges"></a>
# **productGetOfferChanges**
> CollectionOfChannelOfferResponse productGetOfferChanges()

Channel: Get Product Offer Changes

For channels.                GET &#39;v2/products/offers&#39; and POST &#39;v2/products/offers&#39; closely resemble GET &#39;v2/products/data&#39; and POST &#39;v2/products/data&#39;. See the &#39;v2/products/data&#39;  endpoints for documentation. The difference between both endpoints is that &#39;v2/products/offers&#39; only returns Price and Stock updates and can (and should)  therefore be called more often to keep this information (which might change frequently) up to date.

### Example
```java
// Import classes:
//import com.channelengine.apiclient.ApiClient;
//import com.channelengine.apiclient.ApiException;
//import com.channelengine.apiclient.Configuration;
//import com.channelengine.apiclient.auth.*;
//import com.channelengine.apiclient.api.ProductApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apikey
ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.setApiKeyPrefix("Token");

ProductApi apiInstance = new ProductApi();
try {
    CollectionOfChannelOfferResponse result = apiInstance.productGetOfferChanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#productGetOfferChanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CollectionOfChannelOfferResponse**](CollectionOfChannelOfferResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

