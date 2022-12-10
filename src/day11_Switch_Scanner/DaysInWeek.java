package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 9;

        /*
        if (number == 1) {
            System.out.println("Monday");
        }
        ...
        */

        switch (number) { // 1,2,3,4,5,6,7 ==
            case 1:
                System.out.println("Monday");
                break; // exits the switch after executing tha case block
            case 2:
                System.out.println("sunday");
                break;

            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("tuesday");
                break;

            default: // only gets executed if none of case blocks ara matching
                System.out.println("Invalid");
                break;  // you dont have to use this.. because we have curly braces at the end

        }


    }
}
