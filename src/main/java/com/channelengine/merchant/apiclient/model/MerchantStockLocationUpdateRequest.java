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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MerchantStockLocationUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantStockLocationUpdateRequest {
  public static final String SERIALIZED_NAME_STOCK = "Stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private Integer stock;

  public static final String SERIALIZED_NAME_STOCK_LOCATION_ID = "StockLocationId";
  @SerializedName(SERIALIZED_NAME_STOCK_LOCATION_ID)
  private Integer stockLocationId;


  public MerchantStockLocationUpdateRequest stock(Integer stock) {
    
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


  public MerchantStockLocationUpdateRequest stockLocationId(Integer stockLocationId) {
    
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
    MerchantStockLocationUpdateRequest merchantStockLocationUpdateRequest = (MerchantStockLocationUpdateRequest) o;
    return Objects.equals(this.stock, merchantStockLocationUpdateRequest.stock) &&
        Objects.equals(this.stockLocationId, merchantStockLocationUpdateRequest.stockLocationId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(stock, stockLocationId);
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
    sb.append("class MerchantStockLocationUpdateRequest {\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
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

