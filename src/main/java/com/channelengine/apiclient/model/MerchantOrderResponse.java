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
import com.channelengine.apiclient.model.EntitiesAddressModels;
import com.channelengine.apiclient.model.MerchantOrderLineResponse;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * MerchantOrderResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-06T12:09:51.366+02:00")
public class MerchantOrderResponse {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("ChannelName")
  private String channelName = null;

  /**
   * Gets or Sets channelOrderSupport
   */
  public enum ChannelOrderSupportEnum {
    @SerializedName("NONE")
    NONE("NONE"),
    
    @SerializedName("ORDERS")
    ORDERS("ORDERS"),
    
    @SerializedName("SPLIT_ORDERS")
    SPLIT_ORDERS("SPLIT_ORDERS"),
    
    @SerializedName("SPLIT_ORDER_LINES")
    SPLIT_ORDER_LINES("SPLIT_ORDER_LINES");

    private String value;

    ChannelOrderSupportEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ChannelOrderSupport")
  private ChannelOrderSupportEnum channelOrderSupport = null;

  @SerializedName("ChannelOrderNo")
  private String channelOrderNo = null;

  @SerializedName("Lines")
  private List<MerchantOrderLineResponse> lines = new ArrayList<MerchantOrderLineResponse>();

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

  public MerchantOrderResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier used by ChannelEngine. This identifier does  not have to be saved. It should only be used in a call to acknowledge the order.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier used by ChannelEngine. This identifier does  not have to be saved. It should only be used in a call to acknowledge the order.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MerchantOrderResponse channelName(String channelName) {
    this.channelName = channelName;
    return this;
  }

   /**
   * Get channelName
   * @return channelName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public MerchantOrderResponse channelOrderSupport(ChannelOrderSupportEnum channelOrderSupport) {
    this.channelOrderSupport = channelOrderSupport;
    return this;
  }

   /**
   * Get channelOrderSupport
   * @return channelOrderSupport
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelOrderSupportEnum getChannelOrderSupport() {
    return channelOrderSupport;
  }

  public void setChannelOrderSupport(ChannelOrderSupportEnum channelOrderSupport) {
    this.channelOrderSupport = channelOrderSupport;
  }

  public MerchantOrderResponse channelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
    return this;
  }

   /**
   * Get channelOrderNo
   * @return channelOrderNo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChannelOrderNo() {
    return channelOrderNo;
  }

  public void setChannelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
  }

  public MerchantOrderResponse lines(List<MerchantOrderLineResponse> lines) {
    this.lines = lines;
    return this;
  }

  public MerchantOrderResponse addLinesItem(MerchantOrderLineResponse linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MerchantOrderLineResponse> getLines() {
    return lines;
  }

  public void setLines(List<MerchantOrderLineResponse> lines) {
    this.lines = lines;
  }

  public MerchantOrderResponse phone(String phone) {
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

  public MerchantOrderResponse email(String email) {
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

  public MerchantOrderResponse companyRegistrationNo(String companyRegistrationNo) {
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

  public MerchantOrderResponse vatNo(String vatNo) {
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

  public MerchantOrderResponse paymentMethod(String paymentMethod) {
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

  public MerchantOrderResponse shippingCostsInclVat(Double shippingCostsInclVat) {
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

  public MerchantOrderResponse currencyCode(String currencyCode) {
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

  public MerchantOrderResponse orderDate(DateTime orderDate) {
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

  public MerchantOrderResponse channelCustomerNo(String channelCustomerNo) {
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

  public MerchantOrderResponse billingAddress(EntitiesAddressModels billingAddress) {
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

  public MerchantOrderResponse shippingAddress(EntitiesAddressModels shippingAddress) {
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

  public MerchantOrderResponse extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public MerchantOrderResponse putExtraDataItem(String key, String extraDataItem) {
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
    MerchantOrderResponse merchantOrderResponse = (MerchantOrderResponse) o;
    return Objects.equals(this.id, merchantOrderResponse.id) &&
        Objects.equals(this.channelName, merchantOrderResponse.channelName) &&
        Objects.equals(this.channelOrderSupport, merchantOrderResponse.channelOrderSupport) &&
        Objects.equals(this.channelOrderNo, merchantOrderResponse.channelOrderNo) &&
        Objects.equals(this.lines, merchantOrderResponse.lines) &&
        Objects.equals(this.phone, merchantOrderResponse.phone) &&
        Objects.equals(this.email, merchantOrderResponse.email) &&
        Objects.equals(this.companyRegistrationNo, merchantOrderResponse.companyRegistrationNo) &&
        Objects.equals(this.vatNo, merchantOrderResponse.vatNo) &&
        Objects.equals(this.paymentMethod, merchantOrderResponse.paymentMethod) &&
        Objects.equals(this.shippingCostsInclVat, merchantOrderResponse.shippingCostsInclVat) &&
        Objects.equals(this.currencyCode, merchantOrderResponse.currencyCode) &&
        Objects.equals(this.orderDate, merchantOrderResponse.orderDate) &&
        Objects.equals(this.channelCustomerNo, merchantOrderResponse.channelCustomerNo) &&
        Objects.equals(this.billingAddress, merchantOrderResponse.billingAddress) &&
        Objects.equals(this.shippingAddress, merchantOrderResponse.shippingAddress) &&
        Objects.equals(this.extraData, merchantOrderResponse.extraData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, channelName, channelOrderSupport, channelOrderNo, lines, phone, email, companyRegistrationNo, vatNo, paymentMethod, shippingCostsInclVat, currencyCode, orderDate, channelCustomerNo, billingAddress, shippingAddress, extraData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantOrderResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelOrderSupport: ").append(toIndentedString(channelOrderSupport)).append("\n");
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

