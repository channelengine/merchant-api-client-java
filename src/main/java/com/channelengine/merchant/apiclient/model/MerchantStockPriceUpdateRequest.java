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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MerchantStockPriceUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantStockPriceUpdateRequest {
  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_STOCK = "Stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private Integer stock;

  public static final String SERIALIZED_NAME_PRICE = "Price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_STOCK_LOCATION_ID = "StockLocationId";
  @SerializedName(SERIALIZED_NAME_STOCK_LOCATION_ID)
  private Integer stockLocationId;


  public MerchantStockPriceUpdateRequest merchantProductNo(String merchantProductNo) {
    
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


  public MerchantStockPriceUpdateRequest stock(Integer stock) {
    
    this.stock = stock;
    return this;
  }

   /**
   * The stock of the product. Should not be negative.
   * minimum: 0
   * @return stock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stock of the product. Should not be negative.")

  public Integer getStock() {
    return stock;
  }


  public void setStock(Integer stock) {
    this.stock = stock;
  }


  public MerchantStockPriceUpdateRequest price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of the product. Should not be negative.
   * minimum: 0
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The price of the product. Should not be negative.")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public MerchantStockPriceUpdateRequest stockLocationId(Integer stockLocationId) {
    
    this.stockLocationId = stockLocationId;
    return this;
  }

   /**
   * The stock location id of updated stok.  If not provided stock from default stock location will be updated.
   * @return stockLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stock location id of updated stok.  If not provided stock from default stock location will be updated.")

  public Integer getStockLocationId() {
    return stockLocationId;
  }


  public void setStockLocationId(Integer stockLocationId) {
    this.stockLocationId = stockLocationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantStockPriceUpdateRequest merchantStockPriceUpdateRequest = (MerchantStockPriceUpdateRequest) o;
    return Objects.equals(this.merchantProductNo, merchantStockPriceUpdateRequest.merchantProductNo) &&
        Objects.equals(this.stock, merchantStockPriceUpdateRequest.stock) &&
        Objects.equals(this.price, merchantStockPriceUpdateRequest.price) &&
        Objects.equals(this.stockLocationId, merchantStockPriceUpdateRequest.stockLocationId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantProductNo, stock, price, stockLocationId);
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
    sb.append("class MerchantStockPriceUpdateRequest {\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stockLocationId: ").append(toIndentedString(stockLocationId)).append("\n");
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

