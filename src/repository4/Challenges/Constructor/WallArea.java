package repository4.Challenges.Constructor;

public class WallArea {

    private double height;
    private double width;

    public WallArea(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public WallArea() {
        this(0.0,0.0);
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if(width <= 0) {
            this.width = 0.0;
        }else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height <= 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        WallArea wallArea = new WallArea(5,4);
        System.out.println("the area of this room is " + wallArea.getArea());
        System.out.println("the width of this room is " + wallArea.getWidth() + " sq/ft and the height of this room is " + wallArea.getHeight() + " sq/ft");
    }
}
