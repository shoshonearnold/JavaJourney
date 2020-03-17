package repository3.challanges;

public class Palindrome {

public static boolean isPalindrome(int number) {
    int forward = number;
    int backward = 0;
    int digit;
    while (number != 0) {
        digit = number % 10;
        backward *= 10;
        backward+= digit;
        number /= 10;
    }
    return forward == backward;
}

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
