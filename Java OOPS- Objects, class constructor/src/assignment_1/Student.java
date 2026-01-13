package assignment_1;

public class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void displayDetails() {
		System.out.println("ID: " +id);
		System.out.println("Name: " +name);
	}
}
