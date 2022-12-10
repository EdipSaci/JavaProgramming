package day15_ForLoop;

import java.util.Scanner;

public class warmTask {
    public static void main(String[] args) {

        /*
        1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */
        System.out.println("enter a word");

        String word = new Scanner(System.in).next() ; //when we use Scanner just a once we write like this

        if (word.charAt(0) == 'x'){
           word =word.replaceFirst("x", "a"); // it creates new string object

        }
        System.out.println(word);


    }
}
