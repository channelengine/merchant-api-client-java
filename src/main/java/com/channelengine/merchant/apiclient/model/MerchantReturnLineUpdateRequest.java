/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.13.0
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
 * MerchantReturnLineUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantReturnLineUpdateRequest {
  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_ACCEPTED_QUANTITY = "AcceptedQuantity";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_QUANTITY)
  private Integer acceptedQuantity;

  public static final String SERIALIZED_NAME_REJECTED_QUANTITY = "RejectedQuantity";
  @SerializedName(SERIALIZED_NAME_REJECTED_QUANTITY)
  private Integer rejectedQuantity;


  public MerchantReturnLineUpdateRequest merchantProductNo(String merchantProductNo) {
    
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * The unique product reference used by the Merchant (sku).
   * @return merchantProductNo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique product reference used by the Merchant (sku).")

  public String getMerchantProductNo() {
    return merchantProductNo;
  }


  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }


  public MerchantReturnLineUpdateRequest acceptedQuantity(Integer acceptedQuantity) {
    
    this.acceptedQuantity = acceptedQuantity;
    return this;
  }

   /**
   * The amount of items that have been accepted.
   * minimum: 0
   * @return acceptedQuantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount of items that have been accepted.")

  public Integer getAcceptedQuantity() {
    return acceptedQuantity;
  }


  public void setAcceptedQuantity(Integer acceptedQuantity) {
    this.acceptedQuantity = acceptedQuantity;
  }


  public MerchantReturnLineUpdateRequest rejectedQuantity(Integer rejectedQuantity) {
    
    this.rejectedQuantity = rejectedQuantity;
    return this;
  }

   /**
   * The amount of items that have been rejected.
   * minimum: 0
   * @return rejectedQuantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount of items that have been rejected.")

  public Integer getRejectedQuantity() {
    return rejectedQuantity;
  }


  public void setRejectedQuantity(Integer rejectedQuantity) {
    this.rejectedQuantity = rejectedQuantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantReturnLineUpdateRequest merchantReturnLineUpdateRequest = (MerchantReturnLineUpdateRequest) o;
    return Objects.equals(this.merchantProductNo, merchantReturnLineUpdateRequest.merchantProductNo) &&
        Objects.equals(this.acceptedQuantity, merchantReturnLineUpdateRequest.acceptedQuantity) &&
        Objects.equals(this.rejectedQuantity, merchantReturnLineUpdateRequest.rejectedQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantProductNo, acceptedQuantity, rejectedQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantReturnLineUpdateRequest {\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    acceptedQuantity: ").append(toIndentedString(acceptedQuantity)).append("\n");
    sb.append("    rejectedQuantity: ").append(toIndentedString(rejectedQuantity)).append("\n");
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

