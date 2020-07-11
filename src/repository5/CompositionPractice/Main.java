package repository5.CompositionPractice;

public class Main {
    public static void main(String[] args) {
        MotherBoard motherboard = new MotherBoard("AMD", 400);
        Resolution nativeResolution = new Resolution(200,500);
        Case theCase = new Case("Dell","Z122",8,motherboard);
        Monitor theMonitor = new Monitor("Dell", "Series S", 8, nativeResolution);
        PC theSetup = new PC(theCase,theMonitor,motherboard,nativeResolution);
        theSetup.powerUp();
        theSetup.drawLogo();
    }
}

