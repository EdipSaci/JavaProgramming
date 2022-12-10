package day14_String2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.nextLine();


        if (word.charAt(0)>= '0'&&word.charAt(0)<='9' ){
            System.out.println("first character is digit");
        } else if (word.charAt(0)>= 'a' &&word.charAt(0)<='z') {
            System.out.println("first character is lowercase letter");
        } else if (word.charAt(0)>= 'A' && word.charAt(0)<='Z') {
            System.out.println("first character is uppercase letter");
        }else{
            System.out.println("first character is special character");
        }


        scan.close();
    }
}
