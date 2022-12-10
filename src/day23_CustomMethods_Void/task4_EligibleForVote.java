package day23_CustomMethods_Void;

public class task4_EligibleForVote {
    public static void main(String[] args) {

        eligibleForVote(25,"USA");
    }

    public static void eligibleForVote(int age , String country){
        if (age>=21 && country.equals("USA")){
            System.out.println("You are eligible to vote!");
        }else System.out.println("You are not eligible to vote!");
    }
}
