package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {
        String firstName = "Edip";
        String lastName = "Saçi";
        String fullName = firstName + " " + lastName;
        int age = 29;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        System.out.println(fullName);
        double salary = 100000.58;

        // Full name of person is ____-
        System.out.println("Full name of person "+ fullName);

        // ___is ____years old

        System.out.println(fullName +" is " + age + " years old.");

        // FullName is JobTitle , works at CompanyName and fullName salary is __-
        System.out.println(fullName +" is " + jobTitle + ", works at " + companyName + " and " + fullName + "'s salary is " + salary);



    }
}
