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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OrderStatusView
 */
@JsonAdapter(OrderStatusView.Adapter.class)
public enum OrderStatusView {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  SHIPPED("SHIPPED"),
  
  IN_BACKORDER("IN_BACKORDER"),
  
  MANCO("MANCO"),
  
  CANCELED("CANCELED"),
  
  IN_COMBI("IN_COMBI"),
  
  CLOSED("CLOSED"),
  
  NEW("NEW"),
  
  RETURNED("RETURNED"),
  
  REQUIRES_CORRECTION("REQUIRES_CORRECTION"),
  
  AWAITING_PAYMENT("AWAITING_PAYMENT");

  private String value;

  OrderStatusView(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderStatusView fromValue(String value) {
    for (OrderStatusView b : OrderStatusView.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OrderStatusView> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderStatusView enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrderStatusView read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderStatusView.fromValue(value);
    }
  }
}

