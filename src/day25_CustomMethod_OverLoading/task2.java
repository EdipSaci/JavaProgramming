package day25_CustomMethod_OverLoading;

public class task2 {
    public static void main(String[] args) {
        int [] a = {1,30,2,4};
        int max =maxNumber(a);
        System.out.println("max = " + max);

        System.out.println("------------------------");
        double [] b = {1.2,5.4,7.5,8.3};
        double maxDouble =maxNumber(b);
        System.out.println("maxDouble = " + maxDouble);

    }

    //1. create a method that can return the max number from an integer array
    public static int maxNumber (int [] array){
        int max =array[0];
        for (int each : array) {
            if (each>max){
                max =each;
            }
        }
        return max;
    }

    //2. create a method that can return the max number from double array
    public static double maxNumber (double [] array){
        double max =array[0];
        for (double each : array) {
            if (each>max){
                max =each;
            }
        }
        return max;
    }

    //3. create a method that can return the max number from long array
    public static float maxNumber (float [] array){
        float max =array[0];
        for (float each : array) {
            if (each>max){
                max =each;
            }
        }
        return max;
    }

}
