package replit;

import java.util.Scanner;

public class ExtractNumber {


    public static void main(String[] args) {

        String str = "aa2aa3";
        System.out.println(extractNum(str));
        //Scanner in = new Scanner(System.in);
       // System.out.println(extractNum(in.next()));
       // in.close();
    }


    public static String extractNum(String s) {
       String result = "";
        for (int i = 0; i < s.length(); i++) {
            char each= s.charAt(i);
            if (Character.isDigit(each)){
                result+=each;
            }
        }

        return result;

    }
}
