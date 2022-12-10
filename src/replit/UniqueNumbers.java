package replit;

import day12_Scanner.SalaryCalculator;

import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
        scan.close();
    }
    public static void printUniqueNumbers(int[] nums){

        int count = 0;
        for (int each : nums) {
            count=0;
            for (int num : nums) {
                if (each==num){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }

    }

}

