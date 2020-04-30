package repository4.Inheritance.StaticVsInstanceMethods;

public class InstExample {

    public void bark() {
        System.out.println("Woof!");
    }
}

class MainInst {
    public static void main(String[] args) {
        InstExample rex = new InstExample();
        rex.bark();
    }
}