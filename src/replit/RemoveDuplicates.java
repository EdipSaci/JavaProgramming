package replit;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
        in.close();
    }

    public static String uniqueChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){
                result+=ch;
            }
        }

        return result;
    }


}
