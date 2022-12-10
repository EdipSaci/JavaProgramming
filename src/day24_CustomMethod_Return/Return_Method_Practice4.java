package day24_CustomMethod_Return;

public class Return_Method_Practice4 {
    public static void main(String[] args) {

        String str = "ccccccccccccddddddddaaaaaabbbbbbb";
        str = removeDublicates(str);

        System.out.println(str);
    }

    public static String removeDublicates (String str){
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(each+"")){
                result+=each;
            }

        }
        return result;
    }




}
//1. create a method that can remove duplciated characters from a string and returns the new value
//    "aaabbcccc" ===> "abc