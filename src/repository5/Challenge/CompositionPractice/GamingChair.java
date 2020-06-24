package repository5.Challenge.CompositionPractice;

public class GamingChair {
    private String color;
    private ButtImprint shapeOfImprint;

    public GamingChair(String color, ButtImprint shapeOfImprint) {
        this.color = color;
        this.shapeOfImprint = shapeOfImprint;
    }

    public String getColor() {
        return color;
    }

    public ButtImprint getShapeOfImprint() {
        return shapeOfImprint;
    }
}
