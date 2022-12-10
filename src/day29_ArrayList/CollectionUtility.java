package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        //sort()
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list);
        System.out.println("list = " + list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("-----------------------------------");


        //reverse()
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        Collections.reverse(list2);
        System.out.println("list2 = " + list2);// [E, D, C, B, A]
        System.out.println("-------------------------------------");


        //swap()
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(list3,1,4);
        System.out.println("list3 = " + list3); //[10, 50, 30, 40, 20, 60, 70]
        System.out.println("---------------------------------------------");

        //max() and min()
        int max =Collections.max(list3);
        int min =Collections.min(list3);
        System.out.println("max = " + max);//70
        System.out.println("min = " + min);//10
        System.out.println("---------------------------------------------");

        //replaceAll()
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        Collections.replaceAll(list4,10,1000);
        System.out.println("list4 = " + list4); //[1000, 1000, 20, 30, 40, 50, 1000, 1000, 1000]
        System.out.println("---------------------------------------------");


        //frequency()
        int frequency =Collections.frequency(list4,1000);
        System.out.println("frequency = " + frequency); //5

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Python","Ruby","C++"));
        int countJava = Collections.frequency(words,"Java");
        System.out.println("countJava = " + countJava); //2








    }
}
