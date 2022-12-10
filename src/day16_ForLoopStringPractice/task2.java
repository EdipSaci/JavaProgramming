package day16_ForLoopStringPractice;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

/*
2. Write a program that asks user to enter string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scan.nextLine();
        System.out.println("enter a char");
        String ch = scan.nextLine();

        int repeat = 0;
        String result = "";
        for (int i = str.length()-1; i >=0; i--) {
            result="" +str.charAt(i);
            if (ch.equals(result)){
                repeat++;
            }
        }

        System.out.println(repeat);
        scan.close();

    }
}
