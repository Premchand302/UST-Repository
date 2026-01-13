package assignment_1;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Assignment_6 {
    public static void main(String[] args) {
        Shape s;  
        s = new Circle();   
        s.draw();          
        s = new Rectangle(); 
        s.draw();            
    }
}