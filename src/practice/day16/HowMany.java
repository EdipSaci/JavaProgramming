package practice.day16;

import java.util.ArrayList;
import java.util.Scanner;

public class HowMany {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            arrayList.add(scanner.nextInt());
        }
        int positive = 0;
        int negative = 0;


        for (Integer each : arrayList) {
            if (each > 0) {
                positive++;
            } else if (each < 0) {
                negative++;

            }
        }

        System.out.println(positive + " positive, and " + negative + " negative");
        scanner.close();
    }
}