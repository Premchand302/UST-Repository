package assignment_1;

class Login {
    void login(String email) {
        System.out.println("Login using email: " + email);
    }
    void login(String email, String password) {
        System.out.println("Login using email: " + email);
        System.out.println("Password verified");
    }
}

public class Assignment_4 {
    public static void main(String[] args) {
        Login l = new Login();
        l.login("admin@gmail.com");
        l.login("admin@gmail.com", "pass123");
    }
}
