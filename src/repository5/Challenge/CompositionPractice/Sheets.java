package repository5.Challenge.CompositionPractice;

public class Sheets {
    private String material;

    public Sheets(String material) {
        this.material = material;
    }

    public void moveSheets() {
        System.out.println("sheets moved");
    }

    public String getMaterial() {
        return material;
    }
}
