package day19_LoopPractices;

import java.util.Scanner;

public class task2CalculateSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter the side of the square:");
            int side = scan.nextInt();
            scan.nextLine();

            if (side<=0){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            int area = side*side;
            int perimeter =4*side;

            System.out.println("Area of square = " + area);
            System.out.println("Perimeter of square = " + perimeter);

            System.out.println("Would you like to calculate another Square?");
            String answer = scan.nextLine().toLowerCase();

            while (!(answer.equals("no")||answer.equals("yes"))){
                System.err.println("Invalid entry,please re-enter your answer");
                answer= scan.nextLine().toLowerCase();
            }
            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }

        }

        scan.close();

    }
}
