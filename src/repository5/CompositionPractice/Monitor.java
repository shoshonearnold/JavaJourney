package repository5.CompositionPractice;

public class Monitor {
    private String manufacturer;
    private String model;
    private int buttons;
    private Resolution nativeResolution;

    public Monitor(String manufacturer, String model, int buttons, Resolution nativeResolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.buttons = buttons;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("drawing pixel at " + x + ", " + y + " with the color " + color);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getButtons() {
        return buttons;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
