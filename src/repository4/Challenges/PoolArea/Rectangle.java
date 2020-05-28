package repository4.Challenges.PoolArea;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if(length < 0) {
            length = 0;
        }
        if(width < 0) {
            width = 0;
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * length;
    }
}
