package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int speedLimit = 55;
        String result = "";
        System.out.println("Enter current speed:");
        int current = input.nextInt();
        int limit = current-speedLimit;

        if (current>speedLimit){
            result= "You're driving " + limit + " over the limit. Slow down!";
        }else {
            result= "";
        }

        System.out.println(result);

        input.close();


    }
}
