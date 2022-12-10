package day12_Scanner;

import java.util.Scanner;

public class gradeReport {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("write your score");
        int score = input.nextInt();
        String result = "";

        if (score>=0 && score<=100){
            if (score >= 90){
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

        }else{
            result = "Invalid Score";
        }


        System.out.println(result);


        input.close();

    }
}

