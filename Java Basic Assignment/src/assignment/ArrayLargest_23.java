package assignment;

import java.util.Collections;
import java.util.Scanner;

public class ArrayLargest_23 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = new int[5];
	        System.out.println("Enter Array elements:");
	        for (int i = 0; i < 5; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
//	        int max = arr[0], min = arr[0];
//	        for (int i = 1; i < 5; i++) {
//	            if (arr[i] > max) max = arr[i];
//	            if (arr[i] < min) min = arr[i];
//	        }
//
//	        System.out.println("Largest = " + max);
//	        System.out.println("Smallest = " + min);
//	    }
	        int max = arr[0], min = arr[0];
	        for(int i = 1; i < 5;i++) {
	        	if(arr[i] > max)
	        		max = arr[i];
	        	if(arr[i] < min)
	        		min = arr[i];
	        }
	        System.out.println("Max: " +max);
	        System.out.println("Min: " +min);
	    
	 }
}
