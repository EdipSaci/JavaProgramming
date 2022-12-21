package practice.day17;

public class DivideTwoPositive {

    public static void main(String[] args) {
        int a = 25;
        int b = 4;


        int howMany=0;

        while (a>b){
            a-=b;
            howMany++;
        }
        System.out.println("howMany = " + howMany);
        System.out.println("remainder = " + a);

    }

}
