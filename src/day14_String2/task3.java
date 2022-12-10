package day14_String2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.nextLine();

      char first = word.charAt(0);
      if (first == 'x'){
          System.out.println(word.substring(1));
      }else{
          System.out.println(word);
      }
        scan.close();

    }
}
