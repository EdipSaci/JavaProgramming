package day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int [] reverse=reverse(arr);
        System.out.println(Arrays.toString(reverse));

        System.out.println("---------------------");

        char [] array ={'A','B','C','D'};
        char []reversedChar=reverse(array);
        System.out.println(Arrays.toString(reversedChar));

    }
    //1. Create a method that can reverse an integer array
    public static int [] reverse(int[] array){
        int [] reversedArray= new int[array.length];
        for (int i = array.length - 1 , j=0; i >= 0; i--,j++) {
            reversedArray[j]=array[i];
        }
        return reversedArray;
    }

    //2. Create a method that can reverse a double array
    public static double [] reverse(double[] array){
        double [] reversedArray= new double[array.length];
        for (int i = array.length - 1 , j=0; i >= 0; i--,j++) {
            reversedArray[j]=array[i];
        }
        return reversedArray;
    }

    //3. Create a method that can reverse a char array
    public static char [] reverse(char[] array){
        char [] reversedArray= new char[array.length];
        for (int i = array.length - 1 , j=0; i >= 'Z' || i>='z'; i--,j++) {
            reversedArray[j]=array[i];
        }
        return reversedArray;
    }
    
    
    //4. Create a method that can reverse a String array
    public static String [] reverse(String[] array){
        String [] reversedArray= new String[array.length];
        for (int i = array.length - 1 , j=0; i >= 'z'; i--,j++) {
            reversedArray[j]=array[i];
        }
        return reversedArray;
    }
}
