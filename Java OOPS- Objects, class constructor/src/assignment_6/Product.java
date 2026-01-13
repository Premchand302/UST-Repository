package assignment_6;

public class Product {
	 int productId;
	    String productName;
	    double price;

	    Product(int productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    }
	    void display() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	    }
}
