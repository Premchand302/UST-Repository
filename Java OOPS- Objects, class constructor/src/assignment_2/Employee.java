package assignment_2;

public class Employee {
	int empId;
	String empName;
	int salary;
	
	Employee(){
		empId = 8;
		empName = "Prem";
		salary = 45000;
	}
	
	void display() {
		System.out.println("ID: " +empId);
		System.out.println("Name: " +empName);
		System.out.println("Salary: " +salary);
	}
	
}
