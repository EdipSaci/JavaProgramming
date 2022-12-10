package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

            int[][] array = { {1,2,3}, {4,5,6}};

            int[][] reverse = new int[array.length][];
            for (int i = array.length - 1,k = 0; i >= 0; i--,k++) { //i=1
                reverse[k] = new int[array[i].length];  //reverse[0] =new int[3]  i=1 k=0
                for (int j = array[i].length - 1,l = 0; j >= 0; j--,l++) {  //j=2
                    reverse[k][l] = array[i][j];  //reverse[0][0] = array[1][2]  {6,0,0}
                }                                // reverse[0][1] = array[1][1]  {6,5,0}
            }                                    // reverse[0][2] = array[1][0]  {6,5,4}
                                                 //reverse[1][0] = array[0][2]  { {6,5,4}{3,0,0}}
            System.out.println(Arrays.deepToString(reverse));
    }
}