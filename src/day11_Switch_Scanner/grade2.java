package day11_Switch_Scanner;

public class grade2 {
    public static void main(String[] args) {
        char ch ='A' ;

        switch (ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("passed");
                break;

            case  'F':
                System.out.println("failed");
                break;
            default :
                System.out.println("failed");

        }



    }
}
 /*
 if the grade is A or B or C or D ======> "passed"
 otherwise ====> "failed"
  */