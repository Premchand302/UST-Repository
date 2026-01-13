package assignment_8;

public class Main {
	public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.display();
        Mobile m2 = new Mobile("Samsung", 18000.0);
        m2.display();
        Mobile m3 = new Mobile("Apple", 8, 256, 75000.0);
        m3.display();
    }
}
