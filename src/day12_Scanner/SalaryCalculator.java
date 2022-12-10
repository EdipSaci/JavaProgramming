package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your hourly Rate");
        int hourlyRate = input.nextInt();

        System.out.println("how many hours you works in a week?");
        int weeklyHours = input.nextInt();

        System.out.println("enter state tax(in percentage)");
        double stateTaxRate = input.nextDouble();

        System.out.println("enter federal tax(in percentage)");
        double federalTaxRate = input.nextDouble();

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Net income = $"+ salaryAfterTax);

        input.close();
    }
}
