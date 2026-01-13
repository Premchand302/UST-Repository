package assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment_10 {
	public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Rahul");
        employees.put(102, "Anita");
        employees.put(103, "Kiran");
        employees.remove(102); 
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() +
                               ", Name: " + entry.getValue());
        }
    }
}
