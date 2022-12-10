package day17_While_DoWhile;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter your first number");
        int num1  = scan.nextInt();

        System.out.println("enter your second number");
        int num2  = scan.nextInt();

        System.out.println("enter a math operator");
        char ch = scan.next().charAt(0);

        while (!(ch == '+' || ch== '-')){ // if the operator is Invalid
            System.err.println("Invalid operator,Please re-enter");
            ch = scan.next().charAt(0);
        }

        System.out.println((ch == '+' ?  num1+num2   : num1-num2));
        scan.close();

    }

}
