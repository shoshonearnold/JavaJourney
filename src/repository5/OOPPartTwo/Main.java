package repository5.OOPPartTwo;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(100,500,45);
        Case pcCase = new Case("22878","Dell","lithium battery",dimensions);
        Monitor monitor = new Monitor("29 Inch Beast","Dell", 30, new Resolution(1920,1440));
        Motherboard motherboard = new Motherboard("BJ-67", "Dell", 4,6,"v4.44");
        PC yourPC = new PC(pcCase,monitor,motherboard);
        yourPC.getMonitor().drawPixelAt(2,90,"orange");
        yourPC.getMotherboard().loadProgram("Windows 1.0");
        yourPC.getPcCase().pressPowerButton();
    }
}
