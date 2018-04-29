package au.net.woodberry.spring.shopify.model.admin;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CancelReason {

    CUSTOMER,
    FRAUD,
    INVENTORY,
    OTHER;

    @JsonValue
    public String getName() {
        return this.name().toLowerCase();
    }
}
