package day15_ForLoop;

import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        /*
        write a program that asks use to enter a number for 5 times
        return the minimum number
         */

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
          //min =

        for (int i =10 ; i<15 ; i++){
            System.out.println("enter a number");
            int num = scan.nextInt();  // 67, 23, 42, 5,-20
            if (num<min){
                min=num;
            }
        }

        scan.close();

        System.out.println("min = " + min);

    }
}
