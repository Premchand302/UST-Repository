package assignment_1;

class Calculator {
	void add(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}
	void add(int a, int b, int c) {
		int result = a+b+c;
		System.out.println(result);
	}
	void add(double a, double b) {
		double result = a+b;
		System.out.println(result);
	}
	
}
public class Main_1 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(1,4);
		c.add(23.4, 11.0);
		c.add(1, 2, 3);
	}

}
