package assignment_7;

public class User {
	 String email;
	    String password;

	    User(String email) {
	        this.email = email;
	        this.password = "Not Set";
	    }

	    User(String email, String password) {
	        this.email = email;
	        this.password = password;
	    }

	    void display() {
	        System.out.println("Email: " + email);
	        System.out.println("Password: " + password);
	        System.out.println();
	    }
}
