package replit;

import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }

        for (int i = 0, j=1; i < arr.length-1; i++, j++) {
            System.out.println(arr[i] + ", " + arr[j]);
        }


        input.close();





    }
}
