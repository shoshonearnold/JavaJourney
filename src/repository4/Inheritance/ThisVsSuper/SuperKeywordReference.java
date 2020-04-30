package repository4.Inheritance.ThisVsSuper;

public class SuperKeywordReference { // Parent class, aka super class

    public void printMethod() {
        System.out.println("Printed method.");
    }
}

class subClass extends SuperKeywordReference { // subclass aka child class
    /*
    this @override symbol below is an identifier to display an overridden class.
    It overrides the method from the parent
    */
    @Override
    public void printMethod() { // calls method in superclass (parent)
        super.printMethod();
        System.out.println("Sub-printed method.");
    }
}

class Main {
    public static void main(String[] args) {
        subClass s = new subClass();
        s.printMethod();
    }
}
