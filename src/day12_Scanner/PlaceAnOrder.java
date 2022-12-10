package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the product name");
        String productName = input.nextLine();

        System.out.println("enter the price ");
        double price = input.nextDouble();

        System.out.println("enter the quantity");
        int quantity =input.nextInt();

        System.out.println("enter your first name");
        String firstName = input.next();

        double total = price * quantity;

        System.out.println(firstName + ", your order for "+ productName + " has been places.Your total is "+total);
        input.close();
    }
}
