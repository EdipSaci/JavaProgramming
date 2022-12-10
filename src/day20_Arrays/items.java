package day20_Arrays;

import java.util.Scanner;

public class items {
    public static void main(String[] args) {

        String[] item = new String[5];
        int[] prices = new int[5];

        Scanner scan = new Scanner(System.in);

        int cost = 0;
        for (int i = 0; i < item.length; i++) {
            System.out.println("enter item name");
            item[i] =scan.next();
            System.out.println("enter price of item");
            prices[i] =scan.nextInt();
            System.out.println(item[i] + " price is "+ prices[i]);

        }
        scan.close();

    }
}
