package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        int level = 1;
        String result = "";
        if (level>=1 && level<=18) {
            if(level>=1 && level<=5){
                result= "Elementary school ";
            } else if (level>=6 && level<=8) {
                result="Middle school";
            } else if (level>=9 && level<=12) {
                result= "High school";
            } else if (level>=13 && level<=16) {
                result="College";
            } else if (level>=17 && level<=18) {
                result= "Grad School";
            }
        }else {
            System.out.println("Invalid Level");
        }

        System.out.println(result);

    }
}
