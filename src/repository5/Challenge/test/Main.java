package repository5.Challenge.test;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(45,56,10);
        Resolution nativeResolution = new Resolution(920,456);
        Case theCase = new Case("400","Dell","AC",dimensions);
        Monitor theMonitor = new Monitor("999","Dell",100,nativeResolution);
        Motherboard theCPU = new Motherboard("Dell","Z900","wut",4,7);
    }
}
