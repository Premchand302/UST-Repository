package assignment_9;

public class LibraryBook {
		int bookId;
	    String title;
	    String author;
	    boolean available;
	    
	    LibraryBook(int bookId, String title, String author, boolean available) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	        this.available = available;
	    }
	    boolean isAvailable() {
	        return available;
	    }
	    void display() {
	        System.out.println("Book ID: " + bookId);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Available: " + isAvailable());
	        System.out.println();
	    }
}
