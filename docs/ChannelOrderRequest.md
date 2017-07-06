
# ChannelOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channelOrderNo** | **String** | The unique order reference used by the Channel | 
**lines** | [**List&lt;ChannelOrderLineRequest&gt;**](ChannelOrderLineRequest.md) | The order lines | 
**phone** | **String** |  |  [optional]
**email** | **String** |  | 
**companyRegistrationNo** | **String** |  |  [optional]
**vatNo** | **String** |  |  [optional]
**paymentMethod** | **String** |  | 
**shippingCostsInclVat** | **Double** | The shipping fee including VAT  (in the tenant&#39;s base currency calculated using the exchange rate at the time of ordering). | 
**currencyCode** | **String** |  | 
**orderDate** | [**DateTime**](DateTime.md) |  | 
**channelCustomerNo** | **String** |  |  [optional]
**billingAddress** | [**EntitiesAddressModels**](EntitiesAddressModels.md) |  | 
**shippingAddress** | [**EntitiesAddressModels**](EntitiesAddressModels.md) |  | 
**extraData** | **Map&lt;String, String&gt;** |  |  [optional]



