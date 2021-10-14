/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.9
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
import org.threeten.bp.OffsetDateTime;

/**
 * MerchantOfferGetStockResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantOfferGetStockResponse {
  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_STOCK_LOCATION_ID = "StockLocationId";
  @SerializedName(SERIALIZED_NAME_STOCK_LOCATION_ID)
  private Integer stockLocationId;

  public static final String SERIALIZED_NAME_STOCK = "Stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private Integer stock;

  public static final String SERIALIZED_NAME_UPDATED_AT = "UpdatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public MerchantOfferGetStockResponse merchantProductNo(String merchantProductNo) {
    
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * The product SKU.
   * @return merchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The product SKU.")

  public String getMerchantProductNo() {
    return merchantProductNo;
  }


  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }


  public MerchantOfferGetStockResponse stockLocationId(Integer stockLocationId) {
    
    this.stockLocationId = stockLocationId;
    return this;
  }

   /**
   * The ChannelEngine id of the stock location.
   * @return stockLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ChannelEngine id of the stock location.")

  public Integer getStockLocationId() {
    return stockLocationId;
  }


  public void setStockLocationId(Integer stockLocationId) {
    this.stockLocationId = stockLocationId;
  }


  public MerchantOfferGetStockResponse stock(Integer stock) {
    
    this.stock = stock;
    return this;
  }

   /**
   * The quantity of products in stock at the stock location.
   * @return stock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quantity of products in stock at the stock location.")

  public Integer getStock() {
    return stock;
  }


  public void setStock(Integer stock) {
    this.stock = stock;
  }


  public MerchantOfferGetStockResponse updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The timestamp of the last stock update for the stock location.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the last stock update for the stock location.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantOfferGetStockResponse merchantOfferGetStockResponse = (MerchantOfferGetStockResponse) o;
    return Objects.equals(this.merchantProductNo, merchantOfferGetStockResponse.merchantProductNo) &&
        Objects.equals(this.stockLocationId, merchantOfferGetStockResponse.stockLocationId) &&
        Objects.equals(this.stock, merchantOfferGetStockResponse.stock) &&
        Objects.equals(this.updatedAt, merchantOfferGetStockResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantProductNo, stockLocationId, stock, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantOfferGetStockResponse {\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    stockLocationId: ").append(toIndentedString(stockLocationId)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

