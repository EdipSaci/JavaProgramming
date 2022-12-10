package replit;

import java.util.Scanner;

public class has55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==5 && nums[i+1]==5) {
                System.out.println("true");
                break;
            }else if (nums[i]==5 && nums[i+1]!=5){
                System.out.println("false");
                break;
            }
        }

        input.close();
    }
}
