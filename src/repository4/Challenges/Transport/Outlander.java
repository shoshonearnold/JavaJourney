package repository4.Challenges.Transport;

public class Outlander extends Car {
    private int roadServiceMonths;

    // Included spare tires, hood & trunk

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 6, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 35) {
            changeGear(2);
        } if(newVelocity > 35 && newVelocity <= 70) {
            changeGear(3);
        } if(newVelocity > 70 && newVelocity <= 105) {
            changeGear(4);
        } if(newVelocity > 105 && newVelocity <= 145) {
            changeGear(5);
        } if(newVelocity > 145 && newVelocity <= 180) {
            changeGear(6);
        }
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }
}
