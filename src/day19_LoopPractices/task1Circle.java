package day19_LoopPractices;

import java.util.Scanner;

public class task1Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("enter the of the circle");
            double radius= scan.nextInt();
            scan.nextLine();
            if (radius<=0){
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            double diameter = 2 * radius;
            double PI = 3.14;
            double area = radius * radius* PI;
            double perimeter = PI * diameter;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle?");
            String answer = scan.nextLine().toLowerCase();

            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.err.println("Invalid entry,please re-enter your answer");
                answer=scan.nextLine().toLowerCase();
            }
            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }

        }
        scan.close();


    }
}
