package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(10+20);
        System.out.println(100-50);
        System.out.println(10*6);
        System.out.println(100/3);
        System.out.println(10.0/4);
        System.out.println(10/4.0);
        System.out.println(10d/4);

        int a = 100;
        double b = a/6;
        System.out.println(b);

        double c = a/6.0;
        System.out.println(c);

        double d =(double) a/6;
        System.out.println(d);

        System.out.println(100d);
     /*
     +: Addition
     -:Subtract
     *: Multiplication
     /:Division
     % : Remainder
                in math:
                10/4 = 2
                in Java:
                10/4 = 2

      */





    }
}
