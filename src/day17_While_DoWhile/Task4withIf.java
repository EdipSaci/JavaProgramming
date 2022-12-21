package day17_While_DoWhile;

import java.util.Scanner;

public class Task4withIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        String divisableBy15 = "";
        String divisableBy5 = "";
        String divisableBy3 = "";

        for (int i = 1; i <=num ; i++) {

            if (i%15 ==0){
                divisableBy15 += i + " ";
            } else if (i%5 == 0) {
                divisableBy5 += i + " ";
            } else if (i%3 ==0) {
                divisableBy3 += i + " ";
            }
        }
        System.out.println("divisableBy15 = " + divisableBy15);
        System.out.println("divisableBy5 = " + divisableBy5);
        System.out.println("divisableBy3 = " + divisableBy3);

        scan.close();


    }
}
