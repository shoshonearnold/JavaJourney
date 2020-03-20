package repository3.Parsing;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(true) {
            System.out.println("Enter Number: ");
            boolean hasNestInt = scanner.hasNextInt();
            if(hasNestInt) {
                int number = scanner.nextInt();
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            } else {
                System.out.println("Not A NUmber! Printing Values...");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Smallest was "+ min + " and biggest was " + max);
        scanner.close();
    }
}
