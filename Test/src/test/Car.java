package test;

abstract class Vehicle {
    Vehicle() {
        System.out.println("Vehicle created");
    }
    abstract void run();
}

class Car extends Vehicle {
	void run() {
        System.out.println("Car running");
    }

    public static void main(String[] args) {
        new Car();

    }
}

