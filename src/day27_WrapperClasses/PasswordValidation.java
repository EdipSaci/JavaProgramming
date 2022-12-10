package day27_WrapperClasses;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = scan.nextLine();
        int lowerCount =0;
        int upperCount =0;
        int specialCount =0;
        int digitCount =0;
        int spaceCount=0;

        char [] pass =password.toCharArray();
        for (char each : pass) {
            if (Character.isLowerCase(each)){
                lowerCount++;
            }
        }
        for (char each : pass) {
            if (Character.isUpperCase(each)){
                upperCount++;
            }
        }
        for (char each : pass) {
            if (!Character.isLetterOrDigit(each)){
                specialCount++;
            }
        }
        for (char each : pass) {
            if (Character.isDigit(each)){
                digitCount++;
            }
        }
        for (char each : pass) {
            if (each==' '){
                spaceCount++;
            }
        }
        while (password.length()<8 ||spaceCount>0){
            System.out.println("Your password is too short or have  spaces.Please enter your password again.");
            password=scan.nextLine();
        }
        if (lowerCount>=1 && upperCount>=1&& specialCount>=1 && digitCount>=1 && spaceCount==0){
            System.out.println("strong Password");
        }else System.out.println("weak password");

        scan.close();
    }

}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

 */