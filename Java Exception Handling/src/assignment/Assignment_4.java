package assignment;

public class Assignment_4 {
	public static void main(String[] args) {
		try {
			int result = 8/0;
			
			int[] arr = {1,2,34,5,6};
			System.out.println(arr[9]);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array access");
		}
	}
}
