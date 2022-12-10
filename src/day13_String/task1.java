package day13_String;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = scan.nextLine();


       char firstChar= sentence.charAt(0);

       char secondChar= sentence.charAt(sentence.length()-1);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        scan.close();
    }
}
