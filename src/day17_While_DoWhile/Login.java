package day17_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        //username : "Cydeo"
        //password : "Cydeo123"

        //while (invalid && hasAttempts)
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your username:");
        String userName = scan.nextLine();

        System.out.println("enter your password:");
        String password = scan.nextLine();

        if (userName.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("Logged in");
        }else {
            int attempt =3;
            while (!(userName.equals("Cydeo") && password.equals("Cydeo123"))  && attempt > 0){ //while the credentials are Invalid , and has attempts to re-enter
                if (attempt==1){
                    System.err.println("THİS İS YOUR LAST CHANCE");
                }
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("enter your username:");
                userName = scan.nextLine();

                System.out.println("enter your password:");
                password = scan.nextLine();

                attempt--;
            }
            if (userName.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged in");
            }else {
                System.err.println("Your account is locked!");
            }

        }

        scan.close();
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */

    }
}
