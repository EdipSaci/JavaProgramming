package day28_ArrayList;

import java.util.ArrayList;

public class Task2Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> list1=  new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        System.out.println("list1 = " + list1);

    }
}
