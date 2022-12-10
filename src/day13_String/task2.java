package day13_String;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two strings");
        String one = scan.nextLine();
        String two = scan.nextLine();

        scan.close();

        int total1 = one.length();
        int total2 = two.length();

        System.out.println("total1 = " + total1);
        System.out.println("total2 = " + total2);

    }
}
