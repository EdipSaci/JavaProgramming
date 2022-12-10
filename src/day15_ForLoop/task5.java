package day15_ForLoop;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        String str =  "mn@#123Ab!" ;

        String digits = " ";
        String letters= " ";
        String speciaChars= " ";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else {
                if (ch != ' ') {
                    speciaChars += ch;
                }

            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("speciaChars = " + speciaChars);


    }
}
