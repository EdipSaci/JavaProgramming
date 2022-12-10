package day19_LoopPractices;

public class indexOfUnique {
    public static void main(String[] args) {

        /*
        Write a program that can return the index number of the first unique character.
         */

        String str = "aabbcdeef";

        for (int i = 0; i < str.length(); i++) {

            int counter = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)){
                    counter++;
                }

            }

            if(counter ==1){
                System.out.println(str.indexOf(str.charAt(i)));
                System.exit(0);
            }

        }
    }
}
