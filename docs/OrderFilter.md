
# OrderFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statuses** | [**List&lt;StatusesEnum&gt;**](#List&lt;StatusesEnum&gt;) |  |  [optional]
**merchantOrderNos** | **List&lt;String&gt;** |  |  [optional]
**excludeMarketplaceFulfilledOrdersAndLines** | **Boolean** |  |  [optional]
**fulfillmentType** | [**FulfillmentTypeEnum**](#FulfillmentTypeEnum) | Filter orders on fulfillment type. This will include all orders lines, even if they are partially fulfilled by the marketplace.  To exclude orders and lines that are fulfilled by the marketplace from the response, set ExcludeMarketplaceFulfilledOrdersAndLines to true. |  [optional]
**page** | **Integer** |  |  [optional]


<a name="List<StatusesEnum>"></a>
## Enum: List&lt;StatusesEnum&gt;
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


<a name="FulfillmentTypeEnum"></a>
## Enum: FulfillmentTypeEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
ONLY_MERCHANT | &quot;ONLY_MERCHANT&quot;
ONLY_CHANNEL | &quot;ONLY_CHANNEL&quot;
MIXED | &quot;MIXED&quot;



