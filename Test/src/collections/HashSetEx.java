package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(20);
		s.add(10);
		s.add(11);
		s.add(10);
		System.out.println(s);
		
	}
}
