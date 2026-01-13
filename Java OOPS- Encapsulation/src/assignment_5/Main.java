package assignment_5;

public class Main {
	public static void main(String[] args) {
        User user = new User("admin@gmail.com", "password123");
        System.out.println("Email: " + user.getEmail());
    }
}
