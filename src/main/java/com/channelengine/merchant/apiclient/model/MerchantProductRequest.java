/*
 * ChannelEngine Merchant API
 * ChannelEngine API for merchants
 *
 * The version of the OpenAPI document: 2.9.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.merchant.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.merchant.apiclient.model.MerchantProductExtraDataItemRequest;
import com.channelengine.merchant.apiclient.model.VatRateType;
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
import java.util.List;

/**
 * MerchantProductRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantProductRequest {
  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_PARENT_MERCHANT_PRODUCT_NO = "ParentMerchantProductNo";
  @SerializedName(SERIALIZED_NAME_PARENT_MERCHANT_PRODUCT_NO)
  private String parentMerchantProductNo;

  public static final String SERIALIZED_NAME_PARENT_MERCHANT_PRODUCT_NO2 = "ParentMerchantProductNo2";
  @SerializedName(SERIALIZED_NAME_PARENT_MERCHANT_PRODUCT_NO2)
  private String parentMerchantProductNo2;

  public static final String SERIALIZED_NAME_EXTRA_DATA = "ExtraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private List<MerchantProductExtraDataItemRequest> extraData = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BRAND = "Brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_COLOR = "Color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_EAN = "Ean";
  @SerializedName(SERIALIZED_NAME_EAN)
  private String ean;

  public static final String SERIALIZED_NAME_MANUFACTURER_PRODUCT_NUMBER = "ManufacturerProductNumber";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_PRODUCT_NUMBER)
  private String manufacturerProductNumber;

  public static final String SERIALIZED_NAME_STOCK = "Stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private Integer stock;

  public static final String SERIALIZED_NAME_PRICE = "Price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_M_S_R_P = "MSRP";
  @SerializedName(SERIALIZED_NAME_M_S_R_P)
  private BigDecimal MSRP;

  public static final String SERIALIZED_NAME_PURCHASE_PRICE = "PurchasePrice";
  @SerializedName(SERIALIZED_NAME_PURCHASE_PRICE)
  private BigDecimal purchasePrice;

  public static final String SERIALIZED_NAME_VAT_RATE_TYPE = "VatRateType";
  @SerializedName(SERIALIZED_NAME_VAT_RATE_TYPE)
  private VatRateType vatRateType;

  public static final String SERIALIZED_NAME_SHIPPING_COST = "ShippingCost";
  @SerializedName(SERIALIZED_NAME_SHIPPING_COST)
  private BigDecimal shippingCost;

  public static final String SERIALIZED_NAME_SHIPPING_TIME = "ShippingTime";
  @SerializedName(SERIALIZED_NAME_SHIPPING_TIME)
  private String shippingTime;

  public static final String SERIALIZED_NAME_URL = "Url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_IMAGE_URL = "ImageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_EXTRA_IMAGE_URL1 = "ExtraImageUrl1";
  @SerializedName(SERIALIZED_NAME_EXTRA_IMAGE_URL1)
  private String extraImageUrl1;

  public static final String SERIALIZED_NAME_EXTRA_IMAGE_URL2 = "ExtraImageUrl2";
  @SerializedName(SERIALIZED_NAME_EXTRA_IMAGE_URL2)
  private String extraImageUrl2;

  public static final String SERIALIZED_NAME_EXTRA_IMAGE_URL3 = "ExtraImageUrl3";
  @SerializedName(SERIALIZED_NAME_EXTRA_IMAGE_URL3)
  private String extraImageUrl3;

  public static final String SERIALIZED_NAME_EXTRA_IMAGE_URL4 = "ExtraImageUrl4";
  @SerializedName(SERIALIZED_NAME_EXTRA_IMAGE_URL4)
  private String extraImageUrl4;

  public static final String SERIALIZED_NAME_EXTRA_IMAGE_URL5 = "ExtraImageUrl5";
  @SerializedName(SERIALIZED_NAME_EXTRA_IMAGE_URL5)
  private String extraImageUrl5;

  public static final String SERIALIZED_NAME_EXTRA_IMAGE_URL6 = "ExtraImageUrl6";
  @SerializedName(SERIALIZED_NAME_EXTRA_IMAGE_URL6)
  private String extraImageUrl6;

  public static final String SERIALIZED_NAME_EXTRA_IMAGE_URL7 = "ExtraImageUrl7";
  @SerializedName(SERIALIZED_NAME_EXTRA_IMAGE_URL7)
  private String extraImageUrl7;

  public static final String SERIALIZED_NAME_EXTRA_IMAGE_URL8 = "ExtraImageUrl8";
  @SerializedName(SERIALIZED_NAME_EXTRA_IMAGE_URL8)
  private String extraImageUrl8;

  public static final String SERIALIZED_NAME_EXTRA_IMAGE_URL9 = "ExtraImageUrl9";
  @SerializedName(SERIALIZED_NAME_EXTRA_IMAGE_URL9)
  private String extraImageUrl9;

  public static final String SERIALIZED_NAME_CATEGORY_TRAIL = "CategoryTrail";
  @SerializedName(SERIALIZED_NAME_CATEGORY_TRAIL)
  private String categoryTrail;


  public MerchantProductRequest merchantProductNo(String merchantProductNo) {
    
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * A unique identifier of the product. (sku).
   * @return merchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier of the product. (sku).")

  public String getMerchantProductNo() {
    return merchantProductNo;
  }


  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }


  public MerchantProductRequest parentMerchantProductNo(String parentMerchantProductNo) {
    
    this.parentMerchantProductNo = parentMerchantProductNo;
    return this;
  }

   /**
   * If this product is a different version of another  product (for example, all fields are the same except  size), then this field should contain  the &#39;MerchantProductNo&#39; of the parent. The parent  should already exist (or be present between the products  in the content of the API call, it does not matter whether  the parent is behind the child in the list).
   * @return parentMerchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this product is a different version of another  product (for example, all fields are the same except  size), then this field should contain  the 'MerchantProductNo' of the parent. The parent  should already exist (or be present between the products  in the content of the API call, it does not matter whether  the parent is behind the child in the list).")

  public String getParentMerchantProductNo() {
    return parentMerchantProductNo;
  }


  public void setParentMerchantProductNo(String parentMerchantProductNo) {
    this.parentMerchantProductNo = parentMerchantProductNo;
  }


  public MerchantProductRequest parentMerchantProductNo2(String parentMerchantProductNo2) {
    
    this.parentMerchantProductNo2 = parentMerchantProductNo2;
    return this;
  }

   /**
   * If this product is a different version of another  product (for example, all fields are the same except  color) and itself is a parent with child products (e.g. of sizes),  then this field should contain the &#39;MerchantProductNo&#39; of the grandparent. The grandparent  should already exist (or be present between the products  in the content of the API call, it does not matter whether  the grandparent is behind the child in the list).  When you set this field, the ParentMerchantProductNo should be left empty.                Use this field in case of three level product hierarchy,  e.g. model - color - size.  This is required for channels like Otto.
   * @return parentMerchantProductNo2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this product is a different version of another  product (for example, all fields are the same except  color) and itself is a parent with child products (e.g. of sizes),  then this field should contain the 'MerchantProductNo' of the grandparent. The grandparent  should already exist (or be present between the products  in the content of the API call, it does not matter whether  the grandparent is behind the child in the list).  When you set this field, the ParentMerchantProductNo should be left empty.                Use this field in case of three level product hierarchy,  e.g. model - color - size.  This is required for channels like Otto.")

  public String getParentMerchantProductNo2() {
    return parentMerchantProductNo2;
  }


  public void setParentMerchantProductNo2(String parentMerchantProductNo2) {
    this.parentMerchantProductNo2 = parentMerchantProductNo2;
  }


  public MerchantProductRequest extraData(List<MerchantProductExtraDataItemRequest> extraData) {
    
    this.extraData = extraData;
    return this;
  }

  public MerchantProductRequest addExtraDataItem(MerchantProductExtraDataItemRequest extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new ArrayList<MerchantProductExtraDataItemRequest>();
    }
    this.extraData.add(extraDataItem);
    return this;
  }

   /**
   * An optional list of key-value pairs containing  extra data about this product. This data can be  sent to channels or used for filtering products.
   * @return extraData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional list of key-value pairs containing  extra data about this product. This data can be  sent to channels or used for filtering products.")

  public List<MerchantProductExtraDataItemRequest> getExtraData() {
    return extraData;
  }


  public void setExtraData(List<MerchantProductExtraDataItemRequest> extraData) {
    this.extraData = extraData;
  }


  public MerchantProductRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the product.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the product.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MerchantProductRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the product. Can contain these HTML tags:  div, span, pre, p, br, hr, hgroup, h1, h2, h3, h4, h5, h6, ul, ol, li, dl, dt, dd, strong, em, b, i, u, img, a, abbr, address, blockquote, area, audio, video, caption, table, tbody, td, tfoot, th, thead, tr.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the product. Can contain these HTML tags:  div, span, pre, p, br, hr, hgroup, h1, h2, h3, h4, h5, h6, ul, ol, li, dl, dt, dd, strong, em, b, i, u, img, a, abbr, address, blockquote, area, audio, video, caption, table, tbody, td, tfoot, th, thead, tr.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public MerchantProductRequest brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the product.
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The brand of the product.")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public MerchantProductRequest size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Optional. The size of the product (variant). E.g. fashion size (S-XL, 46-56, etc), width of the watch, etc..
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. The size of the product (variant). E.g. fashion size (S-XL, 46-56, etc), width of the watch, etc..")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public MerchantProductRequest color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Optional. The color of the product (variant).
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. The color of the product (variant).")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public MerchantProductRequest ean(String ean) {
    
    this.ean = ean;
    return this;
  }

   /**
   * The EAN of GTIN of the product.
   * @return ean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The EAN of GTIN of the product.")

  public String getEan() {
    return ean;
  }


  public void setEan(String ean) {
    this.ean = ean;
  }


  public MerchantProductRequest manufacturerProductNumber(String manufacturerProductNumber) {
    
    this.manufacturerProductNumber = manufacturerProductNumber;
    return this;
  }

   /**
   * The unique product reference used by the manufacturer/vendor of the product.
   * @return manufacturerProductNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique product reference used by the manufacturer/vendor of the product.")

  public String getManufacturerProductNumber() {
    return manufacturerProductNumber;
  }


  public void setManufacturerProductNumber(String manufacturerProductNumber) {
    this.manufacturerProductNumber = manufacturerProductNumber;
  }


  public MerchantProductRequest stock(Integer stock) {
    
    this.stock = stock;
    return this;
  }

   /**
   * The number of items in stock.
   * @return stock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items in stock.")

  public Integer getStock() {
    return stock;
  }


  public void setStock(Integer stock) {
    this.stock = stock;
  }


  public MerchantProductRequest price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price, including VAT.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price, including VAT.")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public MerchantProductRequest MSRP(BigDecimal MSRP) {
    
    this.MSRP = MSRP;
    return this;
  }

   /**
   * Manufacturer&#39;s suggested retail price.
   * @return MSRP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manufacturer's suggested retail price.")

  public BigDecimal getMSRP() {
    return MSRP;
  }


  public void setMSRP(BigDecimal MSRP) {
    this.MSRP = MSRP;
  }


  public MerchantProductRequest purchasePrice(BigDecimal purchasePrice) {
    
    this.purchasePrice = purchasePrice;
    return this;
  }

   /**
   * Optional. The purchase price of the product. Useful for repricing.
   * @return purchasePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional. The purchase price of the product. Useful for repricing.")

  public BigDecimal getPurchasePrice() {
    return purchasePrice;
  }


  public void setPurchasePrice(BigDecimal purchasePrice) {
    this.purchasePrice = purchasePrice;
  }


  public MerchantProductRequest vatRateType(VatRateType vatRateType) {
    
    this.vatRateType = vatRateType;
    return this;
  }

   /**
   * Get vatRateType
   * @return vatRateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VatRateType getVatRateType() {
    return vatRateType;
  }


  public void setVatRateType(VatRateType vatRateType) {
    this.vatRateType = vatRateType;
  }


  public MerchantProductRequest shippingCost(BigDecimal shippingCost) {
    
    this.shippingCost = shippingCost;
    return this;
  }

   /**
   * Shipping cost of the product.
   * @return shippingCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipping cost of the product.")

  public BigDecimal getShippingCost() {
    return shippingCost;
  }


  public void setShippingCost(BigDecimal shippingCost) {
    this.shippingCost = shippingCost;
  }


  public MerchantProductRequest shippingTime(String shippingTime) {
    
    this.shippingTime = shippingTime;
    return this;
  }

   /**
   * A textual representation of the shippingtime.  For example, in Dutch: &#39;Op werkdagen voor 22:00 uur besteld, morgen in huis&#39;.
   * @return shippingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A textual representation of the shippingtime.  For example, in Dutch: 'Op werkdagen voor 22:00 uur besteld, morgen in huis'.")

  public String getShippingTime() {
    return shippingTime;
  }


  public void setShippingTime(String shippingTime) {
    this.shippingTime = shippingTime;
  }


  public MerchantProductRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * A URL pointing to the merchant&#39;s webpage  which displays this product.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL pointing to the merchant's webpage  which displays this product.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public MerchantProductRequest imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * A URL at which an image of this product  can be found.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL at which an image of this product  can be found.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public MerchantProductRequest extraImageUrl1(String extraImageUrl1) {
    
    this.extraImageUrl1 = extraImageUrl1;
    return this;
  }

   /**
   * Url to an additional image of product (1).
   * @return extraImageUrl1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url to an additional image of product (1).")

  public String getExtraImageUrl1() {
    return extraImageUrl1;
  }


  public void setExtraImageUrl1(String extraImageUrl1) {
    this.extraImageUrl1 = extraImageUrl1;
  }


  public MerchantProductRequest extraImageUrl2(String extraImageUrl2) {
    
    this.extraImageUrl2 = extraImageUrl2;
    return this;
  }

   /**
   * Url to an additional image of product (2).
   * @return extraImageUrl2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url to an additional image of product (2).")

  public String getExtraImageUrl2() {
    return extraImageUrl2;
  }


  public void setExtraImageUrl2(String extraImageUrl2) {
    this.extraImageUrl2 = extraImageUrl2;
  }


  public MerchantProductRequest extraImageUrl3(String extraImageUrl3) {
    
    this.extraImageUrl3 = extraImageUrl3;
    return this;
  }

   /**
   * Url to an additional image of product (3).
   * @return extraImageUrl3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url to an additional image of product (3).")

  public String getExtraImageUrl3() {
    return extraImageUrl3;
  }


  public void setExtraImageUrl3(String extraImageUrl3) {
    this.extraImageUrl3 = extraImageUrl3;
  }


  public MerchantProductRequest extraImageUrl4(String extraImageUrl4) {
    
    this.extraImageUrl4 = extraImageUrl4;
    return this;
  }

   /**
   * Url to an additional image of product (4).
   * @return extraImageUrl4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url to an additional image of product (4).")

  public String getExtraImageUrl4() {
    return extraImageUrl4;
  }


  public void setExtraImageUrl4(String extraImageUrl4) {
    this.extraImageUrl4 = extraImageUrl4;
  }


  public MerchantProductRequest extraImageUrl5(String extraImageUrl5) {
    
    this.extraImageUrl5 = extraImageUrl5;
    return this;
  }

   /**
   * Url to an additional image of product (5).
   * @return extraImageUrl5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url to an additional image of product (5).")

  public String getExtraImageUrl5() {
    return extraImageUrl5;
  }


  public void setExtraImageUrl5(String extraImageUrl5) {
    this.extraImageUrl5 = extraImageUrl5;
  }


  public MerchantProductRequest extraImageUrl6(String extraImageUrl6) {
    
    this.extraImageUrl6 = extraImageUrl6;
    return this;
  }

   /**
   * Url to an additional image of product (6).
   * @return extraImageUrl6
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url to an additional image of product (6).")

  public String getExtraImageUrl6() {
    return extraImageUrl6;
  }


  public void setExtraImageUrl6(String extraImageUrl6) {
    this.extraImageUrl6 = extraImageUrl6;
  }


  public MerchantProductRequest extraImageUrl7(String extraImageUrl7) {
    
    this.extraImageUrl7 = extraImageUrl7;
    return this;
  }

   /**
   * Url to an additional image of product (7).
   * @return extraImageUrl7
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url to an additional image of product (7).")

  public String getExtraImageUrl7() {
    return extraImageUrl7;
  }


  public void setExtraImageUrl7(String extraImageUrl7) {
    this.extraImageUrl7 = extraImageUrl7;
  }


  public MerchantProductRequest extraImageUrl8(String extraImageUrl8) {
    
    this.extraImageUrl8 = extraImageUrl8;
    return this;
  }

   /**
   * Url to an additional image of product (8).
   * @return extraImageUrl8
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url to an additional image of product (8).")

  public String getExtraImageUrl8() {
    return extraImageUrl8;
  }


  public void setExtraImageUrl8(String extraImageUrl8) {
    this.extraImageUrl8 = extraImageUrl8;
  }


  public MerchantProductRequest extraImageUrl9(String extraImageUrl9) {
    
    this.extraImageUrl9 = extraImageUrl9;
    return this;
  }

   /**
   * Url to an additional image of product (9).
   * @return extraImageUrl9
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url to an additional image of product (9).")

  public String getExtraImageUrl9() {
    return extraImageUrl9;
  }


  public void setExtraImageUrl9(String extraImageUrl9) {
    this.extraImageUrl9 = extraImageUrl9;
  }


  public MerchantProductRequest categoryTrail(String categoryTrail) {
    
    this.categoryTrail = categoryTrail;
    return this;
  }

   /**
   * The category to which this product belongs.  Please supply this field in the following format:  &#39;maincategory &gt; category &gt; subcategory&#39;  For example:  &#39;vehicles &gt; bikes &gt; mountainbike&#39;.
   * @return categoryTrail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category to which this product belongs.  Please supply this field in the following format:  'maincategory > category > subcategory'  For example:  'vehicles > bikes > mountainbike'.")

  public String getCategoryTrail() {
    return categoryTrail;
  }


  public void setCategoryTrail(String categoryTrail) {
    this.categoryTrail = categoryTrail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantProductRequest merchantProductRequest = (MerchantProductRequest) o;
    return Objects.equals(this.merchantProductNo, merchantProductRequest.merchantProductNo) &&
        Objects.equals(this.parentMerchantProductNo, merchantProductRequest.parentMerchantProductNo) &&
        Objects.equals(this.parentMerchantProductNo2, merchantProductRequest.parentMerchantProductNo2) &&
        Objects.equals(this.extraData, merchantProductRequest.extraData) &&
        Objects.equals(this.name, merchantProductRequest.name) &&
        Objects.equals(this.description, merchantProductRequest.description) &&
        Objects.equals(this.brand, merchantProductRequest.brand) &&
        Objects.equals(this.size, merchantProductRequest.size) &&
        Objects.equals(this.color, merchantProductRequest.color) &&
        Objects.equals(this.ean, merchantProductRequest.ean) &&
        Objects.equals(this.manufacturerProductNumber, merchantProductRequest.manufacturerProductNumber) &&
        Objects.equals(this.stock, merchantProductRequest.stock) &&
        Objects.equals(this.price, merchantProductRequest.price) &&
        Objects.equals(this.MSRP, merchantProductRequest.MSRP) &&
        Objects.equals(this.purchasePrice, merchantProductRequest.purchasePrice) &&
        Objects.equals(this.vatRateType, merchantProductRequest.vatRateType) &&
        Objects.equals(this.shippingCost, merchantProductRequest.shippingCost) &&
        Objects.equals(this.shippingTime, merchantProductRequest.shippingTime) &&
        Objects.equals(this.url, merchantProductRequest.url) &&
        Objects.equals(this.imageUrl, merchantProductRequest.imageUrl) &&
        Objects.equals(this.extraImageUrl1, merchantProductRequest.extraImageUrl1) &&
        Objects.equals(this.extraImageUrl2, merchantProductRequest.extraImageUrl2) &&
        Objects.equals(this.extraImageUrl3, merchantProductRequest.extraImageUrl3) &&
        Objects.equals(this.extraImageUrl4, merchantProductRequest.extraImageUrl4) &&
        Objects.equals(this.extraImageUrl5, merchantProductRequest.extraImageUrl5) &&
        Objects.equals(this.extraImageUrl6, merchantProductRequest.extraImageUrl6) &&
        Objects.equals(this.extraImageUrl7, merchantProductRequest.extraImageUrl7) &&
        Objects.equals(this.extraImageUrl8, merchantProductRequest.extraImageUrl8) &&
        Objects.equals(this.extraImageUrl9, merchantProductRequest.extraImageUrl9) &&
        Objects.equals(this.categoryTrail, merchantProductRequest.categoryTrail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantProductNo, parentMerchantProductNo, parentMerchantProductNo2, extraData, name, description, brand, size, color, ean, manufacturerProductNumber, stock, price, MSRP, purchasePrice, vatRateType, shippingCost, shippingTime, url, imageUrl, extraImageUrl1, extraImageUrl2, extraImageUrl3, extraImageUrl4, extraImageUrl5, extraImageUrl6, extraImageUrl7, extraImageUrl8, extraImageUrl9, categoryTrail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantProductRequest {\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    parentMerchantProductNo: ").append(toIndentedString(parentMerchantProductNo)).append("\n");
    sb.append("    parentMerchantProductNo2: ").append(toIndentedString(parentMerchantProductNo2)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    manufacturerProductNumber: ").append(toIndentedString(manufacturerProductNumber)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    MSRP: ").append(toIndentedString(MSRP)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    vatRateType: ").append(toIndentedString(vatRateType)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    shippingTime: ").append(toIndentedString(shippingTime)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    extraImageUrl1: ").append(toIndentedString(extraImageUrl1)).append("\n");
    sb.append("    extraImageUrl2: ").append(toIndentedString(extraImageUrl2)).append("\n");
    sb.append("    extraImageUrl3: ").append(toIndentedString(extraImageUrl3)).append("\n");
    sb.append("    extraImageUrl4: ").append(toIndentedString(extraImageUrl4)).append("\n");
    sb.append("    extraImageUrl5: ").append(toIndentedString(extraImageUrl5)).append("\n");
    sb.append("    extraImageUrl6: ").append(toIndentedString(extraImageUrl6)).append("\n");
    sb.append("    extraImageUrl7: ").append(toIndentedString(extraImageUrl7)).append("\n");
    sb.append("    extraImageUrl8: ").append(toIndentedString(extraImageUrl8)).append("\n");
    sb.append("    extraImageUrl9: ").append(toIndentedString(extraImageUrl9)).append("\n");
    sb.append("    categoryTrail: ").append(toIndentedString(categoryTrail)).append("\n");
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

