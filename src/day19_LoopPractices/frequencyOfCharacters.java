package day19_LoopPractices;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        /*
        1. Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
         */
        String str = "aabcccd";
        String result = ""; //a2b1c3d1

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // 'a'  each character from str
            int count = 0;

            for (int i = 0; i < str.length(); i++) {  // find the frequency of each character
                char each = str.charAt(i);  // each characters of str
                if (ch== each){
                    count++;
                }
            }

            if (result.contains(""+ch)){
                continue;
            }
            result+= ch;
            result+= count;
        }
        System.out.println(result);
    }
}
