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
 * Gets or Sets ShipmentLineStatus
 */
@JsonAdapter(ShipmentLineStatus.Adapter.class)
public enum ShipmentLineStatus {
  
  SHIPPED("SHIPPED"),
  
  IN_BACKORDER("IN_BACKORDER"),
  
  MANCO("MANCO");

  private String value;

  ShipmentLineStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShipmentLineStatus fromValue(String value) {
    for (ShipmentLineStatus b : ShipmentLineStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ShipmentLineStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShipmentLineStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShipmentLineStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ShipmentLineStatus.fromValue(value);
    }
  }
}

