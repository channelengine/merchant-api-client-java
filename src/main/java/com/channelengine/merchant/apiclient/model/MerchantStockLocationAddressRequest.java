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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MerchantStockLocationAddressRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantStockLocationAddressRequest {
  public static final String SERIALIZED_NAME_COUNTRY_ISO = "CountryIso";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO)
  private String countryIso;

  public static final String SERIALIZED_NAME_STREET_NAME = "StreetName";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private String streetName;

  public static final String SERIALIZED_NAME_ZIP_CODE = "ZipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_HOUSE_NR = "HouseNr";
  @SerializedName(SERIALIZED_NAME_HOUSE_NR)
  private String houseNr;

  public static final String SERIALIZED_NAME_HOUSE_NR_ADDITION = "HouseNrAddition";
  @SerializedName(SERIALIZED_NAME_HOUSE_NR_ADDITION)
  private String houseNrAddition;

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;


  public MerchantStockLocationAddressRequest countryIso(String countryIso) {
    
    this.countryIso = countryIso;
    return this;
  }

   /**
   * Get countryIso
   * @return countryIso
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCountryIso() {
    return countryIso;
  }


  public void setCountryIso(String countryIso) {
    this.countryIso = countryIso;
  }


  public MerchantStockLocationAddressRequest streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public MerchantStockLocationAddressRequest zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public MerchantStockLocationAddressRequest houseNr(String houseNr) {
    
    this.houseNr = houseNr;
    return this;
  }

   /**
   * Get houseNr
   * @return houseNr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHouseNr() {
    return houseNr;
  }


  public void setHouseNr(String houseNr) {
    this.houseNr = houseNr;
  }


  public MerchantStockLocationAddressRequest houseNrAddition(String houseNrAddition) {
    
    this.houseNrAddition = houseNrAddition;
    return this;
  }

   /**
   * Get houseNrAddition
   * @return houseNrAddition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHouseNrAddition() {
    return houseNrAddition;
  }


  public void setHouseNrAddition(String houseNrAddition) {
    this.houseNrAddition = houseNrAddition;
  }


  public MerchantStockLocationAddressRequest city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public MerchantStockLocationAddressRequest region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantStockLocationAddressRequest merchantStockLocationAddressRequest = (MerchantStockLocationAddressRequest) o;
    return Objects.equals(this.countryIso, merchantStockLocationAddressRequest.countryIso) &&
        Objects.equals(this.streetName, merchantStockLocationAddressRequest.streetName) &&
        Objects.equals(this.zipCode, merchantStockLocationAddressRequest.zipCode) &&
        Objects.equals(this.houseNr, merchantStockLocationAddressRequest.houseNr) &&
        Objects.equals(this.houseNrAddition, merchantStockLocationAddressRequest.houseNrAddition) &&
        Objects.equals(this.city, merchantStockLocationAddressRequest.city) &&
        Objects.equals(this.region, merchantStockLocationAddressRequest.region);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryIso, streetName, zipCode, houseNr, houseNrAddition, city, region);
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
    sb.append("class MerchantStockLocationAddressRequest {\n");
    sb.append("    countryIso: ").append(toIndentedString(countryIso)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    houseNr: ").append(toIndentedString(houseNr)).append("\n");
    sb.append("    houseNrAddition: ").append(toIndentedString(houseNrAddition)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
