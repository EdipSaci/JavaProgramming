package day14_String2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter to words");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        char lastoOfWord1 = word1.charAt(word1.length()-1);
        char fristOfWord2 = word2.charAt(0);

        if (lastoOfWord1==fristOfWord2){
            System.out.println(word1.substring(0,word1.length()-1)+word2);
        }else {
            System.out.println(word1+word2);
        }
        scan.close();
    }
}
