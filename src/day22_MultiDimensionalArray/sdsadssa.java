package day22_MultiDimensionalArray;

import java.util.Arrays;

public class sdsadssa {
    public static void main(String[] args) {

        int[][] array = { {1,2,3}, {4,5,6}};

        int [][] reverse= new int[array.length][];

        for (int i = array.length - 1, k=0; i >= 0; i--, k++) {
            reverse[k]=new int[array[i].length];
            for (int j = array[i].length - 1,m=0; j >= 0; j--,m++) {
                reverse[k][m]= array[i][j];
            }

        }
        System.out.println(Arrays.deepToString(reverse));

    }
}
