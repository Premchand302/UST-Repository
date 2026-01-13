package assignment;

public class Assignment_3 {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println("Length: " + str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Value of string is null");
		}
	}
}
