package day14_String2;

import java.util.Scanner;

public class task6AccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter an account number");
        String accountNum  = scan.nextLine();

        if (accountNum.startsWith("2") && accountNum.length() ==7){
            System.out.println(accountNum);
        } else if (accountNum.startsWith("5")&& accountNum.length()==10) {
            System.out.println(accountNum);
        }else {
            System.out.println("Invalid account number");
        }

        scan.close();

    }
}
