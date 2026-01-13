package assignment_11;

public class Person {
	 	String name;
	    int age;
	    Person(String name) {
	        this.name = name;
	        this.age = 0;  
	    }
	    Person(String name, int age) {
	        this(name);  
	        this.age = age;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println();
	    }
}
