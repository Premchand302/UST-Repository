package assignment;

public class Assignment_6 {
	public static void main(String[] args) {
		try {
			System.out.println("Outer block");
			try {
				int result = 10/0;
			}
			catch(ArithmeticException e) {
				System.out.println("Division by zero not allowed");
			}
			
			int[] arr = {1,23,4};
			System.out.println(arr[5]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
