package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {


        // 15 16 17 ..... 45

        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Hello");


        for (int a = 100; a >= 50; a--) {   // (>= , <= , < , > )
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("------------------------------");

        // print all the even numbers between 1 - 55
        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------");

        for (int i= 2; i<=54 ; i+=2){
            System.out.print(i+ " ");
        }




    }
}