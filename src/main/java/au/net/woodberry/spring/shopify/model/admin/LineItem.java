package au.net.woodberry.spring.shopify.model.admin;

import java.util.List;
import java.util.Map;

public class LineItem {

    private List<Map<String, String>> appliedDiscounts;
    private String key;
    private double compareAtPrice;
    private long destinationLocationId;
    private String fulfillmentService;
    private boolean giftCard;
    private int grams;
    private double linePrice;
    private long originLocationId;
    private double price;
    private long productId;
    private String properties;
    private int quantity;
    private boolean requiresShipping;
    private String sku;
    private List<TaxLine> taxLines;
    private boolean taxable;
    private String title;
    private long variantId;
    private String variantTitle;
    private String vendor;

    public List<Map<String, String>> getAppliedDiscounts() {
        return appliedDiscounts;
    }

    public void setAppliedDiscounts(List<Map<String, String>> appliedDiscounts) {
        this.appliedDiscounts = appliedDiscounts;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getCompareAtPrice() {
        return compareAtPrice;
    }

    public void setCompareAtPrice(double compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
    }

    public long getDestinationLocationId() {
        return destinationLocationId;
    }

    public void setDestinationLocationId(long destinationLocationId) {
        this.destinationLocationId = destinationLocationId;
    }

    public String getFulfillmentService() {
        return fulfillmentService;
    }

    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    public boolean isGiftCard() {
        return giftCard;
    }

    public void setGiftCard(boolean giftCard) {
        this.giftCard = giftCard;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public double getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(double linePrice) {
        this.linePrice = linePrice;
    }

    public long getOriginLocationId() {
        return originLocationId;
    }

    public void setOriginLocationId(long originLocationId) {
        this.originLocationId = originLocationId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isRequiresShipping() {
        return requiresShipping;
    }

    public void setRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getVariantId() {
        return variantId;
    }

    public void setVariantId(long variantId) {
        this.variantId = variantId;
    }

    public String getVariantTitle() {
        return variantTitle;
    }

    public void setVariantTitle(String variantTitle) {
        this.variantTitle = variantTitle;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
