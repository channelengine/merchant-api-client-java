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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets FulfillmentType
 */
@JsonAdapter(FulfillmentType.Adapter.class)
public enum FulfillmentType {
  
  ALL("ALL"),
  
  ONLY_MERCHANT("ONLY_MERCHANT"),
  
  ONLY_CHANNEL("ONLY_CHANNEL"),
  
  MIXED("MIXED"),
  
  INCLUDES_MERCHANT("INCLUDES_MERCHANT");

  private String value;

  FulfillmentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FulfillmentType fromValue(String value) {
    for (FulfillmentType b : FulfillmentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FulfillmentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FulfillmentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FulfillmentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FulfillmentType.fromValue(value);
    }
  }
}

