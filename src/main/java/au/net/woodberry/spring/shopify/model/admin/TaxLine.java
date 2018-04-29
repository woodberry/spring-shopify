package au.net.woodberry.spring.shopify.model.admin;

public class TaxLine {

    private double price;
    private double rate;
    private String title;
    private String zone;
    private String source;
    private double compareAt;
    private int position;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getCompareAt() {
        return compareAt;
    }

    public void setCompareAt(double compareAt) {
        this.compareAt = compareAt;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
