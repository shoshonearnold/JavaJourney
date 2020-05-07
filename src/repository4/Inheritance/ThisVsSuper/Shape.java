package repository4.Inheritance.ThisVsSuper;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x,int y) {
        this(x,y,0,0);
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}

class bigRectangle extends Rectangle {
    private int size;
    private String name;

    public bigRectangle(int x, int y) {
        super(x, y,0,0);
    }

    public bigRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public bigRectangle(int x, int y, int width, int height, int size, String name) {
        super(x, y, width, height);
        this.size = size;
        this.name = name;
    }
}


