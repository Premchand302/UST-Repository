package assignment;

import java.util.Scanner;

public class DuplicateChar_32 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string");
	        String str = sc.nextLine().toLowerCase();
	        char[] ch = str.toCharArray();

	        System.out.println("Duplicate characters:");
	        for (int i = 0; i < ch.length; i++) {
	            int count = 1;
	            if (ch[i] == ' ')
	                continue;
	            for (int j = i + 1; j < ch.length; j++) {
	                if (ch[i] == ch[j]) {
	                    count++;
	                    ch[j] = ' ';
	                }
	            }
	            if (count > 1)
	                System.out.println(ch[i]);
	        }
	    }
}
