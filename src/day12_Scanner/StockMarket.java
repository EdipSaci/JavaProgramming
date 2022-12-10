package day12_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many total shares they have already?");
        int share = input.nextInt();
        String result = "Invalid Number of shares";

        if (share>0){
            System.out.println("how much their total value in the stock market is?");
            double totalStock = input.nextDouble();

            input.nextLine();

            System.out.println("Enter your company name");
            String companyName = input.nextLine();

            result= "Your total stock market holding is $" + totalStock+ " which is made up of "
                    +share+" shares."+ companyName + " is your company holdings";
        }

        System.out.println(result);

        input.close();





    }
}
