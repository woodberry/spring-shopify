package au.net.woodberry.spring.shopify.model.admin;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ValueType {

    FIXED_AMOUNT,
    PERCENTAGE;

    @JsonValue
    public String getName() {
        return this.name().toLowerCase();
    }
}
