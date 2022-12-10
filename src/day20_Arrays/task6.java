package day20_Arrays;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        /*
        6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};
            output:
                 {10, 5, 1, 0, 0, 0}
         */

        int[] array = {10, 0, 5, 0, 1, 0};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int []reversedArray =new int[6];

        for (int i = array.length-1 ; i >=0; i--) {
            reversedArray[5-i]=array[i];
        }

        System.out.println(Arrays.toString(reversedArray));
    }

}
