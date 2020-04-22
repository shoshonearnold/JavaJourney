package repository4.Inheritance;

public class Animal {

    private int brain;
    private String name;
    private int body;
    private int size;
    private int weight;

    public Animal(int brain, String name, int body, int size, int weight) {
        this.brain = brain;
        this.name = name;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("this method is being called");
    }

    public void move(int speed) {
        System.out.println("animal is moving @ " + speed);
    }

    public int getBrain() {
        return brain;
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
