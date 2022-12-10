package day13_String;

import java.util.Scanner;

public class _2task1Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String word = scan.nextLine();

        int lenght =word.length();
        if (lenght<5){
            System.out.println("Too short");
        }else if (lenght>5){
            System.out.println("Too long");
        }else {
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }

        scan.close();


    }
}
