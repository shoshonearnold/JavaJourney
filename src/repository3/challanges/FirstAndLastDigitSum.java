package repository3.challanges;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int firstNum = 0;
        int lastNum = 0;
        if(number < 0) {
            return -1;
        }
        while (number != 0) {
            firstNum = number % 10;
            
            while (number != 0) {
                lastNum = number % 10;
                number /= 10;
                firstNum =+ lastNum;
            }
        }
        return firstNum;
    }


    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(13));
    }
}
