package day18_NestedLoop;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        /*
        Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
         */
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("enter your first number");
            int num1 = scan.nextInt();
            System.out.println("enter math operator");
            String operator = scan.next();

            while (!(operator.equals("+") || operator.equals("-") || (operator.equals("*") || operator.equals("/")))) {
                System.err.println("Invalid operator.. please re-enter");
                operator = scan.next();
            }
            System.out.println("enter your second number");
            int num2 = scan.nextInt();

            if (operator.equals("+")) {
                System.out.println(num1 + num2);
            } else if (operator.equals("-")) {
                System.out.println(num1 - num2);
            } else if (operator.equals("*")) {
                System.out.println(num1 - num2);
            } else if (operator.equals("/")) {
                System.out.println(num1 - num2);
            }

            System.out.println("do want to continue?");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.err.println("invalid please re-enter");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("no")){
                System.out.println("thanks for cydeo calculate");
                break;
            }


        }
        scan.close();
    }
}