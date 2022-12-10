package day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {

        int[] number = {1,2,3,4,5,6}; //7
        number=addElement(number,7);
        System.out.println("number = " + Arrays.toString(number));

        char[] chars={'A','B','C','D'}; //'E'
        chars=addElement(chars,'E');
        System.out.println("chars = " + Arrays.toString(chars));

        String[] names ={"namık", "kemal", "yaşar", "orhan"}; //"ali"
        names=addElement(names,"ali");
        System.out.println("names = " + Arrays.toString(names));

    }

    //1. create a return method called addInteger that can add an Integer after the  last index of an integer array
    public static int [] addElement (int[] array , int element){
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
    public static double[] addElement (double[] array, double element){
        double [] arr = new double[array.length+1];
        int i =0;
        for (double each : array) {
            arr[i++]=each;
        }
        arr[i]=element;
        return arr;
    }

    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement (String[] array, String element){
        String [] arr = new String[array.length+1];
        int i =0;
        for (String each : array) {
            arr[i++]=each;
        }
        arr[i]=element;
        return arr;
    }

    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement (char[] array, char element){
        char [] arr = new char[array.length+1];
        int i =0;
        for (char each : array) {
            arr[i++]=each;
        }
        arr[i]=element;
        return arr;
    }

}
