package repository4.Challenges.Constructor;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(2,7);
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
        int x1 = 0;
        int y1 = 0;
        return distance(x1,y1);
    }

    public double distance(int x, int y) {
        return distance(0,0);
    }
}
