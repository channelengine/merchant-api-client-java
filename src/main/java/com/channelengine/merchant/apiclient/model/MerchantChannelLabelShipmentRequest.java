/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.MerchantShipmentLineRequest;
import com.channelengine.merchant.apiclient.model.MerchantShipmentPackageDimensionsRequest;
import com.channelengine.merchant.apiclient.model.MerchantShipmentPackageWeightRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MerchantChannelLabelShipmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantChannelLabelShipmentRequest {
  public static final String SERIALIZED_NAME_DIMENSIONS = "Dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private MerchantShipmentPackageDimensionsRequest dimensions;

  public static final String SERIALIZED_NAME_WEIGHT = "Weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private MerchantShipmentPackageWeightRequest weight;

  public static final String SERIALIZED_NAME_CHANNEL_METHOD_CODE = "ChannelMethodCode";
  @SerializedName(SERIALIZED_NAME_CHANNEL_METHOD_CODE)
  private String channelMethodCode;

  public static final String SERIALIZED_NAME_MERCHANT_SHIPMENT_NO = "MerchantShipmentNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_SHIPMENT_NO)
  private String merchantShipmentNo;

  public static final String SERIALIZED_NAME_MERCHANT_ORDER_NO = "MerchantOrderNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_NO)
  private String merchantOrderNo;

  public static final String SERIALIZED_NAME_SHIPPED_FROM_COUNTRY_CODE = "ShippedFromCountryCode";
  @SerializedName(SERIALIZED_NAME_SHIPPED_FROM_COUNTRY_CODE)
  private String shippedFromCountryCode;

  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<MerchantShipmentLineRequest> lines = new ArrayList<MerchantShipmentLineRequest>();


  public MerchantChannelLabelShipmentRequest dimensions(MerchantShipmentPackageDimensionsRequest dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(required = true, value = "")

  public MerchantShipmentPackageDimensionsRequest getDimensions() {
    return dimensions;
  }


  public void setDimensions(MerchantShipmentPackageDimensionsRequest dimensions) {
    this.dimensions = dimensions;
  }


  public MerchantChannelLabelShipmentRequest weight(MerchantShipmentPackageWeightRequest weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "")

  public MerchantShipmentPackageWeightRequest getWeight() {
    return weight;
  }


  public void setWeight(MerchantShipmentPackageWeightRequest weight) {
    this.weight = weight;
  }


  public MerchantChannelLabelShipmentRequest channelMethodCode(String channelMethodCode) {
    
    this.channelMethodCode = channelMethodCode;
    return this;
  }

   /**
   * Get channelMethodCode
   * @return channelMethodCode
  **/
  @ApiModelProperty(required = true, value = "")

  public String getChannelMethodCode() {
    return channelMethodCode;
  }


  public void setChannelMethodCode(String channelMethodCode) {
    this.channelMethodCode = channelMethodCode;
  }


  public MerchantChannelLabelShipmentRequest merchantShipmentNo(String merchantShipmentNo) {
    
    this.merchantShipmentNo = merchantShipmentNo;
    return this;
  }

   /**
   * The unique shipment reference used by the Merchant.
   * @return merchantShipmentNo
  **/
  @ApiModelProperty(required = true, value = "The unique shipment reference used by the Merchant.")

  public String getMerchantShipmentNo() {
    return merchantShipmentNo;
  }


  public void setMerchantShipmentNo(String merchantShipmentNo) {
    this.merchantShipmentNo = merchantShipmentNo;
  }


  public MerchantChannelLabelShipmentRequest merchantOrderNo(String merchantOrderNo) {
    
    this.merchantOrderNo = merchantOrderNo;
    return this;
  }

   /**
   * The unique order reference used by the Merchant.
   * @return merchantOrderNo
  **/
  @ApiModelProperty(required = true, value = "The unique order reference used by the Merchant.")

  public String getMerchantOrderNo() {
    return merchantOrderNo;
  }


  public void setMerchantOrderNo(String merchantOrderNo) {
    this.merchantOrderNo = merchantOrderNo;
  }


  public MerchantChannelLabelShipmentRequest shippedFromCountryCode(String shippedFromCountryCode) {
    
    this.shippedFromCountryCode = shippedFromCountryCode;
    return this;
  }

   /**
   * The code of the country from where the package is being shipped.
   * @return shippedFromCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The code of the country from where the package is being shipped.")

  public String getShippedFromCountryCode() {
    return shippedFromCountryCode;
  }


  public void setShippedFromCountryCode(String shippedFromCountryCode) {
    this.shippedFromCountryCode = shippedFromCountryCode;
  }


  public MerchantChannelLabelShipmentRequest lines(List<MerchantShipmentLineRequest> lines) {
    
    this.lines = lines;
    return this;
  }

  public MerchantChannelLabelShipmentRequest addLinesItem(MerchantShipmentLineRequest linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "")

  public List<MerchantShipmentLineRequest> getLines() {
    return lines;
  }


  public void setLines(List<MerchantShipmentLineRequest> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantChannelLabelShipmentRequest merchantChannelLabelShipmentRequest = (MerchantChannelLabelShipmentRequest) o;
    return Objects.equals(this.dimensions, merchantChannelLabelShipmentRequest.dimensions) &&
        Objects.equals(this.weight, merchantChannelLabelShipmentRequest.weight) &&
        Objects.equals(this.channelMethodCode, merchantChannelLabelShipmentRequest.channelMethodCode) &&
        Objects.equals(this.merchantShipmentNo, merchantChannelLabelShipmentRequest.merchantShipmentNo) &&
        Objects.equals(this.merchantOrderNo, merchantChannelLabelShipmentRequest.merchantOrderNo) &&
        Objects.equals(this.shippedFromCountryCode, merchantChannelLabelShipmentRequest.shippedFromCountryCode) &&
        Objects.equals(this.lines, merchantChannelLabelShipmentRequest.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, weight, channelMethodCode, merchantShipmentNo, merchantOrderNo, shippedFromCountryCode, lines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantChannelLabelShipmentRequest {\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    channelMethodCode: ").append(toIndentedString(channelMethodCode)).append("\n");
    sb.append("    merchantShipmentNo: ").append(toIndentedString(merchantShipmentNo)).append("\n");
    sb.append("    merchantOrderNo: ").append(toIndentedString(merchantOrderNo)).append("\n");
    sb.append("    shippedFromCountryCode: ").append(toIndentedString(shippedFromCountryCode)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

