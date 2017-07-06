/*
 * ChannelEngine API V2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.apiclient.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ModelApiResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-06T10:28:35.519+02:00")
public class ModelApiResponse {
  @SerializedName("StatusCode")
  private Integer statusCode = null;

  @SerializedName("Success")
  private Boolean success = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("ValidationErrors")
  private Map<String, List<String>> validationErrors = new HashMap<String, List<String>>();

  public ModelApiResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ModelApiResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ModelApiResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ModelApiResponse validationErrors(Map<String, List<String>> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ModelApiResponse putValidationErrorsItem(String key, List<String> validationErrorsItem) {
    this.validationErrors.put(key, validationErrorsItem);
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, List<String>> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(Map<String, List<String>> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiResponse _apiResponse = (ModelApiResponse) o;
    return Objects.equals(this.statusCode, _apiResponse.statusCode) &&
        Objects.equals(this.success, _apiResponse.success) &&
        Objects.equals(this.message, _apiResponse.message) &&
        Objects.equals(this.validationErrors, _apiResponse.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, success, message, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

