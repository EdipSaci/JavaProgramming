package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name:");
        String fullName = input.nextLine();

        System.out.println("enter your  building number:");
        String buildNumber = input.next();

        input.nextLine();

        System.out.println("enter street:");
        String streetName = input.nextLine();

        System.out.println("city name:");
        String cityName = input.nextLine();

        System.out.println("state name:");
        String stateName = input.next();



        System.out.println("enter zipcode:");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("country name:");
        String country = input.nextLine();

        input.close();

        System.out.println(fullName+buildNumber+stateName+cityName+ stateName+zipCode+country);
    }
}
/*
1. Full name
2. building num
3.street name
4.city name
5. state
6.zip code

 */