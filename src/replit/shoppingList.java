package replit;

import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingList = "SHOPPING LIST:\n";
        String result ="";


        double costItem = 0;
        double totalCost= 0;
        System.out.println("Enter the name of item 1");
        String item = scan.nextLine();

        System.out.println("Enter the price of the "+ item);
        double price = scan.nextDouble();


        System.out.println("How many " + item+ " will you buy?");
        int many = scan.nextInt();
        costItem+= price*many;

        scan.nextLine();

        shoppingList+= (item +" x " +many+ " - $"+ costItem+"\n");
        System.out.println("Do you want to add more items to the shopping list?");
        String more = scan.nextLine();
        totalCost+=costItem;


        int  count = 1;
        while (more.equals("yes")){
            count++;
            System.out.println("Enter the name of item "+count );
            item=scan.nextLine();
            System.out.println("Enter the price of the "+ item);
            price = scan.nextDouble();
            System.out.println("How many " + item+ " will you buy?");
            many = scan.nextInt();
            scan.nextLine();
            System.out.println("Do you want to add more items to the shopping list?");
            more = scan.nextLine();

            double costItem2= price* many;
            shoppingList+=(item +" x " +many+ " - $"+ costItem2+"\n");
            totalCost += costItem2;
        }
        System.out.print(shoppingList);
        System.out.println("Total cost: $"+ totalCost);
        scan.close();
    }
}
