package day28_ArrayList;

import java.util.ArrayList;

public class Task6MinNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int min = list.get(0);
        for (Integer each : list) {
            if (each<min){
                min=each;

            }
        }
        System.out.println("min = " + min);
    }
}
