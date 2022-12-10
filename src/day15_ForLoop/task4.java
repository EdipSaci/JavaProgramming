package day15_ForLoop;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scan.nextInt();

        int factorial = 1;
        for (int i = 1; i <=number ; i++) {
            factorial *=i;
        }
        System.out.println("factorial = " + factorial);


        scan.close();
    }
}
