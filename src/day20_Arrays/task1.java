package day20_Arrays;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*
        1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
         */


        Scanner scan = new Scanner(System.in);

        String[] classmates = new String[10];

        String initial = "";
        for (int i = 0; i < classmates.length; i++) {
            System.out.println("enter your classmates");
            classmates[i]=scan.nextLine();
            initial+=""+classmates[i].charAt(0)+ "."+ classmates[i].charAt(classmates[i].indexOf(" ")+1)+"\n";
        }

        System.out.println(initial);


        /*
        String[] classmates = {"ahmet","celil","tek","yol","devrim","arzu","kemal","harun","musa","ali"};

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i]);
        }
        */

        scan.close();

    }
}
