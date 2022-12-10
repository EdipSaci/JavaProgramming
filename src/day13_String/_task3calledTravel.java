package day13_String;

import java.util.Scanner;

public class _task3calledTravel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have valid passport?(Yes or No)");
        String valid = scan.nextLine();

        if (valid.equals("Yes")) {

            System.out.println("which country you wanna travel?");
            String countryName = scan.nextLine();
            System.out.println("how many bags you will take with?");
            byte numberOfBag = scan.nextByte();
            System.out.println("how many people you will travel with?");
            short peopleNum = scan.nextShort();
            scan.nextLine();
            System.out.println("Enter the name of people?");
            String nameOfPeople = scan.nextLine();

            int costAmount= 1000+(numberOfBag*50)-(peopleNum*100);

            System.out.println("Your ticket is booked to "+ countryName +". We have charged extra for the "+ numberOfBag+" bags but you are traveling with " +
                    nameOfPeople +" so we are giving a discount. Your total cost is $"+ costAmount);

        } else if (valid.equals("No")) {
            System.out.println("when your passport expired?");
            int years = scan.nextInt();
            scan.nextLine();
            System.out.println("which country you wanna travel?");
            String countryName = scan.nextLine();
            System.out.println("do you wanna travel next year?(Yes or No)");
            String yesOrNo = scan.next();
            if (yesOrNo.equals("Yes")){
                int costAmount = 200+100+ years*75;
                System.out.println("Looks like your password has been expired for" + years +"years, but not to worry we will get it ready for you to travel to " + countryName +
                        "Your total cost has come out to $"+ costAmount);
            } else if (yesOrNo.equals("No")) {
                int costAmount = 200-50+ years*75;
                System.out.println("Looks like your password has been expired for " + years +"years, but not to worry we will get it ready for you to travel to " + countryName +
                        " Your total cost has come out to $"+costAmount );
            }

        }
        scan.close();
    }
}
