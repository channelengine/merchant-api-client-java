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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ReturnReason
 */
@JsonAdapter(ReturnReason.Adapter.class)
public enum ReturnReason {
  
  PRODUCT_DEFECT("PRODUCT_DEFECT"),
  
  PRODUCT_UNSATISFACTORY("PRODUCT_UNSATISFACTORY"),
  
  WRONG_PRODUCT("WRONG_PRODUCT"),
  
  TOO_MANY_PRODUCTS("TOO_MANY_PRODUCTS"),
  
  REFUSED("REFUSED"),
  
  REFUSED_DAMAGED("REFUSED_DAMAGED"),
  
  WRONG_ADDRESS("WRONG_ADDRESS"),
  
  NOT_COLLECTED("NOT_COLLECTED"),
  
  WRONG_SIZE("WRONG_SIZE"),
  
  OTHER("OTHER");

  private String value;

  ReturnReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReturnReason fromValue(String value) {
    for (ReturnReason b : ReturnReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReturnReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReturnReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReturnReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReturnReason.fromValue(value);
    }
  }
}

