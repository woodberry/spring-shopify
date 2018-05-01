package au.net.woodberry.spring.shopify.model.admin;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

public class Checkout implements Serializable {

    private static final long serialVersionUID = -1181952679152637994L;

    private AppliedDiscount appliedDiscount;
    private CustomerAddress customerAddress;
    private boolean buyerAcceptsMarketing;
    private ZonedDateTime createdAt;
    private String currency;
    private long customerId;
    private String discountCode;
    private String email;
    private List<GiftCard> giftcards;
    private List<LineItem> lineItems;
    private AssociatedOrder order;
    private double paymentDue;
    private String paymentUrl;
    private String phone;
    private boolean requiresShipping;
    private double reservationTime;
    private double reservationTimeLeft;
    private CustomerAddress shippingAddress;
    private ShippingLine shippingLine;
    private ShippingRate shippingRate;
    private String sourceName;
    private double subtotalPrice;
    private TaxLine taxLine;
    private boolean taxesIncluded;
    private String token;
    private double totalPrice;
    private double totalTax;
    private ZonedDateTime updatedAt;
    private long userId;
    private String webUrl;

    public AppliedDiscount getAppliedDiscount() {
        return appliedDiscount;
    }

    public void setAppliedDiscount(AppliedDiscount appliedDiscount) {
        this.appliedDiscount = appliedDiscount;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(CustomerAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    public boolean isBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing;
    }

    public void setBuyerAcceptsMarketing(boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<GiftCard> getGiftcards() {
        return giftcards;
    }

    public void setGiftcards(List<GiftCard> giftcards) {
        this.giftcards = giftcards;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public AssociatedOrder getOrder() {
        return order;
    }

    public void setOrder(AssociatedOrder order) {
        this.order = order;
    }

    public double getPaymentDue() {
        return paymentDue;
    }

    public void setPaymentDue(double paymentDue) {
        this.paymentDue = paymentDue;
    }

    public String getPaymentUrl() {
        return paymentUrl;
    }

    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isRequiresShipping() {
        return requiresShipping;
    }

    public void setRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public double getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(double reservationTime) {
        this.reservationTime = reservationTime;
    }

    public double getReservationTimeLeft() {
        return reservationTimeLeft;
    }

    public void setReservationTimeLeft(double reservationTimeLeft) {
        this.reservationTimeLeft = reservationTimeLeft;
    }

    public CustomerAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(CustomerAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ShippingLine getShippingLine() {
        return shippingLine;
    }

    public void setShippingLine(ShippingLine shippingLine) {
        this.shippingLine = shippingLine;
    }

    public ShippingRate getShippingRate() {
        return shippingRate;
    }

    public void setShippingRate(ShippingRate shippingRate) {
        this.shippingRate = shippingRate;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public double getSubtotalPrice() {
        return subtotalPrice;
    }

    public void setSubtotalPrice(double subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public TaxLine getTaxLine() {
        return taxLine;
    }

    public void setTaxLine(TaxLine taxLine) {
        this.taxLine = taxLine;
    }

    public boolean isTaxesIncluded() {
        return taxesIncluded;
    }

    public void setTaxesIncluded(boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }
}
