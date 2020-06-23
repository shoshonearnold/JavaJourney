package repository5.Challenge.Composition;

public class Main {
    public static void main(String[] args) {
        Material softMaterial = new Material("cotton");
        Bed shoshonesBed = new Bed("Purple model 3", 185, softMaterial);
        Desk shoshoneDesk = new Desk("Black",130);
        Room myRoom = new Room(shoshoneDesk,shoshonesBed);
        System.out.println(shoshonesBed.doesHaveSprings());
    }
}
