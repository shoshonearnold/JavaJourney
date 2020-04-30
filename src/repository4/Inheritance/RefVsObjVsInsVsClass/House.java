package repository4.Inheritance.RefVsObjVsInsVsClass;

public class House {
    private String color;

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColor()); // prints blue
        System.out.println(anotherHouse.getColor()); // prints blue as well, see line 21

        anotherHouse.setColor("orange");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor()); // Should now print orange

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor());
        System.out.println(greenHouse.getColor());
        System.out.println(anotherHouse.getColor());
    }
}
