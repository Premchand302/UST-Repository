package assignment;

import java.util.HashMap;

public class Assignment_8 {
	 public static void main(String[] args) {
	        HashMap<Integer, String> employees = new HashMap<>();
	        employees.put(101, "Rahul");
	        employees.put(102, "Anita");
	        employees.put(103, "Kiran");
	        System.out.println("Employee ID 101: " + employees.get(101));
	        System.out.println("Employee ID 102: " + employees.get(102));
	        System.out.println("Employee ID 103: " + employees.get(103));
	    }
}
