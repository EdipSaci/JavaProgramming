package day12_Scanner;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of circle");

        double r = input.nextDouble();


        double area = r * r * 3.14;
        double perimeter = 2 * r* 3.14 ;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


        input.close();

    }
}


/*
1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */