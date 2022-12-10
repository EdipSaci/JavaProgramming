package Homework;

public class MaxNumber {
    public static void main(String[] args) {
        int n1 = 100 ,
                n2 = 100;
        if (n1>n2) {
            System.out.println(n1 + " is maximum number");
        } else if (n1 < n2) {
            System.out.println(n2 +  " is maximum number");
        }else if  (n1==n2) {
            System.out.println(n1 + " is equal to " + n2);
        }

    }
}
