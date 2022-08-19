/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.11.0
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
 * MerchantReturnAcknowledgeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantReturnAcknowledgeRequest {
  public static final String SERIALIZED_NAME_RETURN_ID = "ReturnId";
  @SerializedName(SERIALIZED_NAME_RETURN_ID)
  private Integer returnId;

  public static final String SERIALIZED_NAME_MERCHANT_RETURN_NO = "MerchantReturnNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_RETURN_NO)
  private String merchantReturnNo;


  public MerchantReturnAcknowledgeRequest returnId(Integer returnId) {
    
    this.returnId = returnId;
    return this;
  }

   /**
   * Get returnId
   * @return returnId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReturnId() {
    return returnId;
  }


  public void setReturnId(Integer returnId) {
    this.returnId = returnId;
  }


  public MerchantReturnAcknowledgeRequest merchantReturnNo(String merchantReturnNo) {
    
    this.merchantReturnNo = merchantReturnNo;
    return this;
  }

   /**
   * Get merchantReturnNo
   * @return merchantReturnNo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMerchantReturnNo() {
    return merchantReturnNo;
  }


  public void setMerchantReturnNo(String merchantReturnNo) {
    this.merchantReturnNo = merchantReturnNo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantReturnAcknowledgeRequest merchantReturnAcknowledgeRequest = (MerchantReturnAcknowledgeRequest) o;
    return Objects.equals(this.returnId, merchantReturnAcknowledgeRequest.returnId) &&
        Objects.equals(this.merchantReturnNo, merchantReturnAcknowledgeRequest.merchantReturnNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnId, merchantReturnNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantReturnAcknowledgeRequest {\n");
    sb.append("    returnId: ").append(toIndentedString(returnId)).append("\n");
    sb.append("    merchantReturnNo: ").append(toIndentedString(merchantReturnNo)).append("\n");
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

