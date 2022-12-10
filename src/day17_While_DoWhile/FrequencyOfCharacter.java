package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'C';
        int frequency = 0 ;


        for (int i = str.length()-1; i>=0 ; i--) {
            char eachChar = str.charAt(i);
            if (ch==eachChar){
                frequency++;
                // frequency +=1;
            }
        }

        System.out.println(frequency);

    }
}
