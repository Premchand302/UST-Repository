package assignment;

import java.util.Scanner;

public class Array_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements:");
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array:");
		for(int i : arr ) {
			System.out.print(i + " ");
		}
	}
}
