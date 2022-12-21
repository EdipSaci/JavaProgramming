package day17_While_DoWhile;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        while (!((answer.equals("yes")) || (answer.equals("no")))) {
            System.err.println("Invalid answer. Do you want to reserve a room?");
            answer = scan.nextLine().toLowerCase();
        }
            if (answer.equals("no")) {
                System.out.println("have a nice day");
            } else if (answer.equals("yes")) {
                System.out.println("which kind of room do you like ?");
                System.out.println(" King Bed,Queen Bed, Single Bed");
                String bed = scan.nextLine().toLowerCase();

                while (!(bed.equals("king bed") || bed.equals("queen bed") || bed.equals("single bed"))) {
                    System.out.println("Invalid room.please re-enter the room");
                    bed = scan.nextLine().toLowerCase();
                }
                if (bed.equals("king bed")) {
                    System.out.println("King Bed ==> 120$");
                } else if (bed.equals("queen bed")) {
                    System.out.println("Queen Bed ==> 100$");
                } else if (bed.equals("single bed")) {
                    System.out.println("Single Bed ==> 80$");
                }

                scan.close();
            }


        }
    }
