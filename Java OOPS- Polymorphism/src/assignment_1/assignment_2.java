package assignment_1;

class Area{
	void area(int side) {
		System.out.println("Area of square: " +(side*side));
	}
	void area(int length, int breadth) {
		System.out.println("Area of rectangle: " +(length*breadth));
	}
	void area(double radius) {
		System.out.println("Area of circle: " +(3.14 * radius * radius));
	}
}
public class assignment_2 {
	public static void main(String[] args) {
		Area a = new Area();
		a.area(4);
		a.area(4, 6);
		a.area(5);
	}
}
