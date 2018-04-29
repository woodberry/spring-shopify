package au.net.woodberry.spring.shopify.model.admin;

import au.net.woodberry.spring.shopify.api.client.message.IdGenerator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.time.ZonedDateTime;

@JsonRootName(value = "discount_code")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiscountCode implements Serializable  {

    private static final long serialVersionUID = 848199796630366686L;

    private ZonedDateTime createdAt;
    private long id;
    private String code;
    private long priceRuleId;
    private int usageCount;
    private ZonedDateTime updatedAt;

    public static DiscountCode from(PriceRule priceRule) {
        DiscountCode discountCode = new DiscountCode();
        discountCode.setCreatedAt(ZonedDateTime.now());
        discountCode.setId(IdGenerator.generate());
        discountCode.setCode(priceRule.getTitle());
        discountCode.setPriceRuleId(priceRule.getId());
        return discountCode;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getPriceRuleId() {
        return priceRuleId;
    }

    public void setPriceRuleId(long priceRuleId) {
        this.priceRuleId = priceRuleId;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
