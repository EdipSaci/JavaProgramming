package day16_ForLoopStringPractice;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 5 number");
        int amountOfPositiveNumbers = 0;
        int amountOfNegativeNumbers = 0;

        for (int i = 1; i <=5 ; i++) {
            int num =scan.nextInt();
            if (num>0){
                amountOfPositiveNumbers++;
            } else if (num<0) {
                amountOfNegativeNumbers++;
            }
        }

        System.out.println(amountOfPositiveNumbers + " positive and "+amountOfNegativeNumbers+ " negative" );
        scan.close();
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */

    }
}
