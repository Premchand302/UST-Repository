package assignment_12;

public class Main {
	 public static void main(String[] args) {

	        Order o1 = new Order();
	        o1.display();

	        Order o2 = new Order(101, 2000.0);
	        o2.display();

	        Order o3 = new Order(102, "Prem", 5000.0);
	        o3.display();
	    }
}
