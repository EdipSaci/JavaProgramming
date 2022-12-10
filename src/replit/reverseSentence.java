package replit;

import java.util.Scanner;

public class reverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] str = sentence.split(" ");
        String result ="";
        for (int i = str.length - 1; i >= 0; i--) {
            result+=str[i] + " ";
        }
        result=result.trim();
        System.out.println(result);
        input.close();

    }
}
