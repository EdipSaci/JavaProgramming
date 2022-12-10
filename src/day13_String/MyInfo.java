package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your gender");
        String gender = input.next();
        input.nextLine();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter phone num");
        long phone = input.nextLong();
        System.out.println("Enter your zipcode");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.println("Enter your school name");
        String schoolName = input.nextLine();
        System.out.println("Enter your city name");
        String cityName = input.nextLine();
        System.out.println("Enter your state name");
        String stateName = input.next();
        System.out.println("Enter your building number");
        int buildNum = input.nextInt();
        input.nextLine();
        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        input.close();

        /*
        Display all the inputs that user entered in following order in sperate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode

			6. school name

         */

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phone = " + phone);
        System.out.println("address: " );
        System.out.println("\t" + buildNum +" " + streetName + " \n\t"+ cityName + ", "+ stateName+ " " + zipCode);
        System.out.println("schoolName = " + schoolName);


    }
}
