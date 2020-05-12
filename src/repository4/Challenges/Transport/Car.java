package repository4.Challenges.Transport;

public class Car extends Vehicle {
    private int wheels;
    private int engine;

    public Car(String name, String size) {
        this(name, size,4,1);
    }

    public Car(String name, String size, int wheels, int engine) {
        super(name, size);
        this.wheels = wheels;
        this.engine = engine;
    }
}
