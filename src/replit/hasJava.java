package replit;

import java.util.Scanner;

public class hasJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

     if (word.indexOf("ja")==0  ||word.indexOf("ja")==1  ){
         System.out.println(true);
     }else System.out.println(false);

        scan.close();
    }
}
