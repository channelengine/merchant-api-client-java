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
import com.channelengine.merchant.apiclient.model.MerchantSingleOrderReturnLineResponse;
import com.channelengine.merchant.apiclient.model.ReturnReason;
import com.channelengine.merchant.apiclient.model.ReturnStatus;
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
import org.threeten.bp.OffsetDateTime;

/**
 * MerchantSingleOrderReturnResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantSingleOrderReturnResponse {
  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "MerchantOrderNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<MerchantSingleOrderReturnLineResponse> lines = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "UpdatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_MERCHANT_RETURN_NO = "MerchantReturnNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_RETURN_NO)
  private String merchantReturnNo;

  public static final String SERIALIZED_NAME_CHANNEL_RETURN_NO = "ChannelReturnNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_RETURN_NO)
  private String channelReturnNo;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "ChannelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private Integer channelId;

  public static final String SERIALIZED_NAME_GLOBAL_CHANNEL_ID = "GlobalChannelId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_CHANNEL_ID)
  private Integer globalChannelId;

  public static final String SERIALIZED_NAME_GLOBAL_CHANNEL_NAME = "GlobalChannelName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_CHANNEL_NAME)
  private String globalChannelName;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ReturnStatus status;

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

  public static final String SERIALIZED_NAME_RETURN_DATE = "ReturnDate";
  @SerializedName(SERIALIZED_NAME_RETURN_DATE)
  private OffsetDateTime returnDate;


  public MerchantSingleOrderReturnResponse merchantOrderNo(String merchantOrderNo) {
    
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * The unique order reference used by the Merchant.
   * @return merchantOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique order reference used by the Merchant.")

  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }


  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }


  public MerchantSingleOrderReturnResponse lines(List<MerchantSingleOrderReturnLineResponse> lines) {
    
    this.lines = lines;
    return this;
  }

  public MerchantSingleOrderReturnResponse addLinesItem(MerchantSingleOrderReturnLineResponse linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<MerchantSingleOrderReturnLineResponse>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MerchantSingleOrderReturnLineResponse> getLines() {
    return lines;
  }


  public void setLines(List<MerchantSingleOrderReturnLineResponse> lines) {
    this.lines = lines;
  }


  public MerchantSingleOrderReturnResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date at which the return was created in ChannelEngine.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which the return was created in ChannelEngine.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public MerchantSingleOrderReturnResponse updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date at which the return was last modified in ChannelEngine.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which the return was last modified in ChannelEngine.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public MerchantSingleOrderReturnResponse merchantReturnNo(String merchantReturnNo) {
    
    this.merchantReturnNo = merchantReturnNo;
    return this;
  }

   /**
   * The unique return reference used by the Merchant, will be empty in case of a channel or unacknowledged return.
   * @return merchantReturnNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique return reference used by the Merchant, will be empty in case of a channel or unacknowledged return.")

  public String getMerchantReturnNo() {
    return merchantReturnNo;
  }


  public void setMerchantReturnNo(String merchantReturnNo) {
    this.merchantReturnNo = merchantReturnNo;
  }


  public MerchantSingleOrderReturnResponse channelReturnNo(String channelReturnNo) {
    
    this.channelReturnNo = channelReturnNo;
    return this;
  }

   /**
   * The unique return reference used by the Channel, will be empty in case of a merchant return.
   * @return channelReturnNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique return reference used by the Channel, will be empty in case of a merchant return.")

  public String getChannelReturnNo() {
    return channelReturnNo;
  }


  public void setChannelReturnNo(String channelReturnNo) {
    this.channelReturnNo = channelReturnNo;
  }


  public MerchantSingleOrderReturnResponse channelId(Integer channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * The id of the channel.
   * @return channelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the channel.")

  public Integer getChannelId() {
    return channelId;
  }


  public void setChannelId(Integer channelId) {
    this.channelId = channelId;
  }


  public MerchantSingleOrderReturnResponse globalChannelId(Integer globalChannelId) {
    
    this.globalChannelId = globalChannelId;
    return this;
  }

   /**
   * The id of the Global Channel.
   * @return globalChannelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the Global Channel.")

  public Integer getGlobalChannelId() {
    return globalChannelId;
  }


  public void setGlobalChannelId(Integer globalChannelId) {
    this.globalChannelId = globalChannelId;
  }


  public MerchantSingleOrderReturnResponse globalChannelName(String globalChannelName) {
    
    this.globalChannelName = globalChannelName;
    return this;
  }

   /**
   * The name of the Global Channel.
   * @return globalChannelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the Global Channel.")

  public String getGlobalChannelName() {
    return globalChannelName;
  }


  public void setGlobalChannelName(String globalChannelName) {
    this.globalChannelName = globalChannelName;
  }


  public MerchantSingleOrderReturnResponse status(ReturnStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReturnStatus getStatus() {
    return status;
  }


  public void setStatus(ReturnStatus status) {
    this.status = status;
  }


  public MerchantSingleOrderReturnResponse id(Integer id) {
    
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


  public MerchantSingleOrderReturnResponse reason(ReturnReason reason) {
    
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


  public MerchantSingleOrderReturnResponse customerComment(String customerComment) {
    
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


  public MerchantSingleOrderReturnResponse merchantComment(String merchantComment) {
    
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


  public MerchantSingleOrderReturnResponse refundInclVat(BigDecimal refundInclVat) {
    
    this.refundInclVat = refundInclVat;
    return this;
  }

   /**
   * Refund amount incl. VAT.
   * minimum: 0
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


  public MerchantSingleOrderReturnResponse refundExclVat(BigDecimal refundExclVat) {
    
    this.refundExclVat = refundExclVat;
    return this;
  }

   /**
   * Refund amount excl. VAT.
   * minimum: 0
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


  public MerchantSingleOrderReturnResponse returnDate(OffsetDateTime returnDate) {
    
    this.returnDate = returnDate;
    return this;
  }

   /**
   * The date at which the return was originally created in the source system (if available).
   * @return returnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which the return was originally created in the source system (if available).")

  public OffsetDateTime getReturnDate() {
    return returnDate;
  }


  public void setReturnDate(OffsetDateTime returnDate) {
    this.returnDate = returnDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantSingleOrderReturnResponse merchantSingleOrderReturnResponse = (MerchantSingleOrderReturnResponse) o;
    return Objects.equals(this.merchantOrderNo, merchantSingleOrderReturnResponse.merchantOrderNo) &&
        Objects.equals(this.lines, merchantSingleOrderReturnResponse.lines) &&
        Objects.equals(this.createdAt, merchantSingleOrderReturnResponse.createdAt) &&
        Objects.equals(this.updatedAt, merchantSingleOrderReturnResponse.updatedAt) &&
        Objects.equals(this.merchantReturnNo, merchantSingleOrderReturnResponse.merchantReturnNo) &&
        Objects.equals(this.channelReturnNo, merchantSingleOrderReturnResponse.channelReturnNo) &&
        Objects.equals(this.channelId, merchantSingleOrderReturnResponse.channelId) &&
        Objects.equals(this.globalChannelId, merchantSingleOrderReturnResponse.globalChannelId) &&
        Objects.equals(this.globalChannelName, merchantSingleOrderReturnResponse.globalChannelName) &&
        Objects.equals(this.status, merchantSingleOrderReturnResponse.status) &&
        Objects.equals(this.id, merchantSingleOrderReturnResponse.id) &&
        Objects.equals(this.reason, merchantSingleOrderReturnResponse.reason) &&
        Objects.equals(this.customerComment, merchantSingleOrderReturnResponse.customerComment) &&
        Objects.equals(this.merchantComment, merchantSingleOrderReturnResponse.merchantComment) &&
        Objects.equals(this.refundInclVat, merchantSingleOrderReturnResponse.refundInclVat) &&
        Objects.equals(this.refundExclVat, merchantSingleOrderReturnResponse.refundExclVat) &&
        Objects.equals(this.returnDate, merchantSingleOrderReturnResponse.returnDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantOrderNo, lines, createdAt, updatedAt, merchantReturnNo, channelReturnNo, channelId, globalChannelId, globalChannelName, status, id, reason, customerComment, merchantComment, refundInclVat, refundExclVat, returnDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantSingleOrderReturnResponse {\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    merchantReturnNo: ").append(toIndentedString(merchantReturnNo)).append("\n");
    sb.append("    channelReturnNo: ").append(toIndentedString(channelReturnNo)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    globalChannelId: ").append(toIndentedString(globalChannelId)).append("\n");
    sb.append("    globalChannelName: ").append(toIndentedString(globalChannelName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    customerComment: ").append(toIndentedString(customerComment)).append("\n");
    sb.append("    merchantComment: ").append(toIndentedString(merchantComment)).append("\n");
    sb.append("    refundInclVat: ").append(toIndentedString(refundInclVat)).append("\n");
    sb.append("    refundExclVat: ").append(toIndentedString(refundExclVat)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
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

