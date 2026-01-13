package assignment;

public class Assignment_2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		try {
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index accessed");
		}
	}
}
