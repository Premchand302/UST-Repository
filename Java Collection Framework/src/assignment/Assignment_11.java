package assignment;

import java.util.LinkedList;

public class Assignment_11 {
	public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
