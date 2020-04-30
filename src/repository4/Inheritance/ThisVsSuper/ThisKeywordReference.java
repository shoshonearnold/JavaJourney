package repository4.Inheritance.ThisVsSuper;

// The keyword "this" is commonly seen in constructors and setters

public class ThisKeywordReference {

    private String color;

    public ThisKeywordReference(String color) {
        // this keyword is required
        this.color = color;
    }

    public String getColor() {
        // this getter is optional??
        return color;
    }

    public void setColor(String color) {
        // this keyword is required
        this.color = color;
    }
}
