package day19_LoopPractices;

public class uniqueCharacter {
    public static void main(String[] args) {
        /*
        2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";
                        output:
                                bdf
         */
        String str = "aabccdeef";
        String result = ""; //bdf


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count =0; // represents the frequency of the  ch

            for (int i = 0; i < str.length(); i++) {  //compares the character that outer loop picked, with each characters of the string
                char each = str.charAt(i);
                if (ch==each){
                    count++;
                }
            }

            if (count==1){   // if the frequency of the character is 1 then the character is unique
                result+= ch;
            }

            /*
            if(count !=1){
            continue;
            }
            result +=ch;
             */

        }

        System.out.println(result);

        /*
        char ch =str.charAt(0);
        int count =0; // represents the frequency of the  ch
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (ch==each){
                count++;
            }
        }
        System.out.println(count);
*/
    }
}
