package day27_WrapperClasses;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int [] array= {10, 20, 30, 40, 50};
        array=swap(array, 2, 4) ;
        System.out.println(Arrays.toString(array));

        String[] arr1= {"namık", "recep", "kemal", "orhan","Stefan"};
        arr1=swap(arr1,2,4);
        System.out.println(Arrays.toString(arr1));
    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static int [] swap (int [] array, int i , int j){
        int [] result = new int [array.length];
        for (int k = 0; k < array.length; k++) {
            result[k]=array[k];
            if (k==i){
                result[k]=array[j];
            }
            if (k==j){
                result[k]=array[i];
            }
        }
        return result;

    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static double [] swap (double [] array, int i , int j){
        double [] result = new double [array.length];
        for (int k = 0; k < array.length; k++) {
            result[k]=array[k];
            if (k==i){
                result[k]=array[j];
            }
            if (k==j){
                result[k]=array[i];
            }
        }
        return result;

    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static char [] swap (char [] array, int i , int j){
        char [] result = new char [array.length];
        for (int k = 0; k < array.length; k++) {
            result[k]=array[k];
            if (k==i){
                result[k]=array[j];
            }
            if (k==j){
                result[k]=array[i];
            }
        }
        return result;

    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static String [] swap (String [] array, int i , int j){
        String [] result = new String [array.length];
        for (int k = 0; k < array.length; k++) {
            result[k]=array[k];
            if (k==i){
                result[k]=array[j];
            }
            if (k==j){
                result[k]=array[i];
            }
        }
        return result;

    }


}

