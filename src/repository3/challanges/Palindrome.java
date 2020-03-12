package repository3.challanges;

public class Palindrome {

//    public static boolean isPalindrome(int number) {
//        int backward = 0;
//        int  digit = 0;
//        int forward = number;
//        while (number != 0) {
//            digit = number % 10;
//            backward = backward * 10;
//            backward += digit;
//            number /= 10;
//        }
//        if(backward == forward) {
//            return true;
//        }
//        return false;
//    }

    public static boolean isPalindrome(int number) {
        int forward = number;
        int backward = 0;
        int digit = 0;
        while (number != 0) {
            digit = number % 10;
            backward = backward * 10;
            backward += digit;
            number /= 10;
        }
        if(forward == backward) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(1501));
    }
}
