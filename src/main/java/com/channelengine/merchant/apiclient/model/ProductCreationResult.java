/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.ProductMessage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductCreationResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductCreationResult {
  public static final String SERIALIZED_NAME_REJECTED_COUNT = "RejectedCount";
  @SerializedName(SERIALIZED_NAME_REJECTED_COUNT)
  private Integer rejectedCount;

  public static final String SERIALIZED_NAME_ACCEPTED_COUNT = "AcceptedCount";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_COUNT)
  private Integer acceptedCount;

  public static final String SERIALIZED_NAME_PRODUCT_MESSAGES = "ProductMessages";
  @SerializedName(SERIALIZED_NAME_PRODUCT_MESSAGES)
  private List<ProductMessage> productMessages = null;


  public ProductCreationResult rejectedCount(Integer rejectedCount) {
    
    this.rejectedCount = rejectedCount;
    return this;
  }

   /**
   * Get rejectedCount
   * @return rejectedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRejectedCount() {
    return rejectedCount;
  }


  public void setRejectedCount(Integer rejectedCount) {
    this.rejectedCount = rejectedCount;
  }


  public ProductCreationResult acceptedCount(Integer acceptedCount) {
    
    this.acceptedCount = acceptedCount;
    return this;
  }

   /**
   * Get acceptedCount
   * @return acceptedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAcceptedCount() {
    return acceptedCount;
  }


  public void setAcceptedCount(Integer acceptedCount) {
    this.acceptedCount = acceptedCount;
  }


  public ProductCreationResult productMessages(List<ProductMessage> productMessages) {
    
    this.productMessages = productMessages;
    return this;
  }

  public ProductCreationResult addProductMessagesItem(ProductMessage productMessagesItem) {
    if (this.productMessages == null) {
      this.productMessages = new ArrayList<ProductMessage>();
    }
    this.productMessages.add(productMessagesItem);
    return this;
  }

   /**
   * Messages about the rejected products.
   * @return productMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Messages about the rejected products.")

  public List<ProductMessage> getProductMessages() {
    return productMessages;
  }


  public void setProductMessages(List<ProductMessage> productMessages) {
    this.productMessages = productMessages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCreationResult productCreationResult = (ProductCreationResult) o;
    return Objects.equals(this.rejectedCount, productCreationResult.rejectedCount) &&
        Objects.equals(this.acceptedCount, productCreationResult.acceptedCount) &&
        Objects.equals(this.productMessages, productCreationResult.productMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedCount, acceptedCount, productMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCreationResult {\n");
    sb.append("    rejectedCount: ").append(toIndentedString(rejectedCount)).append("\n");
    sb.append("    acceptedCount: ").append(toIndentedString(acceptedCount)).append("\n");
    sb.append("    productMessages: ").append(toIndentedString(productMessages)).append("\n");
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

