package replit;

import java.util.Scanner;

public class javaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava = 0;
        int countPython = 0;
        for (int i = 0; i <= sentence.length()-4; i++) {
            String eachJava = sentence.substring(i,i+4);
            if (eachJava.equals("java")){
                countJava++;
            }
        }
        for (int i = 0; i <= sentence.length()-6; i++) {
            String eachPython = sentence.substring(i,i+6);
            if (eachPython.equals("python")){
                countPython++;
            }
        }

        if (countJava==countPython){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



        scan.close();





    }
}
