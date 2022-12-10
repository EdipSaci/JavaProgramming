package day15_ForLoop.coursera;

public class between1And100 {
    public static void main(String[] args) {

        for (int i = 1; i <=100 ; i++) {
            if (i>=50 && i<=60){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
