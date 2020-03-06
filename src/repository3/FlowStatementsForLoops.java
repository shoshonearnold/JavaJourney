package repository3;

public class FlowStatementsForLoops {

    public static double calculateInterest(double amount, double interestRate) {
        for(interestRate = 8; interestRate > 1; interestRate--) {
            System.out.println(String.format("%.2f",amount * (interestRate/100)));
        }
        return -1;
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= n/2 // <-- no number that is greater than n / 2 is going to divide into n
         ; i++) {
            if(n % i == 0)
            return false;
        }
        int count = 0;
        for(int c = 10; c < 50; c++) {
            if(isPrime(c)) {
                count++;
                System.out.println("number " + c + " is a prime number");
                if(count == 3) {
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(calculateInterest(10000,2.00));
        isPrime(5);
    }
}
