package day13_String;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First name of School Name ");
        String firstName = scan.nextLine();
        System.out.println("Second name of School Name ");
        String secName = scan.nextLine();

        scan.close();
        String a = firstName.toUpperCase();
        String b= secName.toUpperCase();

        char f = a.charAt(0);
        char s =b.charAt(0);



        System.out.println(f+"."+s);



    }
}
