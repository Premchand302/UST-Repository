package test;

class Excep{
	public static void validateUser(int age) throws InvalidAgeException{
			if(age<18) {
				throw new InvalidAgeException("Age must be above 18");
			}
	}
}
public class CustomValidation {
	public static void main(String[] args) {
		try {
			Excep.validateUser(14);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
