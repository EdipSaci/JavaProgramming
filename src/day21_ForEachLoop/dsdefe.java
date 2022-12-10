package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class dsdefe {
    public static void main(String[] args) {

        /*  Task 4: Reverse each word in a sentence.

    input:String str = "Adam come here";

    output:madA emoc ereh */
        String str = "Adam come here";
        String result = "";

        if(str.charAt(str.length()-1)!=' '){

            str+=" ";
        }

        while(str.contains(" ")) {

            for (int i = str.indexOf(' '); i >= 0 ; i--) {
                result+=str.charAt(i);
            }
            str=str.substring(str.indexOf(' ')+1);
        }
        System.out.println(result.trim());
    }
}






