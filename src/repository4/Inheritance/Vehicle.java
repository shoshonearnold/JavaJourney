package repository4.Inheritance;

public class Vehicle {
    private int engine;
    private int size;

    public Vehicle(int engine, int size) {
        this.engine = engine;
        this.size = size;
    }
}

class Car extends Vehicle {

    private int wheels;
    private String Color;

    public Car(int engine, int size) {
        this(engine, size,1,"red");
    }

    public Car(int engine, int size, int wheels, String color) {
        super(engine, size);
        this.wheels = wheels;
        Color = color;
    }
}

class Mustang extends Car {
    private String steering;
    private int gears;
    private int speed;

    public Mustang(int engine, int size) {
        super(engine, size);
    }

    public Mustang(int engine, int size, int wheels, String color) {
        super(engine, size, wheels, color);
    }

    public Mustang(int engine, int size, int wheels, String color, String steering, int gears, int speed) {
        super(engine, size, wheels, color);
        this.steering = steering;
        this.gears = gears;
        this.speed = speed;
    }
}
