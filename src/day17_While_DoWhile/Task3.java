package day17_While_DoWhile;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("enter a math operator");
        String math = scan.next();

        while (!(math.equals("+")||math.equals("-")||math.equals("*")||math.equals("/"))){
            System.err.println("Invalid operator, re-enter the operator");
            math = scan.next();
        }
        if (math.equals("+")){
            System.out.println("result= " +(num1+num2));
        } else if (math.equals("-")) {
                System.out.println("result= " +(num1-num2));
        } else if (math.equals("*")) {
            System.out.println("result= " +(num2*num1));
        } else if (math.equals("/")) {
            System.out.println("result= " +(num1/num2));
        }

        scan.close();

    }
}
