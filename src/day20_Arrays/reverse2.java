package day20_Arrays;

import java.util.Arrays;

public class reverse2 {
    /*
        5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};
        output:
            reversedArray = {5,4,3,2,1};
         */
    public static void main(String[] args) {
        int [] array= {1,2,3,4,5};

        int[] reversedArray=new int[array.length];

        int a =array.length-1;
        for (int each : array) {
            reversedArray[a]=each;
            a--;
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
