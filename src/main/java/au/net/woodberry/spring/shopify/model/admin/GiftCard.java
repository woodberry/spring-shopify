package au.net.woodberry.spring.shopify.model.admin;

import java.time.ZonedDateTime;

public class GiftCard {

    private long id;
    private long apiClientId;
    private long userId;
    private long orderId;
    private long customerId;
    private long lineItemId;
    private double balance;
    private String currency;
    private String code;
    private String lastCharacters;
    private String note;
    private String templateSuffix;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private ZonedDateTime disabledAt;
    private ZonedDateTime expiresOn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getApiClientId() {
        return apiClientId;
    }

    public void setApiClientId(long apiClientId) {
        this.apiClientId = apiClientId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(long lineItemId) {
        this.lineItemId = lineItemId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLastCharacters() {
        return lastCharacters;
    }

    public void setLastCharacters(String lastCharacters) {
        this.lastCharacters = lastCharacters;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTemplateSuffix() {
        return templateSuffix;
    }

    public void setTemplateSuffix(String templateSuffix) {
        this.templateSuffix = templateSuffix;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ZonedDateTime getDisabledAt() {
        return disabledAt;
    }

    public void setDisabledAt(ZonedDateTime disabledAt) {
        this.disabledAt = disabledAt;
    }

    public ZonedDateTime getExpiresOn() {
        return expiresOn;
    }

    public void setExpiresOn(ZonedDateTime expiresOn) {
        this.expiresOn = expiresOn;
    }
}
