package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <101 ; i++) {// 1,2,3,4,5,6,7,8....100
            sum += i;
        }
        System.out.println(sum);//5050

        System.out.println("------------------------");

        int total =0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            total += scan.nextInt();
        }

        System.out.println("total = " + total);



        scan.close();


    }
}
