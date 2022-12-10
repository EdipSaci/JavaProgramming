package replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuels(list, fuel));
        in.close();

    }

    public static int refuels(ArrayList<Integer> deliveries,int gasTank) {

        int result = 0;

        for (Integer each : deliveries) {
            result+=each/gasTank;
        }
        if (deliveries.get(deliveries.size()-1)<gasTank){
            result+=1;
        }
        return result;
    }

}
