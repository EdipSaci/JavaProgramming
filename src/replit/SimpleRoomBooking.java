package replit;

import java.util.Scanner;

public class SimpleRoomBooking {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
        in.close();
    }
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year) {
        if (isAvailable == false) {
            return false;
        } else if ((year == 2018) && (month == 2) && ((day >= 1) && (day <= 8))) {
            return true;
        } else {
            return false;
        }
    }


    }

