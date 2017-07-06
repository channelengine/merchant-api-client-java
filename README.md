# api-client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.channelengine.apiclient</groupId>
    <artifactId>api-client-java</artifactId>
    <version>2.2.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.channelengine.apiclient:api-client-java:2.2.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/api-client-java-2.2.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.channelengine.apiclient.*;
import com.channelengine.apiclient.auth.*;
import com.channelengine.apiclient.model.*;
import com.channelengine.apiclient.api.CancellationApi;

import java.io.File;
import java.util.*;

public class CancellationApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://dev.channelengine.local/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CancellationApi* | [**cancellationCreate**](docs/CancellationApi.md#cancellationCreate) | **POST** /v2/cancellations | Merchant: Create Cancellation
*CancellationApi* | [**cancellationIndex**](docs/CancellationApi.md#cancellationIndex) | **GET** /v2/cancellations | Channel: Get Cancellations
*ClientApi* | [**clientGet**](docs/ClientApi.md#clientGet) | **GET** /v2/clients/{language} | Get API Client
*OfferApi* | [**offerStockPriceUpdate**](docs/OfferApi.md#offerStockPriceUpdate) | **PUT** /v2/offer | Update stock or price.
*OrderApi* | [**orderAcknowledge**](docs/OrderApi.md#orderAcknowledge) | **POST** /v2/orders/acknowledge | Merchant: Acknowledge Order
*OrderApi* | [**orderCreate**](docs/OrderApi.md#orderCreate) | **POST** /v2/orders | Channel: Create Order
*OrderApi* | [**orderGetNew**](docs/OrderApi.md#orderGetNew) | **GET** /v2/orders/new | Merchant: Get New Orders
*OrderApi* | [**orderInvoice**](docs/OrderApi.md#orderInvoice) | **GET** /v2/orders/{merchantOrderNo}/invoice | Merchant: Download Invoice
*OrderApi* | [**orderPackingSlip**](docs/OrderApi.md#orderPackingSlip) | **GET** /v2/orders/{merchantOrderNo}/packingslip | Merchant: Download Packing Slip
*ProductApi* | [**productAcknowledgeDataChanges**](docs/ProductApi.md#productAcknowledgeDataChanges) | **POST** /v2/products/data | Channel: Acknowledge Product Data Changes
*ProductApi* | [**productAcknowledgeOfferChanges**](docs/ProductApi.md#productAcknowledgeOfferChanges) | **POST** /v2/products/offers | Channel: Acknowledge Product Offer Changes
*ProductApi* | [**productCreate**](docs/ProductApi.md#productCreate) | **POST** /v2/products | Merchant: Create Product
*ProductApi* | [**productDelete**](docs/ProductApi.md#productDelete) | **DELETE** /v2/products/{merchantProductNo} | Merchant: Delete Product
*ProductApi* | [**productGetByMerchantProductNo**](docs/ProductApi.md#productGetByMerchantProductNo) | **GET** /v2/products/merchant/{merchantProductNo} | Merchant: Get Product
*ProductApi* | [**productGetDataChanges**](docs/ProductApi.md#productGetDataChanges) | **GET** /v2/products/data | Channel: Get Product Data Changes
*ProductApi* | [**productGetOfferChanges**](docs/ProductApi.md#productGetOfferChanges) | **GET** /v2/products/offers | Channel: Get Product Offer Changes
*ReturnApi* | [**returnDeclareForChannel**](docs/ReturnApi.md#returnDeclareForChannel) | **POST** /v2/returns/channel | Channel: Create Return
*ReturnApi* | [**returnDeclareForMerchant**](docs/ReturnApi.md#returnDeclareForMerchant) | **POST** /v2/returns/merchant | Merchant: Create Return
*ReturnApi* | [**returnGetDeclaredByChannel**](docs/ReturnApi.md#returnGetDeclaredByChannel) | **GET** /v2/returns/merchant | Merchant: Get Returns
*ReturnApi* | [**returnGetDeclaredByMerchant**](docs/ReturnApi.md#returnGetDeclaredByMerchant) | **GET** /v2/returns/channel | Channel: Get Returns
*ShipmentApi* | [**shipmentCreate**](docs/ShipmentApi.md#shipmentCreate) | **POST** /v2/shipments | Merchant: Create Shipment
*ShipmentApi* | [**shipmentIndex**](docs/ShipmentApi.md#shipmentIndex) | **GET** /v2/shipments | Channel: Get Shipments
*ShipmentApi* | [**shipmentUpdate**](docs/ShipmentApi.md#shipmentUpdate) | **PUT** /v2/shipments/{merchantShipmentNo} | Merchant: Update Shipment


## Documentation for Models

 - [ChannelCancellationLineResponse](docs/ChannelCancellationLineResponse.md)
 - [ChannelCancellationResponse](docs/ChannelCancellationResponse.md)
 - [ChannelOfferResponse](docs/ChannelOfferResponse.md)
 - [ChannelOrderLineRequest](docs/ChannelOrderLineRequest.md)
 - [ChannelOrderRequest](docs/ChannelOrderRequest.md)
 - [ChannelProcessedChangesRequest](docs/ChannelProcessedChangesRequest.md)
 - [ChannelProductChangesResponse](docs/ChannelProductChangesResponse.md)
 - [ChannelProductResponse](docs/ChannelProductResponse.md)
 - [ChannelReferencesRequest](docs/ChannelReferencesRequest.md)
 - [ChannelReturnLineRequest](docs/ChannelReturnLineRequest.md)
 - [ChannelReturnLineResponse](docs/ChannelReturnLineResponse.md)
 - [ChannelReturnRequest](docs/ChannelReturnRequest.md)
 - [ChannelReturnResponse](docs/ChannelReturnResponse.md)
 - [ChannelShipmentLineResponse](docs/ChannelShipmentLineResponse.md)
 - [ChannelShipmentResponse](docs/ChannelShipmentResponse.md)
 - [CollectionOfChannelCancellationResponse](docs/CollectionOfChannelCancellationResponse.md)
 - [CollectionOfChannelOfferResponse](docs/CollectionOfChannelOfferResponse.md)
 - [CollectionOfChannelReturnResponse](docs/CollectionOfChannelReturnResponse.md)
 - [CollectionOfChannelShipmentResponse](docs/CollectionOfChannelShipmentResponse.md)
 - [CollectionOfMerchantOrderResponse](docs/CollectionOfMerchantOrderResponse.md)
 - [CollectionOfMerchantReturnResponse](docs/CollectionOfMerchantReturnResponse.md)
 - [EntitiesAddressModels](docs/EntitiesAddressModels.md)
 - [ExtraDataItem](docs/ExtraDataItem.md)
 - [MerchantCancellationLineRequest](docs/MerchantCancellationLineRequest.md)
 - [MerchantCancellationRequest](docs/MerchantCancellationRequest.md)
 - [MerchantOrderLineResponse](docs/MerchantOrderLineResponse.md)
 - [MerchantOrderResponse](docs/MerchantOrderResponse.md)
 - [MerchantProductRequest](docs/MerchantProductRequest.md)
 - [MerchantProductResponse](docs/MerchantProductResponse.md)
 - [MerchantReturnLineRequest](docs/MerchantReturnLineRequest.md)
 - [MerchantReturnLineResponse](docs/MerchantReturnLineResponse.md)
 - [MerchantReturnRequest](docs/MerchantReturnRequest.md)
 - [MerchantReturnResponse](docs/MerchantReturnResponse.md)
 - [MerchantShipmentLineRequest](docs/MerchantShipmentLineRequest.md)
 - [MerchantShipmentRequest](docs/MerchantShipmentRequest.md)
 - [MerchantShipmentTrackingRequest](docs/MerchantShipmentTrackingRequest.md)
 - [MerchantStockPriceUpdateRequest](docs/MerchantStockPriceUpdateRequest.md)
 - [ModelApiResponse](docs/ModelApiResponse.md)
 - [OrderAcknowledgement](docs/OrderAcknowledgement.md)
 - [ProductCreationResult](docs/ProductCreationResult.md)
 - [ProductMessage](docs/ProductMessage.md)
 - [SingleOfChannelProductChangesResponse](docs/SingleOfChannelProductChangesResponse.md)
 - [SingleOfCollectionsDictionary2Generic](docs/SingleOfCollectionsDictionary2Generic.md)
 - [SingleOfMerchantProductResponse](docs/SingleOfMerchantProductResponse.md)
 - [SingleOfProductCreationResult](docs/SingleOfProductCreationResult.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apikey

- **Type**: API key
- **API key parameter name**: apikey
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



