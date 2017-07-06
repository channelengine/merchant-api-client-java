
# MerchantOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The unique identifier used by ChannelEngine. This identifier does  not have to be saved. It should only be used in a call to acknowledge the order. |  [optional]
**channelName** | **String** |  |  [optional]
**channelOrderSupport** | [**ChannelOrderSupportEnum**](#ChannelOrderSupportEnum) |  |  [optional]
**channelOrderNo** | **String** |  |  [optional]
**lines** | [**List&lt;MerchantOrderLineResponse&gt;**](MerchantOrderLineResponse.md) |  |  [optional]
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


<a name="ChannelOrderSupportEnum"></a>
## Enum: ChannelOrderSupportEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
ORDERS | &quot;ORDERS&quot;
SPLIT_ORDERS | &quot;SPLIT_ORDERS&quot;
SPLIT_ORDER_LINES | &quot;SPLIT_ORDER_LINES&quot;



