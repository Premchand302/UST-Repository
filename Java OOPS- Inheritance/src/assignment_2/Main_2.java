package assignment_2;

class Vehicle {
	int speed;
}

class Car extends Vehicle {
	String brand;
	
	void display() {
		speed = 180;
		brand = "Toyota";
		System.out.println("Brand: " +brand);
		System.out.println("Speed: " +speed);
	}
}
public class Main_2 {
	public static void main(String[] args) {
		Car c = new Car();
		c.display();
	}
}
