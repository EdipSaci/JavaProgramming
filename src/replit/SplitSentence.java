package replit;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] str= sentence.split(" ");

        for (String each : str) {
            System.out.println(each);

        }
        input.close();
    }

}
