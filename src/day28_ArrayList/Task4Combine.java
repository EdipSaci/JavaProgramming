package day28_ArrayList;

import java.util.ArrayList;

public class Task4Combine {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String [] arr1= {"A", "B", "C"};
        String[] arr2 =  {"D", "E", "F", "G"};

        for (String each : arr1) {
            list.add(each);
        }
        for (String each : arr2) {
            list.add(each);
        }
        System.out.println(list);
    }
}
