package replit;

import java.util.Arrays;
import java.util.Scanner;

public class diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge "+ (i+1) +":");
           score[i]=input.nextInt();
        }
        System.out.println("Enter the difficulty rating:");
        double rating = input.nextDouble();

        Arrays.sort(score);
        float[] score2 =Arrays.copyOfRange(score,1,6);

        System.out.println(Arrays.toString(score2));
        float sum = 0;

        for (float each : score2) {
            sum+=each;
        }

        double totalScore = sum*rating*0.6;
        System.out.println("Final Score:"+ totalScore);

        input.close();

    }
}
