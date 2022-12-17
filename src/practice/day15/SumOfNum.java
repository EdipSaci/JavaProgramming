package practice.day15;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        int result =sumOfNum(num);
        System.out.println(result);
    }

    public static int sumOfNum(int num){
        int sum=0;
        for (int i = 0; i <= num; i++) {
            sum+=i;
        }

        return sum;
    }
}
