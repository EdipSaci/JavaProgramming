package day25_CustomMethod_OverLoading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1={1,3,2,5,4,7};
        ArraysUtility.printEachElement(arr1);

        System.out.println("-----------------");
        double[] arr2= {6.5,4.2,7.3,.7,1};
        ArraysUtility.printEachElement(arr2);

        System.out.println("---------------------------");
        char[] arr3= {'A','B','D','C'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("------------------");
        int [] n1 =  {1,5,8,7,9,75};
        int max1 = ArraysUtility.maxNumber(n1);
        System.out.println("max1 = " + max1);

        System.out.println("----------------------------");
        double[] n2 = {2.5,7.5,3.1,5.4};
        double max2 = ArraysUtility.maxNumber(n2);
        System.out.println("max2 = " + max2);

        System.out.println("---------------------------");
        int [] a1 = {1,2,3,4,5};
        boolean r1= ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);


    }
}
