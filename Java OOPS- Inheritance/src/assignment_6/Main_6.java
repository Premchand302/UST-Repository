package assignment_6;

class Person {
	String name;
	Person(String name){
		this.name = "Prem";
	}
}

class Student extends Person {
	int rollNo;
	Student(String name, int rollNo){
		super(name);
		this.rollNo = rollNo;
	}
	
	void display() {
		System.out.println("Name: " +name);
		System.out.println("Roll no: " +rollNo);
	}
}
public class Main_6 {
	public static void main(String[] args) {
		Student s = new Student("Prem",18);
		s.display();
	}
}
