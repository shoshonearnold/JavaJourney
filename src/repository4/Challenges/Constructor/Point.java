package repository4.Challenges.Constructor;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        int xb = 0;
        int yb = 0;
        return distance(xb,yb);
    }

    public double distance(int xb, int yb) {
        return Math.sqrt((xb - x) * (xb - x) + (yb - y) * (yb - y));
    }

    public double distance(Point instancePoint) {
        int xb = instancePoint.x;
        int yb = instancePoint.y;
        return distance(xb,yb);
    }
}
