package repository2;

public class IntEqualityPrinter {
    public static void printEqual(int fart, int goose, int spackle) {

        if(fart < 0 || goose < 0 || spackle < 0) {
            System.out.println("Invalid Value");
        } else {
           if((fart == goose) && (goose == spackle) && (spackle == fart)) {
               System.out.println("All numbers are equal");
           } else {
               if((fart != goose) && (goose != spackle) && (spackle != fart)) {
                   System.out.println("All numbers are different");
               } else {
                   System.out.println("Neither all are equal or different");
               }
           }
        }
    }
}
