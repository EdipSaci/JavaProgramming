package day27_WrapperClasses.officeHours;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number as string");

        String number = scanner.next();

        if (Integer.parseInt(number)<0){
            System.out.println(false);
        }else System.out.println(true);

        scanner.close();
    }
}
/*
1. write a java program, let user enter a number as string, if the number is below zero, return false,
    else return true
 */