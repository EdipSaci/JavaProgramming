package day31_Contructors;

public class SalaryCalculator {
    public int hourlyRate,weeklyHours;
    public double stateTaxRate, federalTaxRate;

    public SalaryCalculator(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary() {
        double salary= hourlyRate*weeklyHours*52;
        return salary;

    }
    public double stateTax(){
        double stateTax = salary() *stateTaxRate/100;
        return stateTax;
    }

    public double  federalTax(){
        double federalTax = salary()*federalTaxRate/100;
        return federalTax;
    }
    public double salaryAfterTax(){
        double salaryAfterTax = salary() -(stateTax()+federalTax());
        return salaryAfterTax;
    }

    public String toString() {
        return "Task1SalaryCalculator{" +
                "salary=" +    salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
