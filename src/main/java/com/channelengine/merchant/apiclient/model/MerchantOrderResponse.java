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
import com.channelengine.merchant.apiclient.model.Address;
import com.channelengine.merchant.apiclient.model.MerchantOrderLineResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * MerchantOrderResponse
 */

public class MerchantOrderResponse {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("ChannelName")
  private String channelName = null;

  /**
   * The type of orders the channel support.
   */
  @JsonAdapter(ChannelOrderSupportEnum.Adapter.class)
  public enum ChannelOrderSupportEnum {
    NONE("NONE"),
    
    ORDERS("ORDERS"),
    
    SPLIT_ORDERS("SPLIT_ORDERS"),
    
    SPLIT_ORDER_LINES("SPLIT_ORDER_LINES");

    private String value;

    ChannelOrderSupportEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelOrderSupportEnum fromValue(String text) {
      for (ChannelOrderSupportEnum b : ChannelOrderSupportEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChannelOrderSupportEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelOrderSupportEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelOrderSupportEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChannelOrderSupportEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ChannelOrderSupport")
  private ChannelOrderSupportEnum channelOrderSupport = null;

  @SerializedName("ChannelOrderNo")
  private String channelOrderNo = null;

  /**
   * The status of the order
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    SHIPPED("SHIPPED"),
    
    IN_BACKORDER("IN_BACKORDER"),
    
    MANCO("MANCO"),
    
    IN_COMBI("IN_COMBI"),
    
    CLOSED("CLOSED"),
    
    NEW("NEW"),
    
    RETURNED("RETURNED"),
    
    REQUIRES_CORRECTION("REQUIRES_CORRECTION");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  @SerializedName("SubTotalInclVat")
  private BigDecimal subTotalInclVat = null;

  @SerializedName("SubTotalVat")
  private BigDecimal subTotalVat = null;

  @SerializedName("ShippingCostsVat")
  private BigDecimal shippingCostsVat = null;

  @SerializedName("TotalInclVat")
  private BigDecimal totalInclVat = null;

  @SerializedName("TotalVat")
  private BigDecimal totalVat = null;

  @SerializedName("OriginalSubTotalInclVat")
  private BigDecimal originalSubTotalInclVat = null;

  @SerializedName("OriginalSubTotalVat")
  private BigDecimal originalSubTotalVat = null;

  @SerializedName("OriginalShippingCostsInclVat")
  private BigDecimal originalShippingCostsInclVat = null;

  @SerializedName("OriginalShippingCostsVat")
  private BigDecimal originalShippingCostsVat = null;

  @SerializedName("OriginalTotalInclVat")
  private BigDecimal originalTotalInclVat = null;

  @SerializedName("OriginalTotalVat")
  private BigDecimal originalTotalVat = null;

  @SerializedName("Lines")
  private List<MerchantOrderLineResponse> lines = null;

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
  private BigDecimal shippingCostsInclVat = null;

  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  @SerializedName("OrderDate")
  private OffsetDateTime orderDate = null;

  @SerializedName("ChannelCustomerNo")
  private String channelCustomerNo = null;

  @SerializedName("BillingAddress")
  private Address billingAddress = null;

  @SerializedName("ShippingAddress")
  private Address shippingAddress = null;

  @SerializedName("ExtraData")
  private Map<String, String> extraData = null;

  public MerchantOrderResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier used by ChannelEngine. This identifier does  not have to be saved. It should only be used in a call to acknowledge the order.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier used by ChannelEngine. This identifier does  not have to be saved. It should only be used in a call to acknowledge the order.")
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
   * The name of the channel
   * @return channelName
  **/
  @ApiModelProperty(value = "The name of the channel")
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
   * The type of orders the channel support.
   * @return channelOrderSupport
  **/
  @ApiModelProperty(value = "The type of orders the channel support.")
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
   * The unique order reference used by the channel
   * @return channelOrderNo
  **/
  @ApiModelProperty(value = "The unique order reference used by the channel")
  public String getChannelOrderNo() {
    return channelOrderNo;
  }

  public void setChannelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
  }

  public MerchantOrderResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the order
   * @return status
  **/
  @ApiModelProperty(value = "The status of the order")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public MerchantOrderResponse subTotalInclVat(BigDecimal subTotalInclVat) {
    this.subTotalInclVat = subTotalInclVat;
    return this;
  }

   /**
   * The total value of the order lines including VAT  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return subTotalInclVat
  **/
  @ApiModelProperty(value = "The total value of the order lines including VAT  (in the shop's base currency calculated using the exchange rate at the time of ordering).")
  public BigDecimal getSubTotalInclVat() {
    return subTotalInclVat;
  }

  public void setSubTotalInclVat(BigDecimal subTotalInclVat) {
    this.subTotalInclVat = subTotalInclVat;
  }

  public MerchantOrderResponse subTotalVat(BigDecimal subTotalVat) {
    this.subTotalVat = subTotalVat;
    return this;
  }

   /**
   * The total amount of VAT charged over the order lines  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return subTotalVat
  **/
  @ApiModelProperty(value = "The total amount of VAT charged over the order lines  (in the shop's base currency calculated using the exchange rate at the time of ordering).")
  public BigDecimal getSubTotalVat() {
    return subTotalVat;
  }

  public void setSubTotalVat(BigDecimal subTotalVat) {
    this.subTotalVat = subTotalVat;
  }

  public MerchantOrderResponse shippingCostsVat(BigDecimal shippingCostsVat) {
    this.shippingCostsVat = shippingCostsVat;
    return this;
  }

   /**
   * The total amount of VAT charged over the shipping fee  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return shippingCostsVat
  **/
  @ApiModelProperty(value = "The total amount of VAT charged over the shipping fee  (in the shop's base currency calculated using the exchange rate at the time of ordering).")
  public BigDecimal getShippingCostsVat() {
    return shippingCostsVat;
  }

  public void setShippingCostsVat(BigDecimal shippingCostsVat) {
    this.shippingCostsVat = shippingCostsVat;
  }

  public MerchantOrderResponse totalInclVat(BigDecimal totalInclVat) {
    this.totalInclVat = totalInclVat;
    return this;
  }

   /**
   * The total value of the order including VAT  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return totalInclVat
  **/
  @ApiModelProperty(value = "The total value of the order including VAT  (in the shop's base currency calculated using the exchange rate at the time of ordering).")
  public BigDecimal getTotalInclVat() {
    return totalInclVat;
  }

  public void setTotalInclVat(BigDecimal totalInclVat) {
    this.totalInclVat = totalInclVat;
  }

  public MerchantOrderResponse totalVat(BigDecimal totalVat) {
    this.totalVat = totalVat;
    return this;
  }

   /**
   * The total amount of VAT charged over the total value of te order  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return totalVat
  **/
  @ApiModelProperty(value = "The total amount of VAT charged over the total value of te order  (in the shop's base currency calculated using the exchange rate at the time of ordering).")
  public BigDecimal getTotalVat() {
    return totalVat;
  }

  public void setTotalVat(BigDecimal totalVat) {
    this.totalVat = totalVat;
  }

  public MerchantOrderResponse originalSubTotalInclVat(BigDecimal originalSubTotalInclVat) {
    this.originalSubTotalInclVat = originalSubTotalInclVat;
    return this;
  }

   /**
   * The total value of the order lines including VAT  (in the currency in which the order was paid for, see CurrencyCode).
   * @return originalSubTotalInclVat
  **/
  @ApiModelProperty(value = "The total value of the order lines including VAT  (in the currency in which the order was paid for, see CurrencyCode).")
  public BigDecimal getOriginalSubTotalInclVat() {
    return originalSubTotalInclVat;
  }

  public void setOriginalSubTotalInclVat(BigDecimal originalSubTotalInclVat) {
    this.originalSubTotalInclVat = originalSubTotalInclVat;
  }

  public MerchantOrderResponse originalSubTotalVat(BigDecimal originalSubTotalVat) {
    this.originalSubTotalVat = originalSubTotalVat;
    return this;
  }

   /**
   * The total amount of VAT charged over the order lines  (in the currency in which the order was paid for, see CurrencyCode).
   * @return originalSubTotalVat
  **/
  @ApiModelProperty(value = "The total amount of VAT charged over the order lines  (in the currency in which the order was paid for, see CurrencyCode).")
  public BigDecimal getOriginalSubTotalVat() {
    return originalSubTotalVat;
  }

  public void setOriginalSubTotalVat(BigDecimal originalSubTotalVat) {
    this.originalSubTotalVat = originalSubTotalVat;
  }

  public MerchantOrderResponse originalShippingCostsInclVat(BigDecimal originalShippingCostsInclVat) {
    this.originalShippingCostsInclVat = originalShippingCostsInclVat;
    return this;
  }

   /**
   * The shipping fee including VAT  (in the currency in which the order was paid for, see CurrencyCode).
   * @return originalShippingCostsInclVat
  **/
  @ApiModelProperty(value = "The shipping fee including VAT  (in the currency in which the order was paid for, see CurrencyCode).")
  public BigDecimal getOriginalShippingCostsInclVat() {
    return originalShippingCostsInclVat;
  }

  public void setOriginalShippingCostsInclVat(BigDecimal originalShippingCostsInclVat) {
    this.originalShippingCostsInclVat = originalShippingCostsInclVat;
  }

  public MerchantOrderResponse originalShippingCostsVat(BigDecimal originalShippingCostsVat) {
    this.originalShippingCostsVat = originalShippingCostsVat;
    return this;
  }

   /**
   * The total amount of VAT charged over the shipping fee  (in the currency in which the order was paid for, see CurrencyCode).
   * @return originalShippingCostsVat
  **/
  @ApiModelProperty(value = "The total amount of VAT charged over the shipping fee  (in the currency in which the order was paid for, see CurrencyCode).")
  public BigDecimal getOriginalShippingCostsVat() {
    return originalShippingCostsVat;
  }

  public void setOriginalShippingCostsVat(BigDecimal originalShippingCostsVat) {
    this.originalShippingCostsVat = originalShippingCostsVat;
  }

  public MerchantOrderResponse originalTotalInclVat(BigDecimal originalTotalInclVat) {
    this.originalTotalInclVat = originalTotalInclVat;
    return this;
  }

   /**
   * The total value of the order including VAT  (in the currency in which the order was paid for, see CurrencyCode).
   * @return originalTotalInclVat
  **/
  @ApiModelProperty(value = "The total value of the order including VAT  (in the currency in which the order was paid for, see CurrencyCode).")
  public BigDecimal getOriginalTotalInclVat() {
    return originalTotalInclVat;
  }

  public void setOriginalTotalInclVat(BigDecimal originalTotalInclVat) {
    this.originalTotalInclVat = originalTotalInclVat;
  }

  public MerchantOrderResponse originalTotalVat(BigDecimal originalTotalVat) {
    this.originalTotalVat = originalTotalVat;
    return this;
  }

   /**
   * The total amount of VAT charged over the total value of te order  (in the currency in which the order was paid for, see CurrencyCode).
   * @return originalTotalVat
  **/
  @ApiModelProperty(value = "The total amount of VAT charged over the total value of te order  (in the currency in which the order was paid for, see CurrencyCode).")
  public BigDecimal getOriginalTotalVat() {
    return originalTotalVat;
  }

  public void setOriginalTotalVat(BigDecimal originalTotalVat) {
    this.originalTotalVat = originalTotalVat;
  }

  public MerchantOrderResponse lines(List<MerchantOrderLineResponse> lines) {
    this.lines = lines;
    return this;
  }

  public MerchantOrderResponse addLinesItem(MerchantOrderLineResponse linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<MerchantOrderLineResponse>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(value = "")
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
   * The customer&#39;s telephone number
   * @return phone
  **/
  @ApiModelProperty(value = "The customer's telephone number")
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
   * The customer&#39;s email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The customer's email")
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
   * Optional. A company&#39;s chamber of commerce number
   * @return companyRegistrationNo
  **/
  @ApiModelProperty(value = "Optional. A company's chamber of commerce number")
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
   * Optional. A company&#39;s VAT number
   * @return vatNo
  **/
  @ApiModelProperty(value = "Optional. A company's VAT number")
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
   * The payment method used on the order
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The payment method used on the order")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public MerchantOrderResponse shippingCostsInclVat(BigDecimal shippingCostsInclVat) {
    this.shippingCostsInclVat = shippingCostsInclVat;
    return this;
  }

   /**
   * The shipping fee including VAT  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return shippingCostsInclVat
  **/
  @ApiModelProperty(required = true, value = "The shipping fee including VAT  (in the shop's base currency calculated using the exchange rate at the time of ordering).")
  public BigDecimal getShippingCostsInclVat() {
    return shippingCostsInclVat;
  }

  public void setShippingCostsInclVat(BigDecimal shippingCostsInclVat) {
    this.shippingCostsInclVat = shippingCostsInclVat;
  }

  public MerchantOrderResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code for the amounts of the order
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency code for the amounts of the order")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public MerchantOrderResponse orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * The date the order was done
   * @return orderDate
  **/
  @ApiModelProperty(required = true, value = "The date the order was done")
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public MerchantOrderResponse channelCustomerNo(String channelCustomerNo) {
    this.channelCustomerNo = channelCustomerNo;
    return this;
  }

   /**
   * The unique customer reference used by the channel
   * @return channelCustomerNo
  **/
  @ApiModelProperty(value = "The unique customer reference used by the channel")
  public String getChannelCustomerNo() {
    return channelCustomerNo;
  }

  public void setChannelCustomerNo(String channelCustomerNo) {
    this.channelCustomerNo = channelCustomerNo;
  }

  public MerchantOrderResponse billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The billing or invoice address
   * @return billingAddress
  **/
  @ApiModelProperty(required = true, value = "The billing or invoice address")
  public Address getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public MerchantOrderResponse shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * The shipping address
   * @return shippingAddress
  **/
  @ApiModelProperty(required = true, value = "The shipping address")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public MerchantOrderResponse extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public MerchantOrderResponse putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<String, String>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

   /**
   * Extra data on the order
   * @return extraData
  **/
  @ApiModelProperty(value = "Extra data on the order")
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
        Objects.equals(this.status, merchantOrderResponse.status) &&
        Objects.equals(this.subTotalInclVat, merchantOrderResponse.subTotalInclVat) &&
        Objects.equals(this.subTotalVat, merchantOrderResponse.subTotalVat) &&
        Objects.equals(this.shippingCostsVat, merchantOrderResponse.shippingCostsVat) &&
        Objects.equals(this.totalInclVat, merchantOrderResponse.totalInclVat) &&
        Objects.equals(this.totalVat, merchantOrderResponse.totalVat) &&
        Objects.equals(this.originalSubTotalInclVat, merchantOrderResponse.originalSubTotalInclVat) &&
        Objects.equals(this.originalSubTotalVat, merchantOrderResponse.originalSubTotalVat) &&
        Objects.equals(this.originalShippingCostsInclVat, merchantOrderResponse.originalShippingCostsInclVat) &&
        Objects.equals(this.originalShippingCostsVat, merchantOrderResponse.originalShippingCostsVat) &&
        Objects.equals(this.originalTotalInclVat, merchantOrderResponse.originalTotalInclVat) &&
        Objects.equals(this.originalTotalVat, merchantOrderResponse.originalTotalVat) &&
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
    return Objects.hash(id, channelName, channelOrderSupport, channelOrderNo, status, subTotalInclVat, subTotalVat, shippingCostsVat, totalInclVat, totalVat, originalSubTotalInclVat, originalSubTotalVat, originalShippingCostsInclVat, originalShippingCostsVat, originalTotalInclVat, originalTotalVat, lines, phone, email, companyRegistrationNo, vatNo, paymentMethod, shippingCostsInclVat, currencyCode, orderDate, channelCustomerNo, billingAddress, shippingAddress, extraData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantOrderResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelOrderSupport: ").append(toIndentedString(channelOrderSupport)).append("\n");
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subTotalInclVat: ").append(toIndentedString(subTotalInclVat)).append("\n");
    sb.append("    subTotalVat: ").append(toIndentedString(subTotalVat)).append("\n");
    sb.append("    shippingCostsVat: ").append(toIndentedString(shippingCostsVat)).append("\n");
    sb.append("    totalInclVat: ").append(toIndentedString(totalInclVat)).append("\n");
    sb.append("    totalVat: ").append(toIndentedString(totalVat)).append("\n");
    sb.append("    originalSubTotalInclVat: ").append(toIndentedString(originalSubTotalInclVat)).append("\n");
    sb.append("    originalSubTotalVat: ").append(toIndentedString(originalSubTotalVat)).append("\n");
    sb.append("    originalShippingCostsInclVat: ").append(toIndentedString(originalShippingCostsInclVat)).append("\n");
    sb.append("    originalShippingCostsVat: ").append(toIndentedString(originalShippingCostsVat)).append("\n");
    sb.append("    originalTotalInclVat: ").append(toIndentedString(originalTotalInclVat)).append("\n");
    sb.append("    originalTotalVat: ").append(toIndentedString(originalTotalVat)).append("\n");
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

