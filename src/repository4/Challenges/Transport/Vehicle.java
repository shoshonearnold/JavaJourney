package repository4.Challenges.Transport;

public class Vehicle {
    private int currentDirection;
    private int currentVelocity;
    private String name;
    private String size;

    public Vehicle(String name, String size) {
        this.currentDirection = 0;
        this.currentVelocity = 0;
        this.name = name;
        this.size = size;
    }

    public void steering(int direction) {
        this.currentDirection += direction;
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
    }

    public void stop() {
        currentVelocity = 0;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
