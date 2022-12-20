package practice.day16;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 2 positive numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 0 && b > 0) {
            int result=0;
            for (int i = 1; i <= a; i++) {
                result+=b;
            }
            System.out.println(result);
        }else {
            System.out.println("Invalid Number");
        }
       scanner.close();
    }
}
