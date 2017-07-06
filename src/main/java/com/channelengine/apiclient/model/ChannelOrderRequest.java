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
import com.channelengine.apiclient.model.ChannelOrderLineRequest;
import com.channelengine.apiclient.model.EntitiesAddressModels;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * ChannelOrderRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-06T10:28:35.519+02:00")
public class ChannelOrderRequest {
  @SerializedName("ChannelOrderNo")
  private String channelOrderNo = null;

  @SerializedName("Lines")
  private List<ChannelOrderLineRequest> lines = new ArrayList<ChannelOrderLineRequest>();

  @SerializedName("Phone")
  private String phone = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("CompanyRegistrationNo")
  private String companyRegistrationNo = null;

  @SerializedName("VatNo")
  private String vatNo = null;

  @SerializedName("PaymentMethod")
  private String paymentMethod = null;

  @SerializedName("ShippingCostsInclVat")
  private Double shippingCostsInclVat = null;

  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  @SerializedName("OrderDate")
  private DateTime orderDate = null;

  @SerializedName("ChannelCustomerNo")
  private String channelCustomerNo = null;

  @SerializedName("BillingAddress")
  private EntitiesAddressModels billingAddress = null;

  @SerializedName("ShippingAddress")
  private EntitiesAddressModels shippingAddress = null;

  @SerializedName("ExtraData")
  private Map<String, String> extraData = new HashMap<String, String>();

  public ChannelOrderRequest channelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
    return this;
  }

   /**
   * The unique order reference used by the Channel
   * @return channelOrderNo
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique order reference used by the Channel")
  public String getChannelOrderNo() {
    return channelOrderNo;
  }

  public void setChannelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
  }

  public ChannelOrderRequest lines(List<ChannelOrderLineRequest> lines) {
    this.lines = lines;
    return this;
  }

  public ChannelOrderRequest addLinesItem(ChannelOrderLineRequest linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * The order lines
   * @return lines
  **/
  @ApiModelProperty(example = "null", required = true, value = "The order lines")
  public List<ChannelOrderLineRequest> getLines() {
    return lines;
  }

  public void setLines(List<ChannelOrderLineRequest> lines) {
    this.lines = lines;
  }

  public ChannelOrderRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ChannelOrderRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ChannelOrderRequest companyRegistrationNo(String companyRegistrationNo) {
    this.companyRegistrationNo = companyRegistrationNo;
    return this;
  }

   /**
   * Get companyRegistrationNo
   * @return companyRegistrationNo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCompanyRegistrationNo() {
    return companyRegistrationNo;
  }

  public void setCompanyRegistrationNo(String companyRegistrationNo) {
    this.companyRegistrationNo = companyRegistrationNo;
  }

  public ChannelOrderRequest vatNo(String vatNo) {
    this.vatNo = vatNo;
    return this;
  }

   /**
   * Get vatNo
   * @return vatNo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVatNo() {
    return vatNo;
  }

  public void setVatNo(String vatNo) {
    this.vatNo = vatNo;
  }

  public ChannelOrderRequest paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public ChannelOrderRequest shippingCostsInclVat(Double shippingCostsInclVat) {
    this.shippingCostsInclVat = shippingCostsInclVat;
    return this;
  }

   /**
   * The shipping fee including VAT  (in the tenant's base currency calculated using the exchange rate at the time of ordering).
   * @return shippingCostsInclVat
  **/
  @ApiModelProperty(example = "null", required = true, value = "The shipping fee including VAT  (in the tenant's base currency calculated using the exchange rate at the time of ordering).")
  public Double getShippingCostsInclVat() {
    return shippingCostsInclVat;
  }

  public void setShippingCostsInclVat(Double shippingCostsInclVat) {
    this.shippingCostsInclVat = shippingCostsInclVat;
  }

  public ChannelOrderRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ChannelOrderRequest orderDate(DateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Get orderDate
   * @return orderDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(DateTime orderDate) {
    this.orderDate = orderDate;
  }

  public ChannelOrderRequest channelCustomerNo(String channelCustomerNo) {
    this.channelCustomerNo = channelCustomerNo;
    return this;
  }

   /**
   * Get channelCustomerNo
   * @return channelCustomerNo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChannelCustomerNo() {
    return channelCustomerNo;
  }

  public void setChannelCustomerNo(String channelCustomerNo) {
    this.channelCustomerNo = channelCustomerNo;
  }

  public ChannelOrderRequest billingAddress(EntitiesAddressModels billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EntitiesAddressModels getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(EntitiesAddressModels billingAddress) {
    this.billingAddress = billingAddress;
  }

  public ChannelOrderRequest shippingAddress(EntitiesAddressModels shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EntitiesAddressModels getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(EntitiesAddressModels shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public ChannelOrderRequest extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public ChannelOrderRequest putExtraDataItem(String key, String extraDataItem) {
    this.extraData.put(key, extraDataItem);
    return this;
  }

   /**
   * Get extraData
   * @return extraData
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getExtraData() {
    return extraData;
  }

  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelOrderRequest channelOrderRequest = (ChannelOrderRequest) o;
    return Objects.equals(this.channelOrderNo, channelOrderRequest.channelOrderNo) &&
        Objects.equals(this.lines, channelOrderRequest.lines) &&
        Objects.equals(this.phone, channelOrderRequest.phone) &&
        Objects.equals(this.email, channelOrderRequest.email) &&
        Objects.equals(this.companyRegistrationNo, channelOrderRequest.companyRegistrationNo) &&
        Objects.equals(this.vatNo, channelOrderRequest.vatNo) &&
        Objects.equals(this.paymentMethod, channelOrderRequest.paymentMethod) &&
        Objects.equals(this.shippingCostsInclVat, channelOrderRequest.shippingCostsInclVat) &&
        Objects.equals(this.currencyCode, channelOrderRequest.currencyCode) &&
        Objects.equals(this.orderDate, channelOrderRequest.orderDate) &&
        Objects.equals(this.channelCustomerNo, channelOrderRequest.channelCustomerNo) &&
        Objects.equals(this.billingAddress, channelOrderRequest.billingAddress) &&
        Objects.equals(this.shippingAddress, channelOrderRequest.shippingAddress) &&
        Objects.equals(this.extraData, channelOrderRequest.extraData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelOrderNo, lines, phone, email, companyRegistrationNo, vatNo, paymentMethod, shippingCostsInclVat, currencyCode, orderDate, channelCustomerNo, billingAddress, shippingAddress, extraData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelOrderRequest {\n");
    
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    companyRegistrationNo: ").append(toIndentedString(companyRegistrationNo)).append("\n");
    sb.append("    vatNo: ").append(toIndentedString(vatNo)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    shippingCostsInclVat: ").append(toIndentedString(shippingCostsInclVat)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    channelCustomerNo: ").append(toIndentedString(channelCustomerNo)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
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

