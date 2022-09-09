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
import com.channelengine.merchant.apiclient.model.MerchantOrderLineResponse;
import com.channelengine.merchant.apiclient.model.ShipmentLineStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MerchantSingleOrderReturnLineResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantSingleOrderReturnLineResponse {
  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_ACCEPTED_QUANTITY = "AcceptedQuantity";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_QUANTITY)
  private Integer acceptedQuantity;

  public static final String SERIALIZED_NAME_REJECTED_QUANTITY = "RejectedQuantity";
  @SerializedName(SERIALIZED_NAME_REJECTED_QUANTITY)
  private Integer rejectedQuantity;

  public static final String SERIALIZED_NAME_ORDER_LINE = "OrderLine";
  @SerializedName(SERIALIZED_NAME_ORDER_LINE)
  private MerchantOrderLineResponse orderLine;

  public static final String SERIALIZED_NAME_SHIPMENT_STATUS = "ShipmentStatus";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_STATUS)
  private ShipmentLineStatus shipmentStatus;

  public static final String SERIALIZED_NAME_QUANTITY = "Quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_EXTRA_DATA = "ExtraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private Map<String, String> extraData = null;


  public MerchantSingleOrderReturnLineResponse merchantProductNo(String merchantProductNo) {
    
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * The unique product reference used by the Merchant (sku).
   * @return merchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique product reference used by the Merchant (sku).")

  public String getMerchantProductNo() {
    return merchantProductNo;
  }


  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }


  public MerchantSingleOrderReturnLineResponse acceptedQuantity(Integer acceptedQuantity) {
    
    this.acceptedQuantity = acceptedQuantity;
    return this;
  }

   /**
   * The accepted quantity of returned products in this orderline.
   * @return acceptedQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The accepted quantity of returned products in this orderline.")

  public Integer getAcceptedQuantity() {
    return acceptedQuantity;
  }


  public void setAcceptedQuantity(Integer acceptedQuantity) {
    this.acceptedQuantity = acceptedQuantity;
  }


  public MerchantSingleOrderReturnLineResponse rejectedQuantity(Integer rejectedQuantity) {
    
    this.rejectedQuantity = rejectedQuantity;
    return this;
  }

   /**
   * The rejected quantity of returned products in this orderline.
   * @return rejectedQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rejected quantity of returned products in this orderline.")

  public Integer getRejectedQuantity() {
    return rejectedQuantity;
  }


  public void setRejectedQuantity(Integer rejectedQuantity) {
    this.rejectedQuantity = rejectedQuantity;
  }


  public MerchantSingleOrderReturnLineResponse orderLine(MerchantOrderLineResponse orderLine) {
    
    this.orderLine = orderLine;
    return this;
  }

   /**
   * Get orderLine
   * @return orderLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantOrderLineResponse getOrderLine() {
    return orderLine;
  }


  public void setOrderLine(MerchantOrderLineResponse orderLine) {
    this.orderLine = orderLine;
  }


  public MerchantSingleOrderReturnLineResponse shipmentStatus(ShipmentLineStatus shipmentStatus) {
    
    this.shipmentStatus = shipmentStatus;
    return this;
  }

   /**
   * Get shipmentStatus
   * @return shipmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShipmentLineStatus getShipmentStatus() {
    return shipmentStatus;
  }


  public void setShipmentStatus(ShipmentLineStatus shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }


  public MerchantSingleOrderReturnLineResponse quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of items of the product in this return.
   * minimum: 0
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of items of the product in this return.")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public MerchantSingleOrderReturnLineResponse extraData(Map<String, String> extraData) {
    
    this.extraData = extraData;
    return this;
  }

  public MerchantSingleOrderReturnLineResponse putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<String, String>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

   /**
   * Extra data on the returnline. Each item must have an unqiue key
   * @return extraData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra data on the returnline. Each item must have an unqiue key")

  public Map<String, String> getExtraData() {
    return extraData;
  }


  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantSingleOrderReturnLineResponse merchantSingleOrderReturnLineResponse = (MerchantSingleOrderReturnLineResponse) o;
    return Objects.equals(this.merchantProductNo, merchantSingleOrderReturnLineResponse.merchantProductNo) &&
        Objects.equals(this.acceptedQuantity, merchantSingleOrderReturnLineResponse.acceptedQuantity) &&
        Objects.equals(this.rejectedQuantity, merchantSingleOrderReturnLineResponse.rejectedQuantity) &&
        Objects.equals(this.orderLine, merchantSingleOrderReturnLineResponse.orderLine) &&
        Objects.equals(this.shipmentStatus, merchantSingleOrderReturnLineResponse.shipmentStatus) &&
        Objects.equals(this.quantity, merchantSingleOrderReturnLineResponse.quantity) &&
        Objects.equals(this.extraData, merchantSingleOrderReturnLineResponse.extraData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantProductNo, acceptedQuantity, rejectedQuantity, orderLine, shipmentStatus, quantity, extraData);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantSingleOrderReturnLineResponse {\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    acceptedQuantity: ").append(toIndentedString(acceptedQuantity)).append("\n");
    sb.append("    rejectedQuantity: ").append(toIndentedString(rejectedQuantity)).append("\n");
    sb.append("    orderLine: ").append(toIndentedString(orderLine)).append("\n");
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
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

