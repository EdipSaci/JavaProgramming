package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        /*
        1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

         */

        /*
        20 / 6 ==> 3 with the reaminder of 2

                        a = 20
                        b = 6;

                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2

                        x = 100;
                        y = 8;

                        while(a >= b){
                                a -= b;
                                count++;
                        }

         */
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int count = 0;
        while (num1>num2){
            count++;
            num1-=num2;
        }
        System.out.println("There is "+count+" times in this number and the remainder is, "+ num1);

        scan.close();
    }
}
