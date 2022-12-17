package practice.day15;

public class Palindrome {

    public static void main(String[] args) {
        String str = "Level";
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        boolean isPalindrome= true;
        String result ="";
        str=str.toLowerCase();

        for (int i = str.length()-1; i >= 0; i--) {
            result+=str.charAt(i);
        }
       if (!result.equals(str)){
           isPalindrome=false;
       }
       return isPalindrome;
    }
}
