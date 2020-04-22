package repository4.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1,"Jeff",1,5,5);
        Dog dog = new Dog("boob",2,4,2,4,1,24,"gold");
        dog.eat();
        dog.walk();
    }
}
