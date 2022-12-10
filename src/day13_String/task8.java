package day13_String;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your user name");
        String userName = scan.nextLine();
        System.out.println("enter your password");
        String password = scan.nextLine();

        if (userName.equals("Cydeo")&& password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.out.println("Incorrect username or password");
        }

        scan.close();






    }
}
