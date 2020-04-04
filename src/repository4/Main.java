package repository4;

public class Main {
    public static void main(String[] args) {
        Classes ford = new Classes();
        ford.setDoors(4);
        ford.setWheels(4);
        ford.setColor("white");
        ford.setEngine("Idk some engine ffs lol");
        ford.setModel("f-150");
        System.out.println("your ford has " + ford.getDoors() + " doors");
        System.out.println("your ford has " + ford.getWheels() + " wheels");
        System.out.println("your ford is " + ford.getColor());
        System.out.println("your ford has " + ford.getEngine());
        System.out.println("your ford has a " + ford.getModel() + " under the hood");
    }
}
