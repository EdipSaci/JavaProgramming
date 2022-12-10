package day23_CustomMethods_Void;

public class task15calculator {
    public static void main(String[] args) {

        calculator(25,2,'+');

    }

    public static void calculator(int num1, int num2, char operator) {
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        }

    }
}