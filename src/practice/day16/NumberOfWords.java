package practice.day16;

import java.util.Arrays;

public class NumberOfWords {
    public static void main(String[] args) {

        String str = "caT dog dogG cAt";
        int numOfCat=0;
        int numOfDog=0;
        str =str.toLowerCase();
        String [] str1= str.split("");
        System.out.println(Arrays.toString(str1));

        for (String each : str1) {
            if (each.contains("cat")){
                numOfCat++;
            }else if (each.contains("dog")){
                numOfDog++;
            }
        }

        if (numOfCat==numOfDog){
            System.out.println(true);
        }else System.out.println(false);

    }
}
