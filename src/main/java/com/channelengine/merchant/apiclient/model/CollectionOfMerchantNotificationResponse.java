/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.MerchantNotificationResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CollectionOfMerchantNotificationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CollectionOfMerchantNotificationResponse {
  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<MerchantNotificationResponse> content = null;

  public static final String SERIALIZED_NAME_COUNT = "Count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "TotalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_ITEMS_PER_PAGE = "ItemsPerPage";
  @SerializedName(SERIALIZED_NAME_ITEMS_PER_PAGE)
  private Integer itemsPerPage;

  public static final String SERIALIZED_NAME_STATUS_CODE = "StatusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_LOG_ID = "LogId";
  @SerializedName(SERIALIZED_NAME_LOG_ID)
  private Integer logId;

  public static final String SERIALIZED_NAME_SUCCESS = "Success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "ValidationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private Map<String, List<String>> validationErrors = null;


  public CollectionOfMerchantNotificationResponse content(List<MerchantNotificationResponse> content) {
    
    this.content = content;
    return this;
  }

  public CollectionOfMerchantNotificationResponse addContentItem(MerchantNotificationResponse contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<MerchantNotificationResponse>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MerchantNotificationResponse> getContent() {
    return content;
  }


  public void setContent(List<MerchantNotificationResponse> content) {
    this.content = content;
  }


  public CollectionOfMerchantNotificationResponse count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public CollectionOfMerchantNotificationResponse totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public CollectionOfMerchantNotificationResponse itemsPerPage(Integer itemsPerPage) {
    
    this.itemsPerPage = itemsPerPage;
    return this;
  }

   /**
   * Get itemsPerPage
   * @return itemsPerPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getItemsPerPage() {
    return itemsPerPage;
  }


  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }


  public CollectionOfMerchantNotificationResponse statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public CollectionOfMerchantNotificationResponse logId(Integer logId) {
    
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLogId() {
    return logId;
  }


  public void setLogId(Integer logId) {
    this.logId = logId;
  }


  public CollectionOfMerchantNotificationResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public CollectionOfMerchantNotificationResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public CollectionOfMerchantNotificationResponse validationErrors(Map<String, List<String>> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public CollectionOfMerchantNotificationResponse putValidationErrorsItem(String key, List<String> validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new HashMap<String, List<String>>();
    }
    this.validationErrors.put(key, validationErrorsItem);
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(Map<String, List<String>> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionOfMerchantNotificationResponse collectionOfMerchantNotificationResponse = (CollectionOfMerchantNotificationResponse) o;
    return Objects.equals(this.content, collectionOfMerchantNotificationResponse.content) &&
        Objects.equals(this.count, collectionOfMerchantNotificationResponse.count) &&
        Objects.equals(this.totalCount, collectionOfMerchantNotificationResponse.totalCount) &&
        Objects.equals(this.itemsPerPage, collectionOfMerchantNotificationResponse.itemsPerPage) &&
        Objects.equals(this.statusCode, collectionOfMerchantNotificationResponse.statusCode) &&
        Objects.equals(this.logId, collectionOfMerchantNotificationResponse.logId) &&
        Objects.equals(this.success, collectionOfMerchantNotificationResponse.success) &&
        Objects.equals(this.message, collectionOfMerchantNotificationResponse.message) &&
        Objects.equals(this.validationErrors, collectionOfMerchantNotificationResponse.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, count, totalCount, itemsPerPage, statusCode, logId, success, message, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionOfMerchantNotificationResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

