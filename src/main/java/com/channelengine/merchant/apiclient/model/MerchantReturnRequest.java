/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.MerchantReturnLineRequest;
import com.channelengine.merchant.apiclient.model.ReturnReason;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * MerchantReturnRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantReturnRequest {
  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "MerchantOrderNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_MERCHANT_RETURN_NO = "MerchantReturnNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_RETURN_NO)
  private String merchantReturnNo;

  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<MerchantReturnLineRequest> lines = new ArrayList<MerchantReturnLineRequest>();

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReturnReason reason;

  public static final String SERIALIZED_NAME_CUSTOMER_COMMENT = "CustomerComment";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_COMMENT)
  private String customerComment;

  public static final String SERIALIZED_NAME_MERCHANT_COMMENT = "MerchantComment";
  @SerializedName(SERIALIZED_NAME_MERCHANT_COMMENT)
  private String merchantComment;

  public static final String SERIALIZED_NAME_REFUND_INCL_VAT = "RefundInclVat";
  @SerializedName(SERIALIZED_NAME_REFUND_INCL_VAT)
  private BigDecimal refundInclVat;

  public static final String SERIALIZED_NAME_REFUND_EXCL_VAT = "RefundExclVat";
  @SerializedName(SERIALIZED_NAME_REFUND_EXCL_VAT)
  private BigDecimal refundExclVat;


  public MerchantReturnRequest merchantOrderNo(String merchantOrderNo) {
    
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * The unique order reference used by the Merchant (sku).
   * @return merchantOrderNo
  **/
  @ApiModelProperty(required = true, value = "The unique order reference used by the Merchant (sku).")

  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }


  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }


  public MerchantReturnRequest merchantReturnNo(String merchantReturnNo) {
    
    this.merchantReturnNo = merchantReturnNo;
    return this;
  }

   /**
   * The unique return reference used by the Merchant (sku).
   * @return merchantReturnNo
  **/
  @ApiModelProperty(required = true, value = "The unique return reference used by the Merchant (sku).")

  public String getMerchantReturnNo() {
    return merchantReturnNo;
  }


  public void setMerchantReturnNo(String merchantReturnNo) {
    this.merchantReturnNo = merchantReturnNo;
  }


  public MerchantReturnRequest lines(List<MerchantReturnLineRequest> lines) {
    
    this.lines = lines;
    return this;
  }

  public MerchantReturnRequest addLinesItem(MerchantReturnLineRequest linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "")

  public List<MerchantReturnLineRequest> getLines() {
    return lines;
  }


  public void setLines(List<MerchantReturnLineRequest> lines) {
    this.lines = lines;
  }


  public MerchantReturnRequest id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique return reference used by ChannelEngine.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique return reference used by ChannelEngine.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public MerchantReturnRequest reason(ReturnReason reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReturnReason getReason() {
    return reason;
  }


  public void setReason(ReturnReason reason) {
    this.reason = reason;
  }


  public MerchantReturnRequest customerComment(String customerComment) {
    
    this.customerComment = customerComment;
    return this;
  }

   /**
   * Optional. Comment of customer on the (reason of) the return.
   * @return customerComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. Comment of customer on the (reason of) the return.")

  public String getCustomerComment() {
    return customerComment;
  }


  public void setCustomerComment(String customerComment) {
    this.customerComment = customerComment;
  }


  public MerchantReturnRequest merchantComment(String merchantComment) {
    
    this.merchantComment = merchantComment;
    return this;
  }

   /**
   * Optional. Comment of merchant on the return.
   * @return merchantComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. Comment of merchant on the return.")

  public String getMerchantComment() {
    return merchantComment;
  }


  public void setMerchantComment(String merchantComment) {
    this.merchantComment = merchantComment;
  }


  public MerchantReturnRequest refundInclVat(BigDecimal refundInclVat) {
    
    this.refundInclVat = refundInclVat;
    return this;
  }

   /**
   * Refund amount incl. VAT.
   * @return refundInclVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Refund amount incl. VAT.")

  public BigDecimal getRefundInclVat() {
    return refundInclVat;
  }


  public void setRefundInclVat(BigDecimal refundInclVat) {
    this.refundInclVat = refundInclVat;
  }


  public MerchantReturnRequest refundExclVat(BigDecimal refundExclVat) {
    
    this.refundExclVat = refundExclVat;
    return this;
  }

   /**
   * Refund amount excl. VAT.
   * @return refundExclVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Refund amount excl. VAT.")

  public BigDecimal getRefundExclVat() {
    return refundExclVat;
  }


  public void setRefundExclVat(BigDecimal refundExclVat) {
    this.refundExclVat = refundExclVat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantReturnRequest merchantReturnRequest = (MerchantReturnRequest) o;
    return Objects.equals(this.merchantOrderNo, merchantReturnRequest.merchantOrderNo) &&
        Objects.equals(this.merchantReturnNo, merchantReturnRequest.merchantReturnNo) &&
        Objects.equals(this.lines, merchantReturnRequest.lines) &&
        Objects.equals(this.id, merchantReturnRequest.id) &&
        Objects.equals(this.reason, merchantReturnRequest.reason) &&
        Objects.equals(this.customerComment, merchantReturnRequest.customerComment) &&
        Objects.equals(this.merchantComment, merchantReturnRequest.merchantComment) &&
        Objects.equals(this.refundInclVat, merchantReturnRequest.refundInclVat) &&
        Objects.equals(this.refundExclVat, merchantReturnRequest.refundExclVat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantOrderNo, merchantReturnNo, lines, id, reason, customerComment, merchantComment, refundInclVat, refundExclVat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantReturnRequest {\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    merchantReturnNo: ").append(toIndentedString(merchantReturnNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    customerComment: ").append(toIndentedString(customerComment)).append("\n");
    sb.append("    merchantComment: ").append(toIndentedString(merchantComment)).append("\n");
    sb.append("    refundInclVat: ").append(toIndentedString(refundInclVat)).append("\n");
    sb.append("    refundExclVat: ").append(toIndentedString(refundExclVat)).append("\n");
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

