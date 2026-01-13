package assignment_6;

public class Customer {
	private String name;
	private int age;
	
	Customer(String name, int age) {
		this.name = name;
		setAge(age);
	}
	public void setAge(int age) {
		if(age >= 18) {
			this.age = age;
		}
		else {
			System.out.println("Age must be above 18");
		}
	}
	public String getDetails() {
		return "Name: " +name+ ", Age: " +age;
	}
}
