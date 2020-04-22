package repository4.Inheritance;

public class Dog extends Animal {

    /*
     "extends" keyword is inheriting one child class from the parent.
     the instance variables below are traits DOGS have, but not all animals.
     Therefore, we need to extend the class from animal to dog to specify what animal we are referencing.
     */

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, name, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("this unique method is being called");
    }

    @Override
    public void eat() {
        System.out.println("THIS FINAL METHOD IS BEING CALLED");
        chew();
        super.eat();
    }
}
