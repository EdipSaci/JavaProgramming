package day23_CustomMethods_Void;

public class task9_dollarToEuro {
    public static void main(String[] args) {

        dollarToEuro(25);
    }
    public static void dollarToEuro (double dollar){
        double euro = dollar*1.01;
        System.out.println(dollar + "Dollar is "+ euro +" euro");
    }
}
