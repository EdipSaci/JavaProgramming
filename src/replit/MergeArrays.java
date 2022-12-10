package replit;

import java.util.Scanner;
import java.util.Arrays;
public class MergeArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
    public static int[] merge(int[] a,int[] b){

        int[] merge = new int[a.length+b.length];

        int i = 0;
        for (int each : a) {
            merge[i++]=each;

        }
        for (int each : b) {
            merge[i++]=each;

        }
        return merge;
    }

}
