
# ChannelProductResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | An unique identifier which ChannelEngine uses to identify the product.  Needed in the call &#39;POST /v2/products/data&#39; |  [optional]
**parentChannelProductNo** | **String** |  |  [optional]
**mappedFields** | **Map&lt;String, String&gt;** | A channel can require certain fields to be available. The channel  can provide ChannelEngine with this fields after which the merchants  will be able to fill in this field using custom conditions in ChannelEngine. |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**brand** | **String** |  |  [optional]
**size** | **String** |  |  [optional]
**color** | **String** |  |  [optional]
**ean** | **String** |  |  [optional]
**manufacturerProductNumber** | **String** |  |  [optional]
**stock** | **Integer** |  |  [optional]
**price** | **Double** | Price, including VAT. |  [optional]
**MSRP** | **Double** | Manufacturer&#39;s suggested retail price |  [optional]
**purchasePrice** | **Double** |  |  [optional]
**vatRateType** | [**VatRateTypeEnum**](#VatRateTypeEnum) | The type of VAT which applies to this product.  See: http://ec.europa.eu/taxation_customs/taxation/vat/topics/rates_en.htm |  [optional]
**shippingCost** | **Double** |  |  [optional]
**shippingTime** | **String** | A textual representation of the shippingtime.  For example, in Dutch: &#39;Op werkdagen voor 22:00 uur besteld, morgen in huis&#39; |  [optional]
**url** | **String** | A URL pointing to the merchant&#39;s webpage  which displays this product. |  [optional]
**imageUrl** | **String** | A URL at which an image of this product  can be found. |  [optional]
**categoryTrail** | **String** | The category to which this product belongs.  Please supply this field in the following format:  &#39;maincategory &amp;gt; category &amp;gt; subcategory&#39;  For example:  &#39;vehicles &amp;gt; bikes &amp;gt; mountainbike&#39; |  [optional]
**extraData** | [**List&lt;ExtraDataItem&gt;**](ExtraDataItem.md) | An optional list of key-value pairs containing  extra data about this product. This data can be  sent to channels or used for filtering products. |  [optional]


<a name="VatRateTypeEnum"></a>
## Enum: VatRateTypeEnum
Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
REDUCED | &quot;REDUCED&quot;
SUPER_REDUCED | &quot;SUPER_REDUCED&quot;



