package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19 ;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen== "USA" ;
        //                    19>=18 &&  "UK" == "USA"
        //                      true && false ===>  false
        //                      true && true ====> true

        System.out.println(name + " is eligible to vote:" + isEligible);

        System.out.println("-------------------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 80000;
        boolean isEligible2 = creditScore>=700 && age2>=21 && income>=60000;
//                                   true  && true ===> true
        System.out.println(name + " is eligible to loan: " + isEligible2);

        System.out.println("-------------------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender== 'M' || gender== 'F');
//                              true   &&  ( F == M  || F == F  )
 //                             true  &&    (false  || true  )
 //                              true && true
        System.out.println(name3 +" is eligible to register : " + isEligible3);

        System.out.println("-------------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen== true;
         //                           false             || false

        System.out.println(name4+ " is eligible to apply or US citizenShip: " + isEligible4);

        System.out.println("-------------------------------------------------");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa>=3.5 || familyIncome <=80000;

        System.out.println(student + " is eligible for scholarship :" + isEligible5);

        System.out.println("-------------------------------------------------");

        boolean result4= true;
        System.out.println("result4 = " + result4);

        boolean result5 = !result4;
        System.out.println("result5 = " + result5);

        System.out.println("-------------------------------------------------");

        int score= 85;
        boolean passed = score>=60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println( true ==!false); // true
        System.out.println(!true != false); // false
        System.out.println(!false== true);  // true

        System.out.println(!!false); // false
        System.out.println(!!!true); // false










    }
}
