package assignment_1;

class Payment {
	void pay(int amount) {
		System.out.println("Paid: " +amount);
	}
	void pay(int amount, String mode) {
		System.out.println("Paid: " +amount);
		System.out.println("Mode: " +mode);
	}
}
public class Assignment_5 {
	public static void main(String[] args) {
		Payment p = new Payment();
		p.pay(5000);
		p.pay(1000,"GPay");
	}
}
