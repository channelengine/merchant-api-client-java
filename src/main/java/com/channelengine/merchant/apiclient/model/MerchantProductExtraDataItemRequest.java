/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.ExtraDataType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MerchantProductExtraDataItemRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantProductExtraDataItemRequest {
  public static final String SERIALIZED_NAME_KEY = "Key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ExtraDataType type;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "IsPublic";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic;


  public MerchantProductExtraDataItemRequest key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Name of the extra data field.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the extra data field.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public MerchantProductExtraDataItemRequest value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value of the extra data field.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the extra data field.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public MerchantProductExtraDataItemRequest type(ExtraDataType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExtraDataType getType() {
    return type;
  }


  public void setType(ExtraDataType type) {
    this.type = type;
  }


  public MerchantProductExtraDataItemRequest isPublic(Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Add this field to the export of the product feed to the channel.
   * @return isPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add this field to the export of the product feed to the channel.")

  public Boolean getIsPublic() {
    return isPublic;
  }


  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantProductExtraDataItemRequest merchantProductExtraDataItemRequest = (MerchantProductExtraDataItemRequest) o;
    return Objects.equals(this.key, merchantProductExtraDataItemRequest.key) &&
        Objects.equals(this.value, merchantProductExtraDataItemRequest.value) &&
        Objects.equals(this.type, merchantProductExtraDataItemRequest.type) &&
        Objects.equals(this.isPublic, merchantProductExtraDataItemRequest.isPublic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, type, isPublic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProductExtraDataItemRequest {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
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

