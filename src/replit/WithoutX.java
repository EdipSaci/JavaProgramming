package replit;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        word = word.replaceFirst("x","");
        word= word.replaceFirst("X", "");
        if (word.charAt(word.length()-1)== 'x'){
            word= word.substring(0,word.length()-1);

        }
        if (word.charAt(word.length()-1)== 'X'){
            word= word.substring(0,word.length()-1);

        }
        System.out.println(word);

        /*
        if(word.startsWith("x")||word.startsWith("X")){
            word = word.substring(1);
        }
        if(word.endsWith("x")||word.endsWith("X")){
            word = word.substring(0,word.length()-1);
        }
        System.out.println(word);
         */
        scan.close();
    }
}
