package repository4.classes;

public class Main {
    public static void main(String[] args) {
        Classes ford = new Classes();
        ford.setDoors(4);
        ford.setWheels(4);
        ford.setModel("f-150");
        ford.setColor("Blue");
        ford.setEngine("567654");
        System.out.println("Your ford has " + ford.getDoors() + " doors");
        System.out.println("Your ford has " + ford.getWheels() + " wheels");
        System.out.println("Your ford is a " + ford.getModel());
        System.out.println("Your ford is " + ford.getColor() + " on the exterior");
        System.out.println("Your ford has engine #" + ford.getEngine() + " installed");
    }
}
