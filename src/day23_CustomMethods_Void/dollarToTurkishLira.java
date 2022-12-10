package day23_CustomMethods_Void;

public class dollarToTurkishLira {
    public static void main(String[] args) {

        dollarToTurkishLira(25);
    }

    public static void dollarToTurkishLira (double dollar){
        double tl= 18.62*dollar;
        System.out.println(dollar +" dollar is "+ tl + " Turkish Liras");
    }
}
