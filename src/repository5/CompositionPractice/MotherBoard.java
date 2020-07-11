package repository5.CompositionPractice;

public class MotherBoard {
    private String manufacturer;
    private int price;

    public MotherBoard(String manufacturer, int price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }
}
