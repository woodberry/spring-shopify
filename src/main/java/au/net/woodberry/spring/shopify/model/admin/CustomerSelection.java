package au.net.woodberry.spring.shopify.model.admin;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CustomerSelection {

    ALL,
    PREREQUISITE;

    @JsonValue
    public String getName() {
        return this.name().toLowerCase();
    }
}
