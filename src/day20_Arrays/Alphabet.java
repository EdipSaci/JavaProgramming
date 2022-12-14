package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        //create a variable that can contain 26 elements
        char[]alphabet = new char[26];  // Z-A

        /*       i     ch
        alphabet[0] = 'Z';  //90
        alphabet[1] = 'Y';  //89
        alphabet[2] = 'X';  //88
        */

        System.out.println(alphabet[0]);  // printing the element of array

        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++, ch--) {
            alphabet[i] = ch;
        }
        System.out.println(Arrays.toString(alphabet)); // print the whole array

/*
        for (char i =0,j= 'Z'; i< alphabet.length; i++, j--){
            alphabet[i]=j;
        }
        System.out.println(Arrays.toString(alphabet));
*/

    }
}
