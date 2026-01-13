package assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment_1 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Anu");
		l.add("Athuu");
		l.add("Prem");
		for(int i =0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
}
