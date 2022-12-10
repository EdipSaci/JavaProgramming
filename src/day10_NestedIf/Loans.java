package day10_NestedIf;

public class Loans {
    public static void main(String[] args) {

        int salary = 80000,
                creditScore= 990;
        boolean loan = (salary>60000 && creditScore>650);
        String result = "";

        result = (loan)? "Loan Approved" : "Loan Denied";

        System.out.println(result);


    }
}
