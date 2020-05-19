package repository4.Challenges.Transport;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5/*+ spare*/, 6/*+ hood,trunk*/, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        }

    }
}
