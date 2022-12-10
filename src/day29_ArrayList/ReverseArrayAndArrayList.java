package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};
        int [] result = new int[array.length];
        int a = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[a++]= array[i];

        }
        System.out.println(Arrays.toString(result));//[6, 5, 4, 3, 2, 1]
        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> reverseList =new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        System.out.println(reverseList); //[6, 5, 4, 3, 2, 1]



    }
}
