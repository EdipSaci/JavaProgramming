package day16_ForLoopStringPractice;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*
        3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid
            Ex:
                inputs:
                    10
                    20

                output:
                    200
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter two positive number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum =0;

        if (num1<0  || num2<0){
            System.out.println("Invalid number");
        }else{
            for (int i = 1; i <=num2 ; i++) {
                sum+=num1;

            }
            System.out.println(sum);
        }

        scan.close();

    }
}
