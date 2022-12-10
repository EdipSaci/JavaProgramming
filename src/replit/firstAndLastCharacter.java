package replit;

import java.util.Scanner;

public class firstAndLastCharacter {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};



        for (String word : words) {
            String initial = "";

                initial+= ""+word.charAt(0) +""+word.charAt(word.length()-1)+"";

            System.out.println(initial);
        }

input.close();




    }
}
