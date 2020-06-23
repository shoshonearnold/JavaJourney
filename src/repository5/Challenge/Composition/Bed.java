package repository5.Challenge.Composition;

public class Bed {
    private String model;
    private int weight;
    private Material bedMaterial;

    public Bed(String model, int weight, Material bedMaterial) {
        this.model = model;
        this.weight = weight;
        this.bedMaterial = bedMaterial;
    }

    public boolean doesHaveSprings() {
        return false;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public Material getBedMaterial() {
        return bedMaterial;
    }
}
