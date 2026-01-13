package assignment;

import java.util.Scanner;

public class Assignment_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int result = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero not allowed");
		}
	}
}
