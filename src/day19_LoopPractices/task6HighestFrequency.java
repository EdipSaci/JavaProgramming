package day19_LoopPractices;

import java.util.Scanner;

public class task6HighestFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

                //  abcdde
        for (int j = 0; j < str.length(); j++) {
            char ch= str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (each==ch){
                    count++;
                }
            }


        }

        scan.close();
    }
}
