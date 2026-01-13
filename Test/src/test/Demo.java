package test;
class Demo {
    void m1() {
        int a = 10 / 0;
    }

    void m2(){
        m1();
    }

    public static void main(String[] args) {
        try {
            new Demo().m2();
        } catch (ArithmeticException e) {
            System.out.println("Handled");
        }
    }
}
