package repository5.Challenge.CompositionPractice;

public class Room {
    private Bed shoshonesBed;
    private ButtImprint shoshonesButt;
    private Desk shoshoneDesk;
    private GamingChair shoshonesGamingChair;
    private Sheets shoshonesSheets;
    private Uses deskUses;
    private Walls roomWalls;

    public Room(Bed shoshonesBed, ButtImprint shoshonesButt, Desk shoshoneDesk, GamingChair shoshonesGamingChair, Sheets shoshonesSheets, Uses deskUses, Walls roomWalls) {
        this.shoshonesBed = shoshonesBed;
        this.shoshonesButt = shoshonesButt;
        this.shoshoneDesk = shoshoneDesk;
        this.shoshonesGamingChair = shoshonesGamingChair;
        this.shoshonesSheets = shoshonesSheets;
        this.deskUses = deskUses;
        this.roomWalls = roomWalls;
    }
}
