package day19_LoopPractices;

import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("How much you make an hour?");
            int hourlyRate = scan.nextInt();

            if (hourlyRate<=0){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            int hoursPerWeek = scan.nextInt();

            if (hoursPerWeek<1 || hoursPerWeek>144){
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double stateTax= scan.nextDouble();

            if (stateTax<0 || stateTax>10){
                System.err.println("Invalid Entry for state tax rate");
                System.exit(0);
            }

            int gross = hourlyRate * hoursPerWeek * 4;
            double taxes = gross * (26 + stateTax) / 100;

            System.out.println("Gross Salary: $" + gross);
            System.out.println("Federal Tax: 26%");
            System.out.println("State Tax: " + stateTax + "%");
            System.out.println("Total Tax: " + (stateTax + 26) + "%");
            System.out.println("Net Income: $" + (gross - taxes));

            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("no")||answer.equals("yes"))){
                System.err.println("Invalid entry,please re-enter your answer");
                answer=scan.next().toLowerCase();
            }
            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }


        }
        scan.close();

    }
}
