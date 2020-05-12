package repository4.Inheritance;

public class Vehicle {

    private int engine;
    private int seats;

    public Vehicle(int engine, int seats) {
        this.engine = engine;
        this.seats = seats;
    }
}

class Car extends Vehicle {
    private int tires;
    private String steering;

    public Car(int engine, int seats) {
        this(engine, seats,4,"AWD");
    }

    public Car(int engine, int seats, int tires, String steering) {
        super(engine, seats);
        this.tires = tires;
        this.steering = steering;
    }
}

class Mustang extends Car {
    private int gears;
    private int moving;

    public Mustang(int engine, int seats) {
        super(engine, seats);
    }

    public Mustang(int engine, int seats, int tires, String steering) {
        this(engine, seats, tires, steering,6,90);
    }

    public Mustang(int engine, int seats, int tires, String steering, int gears, int moving) {
        super(engine, seats, tires, steering);
        this.gears = gears;
        this.moving = moving;
    }
}
