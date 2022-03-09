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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SingleOfDictionaryOfStringAndListOfString
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SingleOfDictionaryOfStringAndListOfString {
  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Map<String, List<String>> content = null;

  public static final String SERIALIZED_NAME_STATUS_CODE = "StatusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_LOG_ID = "LogId";
  @SerializedName(SERIALIZED_NAME_LOG_ID)
  private Integer logId;

  public static final String SERIALIZED_NAME_SUCCESS = "Success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "ValidationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private Map<String, List<String>> validationErrors = null;


  public SingleOfDictionaryOfStringAndListOfString content(Map<String, List<String>> content) {
    
    this.content = content;
    return this;
  }

  public SingleOfDictionaryOfStringAndListOfString putContentItem(String key, List<String> contentItem) {
    if (this.content == null) {
      this.content = new HashMap<String, List<String>>();
    }
    this.content.put(key, contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getContent() {
    return content;
  }


  public void setContent(Map<String, List<String>> content) {
    this.content = content;
  }


  public SingleOfDictionaryOfStringAndListOfString statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public SingleOfDictionaryOfStringAndListOfString logId(Integer logId) {
    
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLogId() {
    return logId;
  }


  public void setLogId(Integer logId) {
    this.logId = logId;
  }


  public SingleOfDictionaryOfStringAndListOfString success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public SingleOfDictionaryOfStringAndListOfString message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SingleOfDictionaryOfStringAndListOfString validationErrors(Map<String, List<String>> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public SingleOfDictionaryOfStringAndListOfString putValidationErrorsItem(String key, List<String> validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new HashMap<String, List<String>>();
    }
    this.validationErrors.put(key, validationErrorsItem);
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(Map<String, List<String>> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleOfDictionaryOfStringAndListOfString singleOfDictionaryOfStringAndListOfString = (SingleOfDictionaryOfStringAndListOfString) o;
    return Objects.equals(this.content, singleOfDictionaryOfStringAndListOfString.content) &&
        Objects.equals(this.statusCode, singleOfDictionaryOfStringAndListOfString.statusCode) &&
        Objects.equals(this.logId, singleOfDictionaryOfStringAndListOfString.logId) &&
        Objects.equals(this.success, singleOfDictionaryOfStringAndListOfString.success) &&
        Objects.equals(this.message, singleOfDictionaryOfStringAndListOfString.message) &&
        Objects.equals(this.validationErrors, singleOfDictionaryOfStringAndListOfString.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, statusCode, logId, success, message, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleOfDictionaryOfStringAndListOfString {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

