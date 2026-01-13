package assignment_1;

class Printer {

    void print(int number) {
        System.out.println("Integer: " + number);
    }

    void print(String text) {
        System.out.println("String: " + text);
    }

    void print(int number, String text) {
        System.out.println("Integer: " + number + ", String: " + text);
    }
}

public class Assignment_3 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);
        p.print("Hello");
        p.print(5, "Java");
    }
}
