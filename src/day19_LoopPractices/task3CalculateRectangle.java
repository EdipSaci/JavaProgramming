package day19_LoopPractices;

import java.util.Scanner;

public class task3CalculateRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter the length of the Rectangle:");
            int length = scan.nextInt();

            if (length<=0){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.println("Enter the width of the Rectangle:");
            int width = scan.nextInt();
            if (width<=0){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            int area = length*width;
            int perimeter= 2*(width+length);
            System.out.println("Area of rectangle = " + area);
            System.out.println("Perimeter rectangle = " + perimeter);

            System.out.println("Would you like to calculate another Rectangle?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("no")||answer.equals("yes"))){
                System.err.println("Invalid entry,please re-enter your answer");
                answer=scan.next().toLowerCase();
            }
            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }

        }
        scan.close();
    }
}
