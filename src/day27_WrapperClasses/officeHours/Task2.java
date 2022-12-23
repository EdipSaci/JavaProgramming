package day27_WrapperClasses.officeHours;

public class Task2 {
    public static void main(String[] args) {


        String str = "456number87459";

        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                if (Integer.valueOf(""+str.charAt(i)) %3==0 ){
                    sum+=Integer.valueOf(""+str.charAt(i));
                }
            }
        }
        System.out.println("sum = " + sum);


    }
}
/*
 2. write a java program, find sum of the numbers in a string, only if the number is divisible by 3
 */