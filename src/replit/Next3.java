package replit;

import java.util.Scanner;

public class Next3 {
    public static void main(String[] args) {
        Scanner  inp = new Scanner(System.in);
        System.out.print("enter number:");
        int num = inp.nextInt();
        next3(num);
        inp.close();
    }

    public static int next3( int number){
        for (int i = number+1; i <=number+3 ; i++) {
            System.out.print(i+" ");
        }

        return number;
    }
}
