package practice.day15;

public class ReverseString {
    public static void main(String[] args) {
        String str= "Wooden Spoon";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}
