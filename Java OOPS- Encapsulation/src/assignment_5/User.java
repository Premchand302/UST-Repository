package assignment_5;

public class User {
	private String email;
	private String password;
	
	public User(String email, String password) {
		this.email = email;
		setPassword(password);
	}
	
	public void setPassword(String password) {
		if(password.length() >= 8) {
			this.password = password;
		}
		else {
			System.out.println("Password length must be >=8");
		}
	}
	public String getEmail() {
		return email;
	}
}
