package practice.day17;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to reserve a room");
        String reserveRoom = scanner.next();


        while (!(reserveRoom.equalsIgnoreCase("Yes") || reserveRoom.equalsIgnoreCase("no"))) {
            System.out.println("please re enter your answer.yes or no");
            reserveRoom=scanner.next();
            scanner.nextLine();
        }

        if (reserveRoom.equalsIgnoreCase("yes")){
            System.out.println("Which kind of room you are gonna select");
            System.out.println("King Bed ==> 120$\nQueen Bed ==> 100$\nsingle Bed ==> 80$");
        }else {
            System.out.println("have a nice day!");
            System.exit(1);
        }
        String room= scanner.nextLine();

        while (!(room.equalsIgnoreCase("king bed") || room.equalsIgnoreCase("queen bed") ||room.equalsIgnoreCase("single bed"))){
            System.out.println("Please re enter your room type");
            room=scanner.nextLine();
        }

        if (room.equalsIgnoreCase("king bed")){
            System.out.println("King Bed ==> 120$");
        } else if (room.equalsIgnoreCase("queen bed")) {
            System.out.println("Queen Bed ==> 100$");
        }else {
            System.out.println("single Bed ==> 80$");
        }

        scanner.close();
    }
}