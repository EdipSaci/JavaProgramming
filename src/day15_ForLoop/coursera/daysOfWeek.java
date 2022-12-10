package day15_ForLoop.coursera;

public class daysOfWeek {
    public static void main(String[] args) {

        String [] daysOfWeek = {"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.print(daysOfWeek[i]+ " ");
        }
        System.out.println();
        for (String each : daysOfWeek) {
            System.out.print(each+" ");
        }
        System.out.println();
        for (int i = daysOfWeek.length - 1; i >= 0; i--) {
            System.out.print(daysOfWeek[i]+" ");
        }

    }
}
