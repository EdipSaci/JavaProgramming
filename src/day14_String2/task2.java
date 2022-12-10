package day14_String2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.nextLine();

        String end =word.substring(word.length()-2);

        if (end.equals("ly")){
            System.out.println("reallly?");
        }else{
            System.out.println("never mind");
        }
        scan.close();

    }
}
