package replit;

import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        sign(n);
    }

    public static void sign (int n){
        if (n>0){
            System.out.println("positive");
        } else if (n<0) {
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }

    }
}
