package practice.day15;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "A1B2C3";
        String result = "";
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if (Character.isDigit(ch)){
                result+=ch;
               a+=Integer.valueOf(result) ;
               result="";
            }
        }
        System.out.println(a);

    }
}
