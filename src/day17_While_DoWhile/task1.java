package day17_While_DoWhile;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter two number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int howMany = 0;
        int remainder = 0;
        int result = num1;
        while (result>= num2){
            result -= num2;
            howMany++;
        }
        remainder =result;
        System.out.println("There are " + howMany + " times " + num2 + " in " + num1 + " and the remainder is " + remainder + ".");

        scan.close();

    }
}
