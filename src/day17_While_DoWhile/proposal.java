package day17_While_DoWhile;

import java.util.Scanner;

public class proposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me");
        String marry = scan.nextLine().toLowerCase();

        while (!(marry.equals("yes") || marry.equals("no"))){
            System.out.println("Invalid answer , please re-enter");
            marry= scan.nextLine().toLowerCase();
        }

        if (marry.equals("yes")){
            System.out.println("Congrats");
        } else {
            System.out.println("Goodbye");
        }

        scan.close();
    }
}
/*
1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */