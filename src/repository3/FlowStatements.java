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

    public static void timeOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the weekend");
        }
    }


    public static void main(String[] args) {
        timeOfWeek();
        timeOfDay(14);
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
