package replit;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        populate(n);
    }
    public static int populate(int n ){
        int [] array = new int[n];
        for (int i = 0 , k = 1; i < array.length; i++, k++) {
            array[i]=k;
        }
        System.out.println(Arrays.toString(array));
        return n;
    }
}
