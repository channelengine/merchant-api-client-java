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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * AdvanceSettingsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdvanceSettingsResponse {
  public static final String SERIALIZED_NAME_MANAGE_STOCK = "ManageStock";
  @SerializedName(SERIALIZED_NAME_MANAGE_STOCK)
  private Boolean manageStock;

  public static final String SERIALIZED_NAME_DISABLE_ADDRESS_VALIDATION = "DisableAddressValidation";
  @SerializedName(SERIALIZED_NAME_DISABLE_ADDRESS_VALIDATION)
  private Boolean disableAddressValidation;

  public static final String SERIALIZED_NAME_SKIP_HOUSE_NUMBER_VALIDATION = "SkipHouseNumberValidation";
  @SerializedName(SERIALIZED_NAME_SKIP_HOUSE_NUMBER_VALIDATION)
  private Boolean skipHouseNumberValidation;

  public static final String SERIALIZED_NAME_SKIP_HOUSE_NUMBER_VALIDATION_FOR_COUNTRY_CODES = "SkipHouseNumberValidationForCountryCodes";
  @SerializedName(SERIALIZED_NAME_SKIP_HOUSE_NUMBER_VALIDATION_FOR_COUNTRY_CODES)
  private List<String> skipHouseNumberValidationForCountryCodes = null;

  public static final String SERIALIZED_NAME_SET_ORDERS_TO_CLOSED_ON_IMPORT = "SetOrdersToClosedOnImport";
  @SerializedName(SERIALIZED_NAME_SET_ORDERS_TO_CLOSED_ON_IMPORT)
  private Boolean setOrdersToClosedOnImport;

  public static final String SERIALIZED_NAME_DISABLE_STOCK_RESERVATION = "DisableStockReservation";
  @SerializedName(SERIALIZED_NAME_DISABLE_STOCK_RESERVATION)
  private Boolean disableStockReservation;

  public static final String SERIALIZED_NAME_DISABLE_AUTO_ORDER_CANCELLATION = "DisableAutoOrderCancellation";
  @SerializedName(SERIALIZED_NAME_DISABLE_AUTO_ORDER_CANCELLATION)
  private Boolean disableAutoOrderCancellation;

  public static final String SERIALIZED_NAME_AUTOMATICALLY_SET_PHONE_NUMBER_IF_EMPTY = "AutomaticallySetPhoneNumberIfEmpty";
  @SerializedName(SERIALIZED_NAME_AUTOMATICALLY_SET_PHONE_NUMBER_IF_EMPTY)
  private String automaticallySetPhoneNumberIfEmpty;

  public static final String SERIALIZED_NAME_DEFAULT_VAT_RATE = "DefaultVatRate";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VAT_RATE)
  private BigDecimal defaultVatRate;

  public static final String SERIALIZED_NAME_ORDER_TOO_LONG_ON_NEW_HOURS_OFFSET = "OrderTooLongOnNewHoursOffset";
  @SerializedName(SERIALIZED_NAME_ORDER_TOO_LONG_ON_NEW_HOURS_OFFSET)
  private Integer orderTooLongOnNewHoursOffset;


  public AdvanceSettingsResponse manageStock(Boolean manageStock) {
    
    this.manageStock = manageStock;
    return this;
  }

   /**
   * Get manageStock
   * @return manageStock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getManageStock() {
    return manageStock;
  }


  public void setManageStock(Boolean manageStock) {
    this.manageStock = manageStock;
  }


  public AdvanceSettingsResponse disableAddressValidation(Boolean disableAddressValidation) {
    
    this.disableAddressValidation = disableAddressValidation;
    return this;
  }

   /**
   * Get disableAddressValidation
   * @return disableAddressValidation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisableAddressValidation() {
    return disableAddressValidation;
  }


  public void setDisableAddressValidation(Boolean disableAddressValidation) {
    this.disableAddressValidation = disableAddressValidation;
  }


  public AdvanceSettingsResponse skipHouseNumberValidation(Boolean skipHouseNumberValidation) {
    
    this.skipHouseNumberValidation = skipHouseNumberValidation;
    return this;
  }

   /**
   * Get skipHouseNumberValidation
   * @return skipHouseNumberValidation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSkipHouseNumberValidation() {
    return skipHouseNumberValidation;
  }


  public void setSkipHouseNumberValidation(Boolean skipHouseNumberValidation) {
    this.skipHouseNumberValidation = skipHouseNumberValidation;
  }


  public AdvanceSettingsResponse skipHouseNumberValidationForCountryCodes(List<String> skipHouseNumberValidationForCountryCodes) {
    
    this.skipHouseNumberValidationForCountryCodes = skipHouseNumberValidationForCountryCodes;
    return this;
  }

  public AdvanceSettingsResponse addSkipHouseNumberValidationForCountryCodesItem(String skipHouseNumberValidationForCountryCodesItem) {
    if (this.skipHouseNumberValidationForCountryCodes == null) {
      this.skipHouseNumberValidationForCountryCodes = new ArrayList<String>();
    }
    this.skipHouseNumberValidationForCountryCodes.add(skipHouseNumberValidationForCountryCodesItem);
    return this;
  }

   /**
   * Get skipHouseNumberValidationForCountryCodes
   * @return skipHouseNumberValidationForCountryCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSkipHouseNumberValidationForCountryCodes() {
    return skipHouseNumberValidationForCountryCodes;
  }


  public void setSkipHouseNumberValidationForCountryCodes(List<String> skipHouseNumberValidationForCountryCodes) {
    this.skipHouseNumberValidationForCountryCodes = skipHouseNumberValidationForCountryCodes;
  }


  public AdvanceSettingsResponse setOrdersToClosedOnImport(Boolean setOrdersToClosedOnImport) {
    
    this.setOrdersToClosedOnImport = setOrdersToClosedOnImport;
    return this;
  }

   /**
   * Get setOrdersToClosedOnImport
   * @return setOrdersToClosedOnImport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSetOrdersToClosedOnImport() {
    return setOrdersToClosedOnImport;
  }


  public void setSetOrdersToClosedOnImport(Boolean setOrdersToClosedOnImport) {
    this.setOrdersToClosedOnImport = setOrdersToClosedOnImport;
  }


  public AdvanceSettingsResponse disableStockReservation(Boolean disableStockReservation) {
    
    this.disableStockReservation = disableStockReservation;
    return this;
  }

   /**
   * Get disableStockReservation
   * @return disableStockReservation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisableStockReservation() {
    return disableStockReservation;
  }


  public void setDisableStockReservation(Boolean disableStockReservation) {
    this.disableStockReservation = disableStockReservation;
  }


  public AdvanceSettingsResponse disableAutoOrderCancellation(Boolean disableAutoOrderCancellation) {
    
    this.disableAutoOrderCancellation = disableAutoOrderCancellation;
    return this;
  }

   /**
   * Get disableAutoOrderCancellation
   * @return disableAutoOrderCancellation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisableAutoOrderCancellation() {
    return disableAutoOrderCancellation;
  }


  public void setDisableAutoOrderCancellation(Boolean disableAutoOrderCancellation) {
    this.disableAutoOrderCancellation = disableAutoOrderCancellation;
  }


  public AdvanceSettingsResponse automaticallySetPhoneNumberIfEmpty(String automaticallySetPhoneNumberIfEmpty) {
    
    this.automaticallySetPhoneNumberIfEmpty = automaticallySetPhoneNumberIfEmpty;
    return this;
  }

   /**
   * Get automaticallySetPhoneNumberIfEmpty
   * @return automaticallySetPhoneNumberIfEmpty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAutomaticallySetPhoneNumberIfEmpty() {
    return automaticallySetPhoneNumberIfEmpty;
  }


  public void setAutomaticallySetPhoneNumberIfEmpty(String automaticallySetPhoneNumberIfEmpty) {
    this.automaticallySetPhoneNumberIfEmpty = automaticallySetPhoneNumberIfEmpty;
  }


  public AdvanceSettingsResponse defaultVatRate(BigDecimal defaultVatRate) {
    
    this.defaultVatRate = defaultVatRate;
    return this;
  }

   /**
   * Get defaultVatRate
   * @return defaultVatRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDefaultVatRate() {
    return defaultVatRate;
  }


  public void setDefaultVatRate(BigDecimal defaultVatRate) {
    this.defaultVatRate = defaultVatRate;
  }


  public AdvanceSettingsResponse orderTooLongOnNewHoursOffset(Integer orderTooLongOnNewHoursOffset) {
    
    this.orderTooLongOnNewHoursOffset = orderTooLongOnNewHoursOffset;
    return this;
  }

   /**
   * Get orderTooLongOnNewHoursOffset
   * @return orderTooLongOnNewHoursOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrderTooLongOnNewHoursOffset() {
    return orderTooLongOnNewHoursOffset;
  }


  public void setOrderTooLongOnNewHoursOffset(Integer orderTooLongOnNewHoursOffset) {
    this.orderTooLongOnNewHoursOffset = orderTooLongOnNewHoursOffset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvanceSettingsResponse advanceSettingsResponse = (AdvanceSettingsResponse) o;
    return Objects.equals(this.manageStock, advanceSettingsResponse.manageStock) &&
        Objects.equals(this.disableAddressValidation, advanceSettingsResponse.disableAddressValidation) &&
        Objects.equals(this.skipHouseNumberValidation, advanceSettingsResponse.skipHouseNumberValidation) &&
        Objects.equals(this.skipHouseNumberValidationForCountryCodes, advanceSettingsResponse.skipHouseNumberValidationForCountryCodes) &&
        Objects.equals(this.setOrdersToClosedOnImport, advanceSettingsResponse.setOrdersToClosedOnImport) &&
        Objects.equals(this.disableStockReservation, advanceSettingsResponse.disableStockReservation) &&
        Objects.equals(this.disableAutoOrderCancellation, advanceSettingsResponse.disableAutoOrderCancellation) &&
        Objects.equals(this.automaticallySetPhoneNumberIfEmpty, advanceSettingsResponse.automaticallySetPhoneNumberIfEmpty) &&
        Objects.equals(this.defaultVatRate, advanceSettingsResponse.defaultVatRate) &&
        Objects.equals(this.orderTooLongOnNewHoursOffset, advanceSettingsResponse.orderTooLongOnNewHoursOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manageStock, disableAddressValidation, skipHouseNumberValidation, skipHouseNumberValidationForCountryCodes, setOrdersToClosedOnImport, disableStockReservation, disableAutoOrderCancellation, automaticallySetPhoneNumberIfEmpty, defaultVatRate, orderTooLongOnNewHoursOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvanceSettingsResponse {\n");
    sb.append("    manageStock: ").append(toIndentedString(manageStock)).append("\n");
    sb.append("    disableAddressValidation: ").append(toIndentedString(disableAddressValidation)).append("\n");
    sb.append("    skipHouseNumberValidation: ").append(toIndentedString(skipHouseNumberValidation)).append("\n");
    sb.append("    skipHouseNumberValidationForCountryCodes: ").append(toIndentedString(skipHouseNumberValidationForCountryCodes)).append("\n");
    sb.append("    setOrdersToClosedOnImport: ").append(toIndentedString(setOrdersToClosedOnImport)).append("\n");
    sb.append("    disableStockReservation: ").append(toIndentedString(disableStockReservation)).append("\n");
    sb.append("    disableAutoOrderCancellation: ").append(toIndentedString(disableAutoOrderCancellation)).append("\n");
    sb.append("    automaticallySetPhoneNumberIfEmpty: ").append(toIndentedString(automaticallySetPhoneNumberIfEmpty)).append("\n");
    sb.append("    defaultVatRate: ").append(toIndentedString(defaultVatRate)).append("\n");
    sb.append("    orderTooLongOnNewHoursOffset: ").append(toIndentedString(orderTooLongOnNewHoursOffset)).append("\n");
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

