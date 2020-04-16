package repository4.Challenges.Constructor.CarpetCostCalculator;

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        if(this.cost < 0) {
            this.cost = 0;
        }
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
