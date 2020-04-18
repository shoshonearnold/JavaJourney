package repository4.Inheritance;

public class Vehicle {
    protected String brand = "Ford";    // vehicle attribute
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modeName = "Mustang";     // Vehicle -> Car attribute
    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        System.out.println(car.brand + " " + car.modeName);
    }
}
