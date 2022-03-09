/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.12
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

/**
 * MerchantShipmentTrackingRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantShipmentTrackingRequest {
  public static final String SERIALIZED_NAME_METHOD = "Method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_TRACK_TRACE_NO = "TrackTraceNo";
  @SerializedName(SERIALIZED_NAME_TRACK_TRACE_NO)
  private String trackTraceNo;

  public static final String SERIALIZED_NAME_RETURN_TRACK_TRACE_NO = "ReturnTrackTraceNo";
  @SerializedName(SERIALIZED_NAME_RETURN_TRACK_TRACE_NO)
  private String returnTrackTraceNo;

  public static final String SERIALIZED_NAME_TRACK_TRACE_URL = "TrackTraceUrl";
  @SerializedName(SERIALIZED_NAME_TRACK_TRACE_URL)
  private String trackTraceUrl;

  public static final String SERIALIZED_NAME_SHIPPED_FROM_COUNTRY_CODE = "ShippedFromCountryCode";
  @SerializedName(SERIALIZED_NAME_SHIPPED_FROM_COUNTRY_CODE)
  private String shippedFromCountryCode;


  public MerchantShipmentTrackingRequest method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Shipment method (carrier).
   * @return method
  **/
  @ApiModelProperty(required = true, value = "Shipment method (carrier).")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public MerchantShipmentTrackingRequest trackTraceNo(String trackTraceNo) {
    
    this.trackTraceNo = trackTraceNo;
    return this;
  }

   /**
   * The unique shipping reference used by the Shipping carrier (track &amp; trace number).
   * @return trackTraceNo
  **/
  @ApiModelProperty(required = true, value = "The unique shipping reference used by the Shipping carrier (track & trace number).")

  public String getTrackTraceNo() {
    return trackTraceNo;
  }


  public void setTrackTraceNo(String trackTraceNo) {
    this.trackTraceNo = trackTraceNo;
  }


  public MerchantShipmentTrackingRequest returnTrackTraceNo(String returnTrackTraceNo) {
    
    this.returnTrackTraceNo = returnTrackTraceNo;
    return this;
  }

   /**
   * The unique return shipping reference that may be used by the Shipping carrier (track &amp; trace number) if the shipment is returned.
   * @return returnTrackTraceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique return shipping reference that may be used by the Shipping carrier (track & trace number) if the shipment is returned.")

  public String getReturnTrackTraceNo() {
    return returnTrackTraceNo;
  }


  public void setReturnTrackTraceNo(String returnTrackTraceNo) {
    this.returnTrackTraceNo = returnTrackTraceNo;
  }


  public MerchantShipmentTrackingRequest trackTraceUrl(String trackTraceUrl) {
    
    this.trackTraceUrl = trackTraceUrl;
    return this;
  }

   /**
   * A link to a page of the carrier where the customer can track the shipping of her package.
   * @return trackTraceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A link to a page of the carrier where the customer can track the shipping of her package.")

  public String getTrackTraceUrl() {
    return trackTraceUrl;
  }


  public void setTrackTraceUrl(String trackTraceUrl) {
    this.trackTraceUrl = trackTraceUrl;
  }


  public MerchantShipmentTrackingRequest shippedFromCountryCode(String shippedFromCountryCode) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantShipmentTrackingRequest merchantShipmentTrackingRequest = (MerchantShipmentTrackingRequest) o;
    return Objects.equals(this.method, merchantShipmentTrackingRequest.method) &&
        Objects.equals(this.trackTraceNo, merchantShipmentTrackingRequest.trackTraceNo) &&
        Objects.equals(this.returnTrackTraceNo, merchantShipmentTrackingRequest.returnTrackTraceNo) &&
        Objects.equals(this.trackTraceUrl, merchantShipmentTrackingRequest.trackTraceUrl) &&
        Objects.equals(this.shippedFromCountryCode, merchantShipmentTrackingRequest.shippedFromCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, trackTraceNo, returnTrackTraceNo, trackTraceUrl, shippedFromCountryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantShipmentTrackingRequest {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    trackTraceNo: ").append(toIndentedString(trackTraceNo)).append("\n");
    sb.append("    returnTrackTraceNo: ").append(toIndentedString(returnTrackTraceNo)).append("\n");
    sb.append("    trackTraceUrl: ").append(toIndentedString(trackTraceUrl)).append("\n");
    sb.append("    shippedFromCountryCode: ").append(toIndentedString(shippedFromCountryCode)).append("\n");
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

