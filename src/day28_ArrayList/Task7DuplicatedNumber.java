package day28_ArrayList;

import java.util.ArrayList;

public class Task7DuplicatedNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list1.contains(list.get(i))){
                System.out.println(list.get(i));
                break;
            }
            list1.add(list.get(i));

        }

    }
}
/*
for (Integer each : list) {
            if (list1.contains(each)){
                System.out.println(each);
                break;
            }
            list1.add(each);
        }


 */