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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ChannelChannelResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelChannelResponse {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "ChannelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private Integer channelId;

  public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_CHANNEL_NAME = "ChannelName";
  @SerializedName(SERIALIZED_NAME_CHANNEL_NAME)
  private String channelName;


  public ChannelChannelResponse channelId(Integer channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * The ID of the Channel.
   * @return channelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Channel.")

  public Integer getChannelId() {
    return channelId;
  }


  public void setChannelId(Integer channelId) {
    this.channelId = channelId;
  }


  public ChannelChannelResponse isEnabled(Boolean isEnabled) {
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * A boolean value indicating whether the Channel is enabled.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean value indicating whether the Channel is enabled.")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public ChannelChannelResponse channelName(String channelName) {
    
    this.channelName = channelName;
    return this;
  }

   /**
   * The name of the Channel.
   * @return channelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the Channel.")

  public String getChannelName() {
    return channelName;
  }


  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelChannelResponse channelChannelResponse = (ChannelChannelResponse) o;
    return Objects.equals(this.channelId, channelChannelResponse.channelId) &&
        Objects.equals(this.isEnabled, channelChannelResponse.isEnabled) &&
        Objects.equals(this.channelName, channelChannelResponse.channelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, isEnabled, channelName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelChannelResponse {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
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

