package replit;


import java.util.Arrays;
import java.util.Scanner;

public class zombieAttack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        for (int i = 0; i < 6; i++) {

            System.out.println(Arrays.toString(inhabitants));

        }

    }
}
