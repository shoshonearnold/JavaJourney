package repository4.Inheritance.ThisVsSuper;

// In this example, we are initializing a shape (Rectangle)

public class GoodSuperExample {

    private int x;
    private int y;

    public GoodSuperExample(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class smallRectangle extends GoodConstructorExample {

    private int width;
    private int height;

    public smallRectangle(int x,int y) {
        this(x,y,0,0);
    }

    public smallRectangle(int x,int y,int width,int height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }

}
