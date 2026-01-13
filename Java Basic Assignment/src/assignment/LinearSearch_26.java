package assignment;

import java.util.Scanner;

public class LinearSearch_26 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter Array elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to find:");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Element not found");
    }
}
