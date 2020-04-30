package repository4.Inheritance.ThisVsSuper;

// In this example, we are setting constructors on instance variables of a rectangle

public class GoodConstructorExample {

    private int x;
    private int y;
    private int width;
    private int height;

    public GoodConstructorExample() {
        this(0,0);
    }

    public GoodConstructorExample(int width, int height) {
        this(0,0,width,height);
    }

    public GoodConstructorExample(int x,int y,int width,int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
