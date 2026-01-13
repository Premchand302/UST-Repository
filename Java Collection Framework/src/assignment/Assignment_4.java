package assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_4 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Java");
		l.add("Python");
		l.add(".Net");
		l.add("PHP");
		l.add("C++");
		for(String i : l) {
			System.out.println(i);
		}
	}
}
