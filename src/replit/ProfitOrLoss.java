package replit;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }

    public static String profit(int buyPrice,int sellPrice){
        String result = "";
        if (buyPrice<sellPrice){
            result="profit";
        }else if(buyPrice>sellPrice) {
            result="loss";
        }else result="no loss";
        return result;
    }
}
