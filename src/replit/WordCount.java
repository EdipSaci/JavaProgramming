package replit;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
        in.close();
    }
    public static int wordCount(String words){

        int count = 1;
        String result = "";

        for (int i = 0; i < words.length(); i++) {

            if (words.charAt(i)==' '){
                count++;
            }

        }

        return count;


    }
}
