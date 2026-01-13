package assignment_7;

public class Main {
	public static void main(String[] args) {
        User user1 = new User("user1@gmail.com");
        user1.display();
        User user2 = new User("user2@gmail.com", "pass123");
        user2.display();
    }
}
