
# MerchantReturnResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantOrderNo** | **String** |  |  [optional]
**lines** | [**List&lt;MerchantReturnLineResponse&gt;**](MerchantReturnLineResponse.md) |  |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) |  |  [optional]
**customerComment** | **String** |  |  [optional]
**merchantComment** | **String** |  |  [optional]
**refundInclVat** | **Double** |  |  [optional]
**refundExclVat** | **Double** |  |  [optional]


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
PRODUCT_DEFECT | &quot;PRODUCT_DEFECT&quot;
PRODUCT_UNSATISFACTORY | &quot;PRODUCT_UNSATISFACTORY&quot;
REFUSED | &quot;REFUSED&quot;
REFUSED_DAMAGED | &quot;REFUSED_DAMAGED&quot;
WRONG_ADDRESS | &quot;WRONG_ADDRESS&quot;
NOT_COLLECTED | &quot;NOT_COLLECTED&quot;
OTHER | &quot;OTHER&quot;



