package replit;

import java.util.Scanner;

public class reverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if (word.length()<5)
            System.out.println("Too short!");
        else if (word.length()>5) {
            System.out.println("Too long!");
        } else if (word.length()==5) {
            String result = ""+ word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
            System.out.println(result);
        }
        scan.close();
    }
}
