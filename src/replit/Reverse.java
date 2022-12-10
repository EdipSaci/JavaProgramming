package replit;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
        in.close();
    }

    public static String reverse(String input){

        String result = "";
        for (int i = input.length()-1; i >=0; i--) {
            result+=input.charAt(i);
        }

        return result;
    }

}
