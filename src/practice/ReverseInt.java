package practice;

public class ReverseInt {

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverse(num));
    }

    public static String reverse (int num){
        String str = String.valueOf(num);
        String reverse= "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
}
