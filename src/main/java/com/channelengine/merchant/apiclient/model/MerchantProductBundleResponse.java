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
import com.channelengine.merchant.apiclient.model.MerchantProductBundlePartResponse;
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
 * MerchantProductBundleResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantProductBundleResponse {
  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_EAN = "Ean";
  @SerializedName(SERIALIZED_NAME_EAN)
  private String ean;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "Price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_PARTS = "Parts";
  @SerializedName(SERIALIZED_NAME_PARTS)
  private List<MerchantProductBundlePartResponse> parts = null;


  public MerchantProductBundleResponse merchantProductNo(String merchantProductNo) {
    
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * Get merchantProductNo
   * @return merchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMerchantProductNo() {
    return merchantProductNo;
  }


  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }


  public MerchantProductBundleResponse ean(String ean) {
    
    this.ean = ean;
    return this;
  }

   /**
   * Get ean
   * @return ean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEan() {
    return ean;
  }


  public void setEan(String ean) {
    this.ean = ean;
  }


  public MerchantProductBundleResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MerchantProductBundleResponse price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public MerchantProductBundleResponse parts(List<MerchantProductBundlePartResponse> parts) {
    
    this.parts = parts;
    return this;
  }

  public MerchantProductBundleResponse addPartsItem(MerchantProductBundlePartResponse partsItem) {
    if (this.parts == null) {
      this.parts = new ArrayList<MerchantProductBundlePartResponse>();
    }
    this.parts.add(partsItem);
    return this;
  }

   /**
   * Get parts
   * @return parts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MerchantProductBundlePartResponse> getParts() {
    return parts;
  }


  public void setParts(List<MerchantProductBundlePartResponse> parts) {
    this.parts = parts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantProductBundleResponse merchantProductBundleResponse = (MerchantProductBundleResponse) o;
    return Objects.equals(this.merchantProductNo, merchantProductBundleResponse.merchantProductNo) &&
        Objects.equals(this.ean, merchantProductBundleResponse.ean) &&
        Objects.equals(this.name, merchantProductBundleResponse.name) &&
        Objects.equals(this.price, merchantProductBundleResponse.price) &&
        Objects.equals(this.parts, merchantProductBundleResponse.parts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantProductNo, ean, name, price, parts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProductBundleResponse {\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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

