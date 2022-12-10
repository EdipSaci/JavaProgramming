package day23_CustomMethods_Void;

public class task16fullName {
    public static void main(String[] args) {

        fullName("cYdEo", "SCHOOL");
    }


    public static void fullName(String firstName, String lastName) {
        firstName = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        lastName = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
        System.out.println(firstName + " " + lastName);
    }
}