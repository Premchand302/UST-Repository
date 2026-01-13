package assignment_3;

public class Main {
	public static void main(String[] args) {

        Employee emp = new Employee(101, 25000);
        emp.displaySalary();

        emp.setSalary(-5000); // invalid salary
        emp.displaySalary();
    }
}
