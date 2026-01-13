package assignment_4;

public class Book {
	String name;
	String author;
	int price;
	
	public Book (){
		name = "Java";
		author = "Prem";
		price = 250;
	}
	public Book(String name, String author, int price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	void display() {
		System.out.println("Name: " +name);
		System.out.println("Author: " +author);
		System.out.println("Price: " +price);
	}
	
}
