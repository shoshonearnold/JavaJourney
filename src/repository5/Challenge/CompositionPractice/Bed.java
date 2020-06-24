package repository5.Challenge.CompositionPractice;

public class Bed {
    private String color;
    private Sheets shoshonesSheets;

    public Bed(String color, Sheets shoshonesSheets) {
        this.color = color;
        this.shoshonesSheets = shoshonesSheets;
    }

    public String getColor() {
        return color;
    }

    public Sheets getShoshonesSheets() {
        return shoshonesSheets;
    }
}
