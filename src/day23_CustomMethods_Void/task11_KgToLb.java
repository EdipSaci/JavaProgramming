package day23_CustomMethods_Void;

public class task11_KgToLb {
    public static void main(String[] args) {

        KgToLb(25.0);
    }

    public static void KgToLb(double kg){
        double lb = kg*2.20;
        System.out.println(kg+ " is equal to " + lb + " lb.");
    }
}
