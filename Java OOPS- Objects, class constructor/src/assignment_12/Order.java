package assignment_12;

public class Order {
	int orderId;
    String customerName;
    double amount;
    double tax;
    double totalAmount;

    Order() {
        orderId = 0;
        customerName = "Guest";
        amount = 0.0;
        calculateTax();
    }
    Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.customerName = "Guest";
        calculateTax();
    }
    Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        calculateTax();
    }
    void calculateTax() {
        tax = amount * 0.10;  
        totalAmount = amount + tax;
    }
    void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("Tax: " + tax);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println();
    }
}
