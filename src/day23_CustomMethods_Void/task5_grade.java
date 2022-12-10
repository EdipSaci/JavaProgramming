package day23_CustomMethods_Void;

public class task5_grade {
    public static void main(String[] args) {

        gradeCalculator(55);

    }
    public static void gradeCalculator(int grade){
        if (grade<=100&&grade>=90){
            System.out.println("Your grade is \"A\" ");
        } else if (grade<90&&grade>=80) {
            System.out.println("Your grade is \"B\" ");
        } else if (grade<80&&grade>=70) {
            System.out.println("Your grade is \"C\" ");
        } else if (grade<70&&grade>=60) {
            System.out.println("Your grade is \"D\" ");
        } else if (grade<60) {
            System.out.println("Your grade is \"F\" ");
        }
    }



}
