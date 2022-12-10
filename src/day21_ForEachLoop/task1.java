package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        //1. Write a program that sort the array of integer in descending order

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 integer");

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i]= scan.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
