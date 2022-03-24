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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OrderSupport
 */
@JsonAdapter(OrderSupport.Adapter.class)
public enum OrderSupport {
  
  NONE("NONE"),
  
  ORDERS("ORDERS"),
  
  SPLIT_ORDERS("SPLIT_ORDERS"),
  
  SPLIT_ORDER_LINES("SPLIT_ORDER_LINES");

  private String value;

  OrderSupport(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderSupport fromValue(String value) {
    for (OrderSupport b : OrderSupport.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OrderSupport> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderSupport enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrderSupport read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderSupport.fromValue(value);
    }
  }
}

