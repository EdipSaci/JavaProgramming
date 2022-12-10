package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Enter

        System.out.println("enter your age");
        int age = input.nextInt(); //19


        input.nextLine();

        System.out.println("enter full name");
        String fullname= input.nextLine();

        System.out.println("enter your GPA");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("enter your school name");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullname = " + fullname);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);
        input.close();
    }
}
/*
1. ask the user enter age nextInt()
2. enter full name  nextLine
 */