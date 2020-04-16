package repository4.Challenges.Constructor.CarpetCostCalculator;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(12.75,18.80);
        Carpet carpet = new Carpet(7.25);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(String.format("%.2f",calculator.getTotalCost()));
    }
}
