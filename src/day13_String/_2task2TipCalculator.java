package day13_String;

import java.util.Scanner;

public class _2task2TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)?");
        String split = scan.nextLine().toLowerCase();

        System.out.println("Enter the number of people");
        int numOfPeople= scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount = scan.nextDouble();

        scan.nextLine();
        System.out.println("How was the Service Quality?(Excellent/Great/Good/Fair/Poor)");
        String service = scan.next().toLowerCase();

        scan.close();

        double tipRate=(service.equals("Poor"))? 0.05 :(service.equals("Fair"))? 0.10 :(service.equals("Good"))? 0.15 :(service.equals("Great"))?0.20 :0.25;

        double totalTip = amount*tipRate;

        if (split.equals("Yes")){
            System.out.println("Number of people that entered: "+numOfPeople);
            System.out.println("Total to pay: "+(totalTip+amount));
            System.out.println("Total per person: "+ (amount+totalTip)/numOfPeople);
            System.out.println("Total tip: "+totalTip);
            System.out.println("Total tip per person: "+ (totalTip/numOfPeople));
        }else if(split.equals("No")){
            System.out.println("Total to pay: "+(totalTip+amount));
            System.out.println("Total tip: "+totalTip);
        }





    }
}
