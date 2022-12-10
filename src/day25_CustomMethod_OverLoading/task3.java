package day25_CustomMethod_OverLoading;

public class task3 {
    public static void main(String[] args) {
        int [] a = {1,30,2,4};
        int min =minNumber(a);
        System.out.println("min = " + min);
    }

    //1. create a method that can return the min number from an integer array
    public static int minNumber (int[] array){
        int minNumber = array[0];
        for (int each : array) {
            if (each<minNumber){
                minNumber=each;
            }
        }
        return minNumber;
    }

    //2. create a method that can return the min number from double array
    public static double minNumber (double[] array){
        double minNumber = array[0];
        for (double each : array) {
            if (each<minNumber){
                minNumber=each;
            }
        }
        return minNumber;
    }

}
