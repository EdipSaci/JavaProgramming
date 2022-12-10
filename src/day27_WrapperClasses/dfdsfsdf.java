package day27_WrapperClasses;

import java.util.Arrays;

public class dfdsfsdf {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50};


        int index = 2;
        int element = 100;
        int [] result = new int[array.length+1];

        for (int i = 0, j = 0; i < array.length+1; i++, j++) {
            result[i]=array[j];
            if (i==index){
                result[i]=element;
                j--;

            }
        }
        System.out.println(Arrays.toString(result));

    }
}
