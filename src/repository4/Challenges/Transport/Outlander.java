package repository4.Challenges.Transport;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5
                /*including spare*/, 6/*including trunk,hood*/, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void setRoadServiceMonths(int roadServiceMonths) {
        this.roadServiceMonths = roadServiceMonths;
    }
}
