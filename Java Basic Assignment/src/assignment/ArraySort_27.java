package assignment;

import java.util.Scanner;

public class ArraySort_27 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = new int[5];
	        System.out.println("Enter Array elements:");
	        for (int i = 0; i < 5; i++) {
	            arr[i] = sc.nextInt();
	        }

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5-i-1; j++) {
	                if (arr[j] > arr[j+1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }
	        System.out.println("Sorted array:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
}
