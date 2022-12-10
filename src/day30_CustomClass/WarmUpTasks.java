package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers); // [8, 2, 3, 4, 5, 6, 7, 1]
        System.out.println("-------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int size = list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        int newSize= list.size();
        int totalNumberOfZero = size-newSize;
        System.out.println("totalNumberOfZero = " + totalNumberOfZero);

        for (int i = 0; i < totalNumberOfZero; i++) {
            list.add(0);
        }
        System.out.println(list);
        System.out.println("-------------------------------------------");
        ArrayList<Integer> list2 =new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each!=0){
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if (each==0){
                result.add(each);
            }
        }
        System.out.println(result); // [1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println("-------------------------------------------");

        String str = "ABD123$#^+%'456EFG!";
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            chars.add(each);
        }
        ArrayList<Character> letters = new ArrayList<>(chars); //add all characters


        letters.removeIf(p->  !Character.isLetter(p) ); // remove characters that are not letters
        System.out.println("letters = " + letters);// [A, B, D, E, F, G]

        ArrayList<Character> digits = new ArrayList<>(chars); //add all characters
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("digits = " + digits);//[1, 2, 3, 4, 5, 6]

        ArrayList<Character> specials = new ArrayList<>(chars); //add all characters
        //specials.removeIf(p-> Character.isLetterOrDigit(p));
       // System.out.println("specials = " + specials); //[^, +, %, ^, ', ^, !]
        specials.removeAll(letters);
        specials.removeAll(digits);
        System.out.println("specials = " + specials);//[^, +, %, ^, ', ^, !]








    }
}
