package day29_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //addAll(CollectionType): adds collection of values to the arrayList
        ArrayList<Integer> list = new ArrayList<>();
        //  ====asList(array of values) ===> returns the array as collectionType===
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //removeAll(CollectionType): removes all the matching elements from the arraylist
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list); //[1, 2, 4, 6, 7, 9, 10]

        System.out.println("--------------------------------------------------");
         //retainAll(CollectionType): removes all the non-matching elements from the arraylist(opposite remove)
        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        number.retainAll(Arrays.asList(100,200,300)); // I want to keep that
        System.out.println(number); //[100, 200, 300, 100, 200, 300]

        //containsAll(CollectionType): checks if all the elements are contained in the arraylist
        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = num.contains(10);
        boolean r2 = num.contains(2) && num.contains(5) && num.contains(10);
        boolean r3 = num.containsAll(Arrays.asList(2,5,10));
        boolean r4 = num.containsAll(Arrays.asList(2,5,10,25));

        System.out.println("r1 = " + r1); //true
        System.out.println("r2 = " + r2); //true
        System.out.println("r3 = " + r3); //true
        System.out.println("r4 = " + r4); //false

        System.out.println("-----------------------------------------------------");
        String[] names = {"Josh", "Jack", "Daniel","Shay","Breanna"};
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList); //[Josh, Jack, Daniel, Shay, Breanna]

        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
        System.out.println("namesList = " + namesList);// [Josh, Jack, Daniel, Shay, Breanna]
*/
        System.out.println("-----------------------------------------------------------");
        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("-----------------------------------------------------------");
        int [] arr2 = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3); //[1, 2, 3, 4, 5, 6, 7, 8]

    }
    public static ArrayList<Integer> convertArrayToArrayList (int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
