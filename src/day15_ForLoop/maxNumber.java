package day15_ForLoop;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        /*
        write a program that asks use to enter a number for 5 times
        return the maximum number
         */

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;  // any user entered number will be greater than this

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num = scan.nextInt();  // 1, 2, 3, 4, 5
            if (num> max){
                max = num;
            }
        }

        System.out.println("max = " + max);



    }
}
