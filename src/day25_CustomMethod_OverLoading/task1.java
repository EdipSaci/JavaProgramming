package day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {

        int [] a = {1,3,2,4};
        int [] b = {10,30,20,40};
        int [] arr =merge(a,b);
        System.out.println(Arrays.toString(arr));
    }

    //1. create a method that can merge two integer arrays.
    public static int [] merge (int [] arr1, int [] arr2){
        int i =0;
        int [] mergeArr =new int[arr1.length+ arr2.length];
        for (int each : arr1) {
            mergeArr[i++]=each;
        }
        for (int each : arr2) {
            mergeArr[i++]=each;
        }
        return mergeArr;
    }

    //2. create a method that can merge two double arrays.
    public static double[] merge (double[] arr1, double[] arr2){
        int i=0;
        double [] mergeArr = new double[arr1.length+ arr2.length];
        for (double each : arr1) {
            mergeArr[i++]=each;
        }
        for (double each : arr2) {
            mergeArr[i++]=each;
        }
        return mergeArr;
    }

    //3. create a method that can merge two char arrays. 
    public static char[] merge (char[] arr1, char[] arr2){
        int i=0;
        char [] mergeArr = new char[arr1.length+ arr2.length];
        for (char each : arr1) {
            mergeArr[i++]=each;
        }
        for (char each : arr2) {
            mergeArr[i++]=each;
        }
        return mergeArr;
    }

    //4. create a method that can merge two String arrays.  	
    public static String[] merge (String[] arr1, String[] arr2){
        int i=0;
        String [] mergeArr = new String[arr1.length+ arr2.length];
        for (String each : arr1) {
            mergeArr[i++]=each;
        }
        for (String each : arr2) {
            mergeArr[i++]=each;
        }
        return mergeArr;
    }

}
