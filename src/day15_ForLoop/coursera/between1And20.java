package day15_ForLoop.coursera;

public class between1And20 {
    public static void main(String[] args) {

        int a = 0;

        while (a<=20){
            a++;
            if (a%2==0){
                System.out.print(a+" ");
            }
        }
        System.out.println();
        int b =0;
        while (b<=20){
            b++;
            if (b%2==1){
                continue;
            }
            System.out.print(b+" ");
        }


    }
}
