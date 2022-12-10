package day15_ForLoop;

public class task6 {

    public static void main(String[] args) {

        String str = "A1B2C3";

        int sum =0;

        for (int i = 0; i < str.length(); i++) {

            int ch = str.charAt(i);

            if (ch>= '0' && ch<='9'){
                sum +=ch-48;
            }

        }


        System.out.println("sum = " + sum);



    }
}
