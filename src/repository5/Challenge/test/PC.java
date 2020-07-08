package repository5.Challenge.test;

public class PC {
    private Case theCase;
    private Monitor theScreen;
    private Motherboard theCPU;

    public PC(Case theCase, Monitor theScreen, Motherboard theCPU) {
        this.theCase = theCase;
        this.theScreen = theScreen;
        this.theCPU = theCPU;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheScreen() {
        return theScreen;
    }

    public Motherboard getTheCPU() {
        return theCPU;
    }
}
