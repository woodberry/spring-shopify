package au.net.woodberry.spring.shopify.model.admin;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TargetType {
    LINE_ITEM,
    SHIPPING_LINE;

    @JsonValue
    public String getName() {
        return this.name().toLowerCase();
    }
}
