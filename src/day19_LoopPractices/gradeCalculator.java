package day19_LoopPractices;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (score < 0) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("would you like to continue");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("no")||answer.equals("yes"))){
                System.err.println("Invalid entry,please re-enter your answer");
                answer=scan.next().toLowerCase();
            }
            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }
        }
        scan.close();

    }
}
