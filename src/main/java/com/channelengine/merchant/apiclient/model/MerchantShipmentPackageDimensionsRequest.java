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
import com.channelengine.merchant.apiclient.model.PackageDimensionsUnit;
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
 * MerchantShipmentPackageDimensionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantShipmentPackageDimensionsRequest {
  public static final String SERIALIZED_NAME_HEIGHT = "Height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private BigDecimal height;

  public static final String SERIALIZED_NAME_WIDTH = "Width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private BigDecimal width;

  public static final String SERIALIZED_NAME_LENGTH = "Length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private BigDecimal length;

  public static final String SERIALIZED_NAME_UNIT = "Unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private PackageDimensionsUnit unit;


  public MerchantShipmentPackageDimensionsRequest height(BigDecimal height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getHeight() {
    return height;
  }


  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  public MerchantShipmentPackageDimensionsRequest width(BigDecimal width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getWidth() {
    return width;
  }


  public void setWidth(BigDecimal width) {
    this.width = width;
  }


  public MerchantShipmentPackageDimensionsRequest length(BigDecimal length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getLength() {
    return length;
  }


  public void setLength(BigDecimal length) {
    this.length = length;
  }


  public MerchantShipmentPackageDimensionsRequest unit(PackageDimensionsUnit unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PackageDimensionsUnit getUnit() {
    return unit;
  }


  public void setUnit(PackageDimensionsUnit unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantShipmentPackageDimensionsRequest merchantShipmentPackageDimensionsRequest = (MerchantShipmentPackageDimensionsRequest) o;
    return Objects.equals(this.height, merchantShipmentPackageDimensionsRequest.height) &&
        Objects.equals(this.width, merchantShipmentPackageDimensionsRequest.width) &&
        Objects.equals(this.length, merchantShipmentPackageDimensionsRequest.length) &&
        Objects.equals(this.unit, merchantShipmentPackageDimensionsRequest.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, length, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantShipmentPackageDimensionsRequest {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

