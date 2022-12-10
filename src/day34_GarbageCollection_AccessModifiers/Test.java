package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;

import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("--------------------------------");

        //find the sum of 10,20
        sumOfNumber(10,20);

        //find the sum of 100,200
        sumOfNumber(100,200);

        subOfNumber(50,10);
        maximumNumber(10,7);




    }
}
