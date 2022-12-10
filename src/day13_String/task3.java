package day13_String;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("give me string man");
        String one = scan.nextLine();

        scan.close();

        char oneFirst = one.charAt(0);
        char onelast = one.charAt(one.length()-1);
        if (oneFirst==onelast){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }






    }
}
