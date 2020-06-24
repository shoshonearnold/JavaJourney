package repository5.Challenge.CompositionPractice;

public class Desk {
    private String color;
    private Uses primaryUse;

    public Desk(String color, Uses primaryUse) {
        this.color = color;
        this.primaryUse = primaryUse;
    }

    public String getColor() {
        return color;
    }

    public Uses getPrimaryUse() {
        return primaryUse;
    }
}
