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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MerchantOrderCommentUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantOrderCommentUpdateRequest {
  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "MerchantOrderNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_ORDER_ID = "OrderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Integer orderId;

  public static final String SERIALIZED_NAME_MERCHANT_COMMENT = "MerchantComment";
  @SerializedName(SERIALIZED_NAME_MERCHANT_COMMENT)
  private String merchantComment;


  public MerchantOrderCommentUpdateRequest merchantOrderNo(String merchantOrderNo) {
    
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * Your own order reference for the order you would like to update the comment for.  Either this field or OrderId is required
   * @return merchantOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your own order reference for the order you would like to update the comment for.  Either this field or OrderId is required")

  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }


  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }


  public MerchantOrderCommentUpdateRequest orderId(Integer orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * The ChannelEngine order ID of the order you would like to update the comment for.  Either this field or MerchantOrderNo is required
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ChannelEngine order ID of the order you would like to update the comment for.  Either this field or MerchantOrderNo is required")

  public Integer getOrderId() {
    return orderId;
  }


  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public MerchantOrderCommentUpdateRequest merchantComment(String merchantComment) {
    
    this.merchantComment = merchantComment;
    return this;
  }

   /**
   * The merchant comment you would like add / update for the order.
   * @return merchantComment
  **/
  @ApiModelProperty(required = true, value = "The merchant comment you would like add / update for the order.")

  public String getMerchantComment() {
    return merchantComment;
  }


  public void setMerchantComment(String merchantComment) {
    this.merchantComment = merchantComment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantOrderCommentUpdateRequest merchantOrderCommentUpdateRequest = (MerchantOrderCommentUpdateRequest) o;
    return Objects.equals(this.merchantOrderNo, merchantOrderCommentUpdateRequest.merchantOrderNo) &&
        Objects.equals(this.orderId, merchantOrderCommentUpdateRequest.orderId) &&
        Objects.equals(this.merchantComment, merchantOrderCommentUpdateRequest.merchantComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantOrderNo, orderId, merchantComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantOrderCommentUpdateRequest {\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    merchantComment: ").append(toIndentedString(merchantComment)).append("\n");
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

