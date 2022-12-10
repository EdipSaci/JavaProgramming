package replit;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int length = word.length();
        if (length%2==0){
            System.out.println(""+ word.charAt(word.length()/2-1) +word.charAt(word.length()/ 2));
        }else {
            System.out.println(""+ word.charAt(word.length() / 2));
        }
        scan.close();
    }
}
