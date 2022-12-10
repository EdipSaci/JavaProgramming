package day23_CustomMethods_Void;

public class task2_evenNumbers {
    public static void main(String[] args) {
        evenNumbers();
    }

    public static void evenNumbers(){
        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i+" ");
        }
    }
}
