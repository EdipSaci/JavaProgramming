package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
        int age = -25 ;
        boolean define = (age>0 && age<=150) ;
        String result = "";

        if (define){
            if (age<21) {
                result = "teenager";
            } else if (age>=21 && age<55) {
                result = "adult";
            } else if (age>= 55) {
                result = "senior";
            }


        }else {
          result= "Invalid";
        }

        System.out.println(result);
    }
}
