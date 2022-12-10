package day13_String;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String words = input.nextLine();

        int longest = words.length();

        char third = words.charAt(words.length()-1);
        char sec = words.charAt(words.length()-2);
        char first =words.charAt(words.length()-3);

        if (longest==0){
            System.out.println("string is empty");
        } else if (longest>0 && longest<=3) {
            System.out.println(words);
        } else if (longest>3) {
            System.out.println(""+ first+sec+third);
        }
        input.close();

    }
}
