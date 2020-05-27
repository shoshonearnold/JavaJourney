package repository4.Challenges.Transport;

public class Car extends Vehicle {
    private int gears;
    private int wheels;
    private int doors;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int gears, int wheels, int doors, boolean isManual) {
        super(name, size);
        this.gears = gears;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
    }

    /*public void speed(int velocity, int direction) {
        speed(velocity, direction);
    }*/

    @Override
    public void speed(int velocity, int direction) {
        super.speed(velocity, direction);
    }

    public int getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
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
