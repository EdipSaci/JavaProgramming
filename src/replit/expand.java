package replit;

import java.util.Arrays;
import java.util.Scanner;

public class expand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        int[] arr = new int[6];

        int count =0;
        for (int i : nums) {
            arr[count++] = i;
        }

        System.out.println(Arrays.toString(arr));


        scan.close();


    }
}
