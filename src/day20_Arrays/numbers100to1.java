package day20_Arrays;

import java.util.Arrays;

public class numbers100to1 {
    public static void main(String[] args) {


        int [] numbers= new int[100];

        int num =100;

        for (int i = 0; i < numbers.length; i++,num--) {
            numbers[i]= num;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
