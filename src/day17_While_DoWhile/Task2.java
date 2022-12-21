package day17_While_DoWhile;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter positive numbers");
        int num = scan.nextInt();
        int sum = 0;
        while (num < 0){
            System.out.println("Invalid number, please re enter a positive number");
            num=scan.nextInt();
            sum+=num;
            System.out.println(sum);
        }
        scan.close();

/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */


    }
}
