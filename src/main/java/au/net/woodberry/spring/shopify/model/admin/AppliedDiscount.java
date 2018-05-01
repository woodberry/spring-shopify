package au.net.woodberry.spring.shopify.model.admin;

/**
 * A discount object after it has been applied from a discount code using price rules.
 */
public class AppliedDiscount {

    private double amount;
    private String title;
    private String description;
    private double value;
    private ValueType valueType;
    private String nonApplicableReason;
    private boolean applicable;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public String getNonApplicableReason() {
        return nonApplicableReason;
    }

    public void setNonApplicableReason(String nonApplicableReason) {
        this.nonApplicableReason = nonApplicableReason;
    }

    public boolean isApplicable() {
        return applicable;
    }

    public void setApplicable(boolean applicable) {
        this.applicable = applicable;
    }
}
