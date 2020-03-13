package repository3.challanges;

public class ThreeAndFiveSum {
    public static void main(String[] args) {
        int count = 0;
        int sum =  0;
        for(int i = 1; i <= 1000; i++) {
            if((i % 3== 0) && (i % 5 == 0)) {
                count++; // if i is divisible by 3 & 5, count goes up 1,2,3,4,5,6 etc
                sum += i; // if i is divisible by 3 & 5, all i's printed i gets added towards sum
                System.out.println("found number = " + i);
            }
            if(count == 5) {
                break;
            }
        }
        System.out.println("last number " + sum);
    }
}

