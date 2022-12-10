package day13_String;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 words");
        String one = input.nextLine();
        String two = input.nextLine();
        String three = input.nextLine();

        input.close();

        int longest1 = one.length();
        int longest2 = two.length();
        int longest3 = three.length();

        if (longest1==longest2 && longest2==longest3){
            System.out.println("All words are same length");
        } else if (longest1==longest2|| longest2==longest3||longest3==longest1) {
            System.out.println("Not Same nor Different lengths");
        }else {
            System.out.println("All different length");
        }


    }
}
