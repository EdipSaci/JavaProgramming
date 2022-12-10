package replit;

import java.util.Scanner;

public class EachCharacter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

        String result = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (result.contains(""+str.charAt(i))){
                continue;
            }
            result+=count+ ""  +str.charAt(i)+"";
        }
        return result;
    }

}
