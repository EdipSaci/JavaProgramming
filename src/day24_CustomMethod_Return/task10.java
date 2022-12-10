package day24_CustomMethod_Return;

import java.util.Arrays;

public class task10 {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 2;
        int [] remove =removeElement(array,index);
        System.out.println(Arrays.toString(remove));
    }
    public static int [] removeElement (int [] array , int index ){
        int [] removeElement = new int[array.length-1];
        for (int i = 0, j=0; i < array.length; i++) {
            if (i!=index){
                removeElement[j]= array[i];
                j++;
            }
        }
        return removeElement;
    }
}
/*
10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2
				removeElement(array, index) ==== {10, 20, 40, 50, 60}
 */
