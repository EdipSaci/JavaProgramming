package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1= "acdb";
        String str2= "dbca";

        //write a program that can check if str1 & str2 are build out same characters


        char[] char1= str1.toCharArray();
        char[] char2= str2.toCharArray();

        System.out.println(Arrays.toString(char1));
        System.out.println(Arrays.toString(char2));

        Arrays.sort(char1);
        Arrays.sort(char2);

        boolean result =Arrays.equals(char1,char2);
        System.out.println(result);



    }
}
