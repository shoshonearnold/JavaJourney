package repository3;

public class FlowStatementsForLoops {

    public static double calculateInterest(double amount, double interestRate) {
        for(interestRate = 8; interestRate > 1; interestRate--) {
            System.out.println(String.format("%.2f",amount * (interestRate/100)));
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000,2.00));
    }
}
