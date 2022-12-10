package day16_ForLoopStringPractice;

public class ReverseWarmUp {
    public static void main(String[] args) {
        String word = "Wooden Spoon";
           //index  :  012345678910111...
        String result  = ""; // contain the reversed version of word

        /*
        result += word.charAt(11);//n
        result += word.charAt(10);//o
        result += word.charAt(9);//o
        result += word.charAt(8);//p
        result += word.charAt(7);//S
        result += word.charAt(6);// ''
        result += word.charAt(5);//n
        result += word.charAt(4);//e
        result += word.charAt(3);//d
        result += word.charAt(2);//o
        result += word.charAt(1);//o
        result += word.charAt(0);//W
        */
        System.out.println(word.charAt(word.length()-1));

        for (int i = word.length()-1 ; i>=0 ; i--) {   // index number of word
            result += word.charAt(i);
        }

        System.out.println(result);
    }
}
/*
Write a program that can reverse any given string
			Ex:
	    		input:
					Wooden Spoon
				output:
					noopS nedooW

 */