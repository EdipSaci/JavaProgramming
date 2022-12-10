package day19_LoopPractices;

import java.util.Scanner;

public class firstDublicated {
    public static void main(String[] args) {
        /*
       1. Write a program that can return the first duplicated character from a string
         */
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        for (int j = 0; j <str.length() ; j++) {
            char ch = str.charAt(j);
            int count =0;

            for (int i = 0; i <= j; i++) {
                char each = str.charAt(i);
                if (each==ch){
                    count++;
                }
            }
            if (count==2){
                System.out.println(""+ch);
                System.exit(0);
            }
        }
        scan.close();
    }
}
