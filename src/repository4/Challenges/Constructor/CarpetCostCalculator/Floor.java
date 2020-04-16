package repository4.Challenges.Constructor.CarpetCostCalculator;

public class Floor {

    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        if(this.length < 0) {
            this.length = 0;
        }
        return this.length;
    }

    public double getWidth() {
        if(this.width < 0) {
            this.width = 0;
        }
        return this.width;
    }

    public double getArea() {
        return (this.length * this.width);
    }
}


