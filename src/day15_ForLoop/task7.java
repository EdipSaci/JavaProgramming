package day15_ForLoop;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String str = scan.nextLine();

        String result = ""; // word
        for (int i = str.length()-1; i >=0 ; i--) {
        result += str.charAt(i) ;
        }
        System.out.println(result);

        boolean isPalindrome = str.equalsIgnoreCase(result);
        System.out.println(isPalindrome);
        scan.close();
    }
}
