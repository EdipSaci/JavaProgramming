package day24_CustomMethod_Return;

public class task4 {
    public static void main(String[] args) {

        String str ="Level";
        isPalindrome(str);
    }
    public static boolean isPalindrome (String str){
        str=str.toLowerCase();
        String result = "";
        boolean isPalindrome;
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        if (result.equals(str)) {
            isPalindrome= true;
            System.out.println(isPalindrome);
        }else {
            isPalindrome=false;
            System.out.println(isPalindrome);
        }
        return isPalindrome;
    }

}
/*
4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false
				Ex:
					str = "Level"
					isPalindrome(str) ===> true
 */