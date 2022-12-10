package day04_Variables;

public class Currencies {

    public static void main(String[] args) {
        int dollar = 1000;

        double lira = dollar * 18.24;
        double euro = dollar * 1.16;
        double jpy = dollar * 142.22;
        double pound = dollar * 0.85;
        double CAD = dollar * 0.77;
        double zloty = dollar * 4.63;
        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);
        System.out.println("zloty = " + zloty);

    }
}

