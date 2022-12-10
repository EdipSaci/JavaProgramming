package day14_String2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        System.out.println(word1.substring(1)+word2.substring(1));

    }
}
