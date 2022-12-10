package day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        arr1 =addInteger(arr1,5);
        System.out.println(Arrays.toString(arr1));

        System.out.println("-----------------------------------------");
        double [] arr2 ={1.5,2.5,4.1,7.1};
        arr2=addDouble(arr2,5.4);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-------------------------------------");
        String [] names = {"ahmet", "recep", "memet", "kemal"};
        names=addString(names,"mahir");
        System.out.println(Arrays.toString(names));

        System.out.println("---------------------------------");
        char[] chars = {'A','B','C','D'};
        chars=addChar(chars,'E');
        System.out.println(Arrays.toString(chars));
    }
    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int [] addInteger (int[] array , int element){
        int [] arr = new int[array.length+1];

        int i =0;
        for (int each : array) {
            arr[i++]=each;
        }
        arr[array.length]=element;
        // or arr[i++]= element
        return arr;
    }

    // 2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble (double[] array, double element){
        double [] arr = new double[array.length+1];
        int i =0;
        for (double each : array) {
            arr[i++]=each;
        }
        arr[i]=element;
        return arr;
    }

    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addString (String[] array, String element){
        String [] arr = new String[array.length+1];
        int i =0;
        for (String each : array) {
            arr[i++]=each;
        }
        arr[i]=element;
        return arr;
    }

    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addChar (char[] array, char element){
        char [] arr = new char[array.length+1];
        int i =0;
        for (char each : array) {
            arr[i++]=each;
        }
        arr[i]=element;
        return arr;
    }
}

