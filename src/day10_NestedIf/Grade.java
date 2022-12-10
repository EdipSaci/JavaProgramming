package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        boolean grade2 = (grade>= 'A' && grade<='D') || grade== 'F'   ;
        String result = "";

        if (grade2){
            if (grade=='A'){
                result = "excellent" ;
            } else if (grade=='B') {
                result= "great job";
            } else if (grade== 'C') {
                result= "good";
            }else if (grade== 'D') {
                result= "passed";
            }else if (grade== 'F') {
                result= "Failed";
            }

        }else {
            result = "Invaid";
        }
        System.out.println(result);

    }
}
