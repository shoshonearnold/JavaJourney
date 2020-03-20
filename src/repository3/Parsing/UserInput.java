package repository3.Parsing;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Year Of Birth Here: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            System.out.println("Please Enter Your Name here: ");
            scanner.nextLine();
            int age = 2019 - yearOfBirth;
            String name = scanner.nextLine();
            if(age > 0 && age <= 100) {
                System.out.println("Youe name is " + name + " and you're " + age + " years old");
            } else {
                System.out.println("Invalid year Of Birth");
            }
        } else {
            System.out.println("Unable to Parse Year Of Birth");
        }
        scanner.close();
    }
}



