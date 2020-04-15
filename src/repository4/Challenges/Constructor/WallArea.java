package repository4.Challenges.Constructor;

public class WallArea {

    private double height;
    private double width;

    public WallArea(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public WallArea() {
        this(12.78,99.98);
    }

    public double getHeight() {
        if(height < 0) {
            this.height = 0;
        }
        return this.height;
    }

    public double getWidth() {
        if(width < 0) {
            this.width = 0;
        }
        return width;
    }

    public void setWidth(double adjustedWidth) {
        if(adjustedWidth < 0) {
            this.width = 0;
        }
        this.width = width;
    }

    public void setHeight(double adjustedHeight) {
        if(adjustedHeight < 0) {
            this.height = 0;
        }
        this.height = height;
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
