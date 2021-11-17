/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.ListedProductChannelStatus;
import com.channelengine.merchant.apiclient.model.ListedProductExportStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ChannelListedProductResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelListedProductResponse {
  public static final String SERIALIZED_NAME_CHANNEL_STATUS = "ChannelStatus";
  @SerializedName(SERIALIZED_NAME_CHANNEL_STATUS)
  private ListedProductChannelStatus channelStatus;

  public static final String SERIALIZED_NAME_EAN = "Ean";
  @SerializedName(SERIALIZED_NAME_EAN)
  private String ean;

  public static final String SERIALIZED_NAME_EXPORT_STATUS = "ExportStatus";
  @SerializedName(SERIALIZED_NAME_EXPORT_STATUS)
  private ListedProductExportStatus exportStatus;

  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_LAST_EXPORTED_PRICE = "LastExportedPrice";
  @SerializedName(SERIALIZED_NAME_LAST_EXPORTED_PRICE)
  private BigDecimal lastExportedPrice;

  public static final String SERIALIZED_NAME_LAST_EXPORTED_STOCK = "LastExportedStock";
  @SerializedName(SERIALIZED_NAME_LAST_EXPORTED_STOCK)
  private Integer lastExportedStock;


  public ChannelListedProductResponse channelStatus(ListedProductChannelStatus channelStatus) {
    
    this.channelStatus = channelStatus;
    return this;
  }

   /**
   * Get channelStatus
   * @return channelStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListedProductChannelStatus getChannelStatus() {
    return channelStatus;
  }


  public void setChannelStatus(ListedProductChannelStatus channelStatus) {
    this.channelStatus = channelStatus;
  }


   /**
   * EAN
   * @return ean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EAN")

  public String getEan() {
    return ean;
  }




  public ChannelListedProductResponse exportStatus(ListedProductExportStatus exportStatus) {
    
    this.exportStatus = exportStatus;
    return this;
  }

   /**
   * Get exportStatus
   * @return exportStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListedProductExportStatus getExportStatus() {
    return exportStatus;
  }


  public void setExportStatus(ListedProductExportStatus exportStatus) {
    this.exportStatus = exportStatus;
  }


   /**
   * Your product number (SKU)
   * @return merchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your product number (SKU)")

  public String getMerchantProductNo() {
    return merchantProductNo;
  }




  public ChannelListedProductResponse lastExportedPrice(BigDecimal lastExportedPrice) {
    
    this.lastExportedPrice = lastExportedPrice;
    return this;
  }

   /**
   * Your product last exported price
   * @return lastExportedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your product last exported price")

  public BigDecimal getLastExportedPrice() {
    return lastExportedPrice;
  }


  public void setLastExportedPrice(BigDecimal lastExportedPrice) {
    this.lastExportedPrice = lastExportedPrice;
  }


  public ChannelListedProductResponse lastExportedStock(Integer lastExportedStock) {
    
    this.lastExportedStock = lastExportedStock;
    return this;
  }

   /**
   * Your product last exported stock
   * @return lastExportedStock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your product last exported stock")

  public Integer getLastExportedStock() {
    return lastExportedStock;
  }


  public void setLastExportedStock(Integer lastExportedStock) {
    this.lastExportedStock = lastExportedStock;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelListedProductResponse channelListedProductResponse = (ChannelListedProductResponse) o;
    return Objects.equals(this.channelStatus, channelListedProductResponse.channelStatus) &&
        Objects.equals(this.ean, channelListedProductResponse.ean) &&
        Objects.equals(this.exportStatus, channelListedProductResponse.exportStatus) &&
        Objects.equals(this.merchantProductNo, channelListedProductResponse.merchantProductNo) &&
        Objects.equals(this.lastExportedPrice, channelListedProductResponse.lastExportedPrice) &&
        Objects.equals(this.lastExportedStock, channelListedProductResponse.lastExportedStock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelStatus, ean, exportStatus, merchantProductNo, lastExportedPrice, lastExportedStock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelListedProductResponse {\n");
    sb.append("    channelStatus: ").append(toIndentedString(channelStatus)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    lastExportedPrice: ").append(toIndentedString(lastExportedPrice)).append("\n");
    sb.append("    lastExportedStock: ").append(toIndentedString(lastExportedStock)).append("\n");
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

