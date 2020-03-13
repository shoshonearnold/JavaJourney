package repository3.FlowWork;

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

// Switch Statements

    public static void flowSwitch (int value){
//            if(value == 1) {
//                System.out.println("Value was 1");
//            } else if(value == 2) {
//                System.out.println("Value was 2");
//            } else {
//                System.out.println("Was not 1 or 2");
//            }

        int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
            System.out.println("value was 3, or 4, or 5");
            System.out.println("Actually the value was " + switchValue);
            break;
            default:
                System.out.println("Was not 1 or 2");
        }
        char myLetter = 'C';
        switch(myLetter) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.println("Value was D");
                break;
            case 'E':
                System.out.println("Value was E");
                break;
            default:
                System.out.println("not a graded letter");
        }
    }

    private static boolean isLeapYear(int year) {
        if(year <= 1 || year >= 9999) {
            System.out.println("invalid");
            return false;
        } else {
            if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 != 0)) {
                return true;
            }
            if ((year % 4 != 0) && (year % 100 == 0) && (year % 400 != 0)) {
                return false;
            }
            if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                return true;
            }
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if((month < 1 || month > 12) && (year < 1 || year > 9999)) {
            return -1;
        }
        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                if(isLeapYear(year)) {
                    System.out.println("29");
            } else {
                    System.out.println("28");
                }
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("other");
                break;
        }
        return -1;
    }







    public static void main(String[] args) {
        getDaysInMonth(2, 2029);
        flowSwitch(5);
        timeOfDay(14);
    }
}
