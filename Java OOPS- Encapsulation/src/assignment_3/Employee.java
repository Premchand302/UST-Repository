package assignment_3;

public class Employee {
	private int empId;
	private double salary;
	public Employee(int empId, double salary) {
        this.empId = empId;
        setSalary(salary); 
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be greater than 0");
        }
    }
    public void displaySalary() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }	
}
