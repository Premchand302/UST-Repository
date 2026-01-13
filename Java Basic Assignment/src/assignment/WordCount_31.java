package assignment;

import java.util.Scanner;

public class WordCount_31 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int count = str.split(" ").length;
        System.out.println("Number of words = " + count);
    }
}
