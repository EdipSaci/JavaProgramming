package day24_CustomMethod_Return;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {

        int [] arr ={1,2,3};
        addElement(arr,4);
    }
    public static int[] addElement(int [] arr , int num){
        int [] arr1 = new int[arr.length+1];
        int i =0;
        for (int each : arr) {
            arr1 [i] +=each;
            i++;
        }
        arr1[i]= num;
        System.out.println(Arrays.toString(arr1));
        return arr1;
    }
}
/*
6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array
    			Ex:
    				arr ={1,2,3};
    				num = 4;
    				addElement(arr, num) ==> {1,2,3,4}
 */