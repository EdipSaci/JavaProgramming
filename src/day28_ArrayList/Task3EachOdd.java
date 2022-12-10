package day28_ArrayList;

import java.util.ArrayList;

public class Task3EachOdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> list1=  new ArrayList<>();

        for (Integer each : list) {

            if (each%2 !=0){
                list1.add(each*2);
            } else if (each%2==0) {
                list1.add(each);
            }

        }
        System.out.println("list1 = " + list1);

    }
}
