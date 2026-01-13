package assignment;

public class Assignment_9 {
	public static void main(String[] args) {
		try {
			methodA();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void methodA() throws ArithmeticException{
		methodB();
	}
	static void methodB() throws ArithmeticException{
		int result = 10/0;
		System.out.println(result);
	}
}
