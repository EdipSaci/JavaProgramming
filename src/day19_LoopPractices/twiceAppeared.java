package day19_LoopPractices;

public class twiceAppeared {
    public static void main(String[] args) {

        /*
        3. Write a program that can display all the characters that appeared twice in the string.
         */

        String str = "ronaldo";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

            }

            result+="" +ch+ch;
        }
        System.out.println(result);


    }
}
