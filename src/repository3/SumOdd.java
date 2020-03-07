package repository3;

public class SumOdd {

    public static int sumOdd(int start, int end) {
        if((start < 0 || end < 0) || (end < start)/*|| (start == end)*/) {
            return -1;
        }
        int count = 0;
        int oddSum = 0;
        for(int i = start; i <= end; i++) {
            if(isOdd(i)) {
            count++;
            oddSum += i;
                System.out.println("found number " + i);
            }
            if(count > end) {
                break;
            }
        }
        System.out.println("last number " + oddSum);
        return oddSum;
    }

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }
        if(number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        sumOdd(1,11);
    }
}
