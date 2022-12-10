package day09_If_Statement;

public class Calculator {
    public static void main(String[] args) {
        double n1=12,
                n2=13;
        char mathOperator = 'o';

        if (mathOperator=='+' || mathOperator=='-'|| mathOperator=='*'|| mathOperator=='/') {
            if (mathOperator == '+') {
                System.out.println(n1 + n2);
            } else if (mathOperator == '-') {
                System.out.println(n1 - n2);
            } else if (mathOperator == '*') {
                System.out.println(n1 * n2);
            } else if (mathOperator == '/') {
                System.out.println(n1 / n2);
            }


        }else {
            System.out.println("Invalid operator");
        }
    }
}
