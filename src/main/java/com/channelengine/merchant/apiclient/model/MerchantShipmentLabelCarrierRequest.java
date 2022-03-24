/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.10.0
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
 * MerchantShipmentLabelCarrierRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantShipmentLabelCarrierRequest {
  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<MerchantShipmentLineRequest> lines = new ArrayList<MerchantShipmentLineRequest>();

  public static final String SERIALIZED_NAME_DIMENSIONS = "Dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private MerchantShipmentPackageDimensionsRequest dimensions;

  public static final String SERIALIZED_NAME_WEIGHT = "Weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private MerchantShipmentPackageWeightRequest weight;


  public MerchantShipmentLabelCarrierRequest lines(List<MerchantShipmentLineRequest> lines) {
    
    this.lines = lines;
    return this;
  }

  public MerchantShipmentLabelCarrierRequest addLinesItem(MerchantShipmentLineRequest linesItem) {
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


  public MerchantShipmentLabelCarrierRequest dimensions(MerchantShipmentPackageDimensionsRequest dimensions) {
    
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


  public MerchantShipmentLabelCarrierRequest weight(MerchantShipmentPackageWeightRequest weight) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantShipmentLabelCarrierRequest merchantShipmentLabelCarrierRequest = (MerchantShipmentLabelCarrierRequest) o;
    return Objects.equals(this.lines, merchantShipmentLabelCarrierRequest.lines) &&
        Objects.equals(this.dimensions, merchantShipmentLabelCarrierRequest.dimensions) &&
        Objects.equals(this.weight, merchantShipmentLabelCarrierRequest.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lines, dimensions, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantShipmentLabelCarrierRequest {\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

