package day21_ForEachLoop;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        //Write a program that can count the even and odd number from an array of integers
        //			Note: MUST use for each loop

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        int count =0;
        int count2 = 0;

        for (int each : arr) {
            if (each%2==0){
                count++;
            }

            if (each%2!=0){
                count2++;
            }

        }
        System.out.println(count +" even numbers ");
        System.out.println(count2 +" odd numbers ");


    }
}
