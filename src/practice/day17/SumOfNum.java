package practice.day17;

import java.util.Scanner;

public class SumOfNum {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int num = scanner.nextInt();

        int sum = 0;
        while (num>0){
            sum+=num;
            System.out.println("sum = " + sum);
            num=scanner.nextInt();
        }
        scanner.close();
    }
}
