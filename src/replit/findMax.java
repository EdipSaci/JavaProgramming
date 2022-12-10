package replit;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = nums[0];

        for (int num : nums) {
            if (num>max){
                max = num;
            }
        }
        System.out.println(max);
        input.close();
    }
}
