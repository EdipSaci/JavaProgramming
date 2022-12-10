package Homework;

public class schoolType {
    public static void main(String[] args) {
        byte gradeLevel = 15;

        if (gradeLevel<=5){
            System.out.println("1-5: Elementary School");
        } else if (gradeLevel<=8&& gradeLevel>=6) {
            System.out.println("6-8: Middle school");
        } else if (gradeLevel<=12 && gradeLevel>=9) {
            System.out.println("9-12: High school");
        } else if (gradeLevel<=16 && gradeLevel>=13) {
            System.out.println("13-16: College");
        } else if (gradeLevel<=18 && gradeLevel>=17) {
            System.out.println("17-18: Grad School");
        }

    }
}
