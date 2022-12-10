package practice;

public class perfectNumber {

    public static void main(String[] args) {
        int a = 7;
        int total = 0;
        for (int i = 1; i <a ; i++) {
            if (a%i == 0){
                total+=i;
            }

        }

        if (total==a){
            System.out.println(a +"=perfect Number");
        } else  {
            System.out.println("not perfect");
        }
    }


}
