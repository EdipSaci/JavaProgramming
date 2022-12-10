package day18_NestedLoop;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        /*
        2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your credentials.user name :");
        String name = scan.nextLine();
        System.out.println("password");
        String password = scan.nextLine();
        int count = 0;
        if (name.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("logged in");
        }else {

            for (int i = 1; i <=3 ; i++) {
                System.out.println("Incorrect Username or password");
                System.out.println("Enter your user name");
                name= scan.nextLine();
                System.out.println("password");
                password = scan.nextLine();

                if (name.equals("Cydeo") && password.equals("WoodenSpoon")){
                    System.out.println("logged in");
                    break;
                }
            }
            if (!(name.equals("Cydeo") && password.equals("WoodenSpoon"))){
                System.err.println("your account is locked!!!!");
            }
        }


        scan.close();


    }
}
