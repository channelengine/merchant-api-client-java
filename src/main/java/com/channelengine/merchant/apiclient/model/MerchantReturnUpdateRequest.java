/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.MerchantReturnLineUpdateRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MerchantReturnUpdateRequest
 */

public class MerchantReturnUpdateRequest {
  @SerializedName("ReturnId")
  private Integer returnId = null;

  @SerializedName("Lines")
  private List<MerchantReturnLineUpdateRequest> lines = new ArrayList<MerchantReturnLineUpdateRequest>();

  public MerchantReturnUpdateRequest returnId(Integer returnId) {
    this.returnId = returnId;
    return this;
  }

   /**
   * The ChannelEngine return ID of the return you would like to update
   * @return returnId
  **/
  @ApiModelProperty(required = true, value = "The ChannelEngine return ID of the return you would like to update")
  public Integer getReturnId() {
    return returnId;
  }

  public void setReturnId(Integer returnId) {
    this.returnId = returnId;
  }

  public MerchantReturnUpdateRequest lines(List<MerchantReturnLineUpdateRequest> lines) {
    this.lines = lines;
    return this;
  }

  public MerchantReturnUpdateRequest addLinesItem(MerchantReturnLineUpdateRequest linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "")
  public List<MerchantReturnLineUpdateRequest> getLines() {
    return lines;
  }

  public void setLines(List<MerchantReturnLineUpdateRequest> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantReturnUpdateRequest merchantReturnUpdateRequest = (MerchantReturnUpdateRequest) o;
    return Objects.equals(this.returnId, merchantReturnUpdateRequest.returnId) &&
        Objects.equals(this.lines, merchantReturnUpdateRequest.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnId, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantReturnUpdateRequest {\n");
    
    sb.append("    returnId: ").append(toIndentedString(returnId)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

