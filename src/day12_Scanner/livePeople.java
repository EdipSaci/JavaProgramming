package day12_Scanner;

import java.util.Scanner;

public class livePeople {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";

        System.out.println("how many people they live with?");
        int num = input.nextInt();

        if (num>=0 && num<3){
            result = "Live with less than 3 people";
        }else if (num>=3 && num<=6){
            result="Live with 3 - 6 people";
        }else{
            result="Live with more than 6 people";
        }

        System.out.println(result);
        input.close();











    }
}
