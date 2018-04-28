package au.net.woodberry.spring.shopify.model.admin;

public class Range<T extends Number> {

    private T greaterThanOrEqualTo;
    private T lessThanOrEqualTo;

    public T getGreaterThanOrEqualTo() {
        return greaterThanOrEqualTo;
    }

    public void setGreaterThanOrEqualTo(T greaterThanOrEqualTo) {
        this.greaterThanOrEqualTo = greaterThanOrEqualTo;
    }

    public T getLessThanOrEqualTo() {
        return lessThanOrEqualTo;
    }

    public void setLessThanOrEqualTo(T lessThanOrEqualTo) {
        this.lessThanOrEqualTo = lessThanOrEqualTo;
    }
}
