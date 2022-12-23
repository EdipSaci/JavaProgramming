package practice.day18;

import java.util.Scanner;

public class Calculate2Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Enter your first number");
            int num1= scanner.nextInt();
            System.out.println("Enter math operator");
            String operator= scanner.next();

            while (!(operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("") )){
                System.out.println("Invalid operator. please re-enter  +  -  /  *");
                operator= scanner.next();
            }
            System.out.println("Enter your second number");
            int num2= scanner.nextInt();

            if (operator.equals("+")){
                System.out.println(num1+num2);
            } else if (operator.equals("-")) {
                System.out.println(num1-num2);
            }else if (operator.equals("/")) {
                System.out.println(num1/num2);
            }else System.out.println(num1*num2);

            System.out.println("Do you wanna continue?");
            String answer= scanner.next();

            while (!(answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("yes"))){
                System.out.println("please re enter your answer. yes/no");
                answer=scanner.next();
            }
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                System.exit(0);
            }

            scanner.close();
        }




    }
}
