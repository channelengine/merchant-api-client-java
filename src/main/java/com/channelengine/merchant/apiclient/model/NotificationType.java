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
 * Gets or Sets NotificationType
 */
@JsonAdapter(NotificationType.Adapter.class)
public enum NotificationType {
  
  CHANNEL_ORDER_ANONYMIZED_BY_REQUEST("CHANNEL_ORDER_ANONYMIZED_BY_REQUEST"),
  
  CHANNEL_ORDER_ANONYMIZED_AUTOMATICALLY("CHANNEL_ORDER_ANONYMIZED_AUTOMATICALLY"),
  
  CHANNEL_ORDER_CANCELLATION_REQUEST_NEW("CHANNEL_ORDER_CANCELLATION_REQUEST_NEW"),
  
  CHANNEL_ORDER_CORRECTION_NEEDED("CHANNEL_ORDER_CORRECTION_NEEDED"),
  
  CHANNEL_ORDER_DUPLICATE_LINE("CHANNEL_ORDER_DUPLICATE_LINE"),
  
  CHANNEL_ORDER_INVOICE_SEND_FAILED("CHANNEL_ORDER_INVOICE_SEND_FAILED"),
  
  CHANNEL_ORDER_IMPORT_FAILED("CHANNEL_ORDER_IMPORT_FAILED"),
  
  CHANNEL_ORDER_NEW("CHANNEL_ORDER_NEW"),
  
  CHANNEL_ORDER_OVERDUE("CHANNEL_ORDER_OVERDUE"),
  
  CHANNEL_PRODUCT_DATA_EXPORT_FAILED("CHANNEL_PRODUCT_DATA_EXPORT_FAILED"),
  
  CHANNEL_PRODUCT_DATA_IMPORT_FAILED("CHANNEL_PRODUCT_DATA_IMPORT_FAILED"),
  
  CHANNEL_RETURN_EXPORT_FAILED("CHANNEL_RETURN_EXPORT_FAILED"),
  
  CHANNEL_RETURN_IMPORT_FAILED("CHANNEL_RETURN_IMPORT_FAILED"),
  
  CHANNEL_RETURN_NEW("CHANNEL_RETURN_NEW"),
  
  CHANNEL_RETURN_OVERDUE("CHANNEL_RETURN_OVERDUE"),
  
  CHANNEL_REFUND_EXPORT_FAILED("CHANNEL_REFUND_EXPORT_FAILED"),
  
  CHANNEL_SHIPMENT_IMPORT_FAILED("CHANNEL_SHIPMENT_IMPORT_FAILED"),
  
  CHANNEL_SHIPMENT_IMPORT_STATUS_FAILED("CHANNEL_SHIPMENT_IMPORT_STATUS_FAILED"),
  
  CHANNEL_SHIPMENT_EXPORT_FAILED("CHANNEL_SHIPMENT_EXPORT_FAILED"),
  
  CHANNEL_SHIPMENT_IMPORT_MISSING_LINE_FAILED("CHANNEL_SHIPMENT_IMPORT_MISSING_LINE_FAILED"),
  
  CHANNEL_FULFILLMENT_SHIPMENT_IMPORT_STATUS_FAILED("CHANNEL_FULFILLMENT_SHIPMENT_IMPORT_STATUS_FAILED"),
  
  CHANNEL_FULFILLMENT_SHIPMENT_EXPORT_FAILED("CHANNEL_FULFILLMENT_SHIPMENT_EXPORT_FAILED"),
  
  CHANNEL_FULFILLMENT_SHIPMENT_EXPORT_SUCCEEDED("CHANNEL_FULFILLMENT_SHIPMENT_EXPORT_SUCCEEDED"),
  
  CHANNEL_FULFILLMENT_SHIPMENT_LINE_FOR_CLOSED_ORDER("CHANNEL_FULFILLMENT_SHIPMENT_LINE_FOR_CLOSED_ORDER"),
  
  CHANNELENGINE_SUPPORT_NOTIFICATION("CHANNELENGINE_SUPPORT_NOTIFICATION"),
  
  CHANNELENGINE_WEBHOOK_RQUEST_FAILED("CHANNELENGINE_WEBHOOK_RQUEST_FAILED"),
  
  FEED_NO_PRODUCTS_FAILED("FEED_NO_PRODUCTS_FAILED"),
  
  FEED_IMPORT_FAILED("FEED_IMPORT_FAILED"),
  
  GLOBAL_MESSAGE("GLOBAL_MESSAGE"),
  
  MERCHANT_ORDER_EXPORT_FAILED("MERCHANT_ORDER_EXPORT_FAILED"),
  
  PLUGIN_INVALID_SETTING("PLUGIN_INVALID_SETTING"),
  
  PLUGIN_DEACTIVATED("PLUGIN_DEACTIVATED"),
  
  PRODUCT_BUNDLE_IMPORT_FAILED("PRODUCT_BUNDLE_IMPORT_FAILED"),
  
  CHANNEL_REFUND_LINE_ITEMS_ERROR("CHANNEL_REFUND_LINE_ITEMS_ERROR"),
  
  CHANNEL_CANCELLATION_EXPORT_FAILED("CHANNEL_CANCELLATION_EXPORT_FAILED"),
  
  MERCHANT_ORDER_EXPORT_LINES_CANCELLED("MERCHANT_ORDER_EXPORT_LINES_CANCELLED"),
  
  OAUTH_REFRESH_TOKEN_EXPIRATION("OAUTH_REFRESH_TOKEN_EXPIRATION"),
  
  MERCHANT_CANCELLATION_IMPORT_FAILED("MERCHANT_CANCELLATION_IMPORT_FAILED"),
  
  CHANNEL_ORDER_TOO_LONG_ON_NEW("CHANNEL_ORDER_TOO_LONG_ON_NEW"),
  
  MERCHANT_STOCK_UPDATE_FAILED("MERCHANT_STOCK_UPDATE_FAILED"),
  
  FEED_INVALID_PRODUCTS_OCCURED("FEED_INVALID_PRODUCTS_OCCURED"),
  
  CHANNEL_SHIPMENT_EXPORT_INVALID_MERCHANTSHIPMENTNO("CHANNEL_SHIPMENT_EXPORT_INVALID_MERCHANTSHIPMENTNO"),
  
  CHANNEL_PRODUCT_OFFER_EXPORT_FAILED("CHANNEL_PRODUCT_OFFER_EXPORT_FAILED"),
  
  TRANSLATION_IMAGE_TAGS_BROKEN("TRANSLATION_IMAGE_TAGS_BROKEN"),
  
  CHANNEL_RETURN_DELETED("CHANNEL_RETURN_DELETED"),
  
  TAX_PROVIDER_NOT_ACTIVATED("TAX_PROVIDER_NOT_ACTIVATED"),
  
  STOCK_LOCATION_NOT_FOUND("STOCK_LOCATION_NOT_FOUND"),
  
  CUSTOM_VAT_RATE_OVERLAPPING_RATES("CUSTOM_VAT_RATE_OVERLAPPING_RATES"),
  
  TRANSLATION_FAILED("TRANSLATION_FAILED"),
  
  ORDER_CANNOT_BE_FULFILLED("ORDER_CANNOT_BE_FULFILLED");

  private String value;

  NotificationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NotificationType fromValue(String value) {
    for (NotificationType b : NotificationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NotificationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NotificationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NotificationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NotificationType.fromValue(value);
    }
  }
}

