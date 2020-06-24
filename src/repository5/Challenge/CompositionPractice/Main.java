package repository5.Challenge.CompositionPractice;

public class Main {
    public static void main(String[] args) {
        Sheets shoshonesSheets = new Sheets("cotton");
        ButtImprint shoshonesButt = new ButtImprint("w");
        Room myRoom = new Room(shoshonesButt,shoshonesSheets,);
    }
}

// put the rest of the classes here up top ^