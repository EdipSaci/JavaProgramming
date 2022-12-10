package day28_ArrayList;

import java.util.ArrayList;

public class Task5MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max =list.get(0) ;

        for (Integer each : list) {
            if (each>max){
                max= list.get(each);
            }
        }
        System.out.println("max = " + max);
    }
}
