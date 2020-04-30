package repository4.Inheritance.StaticVsInstanceMethods;

public class StatExample {

    public static void printSum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

class Main {
    public static void main(String[] args) {
        StatExample.printSum(1,67);
        printHello();
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}
