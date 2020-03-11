package repository3.test;

public class Palindrome {

public static boolean isPalindrome(int number) {
    int digit, reversed = 0;
    while (number != 0) {
        digit = number % 10;
        reversed = reversed * 10 + digit;
        number /= 10;
    }
    if (number == reversed) {
        return true;
    }
    return false;
}

    public static void main(String[] args) {
        isPalindrome(102);
    }
}
