package day19_LoopPractices;

public class firstDublicatedIndex {
    public static void main(String[] args) {

        /*
        2. Write a program that cna return the index number of the first duplicated character from a string
         */

        String str = "rasgele";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch==each){
                    count++;
                }
                if (count==2){
                    System.out.println(str.indexOf(ch));
                    System.exit(0);
                }
            }

        }


    }
}
