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
 * Gets or Sets ChannelCarrierCollectionMethodApi
 */
@JsonAdapter(ChannelCarrierCollectionMethodApi.Adapter.class)
public enum ChannelCarrierCollectionMethodApi {
  
  DROP_OFF("DROP_OFF"),
  
  PICK_UP("PICK_UP");

  private String value;

  ChannelCarrierCollectionMethodApi(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChannelCarrierCollectionMethodApi fromValue(String value) {
    for (ChannelCarrierCollectionMethodApi b : ChannelCarrierCollectionMethodApi.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ChannelCarrierCollectionMethodApi> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChannelCarrierCollectionMethodApi enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChannelCarrierCollectionMethodApi read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChannelCarrierCollectionMethodApi.fromValue(value);
    }
  }
}

