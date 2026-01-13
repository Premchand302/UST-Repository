package assignment_7;

public class Main {
	public static void main(String[] args) {
        Mobile m = new Mobile("Samsung", 30000);
        System.out.println("Brand: " + m.getBrand());
        System.out.println("Price with GST: " + m.getPriceWithGST());
    }
}
