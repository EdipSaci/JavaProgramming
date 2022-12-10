package replit;

import java.util.Scanner;

public class CoverMe {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
        in.close();
    }

    public static String coverString(String main, String coverMe) {

        String result = "["+ coverMe+"]";

        if (!main.contains(coverMe)){
            main= "["+main+"]";
        }
        main= main.replaceAll(coverMe,result);

        return main;




    }


}
