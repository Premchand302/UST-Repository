package assignment_9;

public class Main {
	public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook(1, "Java Basics", "Prem", true);
        LibraryBook book2 = new LibraryBook(2, "Data Structures", "Athuu", false);
        book1.display();
        book2.display();
    }
}
