package replit;

import java.util.Scanner;

public class verifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        if (sentence.contains(word)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        scan.close();
    }
}
