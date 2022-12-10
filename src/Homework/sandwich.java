package Homework;
import java.util.Scanner;
public class sandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();


        if (str.contains("bread")) {
            if ((str.substring(str.indexOf("bread"), str.lastIndexOf("bread"))).isEmpty()) {

                System.out.println("nothing");
            } else {
                System.out.println(str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
            }
        }else {
            System.out.println("nothing");
        }
        scan.close();




    }
}

