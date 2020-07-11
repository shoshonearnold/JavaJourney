package repository5.CompositionPractice;

public class Case {
    private String manufacturer;
    private String model;
    private int usbSlots;
    private MotherBoard cpuType;

    public Case(String manufacturer, String model, int usbSlots, MotherBoard cpuType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.usbSlots = usbSlots;
        this.cpuType = cpuType;
    }

    public void pressPowerButton() {
        System.out.println("Computer was turned on");
    }

    public MotherBoard getCpuType() {
        return cpuType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getUsbSlots() {
        return usbSlots;
    }
}
