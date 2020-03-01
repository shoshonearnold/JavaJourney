package repository3;

public class FlowStatements {

    public static void timeOfDay(int hours) {
        if(hours > 0 && hours < 12 ) {
            System.out.println("Good Morning");
        } else if(hours > 13 && hours < 18) {
            System.out.println("Good Afternoon");
        } else if(hours > 18 && hours < 23) {
            System.out.println("Good Evening");
        }
    }

    public static void ternary(int plastic) {
        
    }

    public static void main(String[] args) {
        timeOfDay(14);
    }
}
