package au.net.woodberry.spring.shopify.model.admin;

import java.util.List;
import java.util.Map;

public class ShippingLine {

    private String id;
    private List<Map<String, String>> appliedDiscounts;
    private String code;
    private double price;
    private double markup;
    private String source;
    private String title;
    private String phone;
    private String deliveryCategory;
    private String carrierIdentifier;
    private long carrierServiceId;
    private long apiClientId;
    private long requestedFulfillmentServiceId;
    private List<TaxLine> taxLines;
    private String customTaxLines;
    private String validationContext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Map<String, String>> getAppliedDiscounts() {
        return appliedDiscounts;
    }

    public void setAppliedDiscounts(List<Map<String, String>> appliedDiscounts) {
        this.appliedDiscounts = appliedDiscounts;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMarkup() {
        return markup;
    }

    public void setMarkup(double markup) {
        this.markup = markup;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeliveryCategory() {
        return deliveryCategory;
    }

    public void setDeliveryCategory(String deliveryCategory) {
        this.deliveryCategory = deliveryCategory;
    }

    public String getCarrierIdentifier() {
        return carrierIdentifier;
    }

    public void setCarrierIdentifier(String carrierIdentifier) {
        this.carrierIdentifier = carrierIdentifier;
    }

    public long getCarrierServiceId() {
        return carrierServiceId;
    }

    public void setCarrierServiceId(long carrierServiceId) {
        this.carrierServiceId = carrierServiceId;
    }

    public long getApiClientId() {
        return apiClientId;
    }

    public void setApiClientId(long apiClientId) {
        this.apiClientId = apiClientId;
    }

    public long getRequestedFulfillmentServiceId() {
        return requestedFulfillmentServiceId;
    }

    public void setRequestedFulfillmentServiceId(long requestedFulfillmentServiceId) {
        this.requestedFulfillmentServiceId = requestedFulfillmentServiceId;
    }

    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public String getCustomTaxLines() {
        return customTaxLines;
    }

    public void setCustomTaxLines(String customTaxLines) {
        this.customTaxLines = customTaxLines;
    }

    public String getValidationContext() {
        return validationContext;
    }

    public void setValidationContext(String validationContext) {
        this.validationContext = validationContext;
    }
}
