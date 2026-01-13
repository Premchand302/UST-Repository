package assignment_7;

public class Mobile {
    private String brand;
    private double price;

    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    public double getPriceWithGST() {
        double gst = price * 0.18;
        return price + gst;
    }
    public String getBrand() {
        return brand;
    }
}
