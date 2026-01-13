package assignment;

public class Assigment_10 {
	public static void main(String[] args) {
		try {
			process();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled in main method");
		}
	}
	static void process() {
		try {
			int result = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
