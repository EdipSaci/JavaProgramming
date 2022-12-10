package Homework;

public class eligibleForVote {
    public static void main(String[] args) {

        String name = "Kamil" ;
        int age = 20;
        String country = "TUR";
        boolean eligible =age>18 && country == "TUR";

        if(eligible){
            System.out.println(name + " is eligible for vote ");
        }else{
            System.out.println(name + " is not eligible for vote ");
        }

    }
}
