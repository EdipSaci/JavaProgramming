package day23_CustomMethods_Void;

public class task3_eligibleAlcohol {
    public static void main(String[] args) {
        eligibleAlcohol(15);
    }



    public static void eligibleAlcohol(int age){
        if (age>18){
            System.out.println("Eligible for buying alcohol");
        }else System.out.println("Not eligible for buying alcohol");
    }
}
