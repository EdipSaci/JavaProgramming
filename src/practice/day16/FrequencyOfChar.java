package practice.day16;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        System.out.println("Enter a char");
        String ch = scanner.next();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (ch.equals(each+"")){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
