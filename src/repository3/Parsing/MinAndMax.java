package repository3.Parsing;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(true) {
            System.out.println("Insert Number");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            } else {
                System.out.println("Not A Number! Printing values...");
                break;
            }
            scanner.nextLine();
        }
        System.out.println(min);
        System.out.println(max);
        scanner.close();
    }
}
