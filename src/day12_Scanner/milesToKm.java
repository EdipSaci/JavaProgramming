package day12_Scanner;

import java.util.Scanner;

public class milesToKm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles:");
        int miles = input.nextInt();

        double km = miles * 1.69;

        System.out.println(miles + " miles equal to "+ km+ " kilometers");

        input.close();

    }
}
