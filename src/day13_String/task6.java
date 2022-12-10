package day13_String;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a three letter word");
        String word = scan.nextLine();

        char middle = word.charAt(1);
        int longest = word.length();

        if (longest>3){
            System.out.println("Word is too long");
        }else if (longest<3){
            System.out.println("Word is too short");
        } else if (longest==3) {
            if (middle=='a'){
                System.out.println("Cool word");
            }else{
                System.out.println("Okay word");
            }
        }
        scan.close();

    }
}
