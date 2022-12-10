package day23_CustomMethods_Void;

public class task12_positiveOrNegative {
    public static void main(String[] args) {
        positiveOrNegative(0);
    }
    public static void positiveOrNegative(int number){
        if (number<0){
            System.out.println(number +" is negative number");
        } else if (number>0) {
            System.out.println(number + " is positive number");
        }else {
            System.out.println(number+ " is zero");
        }
    }
}
