package au.net.woodberry.spring.shopify.model.admin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * A model representation of https://help.shopify.com/api/reference/pricerule
 */
@JsonRootName(value = "price_rule")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceRule implements Serializable {

    private static final long serialVersionUID = -7808978061668462035L;

    private ZonedDateTime createdAt;
    private long id;
    private String title;
    private TargetType targetType;
    private TargetSelection targetSelection;
    private AllocationMethod allocationMethod;
    private ValueType valueType;
    private double value;
    private boolean oncePerCustomer;
    private int usageLimit;
    private CustomerSelection customerSelection;
    private List<Long> prerequisiteSavedSearchIds;
    private List<Long> prerequisiteCustomerIds;
    private List<Range<Double>> prerequisiteSubtotalRange;
    private List<Range<Double>> prerequisiteShippingPriceRange;
    private List<Range<Integer>> prerequisiteQuantityRange;
    private List<Long> entitledProductIds;
    private List<Long> entitledVariantIds;
    private List<Long> entitledCollectionIds;
    private List<Long> entitledCountryIds;
    private ZonedDateTime startsAt;
    private ZonedDateTime endsAt;

    // Response fields
    private ZonedDateTime updatedAt;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TargetType getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public TargetSelection getTargetSelection() {
        return targetSelection;
    }

    public void setTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection;
    }

    public AllocationMethod getAllocationMethod() {
        return allocationMethod;
    }

    public void setAllocationMethod(AllocationMethod allocationMethod) {
        this.allocationMethod = allocationMethod;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isOncePerCustomer() {
        return oncePerCustomer;
    }

    public void setOncePerCustomer(boolean oncePerCustomer) {
        this.oncePerCustomer = oncePerCustomer;
    }

    public int getUsageLimit() {
        return usageLimit;
    }

    public void setUsageLimit(int usageLimit) {
        this.usageLimit = usageLimit;
    }

    public CustomerSelection getCustomerSelection() {
        return customerSelection;
    }

    public void setCustomerSelection(CustomerSelection customerSelection) {
        this.customerSelection = customerSelection;
    }

    public List<Long> getPrerequisiteSavedSearchIds() {
        return prerequisiteSavedSearchIds;
    }

    public void setPrerequisiteSavedSearchIds(List<Long> prerequisiteSavedSearchIds) {
        this.prerequisiteSavedSearchIds = prerequisiteSavedSearchIds;
    }

    public List<Long> getPrerequisiteCustomerIds() {
        return prerequisiteCustomerIds;
    }

    public void setPrerequisiteCustomerIds(List<Long> prerequisiteCustomerIds) {
        this.prerequisiteCustomerIds = prerequisiteCustomerIds;
    }

    public List<Range<Double>> getPrerequisiteSubtotalRange() {
        return prerequisiteSubtotalRange;
    }

    public void setPrerequisiteSubtotalRange(List<Range<Double>> prerequisiteSubtotalRange) {
        this.prerequisiteSubtotalRange = prerequisiteSubtotalRange;
    }

    public List<Range<Double>> getPrerequisiteShippingPriceRange() {
        return prerequisiteShippingPriceRange;
    }

    public void setPrerequisiteShippingPriceRange(List<Range<Double>> prerequisiteShippingPriceRange) {
        this.prerequisiteShippingPriceRange = prerequisiteShippingPriceRange;
    }

    public List<Range<Integer>> getPrerequisiteQuantityRange() {
        return prerequisiteQuantityRange;
    }

    public void setPrerequisiteQuantityRange(List<Range<Integer>> prerequisiteQuantityRange) {
        this.prerequisiteQuantityRange = prerequisiteQuantityRange;
    }

    public List<Long> getEntitledProductIds() {
        return entitledProductIds;
    }

    public void setEntitledProductIds(List<Long> entitledProductIds) {
        this.entitledProductIds = entitledProductIds;
    }

    public List<Long> getEntitledVariantIds() {
        return entitledVariantIds;
    }

    public void setEntitledVariantIds(List<Long> entitledVariantIds) {
        this.entitledVariantIds = entitledVariantIds;
    }

    public List<Long> getEntitledCollectionIds() {
        return entitledCollectionIds;
    }

    public void setEntitledCollectionIds(List<Long> entitledCollectionIds) {
        this.entitledCollectionIds = entitledCollectionIds;
    }

    public List<Long> getEntitledCountryIds() {
        return entitledCountryIds;
    }

    public void setEntitledCountryIds(List<Long> entitledCountryIds) {
        this.entitledCountryIds = entitledCountryIds;
    }

    public ZonedDateTime getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(ZonedDateTime startsAt) {
        this.startsAt = startsAt;
    }

    public ZonedDateTime getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(ZonedDateTime endsAt) {
        this.endsAt = endsAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
