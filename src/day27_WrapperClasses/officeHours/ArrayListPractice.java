package day27_WrapperClasses.officeHours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayListPractice {

    public static void main(String[] args) {

        one();
        System.out.println("-------------------------");
        two();
        System.out.println("-------------------------");
        three();
        System.out.println("-------------------------");
        four();
        System.out.println("-------------------------");
        five();
        System.out.println("-------------------------");
        six();
    }

    /*
  Write a Java program that creates an ArrayList of strings and then adds five strings to the list.
  Then remove the first and last elements of the list, and then print the remaining elements to the console.
 */
    public static void one(){
        ArrayList<String> list= new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("pear");
        list.add("strawberry");
        System.out.println(list);
        list.remove(0);
        list.remove(list.size()-1);
        System.out.println(list);
    }

    /*   2.Write a Java program that creates an ArrayList of 10 integers, and then removes the elements at index positions 2, 4, and 6 from
        the list. The program should then print the resulting list to the console.
     */

    public static void two(){
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list.remove(2);
        list.remove(4);
        list.remove(6);
        System.out.println(list);
    }

    /*
            3.Write a java program that create an arraylist has random numbers, then check those number, if they are even,
         add again to the arraylist
     */
    public static void three(){
        ArrayList<Integer> randomNumbers=new ArrayList<>();

        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        System.out.println(randomNumbers);

        ArrayList<Integer> evenNums=new ArrayList<>();

        for (int i = 0; i < randomNumbers.size(); i++) {
            if (randomNumbers.get(i)%2==0){
                evenNums.add(randomNumbers.get(i));
            }
        }

        System.out.println(evenNums);
    }

/*
         4.Write a Java program that creates an ArrayList of 10 random integers between 1 and 100,
        and then sorts the list in ascending order.
 */
    public static void four(){

        ArrayList<Integer> randomNumbers= new ArrayList<>();
        Random random= new Random();

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        System.out.println("randomNumbers = " + randomNumbers);
        Collections.sort(randomNumbers);
        System.out.println("randomNumbers = " + randomNumbers);
    }


    /*
     5. Write a Java program that creates an ArrayList of strings and adds five strings to the list. The program
        should then reverse the order of the elements in the list and print the resulting list to the console.
     */
    public static void five(){
        ArrayList<String> words= new ArrayList<>();

        words.addAll(Arrays.asList("tak","lak","pak","sak","çak"));
        System.out.println(words);

        ArrayList<String> reverseWords= new ArrayList<>();


        /*for (int size = words.size()-1, i=0; size >= 0; size--, i++) {
            reverseWords.add(words.get(size));
        }
        System.out.println("reverseWords = " + reverseWords);
       */
        // the another way

        Collections.reverse(words);
        System.out.println(words);


    }

    /*
            6. Write a Java program that creates an ArrayList of integers and adds 10 random integers to the list.
        The program should then find the smallest and largest elements in the list and print them to the console
     */
    public static void six(){

        ArrayList<Integer> list = new ArrayList<>();
        Random nums = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(nums.nextInt(100));
        }
        System.out.println("list = " + list);
        

        int max =Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
