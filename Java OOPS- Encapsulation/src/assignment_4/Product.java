package assignment_4;

public class Product {
    private double price;
    public void setPrice(double price) {
        if (price >= 100 && price <= 100000) {
            this.price = price;
        } else {
            System.out.println("Price must be between 100 and 100000");
        }
    }
    public double getPrice() {
        return price;
    }
}
