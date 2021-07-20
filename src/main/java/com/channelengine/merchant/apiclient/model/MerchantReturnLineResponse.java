/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.8
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

/**
 * MerchantReturnLineResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantReturnLineResponse {
  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_ORDER_LINE = "OrderLine";
  @SerializedName(SERIALIZED_NAME_ORDER_LINE)
  private MerchantOrderLineResponse orderLine;

  public static final String SERIALIZED_NAME_SHIPMENT_STATUS = "ShipmentStatus";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_STATUS)
  private ShipmentLineStatus shipmentStatus;

  public static final String SERIALIZED_NAME_QUANTITY = "Quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;


  public MerchantReturnLineResponse merchantProductNo(String merchantProductNo) {
    
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


  public MerchantReturnLineResponse orderLine(MerchantOrderLineResponse orderLine) {
    
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


  public MerchantReturnLineResponse shipmentStatus(ShipmentLineStatus shipmentStatus) {
    
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


  public MerchantReturnLineResponse quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of items of the product in this return.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Number of items of the product in this return.")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantReturnLineResponse merchantReturnLineResponse = (MerchantReturnLineResponse) o;
    return Objects.equals(this.merchantProductNo, merchantReturnLineResponse.merchantProductNo) &&
        Objects.equals(this.orderLine, merchantReturnLineResponse.orderLine) &&
        Objects.equals(this.shipmentStatus, merchantReturnLineResponse.shipmentStatus) &&
        Objects.equals(this.quantity, merchantReturnLineResponse.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantProductNo, orderLine, shipmentStatus, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantReturnLineResponse {\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    orderLine: ").append(toIndentedString(orderLine)).append("\n");
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

