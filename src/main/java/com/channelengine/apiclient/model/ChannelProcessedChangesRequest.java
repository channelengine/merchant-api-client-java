/*
 * ChannelEngine API V2
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.apiclient.model;

import java.util.Objects;
import com.channelengine.apiclient.model.ChannelReferencesRequest;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelProcessedChangesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-06T12:09:51.366+02:00")
public class ChannelProcessedChangesRequest {
  @SerializedName("Created")
  private List<ChannelReferencesRequest> created = new ArrayList<ChannelReferencesRequest>();

  @SerializedName("Updated")
  private List<String> updated = new ArrayList<String>();

  @SerializedName("Removed")
  private List<String> removed = new ArrayList<String>();

  public ChannelProcessedChangesRequest created(List<ChannelReferencesRequest> created) {
    this.created = created;
    return this;
  }

  public ChannelProcessedChangesRequest addCreatedItem(ChannelReferencesRequest createdItem) {
    this.created.add(createdItem);
    return this;
  }

   /**
   * A collection of pairs of merchant and channel references  of the products which are successfully created. The channel references  are saved such that in subsequent calls these can be used instead of the   merchant references.
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "A collection of pairs of merchant and channel references  of the products which are successfully created. The channel references  are saved such that in subsequent calls these can be used instead of the   merchant references.")
  public List<ChannelReferencesRequest> getCreated() {
    return created;
  }

  public void setCreated(List<ChannelReferencesRequest> created) {
    this.created = created;
  }

  public ChannelProcessedChangesRequest updated(List<String> updated) {
    this.updated = updated;
    return this;
  }

  public ChannelProcessedChangesRequest addUpdatedItem(String updatedItem) {
    this.updated.add(updatedItem);
    return this;
  }

   /**
   * The channel references of the products which are successfully updated.
   * @return updated
  **/
  @ApiModelProperty(example = "null", value = "The channel references of the products which are successfully updated.")
  public List<String> getUpdated() {
    return updated;
  }

  public void setUpdated(List<String> updated) {
    this.updated = updated;
  }

  public ChannelProcessedChangesRequest removed(List<String> removed) {
    this.removed = removed;
    return this;
  }

  public ChannelProcessedChangesRequest addRemovedItem(String removedItem) {
    this.removed.add(removedItem);
    return this;
  }

   /**
   * The channel references of the products which are successfully removed.
   * @return removed
  **/
  @ApiModelProperty(example = "null", value = "The channel references of the products which are successfully removed.")
  public List<String> getRemoved() {
    return removed;
  }

  public void setRemoved(List<String> removed) {
    this.removed = removed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelProcessedChangesRequest channelProcessedChangesRequest = (ChannelProcessedChangesRequest) o;
    return Objects.equals(this.created, channelProcessedChangesRequest.created) &&
        Objects.equals(this.updated, channelProcessedChangesRequest.updated) &&
        Objects.equals(this.removed, channelProcessedChangesRequest.removed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, removed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelProcessedChangesRequest {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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

