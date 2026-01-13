package assignment_8;

public class Mobile {
	 String brand;
	    int ram;        
	    int storage;   
	    double price;

	    Mobile() {
	        brand = "Unknown";
	        ram = 4;
	        storage = 64;
	        price = 10000.0;
	    }
	    Mobile(String brand, double price) {
	        this.brand = brand;
	        this.price = price;
	        this.ram = 6;
	        this.storage = 128;
	    }
	    Mobile(String brand, int ram, int storage, double price) {
	        this.brand = brand;
	        this.ram = ram;
	        this.storage = storage;
	        this.price = price;
	    }
	    void display() {
	        System.out.println("Brand: " + brand);
	        System.out.println("RAM: " + ram);
	        System.out.println("Storage: " + storage);
	        System.out.println("Price: " + price);
	        System.out.println();
	    }
}
