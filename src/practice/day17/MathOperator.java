package practice.day17;

import java.util.Scanner;

public class MathOperator {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter two number");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();

        System.out.println("Enter a math operator:  +  -   *  / ");
        String operator = scanner.next();

        while (!(operator.equals("+")  ||  operator.equals("-") || operator.equals("/") || operator.equals("*"))){
            System.err.println("Invalid operator. please re-enter");
            operator= scanner.next();
        }

        if (operator.equals("+")){
            System.out.println(num1+num2);
        } else if (operator.equals("-")) {
            System.out.println(num1-num2);
        }else if (operator.equals("/")) {
            System.out.println(num1-num2);
        }else System.out.println(num1*num2);
        scanner.close();
    }
}
