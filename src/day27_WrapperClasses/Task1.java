package day27_WrapperClasses;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50};
        array=insert(array,2,100);

        System.out.println(Arrays.toString(array));

        String[] arr1={"namık", "recep", "kemal", "orhan","Stefan"};
        arr1=insert(arr1,2,"yuh");
        System.out.println(Arrays.toString(arr1));
    }
    //inserts the given element to the given index of the array and returns the new array
    public static int [] insert( int [] array,int index, int element){
        int [] result = new int[array.length+1];

        for (int i = 0, j = 0; i < array.length+1; i++, j++) {
            result[i]=array[j];
            if (i==index){
                result[i]=element;
                j--;
            }
        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static double [] insert( double [] array,int index, double element){
        double [] result = new double[array.length+1];

        for (int i = 0, j = 0; i < array.length+1; i++, j++) {
            result[i]=array[j];
            if (i==index){
                result[i]=element;
                j--;
            }
        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static char [] insert( char [] array, int index, char element){
        char [] result = new char[array.length+1];

        for (int i = 0, j = 0; i < array.length+1; i++, j++) {
            result[i]=array[j];
            if (i==index){
                result[i]=element;
                j--;
            }
        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static String [] insert( String [] array, int index, String element){
        String [] result = new String[array.length+1];

        for (int i = 0, j = 0; i < array.length+1; i++, j++) {
            result[i]=array[j];
            if (i==index){
                result[i]=element;
                j--;
            }
        }
        return result;
    }
}
