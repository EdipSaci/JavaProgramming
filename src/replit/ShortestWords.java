package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String arr [] =str.split(", ");

        String result= "";
        int min =arr[0].length();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()<min){
                min=arr[i].length();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()==min){
                result+=arr[i]+ " ";
            }
        }

        String [] output = result.split(" ");
        System.out.println(Arrays.toString(output));
        scan.close();





    }
}
