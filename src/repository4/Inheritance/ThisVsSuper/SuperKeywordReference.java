package repository4.Inheritance.ThisVsSuper;

public class SuperKeywordReference { // Parent class, aka super class

    public void printMethod() {
        System.out.println("Printed method.");
    }
}

class subClass extends SuperKeywordReference { // subclass aka child class
    // this @override symbol below is an identifier to display an overridden class, it overriddes the method from the parent
    @Override
    public void printMethod() {
        super.printMethod();
    }
}
