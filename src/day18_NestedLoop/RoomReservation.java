package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalCost=0;

        while (true){
            System.out.println("which bedroom");
            System.out.println(" King Bed ==> 120$  Queen Bed ==> 100$  single Bed ==> 80$");
            String bed = scan.nextLine().toLowerCase();

            while (!(bed.equals("king")|| bed.equals("queen")|| bed.equals("single"))){
                System.err.println("invalid re enter your room");
                bed = scan.nextLine().toLowerCase();
            }

            System.out.println("how many nights?");
            int night = scan.nextInt();

            scan.nextLine();

            if (bed.equals("king")){
                totalCost+= 120*night;
            } else if (bed.equals("queen")) {
                totalCost+=100*night;
            }else totalCost+= 80*night;

            System.out.println("do you wanna another room?");
            String answer = scan.nextLine().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("invalid ... yes or no ");
                answer = scan.nextLine().toLowerCase();
            }
            if (answer.equals("no"))
          break;
        }
        System.out.println("total cost"+ totalCost);

        scan.close();

    }
}

