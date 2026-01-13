package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(1);
		System.out.println(Collections.min(l));
		System.out.println(Collections.max(l));
		
	}
}
