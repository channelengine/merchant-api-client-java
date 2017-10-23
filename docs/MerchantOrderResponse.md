
# MerchantOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The unique identifier used by ChannelEngine. This identifier does  not have to be saved. It should only be used in a call to acknowledge the order. |  [optional]
**channelName** | **String** |  |  [optional]
**channelOrderSupport** | [**ChannelOrderSupportEnum**](#ChannelOrderSupportEnum) |  |  [optional]
**channelOrderNo** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**lines** | [**List&lt;MerchantOrderLineResponse&gt;**](MerchantOrderLineResponse.md) |  |  [optional]
**phone** | **String** |  |  [optional]
**email** | **String** |  | 
**companyRegistrationNo** | **String** |  |  [optional]
**vatNo** | **String** |  |  [optional]
**paymentMethod** | **String** |  | 
**shippingCostsInclVat** | **Double** | The shipping fee including VAT  (in the tenant&#39;s base currency calculated using the exchange rate at the time of ordering). | 
**currencyCode** | **String** |  | 
**orderDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
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


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
IN_PROGRESS | &quot;IN_PROGRESS&quot;
SHIPPED | &quot;SHIPPED&quot;
IN_BACKORDER | &quot;IN_BACKORDER&quot;
CANCELED | &quot;CANCELED&quot;
MANCO | &quot;MANCO&quot;
IN_COMBI | &quot;IN_COMBI&quot;
CLOSED | &quot;CLOSED&quot;
NEW | &quot;NEW&quot;
RETURNED | &quot;RETURNED&quot;
REQUIRES_CORRECTION | &quot;REQUIRES_CORRECTION&quot;



