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
import com.channelengine.merchant.apiclient.model.WebhookEventType;
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
 * MerchantWebhookRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantWebhookRequest {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "Url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "IsActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_EVENTS = "Events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<WebhookEventType> events = new ArrayList<WebhookEventType>();


  public MerchantWebhookRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The unique webhook name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The unique webhook name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MerchantWebhookRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The callback URL using by the webhook.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The callback URL using by the webhook.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public MerchantWebhookRequest isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Determining if the webhook should be active and callbacks should proceed or not.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determining if the webhook should be active and callbacks should proceed or not.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public MerchantWebhookRequest events(List<WebhookEventType> events) {
    
    this.events = events;
    return this;
  }

  public MerchantWebhookRequest addEventsItem(WebhookEventType eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Events supported by the webhook.
   * @return events
  **/
  @ApiModelProperty(required = true, value = "Events supported by the webhook.")

  public List<WebhookEventType> getEvents() {
    return events;
  }


  public void setEvents(List<WebhookEventType> events) {
    this.events = events;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantWebhookRequest merchantWebhookRequest = (MerchantWebhookRequest) o;
    return Objects.equals(this.name, merchantWebhookRequest.name) &&
        Objects.equals(this.url, merchantWebhookRequest.url) &&
        Objects.equals(this.isActive, merchantWebhookRequest.isActive) &&
        Objects.equals(this.events, merchantWebhookRequest.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, isActive, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantWebhookRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

