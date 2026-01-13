package assignment_4;

class Employee {
	double salary;
}

class Manager extends Employee {
	double bonus;
	void totalSalary() {
		bonus = 4000;
		salary = 10000;
		double total = bonus + salary;
		System.out.println("Total salary: " +total);
	}
}
public class Main_4 {
	public static void main(String[] args) {
		Manager mgr = new Manager();
		mgr.totalSalary();
	}
}
