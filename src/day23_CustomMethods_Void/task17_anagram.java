package day23_CustomMethods_Void;

import java.util.Arrays;

public class task17_anagram {
    public static void main(String[] args) {
        anagram("listen","silentj");

    }
    public static void anagram (String str1, String str2){

        char [] ch1= str1.toCharArray();
        char [] ch2= str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
            System.out.println(str1 + " and "+ str2 + " are anagram");
        }else {
            System.out.println(str1 + " and "+ str2 + " are not anagram");
        }

/*
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(i)== str1.charAt(j)){
                    System.out.println(str1 + " and "+ str2 + " are anagram");
                }
            }
        }
*/

    }
}
