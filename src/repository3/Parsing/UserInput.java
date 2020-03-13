package repository3.Parsing;

//public class UserInput {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth: ");
//        boolean hasNextInt = scanner.hasNextInt();
//        if(hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("enter Your Name: ");
//            String name = scanner.nextLine();
//            int age = 2020 - yearOfBirth;
//            if(age >= 0 && age <= 100) {
//                System.out.println("Your name is " + name + " and your age is "+ age);
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//        } else {
//            System.out.println("Unable to parse name");
//        }
//    }
//}

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please State Your Year Of Birth ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Your Name ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;
            if(age >= 0 && age <= 100) {
                System.out.println("Your Name is " + name + " And Your Age Is " + age);
            } else {
                System.out.println("Invalid Date Of Birth");
            }
        } else {
            System.out.println("Unable to parse name");
        }
    }
}