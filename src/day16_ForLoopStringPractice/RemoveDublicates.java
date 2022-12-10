package day16_ForLoopStringPractice;

public class RemoveDublicates {
    public static void main(String[] args) {
        String str = "aabbaacc";

        String result = ""; // abc
        //           i<8  or i <=7  so  i < str.length()
        for (int i = 0; i <= str.length() - 1; i++) {  // i: represents the all the index numbers of str (start from 0)
            String ch = "" + str.charAt(i);  // represents each Character of str
            System.out.println(ch);

            if (!result.contains(ch)) {  // if the character is not contained in the result
                result += ch;  // the character will be added to result
            }

        }
        System.out.println(result);
    }
}