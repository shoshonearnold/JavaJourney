package repository5.Challenge.test;

public class Motherboard {

    private String manufacturer;
    private String model;
    private String bios;
    private int ramSlots;
    private int cardSlots;

    public Motherboard(String manufacturer, String model, String bios, int ramSlots, int cardSlots) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getBios() {
        return bios;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }
}
