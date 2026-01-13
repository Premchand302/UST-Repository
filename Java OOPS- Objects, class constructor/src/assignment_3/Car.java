package assignment_3;

public class Car {
	String brand;
	String model;
	int price;
	
	public Car(String brand, String model, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	void display() {
		System.out.println("Brand: " +this.brand);
		System.out.println("Model: " +this.model);
		System.out.println("Price: " +this.price);
	}
}
