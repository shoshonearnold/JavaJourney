package repository3.Parsing;


import java.util.Scanner;

public class MathUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while(counter < 10){
            int order = counter + 1;
            System.out.println("Enter # "+ order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("not a n int");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}
