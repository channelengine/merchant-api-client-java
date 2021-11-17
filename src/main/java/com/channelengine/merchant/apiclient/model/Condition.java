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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Condition
 */
@JsonAdapter(Condition.Adapter.class)
public enum Condition {
  
  NEW("NEW"),
  
  NEW_REFURBISHED("NEW_REFURBISHED"),
  
  USED_AS_NEW("USED_AS_NEW"),
  
  USED_GOOD("USED_GOOD"),
  
  USED_REASONABLE("USED_REASONABLE"),
  
  USED_MEDIOCRE("USED_MEDIOCRE"),
  
  UNKNOWN("UNKNOWN"),
  
  USED_VERY_GOOD("USED_VERY_GOOD");

  private String value;

  Condition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Condition fromValue(String value) {
    for (Condition b : Condition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Condition> {
    @Override
    public void write(final JsonWriter jsonWriter, final Condition enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Condition read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Condition.fromValue(value);
    }
  }
}

