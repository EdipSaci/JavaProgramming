package replit;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
        }

        String[] reversed = new String[5];

        for (int i = arr.length - 1 , j =0; i >= 0; i--,j++) {
            reversed[j] = arr[i];
        }

        System.out.println(Arrays.toString(reversed));


        input.close();
    }
}
