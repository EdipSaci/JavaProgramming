package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(400);
        System.out.println(list); //[100, 200, 200, 200, 300, 400, 400]
        /*
        int num =1;
        list.remove(num);
        System.out.println(list); //[100, 200, 200, 300, 400, 400]
        */
        Integer num = 200;
        boolean r1 =list.remove(num);
        System.out.println("r1 = " + r1);
        System.out.println(list); //[100, 200, 200, 300, 400, 400]
        System.out.println("----------------------------------------------");
//clear() remove all the elements of the arraylist,size will be 0
        System.out.println(list.size()); //6
        list.clear();
        System.out.println(list.size()); // 0
        System.out.println(list); //[]
        System.out.println("---------------------------------------------");
//indexOf(Data) : returns the first matching element's index number, return int
//lastIndexOf(Data) : returns the last matching element's index number, return int
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =characters.indexOf('A');  // 0;
        int b =characters.lastIndexOf('A'); //4
        System.out.println("a = " + a);
        System.out.println("b = " + b);
//contains(Data)  : returns true if the element is contained in the arraylist, otherwise returns false
        boolean r2=characters.contains('A');
        boolean r3=characters.contains('D');
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);


        System.out.println("----------------------------------------");
//equals() :returns true if two arraylists are equal (same elements same order) , otherwise returns false
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2); // false
        System.out.println(list1.equals(list2));//true
        System.out.println("-------------------------------------------");
//isEmpty()
        boolean r4 =list1.isEmpty(); //false
        System.out.println("r4 = " + r4);

        System.out.println("---------------------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        // Bulk operation : CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);


    }
}
