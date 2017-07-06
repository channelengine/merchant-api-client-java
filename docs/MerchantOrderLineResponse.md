
# MerchantOrderLineResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantProductNo** | **String** |  |  [optional]
**channelProductNo** | **String** |  | 
**quantity** | **Integer** |  | 
**unitPriceInclVat** | **Double** | The value of a single unit of the ordered product including VAT  (in the tenant&#39;s base currency calculated using the exchange rate at the time of ordering). | 
**feeFixed** | **Double** | A fixed fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable. |  [optional]
**feeRate** | **Double** | A percentage fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable. |  [optional]
**condition** | [**ConditionEnum**](#ConditionEnum) | The condition of the product, this can be used to indicate that a product is a second-hand product |  [optional]


<a name="ConditionEnum"></a>
## Enum: ConditionEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
NEW_REFURBISHED | &quot;NEW_REFURBISHED&quot;
USED_AS_NEW | &quot;USED_AS_NEW&quot;
USED_GOOD | &quot;USED_GOOD&quot;
USED_REASONABLE | &quot;USED_REASONABLE&quot;
USED_MEDIOCRE | &quot;USED_MEDIOCRE&quot;
UNKNOWN | &quot;UNKNOWN&quot;



