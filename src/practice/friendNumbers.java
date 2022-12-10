package practice;

public class friendNumbers {
    public static void main(String[] args) {

        int a = 220;
        int b = 284;
        int aTotal=0;
        int bTotal=0;

        for (int i = 1; i < a; i++) {
           if (a%i==0){
               aTotal+=i;
           }
        }
        for (int i = 1; i < b; i++) {
            if (b%i==0){
                bTotal+=i;
            }
        }
        if ((a == bTotal) && (b==aTotal)){
            System.out.println(a+ " and "+ b +" is friend numbers");
        }else {
            System.out.println(a+ " and "+ b +" is not friend numbers");
        }

    }
}
