package repository5.CompositionPractice;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private MotherBoard theCpu;
    private Resolution theRezz;

    public PC(Case theCase, Monitor theMonitor, MotherBoard theCpu, Resolution theRezz) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theCpu = theCpu;
        this.theRezz = theRezz;
    }

    public void drawLogo() {
        theMonitor.drawPixelAt(45,99,"blue");
    }

    public void powerUp() {
        theCase.pressPowerButton();
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public MotherBoard getTheCpu() {
        return theCpu;
    }

    public Resolution getTheRezz() {
        return theRezz;
    }
}
