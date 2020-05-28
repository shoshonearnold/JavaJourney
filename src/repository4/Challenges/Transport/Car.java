package repository4.Challenges.Transport;

public class Car extends Vehicle {
    private int wheels;
    private int gears;
    private int doors;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int gears, int doors, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
    }

    /*public void move(int velocity, int direction) {
        move(velocity, direction);
    }*/

    @Override
    public void move(int velocity, int direction) {
        super.move(velocity, direction);
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
