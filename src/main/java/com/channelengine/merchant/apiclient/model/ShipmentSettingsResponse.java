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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ShipmentSettingsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ShipmentSettingsResponse {
  public static final String SERIALIZED_NAME_DEFAULT_TRACKED_SHIPMENT_METHOD = "DefaultTrackedShipmentMethod";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TRACKED_SHIPMENT_METHOD)
  private String defaultTrackedShipmentMethod;

  public static final String SERIALIZED_NAME_DEFAULT_UNTRACKED_SHIPMENT_METHOD = "DefaultUntrackedShipmentMethod";
  @SerializedName(SERIALIZED_NAME_DEFAULT_UNTRACKED_SHIPMENT_METHOD)
  private String defaultUntrackedShipmentMethod;

  public static final String SERIALIZED_NAME_AUTOMATICALLY_SET_SHIPMENT_METHOD_AFTER_MINUTES = "AutomaticallySetShipmentMethodAfterMinutes";
  @SerializedName(SERIALIZED_NAME_AUTOMATICALLY_SET_SHIPMENT_METHOD_AFTER_MINUTES)
  private Integer automaticallySetShipmentMethodAfterMinutes;


  public ShipmentSettingsResponse defaultTrackedShipmentMethod(String defaultTrackedShipmentMethod) {
    
    this.defaultTrackedShipmentMethod = defaultTrackedShipmentMethod;
    return this;
  }

   /**
   * Get defaultTrackedShipmentMethod
   * @return defaultTrackedShipmentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultTrackedShipmentMethod() {
    return defaultTrackedShipmentMethod;
  }


  public void setDefaultTrackedShipmentMethod(String defaultTrackedShipmentMethod) {
    this.defaultTrackedShipmentMethod = defaultTrackedShipmentMethod;
  }


  public ShipmentSettingsResponse defaultUntrackedShipmentMethod(String defaultUntrackedShipmentMethod) {
    
    this.defaultUntrackedShipmentMethod = defaultUntrackedShipmentMethod;
    return this;
  }

   /**
   * Get defaultUntrackedShipmentMethod
   * @return defaultUntrackedShipmentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultUntrackedShipmentMethod() {
    return defaultUntrackedShipmentMethod;
  }


  public void setDefaultUntrackedShipmentMethod(String defaultUntrackedShipmentMethod) {
    this.defaultUntrackedShipmentMethod = defaultUntrackedShipmentMethod;
  }


  public ShipmentSettingsResponse automaticallySetShipmentMethodAfterMinutes(Integer automaticallySetShipmentMethodAfterMinutes) {
    
    this.automaticallySetShipmentMethodAfterMinutes = automaticallySetShipmentMethodAfterMinutes;
    return this;
  }

   /**
   * Get automaticallySetShipmentMethodAfterMinutes
   * @return automaticallySetShipmentMethodAfterMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAutomaticallySetShipmentMethodAfterMinutes() {
    return automaticallySetShipmentMethodAfterMinutes;
  }


  public void setAutomaticallySetShipmentMethodAfterMinutes(Integer automaticallySetShipmentMethodAfterMinutes) {
    this.automaticallySetShipmentMethodAfterMinutes = automaticallySetShipmentMethodAfterMinutes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentSettingsResponse shipmentSettingsResponse = (ShipmentSettingsResponse) o;
    return Objects.equals(this.defaultTrackedShipmentMethod, shipmentSettingsResponse.defaultTrackedShipmentMethod) &&
        Objects.equals(this.defaultUntrackedShipmentMethod, shipmentSettingsResponse.defaultUntrackedShipmentMethod) &&
        Objects.equals(this.automaticallySetShipmentMethodAfterMinutes, shipmentSettingsResponse.automaticallySetShipmentMethodAfterMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTrackedShipmentMethod, defaultUntrackedShipmentMethod, automaticallySetShipmentMethodAfterMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentSettingsResponse {\n");
    sb.append("    defaultTrackedShipmentMethod: ").append(toIndentedString(defaultTrackedShipmentMethod)).append("\n");
    sb.append("    defaultUntrackedShipmentMethod: ").append(toIndentedString(defaultUntrackedShipmentMethod)).append("\n");
    sb.append("    automaticallySetShipmentMethodAfterMinutes: ").append(toIndentedString(automaticallySetShipmentMethodAfterMinutes)).append("\n");
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

