
# ChannelProcessedChangesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**List&lt;ChannelReferencesRequest&gt;**](ChannelReferencesRequest.md) | A collection of pairs of merchant and channel references  of the products which are successfully created. The channel references  are saved such that in subsequent calls these can be used instead of the   merchant references. |  [optional]
**updated** | **List&lt;String&gt;** | The channel references of the products which are successfully updated. |  [optional]
**removed** | **List&lt;String&gt;** | The channel references of the products which are successfully removed. |  [optional]



