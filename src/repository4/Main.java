package repository4;

public class Main {
    public static void main(String[] args) {
        Classes porsche = new Classes();
        Classes ford = new Classes();
        ford.setModel("F-150");
        System.out.println("Model is " + ford.getModel());
    }
}
