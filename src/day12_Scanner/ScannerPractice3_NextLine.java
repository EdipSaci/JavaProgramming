package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");

        String fullname =input.nextLine();

        System.out.println("Enter your programming language ");
        String programming =input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine(); // capture the enter key that user pressed for nextInt()

        System.out.println("Enter your school name");
        String schoolname = input.nextLine();

        System.out.println("fullname = " + fullname);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolname = " + schoolname);

        input.close();
    }
}
